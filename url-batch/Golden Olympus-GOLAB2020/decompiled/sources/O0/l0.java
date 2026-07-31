package O0;

import android.text.TextUtils;
import com.ironsource.ge;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class l0 {
    private static void a(String str, String str2) {
        C0405e.a().b(new E(str, str2));
    }

    public static boolean b() {
        String a4 = Y.a();
        if (TextUtils.isEmpty(a4)) {
            a4 = AbstractC0413m.b(Y.q(), "Privacy_MY", "public_key_time_interval", "");
            Y.l(a4);
        }
        String u4 = Y.u();
        if (TextUtils.isEmpty(u4)) {
            u4 = AbstractC0413m.b(Y.q(), "Privacy_MY", "public_key_time_last", "");
            Y.f(u4);
        }
        if (!TextUtils.isEmpty(a4) && !TextUtils.isEmpty(u4)) {
            try {
                return System.currentTimeMillis() - Long.parseLong(u4) > ((long) Integer.parseInt(a4));
            } catch (NumberFormatException e4) {
                j0.l("GetPublicKey", "checkCachePubKey NumberFormatException :" + e4.getMessage());
            }
        }
        return true;
    }

    public static void c(String str, String str2) {
        O o4;
        String str3;
        String replace = "{url}/getPublicKey?keytype=4".replace("{url}", AbstractC0403c.g(str, str2));
        String k4 = Y.k();
        HashMap hashMap = new HashMap();
        hashMap.put("App-Id", k4);
        try {
            o4 = k0.a(replace, new byte[0], hashMap);
        } catch (Exception e4) {
            j0.l("GetPublicKey", "get pubKey response Exception :" + e4.getMessage());
            o4 = null;
        }
        if (o4 == null) {
            str3 = "get pubKey response is null";
        } else if (o4.b() == 200) {
            if (TextUtils.isEmpty(o4.a())) {
                return;
            }
            e(o4.a(), str2);
            return;
        } else {
            str3 = "get pubKey fail HttpCode :" + o4.b();
        }
        j0.l("GetPublicKey", str3);
    }

    public static String d(String str, String str2) {
        String w4;
        String e4 = Y.e();
        if (TextUtils.isEmpty(e4)) {
            e4 = AbstractC0413m.b(Y.q(), "Privacy_MY", "public_key_version", "");
            Y.n(e4);
        }
        if (!ge.f16461h0.equals(e4)) {
            a(str, str2);
            return null;
        }
        if ("maint".equals(str2)) {
            w4 = Y.v();
            if (TextUtils.isEmpty(w4)) {
                w4 = R0.a.d("HiAnalytics_Sdk_Public_Sp_Key", AbstractC0413m.b(Y.q(), "Privacy_MY", "public_key_maint", ""));
                Y.h(w4);
            }
        } else {
            w4 = Y.w();
            if (TextUtils.isEmpty(w4)) {
                w4 = R0.a.d("HiAnalytics_Sdk_Public_Sp_Key", AbstractC0413m.b(Y.q(), "Privacy_MY", "public_key_oper", ""));
                Y.j(w4);
            }
        }
        if (!TextUtils.isEmpty(w4) && !b()) {
            return w4;
        }
        a(str, str2);
        return null;
    }

    private static void e(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("publicKey");
            String optString2 = jSONObject.optString("publicKeyOM");
            String optString3 = jSONObject.optString("pubkey_version");
            String str3 = System.currentTimeMillis() + "";
            String optString4 = jSONObject.optString("timeInterval");
            AbstractC0413m.g(Y.q(), "Privacy_MY", "public_key_oper", R0.a.g("HiAnalytics_Sdk_Public_Sp_Key", optString));
            AbstractC0413m.g(Y.q(), "Privacy_MY", "public_key_maint", R0.a.g("HiAnalytics_Sdk_Public_Sp_Key", optString2));
            AbstractC0413m.g(Y.q(), "Privacy_MY", "public_key_time_interval", optString4);
            AbstractC0413m.g(Y.q(), "Privacy_MY", "public_key_version", optString3);
            AbstractC0413m.g(Y.q(), "Privacy_MY", "public_key_time_last", str3);
            Y.j(optString);
            Y.h(optString2);
            Y.n(optString3);
            Y.f(str3);
            Y.l(optString4);
        } catch (JSONException e4) {
            j0.l("GetPublicKey", "get pubKey parse json JSONException :" + e4.getMessage());
        }
    }
}
