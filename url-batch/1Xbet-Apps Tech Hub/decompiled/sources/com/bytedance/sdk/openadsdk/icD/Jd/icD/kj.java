package com.bytedance.sdk.openadsdk.icD.Jd.icD;

import org.json.JSONObject;

/* compiled from: LoadVideoSuccessModel.java */
/* loaded from: classes2.dex */
public class kj implements vG {
    private long Jd;
    private long icD;
    private String pvs;
    private long vG;

    public void pvs(String str) {
        this.pvs = str;
    }

    public void pvs(long j) {
        this.icD = j;
    }

    public void icD(long j) {
        this.vG = j;
    }

    public void vG(long j) {
        this.Jd = j;
    }

    @Override // com.bytedance.sdk.openadsdk.icD.Jd.icD.vG
    public void pvs(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("preload_url", this.pvs);
            jSONObject.put("preload_size", this.icD);
            jSONObject.put("load_time", this.vG);
            jSONObject.put("local_cache", this.Jd);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.Ju.pvs("LoadVideoSuccessModel", th.getMessage());
        }
    }
}
