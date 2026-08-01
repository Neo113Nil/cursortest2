package com.bytedance.sdk.openadsdk.core.video.icD;

import com.bytedance.sdk.component.utils.Ju;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.model.rCZ;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PlayableEvent.java */
/* loaded from: classes2.dex */
public class icD {
    public static void pvs(cR cRVar) {
        if (rCZ.icD(cRVar)) {
            com.bytedance.sdk.openadsdk.icD.vG.icD(cRVar, "playable_preload", "preload_start", (JSONObject) null);
        }
    }

    public static void pvs(cR cRVar, long j, long j2) {
        if (cRVar != null) {
            if (rCZ.qh(cRVar) || rCZ.icD(cRVar)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("loadzip_success_time", j);
                    jSONObject.put("unzip_success_time", j2);
                } catch (JSONException e) {
                    Ju.pvs("PlayableEvent", "onSuccess json error", e);
                }
                com.bytedance.sdk.openadsdk.icD.vG.icD(cRVar, "playable_preload", "preload_success", jSONObject);
            }
        }
    }

    public static void pvs(cR cRVar, int i, String str) {
        if (cRVar != null) {
            if (rCZ.qh(cRVar) || rCZ.icD(cRVar)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("error_code", i);
                    jSONObject.put("error_reason", str);
                } catch (JSONException e) {
                    Ju.pvs("PlayableEvent", "onFail json error", e);
                }
                com.bytedance.sdk.openadsdk.icD.vG.icD(cRVar, "playable_preload", "preload_fail", jSONObject);
            }
        }
    }
}
