package p;

import c1.AbstractC0091d;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class d extends AbstractC0091d {
    public final AtomicReferenceFieldUpdater d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3612e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3613f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3614g;
    public final AtomicReferenceFieldUpdater h;

    public d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.d = atomicReferenceFieldUpdater;
        this.f3612e = atomicReferenceFieldUpdater2;
        this.f3613f = atomicReferenceFieldUpdater3;
        this.f3614g = atomicReferenceFieldUpdater4;
        this.h = atomicReferenceFieldUpdater5;
    }

    @Override // c1.AbstractC0091d
    public final boolean b(g gVar, C0297c c0297c) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C0297c c0297c2 = C0297c.f3610b;
        do {
            atomicReferenceFieldUpdater = this.f3614g;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, c0297c, c0297c2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == c0297c);
        return false;
    }

    @Override // c1.AbstractC0091d
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

    @Override // c1.AbstractC0091d
    public final boolean d(g gVar, f fVar, f fVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f3613f;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, fVar, fVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == fVar);
        return false;
    }

    @Override // c1.AbstractC0091d
    public final void p(f fVar, f fVar2) {
        this.f3612e.lazySet(fVar, fVar2);
    }

    @Override // c1.AbstractC0091d
    public final void q(f fVar, Thread thread) {
        this.d.lazySet(fVar, thread);
    }
}
