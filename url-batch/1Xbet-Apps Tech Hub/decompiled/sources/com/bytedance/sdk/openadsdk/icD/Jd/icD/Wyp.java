package com.bytedance.sdk.openadsdk.icD.Jd.icD;

import org.json.JSONObject;

/* compiled from: LoadVideoErrorModel.java */
/* loaded from: classes2.dex */
public class Wyp implements vG {
    private int Jd;
    private String NB;
    private long icD;
    private String pvs;
    private String sUS;
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

    public void pvs(int i) {
        this.Jd = i;
    }

    public void icD(String str) {
        this.NB = str;
    }

    public void vG(String str) {
        this.sUS = str;
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
            jSONObject.put("error_code", this.Jd);
            jSONObject.put("error_message", this.NB);
            jSONObject.put("error_message_server", this.sUS);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.Ju.pvs("LoadVideoErrorModel", th.getMessage());
        }
    }
}
