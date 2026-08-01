package com.bytedance.sdk.openadsdk.icD.Jd.icD;

import org.json.JSONObject;

/* compiled from: FeedBreakModel.java */
/* loaded from: classes2.dex */
public class Jd implements vG {
    public int Jd = 0;
    public long icD;
    public long pvs;
    public int vG;

    public void pvs(long j) {
        this.pvs = j;
    }

    public void icD(long j) {
        this.icD = j;
    }

    public void pvs(int i) {
        this.vG = i;
    }

    public void icD(int i) {
        this.Jd = i;
    }

    @Override // com.bytedance.sdk.openadsdk.icD.Jd.icD.vG
    public void pvs(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("total_duration", this.pvs);
            jSONObject.put("buffers_time", this.icD);
            jSONObject.put("break_reason", this.vG);
            jSONObject.put("video_backup", this.Jd);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.Ju.pvs("FeedBreakModel", th.getMessage());
        }
    }
}
