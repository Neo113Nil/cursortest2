package q2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e extends a8.d {

    /* renamed from: j, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f7496j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f7497k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f7498l;

    /* renamed from: m, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f7499m;

    /* renamed from: n, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f7500n;

    public e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f7496j = atomicReferenceFieldUpdater;
        this.f7497k = atomicReferenceFieldUpdater2;
        this.f7498l = atomicReferenceFieldUpdater3;
        this.f7499m = atomicReferenceFieldUpdater4;
        this.f7500n = atomicReferenceFieldUpdater5;
    }

    @Override // a8.d
    public final void R(g gVar, g gVar2) {
        this.f7497k.lazySet(gVar, gVar2);
    }

    @Override // a8.d
    public final void S(g gVar, Thread thread) {
        this.f7496j.lazySet(gVar, thread);
    }

    @Override // a8.d
    public final boolean q(h hVar, d dVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f7499m;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, dVar, d.f7494b)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == dVar);
        return false;
    }

    @Override // a8.d
    public final boolean r(h hVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f7500n;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == obj);
        return false;
    }

    @Override // a8.d
    public final boolean s(h hVar, g gVar, g gVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f7498l;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, gVar, gVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == gVar);
        return false;
    }
}
