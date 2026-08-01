package com.bytedance.sdk.component.NB.Jd;

import com.bytedance.sdk.component.NB.mnm;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: FailVisitor.java */
/* loaded from: classes.dex */
public class so extends pvs {
    private int icD;
    private Throwable pvs;
    private String vG;

    @Override // com.bytedance.sdk.component.NB.Jd.Mxy
    public String pvs() {
        return "failed";
    }

    public so(int i, String str, Throwable th) {
        this.icD = i;
        this.vG = str;
        this.pvs = th;
    }

    @Override // com.bytedance.sdk.component.NB.Jd.Mxy
    public void pvs(com.bytedance.sdk.component.NB.vG.vG vGVar) {
        vGVar.pvs(new com.bytedance.sdk.component.NB.vG.pvs(this.icD, this.vG, this.pvs));
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

    private void icD(com.bytedance.sdk.component.NB.vG.vG vGVar) {
        mnm Mxy = vGVar.Mxy();
        if (Mxy != null) {
            Mxy.pvs(this.icD, this.vG, this.pvs);
        }
    }
}
