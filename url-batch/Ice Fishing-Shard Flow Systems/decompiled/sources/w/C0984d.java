package w;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: w.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0984d extends P0.f {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f8264a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f8265b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f8266c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f8267d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f8268e;

    public C0984d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f8264a = atomicReferenceFieldUpdater;
        this.f8265b = atomicReferenceFieldUpdater2;
        this.f8266c = atomicReferenceFieldUpdater3;
        this.f8267d = atomicReferenceFieldUpdater4;
        this.f8268e = atomicReferenceFieldUpdater5;
    }

    @Override // P0.f
    public final void C(C0986f c0986f, C0986f c0986f2) {
        this.f8265b.lazySet(c0986f, c0986f2);
    }

    @Override // P0.f
    public final void E(C0986f c0986f, Thread thread) {
        this.f8264a.lazySet(c0986f, thread);
    }

    @Override // P0.f
    public final boolean g(AbstractC0987g abstractC0987g, C0983c c0983c, C0983c c0983c2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f8267d;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC0987g, c0983c, c0983c2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC0987g) == c0983c);
        return false;
    }

    @Override // P0.f
    public final boolean i(AbstractC0987g abstractC0987g, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f8268e;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC0987g, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC0987g) == obj);
        return false;
    }

    @Override // P0.f
    public final boolean k(AbstractC0987g abstractC0987g, C0986f c0986f, C0986f c0986f2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f8266c;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC0987g, c0986f, c0986f2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC0987g) == c0986f);
        return false;
    }
}
