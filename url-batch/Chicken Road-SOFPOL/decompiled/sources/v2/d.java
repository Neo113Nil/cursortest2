package v2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import r2.o;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class d extends o {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f7464a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f7465b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f7466c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f7467d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f7468e;

    public d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f7464a = atomicReferenceFieldUpdater;
        this.f7465b = atomicReferenceFieldUpdater2;
        this.f7466c = atomicReferenceFieldUpdater3;
        this.f7467d = atomicReferenceFieldUpdater4;
        this.f7468e = atomicReferenceFieldUpdater5;
    }

    @Override // r2.o
    public final void e0(f fVar, f fVar2) {
        this.f7465b.lazySet(fVar, fVar2);
    }

    @Override // r2.o
    public final void i0(f fVar, Thread thread) {
        this.f7464a.lazySet(fVar, thread);
    }

    @Override // r2.o
    public final boolean m(g gVar, c cVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f7467d;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, cVar, c.f7462b)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == cVar);
        return false;
    }

    @Override // r2.o
    public final boolean n(g gVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f7468e;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == obj);
        return false;
    }

    @Override // r2.o
    public final boolean o(g gVar, f fVar, f fVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f7466c;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, fVar, fVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == fVar);
        return false;
    }
}
