package o1;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class P extends s1.i implements InterfaceC0306z, I, f1.l {
    public U d;

    @Override // o1.I
    public final boolean a() {
        return true;
    }

    @Override // o1.I
    public final V b() {
        return null;
    }

    @Override // o1.InterfaceC0306z
    public final void e() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2;
        U n2 = n();
        while (true) {
            Object w2 = n2.w();
            if (w2 instanceof P) {
                if (w2 != this) {
                    return;
                }
                A a2 = AbstractC0299s.h;
                do {
                    atomicReferenceFieldUpdater2 = U.f3327a;
                    if (atomicReferenceFieldUpdater2.compareAndSet(n2, w2, a2)) {
                        return;
                    }
                } while (atomicReferenceFieldUpdater2.get(n2) == w2);
            } else {
                if (!(w2 instanceof I) || ((I) w2).b() == null) {
                    return;
                }
                while (true) {
                    Object k2 = k();
                    if (k2 instanceof s1.o) {
                        s1.i iVar = ((s1.o) k2).f3667a;
                        return;
                    }
                    if (k2 == this) {
                        return;
                    }
                    g1.f.c(k2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                    s1.i iVar2 = (s1.i) k2;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = s1.i.f3657c;
                    s1.o oVar = (s1.o) atomicReferenceFieldUpdater3.get(iVar2);
                    if (oVar == null) {
                        oVar = new s1.o(iVar2);
                        atomicReferenceFieldUpdater3.lazySet(iVar2, oVar);
                    }
                    do {
                        atomicReferenceFieldUpdater = s1.i.f3655a;
                        if (atomicReferenceFieldUpdater.compareAndSet(this, k2, oVar)) {
                            iVar2.i();
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == k2);
                }
            }
        }
    }

    public final U n() {
        U u2 = this.d;
        if (u2 != null) {
            return u2;
        }
        g1.f.g("job");
        throw null;
    }

    public abstract void o(Throwable th);

    @Override // s1.i
    public final String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0299s.d(this) + "[job@" + AbstractC0299s.d(n()) + ']';
    }
}
