package Y0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class U extends d1.l implements C, L, P0.l {

    /* renamed from: h, reason: collision with root package name */
    public Z f1179h;

    @Override // Y0.C
    public final void a() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2;
        Z n2 = n();
        while (true) {
            Object E2 = n2.E();
            if (E2 instanceof U) {
                if (E2 != this) {
                    return;
                }
                E e2 = AbstractC0127v.f1239i;
                do {
                    atomicReferenceFieldUpdater2 = Z.f1193e;
                    if (atomicReferenceFieldUpdater2.compareAndSet(n2, E2, e2)) {
                        return;
                    }
                } while (atomicReferenceFieldUpdater2.get(n2) == E2);
            } else {
                if (!(E2 instanceof L) || ((L) E2).e() == null) {
                    return;
                }
                while (true) {
                    Object k2 = k();
                    if (k2 instanceof d1.s) {
                        d1.l lVar = ((d1.s) k2).f2104a;
                        return;
                    }
                    if (k2 == this) {
                        return;
                    }
                    Q0.h.c(k2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                    d1.l lVar2 = (d1.l) k2;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = d1.l.f2090g;
                    d1.s sVar = (d1.s) atomicReferenceFieldUpdater3.get(lVar2);
                    if (sVar == null) {
                        sVar = new d1.s(lVar2);
                        atomicReferenceFieldUpdater3.lazySet(lVar2, sVar);
                    }
                    do {
                        atomicReferenceFieldUpdater = d1.l.f2088e;
                        if (atomicReferenceFieldUpdater.compareAndSet(this, k2, sVar)) {
                            lVar2.f();
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == k2);
                }
            }
        }
    }

    @Override // Y0.L
    public final boolean b() {
        return true;
    }

    @Override // Y0.L
    public final a0 e() {
        return null;
    }

    public P getParent() {
        return n();
    }

    public final Z n() {
        Z z2 = this.f1179h;
        if (z2 != null) {
            return z2;
        }
        Q0.h.g("job");
        throw null;
    }

    public abstract void o(Throwable th);

    @Override // d1.l
    public final String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0127v.b(this) + "[job@" + AbstractC0127v.b(n()) + ']';
    }
}
