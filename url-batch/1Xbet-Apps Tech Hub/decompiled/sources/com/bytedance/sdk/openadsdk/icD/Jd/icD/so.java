package com.bytedance.sdk.openadsdk.icD.Jd.icD;

import org.json.JSONObject;

/* compiled from: FeedPlayModel.java */
/* loaded from: classes2.dex */
public class so implements vG {
    private long icD;
    private long pvs;
    private int vG;

    public void pvs(long j) {
        this.pvs = j;
    }

    public void icD(long j) {
        this.icD = j;
    }

    public void pvs(int i) {
        this.vG = i;
    }

    @Override // com.bytedance.sdk.openadsdk.icD.Jd.icD.vG
    public void pvs(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("video_start_duration", this.pvs);
            jSONObject.put("video_cache_size", this.icD);
            jSONObject.put("is_auto_play", this.vG);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.Ju.pvs("FeedPlayModel", th.getMessage());
        }
    }
}
