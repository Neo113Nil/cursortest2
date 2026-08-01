package f8;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g extends i7.a {
    public final AtomicReferenceFieldUpdater g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f4145h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f4146i;
    public final AtomicReferenceFieldUpdater j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f4147k;

    public g(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(10);
        this.g = atomicReferenceFieldUpdater;
        this.f4145h = atomicReferenceFieldUpdater2;
        this.f4146i = atomicReferenceFieldUpdater3;
        this.j = atomicReferenceFieldUpdater4;
        this.f4147k = atomicReferenceFieldUpdater5;
    }

    @Override // i7.a
    public final f L(r rVar) {
        return (f) this.j.getAndSet(rVar, f.f4136d);
    }

    @Override // i7.a
    public final q M(r rVar) {
        return (q) this.f4146i.getAndSet(rVar, q.f4165c);
    }

    @Override // i7.a
    public final void Y(q qVar, q qVar2) {
        this.f4145h.lazySet(qVar, qVar2);
    }

    @Override // i7.a
    public final void Z(q qVar, Thread thread) {
        this.g.lazySet(qVar, thread);
    }

    @Override // i7.a
    public final boolean q(r rVar, f fVar, f fVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.j;
            if (atomicReferenceFieldUpdater.compareAndSet(rVar, fVar, fVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(rVar) == fVar);
        return false;
    }

    @Override // i7.a
    public final boolean r(r rVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f4147k;
            if (atomicReferenceFieldUpdater.compareAndSet(rVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(rVar) == obj);
        return false;
    }

    @Override // i7.a
    public final boolean s(r rVar, q qVar, q qVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f4146i;
            if (atomicReferenceFieldUpdater.compareAndSet(rVar, qVar, qVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(rVar) == qVar);
        return false;
    }
}
