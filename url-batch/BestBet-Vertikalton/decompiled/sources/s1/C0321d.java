package s1;

import d1.InterfaceC0096d;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: s1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0321d extends AbstractC0340x implements b1.d, InterfaceC0096d {

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f4037f = AtomicIntegerFieldUpdater.newUpdater(C0321d.class, "_decisionAndIndex");

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4038g = AtomicReferenceFieldUpdater.newUpdater(C0321d.class, Object.class, "_state");
    public static final AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(C0321d.class, Object.class, "_parentHandle");
    private volatile int _decisionAndIndex;
    private volatile Object _parentHandle;
    private volatile Object _state;
    public final b1.d d;

    /* renamed from: e, reason: collision with root package name */
    public final b1.j f4039e;

    public C0321d(b1.d dVar) {
        super(1);
        this.d = dVar;
        this.f4039e = dVar.h();
        this._decisionAndIndex = 536870911;
        this._state = C0319b.f4035a;
    }

    public static void o(K k2, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + k2 + ", already has " + obj).toString());
    }

    @Override // s1.AbstractC0340x
    public final void a(Object obj, CancellationException cancellationException) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4038g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof X) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof C0327j) {
                return;
            }
            if (!(obj2 instanceof C0326i)) {
                C0326i c0326i = new C0326i(obj2, (K) null, (j1.l) null, cancellationException, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c0326i)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                return;
            }
            C0326i c0326i2 = (C0326i) obj2;
            if (c0326i2.f4049e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            C0326i a2 = C0326i.a(c0326i2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, a2)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            K k2 = c0326i2.f4047b;
            if (k2 != null) {
                j(k2, cancellationException);
            }
            j1.l lVar = c0326i2.f4048c;
            if (lVar != null) {
                try {
                    lVar.g(cancellationException);
                    return;
                } catch (Throwable th) {
                    AbstractC0335s.d(this.f4039e, new X0.b("Exception in resume onCancellation handler for " + this, th));
                    return;
                }
            }
            return;
        }
    }

    @Override // b1.d
    public final void b(Object obj) {
        Object obj2;
        Throwable a2 = X0.e.a(obj);
        if (a2 != null) {
            obj = new C0327j(a2, false);
        }
        int i = this.f4071c;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4038g;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof X)) {
                if (obj3 instanceof C0322e) {
                    C0322e c0322e = (C0322e) obj3;
                    c0322e.getClass();
                    if (C0322e.f4041c.compareAndSet(c0322e, 0, 1)) {
                        return;
                    }
                }
                throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
            }
            X x2 = (X) obj3;
            if (!(obj instanceof C0327j) && AbstractC0335s.f(i) && (x2 instanceof K)) {
                obj2 = new C0326i(obj, x2 instanceof K ? (K) x2 : null, (j1.l) null, (CancellationException) null, 16);
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
                InterfaceC0342z interfaceC0342z = (InterfaceC0342z) atomicReferenceFieldUpdater2.get(this);
                if (interfaceC0342z != null) {
                    interfaceC0342z.e();
                    atomicReferenceFieldUpdater2.set(this, W.f4032a);
                }
            }
            l(i);
            return;
        }
    }

    @Override // s1.AbstractC0340x
    public final b1.d c() {
        return this.d;
    }

    @Override // s1.AbstractC0340x
    public final Throwable d(Object obj) {
        Throwable d = super.d(obj);
        if (d != null) {
            return d;
        }
        return null;
    }

    @Override // d1.InterfaceC0096d
    public final InterfaceC0096d e() {
        b1.d dVar = this.d;
        if (dVar instanceof InterfaceC0096d) {
            return (InterfaceC0096d) dVar;
        }
        return null;
    }

    @Override // s1.AbstractC0340x
    public final Object f(Object obj) {
        return obj instanceof C0326i ? ((C0326i) obj).f4046a : obj;
    }

    @Override // b1.d
    public final b1.j h() {
        return this.f4039e;
    }

    @Override // s1.AbstractC0340x
    public final Object i() {
        return f4038g.get(this);
    }

    public final void j(K k2, Throwable th) {
        try {
            k2.a(th);
        } catch (Throwable th2) {
            AbstractC0335s.d(this.f4039e, new X0.b("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void k(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4038g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof X) {
                C0322e c0322e = new C0322e(this, th, obj instanceof K);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0322e)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                if (((X) obj) instanceof K) {
                    j((K) obj, th);
                }
                if (!n()) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = h;
                    InterfaceC0342z interfaceC0342z = (InterfaceC0342z) atomicReferenceFieldUpdater2.get(this);
                    if (interfaceC0342z != null) {
                        interfaceC0342z.e();
                        atomicReferenceFieldUpdater2.set(this, W.f4032a);
                    }
                }
                l(this.f4071c);
                return;
            }
            return;
        }
    }

    public final void l(int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = f4037f;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z2 = i == 4;
                b1.d dVar = this.d;
                if (z2 || !(dVar instanceof w1.f) || AbstractC0335s.f(i) != AbstractC0335s.f(this.f4071c)) {
                    AbstractC0335s.i(this, dVar, z2);
                    return;
                }
                AbstractC0332o abstractC0332o = ((w1.f) dVar).d;
                b1.j jVar = ((w1.f) dVar).f4496e.f2474b;
                k1.e.b(jVar);
                if (abstractC0332o.s()) {
                    abstractC0332o.r(jVar, this);
                    return;
                }
                D a2 = c0.a();
                if (a2.f4011c >= 4294967296L) {
                    Y0.h hVar = a2.f4012e;
                    if (hVar == null) {
                        hVar = new Y0.h();
                        a2.f4012e = hVar;
                    }
                    hVar.addLast(this);
                    return;
                }
                a2.v(true);
                try {
                    AbstractC0335s.i(this, dVar, true);
                    do {
                    } while (a2.w());
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

    public final InterfaceC0342z m() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        M m2 = (M) this.f4039e.p(C0333p.f4061b);
        if (m2 == null) {
            return null;
        }
        InterfaceC0342z e2 = AbstractC0335s.e(m2, true, new C0323f(this), 2);
        do {
            atomicReferenceFieldUpdater = h;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, e2)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return e2;
    }

    public final boolean n() {
        if (this.f4071c == 2) {
            b1.d dVar = this.d;
            k1.e.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (w1.f.h.get((w1.f) dVar) != null) {
                return true;
            }
        }
        return false;
    }

    public final void p() {
        b1.d dVar = this.d;
        Throwable th = null;
        w1.f fVar = dVar instanceof w1.f ? (w1.f) dVar : null;
        if (fVar != null) {
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = w1.f.h;
                Object obj = atomicReferenceFieldUpdater.get(fVar);
                U.q qVar = w1.a.f4490c;
                if (obj == qVar) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(fVar, qVar, this)) {
                        if (atomicReferenceFieldUpdater.get(fVar) != qVar) {
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
            InterfaceC0342z interfaceC0342z = (InterfaceC0342z) atomicReferenceFieldUpdater2.get(this);
            if (interfaceC0342z != null) {
                interfaceC0342z.e();
                atomicReferenceFieldUpdater2.set(this, W.f4032a);
            }
            k(th);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CancellableContinuation(");
        sb.append(AbstractC0335s.j(this.d));
        sb.append("){");
        Object obj = f4038g.get(this);
        sb.append(obj instanceof X ? "Active" : obj instanceof C0322e ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(AbstractC0335s.c(this));
        return sb.toString();
    }
}
