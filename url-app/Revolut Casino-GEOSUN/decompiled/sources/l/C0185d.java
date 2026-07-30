package l;

import a.AbstractC0069a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: l.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0185d extends AbstractC0069a {

    /* renamed from: i, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f2686i;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f2687j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f2688k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f2689l;

    /* renamed from: m, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f2690m;

    public C0185d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f2686i = atomicReferenceFieldUpdater;
        this.f2687j = atomicReferenceFieldUpdater2;
        this.f2688k = atomicReferenceFieldUpdater3;
        this.f2689l = atomicReferenceFieldUpdater4;
        this.f2690m = atomicReferenceFieldUpdater5;
    }

    @Override // a.AbstractC0069a
    public final boolean c(AbstractFutureC0188g abstractFutureC0188g, C0184c c0184c) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C0184c c0184c2 = C0184c.f2684b;
        do {
            atomicReferenceFieldUpdater = this.f2689l;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC0188g, c0184c, c0184c2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC0188g) == c0184c);
        return false;
    }

    @Override // a.AbstractC0069a
    public final boolean d(AbstractFutureC0188g abstractFutureC0188g, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f2690m;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC0188g, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC0188g) == obj);
        return false;
    }

    @Override // a.AbstractC0069a
    public final boolean e(AbstractFutureC0188g abstractFutureC0188g, C0187f c0187f, C0187f c0187f2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f2688k;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC0188g, c0187f, c0187f2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC0188g) == c0187f);
        return false;
    }

    @Override // a.AbstractC0069a
    public final void y(C0187f c0187f, C0187f c0187f2) {
        this.f2687j.lazySet(c0187f, c0187f2);
    }

    @Override // a.AbstractC0069a
    public final void z(C0187f c0187f, Thread thread) {
        this.f2686i.lazySet(c0187f, thread);
    }
}
