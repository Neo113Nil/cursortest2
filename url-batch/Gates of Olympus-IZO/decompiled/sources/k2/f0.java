package k2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class f0 implements X, l0 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5356d = AtomicReferenceFieldUpdater.newUpdater(f0.class, Object.class, "_state$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5357e = AtomicReferenceFieldUpdater.newUpdater(f0.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public f0(boolean z3) {
        this._state$volatile = z3 ? AbstractC0552y.f5409j : AbstractC0552y.f5408i;
    }

    public static C0540l U(p2.j jVar) {
        while (jVar.i()) {
            p2.j f3 = jVar.f();
            if (f3 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = p2.j.f6788e;
                Object obj = atomicReferenceFieldUpdater.get(jVar);
                while (true) {
                    jVar = (p2.j) obj;
                    if (!jVar.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(jVar);
                }
            } else {
                jVar = f3;
            }
        }
        while (true) {
            jVar = jVar.h();
            if (!jVar.i()) {
                if (jVar instanceof C0540l) {
                    return (C0540l) jVar;
                }
                if (jVar instanceof h0) {
                    return null;
                }
            }
        }
    }

    public static String b0(Object obj) {
        if (!(obj instanceof e0)) {
            return obj instanceof U ? ((U) obj).b() ? "Active" : "New" : obj instanceof C0544p ? "Cancelled" : "Completed";
        }
        e0 e0Var = (e0) obj;
        return e0Var.e() ? "Cancelling" : e0.f5352e.get(e0Var) != 0 ? "Completing" : "Active";
    }

    public String A() {
        return "Job was cancelled";
    }

    public boolean B(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return s(th) && H();
    }

    public final void C(U u3, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5357e;
        InterfaceC0539k interfaceC0539k = (InterfaceC0539k) atomicReferenceFieldUpdater.get(this);
        if (interfaceC0539k != null) {
            interfaceC0539k.a();
            atomicReferenceFieldUpdater.set(this, j0.f5370d);
        }
        L1.f fVar = null;
        C0544p c0544p = obj instanceof C0544p ? (C0544p) obj : null;
        Throwable th = c0544p != null ? c0544p.f5378a : null;
        if (u3 instanceof b0) {
            try {
                ((b0) u3).l(th);
                return;
            } catch (Throwable th2) {
                M(new L1.f("Exception in completion handler " + u3 + " for " + this, th2));
                return;
            }
        }
        h0 d3 = u3.d();
        if (d3 != null) {
            d3.e(new p2.h(1), 1);
            Object obj2 = p2.j.f6787d.get(d3);
            Z1.i.d(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            for (p2.j jVar = (p2.j) obj2; !jVar.equals(d3); jVar = jVar.h()) {
                if (jVar instanceof b0) {
                    try {
                        ((b0) jVar).l(th);
                    } catch (Throwable th3) {
                        if (fVar != null) {
                            M1.B.o(fVar, th3);
                        } else {
                            fVar = new L1.f("Exception in completion handler " + jVar + " for " + this, th3);
                        }
                    }
                }
            }
            if (fVar != null) {
                M(fVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    public final Throwable E(Object obj) {
        CancellationException cancellationException;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        f0 f0Var = (f0) ((l0) obj);
        Object obj2 = f5356d.get(f0Var);
        if (obj2 instanceof e0) {
            cancellationException = ((e0) obj2).c();
        } else if (obj2 instanceof C0544p) {
            cancellationException = ((C0544p) obj2).f5378a;
        } else {
            if (obj2 instanceof U) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + obj2).toString());
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        if (cancellationException2 == null) {
            cancellationException2 = new Y("Parent job is ".concat(b0(obj2)), cancellationException, f0Var);
        }
        return cancellationException2;
    }

    public final Object F(e0 e0Var, Object obj) {
        Throwable G3;
        C0544p c0544p = obj instanceof C0544p ? (C0544p) obj : null;
        Throwable th = c0544p != null ? c0544p.f5378a : null;
        synchronized (e0Var) {
            e0Var.e();
            ArrayList<Throwable> f3 = e0Var.f(th);
            G3 = G(e0Var, f3);
            if (G3 != null && f3.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(f3.size()));
                for (Throwable th2 : f3) {
                    if (th2 != G3 && th2 != G3 && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                        M1.B.o(G3, th2);
                    }
                }
            }
        }
        if (G3 != null && G3 != th) {
            obj = new C0544p(G3, false);
        }
        if (G3 != null && (y(G3) || K(G3))) {
            Z1.i.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            C0544p.f5377b.compareAndSet((C0544p) obj, 0, 1);
        }
        W(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5356d;
        Object v3 = obj instanceof U ? new V((U) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, e0Var, v3) && atomicReferenceFieldUpdater.get(this) == e0Var) {
        }
        C(e0Var, obj);
        return obj;
    }

    public final Throwable G(e0 e0Var, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (e0Var.e()) {
                return new Y(A(), null, this);
            }
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof q0) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Throwable th3 = (Throwable) next;
                if (th3 != th2 && (th3 instanceof q0)) {
                    obj2 = next;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public boolean H() {
        return true;
    }

    public boolean I() {
        return this instanceof C0542n;
    }

    public final h0 J(U u3) {
        h0 d3 = u3.d();
        if (d3 != null) {
            return d3;
        }
        if (u3 instanceof I) {
            return new h0();
        }
        if (u3 instanceof b0) {
            Z((b0) u3);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + u3).toString());
    }

    public boolean K(Throwable th) {
        return false;
    }

    @Override // k2.X
    public final G L(Y1.c cVar) {
        return P(true, new H(1, cVar));
    }

    public final void N(X x3) {
        j0 j0Var = j0.f5370d;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5357e;
        if (x3 == null) {
            atomicReferenceFieldUpdater.set(this, j0Var);
            return;
        }
        x3.p();
        InterfaceC0539k O3 = x3.O(this);
        atomicReferenceFieldUpdater.set(this, O3);
        if (f5356d.get(this) instanceof U) {
            return;
        }
        O3.a();
        atomicReferenceFieldUpdater.set(this, j0Var);
    }

    @Override // k2.X
    public final InterfaceC0539k O(f0 f0Var) {
        C0540l c0540l = new C0540l(f0Var);
        c0540l.f5341g = this;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5356d;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof I) {
                I i3 = (I) obj;
                if (i3.f5316d) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0540l)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                Y(i3);
            } else {
                boolean z3 = obj instanceof U;
                j0 j0Var = j0.f5370d;
                if (!z3) {
                    Object obj2 = atomicReferenceFieldUpdater.get(this);
                    C0544p c0544p = obj2 instanceof C0544p ? (C0544p) obj2 : null;
                    c0540l.l(c0544p != null ? c0544p.f5378a : null);
                    return j0Var;
                }
                h0 d3 = ((U) obj).d();
                if (d3 == null) {
                    Z1.i.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    Z((b0) obj);
                } else if (!d3.e(c0540l, 7)) {
                    boolean e3 = d3.e(c0540l, 3);
                    Object obj3 = atomicReferenceFieldUpdater.get(this);
                    if (obj3 instanceof e0) {
                        r4 = ((e0) obj3).c();
                    } else {
                        C0544p c0544p2 = obj3 instanceof C0544p ? (C0544p) obj3 : null;
                        if (c0544p2 != null) {
                            r4 = c0544p2.f5378a;
                        }
                    }
                    c0540l.l(r4);
                    if (e3) {
                        break loop0;
                    }
                    return j0Var;
                }
            }
        }
        return c0540l;
    }

    public final G P(boolean z3, b0 b0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        j0 j0Var;
        boolean z4;
        boolean e3;
        b0Var.f5341g = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = f5356d;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z5 = obj instanceof I;
            j0Var = j0.f5370d;
            z4 = true;
            if (!z5) {
                if (!(obj instanceof U)) {
                    z4 = false;
                    break;
                }
                U u3 = (U) obj;
                h0 d3 = u3.d();
                if (d3 == null) {
                    Z1.i.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    Z((b0) obj);
                } else {
                    if (b0Var.k()) {
                        e0 e0Var = u3 instanceof e0 ? (e0) u3 : null;
                        Throwable c3 = e0Var != null ? e0Var.c() : null;
                        if (c3 != null) {
                            if (z3) {
                                b0Var.l(c3);
                            }
                            return j0Var;
                        }
                        e3 = d3.e(b0Var, 5);
                    } else {
                        e3 = d3.e(b0Var, 1);
                    }
                    if (e3) {
                        break;
                    }
                }
            } else {
                I i3 = (I) obj;
                if (i3.f5316d) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, b0Var)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                Y(i3);
            }
        }
        if (z4) {
            return b0Var;
        }
        if (z3) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            C0544p c0544p = obj2 instanceof C0544p ? (C0544p) obj2 : null;
            b0Var.l(c0544p != null ? c0544p.f5378a : null);
        }
        return j0Var;
    }

    public boolean Q() {
        return this instanceof C0531c;
    }

    public final boolean R(Object obj) {
        Object c02;
        do {
            c02 = c0(f5356d.get(this), obj);
            if (c02 == AbstractC0552y.f5403d) {
                return false;
            }
            if (c02 == AbstractC0552y.f5404e) {
                return true;
            }
        } while (c02 == AbstractC0552y.f5405f);
        l(c02);
        return true;
    }

    public final Object S(Object obj) {
        Object c02;
        do {
            c02 = c0(f5356d.get(this), obj);
            if (c02 == AbstractC0552y.f5403d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C0544p c0544p = obj instanceof C0544p ? (C0544p) obj : null;
                throw new IllegalStateException(str, c0544p != null ? c0544p.f5378a : null);
            }
        } while (c02 == AbstractC0552y.f5405f);
        return c02;
    }

    public String T() {
        return getClass().getSimpleName();
    }

    public final void V(h0 h0Var, Throwable th) {
        h0Var.e(new p2.h(4), 4);
        Object obj = p2.j.f6787d.get(h0Var);
        Z1.i.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        L1.f fVar = null;
        for (p2.j jVar = (p2.j) obj; !jVar.equals(h0Var); jVar = jVar.h()) {
            if ((jVar instanceof b0) && ((b0) jVar).k()) {
                try {
                    ((b0) jVar).l(th);
                } catch (Throwable th2) {
                    if (fVar != null) {
                        M1.B.o(fVar, th2);
                    } else {
                        fVar = new L1.f("Exception in completion handler " + jVar + " for " + this, th2);
                    }
                }
            }
        }
        if (fVar != null) {
            M(fVar);
        }
        y(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [k2.T] */
    public final void Y(I i3) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        h0 h0Var = new h0();
        if (!i3.f5316d) {
            h0Var = new T(h0Var);
        }
        do {
            atomicReferenceFieldUpdater = f5356d;
            if (atomicReferenceFieldUpdater.compareAndSet(this, i3, h0Var)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == i3);
    }

    public final void Z(b0 b0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        h0 h0Var = new h0();
        b0Var.getClass();
        p2.j.f6788e.set(h0Var, b0Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = p2.j.f6787d;
        atomicReferenceFieldUpdater2.set(h0Var, b0Var);
        loop0: while (true) {
            if (atomicReferenceFieldUpdater2.get(b0Var) == b0Var) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(b0Var, b0Var, h0Var)) {
                    if (atomicReferenceFieldUpdater2.get(b0Var) != b0Var) {
                        break;
                    }
                }
                h0Var.g(b0Var);
                break loop0;
            }
            break;
        }
        p2.j h3 = b0Var.h();
        do {
            atomicReferenceFieldUpdater = f5356d;
            if (atomicReferenceFieldUpdater.compareAndSet(this, b0Var, h3)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == b0Var);
    }

    @Override // k2.X
    public void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new Y(A(), null, this);
        }
        w(cancellationException);
    }

    public final int a0(Object obj) {
        boolean z3 = obj instanceof I;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5356d;
        if (z3) {
            if (((I) obj).f5316d) {
                return 0;
            }
            I i3 = AbstractC0552y.f5409j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, i3)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            X();
            return 1;
        }
        if (!(obj instanceof T)) {
            return 0;
        }
        h0 h0Var = ((T) obj).f5332d;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, h0Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        X();
        return 1;
    }

    @Override // k2.X
    public boolean b() {
        Object obj = f5356d.get(this);
        return (obj instanceof U) && ((U) obj).b();
    }

    public final Object c0(Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        if (!(obj instanceof U)) {
            return AbstractC0552y.f5403d;
        }
        if (((obj instanceof I) || (obj instanceof b0)) && !(obj instanceof C0540l) && !(obj2 instanceof C0544p)) {
            U u3 = (U) obj;
            Object v3 = obj2 instanceof U ? new V((U) obj2) : obj2;
            do {
                atomicReferenceFieldUpdater = f5356d;
                if (atomicReferenceFieldUpdater.compareAndSet(this, u3, v3)) {
                    W(obj2);
                    C(u3, obj2);
                    return obj2;
                }
            } while (atomicReferenceFieldUpdater.get(this) == u3);
            return AbstractC0552y.f5405f;
        }
        U u4 = (U) obj;
        h0 J3 = J(u4);
        if (J3 == null) {
            return AbstractC0552y.f5405f;
        }
        e0 e0Var = u4 instanceof e0 ? (e0) u4 : null;
        if (e0Var == null) {
            e0Var = new e0(J3, null);
        }
        synchronized (e0Var) {
            try {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = e0.f5352e;
                if (atomicIntegerFieldUpdater.get(e0Var) != 0) {
                    return AbstractC0552y.f5403d;
                }
                atomicIntegerFieldUpdater.set(e0Var, 1);
                if (e0Var != u4) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f5356d;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, u4, e0Var)) {
                        if (atomicReferenceFieldUpdater2.get(this) != u4) {
                            return AbstractC0552y.f5405f;
                        }
                    }
                }
                boolean e3 = e0Var.e();
                C0544p c0544p = obj2 instanceof C0544p ? (C0544p) obj2 : null;
                if (c0544p != null) {
                    e0Var.a(c0544p.f5378a);
                }
                Throwable c3 = e3 ? null : e0Var.c();
                if (c3 != null) {
                    V(J3, c3);
                }
                C0540l U2 = U(J3);
                if (U2 != null && d0(e0Var, U2, obj2)) {
                    return AbstractC0552y.f5404e;
                }
                J3.e(new p2.h(2), 2);
                C0540l U3 = U(J3);
                return (U3 == null || !d0(e0Var, U3, obj2)) ? F(e0Var, obj2) : AbstractC0552y.f5404e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d0(e0 e0Var, C0540l c0540l, Object obj) {
        while (AbstractC0552y.m(c0540l.f5371h, false, new d0(this, e0Var, c0540l, obj)) == j0.f5370d) {
            c0540l = U(c0540l);
            if (c0540l == null) {
                return false;
            }
        }
        return true;
    }

    @Override // k2.X
    public final G e(boolean z3, boolean z4, a0 a0Var) {
        return P(z4, z3 ? new W(a0Var) : new H(1, a0Var));
    }

    @Override // P1.g
    public final P1.h getKey() {
        return C0547t.f5390e;
    }

    @Override // k2.X
    public final Object h(R1.c cVar) {
        Object obj;
        L1.z zVar;
        do {
            obj = f5356d.get(this);
            boolean z3 = obj instanceof U;
            zVar = L1.z.f2729a;
            if (!z3) {
                AbstractC0552y.f(cVar.getContext());
                return zVar;
            }
        } while (a0(obj) < 0);
        C0536h c0536h = new C0536h(1, M1.B.G(cVar));
        c0536h.q();
        c0536h.u(new C0533e(2, AbstractC0552y.m(this, true, new C0538j(c0536h, 1))));
        Object p = c0536h.p();
        Q1.a aVar = Q1.a.f3113d;
        if (p != aVar) {
            p = zVar;
        }
        return p == aVar ? p : zVar;
    }

    @Override // P1.i
    public final P1.g k(P1.h hVar) {
        return I2.l.A(this, hVar);
    }

    @Override // k2.X
    public final CancellationException m() {
        CancellationException cancellationException;
        Object obj = f5356d.get(this);
        if (!(obj instanceof e0)) {
            if (obj instanceof U) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(obj instanceof C0544p)) {
                return new Y(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((C0544p) obj).f5378a;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new Y(A(), th, this) : cancellationException;
        }
        Throwable c3 = ((e0) obj).c();
        if (c3 == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String concat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = c3 instanceof CancellationException ? (CancellationException) c3 : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (concat == null) {
            concat = A();
        }
        return new Y(concat, c3, this);
    }

    @Override // P1.i
    public final P1.i o(P1.i iVar) {
        return I2.l.M(this, iVar);
    }

    @Override // k2.X
    public final boolean p() {
        int a02;
        do {
            a02 = a0(f5356d.get(this));
            if (a02 == 0) {
                return false;
            }
        } while (a02 != 1);
        return true;
    }

    public void q(Object obj) {
        l(obj);
    }

    @Override // P1.i
    public final Object r(Object obj, Y1.e eVar) {
        return eVar.g(obj, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0069, code lost:
    
        r0 = r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean s(Object obj) {
        j1.p pVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj2 = AbstractC0552y.f5403d;
        if (I()) {
            do {
                Object obj3 = f5356d.get(this);
                if (obj3 instanceof U) {
                    if (obj3 instanceof e0) {
                        e0 e0Var = (e0) obj3;
                        e0Var.getClass();
                        if (e0.f5352e.get(e0Var) != 0) {
                        }
                    }
                    obj2 = c0(obj3, new C0544p(E(obj), false));
                }
                obj2 = AbstractC0552y.f5403d;
                break;
            } while (obj2 == AbstractC0552y.f5405f);
            if (obj2 == AbstractC0552y.f5404e) {
                return true;
            }
        }
        if (obj2 == AbstractC0552y.f5403d) {
            Throwable th = null;
            loop1: while (true) {
                Object obj4 = f5356d.get(this);
                if (!(obj4 instanceof e0)) {
                    if (!(obj4 instanceof U)) {
                        pVar = AbstractC0552y.f5406g;
                        break;
                    }
                    if (th == null) {
                        th = E(obj);
                    }
                    U u3 = (U) obj4;
                    if (u3.b()) {
                        h0 J3 = J(u3);
                        if (J3 == null) {
                            continue;
                        } else {
                            e0 e0Var2 = new e0(J3, th);
                            do {
                                atomicReferenceFieldUpdater = f5356d;
                                if (atomicReferenceFieldUpdater.compareAndSet(this, u3, e0Var2)) {
                                    V(J3, th);
                                    pVar = AbstractC0552y.f5403d;
                                    break loop1;
                                }
                            } while (atomicReferenceFieldUpdater.get(this) == u3);
                        }
                    } else {
                        Object c02 = c0(obj4, new C0544p(th, false));
                        if (c02 == AbstractC0552y.f5403d) {
                            throw new IllegalStateException(("Cannot happen in " + obj4).toString());
                        }
                        if (c02 != AbstractC0552y.f5405f) {
                            obj2 = c02;
                            break;
                        }
                    }
                } else {
                    synchronized (obj4) {
                        try {
                            e0 e0Var3 = (e0) obj4;
                            e0Var3.getClass();
                            if (e0.f5354g.get(e0Var3) == AbstractC0552y.f5407h) {
                                pVar = AbstractC0552y.f5406g;
                            } else {
                                boolean e3 = ((e0) obj4).e();
                                if (th == null) {
                                    th = E(obj);
                                }
                                ((e0) obj4).a(th);
                                Throwable c3 = e3 ? null : ((e0) obj4).c();
                                if (c3 != null) {
                                    V(((e0) obj4).f5355d, c3);
                                }
                                pVar = AbstractC0552y.f5403d;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
        }
        if (obj2 != AbstractC0552y.f5403d && obj2 != AbstractC0552y.f5404e) {
            if (obj2 == AbstractC0552y.f5406g) {
                return false;
            }
            l(obj2);
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(T() + '{' + b0(f5356d.get(this)) + '}');
        sb.append('@');
        sb.append(AbstractC0552y.i(this));
        return sb.toString();
    }

    public void w(CancellationException cancellationException) {
        s(cancellationException);
    }

    @Override // P1.i
    public final P1.i x(P1.h hVar) {
        return I2.l.H(this, hVar);
    }

    public final boolean y(Throwable th) {
        if (Q()) {
            return true;
        }
        boolean z3 = th instanceof CancellationException;
        InterfaceC0539k interfaceC0539k = (InterfaceC0539k) f5357e.get(this);
        return (interfaceC0539k == null || interfaceC0539k == j0.f5370d) ? z3 : interfaceC0539k.c(th) || z3;
    }

    public void X() {
    }

    public void M(L1.f fVar) {
        throw fVar;
    }

    public void W(Object obj) {
    }

    public void l(Object obj) {
    }
}
