package com.bytedance.sdk.component.adexpress.dynamic.btk;

import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class bvs {
    public static void zmn(String str, JSONObject jSONObject) {
        JSONObject oep = com.bytedance.sdk.component.adexpress.fs.oep(str);
        if (oep == null) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        JSONObject optJSONObject = oep.optJSONObject("values");
        if (optJSONObject == null) {
            return;
        }
        zmn(optJSONObject, jSONObject);
    }

    public static JSONObject zmn(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject oep = com.bytedance.sdk.component.adexpress.fs.oep(str);
        if (oep == null) {
            return null;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        return zmn(jSONObject2, oep.optJSONObject("themeValues"), jSONObject);
    }

    private static void zmn(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        if (jSONObject == null) {
            return;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!jSONObject2.has(next)) {
                try {
                    jSONObject2.put(next, jSONObject.opt(next));
                } catch (JSONException unused) {
                }
            }
        }
    }

    public static JSONObject zmn(JSONObject... jSONObjectArr) {
        JSONObject jSONObject = new JSONObject();
        for (JSONObject jSONObject2 : jSONObjectArr) {
            if (jSONObject2 != null) {
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    try {
                        jSONObject.put(next, jSONObject2.opt(next));
                    } catch (JSONException unused) {
                    }
                }
            }
        }
        return jSONObject;
    }

    public static String zmn(String str) {
        JSONObject optJSONObject;
        JSONObject oep = com.bytedance.sdk.component.adexpress.fs.oep(str);
        if (oep == null || (optJSONObject = oep.optJSONObject("values")) == null) {
            return null;
        }
        return optJSONObject.optString("data");
    }

    public static String zmn(String str, String str2) {
        JSONObject optJSONObject;
        JSONObject oep = com.bytedance.sdk.component.adexpress.fs.oep(str);
        if (oep == null || (optJSONObject = oep.optJSONObject("values")) == null) {
            return null;
        }
        return optJSONObject.optString(str2);
    }

    public static JSONObject zmn(JSONArray jSONArray) {
        JSONObject optJSONObject;
        if (jSONArray == null || jSONArray.length() <= 0 || (optJSONObject = jSONArray.optJSONObject(0)) == null) {
            return null;
        }
        return optJSONObject.optJSONObject("values");
    }

    public static String fs(String str, String str2) {
        if (com.bytedance.sdk.component.adexpress.fb.fs()) {
            if (str.indexOf(46) < 0) {
                str = str + ".png";
            }
            return str2 + "static/images/" + str;
        }
        return zmn.zmn(str);
    }
}
