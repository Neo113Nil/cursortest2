package M0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class U extends R0.l implements C, L, E0.l {

    /* renamed from: h, reason: collision with root package name */
    public Z f636h;

    @Override // M0.C
    public final void a() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2;
        Z n2 = n();
        while (true) {
            Object C2 = n2.C();
            if (C2 instanceof U) {
                if (C2 != this) {
                    return;
                }
                E e2 = AbstractC0063v.f696i;
                do {
                    atomicReferenceFieldUpdater2 = Z.f650e;
                    if (atomicReferenceFieldUpdater2.compareAndSet(n2, C2, e2)) {
                        return;
                    }
                } while (atomicReferenceFieldUpdater2.get(n2) == C2);
            } else {
                if (!(C2 instanceof L) || ((L) C2).c() == null) {
                    return;
                }
                while (true) {
                    Object k2 = k();
                    if (k2 instanceof R0.s) {
                        R0.l lVar = ((R0.s) k2).f935a;
                        return;
                    }
                    if (k2 == this) {
                        return;
                    }
                    F0.i.c(k2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                    R0.l lVar2 = (R0.l) k2;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = R0.l.f921g;
                    R0.s sVar = (R0.s) atomicReferenceFieldUpdater3.get(lVar2);
                    if (sVar == null) {
                        sVar = new R0.s(lVar2);
                        atomicReferenceFieldUpdater3.lazySet(lVar2, sVar);
                    }
                    do {
                        atomicReferenceFieldUpdater = R0.l.f919e;
                        if (atomicReferenceFieldUpdater.compareAndSet(this, k2, sVar)) {
                            lVar2.g();
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == k2);
                }
            }
        }
    }

    @Override // M0.L
    public final boolean b() {
        return true;
    }

    @Override // M0.L
    public final a0 c() {
        return null;
    }

    public P getParent() {
        return n();
    }

    public final Z n() {
        Z z2 = this.f636h;
        if (z2 != null) {
            return z2;
        }
        F0.i.g("job");
        throw null;
    }

    public abstract void o(Throwable th);

    @Override // R0.l
    public final String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0063v.b(this) + "[job@" + AbstractC0063v.b(n()) + ']';
    }
}
