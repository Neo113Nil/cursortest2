package D4;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public abstract class b0 extends I4.k implements G, U, InterfaceC1441l {

    /* renamed from: d, reason: collision with root package name */
    public g0 f489d;

    @Override // D4.U
    public final boolean a() {
        return true;
    }

    @Override // D4.G
    public final void b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2;
        g0 j2 = j();
        while (true) {
            Object D5 = j2.D();
            if (D5 instanceof b0) {
                if (D5 != this) {
                    return;
                }
                I i2 = AbstractC0024y.f557j;
                do {
                    atomicReferenceFieldUpdater2 = g0.f513a;
                    if (atomicReferenceFieldUpdater2.compareAndSet(j2, D5, i2)) {
                        return;
                    }
                } while (atomicReferenceFieldUpdater2.get(j2) == D5);
            } else {
                if (!(D5 instanceof U) || ((U) D5).d() == null) {
                    return;
                }
                while (true) {
                    Object g6 = g();
                    if (g6 instanceof I4.r) {
                        I4.k kVar = ((I4.r) g6).f1320a;
                        return;
                    }
                    if (g6 == this) {
                        return;
                    }
                    kotlin.jvm.internal.i.c(g6, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                    I4.k kVar2 = (I4.k) g6;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = I4.k.f1306c;
                    I4.r rVar = (I4.r) atomicReferenceFieldUpdater3.get(kVar2);
                    if (rVar == null) {
                        rVar = new I4.r(kVar2);
                        atomicReferenceFieldUpdater3.lazySet(kVar2, rVar);
                    }
                    do {
                        atomicReferenceFieldUpdater = I4.k.f1304a;
                        if (atomicReferenceFieldUpdater.compareAndSet(this, g6, rVar)) {
                            kVar2.e();
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == g6);
                }
            }
        }
    }

    @Override // D4.U
    public final i0 d() {
        return null;
    }

    public X getParent() {
        return j();
    }

    public final g0 j() {
        g0 g0Var = this.f489d;
        if (g0Var != null) {
            return g0Var;
        }
        kotlin.jvm.internal.i.l("job");
        throw null;
    }

    public abstract void k(Throwable th);

    @Override // I4.k
    public final String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0024y.h(this) + "[job@" + AbstractC0024y.h(j()) + ']';
    }
}
