package s1;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class P extends w1.i implements InterfaceC0342z, I, j1.l {
    public U d;

    @Override // s1.I
    public final boolean a() {
        return true;
    }

    @Override // s1.I
    public final V b() {
        return null;
    }

    @Override // s1.InterfaceC0342z
    public final void e() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2;
        U n2 = n();
        while (true) {
            Object x2 = n2.x();
            if (x2 instanceof P) {
                if (x2 != this) {
                    return;
                }
                A a2 = AbstractC0335s.h;
                do {
                    atomicReferenceFieldUpdater2 = U.f4030a;
                    if (atomicReferenceFieldUpdater2.compareAndSet(n2, x2, a2)) {
                        return;
                    }
                } while (atomicReferenceFieldUpdater2.get(n2) == x2);
            } else {
                if (!(x2 instanceof I) || ((I) x2).b() == null) {
                    return;
                }
                while (true) {
                    Object k2 = k();
                    if (k2 instanceof w1.o) {
                        w1.i iVar = ((w1.o) k2).f4516a;
                        return;
                    }
                    if (k2 == this) {
                        return;
                    }
                    k1.e.c(k2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                    w1.i iVar2 = (w1.i) k2;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = w1.i.f4506c;
                    w1.o oVar = (w1.o) atomicReferenceFieldUpdater3.get(iVar2);
                    if (oVar == null) {
                        oVar = new w1.o(iVar2);
                        atomicReferenceFieldUpdater3.lazySet(iVar2, oVar);
                    }
                    do {
                        atomicReferenceFieldUpdater = w1.i.f4504a;
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
        k1.e.h("job");
        throw null;
    }

    public abstract void o(Throwable th);

    @Override // w1.i
    public final String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0335s.c(this) + "[job@" + AbstractC0335s.c(n()) + ']';
    }
}
