package c7;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final h7.s f1660a = new h7.s("RESUME_TOKEN", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final h7.s f1661b = new h7.s("REMOVED_TASK", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final h7.s f1662c = new h7.s("CLOSED_EMPTY", 0);

    /* renamed from: d, reason: collision with root package name */
    public static final h7.s f1663d = new h7.s("COMPLETING_ALREADY", 0);

    /* renamed from: e, reason: collision with root package name */
    public static final h7.s f1664e = new h7.s("COMPLETING_WAITING_CHILDREN", 0);

    /* renamed from: f, reason: collision with root package name */
    public static final h7.s f1665f = new h7.s("COMPLETING_RETRY", 0);

    /* renamed from: g, reason: collision with root package name */
    public static final h7.s f1666g = new h7.s("TOO_LATE_TO_CANCEL", 0);

    /* renamed from: h, reason: collision with root package name */
    public static final h7.s f1667h = new h7.s("SEALED", 0);

    /* renamed from: i, reason: collision with root package name */
    public static final k0 f1668i = new k0(false);

    /* renamed from: j, reason: collision with root package name */
    public static final k0 f1669j = new k0(true);

    public static final h7.c a(h6.i iVar) {
        if (iVar.u(u.f1748g) == null) {
            iVar = iVar.z(new z0(null));
        }
        return new h7.c(iVar);
    }

    public static n1 b() {
        return new n1(null);
    }

    public static final void c(x xVar, CancellationException cancellationException) {
        x0 x0Var = (x0) xVar.k().u(u.f1748g);
        if (x0Var != null) {
            x0Var.c(cancellationException);
        } else {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + xVar).toString());
        }
    }

    public static final Object d(q6.e eVar, h6.d dVar) {
        h7.p pVar = new h7.p(dVar, dVar.getContext());
        return j1.c.n0(pVar, pVar, eVar);
    }

    public static final Object e(long j8, j6.c cVar) {
        if (j8 > 0) {
            h hVar = new h(1, a8.m.A(cVar));
            hVar.r();
            if (j8 < Long.MAX_VALUE) {
                h(hVar.f1702j).k(j8, hVar);
            }
            Object q8 = hVar.q();
            if (q8 == i6.a.f4956f) {
                return q8;
            }
        }
        return d6.z.f2639a;
    }

    public static final void f(h6.i iVar) {
        x0 x0Var = (x0) iVar.u(u.f1748g);
        if (x0Var != null && !x0Var.b()) {
            throw x0Var.w();
        }
    }

    public static final h6.i g(h6.i iVar, h6.i iVar2, boolean z8) {
        Boolean bool = Boolean.FALSE;
        boolean booleanValue = ((Boolean) iVar.D(bool, new q(0))).booleanValue();
        boolean booleanValue2 = ((Boolean) iVar2.D(bool, new q(0))).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return iVar.z(iVar2);
        }
        q qVar = new q(1);
        h6.j jVar = h6.j.f4661f;
        h6.i iVar3 = (h6.i) iVar.D(jVar, qVar);
        Object obj = iVar2;
        if (booleanValue2) {
            obj = iVar2.D(jVar, new q(2));
        }
        return iVar3.z((h6.i) obj);
    }

    public static final d0 h(h6.i iVar) {
        h6.g u8 = iVar.u(h6.e.f4660f);
        d0 d0Var = u8 instanceof d0 ? (d0) u8 : null;
        return d0Var == null ? c0.f1677a : d0Var;
    }

    public static final String i(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final x0 j(h6.i iVar) {
        x0 x0Var = (x0) iVar.u(u.f1748g);
        if (x0Var != null) {
            return x0Var;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + iVar).toString());
    }

    public static final h k(h6.d dVar) {
        h hVar;
        h hVar2;
        if (!(dVar instanceof h7.f)) {
            return new h(1, dVar);
        }
        h7.f fVar = (h7.f) dVar;
        h7.s sVar = h7.a.f4666c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h7.f.f4676m;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(fVar);
            hVar = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(fVar, sVar);
                hVar2 = null;
                break;
            }
            if (obj instanceof h) {
                while (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, sVar)) {
                    if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                        break;
                    }
                }
                hVar2 = (h) obj;
                break loop0;
            }
            if (obj != sVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (hVar2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = h.f1699l;
            Object obj2 = atomicReferenceFieldUpdater2.get(hVar2);
            if (!(obj2 instanceof o) || ((o) obj2).f1721d == null) {
                h.f1698k.set(hVar2, 536870911);
                atomicReferenceFieldUpdater2.set(hVar2, b.f1671a);
                hVar = hVar2;
            } else {
                hVar2.m();
            }
            if (hVar != null) {
                return hVar;
            }
        }
        return new h(2, dVar);
    }

    public static final void l(h6.i iVar, Throwable th) {
        try {
            v vVar = (v) iVar.u(u.f1747f);
            if (vVar != null) {
                vVar.Q(th);
            } else {
                h7.a.d(iVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                d6.a.a(runtimeException, th);
                th = runtimeException;
            }
            h7.a.d(iVar, th);
        }
    }

    public static final i0 m(x0 x0Var, boolean z8, b1 b1Var) {
        if (x0Var instanceof f1) {
            return ((f1) x0Var).L(z8, b1Var);
        }
        return x0Var.n(b1Var.k(), z8, new a1(1, b1Var, b1.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 0, 0));
    }

    public static final boolean n(x xVar) {
        x0 x0Var = (x0) xVar.k().u(u.f1748g);
        if (x0Var != null) {
            return x0Var.b();
        }
        return true;
    }

    public static final boolean o(h6.i iVar) {
        x0 x0Var = (x0) iVar.u(u.f1748g);
        if (x0Var != null) {
            return x0Var.b();
        }
        return true;
    }

    public static m1 p(x xVar, h6.i iVar, y yVar, q6.e eVar, int i7) {
        if ((i7 & 1) != 0) {
            iVar = h6.j.f4661f;
        }
        if ((i7 & 2) != 0) {
            yVar = y.f1756f;
        }
        h6.i g9 = g(xVar.k(), iVar, true);
        j7.e eVar2 = g0.f1696a;
        if (g9 != eVar2 && g9.u(h6.e.f4660f) == null) {
            g9 = g9.z(eVar2);
        }
        m1 g1Var = yVar == y.f1757g ? new g1(g9, eVar) : new m1(g9, true);
        g1Var.f0(yVar, g1Var, eVar);
        return g1Var;
    }

    public static final Object q(Object obj) {
        return obj instanceof p ? d6.a.b(((p) obj).f1725a) : obj;
    }

    public static final void r(h hVar, h6.d dVar, boolean z8) {
        Object obj = h.f1699l.get(hVar);
        Throwable d8 = hVar.d(obj);
        Object b9 = d8 != null ? d6.a.b(d8) : hVar.e(obj);
        if (!z8) {
            dVar.resumeWith(b9);
            return;
        }
        r6.k.d(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        h7.f fVar = (h7.f) dVar;
        j6.c cVar = fVar.f4678j;
        Object obj2 = fVar.f4680l;
        h6.i context = cVar.getContext();
        Object l8 = h7.a.l(context, obj2);
        u1 w4 = l8 != h7.a.f4667d ? w(cVar, context, l8) : null;
        try {
            cVar.resumeWith(b9);
            if (w4 == null || w4.g0()) {
                h7.a.g(context, l8);
            }
        } catch (Throwable th) {
            if (w4 == null || w4.g0()) {
                h7.a.g(context, l8);
            }
            throw th;
        }
    }

    public static final Object s(d7.e eVar, q6.e eVar2) {
        q0 q0Var;
        h6.i g9;
        Thread currentThread = Thread.currentThread();
        h6.e eVar3 = h6.e.f4660f;
        h6.f fVar = (h6.f) eVar.u(eVar3);
        h6.j jVar = h6.j.f4661f;
        if (fVar == null) {
            q0Var = p1.a();
            g9 = g(jVar, t6.a.I(eVar, q0Var), true);
            j7.e eVar4 = g0.f1696a;
            if (g9 != eVar4 && g9.u(eVar3) == null) {
                g9 = g9.z(eVar4);
            }
        } else {
            if (fVar instanceof q0) {
            }
            q0Var = (q0) p1.f1729a.get();
            g9 = g(jVar, eVar, true);
            j7.e eVar5 = g0.f1696a;
            if (g9 != eVar5 && g9.u(eVar3) == null) {
                g9 = g9.z(eVar5);
            }
        }
        c cVar = new c(g9, currentThread, q0Var);
        cVar.f0(y.f1756f, cVar, eVar2);
        q0 q0Var2 = cVar.f1676j;
        if (q0Var2 != null) {
            int i7 = q0.f1731k;
            q0Var2.c0(false);
        }
        while (!Thread.interrupted()) {
            try {
                long d02 = q0Var2 != null ? q0Var2.d0() : Long.MAX_VALUE;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1.f1692f;
                if (!(atomicReferenceFieldUpdater.get(cVar) instanceof u0)) {
                    if (q0Var2 != null) {
                        int i8 = q0.f1731k;
                        q0Var2.Z(false);
                    }
                    Object v5 = v(atomicReferenceFieldUpdater.get(cVar));
                    p pVar = v5 instanceof p ? (p) v5 : null;
                    if (pVar == null) {
                        return v5;
                    }
                    throw pVar.f1725a;
                }
                LockSupport.parkNanos(cVar, d02);
            } catch (Throwable th) {
                if (q0Var2 != null) {
                    int i9 = q0.f1731k;
                    q0Var2.Z(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        cVar.m(interruptedException);
        throw interruptedException;
    }

    public static final Object t(r1 r1Var, q6.e eVar) {
        Object pVar;
        Object P;
        m(r1Var, true, new j0(0, h(r1Var.f4702i.getContext()).U(r1Var.f1737j, r1Var, r1Var.f1659h)));
        try {
            if (eVar instanceof j6.a) {
                r6.y.d(2, eVar);
                pVar = eVar.d(r1Var, r1Var);
            } else {
                pVar = a8.m.N(eVar, r1Var, r1Var);
            }
        } catch (Throwable th) {
            pVar = new p(th, false);
        }
        i6.a aVar = i6.a.f4956f;
        if (pVar == aVar || (P = r1Var.P(pVar)) == f1664e) {
            return aVar;
        }
        if (P instanceof p) {
            Throwable th2 = ((p) P).f1725a;
            if (!(th2 instanceof q1)) {
                throw th2;
            }
            if (((q1) th2).f1735f != r1Var) {
                throw th2;
            }
            if (pVar instanceof p) {
                throw ((p) pVar).f1725a;
            }
        } else {
            pVar = v(P);
        }
        return pVar;
    }

    public static final String u(h6.d dVar) {
        Object b9;
        if (dVar instanceof h7.f) {
            return ((h7.f) dVar).toString();
        }
        try {
            b9 = dVar + '@' + i(dVar);
        } catch (Throwable th) {
            b9 = d6.a.b(th);
        }
        if (d6.m.a(b9) != null) {
            b9 = dVar.getClass().getName() + '@' + i(dVar);
        }
        return (String) b9;
    }

    public static final Object v(Object obj) {
        u0 u0Var;
        v0 v0Var = obj instanceof v0 ? (v0) obj : null;
        return (v0Var == null || (u0Var = v0Var.f1750a) == null) ? obj : u0Var;
    }

    public static final u1 w(h6.d dVar, h6.i iVar, Object obj) {
        u1 u1Var = null;
        if ((dVar instanceof j6.d) && iVar.u(v1.f1751f) != null) {
            j6.d dVar2 = (j6.d) dVar;
            while (true) {
                if ((dVar2 instanceof e0) || (dVar2 = dVar2.getCallerFrame()) == null) {
                    break;
                }
                if (dVar2 instanceof u1) {
                    u1Var = (u1) dVar2;
                    break;
                }
            }
            if (u1Var != null) {
                u1Var.h0(iVar, obj);
            }
        }
        return u1Var;
    }

    public static final Object x(h6.i iVar, q6.e eVar, h6.d dVar) {
        h6.i context = dVar.getContext();
        h6.i z8 = !((Boolean) iVar.D(Boolean.FALSE, new q(0))).booleanValue() ? context.z(iVar) : g(context, iVar, false);
        f(z8);
        if (z8 == context) {
            h7.p pVar = new h7.p(dVar, z8);
            return j1.c.n0(pVar, pVar, eVar);
        }
        h6.e eVar2 = h6.e.f4660f;
        if (r6.k.a(z8.u(eVar2), context.u(eVar2))) {
            u1 u1Var = new u1(dVar, z8);
            h6.i iVar2 = u1Var.f1659h;
            Object l8 = h7.a.l(iVar2, null);
            try {
                return j1.c.n0(u1Var, u1Var, eVar);
            } finally {
                h7.a.g(iVar2, l8);
            }
        }
        e0 e0Var = new e0(dVar, z8);
        try {
            h7.a.h(a8.m.A(a8.m.q(e0Var, e0Var, eVar)), d6.z.f2639a);
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = e0.f1686j;
            do {
                int i7 = atomicIntegerFieldUpdater.get(e0Var);
                if (i7 != 0) {
                    if (i7 != 2) {
                        throw new IllegalStateException("Already suspended");
                    }
                    Object v5 = v(f1.f1692f.get(e0Var));
                    if (v5 instanceof p) {
                        throw ((p) v5).f1725a;
                    }
                    return v5;
                }
            } while (!atomicIntegerFieldUpdater.compareAndSet(e0Var, 0, 1));
            return i6.a.f4956f;
        } catch (Throwable th) {
            e0Var.resumeWith(d6.a.b(th));
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005d A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object y(long j8, q6.e eVar, j6.c cVar) {
        s1 s1Var;
        int i7;
        r6.v vVar;
        if (cVar instanceof s1) {
            s1Var = (s1) cVar;
            int i8 = s1Var.f1743h;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                s1Var.f1743h = i8 - Integer.MIN_VALUE;
                Object obj = s1Var.f1742g;
                i7 = s1Var.f1743h;
                if (i7 != 0) {
                    d6.a.e(obj);
                    if (j8 <= 0) {
                        return null;
                    }
                    r6.v vVar2 = new r6.v();
                    try {
                        s1Var.f1741f = vVar2;
                        s1Var.f1743h = 1;
                        r1 r1Var = new r1(j8, s1Var);
                        vVar2.f7968f = r1Var;
                        Object t2 = t(r1Var, eVar);
                        i6.a aVar = i6.a.f4956f;
                        return t2 == aVar ? aVar : t2;
                    } catch (q1 e9) {
                        e = e9;
                        vVar = vVar2;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    vVar = s1Var.f1741f;
                    try {
                        d6.a.e(obj);
                        return obj;
                    } catch (q1 e10) {
                        e = e10;
                    }
                }
                if (e.f1735f != vVar.f7968f) {
                    return null;
                }
                throw e;
            }
        }
        s1Var = new s1(cVar);
        Object obj2 = s1Var.f1742g;
        i7 = s1Var.f1743h;
        if (i7 != 0) {
        }
        if (e.f1735f != vVar.f7968f) {
        }
    }

    public static final Object z(j6.c cVar) {
        Object obj;
        h6.i context = cVar.getContext();
        f(context);
        h6.d A = a8.m.A(cVar);
        h7.f fVar = A instanceof h7.f ? (h7.f) A : null;
        Object obj2 = i6.a.f4956f;
        Object obj3 = d6.z.f2639a;
        if (fVar == null) {
            obj = obj3;
        } else {
            t tVar = fVar.f4677i;
            if (tVar.X(context)) {
                fVar.f4679k = obj3;
                fVar.f1691h = 1;
                tVar.W(context, fVar);
            } else {
                h6.i z8 = context.z(new x1(x1.f1755g));
                fVar.f4679k = obj3;
                fVar.f1691h = 1;
                tVar.W(z8, fVar);
            }
            obj = obj2;
        }
        return obj == obj2 ? obj : obj3;
    }
}
