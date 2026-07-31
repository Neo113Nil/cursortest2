package W0;

import a.AbstractC0086a;
import b1.AbstractC0115a;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* renamed from: W0.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0081v {

    /* renamed from: a, reason: collision with root package name */
    public static final B0.E f975a;

    /* renamed from: b, reason: collision with root package name */
    public static final B0.E f976b;

    /* renamed from: c, reason: collision with root package name */
    public static final B0.E f977c;

    /* renamed from: d, reason: collision with root package name */
    public static final B0.E f978d;

    /* renamed from: e, reason: collision with root package name */
    public static final B0.E f979e;

    /* renamed from: f, reason: collision with root package name */
    public static final B0.E f980f;

    /* renamed from: g, reason: collision with root package name */
    public static final B0.E f981g;

    /* renamed from: h, reason: collision with root package name */
    public static final E f982h = new E(false);

    /* renamed from: i, reason: collision with root package name */
    public static final E f983i = new E(true);

    static {
        int i2 = 14;
        f975a = new B0.E(i2, "RESUME_TOKEN");
        f976b = new B0.E(i2, "CLOSED_EMPTY");
        f977c = new B0.E(i2, "COMPLETING_ALREADY");
        f978d = new B0.E(i2, "COMPLETING_WAITING_CHILDREN");
        f979e = new B0.E(i2, "COMPLETING_RETRY");
        f980f = new B0.E(i2, "TOO_LATE_TO_CANCEL");
        f981g = new B0.E(i2, "SEALED");
    }

    public static final G0.i a(G0.i iVar, G0.i iVar2, boolean z2) {
        Boolean bool = Boolean.FALSE;
        C0076p c0076p = C0076p.f967h;
        boolean booleanValue = ((Boolean) iVar.h(bool, c0076p)).booleanValue();
        boolean booleanValue2 = ((Boolean) iVar2.h(bool, c0076p)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return iVar.j(iVar2);
        }
        C0076p c0076p2 = new C0076p(2, 2);
        G0.j jVar = G0.j.f500e;
        G0.i iVar3 = (G0.i) iVar.h(jVar, c0076p2);
        Object obj = iVar2;
        if (booleanValue2) {
            obj = iVar2.h(jVar, C0076p.f966g);
        }
        return iVar3.j((G0.i) obj);
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final C0066f c(G0.d dVar) {
        C0066f c0066f;
        C0066f c0066f2;
        if (!(dVar instanceof b1.h)) {
            return new C0066f(1, dVar);
        }
        b1.h hVar = (b1.h) dVar;
        hVar.getClass();
        B0.E e2 = AbstractC0115a.f1738d;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b1.h.f1748l;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            c0066f = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(hVar, e2);
                c0066f2 = null;
                break;
            }
            if (obj instanceof C0066f) {
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, e2)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                        break;
                    }
                }
                c0066f2 = (C0066f) obj;
                break loop0;
            }
            if (obj != e2 && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (c0066f2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0066f.f948k;
            Object obj2 = atomicReferenceFieldUpdater2.get(c0066f2);
            if (!(obj2 instanceof C0073m) || ((C0073m) obj2).f962d == null) {
                C0066f.f947j.set(c0066f2, 536870911);
                atomicReferenceFieldUpdater2.set(c0066f2, C0062b.f942e);
                c0066f = c0066f2;
            } else {
                c0066f2.q();
            }
            if (c0066f != null) {
                return c0066f;
            }
        }
        return new C0066f(2, dVar);
    }

    public static final void d(G0.i iVar, Throwable th) {
        try {
            X0.b bVar = (X0.b) iVar.m(C0079t.f973e);
            if (bVar != null) {
                bVar.c(th);
            } else {
                AbstractC0115a.c(iVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                AbstractC0086a.c(runtimeException, th);
                th = runtimeException;
            }
            AbstractC0115a.c(iVar, th);
        }
    }

    public static /* synthetic */ C e(P p2, boolean z2, U u2, int i2) {
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        return ((Z) p2).H(z2, (i2 & 2) != 0, u2);
    }

    public static e0 f(InterfaceC0080u interfaceC0080u, O0.p pVar) {
        G0.i a2 = a(interfaceC0080u.c(), G0.j.f500e, true);
        d1.d dVar = B.f905a;
        if (a2 != dVar && a2.m(G0.e.f499e) == null) {
            a2 = a2.j(dVar);
        }
        e0 e0Var = new e0(a2, true);
        e0Var.V(1, e0Var, pVar);
        return e0Var;
    }

    public static final Object g(Object obj) {
        return obj instanceof C0074n ? AbstractC0086a.l(((C0074n) obj).f965a) : obj;
    }

    public static final void h(C0066f c0066f, G0.d dVar, boolean z2) {
        Object obj = C0066f.f948k.get(c0066f);
        Throwable h2 = c0066f.h(obj);
        Object l2 = h2 != null ? AbstractC0086a.l(h2) : c0066f.i(obj);
        if (!z2) {
            dVar.g(l2);
            return;
        }
        P0.h.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        b1.h hVar = (b1.h) dVar;
        I0.b bVar = hVar.f1750i;
        Object obj2 = hVar.f1752k;
        G0.i e2 = bVar.e();
        Object l3 = AbstractC0115a.l(e2, obj2);
        j0 l4 = l3 != AbstractC0115a.f1740f ? l(bVar, e2, l3) : null;
        try {
            bVar.g(l2);
            if (l4 == null || l4.W()) {
                AbstractC0115a.f(e2, l3);
            }
        } catch (Throwable th) {
            if (l4 == null || l4.W()) {
                AbstractC0115a.f(e2, l3);
            }
            throw th;
        }
    }

    public static Object i(O0.p pVar) {
        G0.i iVar;
        Thread currentThread = Thread.currentThread();
        H a2 = h0.a();
        boolean booleanValue = ((Boolean) a2.h(Boolean.FALSE, C0076p.f967h)).booleanValue();
        if (booleanValue) {
            G0.j jVar = G0.j.f500e;
            iVar = (G0.i) (booleanValue ? a2.h(jVar, C0076p.f966g) : a2);
            jVar.j(iVar);
        } else {
            iVar = a2;
        }
        d1.d dVar = B.f905a;
        if (iVar != dVar && iVar.m(G0.e.f499e) == null) {
            iVar = iVar.j(dVar);
        }
        C0063c c0063c = new C0063c(iVar, currentThread, a2);
        c0063c.V(1, c0063c, pVar);
        H h2 = c0063c.f945i;
        if (h2 != null) {
            int i2 = H.f912j;
            h2.g(false);
        }
        while (!Thread.interrupted()) {
            try {
                long k2 = h2 != null ? h2.k() : Long.MAX_VALUE;
                if (!(c0063c.D() instanceof L)) {
                    if (h2 != null) {
                        int i3 = H.f912j;
                        h2.e(false);
                    }
                    Object k3 = k(c0063c.D());
                    C0074n c0074n = k3 instanceof C0074n ? (C0074n) k3 : null;
                    if (c0074n == null) {
                        return k3;
                    }
                    throw c0074n.f965a;
                }
                LockSupport.parkNanos(c0063c, k2);
            } catch (Throwable th) {
                if (h2 != null) {
                    int i4 = H.f912j;
                    h2.e(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        c0063c.r(interruptedException);
        throw interruptedException;
    }

    public static final String j(G0.d dVar) {
        Object l2;
        if (dVar instanceof b1.h) {
            return dVar.toString();
        }
        try {
            l2 = dVar + '@' + b(dVar);
        } catch (Throwable th) {
            l2 = AbstractC0086a.l(th);
        }
        if (D0.e.a(l2) != null) {
            l2 = dVar.getClass().getName() + '@' + b(dVar);
        }
        return (String) l2;
    }

    public static final Object k(Object obj) {
        L l2;
        M m2 = obj instanceof M ? (M) obj : null;
        return (m2 == null || (l2 = m2.f918a) == null) ? obj : l2;
    }

    public static final j0 l(G0.d dVar, G0.i iVar, Object obj) {
        j0 j0Var = null;
        if ((dVar instanceof I0.c) && iVar.m(k0.f958e) != null) {
            I0.c cVar = (I0.c) dVar;
            while (true) {
                if ((cVar instanceof C0085z) || (cVar = cVar.d()) == null) {
                    break;
                }
                if (cVar instanceof j0) {
                    j0Var = (j0) cVar;
                    break;
                }
            }
            if (j0Var != null) {
                j0Var.X(iVar, obj);
            }
        }
        return j0Var;
    }

    public static final Object m(G0.i iVar, O0.p pVar, I0.g gVar) {
        G0.i iVar2 = gVar.f527f;
        P0.h.b(iVar2);
        G0.i j2 = !((Boolean) iVar.h(Boolean.FALSE, C0076p.f967h)).booleanValue() ? iVar2.j(iVar) : a(iVar2, iVar, false);
        P p2 = (P) j2.m(C0079t.f974f);
        if (p2 != null && !p2.a()) {
            throw ((Z) p2).z();
        }
        if (j2 == iVar2) {
            b1.u uVar = new b1.u(gVar, j2);
            return androidx.datastore.preferences.protobuf.k0.I(uVar, uVar, pVar);
        }
        G0.e eVar = G0.e.f499e;
        if (P0.h.a(j2.m(eVar), iVar2.m(eVar))) {
            j0 j0Var = new j0(j2, gVar);
            G0.i iVar3 = j0Var.f941g;
            Object l2 = AbstractC0115a.l(iVar3, null);
            try {
                return androidx.datastore.preferences.protobuf.k0.I(j0Var, j0Var, pVar);
            } finally {
                AbstractC0115a.f(iVar3, l2);
            }
        }
        C0085z c0085z = new C0085z(gVar, j2);
        androidx.datastore.preferences.protobuf.k0.H(pVar, c0085z, c0085z);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C0085z.f987i;
        do {
            int i2 = atomicIntegerFieldUpdater.get(c0085z);
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                Object k2 = k(c0085z.D());
                if (k2 instanceof C0074n) {
                    throw ((C0074n) k2).f965a;
                }
                return k2;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(c0085z, 0, 1));
        return H0.a.f511e;
    }
}
