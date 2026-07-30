package O7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public abstract class c0 extends T7.k implements H, V, E7.l {

    /* renamed from: w, reason: collision with root package name */
    public h0 f2583w;

    @Override // O7.H
    public final void b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2;
        h0 h9 = h();
        while (true) {
            Object C7 = h9.C();
            if (C7 instanceof c0) {
                if (C7 != this) {
                    return;
                }
                J j9 = AbstractC0399y.f2651j;
                do {
                    atomicReferenceFieldUpdater2 = h0.f2606n;
                    if (atomicReferenceFieldUpdater2.compareAndSet(h9, C7, j9)) {
                        return;
                    }
                } while (atomicReferenceFieldUpdater2.get(h9) == C7);
            } else {
                if (!(C7 instanceof V) || ((V) C7).k() == null) {
                    return;
                }
                while (true) {
                    Object e6 = e();
                    if (e6 instanceof T7.q) {
                        T7.k kVar = ((T7.q) e6).f3163a;
                        return;
                    }
                    if (e6 == this) {
                        return;
                    }
                    kotlin.jvm.internal.h.c(e6, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                    T7.k kVar2 = (T7.k) e6;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = T7.k.f3152v;
                    T7.q qVar = (T7.q) atomicReferenceFieldUpdater3.get(kVar2);
                    if (qVar == null) {
                        qVar = new T7.q(kVar2);
                        atomicReferenceFieldUpdater3.set(kVar2, qVar);
                    }
                    do {
                        atomicReferenceFieldUpdater = T7.k.f3150n;
                        if (atomicReferenceFieldUpdater.compareAndSet(this, e6, qVar)) {
                            kVar2.c();
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == e6);
                }
            }
        }
    }

    public Y getParent() {
        return h();
    }

    public final h0 h() {
        h0 h0Var = this.f2583w;
        if (h0Var != null) {
            return h0Var;
        }
        kotlin.jvm.internal.h.k("job");
        throw null;
    }

    public abstract void i(Throwable th);

    @Override // O7.V
    public final boolean j() {
        return true;
    }

    @Override // O7.V
    public final k0 k() {
        return null;
    }

    @Override // T7.k
    public final String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0399y.j(this) + "[job@" + AbstractC0399y.j(h()) + ']';
    }
}
