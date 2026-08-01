package com.bytedance.adsdk.ugeno.icD;

import android.text.TextUtils;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: JsonUtils.java */
/* loaded from: classes.dex */
public class icD {
    public static void pvs(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null || jSONObject2 == null) {
            return;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                jSONObject2.put(next, jSONObject.opt(next));
            } catch (JSONException unused) {
            }
        }
    }

    public static JSONObject pvs(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return jSONObject;
        }
        try {
            return new JSONObject(str);
        } catch (JSONException unused) {
            return jSONObject;
        }
    }
}
