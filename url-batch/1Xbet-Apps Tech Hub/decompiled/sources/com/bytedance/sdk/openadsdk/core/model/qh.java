package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONObject;

/* compiled from: DeepLink.java */
/* loaded from: classes2.dex */
public class qh {
    private String icD;
    private String pvs;
    private int vG;

    public String pvs() {
        return this.pvs;
    }

    public void pvs(String str) {
        this.pvs = str;
    }

    public String icD() {
        return this.icD;
    }

    public void icD(String str) {
        this.icD = str;
    }

    public int vG() {
        return this.vG;
    }

    public void pvs(int i) {
        this.vG = i;
    }

    public JSONObject Jd() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("u", this.pvs);
            jSONObject.put("ft", this.vG);
            jSONObject.put("fu", this.icD);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }
}
