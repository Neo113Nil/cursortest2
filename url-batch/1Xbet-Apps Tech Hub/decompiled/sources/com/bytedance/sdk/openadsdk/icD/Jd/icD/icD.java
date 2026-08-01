package com.bytedance.sdk.openadsdk.icD.Jd.icD;

import org.json.JSONObject;

/* compiled from: EndcardSkipModel.java */
/* loaded from: classes2.dex */
public class icD implements vG {
    private int Jd;
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

    public void icD(int i) {
        this.Jd = i;
    }

    @Override // com.bytedance.sdk.openadsdk.icD.Jd.icD.vG
    public void pvs(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("buffers_time", this.pvs);
            jSONObject.put("total_duration", this.icD);
            jSONObject.put("vbtt_skip_type", this.vG);
            jSONObject.put("skip_reason", this.Jd);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.Ju.pvs("EndcardSkipModel", th.getMessage());
        }
    }
}
