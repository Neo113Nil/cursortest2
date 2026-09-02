package s;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class d extends h.a {

    /* renamed from: k, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3160k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3161l;

    /* renamed from: m, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3162m;

    /* renamed from: n, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3163n;

    /* renamed from: o, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3164o;

    public d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f3160k = atomicReferenceFieldUpdater;
        this.f3161l = atomicReferenceFieldUpdater2;
        this.f3162m = atomicReferenceFieldUpdater3;
        this.f3163n = atomicReferenceFieldUpdater4;
        this.f3164o = atomicReferenceFieldUpdater5;
    }

    @Override // h.a
    public final void X(f fVar, f fVar2) {
        this.f3161l.lazySet(fVar, fVar2);
    }

    @Override // h.a
    public final void Y(f fVar, Thread thread) {
        this.f3160k.lazySet(fVar, thread);
    }

    @Override // h.a
    public final boolean h(g gVar, c cVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f3163n;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, cVar, c.f3158b)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == cVar);
        return false;
    }

    @Override // h.a
    public final boolean i(g gVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f3164o;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == obj);
        return false;
    }

    @Override // h.a
    public final boolean j(g gVar, f fVar, f fVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f3162m;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, fVar, fVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == fVar);
        return false;
    }
}
