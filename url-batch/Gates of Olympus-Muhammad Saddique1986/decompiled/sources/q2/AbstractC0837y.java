package q2;

import e2.InterfaceC0426e;
import h2.AbstractC0508a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import n.AbstractC0695v;

/* renamed from: q2.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0837y {

    /* renamed from: a, reason: collision with root package name */
    public static final m1.q f7940a = new m1.q("RESUME_TOKEN", 1);

    /* renamed from: b, reason: collision with root package name */
    public static final m1.q f7941b = new m1.q("REMOVED_TASK", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final m1.q f7942c = new m1.q("CLOSED_EMPTY", 1);

    /* renamed from: d, reason: collision with root package name */
    public static final m1.q f7943d = new m1.q("COMPLETING_ALREADY", 1);

    /* renamed from: e, reason: collision with root package name */
    public static final m1.q f7944e = new m1.q("COMPLETING_WAITING_CHILDREN", 1);

    /* renamed from: f, reason: collision with root package name */
    public static final m1.q f7945f = new m1.q("COMPLETING_RETRY", 1);

    /* renamed from: g, reason: collision with root package name */
    public static final m1.q f7946g = new m1.q("TOO_LATE_TO_CANCEL", 1);

    /* renamed from: h, reason: collision with root package name */
    public static final m1.q f7947h = new m1.q("SEALED", 1);

    /* renamed from: i, reason: collision with root package name */
    public static final I f7948i = new I(false);

    /* renamed from: j, reason: collision with root package name */
    public static final I f7949j = new I(true);

    /* JADX WARN: Removed duplicated region for block: B:18:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object A(long j3, InterfaceC0426e interfaceC0426e, X1.c cVar) {
        s0 s0Var;
        int i3;
        f2.u uVar;
        if (cVar instanceof s0) {
            s0Var = (s0) cVar;
            int i4 = s0Var.f7927i;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                s0Var.f7927i = i4 - Integer.MIN_VALUE;
                Object obj = s0Var.f7926h;
                W1.a aVar = W1.a.f4608d;
                i3 = s0Var.f7927i;
                if (i3 != 0) {
                    R1.a.e(obj);
                    if (j3 <= 0) {
                        return null;
                    }
                    f2.u uVar2 = new f2.u();
                    try {
                        s0Var.f7925g = uVar2;
                        s0Var.f7927i = 1;
                        r0 r0Var = new r0(j3, s0Var);
                        uVar2.f5832d = r0Var;
                        obj = v(r0Var, interfaceC0426e);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } catch (q0 e3) {
                        e = e3;
                        uVar = uVar2;
                        if (e.f7920d != uVar.f5832d) {
                            return null;
                        }
                        throw e;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uVar = s0Var.f7925g;
                    try {
                        R1.a.e(obj);
                    } catch (q0 e4) {
                        e = e4;
                        if (e.f7920d != uVar.f5832d) {
                        }
                    }
                }
                return obj;
            }
        }
        s0Var = new s0(cVar);
        Object obj2 = s0Var.f7926h;
        W1.a aVar2 = W1.a.f4608d;
        i3 = s0Var.f7927i;
        if (i3 != 0) {
        }
        return obj2;
    }

    public static final Object B(X1.c cVar) {
        Object obj;
        V1.i t3 = cVar.t();
        g(t3);
        V1.d B3 = l0.c.B(cVar);
        v2.f fVar = B3 instanceof v2.f ? (v2.f) B3 : null;
        Object obj2 = R1.y.f4171a;
        Object obj3 = W1.a.f4608d;
        if (fVar == null) {
            obj = obj2;
        } else {
            AbstractC0831s abstractC0831s = fVar.f9795g;
            if (abstractC0831s.F(t3)) {
                fVar.f9797i = obj2;
                fVar.f7850f = 1;
                abstractC0831s.E(t3, fVar);
            } else {
                V1.i d3 = t3.d(new x0(x0.f7939e));
                fVar.f9797i = obj2;
                fVar.f7850f = 1;
                abstractC0831s.E(d3, fVar);
            }
            obj = obj3;
        }
        return obj == obj3 ? obj : obj2;
    }

    public static final v2.c a(V1.i iVar) {
        if (iVar.v(C0832t.f7929e) == null) {
            iVar = iVar.d(new Z(null));
        }
        return new v2.c(iVar);
    }

    public static n0 b() {
        return new n0(null);
    }

    public static final void c(InterfaceC0835w interfaceC0835w, CancellationException cancellationException) {
        X x3 = (X) interfaceC0835w.q().v(C0832t.f7929e);
        if (x3 != null) {
            x3.a(cancellationException);
        } else {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + interfaceC0835w).toString());
        }
    }

    public static final Object d(X x3, X1.i iVar) {
        x3.a(null);
        Object r3 = x3.r(iVar);
        return r3 == W1.a.f4608d ? r3 : R1.y.f4171a;
    }

    public static final Object e(InterfaceC0426e interfaceC0426e, V1.d dVar) {
        v2.q qVar = new v2.q(dVar, dVar.t());
        return AbstractC0695v.l(qVar, qVar, interfaceC0426e);
    }

    public static final Object f(long j3, X1.c cVar) {
        R1.y yVar = R1.y.f4171a;
        if (j3 <= 0) {
            return yVar;
        }
        C0821h c0821h = new C0821h(1, l0.c.B(cVar));
        c0821h.r();
        if (j3 < Long.MAX_VALUE) {
            i(c0821h.f7904h).q(j3, c0821h);
        }
        Object q3 = c0821h.q();
        return q3 == W1.a.f4608d ? q3 : yVar;
    }

    public static final void g(V1.i iVar) {
        X x3 = (X) iVar.v(C0832t.f7929e);
        if (x3 != null && !x3.b()) {
            throw x3.g();
        }
    }

    public static final V1.i h(V1.i iVar, V1.i iVar2, boolean z3) {
        Boolean bool = Boolean.FALSE;
        boolean booleanValue = ((Boolean) iVar.e(bool, new C0830q(0))).booleanValue();
        boolean booleanValue2 = ((Boolean) iVar2.e(bool, new C0830q(0))).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return iVar.d(iVar2);
        }
        V1.j jVar = V1.j.f4558d;
        V1.i iVar3 = (V1.i) iVar.e(jVar, new C0830q(1));
        Object obj = iVar2;
        if (booleanValue2) {
            obj = iVar2.e(jVar, new C0830q(2));
        }
        return iVar3.d((V1.i) obj);
    }

    public static final B i(V1.i iVar) {
        V1.g v3 = iVar.v(V1.e.f4557d);
        B b3 = v3 instanceof B ? (B) v3 : null;
        return b3 == null ? AbstractC0813A.f7848a : b3;
    }

    public static final String j(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final X k(V1.i iVar) {
        X x3 = (X) iVar.v(C0832t.f7929e);
        if (x3 != null) {
            return x3;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + iVar).toString());
    }

    public static final C0821h l(V1.d dVar) {
        C0821h c0821h;
        C0821h c0821h2;
        if (!(dVar instanceof v2.f)) {
            return new C0821h(1, dVar);
        }
        v2.f fVar = (v2.f) dVar;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = v2.f.f9794k;
            Object obj = atomicReferenceFieldUpdater.get(fVar);
            m1.q qVar = v2.a.f9784c;
            c0821h = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(fVar, qVar);
                c0821h2 = null;
                break;
            }
            if (obj instanceof C0821h) {
                while (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, qVar)) {
                    if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                        break;
                    }
                }
                c0821h2 = (C0821h) obj;
                break loop0;
            }
            if (obj != qVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (c0821h2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0821h.f7901j;
            Object obj2 = atomicReferenceFieldUpdater2.get(c0821h2);
            if (!(obj2 instanceof C0828o) || ((C0828o) obj2).f7914d == null) {
                C0821h.f7900i.set(c0821h2, 536870911);
                atomicReferenceFieldUpdater2.set(c0821h2, C0815b.f7879a);
                c0821h = c0821h2;
            } else {
                c0821h2.n();
            }
            if (c0821h != null) {
                return c0821h;
            }
        }
        return new C0821h(2, dVar);
    }

    public static final void m(V1.i iVar, Throwable th) {
        try {
            InterfaceC0833u interfaceC0833u = (InterfaceC0833u) iVar.v(C0832t.f7928d);
            if (interfaceC0833u != null) {
                interfaceC0833u.y(iVar, th);
            } else {
                v2.a.f(iVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                R1.a.a(runtimeException, th);
                th = runtimeException;
            }
            v2.a.f(iVar, th);
        }
    }

    public static final G n(X x3, boolean z3, b0 b0Var) {
        if (x3 instanceof f0) {
            return ((f0) x3).T(z3, b0Var);
        }
        return x3.w(b0Var.k(), z3, new a0(1, b0Var, b0.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 0));
    }

    public static final boolean o(V1.i iVar) {
        X x3 = (X) iVar.v(C0832t.f7929e);
        if (x3 != null) {
            return x3.b();
        }
        return true;
    }

    public static final boolean p(InterfaceC0835w interfaceC0835w) {
        X x3 = (X) interfaceC0835w.q().v(C0832t.f7929e);
        if (x3 != null) {
            return x3.b();
        }
        return true;
    }

    public static final boolean q(int i3) {
        return i3 == 1 || i3 == 2;
    }

    public static m0 r(InterfaceC0835w interfaceC0835w, V1.a aVar, EnumC0836x enumC0836x, InterfaceC0426e interfaceC0426e, int i3) {
        V1.i iVar = aVar;
        if ((i3 & 1) != 0) {
            iVar = V1.j.f4558d;
        }
        if ((i3 & 2) != 0) {
            enumC0836x = EnumC0836x.f7934d;
        }
        V1.i h3 = h(interfaceC0835w.q(), iVar, true);
        x2.e eVar = E.f7851a;
        if (h3 != eVar && h3.v(V1.e.f4557d) == null) {
            h3 = h3.d(eVar);
        }
        enumC0836x.getClass();
        m0 g0Var = enumC0836x == EnumC0836x.f7935e ? new g0(h3, interfaceC0426e) : new m0(h3, true);
        g0Var.k0(enumC0836x, g0Var, interfaceC0426e);
        return g0Var;
    }

    public static final Object s(Object obj) {
        return obj instanceof C0829p ? R1.a.b(((C0829p) obj).f7917a) : obj;
    }

    public static final void t(C0821h c0821h, V1.d dVar, boolean z3) {
        Object obj = C0821h.f7901j.get(c0821h);
        Throwable d3 = c0821h.d(obj);
        Object b3 = d3 != null ? R1.a.b(d3) : c0821h.e(obj);
        if (!z3) {
            dVar.u(b3);
            return;
        }
        f2.j.d(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        v2.f fVar = (v2.f) dVar;
        X1.c cVar = fVar.f9796h;
        V1.i t3 = cVar.t();
        Object n3 = v2.a.n(t3, fVar.f9798j);
        u0 y3 = n3 != v2.a.f9785d ? y(cVar, t3, n3) : null;
        try {
            cVar.u(b3);
        } finally {
            if (y3 == null || y3.l0()) {
                v2.a.i(t3, n3);
            }
        }
    }

    public static final Object u(r2.d dVar, InterfaceC0426e interfaceC0426e) {
        O o3;
        V1.i h3;
        Thread currentThread = Thread.currentThread();
        V1.e eVar = V1.e.f4557d;
        V1.f fVar = (V1.f) dVar.v(eVar);
        V1.j jVar = V1.j.f4558d;
        if (fVar == null) {
            o3 = p0.a();
            h3 = h(jVar, AbstractC0508a.L(dVar, o3), true);
            x2.e eVar2 = E.f7851a;
            if (h3 != eVar2 && h3.v(eVar) == null) {
                h3 = h3.d(eVar2);
            }
        } else {
            if (fVar instanceof O) {
            }
            o3 = (O) p0.f7918a.get();
            h3 = h(jVar, dVar, true);
            x2.e eVar3 = E.f7851a;
            if (h3 != eVar3 && h3.v(eVar) == null) {
                h3 = h3.d(eVar3);
            }
        }
        C0816c c0816c = new C0816c(h3, currentThread, o3);
        c0816c.k0(EnumC0836x.f7934d, c0816c, interfaceC0426e);
        O o4 = c0816c.f7882h;
        if (o4 != null) {
            int i3 = O.f7865i;
            o4.K(false);
        }
        while (!Thread.interrupted()) {
            try {
                long M3 = o4 != null ? o4.M() : Long.MAX_VALUE;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f0.f7895d;
                if (!(atomicReferenceFieldUpdater.get(c0816c) instanceof U)) {
                    if (o4 != null) {
                        int i4 = O.f7865i;
                        o4.H(false);
                    }
                    Object x3 = x(atomicReferenceFieldUpdater.get(c0816c));
                    C0829p c0829p = x3 instanceof C0829p ? (C0829p) x3 : null;
                    if (c0829p == null) {
                        return x3;
                    }
                    throw c0829p.f7917a;
                }
                LockSupport.parkNanos(c0816c, M3);
            } catch (Throwable th) {
                if (o4 != null) {
                    int i5 = O.f7865i;
                    o4.H(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        c0816c.E(interruptedException);
        throw interruptedException;
    }

    public static final Object v(r0 r0Var, InterfaceC0426e interfaceC0426e) {
        Object c0829p;
        Object W2;
        n(r0Var, true, new H(0, i(r0Var.f9824g.t()).u(r0Var.f7923h, r0Var, r0Var.f7877f)));
        try {
            if (interfaceC0426e instanceof X1.a) {
                f2.x.d(2, interfaceC0426e);
                c0829p = interfaceC0426e.h(r0Var, r0Var);
            } else {
                c0829p = l0.c.Q(interfaceC0426e, r0Var, r0Var);
            }
        } catch (Throwable th) {
            c0829p = new C0829p(th, false);
        }
        W1.a aVar = W1.a.f4608d;
        if (c0829p == aVar || (W2 = r0Var.W(c0829p)) == f7944e) {
            return aVar;
        }
        if (W2 instanceof C0829p) {
            Throwable th2 = ((C0829p) W2).f7917a;
            if (!(th2 instanceof q0)) {
                throw th2;
            }
            if (((q0) th2).f7920d != r0Var) {
                throw th2;
            }
            if (c0829p instanceof C0829p) {
                throw ((C0829p) c0829p).f7917a;
            }
        } else {
            c0829p = x(W2);
        }
        return c0829p;
    }

    public static final String w(V1.d dVar) {
        Object b3;
        if (dVar instanceof v2.f) {
            return ((v2.f) dVar).toString();
        }
        try {
            b3 = dVar + '@' + j(dVar);
        } catch (Throwable th) {
            b3 = R1.a.b(th);
        }
        if (R1.l.a(b3) != null) {
            b3 = dVar.getClass().getName() + '@' + j(dVar);
        }
        return (String) b3;
    }

    public static final Object x(Object obj) {
        U u3;
        V v3 = obj instanceof V ? (V) obj : null;
        return (v3 == null || (u3 = v3.f7872a) == null) ? obj : u3;
    }

    public static final u0 y(V1.d dVar, V1.i iVar, Object obj) {
        u0 u0Var = null;
        if (!(dVar instanceof X1.d)) {
            return null;
        }
        if (iVar.v(v0.f7933d) != null) {
            X1.d dVar2 = (X1.d) dVar;
            while (true) {
                if ((dVar2 instanceof C) || (dVar2 = dVar2.k()) == null) {
                    break;
                }
                if (dVar2 instanceof u0) {
                    u0Var = (u0) dVar2;
                    break;
                }
            }
            if (u0Var != null) {
                u0Var.m0(iVar, obj);
            }
        }
        return u0Var;
    }

    public static final Object z(V1.i iVar, InterfaceC0426e interfaceC0426e, V1.d dVar) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        V1.i t3 = dVar.t();
        V1.i d3 = !((Boolean) iVar.e(Boolean.FALSE, new C0830q(0))).booleanValue() ? t3.d(iVar) : h(t3, iVar, false);
        g(d3);
        if (d3 == t3) {
            v2.q qVar = new v2.q(dVar, d3);
            return AbstractC0695v.l(qVar, qVar, interfaceC0426e);
        }
        V1.e eVar = V1.e.f4557d;
        if (f2.j.a(d3.v(eVar), t3.v(eVar))) {
            u0 u0Var = new u0(dVar, d3);
            V1.i iVar2 = u0Var.f7877f;
            Object n3 = v2.a.n(iVar2, null);
            try {
                return AbstractC0695v.l(u0Var, u0Var, interfaceC0426e);
            } finally {
                v2.a.i(iVar2, n3);
            }
        }
        C c2 = new C(dVar, d3);
        try {
            v2.a.j(l0.c.B(l0.c.q(c2, c2, interfaceC0426e)), R1.y.f4171a);
            do {
                atomicIntegerFieldUpdater = C.f7849h;
                int i3 = atomicIntegerFieldUpdater.get(c2);
                if (i3 != 0) {
                    if (i3 != 2) {
                        throw new IllegalStateException("Already suspended");
                    }
                    Object x3 = x(f0.f7895d.get(c2));
                    if (x3 instanceof C0829p) {
                        throw ((C0829p) x3).f7917a;
                    }
                    return x3;
                }
            } while (!atomicIntegerFieldUpdater.compareAndSet(c2, 0, 1));
            return W1.a.f4608d;
        } catch (Throwable th) {
            c2.u(R1.a.b(th));
            throw th;
        }
    }
}
