package c3;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e extends k7.e {

    /* renamed from: i, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f1721i;

    /* renamed from: r, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f1722r;

    /* renamed from: s, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f1723s;

    /* renamed from: t, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f1724t;

    /* renamed from: u, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f1725u;

    public e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f1721i = atomicReferenceFieldUpdater;
        this.f1722r = atomicReferenceFieldUpdater2;
        this.f1723s = atomicReferenceFieldUpdater3;
        this.f1724t = atomicReferenceFieldUpdater4;
        this.f1725u = atomicReferenceFieldUpdater5;
    }

    @Override // k7.e
    public final void H(g gVar, g gVar2) {
        this.f1722r.lazySet(gVar, gVar2);
    }

    @Override // k7.e
    public final void I(g gVar, Thread thread) {
        this.f1721i.lazySet(gVar, thread);
    }

    @Override // k7.e
    public final boolean f(h hVar, d dVar, d dVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f1724t;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, dVar, dVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == dVar);
        return false;
    }

    @Override // k7.e
    public final boolean g(h hVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f1725u;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == obj);
        return false;
    }

    @Override // k7.e
    public final boolean h(h hVar, g gVar, g gVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f1723s;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, gVar, gVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == gVar);
        return false;
    }
}
