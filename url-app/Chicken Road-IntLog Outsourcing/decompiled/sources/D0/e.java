package D0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class e extends K1.b {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f414a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f415b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f416c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f417d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f418e;

    public e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f414a = atomicReferenceFieldUpdater;
        this.f415b = atomicReferenceFieldUpdater2;
        this.f416c = atomicReferenceFieldUpdater3;
        this.f417d = atomicReferenceFieldUpdater4;
        this.f418e = atomicReferenceFieldUpdater5;
    }

    @Override // K1.b
    public final boolean E(i iVar, d dVar, d dVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f417d;
            if (atomicReferenceFieldUpdater.compareAndSet(iVar, dVar, dVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(iVar) == dVar);
        return false;
    }

    @Override // K1.b
    public final boolean G(i iVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f418e;
            if (atomicReferenceFieldUpdater.compareAndSet(iVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(iVar) == obj);
        return false;
    }

    @Override // K1.b
    public final boolean I(i iVar, h hVar, h hVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f416c;
            if (atomicReferenceFieldUpdater.compareAndSet(iVar, hVar, hVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(iVar) == hVar);
        return false;
    }

    @Override // K1.b
    public final void b0(h hVar, h hVar2) {
        this.f415b.lazySet(hVar, hVar2);
    }

    @Override // K1.b
    public final void d0(h hVar, Thread thread) {
        this.f414a.lazySet(hVar, thread);
    }
}
