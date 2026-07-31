package k2;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* renamed from: k2.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0552y {

    /* renamed from: a, reason: collision with root package name */
    public static final j1.p f5400a = new j1.p("RESUME_TOKEN", 1);

    /* renamed from: b, reason: collision with root package name */
    public static final j1.p f5401b = new j1.p("REMOVED_TASK", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final j1.p f5402c = new j1.p("CLOSED_EMPTY", 1);

    /* renamed from: d, reason: collision with root package name */
    public static final j1.p f5403d = new j1.p("COMPLETING_ALREADY", 1);

    /* renamed from: e, reason: collision with root package name */
    public static final j1.p f5404e = new j1.p("COMPLETING_WAITING_CHILDREN", 1);

    /* renamed from: f, reason: collision with root package name */
    public static final j1.p f5405f = new j1.p("COMPLETING_RETRY", 1);

    /* renamed from: g, reason: collision with root package name */
    public static final j1.p f5406g = new j1.p("TOO_LATE_TO_CANCEL", 1);

    /* renamed from: h, reason: collision with root package name */
    public static final j1.p f5407h = new j1.p("SEALED", 1);

    /* renamed from: i, reason: collision with root package name */
    public static final I f5408i = new I(false);

    /* renamed from: j, reason: collision with root package name */
    public static final I f5409j = new I(true);

    public static final p2.c a(P1.i iVar) {
        if (iVar.k(C0547t.f5390e) == null) {
            iVar = iVar.o(new Z(null));
        }
        return new p2.c(iVar);
    }

    public static n0 b() {
        return new n0(null);
    }

    public static final void c(p2.c cVar, CancellationException cancellationException) {
        X x3 = (X) cVar.f6770d.k(C0547t.f5390e);
        if (x3 != null) {
            x3.a(cancellationException);
        } else {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + cVar).toString());
        }
    }

    public static final Object d(Y1.e eVar, P1.d dVar) {
        p2.r rVar = new p2.r(dVar, dVar.getContext());
        Object X2 = g2.i.X(rVar, rVar, eVar);
        Q1.a aVar = Q1.a.f3113d;
        return X2;
    }

    public static final Object e(long j3, R1.c cVar) {
        L1.z zVar = L1.z.f2729a;
        if (j3 <= 0) {
            return zVar;
        }
        C0536h c0536h = new C0536h(1, M1.B.G(cVar));
        c0536h.q();
        if (j3 < Long.MAX_VALUE) {
            h(c0536h.f5365h).u(j3, c0536h);
        }
        Object p = c0536h.p();
        return p == Q1.a.f3113d ? p : zVar;
    }

    public static final void f(P1.i iVar) {
        X x3 = (X) iVar.k(C0547t.f5390e);
        if (x3 != null && !x3.b()) {
            throw x3.m();
        }
    }

    public static final P1.i g(P1.i iVar, P1.i iVar2, boolean z3) {
        Boolean bool = Boolean.FALSE;
        boolean booleanValue = ((Boolean) iVar.r(bool, new C0545q(0))).booleanValue();
        boolean booleanValue2 = ((Boolean) iVar2.r(bool, new C0545q(0))).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return iVar.o(iVar2);
        }
        P1.j jVar = P1.j.f3073d;
        P1.i iVar3 = (P1.i) iVar.r(jVar, new C0545q(1));
        Object obj = iVar2;
        if (booleanValue2) {
            obj = iVar2.r(jVar, new C0545q(2));
        }
        return iVar3.o((P1.i) obj);
    }

    public static final B h(P1.i iVar) {
        P1.g k3 = iVar.k(P1.e.f3072d);
        B b2 = k3 instanceof B ? (B) k3 : null;
        return b2 == null ? AbstractC0528A.f5309a : b2;
    }

    public static final String i(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final X j(P1.i iVar) {
        X x3 = (X) iVar.k(C0547t.f5390e);
        if (x3 != null) {
            return x3;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + iVar).toString());
    }

    public static final C0536h k(P1.d dVar) {
        C0536h c0536h;
        C0536h c0536h2;
        if (!(dVar instanceof p2.f)) {
            return new C0536h(1, dVar);
        }
        p2.f fVar = (p2.f) dVar;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = p2.f.f6773k;
            Object obj = atomicReferenceFieldUpdater.get(fVar);
            j1.p pVar = p2.a.f6763c;
            c0536h = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(fVar, pVar);
                c0536h2 = null;
                break;
            }
            if (obj instanceof C0536h) {
                while (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, pVar)) {
                    if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                        break;
                    }
                }
                c0536h2 = (C0536h) obj;
                break loop0;
            }
            if (obj != pVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (c0536h2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0536h.f5362j;
            Object obj2 = atomicReferenceFieldUpdater2.get(c0536h2);
            if (!(obj2 instanceof C0543o) || ((C0543o) obj2).f5375d == null) {
                C0536h.f5361i.set(c0536h2, 536870911);
                atomicReferenceFieldUpdater2.set(c0536h2, C0530b.f5340a);
                c0536h = c0536h2;
            } else {
                c0536h2.l();
            }
            if (c0536h != null) {
                return c0536h;
            }
        }
        return new C0536h(2, dVar);
    }

    public static final void l(P1.i iVar, Throwable th) {
        try {
            InterfaceC0548u interfaceC0548u = (InterfaceC0548u) iVar.k(C0547t.f5389d);
            if (interfaceC0548u != null) {
                interfaceC0548u.D(iVar, th);
            } else {
                p2.a.f(iVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                M1.B.o(runtimeException, th);
                th = runtimeException;
            }
            p2.a.f(iVar, th);
        }
    }

    public static final G m(X x3, boolean z3, b0 b0Var) {
        if (x3 instanceof f0) {
            return ((f0) x3).P(z3, b0Var);
        }
        return x3.e(b0Var.k(), z3, new a0(1, b0Var, b0.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 0));
    }

    public static final boolean n(P1.i iVar) {
        X x3 = (X) iVar.k(C0547t.f5390e);
        if (x3 != null) {
            return x3.b();
        }
        return true;
    }

    public static final boolean o(InterfaceC0550w interfaceC0550w) {
        X x3 = (X) interfaceC0550w.u().k(C0547t.f5390e);
        if (x3 != null) {
            return x3.b();
        }
        return true;
    }

    public static final boolean p(int i3) {
        return i3 == 1 || i3 == 2;
    }

    public static m0 q(InterfaceC0550w interfaceC0550w, P1.a aVar, EnumC0551x enumC0551x, Y1.e eVar, int i3) {
        P1.i iVar = aVar;
        if ((i3 & 1) != 0) {
            iVar = P1.j.f3073d;
        }
        if ((i3 & 2) != 0) {
            enumC0551x = EnumC0551x.f5395d;
        }
        P1.i g3 = g(interfaceC0550w.u(), iVar, true);
        r2.e eVar2 = E.f5312a;
        if (g3 != eVar2 && g3.k(P1.e.f3072d) == null) {
            g3 = g3.o(eVar2);
        }
        enumC0551x.getClass();
        m0 g0Var = enumC0551x == EnumC0551x.f5396e ? new g0(g3, eVar) : new m0(g3, true);
        g0Var.g0(enumC0551x, g0Var, eVar);
        return g0Var;
    }

    public static final Object r(Object obj) {
        return obj instanceof C0544p ? I2.l.t(((C0544p) obj).f5378a) : obj;
    }

    public static final void s(C0536h c0536h, P1.d dVar, boolean z3) {
        Object obj = C0536h.f5362j.get(c0536h);
        Throwable d3 = c0536h.d(obj);
        Object t3 = d3 != null ? I2.l.t(d3) : c0536h.e(obj);
        if (!z3) {
            dVar.resumeWith(t3);
            return;
        }
        Z1.i.d(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        p2.f fVar = (p2.f) dVar;
        R1.c cVar = fVar.f6775h;
        P1.i context = cVar.getContext();
        Object n3 = p2.a.n(context, fVar.f6777j);
        u0 x3 = n3 != p2.a.f6764d ? x(cVar, context, n3) : null;
        try {
            cVar.resumeWith(t3);
        } finally {
            if (x3 == null || x3.h0()) {
                p2.a.i(context, n3);
            }
        }
    }

    public static final Object t(l2.d dVar, Y1.e eVar) {
        O o3;
        P1.i g3;
        Thread currentThread = Thread.currentThread();
        P1.e eVar2 = P1.e.f3072d;
        P1.f fVar = (P1.f) dVar.k(eVar2);
        P1.j jVar = P1.j.f3073d;
        if (fVar == null) {
            o3 = p0.a();
            g3 = g(jVar, I2.l.M(dVar, o3), true);
            r2.e eVar3 = E.f5312a;
            if (g3 != eVar3 && g3.k(eVar2) == null) {
                g3 = g3.o(eVar3);
            }
        } else {
            if (fVar instanceof O) {
            }
            o3 = (O) p0.f5379a.get();
            g3 = g(jVar, dVar, true);
            r2.e eVar4 = E.f5312a;
            if (g3 != eVar4 && g3.k(eVar2) == null) {
                g3 = g3.o(eVar4);
            }
        }
        C0531c c0531c = new C0531c(g3, currentThread, o3);
        c0531c.g0(EnumC0551x.f5395d, c0531c, eVar);
        O o4 = c0531c.f5343h;
        if (o4 != null) {
            int i3 = O.f5326i;
            o4.V(false);
        }
        while (!Thread.interrupted()) {
            try {
                long X2 = o4 != null ? o4.X() : Long.MAX_VALUE;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f0.f5356d;
                if (!(atomicReferenceFieldUpdater.get(c0531c) instanceof U)) {
                    if (o4 != null) {
                        int i4 = O.f5326i;
                        o4.S(false);
                    }
                    Object w3 = w(atomicReferenceFieldUpdater.get(c0531c));
                    C0544p c0544p = w3 instanceof C0544p ? (C0544p) w3 : null;
                    if (c0544p == null) {
                        return w3;
                    }
                    throw c0544p.f5378a;
                }
                LockSupport.parkNanos(c0531c, X2);
            } catch (Throwable th) {
                if (o4 != null) {
                    int i5 = O.f5326i;
                    o4.S(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        c0531c.s(interruptedException);
        throw interruptedException;
    }

    public static final Object u(r0 r0Var, Y1.e eVar) {
        Object c0544p;
        Object S2;
        m(r0Var, true, new H(0, h(r0Var.f6804g.getContext()).i(r0Var.f5384h, r0Var, r0Var.f5338f)));
        try {
            if (eVar instanceof R1.a) {
                Z1.w.d(2, eVar);
                c0544p = eVar.g(r0Var, r0Var);
            } else {
                c0544p = M1.B.S(eVar, r0Var, r0Var);
            }
        } catch (Throwable th) {
            c0544p = new C0544p(th, false);
        }
        Q1.a aVar = Q1.a.f3113d;
        if (c0544p == aVar || (S2 = r0Var.S(c0544p)) == f5404e) {
            return aVar;
        }
        if (S2 instanceof C0544p) {
            Throwable th2 = ((C0544p) S2).f5378a;
            if (!(th2 instanceof q0)) {
                throw th2;
            }
            if (((q0) th2).f5381d != r0Var) {
                throw th2;
            }
            if (c0544p instanceof C0544p) {
                throw ((C0544p) c0544p).f5378a;
            }
        } else {
            c0544p = w(S2);
        }
        return c0544p;
    }

    public static final String v(P1.d dVar) {
        Object t3;
        if (dVar instanceof p2.f) {
            return ((p2.f) dVar).toString();
        }
        try {
            t3 = dVar + '@' + i(dVar);
        } catch (Throwable th) {
            t3 = I2.l.t(th);
        }
        if (L1.m.a(t3) != null) {
            t3 = dVar.getClass().getName() + '@' + i(dVar);
        }
        return (String) t3;
    }

    public static final Object w(Object obj) {
        U u3;
        V v3 = obj instanceof V ? (V) obj : null;
        return (v3 == null || (u3 = v3.f5333a) == null) ? obj : u3;
    }

    public static final u0 x(P1.d dVar, P1.i iVar, Object obj) {
        u0 u0Var = null;
        if (!(dVar instanceof R1.d)) {
            return null;
        }
        if (iVar.k(v0.f5394d) != null) {
            R1.d dVar2 = (R1.d) dVar;
            while (true) {
                if ((dVar2 instanceof C) || (dVar2 = dVar2.getCallerFrame()) == null) {
                    break;
                }
                if (dVar2 instanceof u0) {
                    u0Var = (u0) dVar2;
                    break;
                }
            }
            if (u0Var != null) {
                u0Var.i0(iVar, obj);
            }
        }
        return u0Var;
    }

    public static final Object y(P1.i iVar, Y1.e eVar, P1.d dVar) {
        Object w3;
        P1.i context = dVar.getContext();
        P1.i o3 = !((Boolean) iVar.r(Boolean.FALSE, new C0545q(0))).booleanValue() ? context.o(iVar) : g(context, iVar, false);
        f(o3);
        if (o3 == context) {
            p2.r rVar = new p2.r(dVar, o3);
            w3 = g2.i.X(rVar, rVar, eVar);
        } else {
            P1.e eVar2 = P1.e.f3072d;
            if (Z1.i.a(o3.k(eVar2), context.k(eVar2))) {
                u0 u0Var = new u0(dVar, o3);
                P1.i iVar2 = u0Var.f5338f;
                Object n3 = p2.a.n(iVar2, null);
                try {
                    Object X2 = g2.i.X(u0Var, u0Var, eVar);
                    p2.a.i(iVar2, n3);
                    w3 = X2;
                } catch (Throwable th) {
                    p2.a.i(iVar2, n3);
                    throw th;
                }
            } else {
                C c3 = new C(dVar, o3);
                try {
                    p2.a.j(M1.B.G(M1.B.w(c3, c3, eVar)), L1.z.f2729a);
                    while (true) {
                        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C.f5310h;
                        int i3 = atomicIntegerFieldUpdater.get(c3);
                        if (i3 != 0) {
                            if (i3 != 2) {
                                throw new IllegalStateException("Already suspended");
                            }
                            w3 = w(f0.f5356d.get(c3));
                            if (w3 instanceof C0544p) {
                                throw ((C0544p) w3).f5378a;
                            }
                        } else if (atomicIntegerFieldUpdater.compareAndSet(c3, 0, 1)) {
                            w3 = Q1.a.f3113d;
                            break;
                        }
                    }
                } catch (Throwable th2) {
                    c3.resumeWith(I2.l.t(th2));
                    throw th2;
                }
            }
        }
        Q1.a aVar = Q1.a.f3113d;
        return w3;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object z(long j3, Y1.e eVar, R1.c cVar) {
        s0 s0Var;
        int i3;
        Z1.t tVar;
        if (cVar instanceof s0) {
            s0Var = (s0) cVar;
            int i4 = s0Var.f5388f;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                s0Var.f5388f = i4 - Integer.MIN_VALUE;
                Object obj = s0Var.f5387e;
                Q1.a aVar = Q1.a.f3113d;
                i3 = s0Var.f5388f;
                if (i3 != 0) {
                    I2.l.Q(obj);
                    if (j3 <= 0) {
                        return null;
                    }
                    Z1.t tVar2 = new Z1.t();
                    try {
                        s0Var.f5386d = tVar2;
                        s0Var.f5388f = 1;
                        r0 r0Var = new r0(j3, s0Var);
                        tVar2.f3480d = r0Var;
                        obj = u(r0Var, eVar);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } catch (q0 e3) {
                        e = e3;
                        tVar = tVar2;
                        if (e.f5381d != tVar.f3480d) {
                        }
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    tVar = s0Var.f5386d;
                    try {
                        I2.l.Q(obj);
                    } catch (q0 e4) {
                        e = e4;
                        if (e.f5381d != tVar.f3480d) {
                            return null;
                        }
                        throw e;
                    }
                }
                return obj;
            }
        }
        s0Var = new s0(cVar);
        Object obj2 = s0Var.f5387e;
        Q1.a aVar2 = Q1.a.f3113d;
        i3 = s0Var.f5388f;
        if (i3 != 0) {
        }
        return obj2;
    }
}
