package com.bytedance.sdk.component.adexpress.dynamic.Jd;

import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DynamicParserUtils.java */
/* loaded from: classes.dex */
public class Mxy {
    public static void pvs(String str, JSONObject jSONObject) {
        JSONObject tQ = com.bytedance.sdk.component.adexpress.icD.tQ(str);
        if (tQ == null) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        JSONObject optJSONObject = tQ.optJSONObject("values");
        if (optJSONObject == null) {
            return;
        }
        pvs(optJSONObject, jSONObject);
    }

    public static JSONObject pvs(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject tQ = com.bytedance.sdk.component.adexpress.icD.tQ(str);
        if (tQ == null) {
            return null;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        return pvs(jSONObject2, tQ.optJSONObject("themeValues"), jSONObject);
    }

    private static void pvs(JSONObject jSONObject, JSONObject jSONObject2) {
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

    public static JSONObject pvs(JSONObject... jSONObjectArr) {
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

    public static String pvs(String str) {
        JSONObject optJSONObject;
        JSONObject tQ = com.bytedance.sdk.component.adexpress.icD.tQ(str);
        if (tQ == null || (optJSONObject = tQ.optJSONObject("values")) == null) {
            return null;
        }
        return optJSONObject.optString("data");
    }

    public static String pvs(String str, String str2) {
        JSONObject optJSONObject;
        JSONObject tQ = com.bytedance.sdk.component.adexpress.icD.tQ(str);
        if (tQ == null || (optJSONObject = tQ.optJSONObject("values")) == null) {
            return null;
        }
        return optJSONObject.optString(str2);
    }

    public static JSONObject pvs(JSONArray jSONArray) {
        JSONObject optJSONObject;
        if (jSONArray == null || jSONArray.length() <= 0 || (optJSONObject = jSONArray.optJSONObject(0)) == null) {
            return null;
        }
        return optJSONObject.optJSONObject("values");
    }

    public static String icD(String str, String str2) {
        if (com.bytedance.sdk.component.adexpress.Jd.icD()) {
            if (str.indexOf(46) < 0) {
                str = str + ".png";
            }
            return str2 + "static/images/" + str;
        }
        return pvs.pvs(str);
    }
}
