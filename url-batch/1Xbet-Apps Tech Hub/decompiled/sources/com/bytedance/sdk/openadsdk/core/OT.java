package com.bytedance.sdk.openadsdk.core;

/* compiled from: SingleAppData.java */
/* loaded from: classes2.dex */
public class OT {
    private static OT pvs;
    private com.bytedance.sdk.openadsdk.apiImpl.Jd.pvs Jd;
    private com.bytedance.sdk.openadsdk.apiImpl.icD.icD NB;
    private com.bytedance.sdk.openadsdk.core.model.pvs icD;
    private com.bytedance.sdk.openadsdk.apiImpl.vG.icD sUS;
    private com.bytedance.sdk.openadsdk.core.model.cR vG;

    private OT() {
    }

    public static OT pvs() {
        if (pvs == null) {
            pvs = new OT();
        }
        return pvs;
    }

    public com.bytedance.sdk.openadsdk.core.model.cR icD() {
        return this.vG;
    }

    public void pvs(com.bytedance.sdk.openadsdk.core.model.cR cRVar) {
        this.vG = cRVar;
    }

    public com.bytedance.sdk.openadsdk.apiImpl.Jd.pvs vG() {
        return this.Jd;
    }

    public com.bytedance.sdk.openadsdk.apiImpl.icD.icD Jd() {
        return this.NB;
    }

    public com.bytedance.sdk.openadsdk.apiImpl.vG.icD NB() {
        return this.sUS;
    }

    public void pvs(com.bytedance.sdk.openadsdk.apiImpl.icD.icD icd) {
        this.NB = icd;
    }

    public void pvs(com.bytedance.sdk.openadsdk.apiImpl.Jd.pvs pvsVar) {
        this.Jd = pvsVar;
    }

    public void pvs(com.bytedance.sdk.openadsdk.apiImpl.vG.icD icd) {
        this.sUS = icd;
    }

    public void sUS() {
        this.vG = null;
        this.icD = null;
        this.Jd = null;
        this.NB = null;
        this.sUS = null;
    }

    public com.bytedance.sdk.openadsdk.core.model.pvs yiw() {
        return this.icD;
    }

    public void pvs(com.bytedance.sdk.openadsdk.core.model.pvs pvsVar) {
        this.icD = pvsVar;
    }
}
