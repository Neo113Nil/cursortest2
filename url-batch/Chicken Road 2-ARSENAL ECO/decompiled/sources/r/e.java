package r;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class e extends A3.c {

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f5825b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f5826c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f5827d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f5828e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f5829f;

    public e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(17);
        this.f5825b = atomicReferenceFieldUpdater;
        this.f5826c = atomicReferenceFieldUpdater2;
        this.f5827d = atomicReferenceFieldUpdater3;
        this.f5828e = atomicReferenceFieldUpdater4;
        this.f5829f = atomicReferenceFieldUpdater5;
    }

    @Override // A3.c
    public final boolean A(h hVar, d dVar, d dVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f5828e;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, dVar, dVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == dVar);
        return false;
    }

    @Override // A3.c
    public final boolean B(h hVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f5829f;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == obj);
        return false;
    }

    @Override // A3.c
    public final boolean C(h hVar, g gVar, g gVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f5827d;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, gVar, gVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == gVar);
        return false;
    }

    @Override // A3.c
    public final void V(g gVar, g gVar2) {
        this.f5826c.lazySet(gVar, gVar2);
    }

    @Override // A3.c
    public final void W(g gVar, Thread thread) {
        this.f5825b.lazySet(gVar, thread);
    }
}
