package q;

import h0.d0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class d extends d0 {
    public final AtomicReferenceFieldUpdater d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3484e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3485f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3486g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3487h;

    public d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.d = atomicReferenceFieldUpdater;
        this.f3484e = atomicReferenceFieldUpdater2;
        this.f3485f = atomicReferenceFieldUpdater3;
        this.f3486g = atomicReferenceFieldUpdater4;
        this.f3487h = atomicReferenceFieldUpdater5;
    }

    @Override // h0.d0
    public final boolean b(g gVar, c cVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        c cVar2 = c.f3482b;
        do {
            atomicReferenceFieldUpdater = this.f3486g;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, cVar, cVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == cVar);
        return false;
    }

    @Override // h0.d0
    public final boolean c(g gVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f3487h;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == obj);
        return false;
    }

    @Override // h0.d0
    public final boolean d(g gVar, f fVar, f fVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f3485f;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, fVar, fVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == fVar);
        return false;
    }

    @Override // h0.d0
    public final void o(f fVar, f fVar2) {
        this.f3484e.lazySet(fVar, fVar2);
    }

    @Override // h0.d0
    public final void p(f fVar, Thread thread) {
        this.d.lazySet(fVar, thread);
    }
}
