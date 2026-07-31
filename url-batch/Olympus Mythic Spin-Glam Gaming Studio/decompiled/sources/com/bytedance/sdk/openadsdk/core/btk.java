package com.bytedance.sdk.openadsdk.core;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public class btk {
    public static void zmn(com.bytedance.sdk.openadsdk.core.model.nqi nqiVar, String str, int i, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("type", i);
        } catch (JSONException unused) {
        }
        com.bytedance.sdk.openadsdk.fb.zn.fs(nqiVar, str, "convert_track", jSONObject);
    }
}
