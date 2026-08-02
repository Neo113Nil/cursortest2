package r;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class d extends android.support.v4.media.session.a {

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f10246c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f10247d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f10248e;
    public final AtomicReferenceFieldUpdater f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f10249g;

    public d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f10246c = atomicReferenceFieldUpdater;
        this.f10247d = atomicReferenceFieldUpdater2;
        this.f10248e = atomicReferenceFieldUpdater3;
        this.f = atomicReferenceFieldUpdater4;
        this.f10249g = atomicReferenceFieldUpdater5;
    }

    @Override // android.support.v4.media.session.a
    public final void F(f fVar, f fVar2) {
        this.f10247d.lazySet(fVar, fVar2);
    }

    @Override // android.support.v4.media.session.a
    public final void G(f fVar, Thread thread) {
        this.f10246c.lazySet(fVar, thread);
    }

    @Override // android.support.v4.media.session.a
    public final boolean f(g gVar, c cVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        c cVar2 = c.f10244b;
        do {
            atomicReferenceFieldUpdater = this.f;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, cVar, cVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == cVar);
        return false;
    }

    @Override // android.support.v4.media.session.a
    public final boolean g(g gVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f10249g;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == obj);
        return false;
    }

    @Override // android.support.v4.media.session.a
    public final boolean h(g gVar, f fVar, f fVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f10248e;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, fVar, fVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == fVar);
        return false;
    }
}
