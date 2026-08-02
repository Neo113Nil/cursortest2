package x3;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class Y extends C3.k implements P, InterfaceC1529D, InterfaceC1538M {

    /* renamed from: d, reason: collision with root package name */
    public d0 f16010d;

    @Override // x3.InterfaceC1538M
    public final boolean a() {
        return true;
    }

    @Override // x3.InterfaceC1538M
    public final e0 c() {
        return null;
    }

    @Override // x3.InterfaceC1529D
    public final void dispose() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        d0 j4 = j();
        while (true) {
            Object A4 = j4.A();
            if (A4 instanceof Y) {
                if (A4 != this) {
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = d0.f16029a;
                C1531F c1531f = AbstractC1562w.f16071i;
                while (!atomicReferenceFieldUpdater2.compareAndSet(j4, A4, c1531f)) {
                    if (atomicReferenceFieldUpdater2.get(j4) != A4) {
                        break;
                    }
                }
                return;
            }
            if (!(A4 instanceof InterfaceC1538M) || ((InterfaceC1538M) A4).c() == null) {
                return;
            }
            while (true) {
                Object g4 = g();
                if (g4 instanceof C3.q) {
                    C3.k kVar = ((C3.q) g4).f315a;
                    return;
                }
                if (g4 == this) {
                    return;
                }
                kotlin.jvm.internal.i.c(g4, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                C3.k kVar2 = (C3.k) g4;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = C3.k.f304c;
                C3.q qVar = (C3.q) atomicReferenceFieldUpdater3.get(kVar2);
                if (qVar == null) {
                    qVar = new C3.q(kVar2);
                    atomicReferenceFieldUpdater3.set(kVar2, qVar);
                }
                do {
                    atomicReferenceFieldUpdater = C3.k.f302a;
                    if (atomicReferenceFieldUpdater.compareAndSet(this, g4, qVar)) {
                        kVar2.e();
                        return;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == g4);
            }
        }
    }

    public T getParent() {
        return j();
    }

    public final d0 j() {
        d0 d0Var = this.f16010d;
        if (d0Var != null) {
            return d0Var;
        }
        kotlin.jvm.internal.i.i("job");
        throw null;
    }

    @Override // C3.k
    public final String toString() {
        return getClass().getSimpleName() + '@' + AbstractC1562w.c(this) + "[job@" + AbstractC1562w.c(j()) + ']';
    }
}
