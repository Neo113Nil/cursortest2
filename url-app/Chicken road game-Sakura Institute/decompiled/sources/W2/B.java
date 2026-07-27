package W2;

import a.AbstractC0345a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import y2.AbstractC1341p;
import y2.AbstractC1343r;
import y2.C1331f;

/* loaded from: classes.dex */
public abstract class B {

    /* renamed from: a, reason: collision with root package name */
    public static final b3.t f4208a = new b3.t("RESUME_TOKEN", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final b3.t f4209b = new b3.t("REMOVED_TASK", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final b3.t f4210c = new b3.t("CLOSED_EMPTY", 0);

    /* renamed from: d, reason: collision with root package name */
    public static final b3.t f4211d = new b3.t("COMPLETING_ALREADY", 0);

    /* renamed from: e, reason: collision with root package name */
    public static final b3.t f4212e = new b3.t("COMPLETING_WAITING_CHILDREN", 0);

    /* renamed from: f, reason: collision with root package name */
    public static final b3.t f4213f = new b3.t("COMPLETING_RETRY", 0);

    /* renamed from: g, reason: collision with root package name */
    public static final b3.t f4214g = new b3.t("TOO_LATE_TO_CANCEL", 0);

    /* renamed from: h, reason: collision with root package name */
    public static final b3.t f4215h = new b3.t("SEALED", 0);

    /* renamed from: i, reason: collision with root package name */
    public static final N f4216i = new N(false);

    /* renamed from: j, reason: collision with root package name */
    public static final N f4217j = new N(true);

    public static final b3.c a(CoroutineContext coroutineContext) {
        if (coroutineContext.k(C0299v.f4296e) == null) {
            coroutineContext = coroutineContext.s(new e0(null));
        }
        return new b3.c(coroutineContext);
    }

    public static final void b(InterfaceC0302y interfaceC0302y, CancellationException cancellationException) {
        InterfaceC0280c0 interfaceC0280c0 = (InterfaceC0280c0) interfaceC0302y.q().k(C0299v.f4296e);
        if (interfaceC0280c0 != null) {
            interfaceC0280c0.a(cancellationException);
        } else {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + interfaceC0302y).toString());
        }
    }

    public static final Object c(InterfaceC0280c0 interfaceC0280c0, E2.j jVar) {
        interfaceC0280c0.a(null);
        Object x2 = interfaceC0280c0.x(jVar);
        return x2 == D2.a.f2163d ? x2 : Unit.f7487a;
    }

    public static final Object d(Function2 function2, C2.a frame) {
        b3.q qVar = new b3.q(frame, frame.p());
        Object H3 = AbstractC0345a.H(qVar, qVar, function2);
        if (H3 == D2.a.f2163d) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return H3;
    }

    public static final void e(CoroutineContext coroutineContext) {
        InterfaceC0280c0 interfaceC0280c0 = (InterfaceC0280c0) coroutineContext.k(C0299v.f4296e);
        if (interfaceC0280c0 != null && !interfaceC0280c0.b()) {
            throw interfaceC0280c0.g();
        }
    }

    public static final String f(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final InterfaceC0280c0 g(CoroutineContext coroutineContext) {
        InterfaceC0280c0 interfaceC0280c0 = (InterfaceC0280c0) coroutineContext.k(C0299v.f4296e);
        if (interfaceC0280c0 != null) {
            return interfaceC0280c0;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + coroutineContext).toString());
    }

    public static final C0286h h(C2.a aVar) {
        C0286h c0286h;
        C0286h c0286h2;
        if (!(aVar instanceof b3.f)) {
            return new C0286h(1, aVar);
        }
        b3.f fVar = (b3.f) aVar;
        fVar.getClass();
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b3.f.f5654n;
            Object obj = atomicReferenceFieldUpdater.get(fVar);
            b3.t tVar = b3.a.f5648c;
            c0286h = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(fVar, tVar);
                c0286h2 = null;
                break;
            }
            if (obj instanceof C0286h) {
                while (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, tVar)) {
                    if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                        break;
                    }
                }
                c0286h2 = (C0286h) obj;
                break loop0;
            }
            if (obj != tVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (c0286h2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0286h.f4263m;
            Object obj2 = atomicReferenceFieldUpdater2.get(c0286h2);
            if (!(obj2 instanceof C0293o) || ((C0293o) obj2).f4287d == null) {
                C0286h.f4262l.set(c0286h2, 536870911);
                atomicReferenceFieldUpdater2.set(c0286h2, C0277b.f4248a);
                c0286h = c0286h2;
            } else {
                c0286h2.m();
            }
            if (c0286h != null) {
                return c0286h;
            }
        }
        return new C0286h(2, aVar);
    }

    public static final void i(Throwable th, CoroutineContext coroutineContext) {
        try {
            InterfaceC0300w interfaceC0300w = (InterfaceC0300w) coroutineContext.k(C0299v.f4295d);
            if (interfaceC0300w != null) {
                interfaceC0300w.y(th, coroutineContext);
            } else {
                b3.a.f(th, coroutineContext);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                C1331f.a(runtimeException, th);
                th = runtimeException;
            }
            b3.a.f(th, coroutineContext);
        }
    }

    public static final L j(InterfaceC0280c0 interfaceC0280c0, boolean z4, g0 g0Var) {
        if (interfaceC0280c0 instanceof k0) {
            return ((k0) interfaceC0280c0).S(z4, g0Var);
        }
        return interfaceC0280c0.j(g0Var.k(), z4, new f0(1, g0Var, g0.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 0));
    }

    public static final boolean k(InterfaceC0302y interfaceC0302y) {
        InterfaceC0280c0 interfaceC0280c0 = (InterfaceC0280c0) interfaceC0302y.q().k(C0299v.f4296e);
        if (interfaceC0280c0 != null) {
            return interfaceC0280c0.b();
        }
        return true;
    }

    public static final boolean l(CoroutineContext coroutineContext) {
        InterfaceC0280c0 interfaceC0280c0 = (InterfaceC0280c0) coroutineContext.k(C0299v.f4296e);
        if (interfaceC0280c0 != null) {
            return interfaceC0280c0.b();
        }
        return true;
    }

    public static r0 m(InterfaceC0302y interfaceC0302y, kotlin.coroutines.a aVar, EnumC0303z enumC0303z, Function2 function2, int i2) {
        CoroutineContext coroutineContext = aVar;
        if ((i2 & 1) != 0) {
            coroutineContext = kotlin.coroutines.i.f7498d;
        }
        if ((i2 & 2) != 0) {
            enumC0303z = EnumC0303z.f4304d;
        }
        CoroutineContext a4 = AbstractC0296s.a(interfaceC0302y.q(), coroutineContext, true);
        d3.e eVar = J.f4225a;
        if (a4 != eVar && a4.k(kotlin.coroutines.e.f7496f) == null) {
            a4 = a4.s(eVar);
        }
        enumC0303z.getClass();
        r0 l0Var = enumC0303z == EnumC0303z.f4305e ? new l0(a4, function2) : new r0(a4, true);
        l0Var.j0(enumC0303z, l0Var, function2);
        return l0Var;
    }

    public static final Object n(X2.d dVar, Function2 function2) {
        U u4;
        CoroutineContext a4;
        Thread currentThread = Thread.currentThread();
        C2.b bVar = kotlin.coroutines.e.f7496f;
        kotlin.coroutines.e eVar = (kotlin.coroutines.e) dVar.k(bVar);
        if (eVar == null) {
            u4 = u0.a();
            a4 = AbstractC0296s.a(kotlin.coroutines.i.f7498d, kotlin.coroutines.f.c(u4, dVar), true);
            d3.e eVar2 = J.f4225a;
            if (a4 != eVar2 && a4.k(bVar) == null) {
                a4 = a4.s(eVar2);
            }
        } else {
            if (eVar instanceof U) {
            }
            u4 = (U) u0.f4294a.get();
            a4 = AbstractC0296s.a(kotlin.coroutines.i.f7498d, dVar, true);
            d3.e eVar3 = J.f4225a;
            if (a4 != eVar3 && a4.k(bVar) == null) {
                a4 = a4.s(eVar3);
            }
        }
        C0279c c0279c = new C0279c(a4, currentThread, u4);
        c0279c.j0(EnumC0303z.f4304d, c0279c, function2);
        U u5 = c0279c.f4252k;
        if (u5 != null) {
            int i2 = U.f4239l;
            u5.D(false);
        }
        while (!Thread.interrupted()) {
            try {
                long F3 = u5 != null ? u5.F() : Long.MAX_VALUE;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k0.f4279d;
                if (!(atomicReferenceFieldUpdater.get(c0279c) instanceof Z)) {
                    if (u5 != null) {
                        int i4 = U.f4239l;
                        u5.A(false);
                    }
                    Object p4 = p(atomicReferenceFieldUpdater.get(c0279c));
                    C0294p c0294p = p4 instanceof C0294p ? (C0294p) p4 : null;
                    if (c0294p == null) {
                        return p4;
                    }
                    throw c0294p.f4291a;
                }
                LockSupport.parkNanos(c0279c, F3);
            } catch (Throwable th) {
                if (u5 != null) {
                    int i5 = U.f4239l;
                    u5.A(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        c0279c.C(interruptedException);
        throw interruptedException;
    }

    public static final String o(C2.a aVar) {
        Object a4;
        if (aVar instanceof b3.f) {
            return ((b3.f) aVar).toString();
        }
        try {
            AbstractC1341p.a aVar2 = AbstractC1341p.f11673d;
            a4 = aVar + '@' + f(aVar);
        } catch (Throwable th) {
            AbstractC1341p.a aVar3 = AbstractC1341p.f11673d;
            a4 = AbstractC1343r.a(th);
        }
        if (AbstractC1341p.a(a4) != null) {
            a4 = aVar.getClass().getName() + '@' + f(aVar);
        }
        return (String) a4;
    }

    public static final Object p(Object obj) {
        Z z4;
        C0276a0 c0276a0 = obj instanceof C0276a0 ? (C0276a0) obj : null;
        return (c0276a0 == null || (z4 = c0276a0.f4247a) == null) ? obj : z4;
    }

    public static final Object q(CoroutineContext coroutineContext, Function2 function2, C2.a frame) {
        Object p4;
        CoroutineContext p5 = frame.p();
        CoroutineContext s4 = !((Boolean) coroutineContext.i(Boolean.FALSE, new r(0))).booleanValue() ? p5.s(coroutineContext) : AbstractC0296s.a(p5, coroutineContext, false);
        e(s4);
        if (s4 == p5) {
            b3.q qVar = new b3.q(frame, s4);
            p4 = AbstractC0345a.H(qVar, qVar, function2);
        } else {
            C2.b bVar = kotlin.coroutines.e.f7496f;
            if (Intrinsics.a(s4.k(bVar), p5.k(bVar))) {
                A0 a02 = new A0(frame, s4);
                CoroutineContext coroutineContext2 = a02.f4246i;
                Object c4 = b3.v.c(coroutineContext2, null);
                try {
                    Object H3 = AbstractC0345a.H(a02, a02, function2);
                    b3.v.a(coroutineContext2, c4);
                    p4 = H3;
                } catch (Throwable th) {
                    b3.v.a(coroutineContext2, c4);
                    throw th;
                }
            } else {
                G g4 = new G(frame, s4);
                c3.a.a(function2, g4, g4);
                while (true) {
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = G.f4223k;
                    int i2 = atomicIntegerFieldUpdater.get(g4);
                    if (i2 != 0) {
                        if (i2 != 2) {
                            throw new IllegalStateException("Already suspended");
                        }
                        p4 = p(k0.f4279d.get(g4));
                        if (p4 instanceof C0294p) {
                            throw ((C0294p) p4).f4291a;
                        }
                    } else if (atomicIntegerFieldUpdater.compareAndSet(g4, 0, 1)) {
                        p4 = D2.a.f2163d;
                        break;
                    }
                }
            }
        }
        if (p4 == D2.a.f2163d) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return p4;
    }
}
