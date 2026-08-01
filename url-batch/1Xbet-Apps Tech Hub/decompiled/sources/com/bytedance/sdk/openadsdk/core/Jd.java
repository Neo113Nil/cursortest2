package com.bytedance.sdk.openadsdk.core;

import io.ktor.http.LinkHeader;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ConvertTracker.java */
/* loaded from: classes2.dex */
public class Jd {
    public static void pvs(com.bytedance.sdk.openadsdk.core.model.cR cRVar, String str, int i, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put(LinkHeader.Parameters.Type, i);
        } catch (JSONException unused) {
        }
        com.bytedance.sdk.openadsdk.icD.vG.icD(cRVar, str, "convert_track", jSONObject);
    }
}
