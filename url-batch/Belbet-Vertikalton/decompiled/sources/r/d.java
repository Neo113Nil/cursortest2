package r;

import a.AbstractC0058a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class d extends AbstractC0058a {
    public final AtomicReferenceFieldUpdater e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f4016f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f4017g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f4018h;
    public final AtomicReferenceFieldUpdater i;

    public d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.e = atomicReferenceFieldUpdater;
        this.f4016f = atomicReferenceFieldUpdater2;
        this.f4017g = atomicReferenceFieldUpdater3;
        this.f4018h = atomicReferenceFieldUpdater4;
        this.i = atomicReferenceFieldUpdater5;
    }

    @Override // a.AbstractC0058a
    public final void S(f fVar, f fVar2) {
        this.f4016f.lazySet(fVar, fVar2);
    }

    @Override // a.AbstractC0058a
    public final void T(f fVar, Thread thread) {
        this.e.lazySet(fVar, thread);
    }

    @Override // a.AbstractC0058a
    public final boolean g(g gVar, c cVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        c cVar2 = c.f4014b;
        do {
            atomicReferenceFieldUpdater = this.f4018h;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, cVar, cVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == cVar);
        return false;
    }

    @Override // a.AbstractC0058a
    public final boolean h(g gVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.i;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == obj);
        return false;
    }

    @Override // a.AbstractC0058a
    public final boolean i(g gVar, f fVar, f fVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f4017g;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, fVar, fVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == fVar);
        return false;
    }
}
