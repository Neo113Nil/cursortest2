package com.bytedance.sdk.component.adexpress.fs;

import androidx.annotation.NonNull;
import com.bytedance.sdk.component.adexpress.fs.iv;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes6.dex */
public class klz implements iv.zmn {
    private AtomicBoolean fb = new AtomicBoolean(false);

    @NonNull
    private List<iv> fs;
    cn zmn;
    private bvs zn;

    public klz(List<iv> list, bvs bvsVar) {
        this.fs = list;
        this.zn = bvsVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.fs.iv.zmn
    public void zmn() {
        this.zn.fb();
        Iterator<iv> it = this.fs.iterator();
        while (it.hasNext() && !it.next().zmn(this)) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.fs.iv.zmn
    public void zmn(iv ivVar) {
        int indexOf = this.fs.indexOf(ivVar);
        if (indexOf < 0) {
            return;
        }
        do {
            indexOf++;
            if (indexOf >= this.fs.size()) {
                return;
            }
        } while (!this.fs.get(indexOf).zmn(this));
    }

    @Override // com.bytedance.sdk.component.adexpress.fs.iv.zmn
    public boolean fs(iv ivVar) {
        int indexOf = this.fs.indexOf(ivVar);
        return indexOf < this.fs.size() - 1 && indexOf >= 0;
    }

    @Override // com.bytedance.sdk.component.adexpress.fs.iv.zmn
    public cn fs() {
        return this.zmn;
    }

    @Override // com.bytedance.sdk.component.adexpress.fs.iv.zmn
    public void zmn(cn cnVar) {
        this.zmn = cnVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.fs.iv.zmn
    public void zmn(boolean z) {
        this.fb.getAndSet(z);
    }

    @Override // com.bytedance.sdk.component.adexpress.fs.iv.zmn
    public boolean zn() {
        return this.fb.get();
    }
}
