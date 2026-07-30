package k1;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public abstract class m0 extends p1.l implements z, g0, c1.l {

    /* renamed from: e, reason: collision with root package name */
    public q0 f695e;

    @Override // k1.z
    public final void b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        q0 n2 = n();
        while (true) {
            Object x2 = n2.x();
            if (x2 instanceof m0) {
                if (x2 != this) {
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = q0.f714b;
                a0 a0Var = t.f725i;
                while (!atomicReferenceFieldUpdater2.compareAndSet(n2, x2, a0Var)) {
                    if (atomicReferenceFieldUpdater2.get(n2) != x2) {
                        break;
                    }
                }
                return;
            }
            if (!(x2 instanceof g0) || ((g0) x2).e() == null) {
                return;
            }
            while (true) {
                Object k2 = k();
                if (k2 instanceof p1.r) {
                    return;
                }
                if (k2 == this) {
                    return;
                }
                k2.getClass();
                p1.l lVar = (p1.l) k2;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = p1.l.f1061d;
                p1.r rVar = (p1.r) atomicReferenceFieldUpdater3.get(lVar);
                if (rVar == null) {
                    rVar = new p1.r(lVar);
                    atomicReferenceFieldUpdater3.lazySet(lVar, rVar);
                }
                do {
                    atomicReferenceFieldUpdater = p1.l.f1059b;
                    if (atomicReferenceFieldUpdater.compareAndSet(this, k2, rVar)) {
                        lVar.i();
                        return;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == k2);
            }
        }
    }

    @Override // k1.g0
    public final r0 e() {
        return null;
    }

    @Override // k1.g0
    public final boolean f() {
        return true;
    }

    public final q0 n() {
        q0 q0Var = this.f695e;
        if (q0Var != null) {
            return q0Var;
        }
        c0.c cVar = new c0.c("lateinit property job has not been initialized");
        d1.h.b(cVar, d1.h.class.getName());
        throw cVar;
    }

    public abstract void o(Throwable th);

    @Override // p1.l
    public final String toString() {
        return getClass().getSimpleName() + '@' + t.a(this) + "[job@" + t.a(n()) + ']';
    }
}
