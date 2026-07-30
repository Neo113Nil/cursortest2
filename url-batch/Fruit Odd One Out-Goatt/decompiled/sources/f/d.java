package f;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class d extends a.a {

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f250f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f251g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f252h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f253i;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f254j;

    public d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f250f = atomicReferenceFieldUpdater;
        this.f251g = atomicReferenceFieldUpdater2;
        this.f252h = atomicReferenceFieldUpdater3;
        this.f253i = atomicReferenceFieldUpdater4;
        this.f254j = atomicReferenceFieldUpdater5;
    }

    @Override // a.a
    public final boolean d(g gVar, c cVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f253i;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, cVar, c.f248b)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == cVar);
        return false;
    }

    @Override // a.a
    public final boolean e(g gVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f254j;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == obj);
        return false;
    }

    @Override // a.a
    public final boolean f(g gVar, f fVar, f fVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f252h;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, fVar, fVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == fVar);
        return false;
    }

    @Override // a.a
    public final void t(f fVar, f fVar2) {
        this.f251g.lazySet(fVar, fVar2);
    }

    @Override // a.a
    public final void u(f fVar, Thread thread) {
        this.f250f.lazySet(fVar, thread);
    }
}
