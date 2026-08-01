package com.bytedance.sdk.component.icD.pvs.pvs.pvs;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* compiled from: NetCacheDispatcher.java */
/* loaded from: classes.dex */
public class pvs extends com.bytedance.sdk.component.icD.pvs.Jd {
    public static volatile Mxy pvs;
    private ExecutorService Jd;
    private List<com.bytedance.sdk.component.icD.pvs.icD> icD = new CopyOnWriteArrayList();
    private List<com.bytedance.sdk.component.icD.pvs.icD> vG = new CopyOnWriteArrayList();

    @Override // com.bytedance.sdk.component.icD.pvs.Jd
    public int pvs() {
        return 0;
    }

    @Override // com.bytedance.sdk.component.icD.pvs.Jd
    public void pvs(int i) {
    }

    public pvs(ExecutorService executorService) {
        this.Jd = executorService;
    }

    public static void pvs(Mxy mxy) {
        pvs = mxy;
    }

    @Override // com.bytedance.sdk.component.icD.pvs.Jd
    public ExecutorService icD() {
        ExecutorService pvs2 = pvs != null ? pvs.pvs() : null;
        return pvs2 != null ? pvs2 : this.Jd;
    }

    public boolean NB() {
        return (pvs == null || pvs.pvs() == null) ? false : true;
    }

    @Override // com.bytedance.sdk.component.icD.pvs.Jd
    public List<com.bytedance.sdk.component.icD.pvs.icD> vG() {
        return this.icD;
    }

    @Override // com.bytedance.sdk.component.icD.pvs.Jd
    public List<com.bytedance.sdk.component.icD.pvs.icD> Jd() {
        return this.vG;
    }
}
