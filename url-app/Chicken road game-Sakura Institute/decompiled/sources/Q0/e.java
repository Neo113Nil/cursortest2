package Q0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class e extends j0.c {

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3924e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3925f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3926g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3927h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3928i;

    public e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f3924e = atomicReferenceFieldUpdater;
        this.f3925f = atomicReferenceFieldUpdater2;
        this.f3926g = atomicReferenceFieldUpdater3;
        this.f3927h = atomicReferenceFieldUpdater4;
        this.f3928i = atomicReferenceFieldUpdater5;
    }

    @Override // j0.c
    public final void G(g gVar, g gVar2) {
        this.f3925f.lazySet(gVar, gVar2);
    }

    @Override // j0.c
    public final void H(g gVar, Thread thread) {
        this.f3924e.lazySet(gVar, thread);
    }

    @Override // j0.c
    public final boolean o(h hVar, d dVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        d dVar2 = d.f3922b;
        do {
            atomicReferenceFieldUpdater = this.f3927h;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, dVar, dVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == dVar);
        return false;
    }

    @Override // j0.c
    public final boolean p(h hVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f3928i;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == obj);
        return false;
    }

    @Override // j0.c
    public final boolean q(h hVar, g gVar, g gVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f3926g;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, gVar, gVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == gVar);
        return false;
    }
}
