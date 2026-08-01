package r1;

import i1.InterfaceC0192l;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class Q extends w1.j implements A, J, InterfaceC0192l {

    /* renamed from: d, reason: collision with root package name */
    public V f4049d;

    @Override // r1.J
    public final boolean a() {
        return true;
    }

    @Override // r1.J
    public final W b() {
        return null;
    }

    @Override // r1.A
    public final void e() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2;
        V n2 = n();
        while (true) {
            Object s2 = n2.s();
            if (s2 instanceof Q) {
                if (s2 != this) {
                    return;
                }
                B b2 = AbstractC0369t.i;
                do {
                    atomicReferenceFieldUpdater2 = V.f4060a;
                    if (atomicReferenceFieldUpdater2.compareAndSet(n2, s2, b2)) {
                        return;
                    }
                } while (atomicReferenceFieldUpdater2.get(n2) == s2);
            } else {
                if (!(s2 instanceof J) || ((J) s2).b() == null) {
                    return;
                }
                while (true) {
                    Object k2 = k();
                    if (k2 instanceof w1.q) {
                        w1.j jVar = ((w1.q) k2).f4497a;
                        return;
                    }
                    if (k2 == this) {
                        return;
                    }
                    j1.h.c(k2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                    w1.j jVar2 = (w1.j) k2;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = w1.j.f4484c;
                    w1.q qVar = (w1.q) atomicReferenceFieldUpdater3.get(jVar2);
                    if (qVar == null) {
                        qVar = new w1.q(jVar2);
                        atomicReferenceFieldUpdater3.lazySet(jVar2, qVar);
                    }
                    do {
                        atomicReferenceFieldUpdater = w1.j.f4482a;
                        if (atomicReferenceFieldUpdater.compareAndSet(this, k2, qVar)) {
                            jVar2.i();
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == k2);
                }
            }
        }
    }

    public N getParent() {
        return n();
    }

    public final V n() {
        V v2 = this.f4049d;
        if (v2 != null) {
            return v2;
        }
        j1.h.h("job");
        throw null;
    }

    public abstract void o(Throwable th);

    @Override // w1.j
    public final String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0369t.c(this) + "[job@" + AbstractC0369t.c(n()) + ']';
    }
}
