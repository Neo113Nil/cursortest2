package com.bytedance.sdk.component.NB.Jd;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.NB.cR;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: MemoryCacheVisitor.java */
/* loaded from: classes.dex */
public class Wyp extends pvs {
    @Override // com.bytedance.sdk.component.NB.Jd.Mxy
    public String pvs() {
        return "memory_cache";
    }

    @Override // com.bytedance.sdk.component.NB.Jd.Mxy
    public void pvs(com.bytedance.sdk.component.NB.vG.vG vGVar) {
        Bitmap icD;
        int kj = vGVar.kj();
        if (kj != 2 && kj != 1) {
            icD = null;
        } else if (vGVar.rCZ() || vGVar.uc().sUS()) {
            icD = icD(vGVar);
        } else {
            icD = vG(vGVar);
        }
        if (icD == null) {
            vGVar.pvs(new kj());
        } else {
            vGVar.pvs(new Ju(icD, null, false));
        }
    }

    private Bitmap icD(com.bytedance.sdk.component.NB.vG.vG vGVar) {
        Collection<cR> pvs = vGVar.zM().pvs();
        Bitmap bitmap = null;
        if (pvs == null) {
            return null;
        }
        Iterator<cR> it = pvs.iterator();
        while (it.hasNext() && (bitmap = it.next().pvs(vGVar.NB())) == null) {
        }
        return bitmap;
    }

    private Bitmap vG(com.bytedance.sdk.component.NB.vG.vG vGVar) {
        return vGVar.zM().pvs(vGVar.uc()).pvs(vGVar.NB());
    }
}
