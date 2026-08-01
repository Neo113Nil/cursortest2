package com.bytedance.sdk.openadsdk.icD.pvs;

/* compiled from: NetResponseWrapper.java */
/* loaded from: classes2.dex */
class Mxy implements com.bytedance.sdk.component.sUS.pvs.NB.Jd {
    private final com.bytedance.sdk.component.yiw.icD pvs;

    public Mxy(com.bytedance.sdk.component.yiw.icD icd) {
        this.pvs = icd;
    }

    @Override // com.bytedance.sdk.component.sUS.pvs.NB.Jd
    public boolean pvs() {
        com.bytedance.sdk.component.yiw.icD icd = this.pvs;
        if (icd != null) {
            return icd.sUS();
        }
        return false;
    }

    @Override // com.bytedance.sdk.component.sUS.pvs.NB.Jd
    public int icD() {
        com.bytedance.sdk.component.yiw.icD icd = this.pvs;
        if (icd != null) {
            return icd.pvs();
        }
        return -1;
    }

    @Override // com.bytedance.sdk.component.sUS.pvs.NB.Jd
    public String vG() {
        com.bytedance.sdk.component.yiw.icD icd = this.pvs;
        return icd != null ? icd.icD() : "";
    }
}
