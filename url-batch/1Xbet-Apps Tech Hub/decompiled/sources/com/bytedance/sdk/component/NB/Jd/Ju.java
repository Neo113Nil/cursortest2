package com.bytedance.sdk.component.NB.Jd;

import com.bytedance.sdk.component.NB.mnm;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: SuccessVisitor.java */
/* loaded from: classes.dex */
public class Ju<T> extends pvs {
    private com.bytedance.sdk.component.NB.sUS icD;
    private T pvs;
    private boolean vG;

    @Override // com.bytedance.sdk.component.NB.Jd.Mxy
    public String pvs() {
        return FirebaseAnalytics.Param.SUCCESS;
    }

    public Ju(T t, com.bytedance.sdk.component.NB.sUS sus, boolean z) {
        this.pvs = t;
        this.icD = sus;
        this.vG = z;
    }

    @Override // com.bytedance.sdk.component.NB.Jd.Mxy
    public void pvs(com.bytedance.sdk.component.NB.vG.vG vGVar) {
        String ny = vGVar.ny();
        Map<String, List<com.bytedance.sdk.component.NB.vG.vG>> yiw = vGVar.zM().yiw();
        List<com.bytedance.sdk.component.NB.vG.vG> list = yiw.get(ny);
        if (list == null) {
            icD(vGVar);
            return;
        }
        synchronized (list) {
            Iterator<com.bytedance.sdk.component.NB.vG.vG> it = list.iterator();
            while (it.hasNext()) {
                icD(it.next());
            }
            list.clear();
            yiw.remove(ny);
        }
    }

    private Map<String, String> icD() {
        com.bytedance.sdk.component.NB.sUS sus = this.icD;
        if (sus != null) {
            return sus.NB();
        }
        return null;
    }

    private void icD(com.bytedance.sdk.component.NB.vG.vG vGVar) {
        mnm Mxy = vGVar.Mxy();
        if (Mxy != null) {
            Mxy.pvs(new com.bytedance.sdk.component.NB.vG.Jd().pvs(vGVar, this.pvs, icD(), this.vG));
        }
    }
}
