package com.chartboost.sdk.impl;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class b3 {
    public static JSONObject a(a... aVarArr) {
        JSONObject jSONObject = new JSONObject();
        for (a aVar : aVarArr) {
            a(jSONObject, aVar.a, aVar.b);
        }
        return jSONObject;
    }

    public static class a {
        public final String a;
        public final Object b;

        public a(String str, Object obj) {
            this.a = str;
            this.b = obj;
        }
    }

    public static void a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e) {
            xb.b("put (" + str + ")", e);
        }
    }

    public static JSONObject a(JSONObject jSONObject, String... strArr) {
        for (String str : strArr) {
            if (jSONObject == null) {
                break;
            }
            jSONObject = jSONObject.optJSONObject(str);
        }
        return jSONObject;
    }

    public static a a(String str, Object obj) {
        return new a(str, obj);
    }
}
