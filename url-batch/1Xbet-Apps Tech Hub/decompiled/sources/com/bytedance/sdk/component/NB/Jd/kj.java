package com.bytedance.sdk.component.NB.Jd;

/* compiled from: RawCacheVisitor.java */
/* loaded from: classes.dex */
public class kj extends pvs {
    @Override // com.bytedance.sdk.component.NB.Jd.Mxy
    public String pvs() {
        return "raw_cache";
    }

    @Override // com.bytedance.sdk.component.NB.Jd.Mxy
    public void pvs(com.bytedance.sdk.component.NB.vG.vG vGVar) {
        byte[] pvs = vGVar.zM().icD(vGVar.uc()).pvs(vGVar.Wyp());
        if (pvs == null) {
            vGVar.pvs(new sUS());
        } else {
            vGVar.pvs(new icD(pvs, null));
        }
    }
}
