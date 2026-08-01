package o1;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: o1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0285d extends AbstractC0304x implements X0.d, Z0.b {

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f3334f = AtomicIntegerFieldUpdater.newUpdater(C0285d.class, "_decisionAndIndex");

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f3335g = AtomicReferenceFieldUpdater.newUpdater(C0285d.class, Object.class, "_state");
    public static final AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(C0285d.class, Object.class, "_parentHandle");
    private volatile int _decisionAndIndex;
    private volatile Object _parentHandle;
    private volatile Object _state;
    public final X0.d d;

    /* renamed from: e, reason: collision with root package name */
    public final X0.i f3336e;

    public C0285d(X0.d dVar) {
        super(1);
        this.d = dVar;
        this.f3336e = dVar.h();
        this._decisionAndIndex = 536870911;
        this._state = C0283b.f3332a;
    }

    public static void o(K k2, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + k2 + ", already has " + obj).toString());
    }

    @Override // o1.AbstractC0304x
    public final void a(Object obj, CancellationException cancellationException) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3335g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof X) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof C0291j) {
                return;
            }
            if (!(obj2 instanceof C0290i)) {
                C0290i c0290i = new C0290i(obj2, (K) null, (f1.l) null, cancellationException, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c0290i)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                return;
            }
            C0290i c0290i2 = (C0290i) obj2;
            if (c0290i2.f3346e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            C0290i a2 = C0290i.a(c0290i2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, a2)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            K k2 = c0290i2.f3344b;
            if (k2 != null) {
                j(k2, cancellationException);
            }
            f1.l lVar = c0290i2.f3345c;
            if (lVar != null) {
                try {
                    lVar.g(cancellationException);
                    return;
                } catch (Throwable th) {
                    AbstractC0299s.e(this.f3336e, new U0.c("Exception in resume onCancellation handler for " + this, th));
                    return;
                }
            }
            return;
        }
    }

    @Override // X0.d
    public final void b(Object obj) {
        Object obj2;
        Throwable a2 = U0.f.a(obj);
        if (a2 != null) {
            obj = new C0291j(a2, false);
        }
        int i = this.f3368c;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3335g;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof X)) {
                if (obj3 instanceof C0286e) {
                    C0286e c0286e = (C0286e) obj3;
                    c0286e.getClass();
                    if (C0286e.f3338c.compareAndSet(c0286e, 0, 1)) {
                        return;
                    }
                }
                throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
            }
            X x2 = (X) obj3;
            if (!(obj instanceof C0291j) && AbstractC0299s.g(i) && (x2 instanceof K)) {
                obj2 = new C0290i(obj, x2 instanceof K ? (K) x2 : null, (f1.l) null, (CancellationException) null, 16);
            } else {
                obj2 = obj;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, obj2)) {
                if (atomicReferenceFieldUpdater.get(this) != obj3) {
                    break;
                }
            }
            if (!n()) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = h;
                InterfaceC0306z interfaceC0306z = (InterfaceC0306z) atomicReferenceFieldUpdater2.get(this);
                if (interfaceC0306z != null) {
                    interfaceC0306z.e();
                    atomicReferenceFieldUpdater2.set(this, W.f3329a);
                }
            }
            l(i);
            return;
        }
    }

    @Override // o1.AbstractC0304x
    public final X0.d c() {
        return this.d;
    }

    @Override // o1.AbstractC0304x
    public final Throwable d(Object obj) {
        Throwable d = super.d(obj);
        if (d != null) {
            return d;
        }
        return null;
    }

    @Override // Z0.b
    public final Z0.b e() {
        X0.d dVar = this.d;
        if (dVar instanceof Z0.b) {
            return (Z0.b) dVar;
        }
        return null;
    }

    @Override // o1.AbstractC0304x
    public final Object f(Object obj) {
        return obj instanceof C0290i ? ((C0290i) obj).f3343a : obj;
    }

    @Override // X0.d
    public final X0.i h() {
        return this.f3336e;
    }

    @Override // o1.AbstractC0304x
    public final Object i() {
        return f3335g.get(this);
    }

    public final void j(K k2, Throwable th) {
        try {
            k2.a(th);
        } catch (Throwable th2) {
            AbstractC0299s.e(this.f3336e, new U0.c("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void k(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3335g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof X) {
                C0286e c0286e = new C0286e(this, th, obj instanceof K);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0286e)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                if (((X) obj) instanceof K) {
                    j((K) obj, th);
                }
                if (!n()) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = h;
                    InterfaceC0306z interfaceC0306z = (InterfaceC0306z) atomicReferenceFieldUpdater2.get(this);
                    if (interfaceC0306z != null) {
                        interfaceC0306z.e();
                        atomicReferenceFieldUpdater2.set(this, W.f3329a);
                    }
                }
                l(this.f3368c);
                return;
            }
            return;
        }
    }

    public final void l(int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = f3334f;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z2 = i == 4;
                X0.d dVar = this.d;
                if (z2 || !(dVar instanceof s1.f) || AbstractC0299s.g(i) != AbstractC0299s.g(this.f3368c)) {
                    AbstractC0299s.j(this, dVar, z2);
                    return;
                }
                AbstractC0296o abstractC0296o = ((s1.f) dVar).d;
                X0.i iVar = ((s1.f) dVar).f3647e.f1173b;
                g1.f.b(iVar);
                if (abstractC0296o.z()) {
                    abstractC0296o.y(iVar, this);
                    return;
                }
                D a2 = c0.a();
                if (a2.f3308c >= 4294967296L) {
                    V0.c cVar = a2.f3309e;
                    if (cVar == null) {
                        cVar = new V0.c();
                        a2.f3309e = cVar;
                    }
                    cVar.addLast(this);
                    return;
                }
                a2.C(true);
                try {
                    AbstractC0299s.j(this, dVar, true);
                    do {
                    } while (a2.D());
                } finally {
                    try {
                        return;
                    } finally {
                    }
                }
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1073741824 + (536870911 & i2)));
    }

    public final InterfaceC0306z m() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        M m2 = (M) this.f3336e.j(C0297p.f3358b);
        if (m2 == null) {
            return null;
        }
        InterfaceC0306z f2 = AbstractC0299s.f(m2, true, new C0287f(this), 2);
        do {
            atomicReferenceFieldUpdater = h;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, f2)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return f2;
    }

    public final boolean n() {
        if (this.f3368c == 2) {
            X0.d dVar = this.d;
            g1.f.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (s1.f.h.get((s1.f) dVar) != null) {
                return true;
            }
        }
        return false;
    }

    public final void p() {
        X0.d dVar = this.d;
        Throwable th = null;
        s1.f fVar = dVar instanceof s1.f ? (s1.f) dVar : null;
        if (fVar != null) {
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = s1.f.h;
                Object obj = atomicReferenceFieldUpdater.get(fVar);
                T.r rVar = s1.a.f3641c;
                if (obj == rVar) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(fVar, rVar, this)) {
                        if (atomicReferenceFieldUpdater.get(fVar) != rVar) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th = (Throwable) obj;
                }
            }
            if (th == null) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = h;
            InterfaceC0306z interfaceC0306z = (InterfaceC0306z) atomicReferenceFieldUpdater2.get(this);
            if (interfaceC0306z != null) {
                interfaceC0306z.e();
                atomicReferenceFieldUpdater2.set(this, W.f3329a);
            }
            k(th);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CancellableContinuation(");
        sb.append(AbstractC0299s.k(this.d));
        sb.append("){");
        Object obj = f3335g.get(this);
        sb.append(obj instanceof X ? "Active" : obj instanceof C0286e ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(AbstractC0299s.d(this));
        return sb.toString();
    }
}
