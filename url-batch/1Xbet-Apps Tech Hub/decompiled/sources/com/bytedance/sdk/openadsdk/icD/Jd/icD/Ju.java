package com.bytedance.sdk.openadsdk.icD.Jd.icD;

import org.json.JSONObject;

/* compiled from: PlayBufferModel.java */
/* loaded from: classes2.dex */
public class Ju implements vG {
    public int icD;
    public long pvs;
    public long vG;

    public void pvs(long j) {
        this.pvs = j;
    }

    public void pvs(int i) {
        this.icD = i;
    }

    public void icD(long j) {
        this.vG = j;
    }

    @Override // com.bytedance.sdk.openadsdk.icD.Jd.icD.vG
    public void pvs(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("buffers_time", this.pvs);
            jSONObject.put("buffers_count", this.icD);
            jSONObject.put("total_duration", this.vG);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.Ju.pvs("PlayBufferModel", th.getMessage());
        }
    }
}
