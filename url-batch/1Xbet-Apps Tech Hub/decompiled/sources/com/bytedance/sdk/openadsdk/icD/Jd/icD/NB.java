package com.bytedance.sdk.openadsdk.icD.Jd.icD;

import org.json.JSONObject;

/* compiled from: FeedContinueModel.java */
/* loaded from: classes2.dex */
public class NB implements vG {
    private long icD;
    private long pvs;

    public void pvs(long j) {
        this.pvs = j;
    }

    public void icD(long j) {
        this.icD = j;
    }

    @Override // com.bytedance.sdk.openadsdk.icD.Jd.icD.vG
    public void pvs(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("buffers_time", this.pvs);
            jSONObject.put("total_duration", this.icD);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.Ju.pvs("FeedContinueModel", th.getMessage());
        }
    }
}
