package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class u extends mv {
    public final AtomicReferenceFieldUpdater o;
    public final AtomicReferenceFieldUpdater p;
    public final AtomicReferenceFieldUpdater q;
    public final AtomicReferenceFieldUpdater r;
    public final AtomicReferenceFieldUpdater s;

    public u(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.o = atomicReferenceFieldUpdater;
        this.p = atomicReferenceFieldUpdater2;
        this.q = atomicReferenceFieldUpdater3;
        this.r = atomicReferenceFieldUpdater4;
        this.s = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.mv
    public final void J(w wVar, w wVar2) {
        this.p.lazySet(wVar, wVar2);
    }

    @Override // defpackage.mv
    public final void K(w wVar, Thread thread) {
        this.o.lazySet(wVar, thread);
    }

    @Override // defpackage.mv
    public final boolean d(x xVar, t tVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.r;
            if (atomicReferenceFieldUpdater.compareAndSet(xVar, tVar, t.b)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(xVar) == tVar);
        return false;
    }

    @Override // defpackage.mv
    public final boolean e(x xVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.s;
            if (atomicReferenceFieldUpdater.compareAndSet(xVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(xVar) == obj);
        return false;
    }

    @Override // defpackage.mv
    public final boolean f(x xVar, w wVar, w wVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.q;
            if (atomicReferenceFieldUpdater.compareAndSet(xVar, wVar, wVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(xVar) == wVar);
        return false;
    }
}
