package com.bytedance.sdk.component.NB.Jd;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* compiled from: DuplicateRequestCheckVisitor.java */
/* loaded from: classes.dex */
public class yiw extends pvs {
    @Override // com.bytedance.sdk.component.NB.Jd.Mxy
    public String pvs() {
        return "check_duplicate";
    }

    @Override // com.bytedance.sdk.component.NB.Jd.Mxy
    public void pvs(com.bytedance.sdk.component.NB.vG.vG vGVar) {
        List<com.bytedance.sdk.component.NB.vG.vG> list;
        String ny = vGVar.ny();
        Map<String, List<com.bytedance.sdk.component.NB.vG.vG>> yiw = vGVar.zM().yiw();
        synchronized (yiw) {
            list = yiw.get(ny);
            if (list == null) {
                list = new LinkedList<>();
            }
        }
        synchronized (list) {
            list.add(vGVar);
            yiw.put(ny, list);
            if (list.size() <= 1) {
                vGVar.pvs(new Jd());
            }
        }
    }
}
