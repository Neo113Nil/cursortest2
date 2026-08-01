package com.bytedance.sdk.component.NB.Jd;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: DiskCacheVisitor.java */
/* loaded from: classes.dex */
public class sUS extends pvs {
    @Override // com.bytedance.sdk.component.NB.Jd.Mxy
    public String pvs() {
        return "disk_cache";
    }

    @Override // com.bytedance.sdk.component.NB.Jd.Mxy
    public void pvs(com.bytedance.sdk.component.NB.vG.vG vGVar) {
        byte[] pvs;
        String Wyp = vGVar.Wyp();
        if (vGVar.rCZ() || vGVar.uc().sUS()) {
            pvs = pvs(vGVar, Wyp);
        } else {
            pvs = icD(vGVar, Wyp);
        }
        if (pvs == null) {
            vGVar.pvs(new qh());
        } else {
            vGVar.pvs(new icD(pvs, null));
            vGVar.zM().icD(vGVar.uc()).pvs(Wyp, pvs);
        }
    }

    private byte[] pvs(com.bytedance.sdk.component.NB.vG.vG vGVar, String str) {
        vGVar.zM().vG(vGVar.uc());
        Collection<com.bytedance.sdk.component.NB.vG> vG = vGVar.zM().vG();
        if (vG == null) {
            return null;
        }
        Iterator<com.bytedance.sdk.component.NB.vG> it = vG.iterator();
        while (it.hasNext()) {
            byte[] pvs = it.next().pvs((com.bytedance.sdk.component.NB.vG) str);
            if (pvs != null) {
                return pvs;
            }
        }
        return null;
    }

    private byte[] icD(com.bytedance.sdk.component.NB.vG.vG vGVar, String str) {
        com.bytedance.sdk.component.NB.vG vG = vGVar.zM().vG(vGVar.uc());
        if (vG == null) {
            return null;
        }
        return vG.pvs((com.bytedance.sdk.component.NB.vG) str);
    }
}
