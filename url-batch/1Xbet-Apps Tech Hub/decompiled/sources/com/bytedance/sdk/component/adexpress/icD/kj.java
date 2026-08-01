package com.bytedance.sdk.component.adexpress.icD;

import com.bytedance.sdk.component.adexpress.icD.Wyp;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: RenderRealChain.java */
/* loaded from: classes.dex */
public class kj implements Wyp.pvs {
    private AtomicBoolean Jd = new AtomicBoolean(false);
    private List<Wyp> icD;
    bNS pvs;
    private Mxy vG;

    public kj(List<Wyp> list, Mxy mxy) {
        this.icD = list;
        this.vG = mxy;
    }

    @Override // com.bytedance.sdk.component.adexpress.icD.Wyp.pvs
    public void pvs() {
        this.vG.Jd();
        Iterator<Wyp> it = this.icD.iterator();
        while (it.hasNext() && !it.next().pvs(this)) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.icD.Wyp.pvs
    public void pvs(Wyp wyp) {
        int indexOf = this.icD.indexOf(wyp);
        if (indexOf < 0) {
            return;
        }
        do {
            indexOf++;
            if (indexOf >= this.icD.size()) {
                return;
            }
        } while (!this.icD.get(indexOf).pvs(this));
    }

    @Override // com.bytedance.sdk.component.adexpress.icD.Wyp.pvs
    public boolean icD(Wyp wyp) {
        int indexOf = this.icD.indexOf(wyp);
        return indexOf < this.icD.size() - 1 && indexOf >= 0;
    }

    @Override // com.bytedance.sdk.component.adexpress.icD.Wyp.pvs
    public bNS icD() {
        return this.pvs;
    }

    @Override // com.bytedance.sdk.component.adexpress.icD.Wyp.pvs
    public void pvs(bNS bns) {
        this.pvs = bns;
    }

    @Override // com.bytedance.sdk.component.adexpress.icD.Wyp.pvs
    public void pvs(boolean z) {
        this.Jd.getAndSet(z);
    }

    @Override // com.bytedance.sdk.component.adexpress.icD.Wyp.pvs
    public boolean vG() {
        return this.Jd.get();
    }
}
