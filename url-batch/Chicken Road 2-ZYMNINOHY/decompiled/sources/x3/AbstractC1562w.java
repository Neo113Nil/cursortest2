package x3;

import a.AbstractC0124a;
import c3.C0294f;
import f3.C0426d;
import f3.C0431i;
import f3.InterfaceC0425c;
import f3.InterfaceC0430h;
import g3.EnumC0441a;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import y3.C1577b;

/* renamed from: x3.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1562w {

    /* renamed from: a, reason: collision with root package name */
    public static final C3.v f16063a = new C3.v("RESUME_TOKEN", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final C3.v f16064b = new C3.v("CLOSED_EMPTY", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final C3.v f16065c = new C3.v("COMPLETING_ALREADY", 0);

    /* renamed from: d, reason: collision with root package name */
    public static final C3.v f16066d = new C3.v("COMPLETING_WAITING_CHILDREN", 0);

    /* renamed from: e, reason: collision with root package name */
    public static final C3.v f16067e = new C3.v("COMPLETING_RETRY", 0);

    /* renamed from: f, reason: collision with root package name */
    public static final C3.v f16068f = new C3.v("TOO_LATE_TO_CANCEL", 0);

    /* renamed from: g, reason: collision with root package name */
    public static final C3.v f16069g = new C3.v("SEALED", 0);

    /* renamed from: h, reason: collision with root package name */
    public static final C1531F f16070h = new C1531F(false);

    /* renamed from: i, reason: collision with root package name */
    public static final C1531F f16071i = new C1531F(true);

    public static final C3.e a(InterfaceC0430h interfaceC0430h) {
        if (interfaceC0430h.n(C1559t.f16059b) == null) {
            interfaceC0430h = interfaceC0430h.f(new W());
        }
        return new C3.e(interfaceC0430h);
    }

    public static final InterfaceC0430h b(InterfaceC0430h interfaceC0430h, InterfaceC0430h interfaceC0430h2, boolean z) {
        Boolean bool = Boolean.FALSE;
        C1556p c1556p = C1556p.f16052g;
        boolean booleanValue = ((Boolean) interfaceC0430h.e(bool, c1556p)).booleanValue();
        boolean booleanValue2 = ((Boolean) interfaceC0430h2.e(bool, c1556p)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return interfaceC0430h.f(interfaceC0430h2);
        }
        C1556p c1556p2 = new C1556p(2, 2);
        C0431i c0431i = C0431i.f8817a;
        InterfaceC0430h interfaceC0430h3 = (InterfaceC0430h) interfaceC0430h.e(c0431i, c1556p2);
        Object obj = interfaceC0430h2;
        if (booleanValue2) {
            obj = interfaceC0430h2.e(c0431i, C1556p.f16051f);
        }
        return interfaceC0430h3.f((InterfaceC0430h) obj);
    }

    public static final String c(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final C1546f d(InterfaceC0425c interfaceC0425c) {
        C1546f c1546f;
        C1546f c1546f2;
        if (!(interfaceC0425c instanceof C3.h)) {
            return new C1546f(1, interfaceC0425c);
        }
        C3.h hVar = (C3.h) interfaceC0425c;
        C3.v vVar = C3.a.f282d;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C3.h.f292h;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            c1546f = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(hVar, vVar);
                c1546f2 = null;
                break;
            }
            if (obj instanceof C1546f) {
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, vVar)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                        break;
                    }
                }
                c1546f2 = (C1546f) obj;
                break loop0;
            }
            if (obj != vVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (c1546f2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C1546f.f16032g;
            Object obj2 = atomicReferenceFieldUpdater2.get(c1546f2);
            if (!(obj2 instanceof C1553m) || ((C1553m) obj2).f16044d == null) {
                C1546f.f16031f.set(c1546f2, 536870911);
                atomicReferenceFieldUpdater2.set(c1546f2, C1542b.f16017a);
                c1546f = c1546f2;
            } else {
                c1546f2.n();
            }
            if (c1546f != null) {
                return c1546f;
            }
        }
        return new C1546f(2, interfaceC0425c);
    }

    public static final void e(InterfaceC0430h interfaceC0430h, Throwable th) {
        try {
            C1577b c1577b = (C1577b) interfaceC0430h.n(C1559t.f16058a);
            if (c1577b != null) {
                c1577b.s(th);
            } else {
                C3.a.c(interfaceC0430h, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                O3.d.c(runtimeException, th);
                th = runtimeException;
            }
            C3.a.c(interfaceC0430h, th);
        }
    }

    public static InterfaceC1529D f(T t4, boolean z, Y y4, int i4) {
        if ((i4 & 1) != 0) {
            z = false;
        }
        boolean z4 = (i4 & 2) != 0;
        if (t4 instanceof d0) {
            return ((d0) t4).E(z, z4, y4);
        }
        X x4 = new X(1, y4, P.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0);
        d0 d0Var = (d0) t4;
        d0Var.getClass();
        return d0Var.E(z, z4, new C1540O(x4));
    }

    public static i0 g(InterfaceC1560u interfaceC1560u, InterfaceC0430h interfaceC0430h, o3.p pVar, int i4) {
        if ((i4 & 1) != 0) {
            interfaceC0430h = C0431i.f8817a;
        }
        EnumC1561v enumC1561v = EnumC1561v.f16060a;
        InterfaceC0430h b4 = b(interfaceC1560u.g(), interfaceC0430h, true);
        E3.e eVar = AbstractC1528C.f15989a;
        if (b4 != eVar && b4.n(C0426d.f8816a) == null) {
            b4 = b4.f(eVar);
        }
        EnumC1561v enumC1561v2 = EnumC1561v.f16060a;
        i0 i0Var = new i0(b4, true);
        i0Var.S(enumC1561v, i0Var, pVar);
        return i0Var;
    }

    public static final Object h(Object obj) {
        return obj instanceof C1554n ? O3.l.h(((C1554n) obj).f16048a) : obj;
    }

    public static final void i(C1546f c1546f, InterfaceC0425c interfaceC0425c, boolean z) {
        Object obj = C1546f.f16032g.get(c1546f);
        Throwable e4 = c1546f.e(obj);
        Object h2 = e4 != null ? O3.l.h(e4) : c1546f.f(obj);
        if (!z) {
            interfaceC0425c.resumeWith(h2);
            return;
        }
        kotlin.jvm.internal.i.c(interfaceC0425c, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        C3.h hVar = (C3.h) interfaceC0425c;
        h3.c cVar = hVar.f294e;
        Object obj2 = hVar.f296g;
        InterfaceC0430h context = cVar.getContext();
        Object l4 = C3.a.l(context, obj2);
        n0 m4 = l4 != C3.a.f284f ? m(cVar, context, l4) : null;
        try {
            cVar.resumeWith(h2);
            if (m4 == null || m4.T()) {
                C3.a.f(context, l4);
            }
        } catch (Throwable th) {
            if (m4 == null || m4.T()) {
                C3.a.f(context, l4);
            }
            throw th;
        }
    }

    public static Object j(o3.p pVar) {
        InterfaceC0430h interfaceC0430h;
        Thread currentThread = Thread.currentThread();
        AbstractC1534I a3 = l0.a();
        boolean booleanValue = ((Boolean) a3.e(Boolean.FALSE, C1556p.f16052g)).booleanValue();
        if (booleanValue) {
            C0431i c0431i = C0431i.f8817a;
            interfaceC0430h = (InterfaceC0430h) (booleanValue ? a3.e(c0431i, C1556p.f16051f) : a3);
            c0431i.f(interfaceC0430h);
        } else {
            interfaceC0430h = a3;
        }
        E3.e eVar = AbstractC1528C.f15989a;
        if (interfaceC0430h != eVar && interfaceC0430h.n(C0426d.f8816a) == null) {
            interfaceC0430h = interfaceC0430h.f(eVar);
        }
        C1543c c1543c = new C1543c(interfaceC0430h, currentThread, a3);
        c1543c.S(EnumC1561v.f16060a, c1543c, pVar);
        AbstractC1534I abstractC1534I = c1543c.f16023e;
        if (abstractC1534I != null) {
            int i4 = AbstractC1534I.f15996f;
            abstractC1534I.w(false);
        }
        while (!Thread.interrupted()) {
            try {
                long x4 = abstractC1534I != null ? abstractC1534I.x() : Long.MAX_VALUE;
                if (!(c1543c.A() instanceof InterfaceC1538M)) {
                    if (abstractC1534I != null) {
                        int i5 = AbstractC1534I.f15996f;
                        abstractC1534I.u(false);
                    }
                    Object l4 = l(c1543c.A());
                    C1554n c1554n = l4 instanceof C1554n ? (C1554n) l4 : null;
                    if (c1554n == null) {
                        return l4;
                    }
                    throw c1554n.f16048a;
                }
                LockSupport.parkNanos(c1543c, x4);
            } catch (Throwable th) {
                if (abstractC1534I != null) {
                    int i6 = AbstractC1534I.f15996f;
                    abstractC1534I.u(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        c1543c.o(interruptedException);
        throw interruptedException;
    }

    public static final String k(InterfaceC0425c interfaceC0425c) {
        Object h2;
        if (interfaceC0425c instanceof C3.h) {
            return interfaceC0425c.toString();
        }
        try {
            h2 = interfaceC0425c + '@' + c(interfaceC0425c);
        } catch (Throwable th) {
            h2 = O3.l.h(th);
        }
        if (C0294f.a(h2) != null) {
            h2 = interfaceC0425c.getClass().getName() + '@' + c(interfaceC0425c);
        }
        return (String) h2;
    }

    public static final Object l(Object obj) {
        InterfaceC1538M interfaceC1538M;
        C1539N c1539n = obj instanceof C1539N ? (C1539N) obj : null;
        return (c1539n == null || (interfaceC1538M = c1539n.f16002a) == null) ? obj : interfaceC1538M;
    }

    public static final n0 m(InterfaceC0425c interfaceC0425c, InterfaceC0430h interfaceC0430h, Object obj) {
        n0 n0Var = null;
        if ((interfaceC0425c instanceof h3.d) && interfaceC0430h.n(o0.f16050a) != null) {
            h3.d dVar = (h3.d) interfaceC0425c;
            while (true) {
                if ((dVar instanceof C1526A) || (dVar = dVar.getCallerFrame()) == null) {
                    break;
                }
                if (dVar instanceof n0) {
                    n0Var = (n0) dVar;
                    break;
                }
            }
            if (n0Var != null) {
                n0Var.U(interfaceC0430h, obj);
            }
        }
        return n0Var;
    }

    public static final Object n(InterfaceC0430h interfaceC0430h, o3.p pVar, InterfaceC0425c interfaceC0425c) {
        Object l4;
        InterfaceC0430h context = interfaceC0425c.getContext();
        InterfaceC0430h f4 = !((Boolean) interfaceC0430h.e(Boolean.FALSE, C1556p.f16052g)).booleanValue() ? context.f(interfaceC0430h) : b(context, interfaceC0430h, false);
        T t4 = (T) f4.n(C1559t.f16059b);
        if (t4 != null && !t4.a()) {
            throw ((d0) t4).w();
        }
        if (f4 == context) {
            C3.s sVar = new C3.s(interfaceC0425c, f4);
            l4 = AbstractC0124a.P(sVar, sVar, pVar);
        } else {
            C0426d c0426d = C0426d.f8816a;
            if (kotlin.jvm.internal.i.a(f4.n(c0426d), context.n(c0426d))) {
                n0 n0Var = new n0(interfaceC0425c, f4);
                InterfaceC0430h interfaceC0430h2 = n0Var.f16012c;
                Object l5 = C3.a.l(interfaceC0430h2, null);
                try {
                    Object P4 = AbstractC0124a.P(n0Var, n0Var, pVar);
                    C3.a.f(interfaceC0430h2, l5);
                    l4 = P4;
                } catch (Throwable th) {
                    C3.a.f(interfaceC0430h2, l5);
                    throw th;
                }
            } else {
                C1526A c1526a = new C1526A(interfaceC0425c, f4);
                V3.b.y(pVar, c1526a, c1526a);
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C1526A.f15987e;
                while (true) {
                    int i4 = atomicIntegerFieldUpdater.get(c1526a);
                    if (i4 != 0) {
                        if (i4 != 2) {
                            throw new IllegalStateException("Already suspended");
                        }
                        l4 = l(c1526a.A());
                        if (l4 instanceof C1554n) {
                            throw ((C1554n) l4).f16048a;
                        }
                    } else if (atomicIntegerFieldUpdater.compareAndSet(c1526a, 0, 1)) {
                        l4 = EnumC0441a.f9038a;
                        break;
                    }
                }
            }
        }
        EnumC0441a enumC0441a = EnumC0441a.f9038a;
        return l4;
    }
}
