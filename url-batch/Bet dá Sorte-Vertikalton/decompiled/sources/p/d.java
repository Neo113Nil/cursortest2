package p;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k0.z;

/* loaded from: classes.dex */
public final class d extends z {
    public final AtomicReferenceFieldUpdater d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3404e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3405f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3406g;
    public final AtomicReferenceFieldUpdater h;

    public d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.d = atomicReferenceFieldUpdater;
        this.f3404e = atomicReferenceFieldUpdater2;
        this.f3405f = atomicReferenceFieldUpdater3;
        this.f3406g = atomicReferenceFieldUpdater4;
        this.h = atomicReferenceFieldUpdater5;
    }

    @Override // k0.z
    public final boolean c(g gVar, C0265c c0265c) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C0265c c0265c2 = C0265c.f3402b;
        do {
            atomicReferenceFieldUpdater = this.f3406g;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, c0265c, c0265c2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == c0265c);
        return false;
    }

    @Override // k0.z
    public final boolean d(g gVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.h;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == obj);
        return false;
    }

    @Override // k0.z
    public final boolean e(g gVar, f fVar, f fVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f3405f;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, fVar, fVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == fVar);
        return false;
    }

    @Override // k0.z
    public final void m(f fVar, f fVar2) {
        this.f3404e.lazySet(fVar, fVar2);
    }

    @Override // k0.z
    public final void n(f fVar, Thread thread) {
        this.d.lazySet(fVar, thread);
    }
}
