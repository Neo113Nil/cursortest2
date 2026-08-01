package p;

import i1.r;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class d extends r {

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3755d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3756e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3757f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3758g;
    public final AtomicReferenceFieldUpdater h;

    public d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f3755d = atomicReferenceFieldUpdater;
        this.f3756e = atomicReferenceFieldUpdater2;
        this.f3757f = atomicReferenceFieldUpdater3;
        this.f3758g = atomicReferenceFieldUpdater4;
        this.h = atomicReferenceFieldUpdater5;
    }

    @Override // i1.r
    public final boolean b(g gVar, c cVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        c cVar2 = c.f3753b;
        do {
            atomicReferenceFieldUpdater = this.f3758g;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, cVar, cVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == cVar);
        return false;
    }

    @Override // i1.r
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

    @Override // i1.r
    public final boolean d(g gVar, f fVar, f fVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f3757f;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, fVar, fVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == fVar);
        return false;
    }

    @Override // i1.r
    public final void o(f fVar, f fVar2) {
        this.f3756e.lazySet(fVar, fVar2);
    }

    @Override // i1.r
    public final void p(f fVar, Thread thread) {
        this.f3755d.lazySet(fVar, thread);
    }
}
