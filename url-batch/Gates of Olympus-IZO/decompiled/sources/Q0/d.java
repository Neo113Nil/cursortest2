package Q0;

import a.AbstractC0157a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class d extends AbstractC0157a {

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3098b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3099c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3100d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3101e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3102f;

    public d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f3098b = atomicReferenceFieldUpdater;
        this.f3099c = atomicReferenceFieldUpdater2;
        this.f3100d = atomicReferenceFieldUpdater3;
        this.f3101e = atomicReferenceFieldUpdater4;
        this.f3102f = atomicReferenceFieldUpdater5;
    }

    @Override // a.AbstractC0157a
    public final void Q(f fVar, f fVar2) {
        this.f3099c.lazySet(fVar, fVar2);
    }

    @Override // a.AbstractC0157a
    public final void R(f fVar, Thread thread) {
        this.f3098b.lazySet(fVar, thread);
    }

    @Override // a.AbstractC0157a
    public final boolean m(g gVar, c cVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        c cVar2 = c.f3096b;
        do {
            atomicReferenceFieldUpdater = this.f3101e;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, cVar, cVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == cVar);
        return false;
    }

    @Override // a.AbstractC0157a
    public final boolean n(g gVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f3102f;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == obj);
        return false;
    }

    @Override // a.AbstractC0157a
    public final boolean o(g gVar, f fVar, f fVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f3100d;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, fVar, fVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == fVar);
        return false;
    }
}
