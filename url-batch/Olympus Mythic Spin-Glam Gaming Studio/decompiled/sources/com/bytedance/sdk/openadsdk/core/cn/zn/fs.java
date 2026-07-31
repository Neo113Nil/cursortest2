package com.bytedance.sdk.openadsdk.core.cn.zn;

import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.openadsdk.core.model.am;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class fs {
    public static void zmn(nqi nqiVar) {
        if (am.fs(nqiVar)) {
            com.bytedance.sdk.openadsdk.fb.zn.fs(nqiVar, "playable_preload", "preload_start", (JSONObject) null);
        }
    }

    public static void zmn(nqi nqiVar, long j, long j2) {
        if (nqiVar != null) {
            if (am.zn(nqiVar) || am.fs(nqiVar)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("loadzip_success_time", j);
                    jSONObject.put("unzip_success_time", j2);
                } catch (JSONException e) {
                    iqz.zmn("PlayableEvent", "onSuccess json error", e);
                }
                com.bytedance.sdk.openadsdk.fb.zn.fs(nqiVar, "playable_preload", "preload_success", jSONObject);
            }
        }
    }

    public static void zmn(nqi nqiVar, int i, String str) {
        if (nqiVar != null) {
            if (am.zn(nqiVar) || am.fs(nqiVar)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("error_code", i);
                    jSONObject.put("error_reason", str);
                } catch (JSONException e) {
                    iqz.zmn("PlayableEvent", "onFail json error", e);
                }
                com.bytedance.sdk.openadsdk.fb.zn.fs(nqiVar, "playable_preload", "preload_fail", jSONObject);
            }
        }
    }
}
