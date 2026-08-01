package com.bytedance.sdk.component.NB.Jd;

import android.text.TextUtils;

/* compiled from: CacheKeyVisitor.java */
/* loaded from: classes.dex */
public class vG extends pvs {
    @Override // com.bytedance.sdk.component.NB.Jd.Mxy
    public String pvs() {
        return "generate_key";
    }

    @Override // com.bytedance.sdk.component.NB.Jd.Mxy
    public void pvs(com.bytedance.sdk.component.NB.vG.vG vGVar) {
        if (TextUtils.isEmpty(vGVar.NB())) {
            com.bytedance.sdk.component.NB.kj NB = vGVar.zM().NB();
            vGVar.icD(NB.pvs(vGVar));
            vGVar.pvs(NB.icD(vGVar));
        }
        vGVar.pvs(new yiw());
    }
}
