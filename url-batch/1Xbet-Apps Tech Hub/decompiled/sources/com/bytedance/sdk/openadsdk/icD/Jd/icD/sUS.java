package com.bytedance.sdk.openadsdk.icD.Jd.icD;

import org.json.JSONObject;

/* compiled from: FeedOverModel.java */
/* loaded from: classes2.dex */
public class sUS implements vG {
    private long icD;
    private long pvs;
    private int vG = 0;

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
            jSONObject.put("total_duration", this.pvs);
            jSONObject.put("buffers_time", this.icD);
            jSONObject.put("video_backup", this.vG);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.Ju.pvs("FeedOverModel", th.getMessage());
        }
    }
}
