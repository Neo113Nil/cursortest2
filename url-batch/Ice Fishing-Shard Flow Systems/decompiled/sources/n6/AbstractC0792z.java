package n6;

import R5.C0164d;
import a.AbstractC0169a;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l0.C0654a;
import o6.C0806b;
import s6.AbstractC0898a;
import u6.C0953e;

/* renamed from: n6.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0792z {

    /* renamed from: a, reason: collision with root package name */
    public static final C0654a f7095a = new C0654a("RESUME_TOKEN", 1);

    /* renamed from: b, reason: collision with root package name */
    public static final C0654a f7096b = new C0654a("REMOVED_TASK", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final C0654a f7097c = new C0654a("CLOSED_EMPTY", 1);

    /* renamed from: d, reason: collision with root package name */
    public static final C0654a f7098d = new C0654a("COMPLETING_ALREADY", 1);

    /* renamed from: e, reason: collision with root package name */
    public static final C0654a f7099e = new C0654a("COMPLETING_WAITING_CHILDREN", 1);

    /* renamed from: f, reason: collision with root package name */
    public static final C0654a f7100f = new C0654a("COMPLETING_RETRY", 1);

    /* renamed from: g, reason: collision with root package name */
    public static final C0654a f7101g = new C0654a("TOO_LATE_TO_CANCEL", 1);

    /* renamed from: h, reason: collision with root package name */
    public static final C0654a f7102h = new C0654a("SEALED", 1);

    /* renamed from: i, reason: collision with root package name */
    public static final J f7103i = new J(false);
    public static final J j = new J(true);

    public static C0781n a() {
        C0781n c0781n = new C0781n(true);
        c0781n.E(null);
        return c0781n;
    }

    public static final s6.c b(CoroutineContext coroutineContext) {
        if (coroutineContext.g(C0787u.f7085e) == null) {
            coroutineContext = coroutineContext.j(new Z());
        }
        return new s6.c(coroutineContext);
    }

    public static final Object c(Function2 function2, V5.b frame) {
        s6.q qVar = new s6.q(frame, frame.getContext());
        Object D7 = AbstractC0169a.D(qVar, qVar, function2);
        if (D7 == W5.a.f2787d) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return D7;
    }

    public static final Object d(long j7, V5.b frame) {
        if (j7 <= 0) {
            return Unit.f6114a;
        }
        C0775h c0775h = new C0775h(1, W5.d.b(frame));
        c0775h.s();
        if (j7 < Long.MAX_VALUE) {
            f(c0775h.f7063m).h(j7, c0775h);
        }
        Object r7 = c0775h.r();
        W5.a aVar = W5.a.f2787d;
        if (r7 == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return r7 == aVar ? r7 : Unit.f6114a;
    }

    public static final void e(CoroutineContext coroutineContext) {
        X x7 = (X) coroutineContext.g(C0787u.f7085e);
        if (x7 != null && !x7.a()) {
            throw ((f0) x7).w();
        }
    }

    public static final InterfaceC0765C f(CoroutineContext coroutineContext) {
        CoroutineContext.Element g7 = coroutineContext.g(kotlin.coroutines.d.f6145f);
        InterfaceC0765C interfaceC0765C = g7 instanceof InterfaceC0765C ? (InterfaceC0765C) g7 : null;
        return interfaceC0765C == null ? AbstractC0764B.f7008a : interfaceC0765C;
    }

    public static final String g(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final C0775h h(V5.b bVar) {
        C0775h c0775h;
        C0775h c0775h2;
        if (!(bVar instanceof s6.f)) {
            return new C0775h(1, bVar);
        }
        s6.f fVar = (s6.f) bVar;
        fVar.getClass();
        C0654a c0654a = AbstractC0898a.f7820c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = s6.f.f7826p;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(fVar);
            c0775h = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(fVar, c0654a);
                c0775h2 = null;
                break;
            }
            if (obj instanceof C0775h) {
                while (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, c0654a)) {
                    if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                        break;
                    }
                }
                c0775h2 = (C0775h) obj;
                break loop0;
            }
            if (obj != c0654a && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (c0775h2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0775h.f7060o;
            Object obj2 = atomicReferenceFieldUpdater2.get(c0775h2);
            if (!(obj2 instanceof C0783p) || ((C0783p) obj2).f7073d == null) {
                C0775h.f7059n.set(c0775h2, 536870911);
                atomicReferenceFieldUpdater2.set(c0775h2, C0769b.f7038a);
                c0775h = c0775h2;
            } else {
                c0775h2.o();
            }
            if (c0775h != null) {
                return c0775h;
            }
        }
        return new C0775h(2, bVar);
    }

    public static final void i(Throwable th, CoroutineContext coroutineContext) {
        try {
            InterfaceC0788v interfaceC0788v = (InterfaceC0788v) coroutineContext.g(C0787u.f7084d);
            if (interfaceC0788v != null) {
                ((C0806b) interfaceC0788v).E(th);
            } else {
                AbstractC0898a.d(th, coroutineContext);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                C0164d.a(runtimeException, th);
                th = runtimeException;
            }
            AbstractC0898a.d(th, coroutineContext);
        }
    }

    public static final H j(X x7, boolean z7, b0 b0Var) {
        if (x7 instanceof f0) {
            return ((f0) x7).F(z7, b0Var);
        }
        boolean j7 = b0Var.j();
        a0 a0Var = new a0(1, b0Var, b0.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0);
        return ((f0) x7).F(z7, j7 ? new W(a0Var) : new I(1, a0Var));
    }

    public static final boolean k(InterfaceC0789w interfaceC0789w) {
        X x7 = (X) interfaceC0789w.h().g(C0787u.f7085e);
        if (x7 != null) {
            return x7.a();
        }
        return true;
    }

    public static l0 l(InterfaceC0789w interfaceC0789w, CoroutineContext coroutineContext, Function2 function2, int i2) {
        EnumC0790x enumC0790x = EnumC0790x.f7091l;
        if ((i2 & 1) != 0) {
            coroutineContext = kotlin.coroutines.g.f6146d;
        }
        if ((i2 & 2) != 0) {
            enumC0790x = EnumC0790x.f7088d;
        }
        CoroutineContext a7 = r.a(interfaceC0789w.h(), coroutineContext, true);
        C0953e c0953e = F.f7011a;
        if (a7 != c0953e && a7.g(kotlin.coroutines.d.f6145f) == null) {
            a7 = a7.j(c0953e);
        }
        l0 g0Var = enumC0790x == EnumC0790x.f7089e ? new g0(a7, function2) : new l0(a7, true);
        g0Var.Y(enumC0790x, g0Var, function2);
        return g0Var;
    }

    public static final Object m(Object obj) {
        if (obj instanceof C0784q) {
            R5.l lVar = R5.n.f2421d;
            return V6.b.n(((C0784q) obj).f7076a);
        }
        R5.l lVar2 = R5.n.f2421d;
        return obj;
    }

    public static final void n(C0775h c0775h, V5.b bVar, boolean z7) {
        Object g7;
        Object obj = C0775h.f7060o.get(c0775h);
        Throwable f7 = c0775h.f(obj);
        if (f7 != null) {
            R5.l lVar = R5.n.f2421d;
            g7 = V6.b.n(f7);
        } else {
            R5.l lVar2 = R5.n.f2421d;
            g7 = c0775h.g(obj);
        }
        if (!z7) {
            bVar.resumeWith(g7);
            return;
        }
        Intrinsics.c(bVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        s6.f fVar = (s6.f) bVar;
        X5.c cVar = fVar.f7828m;
        Object obj2 = fVar.f7830o;
        CoroutineContext context = cVar.getContext();
        Object c7 = s6.u.c(context, obj2);
        u0 b7 = c7 != s6.u.f7857a ? r.b(cVar, context, c7) : null;
        try {
            cVar.resumeWith(g7);
            Unit unit = Unit.f6114a;
            if (b7 == null || b7.Z()) {
                s6.u.a(context, c7);
            }
        } catch (Throwable th) {
            if (b7 == null || b7.Z()) {
                s6.u.a(context, c7);
            }
            throw th;
        }
    }

    public static final Object o(CoroutineContext coroutineContext, Function2 function2) {
        P p7;
        CoroutineContext a7;
        Thread currentThread = Thread.currentThread();
        kotlin.coroutines.f fVar = kotlin.coroutines.d.f6145f;
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) coroutineContext.g(fVar);
        if (dVar == null) {
            p7 = o0.a();
            a7 = r.a(kotlin.coroutines.g.f6146d, coroutineContext.j(p7), true);
            C0953e c0953e = F.f7011a;
            if (a7 != c0953e && a7.g(fVar) == null) {
                a7 = a7.j(c0953e);
            }
        } else {
            if (dVar instanceof P) {
            }
            p7 = (P) o0.f7069a.get();
            a7 = r.a(kotlin.coroutines.g.f6146d, coroutineContext, true);
            C0953e c0953e2 = F.f7011a;
            if (a7 != c0953e2 && a7.g(fVar) == null) {
                a7 = a7.j(c0953e2);
            }
        }
        C0770c c0770c = new C0770c(a7, currentThread, p7);
        c0770c.Y(EnumC0790x.f7088d, c0770c, function2);
        P p8 = c0770c.f7041m;
        if (p8 != null) {
            int i2 = P.f7026n;
            p8.L(false);
        }
        while (!Thread.interrupted()) {
            try {
                long M7 = p8 != null ? p8.M() : Long.MAX_VALUE;
                if (c0770c.G()) {
                    if (p8 != null) {
                        int i5 = P.f7026n;
                        p8.I(false);
                    }
                    Object s7 = s(f0.f7054d.get(c0770c));
                    C0784q c0784q = s7 instanceof C0784q ? (C0784q) s7 : null;
                    if (c0784q == null) {
                        return s7;
                    }
                    throw c0784q.f7076a;
                }
                LockSupport.parkNanos(c0770c, M7);
            } catch (Throwable th) {
                if (p8 != null) {
                    int i7 = P.f7026n;
                    p8.I(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        c0770c.n(interruptedException);
        throw interruptedException;
    }

    public static final Object q(r0 r0Var, Function2 function2) {
        Object c0784q;
        Object K7;
        j(r0Var, true, new I(0, f(r0Var.f7852l.getContext()).s(r0Var.f7078m, r0Var, r0Var.f7037i)));
        try {
            if (function2 instanceof X5.a) {
                kotlin.jvm.internal.I.b(2, function2);
                c0784q = function2.invoke(r0Var, r0Var);
            } else {
                c0784q = W5.d.c(function2, r0Var, r0Var);
            }
        } catch (Throwable th) {
            c0784q = new C0784q(th, false);
        }
        W5.a aVar = W5.a.f2787d;
        if (c0784q == aVar || (K7 = r0Var.K(c0784q)) == f7099e) {
            return aVar;
        }
        if (K7 instanceof C0784q) {
            Throwable th2 = ((C0784q) K7).f7076a;
            if (!(th2 instanceof q0)) {
                throw th2;
            }
            if (((q0) th2).f7077d != r0Var) {
                throw th2;
            }
            if (c0784q instanceof C0784q) {
                throw ((C0784q) c0784q).f7076a;
            }
        } else {
            c0784q = s(K7);
        }
        return c0784q;
    }

    public static final String r(V5.b bVar) {
        Object n7;
        if (bVar instanceof s6.f) {
            return ((s6.f) bVar).toString();
        }
        try {
            R5.l lVar = R5.n.f2421d;
            n7 = bVar + '@' + g(bVar);
        } catch (Throwable th) {
            R5.l lVar2 = R5.n.f2421d;
            n7 = V6.b.n(th);
        }
        if (R5.n.a(n7) != null) {
            n7 = bVar.getClass().getName() + '@' + g(bVar);
        }
        return (String) n7;
    }

    public static final Object s(Object obj) {
        U u7;
        V v7 = obj instanceof V ? (V) obj : null;
        return (v7 == null || (u7 = v7.f7032a) == null) ? obj : u7;
    }

    public static final Object t(CoroutineContext coroutineContext, Function2 function2, V5.b frame) {
        Object s7;
        CoroutineContext context = frame.getContext();
        CoroutineContext j7 = !((Boolean) coroutineContext.t(Boolean.FALSE, new V5.a(2))).booleanValue() ? context.j(coroutineContext) : r.a(context, coroutineContext, false);
        e(j7);
        if (j7 == context) {
            s6.q qVar = new s6.q(frame, j7);
            s7 = AbstractC0169a.D(qVar, qVar, function2);
        } else {
            V5.c cVar = kotlin.coroutines.d.f6145f;
            if (Intrinsics.a(j7.g(cVar), context.g(cVar))) {
                u0 u0Var = new u0(frame, j7);
                CoroutineContext coroutineContext2 = u0Var.f7037i;
                Object c7 = s6.u.c(coroutineContext2, null);
                try {
                    Object D7 = AbstractC0169a.D(u0Var, u0Var, function2);
                    s6.u.a(coroutineContext2, c7);
                    s7 = D7;
                } catch (Throwable th) {
                    s6.u.a(coroutineContext2, c7);
                    throw th;
                }
            } else {
                C0766D c0766d = new C0766D(frame, j7);
                V6.b.N(function2, c0766d, c0766d);
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C0766D.f7009m;
                while (true) {
                    int i2 = atomicIntegerFieldUpdater.get(c0766d);
                    if (i2 != 0) {
                        if (i2 != 2) {
                            throw new IllegalStateException("Already suspended");
                        }
                        s7 = s(f0.f7054d.get(c0766d));
                        if (s7 instanceof C0784q) {
                            throw ((C0784q) s7).f7076a;
                        }
                    } else if (atomicIntegerFieldUpdater.compareAndSet(c0766d, 0, 1)) {
                        s7 = W5.a.f2787d;
                        break;
                    }
                }
            }
        }
        if (s7 == W5.a.f2787d) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return s7;
    }

    public static final Object u(long j7, Function2 function2, X5.c frame) {
        if (j7 <= 0) {
            throw new q0("Timed out immediately", null);
        }
        Object q4 = q(new r0(j7, frame), function2);
        if (q4 == W5.a.f2787d) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return q4;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0069 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object v(long j7, Function2 function2, V5.b bVar) {
        s0 frame;
        int i2;
        kotlin.jvm.internal.D d7;
        if (bVar instanceof s0) {
            frame = (s0) bVar;
            int i5 = frame.f7081i;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                frame.f7081i = i5 - Integer.MIN_VALUE;
                Object obj = frame.f7080e;
                W5.a aVar = W5.a.f2787d;
                i2 = frame.f7081i;
                if (i2 != 0) {
                    V6.b.P(obj);
                    if (j7 <= 0) {
                        return null;
                    }
                    kotlin.jvm.internal.D d8 = new kotlin.jvm.internal.D();
                    try {
                        frame.f7079d = d8;
                        frame.f7081i = 1;
                        r0 r0Var = new r0(j7, frame);
                        d8.f6152d = r0Var;
                        Object q4 = q(r0Var, function2);
                        if (q4 == aVar) {
                            try {
                                Intrinsics.checkNotNullParameter(frame, "frame");
                            } catch (q0 e7) {
                                e = e7;
                                d7 = d8;
                                if (e.f7077d == d7.f6152d) {
                                }
                            }
                        }
                        return q4 == aVar ? aVar : q4;
                    } catch (q0 e8) {
                        e = e8;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d7 = frame.f7079d;
                    try {
                        V6.b.P(obj);
                        return obj;
                    } catch (q0 e9) {
                        e = e9;
                    }
                }
                if (e.f7077d == d7.f6152d) {
                    return null;
                }
                throw e;
            }
        }
        frame = new s0(bVar);
        Object obj2 = frame.f7080e;
        W5.a aVar2 = W5.a.f2787d;
        i2 = frame.f7081i;
        if (i2 != 0) {
        }
        if (e.f7077d == d7.f6152d) {
        }
    }
}
