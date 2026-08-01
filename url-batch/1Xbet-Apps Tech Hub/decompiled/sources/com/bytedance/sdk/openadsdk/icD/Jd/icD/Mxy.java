package com.bytedance.sdk.openadsdk.icD.Jd.icD;

import org.json.JSONObject;

/* compiled from: LoadVideoCancelModel.java */
/* loaded from: classes2.dex */
public class Mxy implements vG {
    private final long icD;
    private final String pvs;

    public Mxy(String str, long j) {
        this.pvs = str;
        this.icD = j;
    }

    @Override // com.bytedance.sdk.openadsdk.icD.Jd.icD.vG
    public void pvs(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("preload_url", this.pvs);
            jSONObject.put("preload_size", this.icD);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.Ju.pvs("LoadVideoCancelModel", th.getMessage());
        }
    }
}
