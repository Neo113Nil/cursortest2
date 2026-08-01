package com.bytedance.sdk.component.NB.Jd;

/* compiled from: CachePolicyVisitor.java */
/* loaded from: classes.dex */
public class Jd extends pvs {
    @Override // com.bytedance.sdk.component.NB.Jd.Mxy
    public String pvs() {
        return "cache_policy";
    }

    @Override // com.bytedance.sdk.component.NB.Jd.Mxy
    public void pvs(com.bytedance.sdk.component.NB.vG.vG vGVar) {
        com.bytedance.sdk.component.NB.icD uc = vGVar.uc();
        if (uc != null) {
            if (uc.vG()) {
                vGVar.pvs(new Wyp());
                return;
            } else if (uc.Jd()) {
                vGVar.pvs(new sUS());
                return;
            }
        }
        vGVar.pvs(new qh());
    }
}
