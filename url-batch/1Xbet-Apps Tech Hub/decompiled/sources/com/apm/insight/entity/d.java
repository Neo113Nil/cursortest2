package com.apm.insight.entity;

import android.os.Environment;
import com.apm.insight.i;
import com.apm.insight.l.l;
import java.io.IOException;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d {
    private static String a;
    private static JSONObject b;

    private static void a() {
        JSONObject jSONObject;
        if (a == null) {
            a = Environment.getExternalStorageDirectory().getAbsolutePath() + "/Android/data/" + i.g().getPackageName() + "/AutomationTestInfo.json";
        }
        if (b == null) {
            try {
                b = new JSONObject(com.apm.insight.l.i.c(a));
            } catch (IOException unused) {
                jSONObject = new JSONObject();
                b = jSONObject;
            } catch (JSONException unused2) {
                jSONObject = new JSONObject();
                b = jSONObject;
            }
        }
    }

    public static void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            c(jSONObject);
        } catch (Throwable unused) {
        }
    }

    public static void b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            d(jSONObject);
        } catch (Throwable unused) {
        }
    }

    private static void c(JSONObject jSONObject) {
        Object opt;
        a();
        JSONObject jSONObject2 = b;
        if (jSONObject2 == null) {
            return;
        }
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!"slardar_filter".equals(next) && (opt = b.opt(next)) != null) {
                try {
                    jSONObject.put(next, opt);
                } catch (JSONException unused) {
                }
            }
        }
    }

    private static void d(JSONObject jSONObject) {
        a();
        JSONObject jSONObject2 = b;
        if (jSONObject2 == null) {
            return;
        }
        JSONObject optJSONObject = jSONObject2.optJSONObject("slardar_filter");
        if (l.a(optJSONObject)) {
            return;
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("filters");
        if (optJSONObject2 == null) {
            optJSONObject2 = new JSONObject();
            try {
                jSONObject.put("filters", optJSONObject2);
            } catch (JSONException unused) {
            }
        }
        a.b(optJSONObject2, optJSONObject);
    }
}
