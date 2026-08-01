package e6;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d extends c6.f {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3934a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3935b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3936c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3937d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3938e;

    public d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f3934a = atomicReferenceFieldUpdater;
        this.f3935b = atomicReferenceFieldUpdater2;
        this.f3936c = atomicReferenceFieldUpdater3;
        this.f3937d = atomicReferenceFieldUpdater4;
        this.f3938e = atomicReferenceFieldUpdater5;
    }

    @Override // c6.f
    public final void T(g gVar, g gVar2) {
        this.f3935b.lazySet(gVar, gVar2);
    }

    @Override // c6.f
    public final void U(g gVar, Thread thread) {
        this.f3934a.lazySet(gVar, thread);
    }

    @Override // c6.f
    public final boolean h(h hVar, c cVar, c cVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f3937d;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, cVar, cVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == cVar);
        return false;
    }

    @Override // c6.f
    public final boolean i(h hVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f3938e;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == obj);
        return false;
    }

    @Override // c6.f
    public final boolean j(h hVar, g gVar, g gVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f3936c;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, gVar, gVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == gVar);
        return false;
    }
}
