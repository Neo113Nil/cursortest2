package com.appsflyer;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class m {
    static JSONObject a(String str) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str);
            try {
                if (jSONObject.optBoolean("monitor", false)) {
                    ag.a().b();
                } else {
                    ag.a().e();
                    ag.a().c();
                }
            } catch (JSONException unused) {
                ag.a().e();
                ag.a().c();
                return jSONObject;
            } catch (Throwable th) {
                th = th;
                d.a(th.getMessage(), th);
                ag.a().e();
                ag.a().c();
                return jSONObject;
            }
        } catch (JSONException unused2) {
            jSONObject = null;
        } catch (Throwable th2) {
            th = th2;
            jSONObject = null;
        }
        return jSONObject;
    }

    public static String b(String str) {
        return String.format(str, i.c().e());
    }
}
