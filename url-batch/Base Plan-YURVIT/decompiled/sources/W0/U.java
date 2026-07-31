package W0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class U extends b1.l implements C, L, O0.l {

    /* renamed from: h, reason: collision with root package name */
    public Z f925h;

    @Override // W0.L
    public final boolean a() {
        return true;
    }

    @Override // W0.C
    public final void b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Z o2 = o();
        while (true) {
            Object D2 = o2.D();
            if (D2 instanceof U) {
                if (D2 != this) {
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = Z.f939e;
                E e2 = AbstractC0081v.f983i;
                while (!atomicReferenceFieldUpdater2.compareAndSet(o2, D2, e2)) {
                    if (atomicReferenceFieldUpdater2.get(o2) != D2) {
                        break;
                    }
                }
                return;
            }
            if (!(D2 instanceof L) || ((L) D2).e() == null) {
                return;
            }
            while (true) {
                Object l2 = l();
                if (l2 instanceof b1.s) {
                    b1.l lVar = ((b1.s) l2).f1774a;
                    return;
                }
                if (l2 == this) {
                    return;
                }
                P0.h.c(l2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                b1.l lVar2 = (b1.l) l2;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = b1.l.f1763g;
                b1.s sVar = (b1.s) atomicReferenceFieldUpdater3.get(lVar2);
                if (sVar == null) {
                    sVar = new b1.s(lVar2);
                    atomicReferenceFieldUpdater3.lazySet(lVar2, sVar);
                }
                do {
                    atomicReferenceFieldUpdater = b1.l.f1761e;
                    if (atomicReferenceFieldUpdater.compareAndSet(this, l2, sVar)) {
                        lVar2.f();
                        return;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == l2);
            }
        }
    }

    @Override // W0.L
    public final a0 e() {
        return null;
    }

    public P getParent() {
        return o();
    }

    public final Z o() {
        Z z2 = this.f925h;
        if (z2 != null) {
            return z2;
        }
        P0.h.g("job");
        throw null;
    }

    public abstract void p(Throwable th);

    @Override // b1.l
    public final String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0081v.b(this) + "[job@" + AbstractC0081v.b(o()) + ']';
    }
}
