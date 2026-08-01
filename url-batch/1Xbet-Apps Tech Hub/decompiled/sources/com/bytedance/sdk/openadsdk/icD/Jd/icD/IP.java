package com.bytedance.sdk.openadsdk.icD.Jd.icD;

import org.json.JSONObject;

/* compiled from: PlayErrorModel.java */
/* loaded from: classes2.dex */
public class IP implements vG {
    private final int Jd;
    private final String NB;
    private long icD;
    private long pvs;
    private final int vG;

    public IP(com.bykv.vk.openvk.component.video.api.vG.pvs pvsVar) {
        this.vG = pvsVar.pvs();
        this.Jd = pvsVar.icD();
        this.NB = pvsVar.vG();
    }

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
            jSONObject.put("error_code", this.vG);
            jSONObject.put("extra_error_code", this.Jd);
            jSONObject.put("error_message", this.NB);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.Ju.pvs("PlayErrorModel", th.getMessage());
        }
    }
}
