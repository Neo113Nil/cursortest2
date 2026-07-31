package H5;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import x5.InterfaceC0743l;

/* loaded from: classes.dex */
public abstract class b0 extends M5.k implements H, U, InterfaceC0743l {

    /* renamed from: i, reason: collision with root package name */
    public g0 f1056i;

    @Override // H5.U
    public final boolean a() {
        return true;
    }

    @Override // H5.H
    public final void b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        g0 j4 = j();
        while (true) {
            Object C6 = j4.C();
            if (C6 instanceof b0) {
                if (C6 != this) {
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = g0.f1080f;
                J j7 = AbstractC0165z.f1123j;
                while (!atomicReferenceFieldUpdater2.compareAndSet(j4, C6, j7)) {
                    if (atomicReferenceFieldUpdater2.get(j4) != C6) {
                        break;
                    }
                }
                return;
            }
            if (!(C6 instanceof U) || ((U) C6).d() == null) {
                return;
            }
            while (true) {
                Object g7 = g();
                if (g7 instanceof M5.q) {
                    M5.k kVar = ((M5.q) g7).f1619a;
                    return;
                }
                if (g7 == this) {
                    return;
                }
                kotlin.jvm.internal.i.c(g7, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                M5.k kVar2 = (M5.k) g7;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = M5.k.f1608h;
                M5.q qVar = (M5.q) atomicReferenceFieldUpdater3.get(kVar2);
                if (qVar == null) {
                    qVar = new M5.q(kVar2);
                    atomicReferenceFieldUpdater3.lazySet(kVar2, qVar);
                }
                do {
                    atomicReferenceFieldUpdater = M5.k.f1606f;
                    if (atomicReferenceFieldUpdater.compareAndSet(this, g7, qVar)) {
                        kVar2.e();
                        return;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == g7);
            }
        }
    }

    @Override // H5.U
    public final i0 d() {
        return null;
    }

    public final g0 j() {
        g0 g0Var = this.f1056i;
        if (g0Var != null) {
            return g0Var;
        }
        kotlin.jvm.internal.i.l("job");
        throw null;
    }

    public abstract void k(Throwable th);

    @Override // M5.k
    public final String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0165z.g(this) + "[job@" + AbstractC0165z.g(j()) + ']';
    }
}
