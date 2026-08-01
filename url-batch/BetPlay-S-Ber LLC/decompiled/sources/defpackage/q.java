package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class q extends l70 {
    public final AtomicReferenceFieldUpdater o;
    public final AtomicReferenceFieldUpdater p;
    public final AtomicReferenceFieldUpdater q;
    public final AtomicReferenceFieldUpdater r;
    public final AtomicReferenceFieldUpdater s;

    public q(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.o = atomicReferenceFieldUpdater;
        this.p = atomicReferenceFieldUpdater2;
        this.q = atomicReferenceFieldUpdater3;
        this.r = atomicReferenceFieldUpdater4;
        this.s = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.l70
    public final void J(s sVar, s sVar2) {
        this.p.lazySet(sVar, sVar2);
    }

    @Override // defpackage.l70
    public final void K(s sVar, Thread thread) {
        this.o.lazySet(sVar, thread);
    }

    @Override // defpackage.l70
    public final boolean c(t tVar, p pVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.r;
            if (atomicReferenceFieldUpdater.compareAndSet(tVar, pVar, p.b)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(tVar) == pVar);
        return false;
    }

    @Override // defpackage.l70
    public final boolean d(t tVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.s;
            if (atomicReferenceFieldUpdater.compareAndSet(tVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(tVar) == obj);
        return false;
    }

    @Override // defpackage.l70
    public final boolean e(t tVar, s sVar, s sVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.q;
            if (atomicReferenceFieldUpdater.compareAndSet(tVar, sVar, sVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(tVar) == sVar);
        return false;
    }
}
