package Y0;

import d1.AbstractC0184a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: Y0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0112f extends A implements InterfaceC0111e, J0.c, l0 {

    /* renamed from: j, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1201j = AtomicIntegerFieldUpdater.newUpdater(C0112f.class, "_decisionAndIndex");

    /* renamed from: k, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1202k = AtomicReferenceFieldUpdater.newUpdater(C0112f.class, Object.class, "_state");

    /* renamed from: l, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1203l = AtomicReferenceFieldUpdater.newUpdater(C0112f.class, Object.class, "_parentHandle");
    private volatile int _decisionAndIndex;
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* renamed from: h, reason: collision with root package name */
    public final H0.d f1204h;

    /* renamed from: i, reason: collision with root package name */
    public final H0.i f1205i;

    public C0112f(int i2, H0.d dVar) {
        super(i2);
        this.f1204h = dVar;
        this.f1205i = dVar.f();
        this._decisionAndIndex = 536870911;
        this._state = C0108b.f1196e;
    }

    public static Object D(c0 c0Var, Object obj, int i2, P0.l lVar) {
        if ((obj instanceof C0120n) || !AbstractC0127v.f(i2)) {
            return obj;
        }
        if (lVar != null || (c0Var instanceof D)) {
            return new C0119m(obj, c0Var instanceof D ? (D) c0Var : null, lVar, (CancellationException) null, 16);
        }
        return obj;
    }

    public static void z(c0 c0Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + c0Var + ", already has " + obj).toString());
    }

    public String A() {
        return "CancellableContinuation";
    }

    public final void B() {
        H0.d dVar = this.f1204h;
        Throwable th = null;
        d1.h hVar = dVar instanceof d1.h ? (d1.h) dVar : null;
        if (hVar != null) {
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d1.h.f2075l;
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                B.m mVar = AbstractC0184a.f2065d;
                if (obj == mVar) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, mVar, this)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != mVar) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th = (Throwable) obj;
                }
            }
            if (th == null) {
                return;
            }
            r();
            q(th);
        }
    }

    public final void C(Object obj, int i2, P0.l lVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1202k;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof c0) {
                Object D2 = D((c0) obj2, obj, i2, lVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, D2)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!y()) {
                    r();
                }
                s(i2);
                return;
            }
            if (obj2 instanceof C0113g) {
                C0113g c0113g = (C0113g) obj2;
                c0113g.getClass();
                if (C0113g.f1206c.compareAndSet(c0113g, 0, 1)) {
                    if (lVar != null) {
                        m(lVar, c0113g.f1219a);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    @Override // Y0.l0
    public final void a(d1.v vVar, int i2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        do {
            atomicIntegerFieldUpdater = f1201j;
            i3 = atomicIntegerFieldUpdater.get(this);
            if ((i3 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, ((i3 >> 29) << 29) + i2));
        x(vVar);
    }

    @Override // Y0.A
    public final void b(Object obj, CancellationException cancellationException) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1202k;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof c0) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof C0120n) {
                return;
            }
            if (!(obj2 instanceof C0119m)) {
                C0119m c0119m = new C0119m(obj2, (D) null, (P0.l) null, cancellationException, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c0119m)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                return;
            }
            C0119m c0119m2 = (C0119m) obj2;
            if (c0119m2.f1217e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            C0119m a2 = C0119m.a(c0119m2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, a2)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            D d2 = c0119m2.f1214b;
            if (d2 != null) {
                l(d2, cancellationException);
            }
            P0.l lVar = c0119m2.f1215c;
            if (lVar != null) {
                m(lVar, cancellationException);
                return;
            }
            return;
        }
    }

    @Override // Y0.InterfaceC0111e
    public final B.m c(Object obj, P0.l lVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1202k;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            boolean z2 = obj2 instanceof c0;
            B.m mVar = AbstractC0127v.f1231a;
            if (!z2) {
                boolean z3 = obj2 instanceof C0119m;
                return null;
            }
            Object D2 = D((c0) obj2, obj, this.f1158g, lVar);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, D2)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (y()) {
                return mVar;
            }
            r();
            return mVar;
        }
    }

    @Override // Y0.A
    public final H0.d d() {
        return this.f1204h;
    }

    @Override // J0.c
    public final J0.c e() {
        H0.d dVar = this.f1204h;
        if (dVar instanceof J0.c) {
            return (J0.c) dVar;
        }
        return null;
    }

    @Override // H0.d
    public final H0.i f() {
        return this.f1205i;
    }

    @Override // Y0.A
    public final Throwable g(Object obj) {
        Throwable g2 = super.g(obj);
        if (g2 != null) {
            return g2;
        }
        return null;
    }

    @Override // Y0.A
    public final Object h(Object obj) {
        return obj instanceof C0119m ? ((C0119m) obj).f1213a : obj;
    }

    @Override // H0.d
    public final void j(Object obj) {
        Throwable a2 = F0.e.a(obj);
        if (a2 != null) {
            obj = new C0120n(a2, false);
        }
        C(obj, this.f1158g, null);
    }

    @Override // Y0.A
    public final Object k() {
        return f1202k.get(this);
    }

    public final void l(D d2, Throwable th) {
        try {
            d2.a(th);
        } catch (Throwable th2) {
            AbstractC0127v.d(this.f1205i, new F0.b("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void m(P0.l lVar, Throwable th) {
        try {
            lVar.i(th);
        } catch (Throwable th2) {
            AbstractC0127v.d(this.f1205i, new F0.b("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    @Override // Y0.InterfaceC0111e
    public final void n(Object obj) {
        s(this.f1158g);
    }

    @Override // Y0.InterfaceC0111e
    public final void o(Object obj, P0.l lVar) {
        C(obj, this.f1158g, lVar);
    }

    public final void p(d1.v vVar, Throwable th) {
        H0.i iVar = this.f1205i;
        int i2 = f1201j.get(this) & 536870911;
        if (i2 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            vVar.g(i2, iVar);
        } catch (Throwable th2) {
            AbstractC0127v.d(iVar, new F0.b("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void q(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1202k;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof c0) {
                C0113g c0113g = new C0113g(this, th, (obj instanceof D) || (obj instanceof d1.v));
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0113g)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                c0 c0Var = (c0) obj;
                if (c0Var instanceof D) {
                    l((D) obj, th);
                } else if (c0Var instanceof d1.v) {
                    p((d1.v) obj, th);
                }
                if (!y()) {
                    r();
                }
                s(this.f1158g);
                return;
            }
            return;
        }
    }

    public final void r() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1203l;
        C c2 = (C) atomicReferenceFieldUpdater.get(this);
        if (c2 == null) {
            return;
        }
        c2.a();
        atomicReferenceFieldUpdater.set(this, b0.f1197e);
    }

    public final void s(int i2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        do {
            atomicIntegerFieldUpdater = f1201j;
            i3 = atomicIntegerFieldUpdater.get(this);
            int i4 = i3 >> 29;
            if (i4 != 0) {
                if (i4 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z2 = i2 == 4;
                H0.d dVar = this.f1204h;
                if (z2 || !(dVar instanceof d1.h) || AbstractC0127v.f(i2) != AbstractC0127v.f(this.f1158g)) {
                    AbstractC0127v.i(this, dVar, z2);
                    return;
                }
                AbstractC0124s abstractC0124s = ((d1.h) dVar).f2076h;
                H0.i f2 = ((d1.h) dVar).f2077i.f();
                if (abstractC0124s.e()) {
                    abstractC0124s.c(f2, this);
                    return;
                }
                H a2 = h0.a();
                if (a2.f1167g >= 4294967296L) {
                    G0.b bVar = a2.f1169i;
                    if (bVar == null) {
                        bVar = new G0.b();
                        a2.f1169i = bVar;
                    }
                    bVar.addLast(this);
                    return;
                }
                a2.h(true);
                try {
                    AbstractC0127v.i(this, dVar, true);
                    do {
                    } while (a2.l());
                } finally {
                    try {
                        return;
                    } finally {
                    }
                }
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, 1073741824 + (536870911 & i3)));
    }

    public Throwable t(Z z2) {
        return z2.A();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(A());
        sb.append('(');
        sb.append(AbstractC0127v.k(this.f1204h));
        sb.append("){");
        Object obj = f1202k.get(this);
        sb.append(obj instanceof c0 ? "Active" : obj instanceof C0113g ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(AbstractC0127v.b(this));
        return sb.toString();
    }

    public final Object u() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        boolean y2 = y();
        do {
            atomicIntegerFieldUpdater = f1201j;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (y2) {
                    B();
                }
                Object obj = f1202k.get(this);
                if (obj instanceof C0120n) {
                    throw ((C0120n) obj).f1219a;
                }
                if (AbstractC0127v.f(this.f1158g)) {
                    P p2 = (P) this.f1205i.k(C0125t.f1230f);
                    if (p2 != null && !p2.b()) {
                        CancellationException A2 = ((Z) p2).A();
                        b(obj, A2);
                        throw A2;
                    }
                }
                return h(obj);
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 536870912 + (536870911 & i2)));
        if (((C) f1203l.get(this)) == null) {
            w();
        }
        if (y2) {
            B();
        }
        return I0.a.f733e;
    }

    public final void v() {
        C w2 = w();
        if (w2 == null || (f1202k.get(this) instanceof c0)) {
            return;
        }
        w2.a();
        f1203l.set(this, b0.f1197e);
    }

    public final C w() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        P p2 = (P) this.f1205i.k(C0125t.f1230f);
        if (p2 == null) {
            return null;
        }
        C e2 = AbstractC0127v.e(p2, true, new C0114h(this), 2);
        do {
            atomicReferenceFieldUpdater = f1203l;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, e2)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return e2;
    }

    public final void x(c0 c0Var) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1202k;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C0108b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            if (obj instanceof D ? true : obj instanceof d1.v) {
                z(c0Var, obj);
                throw null;
            }
            if (obj instanceof C0120n) {
                C0120n c0120n = (C0120n) obj;
                c0120n.getClass();
                if (!C0120n.f1218b.compareAndSet(c0120n, 0, 1)) {
                    z(c0Var, obj);
                    throw null;
                }
                if (obj instanceof C0113g) {
                    if (!(obj instanceof C0120n)) {
                        c0120n = null;
                    }
                    Throwable th = c0120n != null ? c0120n.f1219a : null;
                    if (c0Var instanceof D) {
                        l((D) c0Var, th);
                        return;
                    } else {
                        Q0.h.c(c0Var, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                        p((d1.v) c0Var, th);
                        return;
                    }
                }
                return;
            }
            if (!(obj instanceof C0119m)) {
                if (c0Var instanceof d1.v) {
                    return;
                }
                Q0.h.c(c0Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                C0119m c0119m = new C0119m(obj, (D) c0Var, (P0.l) null, (CancellationException) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0119m)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            C0119m c0119m2 = (C0119m) obj;
            if (c0119m2.f1214b != null) {
                z(c0Var, obj);
                throw null;
            }
            if (c0Var instanceof d1.v) {
                return;
            }
            Q0.h.c(c0Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
            D d2 = (D) c0Var;
            Throwable th2 = c0119m2.f1217e;
            if (th2 != null) {
                l(d2, th2);
                return;
            }
            C0119m a2 = C0119m.a(c0119m2, d2, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a2)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            return;
        }
    }

    public final boolean y() {
        if (this.f1158g == 2) {
            H0.d dVar = this.f1204h;
            Q0.h.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (d1.h.f2075l.get((d1.h) dVar) != null) {
                return true;
            }
        }
        return false;
    }
}
