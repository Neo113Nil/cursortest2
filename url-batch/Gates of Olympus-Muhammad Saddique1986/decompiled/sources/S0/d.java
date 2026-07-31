package S0;

import h2.AbstractC0508a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class d extends AbstractC0508a {

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f4291d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f4292e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f4293f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f4294g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f4295h;

    public d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f4291d = atomicReferenceFieldUpdater;
        this.f4292e = atomicReferenceFieldUpdater2;
        this.f4293f = atomicReferenceFieldUpdater3;
        this.f4294g = atomicReferenceFieldUpdater4;
        this.f4295h = atomicReferenceFieldUpdater5;
    }

    @Override // h2.AbstractC0508a
    public final void M(f fVar, f fVar2) {
        this.f4292e.lazySet(fVar, fVar2);
    }

    @Override // h2.AbstractC0508a
    public final void N(f fVar, Thread thread) {
        this.f4291d.lazySet(fVar, thread);
    }

    @Override // h2.AbstractC0508a
    public final boolean r(g gVar, c cVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        c cVar2 = c.f4289b;
        do {
            atomicReferenceFieldUpdater = this.f4294g;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, cVar, cVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == cVar);
        return false;
    }

    @Override // h2.AbstractC0508a
    public final boolean s(g gVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f4295h;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == obj);
        return false;
    }

    @Override // h2.AbstractC0508a
    public final boolean t(g gVar, f fVar, f fVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f4293f;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, fVar, fVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == fVar);
        return false;
    }
}
