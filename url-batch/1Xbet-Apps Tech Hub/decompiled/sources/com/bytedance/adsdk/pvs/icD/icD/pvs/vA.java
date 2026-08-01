package com.bytedance.adsdk.pvs.icD.icD.pvs;

/* compiled from: OperatorResultNode.java */
/* loaded from: classes.dex */
public abstract class vA implements com.bytedance.adsdk.pvs.icD.icD.pvs {
    protected com.bytedance.adsdk.pvs.icD.icD.pvs icD;
    protected com.bytedance.adsdk.pvs.icD.icD.pvs pvs;
    protected com.bytedance.adsdk.pvs.icD.Jd.vG vG;

    protected vA(com.bytedance.adsdk.pvs.icD.Jd.vG vGVar) {
        this.vG = vGVar;
    }

    public void pvs(com.bytedance.adsdk.pvs.icD.icD.pvs pvsVar) {
        this.pvs = pvsVar;
    }

    public void icD(com.bytedance.adsdk.pvs.icD.icD.pvs pvsVar) {
        this.icD = pvsVar;
    }

    @Override // com.bytedance.adsdk.pvs.icD.icD.pvs
    public com.bytedance.adsdk.pvs.icD.Jd.NB pvs() {
        return com.bytedance.adsdk.pvs.icD.Jd.sUS.OPERATOR_RESULT;
    }

    @Override // com.bytedance.adsdk.pvs.icD.icD.pvs
    public String icD() {
        return this.pvs.icD() + this.vG.pvs() + this.icD.icD();
    }

    public String toString() {
        return icD();
    }
}
