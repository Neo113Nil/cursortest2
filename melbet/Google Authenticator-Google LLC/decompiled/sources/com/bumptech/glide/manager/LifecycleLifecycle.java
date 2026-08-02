package com.bumptech.glide.manager;

import androidx.lifecycle.OnLifecycleEvent;
import defpackage.aej;
import defpackage.aek;
import defpackage.ael;
import defpackage.aeq;
import defpackage.aer;
import defpackage.bkc;
import defpackage.bkd;
import defpackage.bmi;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class LifecycleLifecycle implements bkc, aeq {
    private final Set a = new HashSet();
    private final ael b;

    public LifecycleLifecycle(ael aelVar) {
        this.b = aelVar;
        aelVar.a(this);
    }

    @Override // defpackage.bkc
    public final void a(bkd bkdVar) {
        this.a.add(bkdVar);
        aek aekVar = this.b.c;
        if (aekVar == aek.a) {
            bkdVar.g();
        } else if (aekVar.a(aek.d)) {
            bkdVar.h();
        } else {
            bkdVar.i();
        }
    }

    @Override // defpackage.bkc
    public final void b(bkd bkdVar) {
        this.a.remove(bkdVar);
    }

    @OnLifecycleEvent(a = aej.ON_DESTROY)
    public void onDestroy(aer aerVar) {
        Iterator it = bmi.e(this.a).iterator();
        while (it.hasNext()) {
            ((bkd) it.next()).g();
        }
        aerVar.L().c(this);
    }

    @OnLifecycleEvent(a = aej.ON_START)
    public void onStart(aer aerVar) {
        Iterator it = bmi.e(this.a).iterator();
        while (it.hasNext()) {
            ((bkd) it.next()).h();
        }
    }

    @OnLifecycleEvent(a = aej.ON_STOP)
    public void onStop(aer aerVar) {
        Iterator it = bmi.e(this.a).iterator();
        while (it.hasNext()) {
            ((bkd) it.next()).i();
        }
    }
}
