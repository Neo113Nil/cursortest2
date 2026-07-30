package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class d1 extends y0 {
    public final AtomicReferenceFieldUpdater a;
    public final AtomicReferenceFieldUpdater b;
    public final AtomicReferenceFieldUpdater c;
    public final AtomicReferenceFieldUpdater d;
    public final AtomicReferenceFieldUpdater e;

    public d1(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.y0
    public final boolean a(h1 h1Var, c1 c1Var, c1 c1Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.d;
            if (atomicReferenceFieldUpdater.compareAndSet(h1Var, c1Var, c1Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(h1Var) == c1Var);
        return false;
    }

    @Override // defpackage.y0
    public final boolean b(h1 h1Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.e;
            if (atomicReferenceFieldUpdater.compareAndSet(h1Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(h1Var) == obj);
        return false;
    }

    @Override // defpackage.y0
    public final boolean c(h1 h1Var, g1 g1Var, g1 g1Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.c;
            if (atomicReferenceFieldUpdater.compareAndSet(h1Var, g1Var, g1Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(h1Var) == g1Var);
        return false;
    }

    @Override // defpackage.y0
    public final void d(g1 g1Var, g1 g1Var2) {
        this.b.lazySet(g1Var, g1Var2);
    }

    @Override // defpackage.y0
    public final void e(g1 g1Var, Thread thread) {
        this.a.lazySet(g1Var, thread);
    }
}
