import java.sql.ResultSet;

import javax.naming.InitialContext;

import bean.Test;
import ejbTest.intel.Ejb;


public class test {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		//MsgConfig msgConfig = MsgConfigXmlParser.getInstance().initConfigFile().getMsgConfig();
		ResultSet rs = DBUtil.executeQuery("select * from test");
		Test test = new Test();
		while(rs.next()){
			test.setId(rs.getLong(1));
			test.setName(rs.getString(2));
			System.out.println("id:" + test.getId() + " name:" + test.getName());
		}  
		
		/*InitialContext ctx = new InitialContext();
		Object ejb = ctx.lookup("EjbBean/remote");
		String result = ((Ejb)ejb).getSomething();
		System.out.println(result);*/
	}
	
	

}
