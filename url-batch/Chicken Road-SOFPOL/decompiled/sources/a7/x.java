package a7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static final d4.t f310a = new d4.t("RESUME_TOKEN", 1);

    /* renamed from: b, reason: collision with root package name */
    public static final d4.t f311b = new d4.t("REMOVED_TASK", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final d4.t f312c = new d4.t("CLOSED_EMPTY", 1);

    /* renamed from: d, reason: collision with root package name */
    public static final d4.t f313d = new d4.t("COMPLETING_ALREADY", 1);

    /* renamed from: e, reason: collision with root package name */
    public static final d4.t f314e = new d4.t("COMPLETING_WAITING_CHILDREN", 1);

    /* renamed from: f, reason: collision with root package name */
    public static final d4.t f315f = new d4.t("COMPLETING_RETRY", 1);

    /* renamed from: g, reason: collision with root package name */
    public static final d4.t f316g = new d4.t("TOO_LATE_TO_CANCEL", 1);

    /* renamed from: h, reason: collision with root package name */
    public static final d4.t f317h = new d4.t("SEALED", 1);
    public static final g0 i = new g0(false);

    /* renamed from: j, reason: collision with root package name */
    public static final g0 f318j = new g0(true);

    public static final f7.c a(g6.h hVar) {
        if (hVar.l(r.f297e) == null) {
            hVar = hVar.c(new u0(null));
        }
        return new f7.c(hVar);
    }

    public static final Object b(p6.e eVar, g6.c cVar) {
        f7.q qVar = new f7.q(cVar, cVar.f());
        return s6.a.H(qVar, qVar, eVar);
    }

    public static final Object c(long j7, i6.c cVar) {
        if (j7 > 0) {
            h hVar = new h(1, m.a.G(cVar));
            hVar.t();
            if (j7 < Long.MAX_VALUE) {
                f(hVar.f261h).f(j7, hVar);
            }
            Object s5 = hVar.s();
            if (s5 == h6.a.f3204d) {
                return s5;
            }
        }
        return c6.m.f1757a;
    }

    public static final void d(g6.h hVar) {
        s0 s0Var = (s0) hVar.l(r.f297e);
        if (s0Var != null && !s0Var.b()) {
            throw s0Var.p();
        }
    }

    public static final g6.h e(g6.h hVar, g6.h hVar2, boolean z3) {
        Boolean bool = Boolean.FALSE;
        boolean booleanValue = ((Boolean) hVar.g(bool, new a0.w0(3))).booleanValue();
        boolean booleanValue2 = ((Boolean) hVar2.g(bool, new a0.w0(3))).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return hVar.c(hVar2);
        }
        a0.w0 w0Var = new a0.w0(1);
        g6.i iVar = g6.i.f3046d;
        g6.h hVar3 = (g6.h) hVar.g(iVar, w0Var);
        Object obj = hVar2;
        if (booleanValue2) {
            obj = hVar2.g(iVar, new a0.w0(2));
        }
        return hVar3.c((g6.h) obj);
    }

    public static final a0 f(g6.h hVar) {
        g6.f l3 = hVar.l(g6.d.f3045d);
        a0 a0Var = l3 instanceof a0 ? (a0) l3 : null;
        return a0Var == null ? z.f325a : a0Var;
    }

    public static final String g(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final s0 h(g6.h hVar) {
        s0 s0Var = (s0) hVar.l(r.f297e);
        if (s0Var != null) {
            return s0Var;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + hVar).toString());
    }

    public static final h i(g6.c cVar) {
        h hVar;
        h hVar2;
        if (!(cVar instanceof f7.f)) {
            return new h(1, cVar);
        }
        f7.f fVar = (f7.f) cVar;
        d4.t tVar = f7.a.f2762c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7.f.f2772k;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(fVar);
            hVar = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(fVar, tVar);
                hVar2 = null;
                break;
            }
            if (obj instanceof h) {
                while (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, tVar)) {
                    if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                        break;
                    }
                }
                hVar2 = (h) obj;
                break loop0;
            }
            if (obj != tVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (hVar2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = h.f258j;
            Object obj2 = atomicReferenceFieldUpdater2.get(hVar2);
            if (!(obj2 instanceof n) || ((n) obj2).f282d == null) {
                h.i.set(hVar2, 536870911);
                atomicReferenceFieldUpdater2.set(hVar2, b.f242a);
                hVar = hVar2;
            } else {
                hVar2.p();
            }
            if (hVar != null) {
                return hVar;
            }
        }
        return new h(2, cVar);
    }

    public static final void j(g6.h hVar, Throwable th) {
        try {
            s sVar = (s) hVar.l(r.f296d);
            if (sVar != null) {
                sVar.n(hVar, th);
            } else {
                f7.a.d(hVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                s6.a.e(runtimeException, th);
                th = runtimeException;
            }
            f7.a.d(hVar, th);
        }
    }

    public static final e0 k(s0 s0Var, boolean z3, w0 w0Var) {
        if (s0Var instanceof a1) {
            return ((a1) s0Var).Q(z3, w0Var);
        }
        return s0Var.q(w0Var.k(), z3, new v0(1, w0Var, w0.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 0, 0));
    }

    public static final boolean l(u uVar) {
        s0 s0Var = (s0) uVar.h().l(r.f297e);
        if (s0Var != null) {
            return s0Var.b();
        }
        return true;
    }

    public static final boolean m(g6.h hVar) {
        s0 s0Var = (s0) hVar.l(r.f297e);
        if (s0Var != null) {
            return s0Var.b();
        }
        return true;
    }

    public static h1 n(u uVar, g6.h hVar, p6.e eVar, int i8) {
        if ((i8 & 1) != 0) {
            hVar = g6.i.f3046d;
        }
        v vVar = (i8 & 2) != 0 ? v.f303d : v.f306g;
        g6.h e8 = e(uVar.h(), hVar, true);
        h7.e eVar2 = d0.f249a;
        if (e8 != eVar2 && e8.l(g6.d.f3045d) == null) {
            e8 = e8.c(eVar2);
        }
        h1 b1Var = vVar == v.f304e ? new b1(e8, eVar) : new h1(e8, true);
        b1Var.h0(vVar, b1Var, eVar);
        return b1Var;
    }

    public static final Object o(Object obj) {
        return obj instanceof o ? s6.a.l(((o) obj).f286a) : obj;
    }

    public static final void p(h hVar, g6.c cVar, boolean z3) {
        Object obj = h.f258j.get(hVar);
        Throwable d8 = hVar.d(obj);
        Object l3 = d8 != null ? s6.a.l(d8) : hVar.g(obj);
        if (!z3) {
            cVar.k(l3);
            return;
        }
        q6.i.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        f7.f fVar = (f7.f) cVar;
        i6.c cVar2 = fVar.f2774h;
        Object obj2 = fVar.f2775j;
        g6.h f6 = cVar2.f();
        Object l7 = f7.a.l(f6, obj2);
        q1 t3 = l7 != f7.a.f2763d ? t(cVar2, f6, l7) : null;
        try {
            cVar2.k(l3);
            if (t3 == null || t3.i0()) {
                f7.a.g(f6, l7);
            }
        } catch (Throwable th) {
            if (t3 == null || t3.i0()) {
                f7.a.g(f6, l7);
            }
            throw th;
        }
    }

    public static final Object q(n1 n1Var, p6.e eVar) {
        Object oVar;
        Object T;
        k(n1Var, true, new f0(0, f(n1Var.f2797g.f()).e(n1Var.f284h, n1Var, n1Var.f239f)));
        try {
            if (eVar instanceof i6.a) {
                q6.v.c(2, eVar);
                oVar = eVar.g(n1Var, n1Var);
            } else {
                oVar = m.a.S(eVar, n1Var, n1Var);
            }
        } catch (Throwable th) {
            oVar = new o(th, false);
        }
        h6.a aVar = h6.a.f3204d;
        if (oVar == aVar || (T = n1Var.T(oVar)) == f314e) {
            return aVar;
        }
        if (T instanceof o) {
            Throwable th2 = ((o) T).f286a;
            if (!(th2 instanceof m1)) {
                throw th2;
            }
            if (((m1) th2).f278d != n1Var) {
                throw th2;
            }
            if (oVar instanceof o) {
                throw ((o) oVar).f286a;
            }
        } else {
            oVar = s(T);
        }
        return oVar;
    }

    public static final String r(g6.c cVar) {
        Object l3;
        if (cVar instanceof f7.f) {
            return ((f7.f) cVar).toString();
        }
        try {
            l3 = cVar + '@' + g(cVar);
        } catch (Throwable th) {
            l3 = s6.a.l(th);
        }
        if (c6.i.a(l3) != null) {
            l3 = cVar.getClass().getName() + '@' + g(cVar);
        }
        return (String) l3;
    }

    public static final Object s(Object obj) {
        p0 p0Var;
        q0 q0Var = obj instanceof q0 ? (q0) obj : null;
        return (q0Var == null || (p0Var = q0Var.f294a) == null) ? obj : p0Var;
    }

    public static final q1 t(g6.c cVar, g6.h hVar, Object obj) {
        q1 q1Var = null;
        if ((cVar instanceof i6.d) && hVar.l(r1.f299d) != null) {
            i6.d dVar = (i6.d) cVar;
            while (true) {
                if ((dVar instanceof b0) || (dVar = dVar.e()) == null) {
                    break;
                }
                if (dVar instanceof q1) {
                    q1Var = (q1) dVar;
                    break;
                }
            }
            if (q1Var != null) {
                q1Var.j0(hVar, obj);
            }
        }
        return q1Var;
    }

    public static final Object u(g6.h hVar, p6.e eVar, g6.c cVar) {
        g6.h f6 = cVar.f();
        g6.h c8 = !((Boolean) hVar.g(Boolean.FALSE, new a0.w0(3))).booleanValue() ? f6.c(hVar) : e(f6, hVar, false);
        d(c8);
        if (c8 == f6) {
            f7.q qVar = new f7.q(cVar, c8);
            return s6.a.H(qVar, qVar, eVar);
        }
        g6.d dVar = g6.d.f3045d;
        if (q6.i.a(c8.l(dVar), f6.l(dVar))) {
            q1 q1Var = new q1(cVar, c8);
            g6.h hVar2 = q1Var.f239f;
            Object l3 = f7.a.l(hVar2, null);
            try {
                return s6.a.H(q1Var, q1Var, eVar);
            } finally {
                f7.a.g(hVar2, l3);
            }
        }
        b0 b0Var = new b0(cVar, c8);
        try {
            f7.a.h(m.a.G(m.a.o(b0Var, b0Var, eVar)), c6.m.f1757a);
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b0.f243h;
            do {
                int i8 = atomicIntegerFieldUpdater.get(b0Var);
                if (i8 != 0) {
                    if (i8 != 2) {
                        throw new IllegalStateException("Already suspended");
                    }
                    Object s5 = s(a1.f240d.get(b0Var));
                    if (s5 instanceof o) {
                        throw ((o) s5).f286a;
                    }
                    return s5;
                }
            } while (!atomicIntegerFieldUpdater.compareAndSet(b0Var, 0, 1));
            return h6.a.f3204d;
        } catch (Throwable th) {
            b0Var.k(s6.a.l(th));
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
    public static final Object v(long j7, p6.e eVar, i6.c cVar) {
        o1 o1Var;
        int i8;
        q6.s sVar;
        if (cVar instanceof o1) {
            o1Var = (o1) cVar;
            int i9 = o1Var.i;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                o1Var.i = i9 - Integer.MIN_VALUE;
                Object obj = o1Var.f289h;
                i8 = o1Var.i;
                if (i8 != 0) {
                    s6.a.K(obj);
                    if (j7 <= 0) {
                        return null;
                    }
                    q6.s sVar2 = new q6.s();
                    try {
                        o1Var.f288g = sVar2;
                        o1Var.i = 1;
                        n1 n1Var = new n1(j7, o1Var);
                        sVar2.f6205d = n1Var;
                        Object q4 = q(n1Var, eVar);
                        h6.a aVar = h6.a.f3204d;
                        return q4 == aVar ? aVar : q4;
                    } catch (m1 e8) {
                        e = e8;
                        sVar = sVar2;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sVar = o1Var.f288g;
                    try {
                        s6.a.K(obj);
                        return obj;
                    } catch (m1 e9) {
                        e = e9;
                    }
                }
                if (e.f278d != sVar.f6205d) {
                    return null;
                }
                throw e;
            }
        }
        o1Var = new o1(cVar);
        Object obj2 = o1Var.f289h;
        i8 = o1Var.i;
        if (i8 != 0) {
        }
        if (e.f278d != sVar.f6205d) {
        }
    }
}
