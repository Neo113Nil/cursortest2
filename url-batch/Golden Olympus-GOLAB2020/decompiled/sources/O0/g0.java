package O0;

import android.os.Build;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class g0 {
    protected static C0417q a(String str, String str2, String str3, String str4) {
        C0417q c0417q = new C0417q();
        c0417q.a(str);
        c0417q.b(Y.k());
        c0417q.e(str2);
        c0417q.c(str4);
        StringBuffer stringBuffer = new StringBuffer("hmshi");
        stringBuffer.append(str3);
        stringBuffer.append("qrt");
        c0417q.d(stringBuffer.toString());
        return c0417q;
    }

    protected static K b(String str, String str2) {
        K k4 = new K();
        k4.a(C.a().b(str, str2));
        return k4;
    }

    protected static o0 c(String str, String str2, String str3) {
        o0 o0Var = new o0();
        o0Var.c(Y.r());
        o0Var.e(Y.t());
        o0Var.a(str3);
        o0Var.b(C.a().e(str2, str));
        return o0Var;
    }

    protected static C0423x d(String str, String str2) {
        M.f().c(str, str2);
        if (!TextUtils.isEmpty(M.f().b())) {
            return new C0423x(M.f().e());
        }
        j0.m("hmsSdk", "event chifer is empty");
        return null;
    }

    protected static Map e(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("App-Id", Y.k());
        hashMap.put("App-Ver", Y.m());
        hashMap.put("Sdk-Name", "hianalytics");
        hashMap.put("Sdk-Ver", "2.2.0.315");
        hashMap.put("Device-Type", Build.MODEL);
        hashMap.put("servicetag", str);
        j0.b("hmsSdk", "sendData RequestId : " + str2);
        hashMap.put("Request-Id", str2);
        return hashMap;
    }
}
