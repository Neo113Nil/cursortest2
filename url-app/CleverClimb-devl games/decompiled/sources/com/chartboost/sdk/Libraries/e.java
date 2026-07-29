package com.chartboost.sdk.Libraries;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e {
    public static JSONObject a(JSONObject jSONObject, String... strArr) {
        for (String str : strArr) {
            if (jSONObject == null) {
                break;
            }
            jSONObject = jSONObject.optJSONObject(str);
        }
        return jSONObject;
    }

    public static void a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e) {
            com.chartboost.sdk.Tracking.a.a(e.class, "put (" + str + ")", e);
        }
    }

    public static JSONObject a(a... aVarArr) {
        JSONObject jSONObject = new JSONObject();
        for (a aVar : aVarArr) {
            a(jSONObject, aVar.f3581a, aVar.f3582b);
        }
        return jSONObject;
    }

    public static a a(String str, Object obj) {
        return new a(str, obj);
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        final String f3581a;

        /* renamed from: b, reason: collision with root package name */
        final Object f3582b;

        public a(String str, Object obj) {
            this.f3581a = str;
            this.f3582b = obj;
        }
    }
}
