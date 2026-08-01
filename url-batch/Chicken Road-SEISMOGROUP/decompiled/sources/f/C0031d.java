package f;

import a.AbstractC0016a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: f.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0031d extends AbstractC0016a {

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f567g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f568h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f569i;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f570j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f571k;

    public C0031d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(19);
        this.f567g = atomicReferenceFieldUpdater;
        this.f568h = atomicReferenceFieldUpdater2;
        this.f569i = atomicReferenceFieldUpdater3;
        this.f570j = atomicReferenceFieldUpdater4;
        this.f571k = atomicReferenceFieldUpdater5;
    }

    @Override // a.AbstractC0016a
    public final boolean e(AbstractFutureC0034g abstractFutureC0034g, C0030c c0030c) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C0030c c0030c2 = C0030c.f565b;
        do {
            atomicReferenceFieldUpdater = this.f570j;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC0034g, c0030c, c0030c2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC0034g) == c0030c);
        return false;
    }

    @Override // a.AbstractC0016a
    public final boolean f(AbstractFutureC0034g abstractFutureC0034g, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f571k;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC0034g, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC0034g) == obj);
        return false;
    }

    @Override // a.AbstractC0016a
    public final boolean g(AbstractFutureC0034g abstractFutureC0034g, C0033f c0033f, C0033f c0033f2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f569i;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC0034g, c0033f, c0033f2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC0034g) == c0033f);
        return false;
    }

    @Override // a.AbstractC0016a
    public final void y(C0033f c0033f, C0033f c0033f2) {
        this.f568h.lazySet(c0033f, c0033f2);
    }

    @Override // a.AbstractC0016a
    public final void z(C0033f c0033f, Thread thread) {
        this.f567g.lazySet(c0033f, thread);
    }
}
