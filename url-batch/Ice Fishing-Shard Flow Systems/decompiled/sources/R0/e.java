package R0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class e extends P0.f {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f2381a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f2382b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f2383c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f2384d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f2385e;

    public e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f2381a = atomicReferenceFieldUpdater;
        this.f2382b = atomicReferenceFieldUpdater2;
        this.f2383c = atomicReferenceFieldUpdater3;
        this.f2384d = atomicReferenceFieldUpdater4;
        this.f2385e = atomicReferenceFieldUpdater5;
    }

    @Override // P0.f
    public final void B(h hVar, h hVar2) {
        this.f2382b.lazySet(hVar, hVar2);
    }

    @Override // P0.f
    public final void D(h hVar, Thread thread) {
        this.f2381a.lazySet(hVar, thread);
    }

    @Override // P0.f
    public final boolean f(i iVar, d dVar, d dVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f2384d;
            if (atomicReferenceFieldUpdater.compareAndSet(iVar, dVar, dVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(iVar) == dVar);
        return false;
    }

    @Override // P0.f
    public final boolean h(i iVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f2385e;
            if (atomicReferenceFieldUpdater.compareAndSet(iVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(iVar) == obj);
        return false;
    }

    @Override // P0.f
    public final boolean j(i iVar, h hVar, h hVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f2383c;
            if (atomicReferenceFieldUpdater.compareAndSet(iVar, hVar, hVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(iVar) == hVar);
        return false;
    }
}
