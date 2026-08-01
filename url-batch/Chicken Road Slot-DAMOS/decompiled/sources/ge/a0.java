package ge;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final a8.f f4323a;

    /* renamed from: b, reason: collision with root package name */
    public static final a8.f f4324b;

    /* renamed from: c, reason: collision with root package name */
    public static final a8.f f4325c;

    /* renamed from: d, reason: collision with root package name */
    public static final a8.f f4326d;

    /* renamed from: e, reason: collision with root package name */
    public static final a8.f f4327e;

    /* renamed from: f, reason: collision with root package name */
    public static final a8.f f4328f;
    public static final a8.f g;

    /* renamed from: h, reason: collision with root package name */
    public static final a8.f f4329h;

    /* renamed from: i, reason: collision with root package name */
    public static final o0 f4330i = new o0(false);
    public static final o0 j = new o0(true);

    static {
        int i3 = 3;
        f4323a = new a8.f("RESUME_TOKEN", i3);
        f4324b = new a8.f("REMOVED_TASK", i3);
        f4325c = new a8.f("CLOSED_EMPTY", i3);
        f4326d = new a8.f("COMPLETING_ALREADY", i3);
        f4327e = new a8.f("COMPLETING_WAITING_CHILDREN", i3);
        f4328f = new a8.f("COMPLETING_RETRY", i3);
        g = new a8.f("TOO_LATE_TO_CANCEL", i3);
        f4329h = new a8.f("SEALED", i3);
    }

    public static final Object A(Object obj) {
        z0 z0Var;
        a1 a1Var = obj instanceof a1 ? (a1) obj : null;
        return (a1Var == null || (z0Var = a1Var.f4331a) == null) ? obj : z0Var;
    }

    public static final Object B(CoroutineContext coroutineContext, Function2 function2, ld.a aVar) {
        Object A;
        CoroutineContext context = aVar.getContext();
        CoroutineContext p4 = !((Boolean) coroutineContext.z(Boolean.FALSE, new a1.e(7, (byte) 0))).booleanValue() ? context.p(coroutineContext) : r.a(context, coroutineContext, false);
        j(p4);
        if (p4 == context) {
            le.r rVar = new le.r(p4, aVar);
            A = cf.c.K(rVar, true, rVar, function2);
        } else {
            ld.b bVar = kotlin.coroutines.d.f5591n;
            if (Intrinsics.a(p4.m(bVar), context.m(bVar))) {
                z1 z1Var = new z1(p4, aVar);
                CoroutineContext coroutineContext2 = z1Var.f4322i;
                Object c10 = le.v.c(coroutineContext2, null);
                try {
                    Object K = cf.c.K(z1Var, true, z1Var, function2);
                    le.v.a(coroutineContext2, c10);
                    A = K;
                } catch (Throwable th) {
                    le.v.a(coroutineContext2, c10);
                    throw th;
                }
            } else {
                h0 h0Var = new h0(p4, aVar);
                c6.f.d0(function2, h0Var, h0Var);
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h0.f4358s;
                while (true) {
                    int i3 = atomicIntegerFieldUpdater.get(h0Var);
                    if (i3 != 0) {
                        if (i3 != 2) {
                            kotlin.collections.i0.l("Already suspended");
                            return null;
                        }
                        A = A(k1.f4374d.get(h0Var));
                        if (A instanceof q) {
                            throw ((q) A).f4394a;
                        }
                    } else if (atomicIntegerFieldUpdater.compareAndSet(h0Var, 0, 1)) {
                        A = md.a.f6622d;
                        break;
                    }
                }
            }
        }
        md.a aVar2 = md.a.f6622d;
        return A;
    }

    public static final Object C(long j3, Function2 function2, nd.c cVar) {
        if (j3 <= 0) {
            throw new v1("Timed out immediately", null);
        }
        Object y3 = y(new w1(j3, cVar), function2);
        md.a aVar = md.a.f6622d;
        return y3;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005c A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object D(long j3, Function2 function2, ld.a aVar) {
        x1 x1Var;
        int i3;
        wd.b0 b0Var;
        if (aVar instanceof x1) {
            x1Var = (x1) aVar;
            int i10 = x1Var.f4416i;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                x1Var.f4416i = i10 - Integer.MIN_VALUE;
                Object obj = x1Var.f4415e;
                md.a aVar2 = md.a.f6622d;
                i3 = x1Var.f4416i;
                if (i3 != 0) {
                    cf.c.M(obj);
                    if (j3 <= 0) {
                        return null;
                    }
                    wd.b0 b0Var2 = new wd.b0();
                    try {
                        x1Var.f4414d = b0Var2;
                        x1Var.f4416i = 1;
                        w1 w1Var = new w1(j3, x1Var);
                        b0Var2.f10141d = w1Var;
                        Object y3 = y(w1Var, function2);
                        return y3 == aVar2 ? aVar2 : y3;
                    } catch (v1 e2) {
                        e = e2;
                        b0Var = b0Var2;
                    }
                } else {
                    if (i3 != 1) {
                        kotlin.collections.i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b0Var = x1Var.f4414d;
                    try {
                        cf.c.M(obj);
                        return obj;
                    } catch (v1 e9) {
                        e = e9;
                    }
                }
                if (e.f4408d != b0Var.f10141d) {
                    return null;
                }
                throw e;
            }
        }
        x1Var = new x1(aVar);
        Object obj2 = x1Var.f4415e;
        md.a aVar22 = md.a.f6622d;
        i3 = x1Var.f4416i;
        if (i3 != 0) {
        }
        if (e.f4408d != b0Var.f10141d) {
        }
    }

    public static final Object E(nd.c cVar) {
        Object obj;
        CoroutineContext context = cVar.getContext();
        j(context);
        ld.a b10 = md.f.b(cVar);
        le.g gVar = b10 instanceof le.g ? (le.g) b10 : null;
        if (gVar == null) {
            obj = Unit.f5554a;
        } else {
            t tVar = gVar.f5973r;
            if (le.b.i(tVar, context)) {
                gVar.f5975t = Unit.f5554a;
                gVar.f4361i = 1;
                tVar.M(context, gVar);
            } else {
                c2 c2Var = new c2(c2.f4341i);
                CoroutineContext p4 = context.p(c2Var);
                Unit unit = Unit.f5554a;
                gVar.f5975t = unit;
                gVar.f4361i = 1;
                tVar.M(p4, gVar);
                if (c2Var.f4342e) {
                    p0 a9 = u1.a();
                    kotlin.collections.s sVar = a9.f4392s;
                    if (!(sVar != null ? sVar.isEmpty() : true)) {
                        if (a9.f4390i >= 4294967296L) {
                            gVar.f5975t = unit;
                            gVar.f4361i = 1;
                            a9.Q(gVar);
                            obj = md.a.f6622d;
                        } else {
                            a9.R(true);
                            try {
                                gVar.run();
                                do {
                                } while (a9.T());
                            } finally {
                                try {
                                } finally {
                                }
                            }
                        }
                    }
                    obj = Unit.f5554a;
                }
            }
            obj = md.a.f6622d;
        }
        return obj == md.a.f6622d ? obj : Unit.f5554a;
    }

    public static n a() {
        n nVar = new n(true);
        nVar.O(null);
        return nVar;
    }

    public static final le.d b(CoroutineContext coroutineContext) {
        if (coroutineContext.m(u.f4403e) == null) {
            coroutineContext = coroutineContext.p(c());
        }
        return new le.d(coroutineContext);
    }

    public static e1 c() {
        return new e1(null);
    }

    public static s1 d() {
        return new s1(null);
    }

    public static e0 e(x xVar, CoroutineContext coroutineContext, Function2 function2, int i3) {
        if ((i3 & 1) != 0) {
            coroutineContext = kotlin.coroutines.g.f5592d;
        }
        y yVar = y.f4417d;
        CoroutineContext b10 = r.b(xVar, coroutineContext);
        y yVar2 = y.f4417d;
        e0 e0Var = new e0(b10, true);
        e0Var.h0(yVar, e0Var, function2);
        return e0Var;
    }

    public static final void f(x xVar, d1.m mVar) {
        c1 c1Var = (c1) xVar.h().m(u.f4403e);
        if (c1Var != null) {
            c1Var.a(mVar);
        } else {
            a2.r.n(xVar, "Scope cannot be cancelled because it does not have a job: ");
        }
    }

    public static final void g(CoroutineContext coroutineContext, CancellationException cancellationException) {
        c1 c1Var = (c1) coroutineContext.m(u.f4403e);
        if (c1Var != null) {
            c1Var.a(cancellationException);
        }
    }

    public static final Object h(Function2 function2, ld.a aVar) {
        le.r rVar = new le.r(aVar.getContext(), aVar);
        Object K = cf.c.K(rVar, true, rVar, function2);
        md.a aVar2 = md.a.f6622d;
        return K;
    }

    public static final Object i(long j3, ld.a aVar) {
        if (j3 <= 0) {
            return Unit.f5554a;
        }
        h hVar = new h(1, md.f.b(aVar));
        hVar.s();
        if (j3 < Long.MAX_VALUE) {
            l(hVar.f4357s).h(j3, hVar);
        }
        Object r9 = hVar.r();
        return r9 == md.a.f6622d ? r9 : Unit.f5554a;
    }

    public static final void j(CoroutineContext coroutineContext) {
        c1 c1Var = (c1) coroutineContext.m(u.f4403e);
        if (c1Var != null && !c1Var.d()) {
            throw c1Var.x();
        }
    }

    public static final t k(Executor executor) {
        return new w0(executor);
    }

    public static final f0 l(CoroutineContext coroutineContext) {
        CoroutineContext.Element m10 = coroutineContext.m(kotlin.coroutines.d.f5591n);
        f0 f0Var = m10 instanceof f0 ? (f0) m10 : null;
        return f0Var == null ? c0.f4340a : f0Var;
    }

    public static final String m(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final h n(ld.a aVar) {
        h hVar;
        h hVar2;
        if (!(aVar instanceof le.g)) {
            return new h(1, aVar);
        }
        le.g gVar = (le.g) aVar;
        a8.f fVar = le.b.f5966c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = le.g.f5972v;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(gVar);
            hVar = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(gVar, fVar);
                hVar2 = null;
                break;
            }
            if (obj instanceof h) {
                while (!atomicReferenceFieldUpdater.compareAndSet(gVar, obj, fVar)) {
                    if (atomicReferenceFieldUpdater.get(gVar) != obj) {
                        break;
                    }
                }
                hVar2 = (h) obj;
                break loop0;
            }
            if (obj != fVar && !(obj instanceof Throwable)) {
                a2.r.n(obj, "Inconsistent state ");
                return null;
            }
        }
        if (hVar2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = h.f4354u;
            Object obj2 = atomicReferenceFieldUpdater2.get(hVar2);
            if (!(obj2 instanceof p) || ((p) obj2).f4387d == null) {
                h.f4353t.set(hVar2, 536870911);
                atomicReferenceFieldUpdater2.set(hVar2, b.f4333a);
                hVar = hVar2;
            } else {
                hVar2.o();
            }
            if (hVar != null) {
                return hVar;
            }
        }
        return new h(2, aVar);
    }

    public static final void o(Throwable th, CoroutineContext coroutineContext) {
        if (th instanceof g0) {
            th = ((g0) th).f4351d;
        }
        try {
            v vVar = (v) coroutineContext.m(u.f4402d);
            if (vVar != null) {
                vVar.J(th, coroutineContext);
            } else {
                le.b.d(th, coroutineContext);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                hd.b.a(runtimeException, th);
                th = runtimeException;
            }
            le.b.d(th, coroutineContext);
        }
    }

    public static final m0 p(c1 c1Var, boolean z10, g1 g1Var) {
        if (c1Var instanceof k1) {
            return ((k1) c1Var).P(z10, g1Var);
        }
        return c1Var.u(g1Var.k(), z10, new f1(1, g1Var, g1.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 0));
    }

    public static final boolean q(CoroutineContext coroutineContext) {
        c1 c1Var = (c1) coroutineContext.m(u.f4403e);
        if (c1Var != null) {
            return c1Var.d();
        }
        return true;
    }

    public static final r1 r(x xVar, CoroutineContext coroutineContext, y yVar, Function2 function2) {
        CoroutineContext b10 = r.b(xVar, coroutineContext);
        yVar.getClass();
        r1 l1Var = yVar == y.f4418e ? new l1(b10, function2) : new r1(b10, true);
        l1Var.h0(yVar, l1Var, function2);
        return l1Var;
    }

    public static /* synthetic */ r1 s(x xVar, CoroutineContext coroutineContext, Function2 function2, int i3) {
        y yVar = y.f4420r;
        if ((i3 & 1) != 0) {
            coroutineContext = kotlin.coroutines.g.f5592d;
        }
        if ((i3 & 2) != 0) {
            yVar = y.f4417d;
        }
        return r(xVar, coroutineContext, yVar, function2);
    }

    public static final w0 t(String str) {
        return new w0(Executors.unconfigurableExecutorService(Executors.newScheduledThreadPool(1, new c4.a(str, new AtomicInteger()))));
    }

    public static final Object u(Object obj) {
        if (obj instanceof q) {
            hd.l lVar = hd.n.f4511e;
            return cf.c.n(((q) obj).f4394a);
        }
        hd.l lVar2 = hd.n.f4511e;
        return obj;
    }

    public static final void v(h hVar, ld.a aVar, boolean z10) {
        Object h10;
        Object obj = h.f4354u.get(hVar);
        Throwable d10 = hVar.d(obj);
        if (d10 != null) {
            hd.l lVar = hd.n.f4511e;
            h10 = new hd.m(d10);
        } else {
            hd.l lVar2 = hd.n.f4511e;
            h10 = hVar.h(obj);
        }
        if (!z10) {
            aVar.resumeWith(h10);
            return;
        }
        aVar.getClass();
        le.g gVar = (le.g) aVar;
        nd.c cVar = gVar.f5974s;
        Object obj2 = gVar.f5976u;
        CoroutineContext context = cVar.getContext();
        Object c10 = le.v.c(context, obj2);
        z1 c11 = c10 != le.v.f6002a ? r.c(cVar, context, c10) : null;
        try {
            cVar.resumeWith(h10);
            if (c11 == null || c11.j0()) {
                le.v.a(context, c10);
            }
        } catch (Throwable th) {
            if (c11 == null || c11.j0()) {
                le.v.a(context, c10);
            }
            throw th;
        }
    }

    public static final Object w(CoroutineContext coroutineContext, Function2 function2) {
        p0 p0Var;
        CoroutineContext a9;
        long S;
        kotlin.coroutines.f fVar = kotlin.coroutines.d.f5591n;
        if (((kotlin.coroutines.d) coroutineContext.m(fVar)) == null) {
            p0Var = u1.a();
            a9 = r.a(kotlin.coroutines.g.f5592d, coroutineContext.p(p0Var), true);
            ne.e eVar = k0.f4372a;
            if (a9 != eVar && a9.m(fVar) == null) {
                a9 = a9.p(eVar);
            }
        } else {
            p0Var = (p0) u1.f4407a.get();
            a9 = r.a(kotlin.coroutines.g.f5592d, coroutineContext, true);
            ne.e eVar2 = k0.f4372a;
            if (a9 != eVar2 && a9.m(fVar) == null) {
                a9 = a9.p(eVar2);
            }
        }
        c cVar = new c(a9, Thread.currentThread(), p0Var);
        cVar.h0(y.f4417d, cVar, function2);
        p0 p0Var2 = cVar.f4339s;
        if (p0Var2 != null) {
            int i3 = p0.f4389t;
            p0Var2.R(false);
        }
        while (true) {
            if (p0Var2 != null) {
                try {
                    S = p0Var2.S();
                } catch (Throwable th) {
                    if (p0Var2 != null) {
                        int i10 = p0.f4389t;
                        p0Var2.P(false);
                    }
                    throw th;
                }
            } else {
                S = Long.MAX_VALUE;
            }
            if (cVar.Q()) {
                break;
            }
            LockSupport.parkNanos(cVar, S);
            if (Thread.interrupted()) {
                cVar.n(new InterruptedException());
            }
        }
        if (p0Var2 != null) {
            int i11 = p0.f4389t;
            p0Var2.P(false);
        }
        Object A = A(k1.f4374d.get(cVar));
        q qVar = A instanceof q ? (q) A : null;
        if (qVar == null) {
            return A;
        }
        throw qVar.f4394a;
    }

    public static final Object y(w1 w1Var, Function2 function2) {
        p(w1Var, true, new n0(0, l(w1Var.f5997r.getContext()).i(w1Var.f4412s, w1Var, w1Var.f4322i)));
        return cf.c.K(w1Var, false, w1Var, function2);
    }

    public static final String z(ld.a aVar) {
        Object mVar;
        if (aVar instanceof le.g) {
            return ((le.g) aVar).toString();
        }
        try {
            hd.l lVar = hd.n.f4511e;
            mVar = aVar + '@' + m(aVar);
        } catch (Throwable th) {
            hd.l lVar2 = hd.n.f4511e;
            mVar = new hd.m(th);
        }
        if (hd.n.a(mVar) != null) {
            mVar = aVar.getClass().getName() + '@' + m(aVar);
        }
        return (String) mVar;
    }
}
