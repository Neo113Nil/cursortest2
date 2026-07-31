package W0;

import b1.AbstractC0115a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: W0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0066f extends A implements InterfaceC0065e, I0.c, l0 {

    /* renamed from: j, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f947j = AtomicIntegerFieldUpdater.newUpdater(C0066f.class, "_decisionAndIndex");

    /* renamed from: k, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f948k = AtomicReferenceFieldUpdater.newUpdater(C0066f.class, Object.class, "_state");

    /* renamed from: l, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f949l = AtomicReferenceFieldUpdater.newUpdater(C0066f.class, Object.class, "_parentHandle");
    private volatile int _decisionAndIndex;
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* renamed from: h, reason: collision with root package name */
    public final G0.d f950h;

    /* renamed from: i, reason: collision with root package name */
    public final G0.i f951i;

    public C0066f(int i2, G0.d dVar) {
        super(i2);
        this.f950h = dVar;
        this.f951i = dVar.e();
        this._decisionAndIndex = 536870911;
        this._state = C0062b.f942e;
    }

    public static Object D(c0 c0Var, Object obj, int i2, O0.l lVar) {
        if (obj instanceof C0074n) {
            return obj;
        }
        if (i2 != 1 && i2 != 2) {
            return obj;
        }
        if (lVar != null || (c0Var instanceof D)) {
            return new C0073m(obj, c0Var instanceof D ? (D) c0Var : null, lVar, (CancellationException) null, 16);
        }
        return obj;
    }

    public static void y(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public final void A() {
        G0.d dVar = this.f950h;
        Throwable th = null;
        b1.h hVar = dVar instanceof b1.h ? (b1.h) dVar : null;
        if (hVar != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b1.h.f1748l;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                B0.E e2 = AbstractC0115a.f1738d;
                if (obj == e2) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, e2, this)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != e2) {
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
            q();
            p(th);
        }
    }

    public final void B(Object obj, O0.l lVar) {
        C(obj, this.f904g, lVar);
    }

    public final void C(Object obj, int i2, O0.l lVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f948k;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof c0) {
                Object D2 = D((c0) obj2, obj, i2, lVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, D2)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!x()) {
                    q();
                }
                r(i2);
                return;
            }
            if (obj2 instanceof C0067g) {
                C0067g c0067g = (C0067g) obj2;
                c0067g.getClass();
                if (C0067g.f952c.compareAndSet(c0067g, 0, 1)) {
                    if (lVar != null) {
                        m(lVar, c0067g.f965a);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    @Override // W0.l0
    public final void a(b1.v vVar, int i2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        do {
            atomicIntegerFieldUpdater = f947j;
            i3 = atomicIntegerFieldUpdater.get(this);
            if ((i3 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, ((i3 >> 29) << 29) + i2));
        w(vVar);
    }

    @Override // W0.A
    public final void b(Object obj, CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f948k;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof c0) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof C0074n) {
                return;
            }
            if (!(obj2 instanceof C0073m)) {
                cancellationException2 = cancellationException;
                C0073m c0073m = new C0073m(obj2, (D) null, (O0.l) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c0073m)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                return;
            }
            C0073m c0073m2 = (C0073m) obj2;
            if (c0073m2.f963e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            C0073m a2 = C0073m.a(c0073m2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, a2)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    cancellationException2 = cancellationException;
                }
            }
            D d2 = c0073m2.f960b;
            if (d2 != null) {
                l(d2, cancellationException);
            }
            O0.l lVar = c0073m2.f961c;
            if (lVar != null) {
                m(lVar, cancellationException);
                return;
            }
            return;
            cancellationException = cancellationException2;
        }
    }

    @Override // W0.A
    public final G0.d c() {
        return this.f950h;
    }

    @Override // I0.c
    public final I0.c d() {
        G0.d dVar = this.f950h;
        if (dVar instanceof I0.c) {
            return (I0.c) dVar;
        }
        return null;
    }

    @Override // G0.d
    public final G0.i e() {
        return this.f951i;
    }

    @Override // W0.InterfaceC0065e
    public final B0.E f(Object obj, O0.l lVar) {
        B0.E e2 = AbstractC0081v.f975a;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f948k;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof c0)) {
                return null;
            }
            Object D2 = D((c0) obj2, obj, this.f904g, lVar);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, D2)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (!x()) {
                q();
            }
            return e2;
        }
    }

    @Override // G0.d
    public final void g(Object obj) {
        Throwable a2 = D0.e.a(obj);
        if (a2 != null) {
            obj = new C0074n(a2, false);
        }
        C(obj, this.f904g, null);
    }

    @Override // W0.A
    public final Throwable h(Object obj) {
        Throwable h2 = super.h(obj);
        if (h2 != null) {
            return h2;
        }
        return null;
    }

    @Override // W0.A
    public final Object i(Object obj) {
        return obj instanceof C0073m ? ((C0073m) obj).f959a : obj;
    }

    @Override // W0.A
    public final Object k() {
        return f948k.get(this);
    }

    public final void l(D d2, Throwable th) {
        try {
            d2.a(th);
        } catch (Throwable th2) {
            AbstractC0081v.d(this.f951i, new D0.b("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void m(O0.l lVar, Throwable th) {
        try {
            lVar.j(th);
        } catch (Throwable th2) {
            AbstractC0081v.d(this.f951i, new D0.b("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    @Override // W0.InterfaceC0065e
    public final void n(Object obj) {
        r(this.f904g);
    }

    public final void o(b1.v vVar, Throwable th) {
        G0.i iVar = this.f951i;
        int i2 = f947j.get(this) & 536870911;
        if (i2 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            vVar.g(i2, iVar);
        } catch (Throwable th2) {
            AbstractC0081v.d(iVar, new D0.b("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void p(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f948k;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof c0) {
                C0067g c0067g = new C0067g(this, th, (obj instanceof D) || (obj instanceof b1.v));
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0067g)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                c0 c0Var = (c0) obj;
                if (c0Var instanceof D) {
                    l((D) obj, th);
                } else if (c0Var instanceof b1.v) {
                    o((b1.v) obj, th);
                }
                if (!x()) {
                    q();
                }
                r(this.f904g);
                return;
            }
            return;
        }
    }

    public final void q() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f949l;
        C c2 = (C) atomicReferenceFieldUpdater.get(this);
        if (c2 == null) {
            return;
        }
        c2.b();
        atomicReferenceFieldUpdater.set(this, b0.f943e);
    }

    public final void r(int i2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        do {
            atomicIntegerFieldUpdater = f947j;
            i3 = atomicIntegerFieldUpdater.get(this);
            int i4 = i3 >> 29;
            if (i4 != 0) {
                if (i4 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z2 = i2 == 4;
                G0.d dVar = this.f950h;
                if (!z2 && (dVar instanceof b1.h)) {
                    boolean z3 = i2 == 1 || i2 == 2;
                    int i5 = this.f904g;
                    if (z3 == (i5 == 1 || i5 == 2)) {
                        AbstractC0078s abstractC0078s = ((b1.h) dVar).f1749h;
                        G0.i e2 = ((b1.h) dVar).f1750i.e();
                        if (abstractC0078s.d()) {
                            abstractC0078s.c(e2, this);
                            return;
                        }
                        H a2 = h0.a();
                        if (a2.f913g >= 4294967296L) {
                            E0.d dVar2 = a2.f915i;
                            if (dVar2 == null) {
                                dVar2 = new E0.d();
                                a2.f915i = dVar2;
                            }
                            dVar2.addLast(this);
                            return;
                        }
                        a2.g(true);
                        try {
                            AbstractC0081v.h(this, dVar, true);
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
                }
                AbstractC0081v.h(this, dVar, z2);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, 1073741824 + (536870911 & i3)));
    }

    public Throwable s(Z z2) {
        return z2.z();
    }

    public final Object t() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        P p2;
        boolean x2 = x();
        do {
            atomicIntegerFieldUpdater = f947j;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (x2) {
                    A();
                }
                Object obj = f948k.get(this);
                if (obj instanceof C0074n) {
                    throw ((C0074n) obj).f965a;
                }
                int i4 = this.f904g;
                if ((i4 != 1 && i4 != 2) || (p2 = (P) this.f951i.m(C0079t.f974f)) == null || p2.a()) {
                    return i(obj);
                }
                CancellationException z2 = ((Z) p2).z();
                b(obj, z2);
                throw z2;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 536870912 + (536870911 & i2)));
        if (((C) f949l.get(this)) == null) {
            v();
        }
        if (x2) {
            A();
        }
        return H0.a.f511e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(z());
        sb.append('(');
        sb.append(AbstractC0081v.j(this.f950h));
        sb.append("){");
        Object obj = f948k.get(this);
        sb.append(obj instanceof c0 ? "Active" : obj instanceof C0067g ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(AbstractC0081v.b(this));
        return sb.toString();
    }

    public final void u() {
        C v2 = v();
        if (v2 == null || (f948k.get(this) instanceof c0)) {
            return;
        }
        v2.b();
        f949l.set(this, b0.f943e);
    }

    public final C v() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        P p2 = (P) this.f951i.m(C0079t.f974f);
        if (p2 == null) {
            return null;
        }
        C e2 = AbstractC0081v.e(p2, true, new C0068h(this), 2);
        do {
            atomicReferenceFieldUpdater = f949l;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, e2)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return e2;
    }

    public final void w(c0 c0Var) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f948k;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C0062b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            boolean z2 = true;
            if (obj instanceof D ? true : obj instanceof b1.v) {
                y(c0Var, obj);
                throw null;
            }
            if (obj instanceof C0074n) {
                C0074n c0074n = (C0074n) obj;
                c0074n.getClass();
                if (!C0074n.f964b.compareAndSet(c0074n, 0, 1)) {
                    y(c0Var, obj);
                    throw null;
                }
                if (obj instanceof C0067g) {
                    if (obj == null) {
                        c0074n = null;
                    }
                    Throwable th = c0074n != null ? c0074n.f965a : null;
                    if (c0Var instanceof D) {
                        l((D) c0Var, th);
                        return;
                    } else {
                        P0.h.c(c0Var, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                        o((b1.v) c0Var, th);
                        return;
                    }
                }
                return;
            }
            if (obj instanceof C0073m) {
                C0073m c0073m = (C0073m) obj;
                if (c0073m.f960b != null) {
                    y(c0Var, obj);
                    throw null;
                }
                if (c0Var instanceof b1.v) {
                    return;
                }
                P0.h.c(c0Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                D d2 = (D) c0Var;
                Throwable th2 = c0073m.f963e;
                if (th2 != null) {
                    l(d2, th2);
                    return;
                }
                C0073m a2 = C0073m.a(c0073m, d2, null, 29);
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, a2)) {
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj) {
                        z2 = false;
                        break;
                    }
                }
                if (z2) {
                    return;
                }
            } else {
                if (c0Var instanceof b1.v) {
                    return;
                }
                P0.h.c(c0Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                C0073m c0073m2 = new C0073m(obj, (D) c0Var, (O0.l) null, (CancellationException) null, 28);
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, c0073m2)) {
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj) {
                        z2 = false;
                        break;
                    }
                }
                if (z2) {
                    return;
                }
            }
        }
    }

    public final boolean x() {
        if (this.f904g != 2) {
            return false;
        }
        G0.d dVar = this.f950h;
        P0.h.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return b1.h.f1748l.get((b1.h) dVar) != null;
    }

    public String z() {
        return "CancellableContinuation";
    }
}
