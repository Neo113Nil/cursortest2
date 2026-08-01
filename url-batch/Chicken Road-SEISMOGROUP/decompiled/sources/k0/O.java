package k0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class O extends p0.l implements InterfaceC0064z, H, d0.l {

    /* renamed from: e, reason: collision with root package name */
    public T f890e;

    @Override // k0.H
    public final boolean b() {
        return true;
    }

    @Override // k0.H
    public final U c() {
        return null;
    }

    @Override // k0.InterfaceC0064z
    public final void d() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2;
        T n2 = n();
        while (true) {
            Object y2 = n2.y();
            if (y2 instanceof O) {
                if (y2 != this) {
                    return;
                }
                A a2 = AbstractC0058t.f945i;
                do {
                    atomicReferenceFieldUpdater2 = T.f903b;
                    if (atomicReferenceFieldUpdater2.compareAndSet(n2, y2, a2)) {
                        return;
                    }
                } while (atomicReferenceFieldUpdater2.get(n2) == y2);
            } else {
                if (!(y2 instanceof H) || ((H) y2).c() == null) {
                    return;
                }
                while (true) {
                    Object k2 = k();
                    if (k2 instanceof p0.s) {
                        p0.l lVar = ((p0.s) k2).f1176a;
                        return;
                    }
                    if (k2 == this) {
                        return;
                    }
                    e0.h.c(k2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                    p0.l lVar2 = (p0.l) k2;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = p0.l.f1162d;
                    p0.s sVar = (p0.s) atomicReferenceFieldUpdater3.get(lVar2);
                    if (sVar == null) {
                        sVar = new p0.s(lVar2);
                        atomicReferenceFieldUpdater3.lazySet(lVar2, sVar);
                    }
                    do {
                        atomicReferenceFieldUpdater = p0.l.f1160b;
                        if (atomicReferenceFieldUpdater.compareAndSet(this, k2, sVar)) {
                            lVar2.i();
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == k2);
                }
            }
        }
    }

    public final T n() {
        T t = this.f890e;
        if (t != null) {
            return t;
        }
        A.c cVar = new A.c("lateinit property job has not been initialized");
        e0.h.f(cVar, e0.h.class.getName());
        throw cVar;
    }

    public abstract void o(Throwable th);

    @Override // p0.l
    public final String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0058t.a(this) + "[job@" + AbstractC0058t.a(n()) + ']';
    }
}
