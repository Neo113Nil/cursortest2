package Y0;

import a.AbstractC0132a;
import d1.AbstractC0184a;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* renamed from: Y0.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0127v {

    /* renamed from: c, reason: collision with root package name */
    public static final B.m f1233c;

    /* renamed from: d, reason: collision with root package name */
    public static final B.m f1234d;

    /* renamed from: e, reason: collision with root package name */
    public static final B.m f1235e;

    /* renamed from: f, reason: collision with root package name */
    public static final B.m f1236f;

    /* renamed from: g, reason: collision with root package name */
    public static final B.m f1237g;

    /* renamed from: a, reason: collision with root package name */
    public static final B.m f1231a = new B.m(19, "RESUME_TOKEN");

    /* renamed from: b, reason: collision with root package name */
    public static final B.m f1232b = new B.m(19, "CLOSED_EMPTY");

    /* renamed from: h, reason: collision with root package name */
    public static final E f1238h = new E(false);

    /* renamed from: i, reason: collision with root package name */
    public static final E f1239i = new E(true);

    static {
        int i2 = 19;
        f1233c = new B.m(i2, "COMPLETING_ALREADY");
        f1234d = new B.m(i2, "COMPLETING_WAITING_CHILDREN");
        f1235e = new B.m(i2, "COMPLETING_RETRY");
        f1236f = new B.m(i2, "TOO_LATE_TO_CANCEL");
        f1237g = new B.m(i2, "SEALED");
    }

    public static final H0.i a(H0.i iVar, H0.i iVar2, boolean z2) {
        Boolean bool = Boolean.FALSE;
        C0122p c0122p = C0122p.f1223h;
        boolean booleanValue = ((Boolean) iVar.m(bool, c0122p)).booleanValue();
        boolean booleanValue2 = ((Boolean) iVar2.m(bool, c0122p)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return iVar.i(iVar2);
        }
        H0.j jVar = H0.j.f503e;
        H0.i iVar3 = (H0.i) iVar.m(jVar, new C0122p(2, 2));
        Object obj = iVar2;
        if (booleanValue2) {
            obj = iVar2.m(jVar, C0122p.f1222g);
        }
        return iVar3.i((H0.i) obj);
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final C0112f c(H0.d dVar) {
        C0112f c0112f;
        C0112f c0112f2;
        if (!(dVar instanceof d1.h)) {
            return new C0112f(1, dVar);
        }
        d1.h hVar = (d1.h) dVar;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d1.h.f2075l;
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            B.m mVar = AbstractC0184a.f2065d;
            c0112f = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(hVar, mVar);
                c0112f2 = null;
                break;
            }
            if (obj instanceof C0112f) {
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, mVar)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                        break;
                    }
                }
                c0112f2 = (C0112f) obj;
                break loop0;
            }
            if (obj != mVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (c0112f2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0112f.f1202k;
            Object obj2 = atomicReferenceFieldUpdater2.get(c0112f2);
            if (!(obj2 instanceof C0119m) || ((C0119m) obj2).f1216d == null) {
                C0112f.f1201j.set(c0112f2, 536870911);
                atomicReferenceFieldUpdater2.set(c0112f2, C0108b.f1196e);
                c0112f = c0112f2;
            } else {
                c0112f2.r();
            }
            if (c0112f != null) {
                return c0112f;
            }
        }
        return new C0112f(2, dVar);
    }

    public static final void d(H0.i iVar, Throwable th) {
        try {
            Z0.b bVar = (Z0.b) iVar.k(C0125t.f1229e);
            if (bVar != null) {
                bVar.c(iVar, th);
            } else {
                AbstractC0184a.d(iVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                AbstractC0132a.c(runtimeException, th);
                th = runtimeException;
            }
            AbstractC0184a.d(iVar, th);
        }
    }

    public static /* synthetic */ C e(P p2, boolean z2, U u2, int i2) {
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        return ((Z) p2).I(z2, (i2 & 2) != 0, u2);
    }

    public static final boolean f(int i2) {
        return i2 == 1 || i2 == 2;
    }

    public static e0 g(InterfaceC0126u interfaceC0126u, P0.p pVar) {
        H0.i a2 = a(interfaceC0126u.h(), H0.j.f503e, true);
        f1.d dVar = B.f1159a;
        if (a2 != dVar && a2.k(H0.e.f502e) == null) {
            a2 = a2.i(dVar);
        }
        e0 e0Var = new e0(a2, true);
        e0Var.W(1, e0Var, pVar);
        return e0Var;
    }

    public static final Object h(Object obj) {
        return obj instanceof C0120n ? i1.a.b(((C0120n) obj).f1219a) : obj;
    }

    public static final void i(C0112f c0112f, H0.d dVar, boolean z2) {
        Object obj = C0112f.f1202k.get(c0112f);
        Throwable g2 = c0112f.g(obj);
        Object b2 = g2 != null ? i1.a.b(g2) : c0112f.h(obj);
        if (!z2) {
            dVar.j(b2);
            return;
        }
        Q0.h.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        d1.h hVar = (d1.h) dVar;
        J0.b bVar = hVar.f2077i;
        H0.i f2 = bVar.f();
        Object m2 = AbstractC0184a.m(f2, hVar.f2079k);
        j0 m3 = m2 != AbstractC0184a.f2067f ? m(bVar, f2, m2) : null;
        try {
            bVar.j(b2);
        } finally {
            if (m3 == null || m3.X()) {
                AbstractC0184a.g(f2, m2);
            }
        }
    }

    public static Object j(P0.p pVar) {
        H0.j jVar = H0.j.f503e;
        Thread currentThread = Thread.currentThread();
        H0.e eVar = H0.e.f502e;
        H a2 = h0.a();
        H0.i a3 = a(jVar, a2, true);
        f1.d dVar = B.f1159a;
        if (a3 != dVar && a3.k(eVar) == null) {
            a3 = a3.i(dVar);
        }
        C0109c c0109c = new C0109c(a3, currentThread, a2);
        c0109c.W(1, c0109c, pVar);
        H h2 = c0109c.f1199i;
        if (h2 != null) {
            int i2 = H.f1166j;
            h2.h(false);
        }
        while (!Thread.interrupted()) {
            try {
                long j2 = h2 != null ? h2.j() : Long.MAX_VALUE;
                if (!(c0109c.E() instanceof L)) {
                    if (h2 != null) {
                        int i3 = H.f1166j;
                        h2.f(false);
                    }
                    Object l2 = l(c0109c.E());
                    C0120n c0120n = l2 instanceof C0120n ? (C0120n) l2 : null;
                    if (c0120n == null) {
                        return l2;
                    }
                    throw c0120n.f1219a;
                }
                LockSupport.parkNanos(c0109c, j2);
            } catch (Throwable th) {
                if (h2 != null) {
                    int i4 = H.f1166j;
                    h2.f(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        c0109c.s(interruptedException);
        throw interruptedException;
    }

    public static final String k(H0.d dVar) {
        Object b2;
        if (dVar instanceof d1.h) {
            return dVar.toString();
        }
        try {
            b2 = dVar + '@' + b(dVar);
        } catch (Throwable th) {
            b2 = i1.a.b(th);
        }
        if (F0.e.a(b2) != null) {
            b2 = dVar.getClass().getName() + '@' + b(dVar);
        }
        return (String) b2;
    }

    public static final Object l(Object obj) {
        L l2;
        M m2 = obj instanceof M ? (M) obj : null;
        return (m2 == null || (l2 = m2.f1172a) == null) ? obj : l2;
    }

    public static final j0 m(H0.d dVar, H0.i iVar, Object obj) {
        j0 j0Var = null;
        if (!(dVar instanceof J0.c)) {
            return null;
        }
        if (iVar.k(k0.f1212e) != null) {
            J0.c cVar = (J0.c) dVar;
            while (true) {
                if ((cVar instanceof C0131z) || (cVar = cVar.e()) == null) {
                    break;
                }
                if (cVar instanceof j0) {
                    j0Var = (j0) cVar;
                    break;
                }
            }
            if (j0Var != null) {
                j0Var.Y(iVar, obj);
            }
        }
        return j0Var;
    }

    public static final Object n(H0.i iVar, P0.p pVar, J0.g gVar) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        H0.i iVar2 = gVar.f737f;
        Q0.h.b(iVar2);
        H0.i i2 = !((Boolean) iVar.m(Boolean.FALSE, C0122p.f1223h)).booleanValue() ? iVar2.i(iVar) : a(iVar2, iVar, false);
        P p2 = (P) i2.k(C0125t.f1230f);
        if (p2 != null && !p2.b()) {
            throw ((Z) p2).A();
        }
        if (i2 == iVar2) {
            d1.u uVar = new d1.u(gVar, i2);
            return AbstractC0132a.N(uVar, uVar, pVar);
        }
        H0.e eVar = H0.e.f502e;
        if (Q0.h.a(i2.k(eVar), iVar2.k(eVar))) {
            j0 j0Var = new j0(i2, gVar);
            H0.i iVar3 = j0Var.f1195g;
            Object m2 = AbstractC0184a.m(iVar3, null);
            try {
                return AbstractC0132a.N(j0Var, j0Var, pVar);
            } finally {
                AbstractC0184a.g(iVar3, m2);
            }
        }
        C0131z c0131z = new C0131z(gVar, i2);
        i1.a.F(pVar, c0131z, c0131z);
        do {
            atomicIntegerFieldUpdater = C0131z.f1243i;
            int i3 = atomicIntegerFieldUpdater.get(c0131z);
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                Object l2 = l(c0131z.E());
                if (l2 instanceof C0120n) {
                    throw ((C0120n) l2).f1219a;
                }
                return l2;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(c0131z, 0, 1));
        return I0.a.f733e;
    }
}
