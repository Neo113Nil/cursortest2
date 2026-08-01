package p;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class d extends m0.a {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3005a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3006b;
    public final AtomicReferenceFieldUpdater c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3007d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3008e;

    public d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f3005a = atomicReferenceFieldUpdater;
        this.f3006b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.f3007d = atomicReferenceFieldUpdater4;
        this.f3008e = atomicReferenceFieldUpdater5;
    }

    @Override // m0.a
    public final boolean d(g gVar, c cVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f3007d;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, cVar, c.f3003b)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == cVar);
        return false;
    }

    @Override // m0.a
    public final boolean e(g gVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f3008e;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == obj);
        return false;
    }

    @Override // m0.a
    public final boolean f(g gVar, f fVar, f fVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.c;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, fVar, fVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == fVar);
        return false;
    }

    @Override // m0.a
    public final void v(f fVar, f fVar2) {
        this.f3006b.lazySet(fVar, fVar2);
    }

    @Override // m0.a
    public final void w(f fVar, Thread thread) {
        this.f3005a.lazySet(fVar, thread);
    }
}
