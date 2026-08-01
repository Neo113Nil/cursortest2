package com.bytedance.sdk.openadsdk.icD.pvs;

/* compiled from: GetExecutorWrapper.java */
/* loaded from: classes2.dex */
class yiw implements com.bytedance.sdk.component.sUS.pvs.NB.vG {
    private final com.bytedance.sdk.component.yiw.icD.icD pvs;

    public yiw() {
        com.bytedance.sdk.component.yiw.icD.icD vG = com.bytedance.sdk.openadsdk.qh.vG.pvs().icD().vG();
        this.pvs = vG;
        vG.pvs(7);
        vG.pvs("track_url");
    }

    @Override // com.bytedance.sdk.component.sUS.pvs.NB.vG
    public void pvs(String str) {
        this.pvs.icD(str);
    }

    @Override // com.bytedance.sdk.component.sUS.pvs.NB.vG
    public void pvs(String str, String str2) {
        this.pvs.icD(str, str2);
    }

    @Override // com.bytedance.sdk.component.sUS.pvs.NB.vG
    public com.bytedance.sdk.component.sUS.pvs.NB.Jd pvs() {
        return new Mxy(this.pvs.pvs());
    }
}
