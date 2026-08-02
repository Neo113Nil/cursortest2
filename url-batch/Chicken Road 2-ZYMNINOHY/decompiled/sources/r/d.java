package r;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class d extends V3.b {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f15098a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f15099b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f15100c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f15101d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f15102e;

    public d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f15098a = atomicReferenceFieldUpdater;
        this.f15099b = atomicReferenceFieldUpdater2;
        this.f15100c = atomicReferenceFieldUpdater3;
        this.f15101d = atomicReferenceFieldUpdater4;
        this.f15102e = atomicReferenceFieldUpdater5;
    }

    @Override // V3.b
    public final boolean g(g gVar, C1389c c1389c, C1389c c1389c2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f15101d;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, c1389c, c1389c2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == c1389c);
        return false;
    }

    @Override // V3.b
    public final boolean h(g gVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f15102e;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == obj);
        return false;
    }

    @Override // V3.b
    public final boolean i(g gVar, f fVar, f fVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f15100c;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, fVar, fVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == fVar);
        return false;
    }

    @Override // V3.b
    public final void v(f fVar, f fVar2) {
        this.f15099b.lazySet(fVar, fVar2);
    }

    @Override // V3.b
    public final void w(f fVar, Thread thread) {
        this.f15098a.lazySet(fVar, thread);
    }
}
