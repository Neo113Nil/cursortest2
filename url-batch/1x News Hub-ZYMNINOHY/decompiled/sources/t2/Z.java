package t2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class Z extends y2.k implements Q, E, N {

    /* renamed from: d, reason: collision with root package name */
    public e0 f10395d;

    @Override // t2.N
    public final boolean a() {
        return true;
    }

    @Override // t2.N
    public final f0 d() {
        return null;
    }

    @Override // t2.E
    public final void dispose() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2;
        e0 j3 = j();
        while (true) {
            Object D3 = j3.D();
            if (D3 instanceof Z) {
                if (D3 != this) {
                    return;
                }
                G g3 = AbstractC1212w.f10452i;
                do {
                    atomicReferenceFieldUpdater2 = e0.f10413a;
                    if (atomicReferenceFieldUpdater2.compareAndSet(j3, D3, g3)) {
                        return;
                    }
                } while (atomicReferenceFieldUpdater2.get(j3) == D3);
            } else {
                if (!(D3 instanceof N) || ((N) D3).d() == null) {
                    return;
                }
                while (true) {
                    Object g4 = g();
                    if (g4 instanceof y2.q) {
                        y2.k kVar = ((y2.q) g4).f10863a;
                        return;
                    }
                    if (g4 == this) {
                        return;
                    }
                    kotlin.jvm.internal.j.c(g4, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                    y2.k kVar2 = (y2.k) g4;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = y2.k.f10853c;
                    y2.q qVar = (y2.q) atomicReferenceFieldUpdater3.get(kVar2);
                    if (qVar == null) {
                        qVar = new y2.q(kVar2);
                        atomicReferenceFieldUpdater3.set(kVar2, qVar);
                    }
                    do {
                        atomicReferenceFieldUpdater = y2.k.f10851a;
                        if (atomicReferenceFieldUpdater.compareAndSet(this, g4, qVar)) {
                            kVar2.e();
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == g4);
                }
            }
        }
    }

    public U getParent() {
        return j();
    }

    public final e0 j() {
        e0 e0Var = this.f10395d;
        if (e0Var != null) {
            return e0Var;
        }
        kotlin.jvm.internal.j.g("job");
        throw null;
    }

    @Override // y2.k
    public final String toString() {
        return getClass().getSimpleName() + '@' + AbstractC1212w.c(this) + "[job@" + AbstractC1212w.c(j()) + ']';
    }
}
