package o;

import a.AbstractC0132a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class d extends AbstractC0132a {

    /* renamed from: j, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3310j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3311k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3312l;

    /* renamed from: m, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3313m;

    /* renamed from: n, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3314n;

    public d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(27);
        this.f3310j = atomicReferenceFieldUpdater;
        this.f3311k = atomicReferenceFieldUpdater2;
        this.f3312l = atomicReferenceFieldUpdater3;
        this.f3313m = atomicReferenceFieldUpdater4;
        this.f3314n = atomicReferenceFieldUpdater5;
    }

    @Override // a.AbstractC0132a
    public final void A(f fVar, f fVar2) {
        this.f3311k.lazySet(fVar, fVar2);
    }

    @Override // a.AbstractC0132a
    public final void B(f fVar, Thread thread) {
        this.f3310j.lazySet(fVar, thread);
    }

    @Override // a.AbstractC0132a
    public final boolean h(g gVar, c cVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        c cVar2 = c.f3308b;
        do {
            atomicReferenceFieldUpdater = this.f3313m;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, cVar, cVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == cVar);
        return false;
    }

    @Override // a.AbstractC0132a
    public final boolean i(g gVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f3314n;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == obj);
        return false;
    }

    @Override // a.AbstractC0132a
    public final boolean j(g gVar, f fVar, f fVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f3312l;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, fVar, fVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == fVar);
        return false;
    }
}
