package p;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class d extends h0.g {

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3376g;
    public final AtomicReferenceFieldUpdater h;
    public final AtomicReferenceFieldUpdater i;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3377j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3378k;

    public d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f3376g = atomicReferenceFieldUpdater;
        this.h = atomicReferenceFieldUpdater2;
        this.i = atomicReferenceFieldUpdater3;
        this.f3377j = atomicReferenceFieldUpdater4;
        this.f3378k = atomicReferenceFieldUpdater5;
    }

    @Override // h0.g
    public final boolean a(g gVar, C0309c c0309c) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C0309c c0309c2 = C0309c.f3374b;
        do {
            atomicReferenceFieldUpdater = this.f3377j;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, c0309c, c0309c2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == c0309c);
        return false;
    }

    @Override // h0.g
    public final boolean b(g gVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f3378k;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == obj);
        return false;
    }

    @Override // h0.g
    public final boolean c(g gVar, f fVar, f fVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.i;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, fVar, fVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == fVar);
        return false;
    }

    @Override // h0.g
    public final void i(f fVar, f fVar2) {
        this.h.lazySet(fVar, fVar2);
    }

    @Override // h0.g
    public final void j(f fVar, Thread thread) {
        this.f3376g.lazySet(fVar, thread);
    }
}
