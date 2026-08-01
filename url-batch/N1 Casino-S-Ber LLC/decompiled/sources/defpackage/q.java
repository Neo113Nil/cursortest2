package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class q extends jw {
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

    @Override // defpackage.jw
    public final void T(s sVar, s sVar2) {
        this.p.lazySet(sVar, sVar2);
    }

    @Override // defpackage.jw
    public final void U(s sVar, Thread thread) {
        this.o.lazySet(sVar, thread);
    }

    @Override // defpackage.jw
    public final boolean m(t tVar, p pVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.r;
            if (atomicReferenceFieldUpdater.compareAndSet(tVar, pVar, p.b)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(tVar) == pVar);
        return false;
    }

    @Override // defpackage.jw
    public final boolean n(t tVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.s;
            if (atomicReferenceFieldUpdater.compareAndSet(tVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(tVar) == obj);
        return false;
    }

    @Override // defpackage.jw
    public final boolean o(t tVar, s sVar, s sVar2) {
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
