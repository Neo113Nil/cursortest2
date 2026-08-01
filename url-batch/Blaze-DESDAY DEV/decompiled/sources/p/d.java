package p;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k0.AbstractC0180a;

/* loaded from: classes.dex */
public final class d extends AbstractC0180a {
    public final AtomicReferenceFieldUpdater d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3309e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3310f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3311g;
    public final AtomicReferenceFieldUpdater h;

    public d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.d = atomicReferenceFieldUpdater;
        this.f3309e = atomicReferenceFieldUpdater2;
        this.f3310f = atomicReferenceFieldUpdater3;
        this.f3311g = atomicReferenceFieldUpdater4;
        this.h = atomicReferenceFieldUpdater5;
    }

    @Override // k0.AbstractC0180a
    public final boolean b(g gVar, c cVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        c cVar2 = c.f3307b;
        do {
            atomicReferenceFieldUpdater = this.f3311g;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, cVar, cVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == cVar);
        return false;
    }

    @Override // k0.AbstractC0180a
    public final boolean c(g gVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.h;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == obj);
        return false;
    }

    @Override // k0.AbstractC0180a
    public final boolean d(g gVar, f fVar, f fVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f3310f;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, fVar, fVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == fVar);
        return false;
    }

    @Override // k0.AbstractC0180a
    public final void p(f fVar, f fVar2) {
        this.f3309e.lazySet(fVar, fVar2);
    }

    @Override // k0.AbstractC0180a
    public final void q(f fVar, Thread thread) {
        this.d.lazySet(fVar, thread);
    }
}
