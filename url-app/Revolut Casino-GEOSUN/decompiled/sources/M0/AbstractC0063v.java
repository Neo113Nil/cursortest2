package M0;

import R0.AbstractC0068a;
import a.AbstractC0069a;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import u0.AbstractC0244d;

/* renamed from: M0.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0063v {

    /* renamed from: c, reason: collision with root package name */
    public static final A.j f690c;

    /* renamed from: d, reason: collision with root package name */
    public static final A.j f691d;

    /* renamed from: e, reason: collision with root package name */
    public static final A.j f692e;

    /* renamed from: f, reason: collision with root package name */
    public static final A.j f693f;

    /* renamed from: g, reason: collision with root package name */
    public static final A.j f694g;

    /* renamed from: a, reason: collision with root package name */
    public static final A.j f688a = new A.j(11, "RESUME_TOKEN");

    /* renamed from: b, reason: collision with root package name */
    public static final A.j f689b = new A.j(11, "CLOSED_EMPTY");

    /* renamed from: h, reason: collision with root package name */
    public static final E f695h = new E(false);

    /* renamed from: i, reason: collision with root package name */
    public static final E f696i = new E(true);

    static {
        int i2 = 11;
        f690c = new A.j(i2, "COMPLETING_ALREADY");
        f691d = new A.j(i2, "COMPLETING_WAITING_CHILDREN");
        f692e = new A.j(i2, "COMPLETING_RETRY");
        f693f = new A.j(i2, "TOO_LATE_TO_CANCEL");
        f694g = new A.j(i2, "SEALED");
    }

    public static final w0.i a(w0.i iVar, w0.i iVar2, boolean z2) {
        Boolean bool = Boolean.FALSE;
        C0058p c0058p = C0058p.f680h;
        boolean booleanValue = ((Boolean) iVar.h(bool, c0058p)).booleanValue();
        boolean booleanValue2 = ((Boolean) iVar2.h(bool, c0058p)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return iVar.k(iVar2);
        }
        w0.j jVar = w0.j.f3082e;
        w0.i iVar3 = (w0.i) iVar.h(jVar, new C0058p(2, 2));
        Object obj = iVar2;
        if (booleanValue2) {
            obj = iVar2.h(jVar, C0058p.f679g);
        }
        return iVar3.k((w0.i) obj);
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final C0048f c(w0.d dVar) {
        C0048f c0048f;
        C0048f c0048f2;
        if (!(dVar instanceof R0.h)) {
            return new C0048f(1, dVar);
        }
        R0.h hVar = (R0.h) dVar;
        hVar.getClass();
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = R0.h.f906l;
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            A.j jVar = AbstractC0068a.f896d;
            c0048f = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(hVar, jVar);
                c0048f2 = null;
                break;
            }
            if (obj instanceof C0048f) {
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, jVar)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                        break;
                    }
                }
                c0048f2 = (C0048f) obj;
                break loop0;
            }
            if (obj != jVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (c0048f2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0048f.f659k;
            Object obj2 = atomicReferenceFieldUpdater2.get(c0048f2);
            if (!(obj2 instanceof C0055m) || ((C0055m) obj2).f673d == null) {
                C0048f.f658j.set(c0048f2, 536870911);
                atomicReferenceFieldUpdater2.set(c0048f2, C0044b.f653e);
                c0048f = c0048f2;
            } else {
                c0048f2.p();
            }
            if (c0048f != null) {
                return c0048f;
            }
        }
        return new C0048f(2, dVar);
    }

    public static final void d(Throwable th, w0.i iVar) {
        try {
            N0.b bVar = (N0.b) iVar.f(C0061t.f686e);
            if (bVar != null) {
                bVar.c(th, iVar);
            } else {
                AbstractC0068a.e(th, iVar);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                o.g.a(runtimeException, th);
                th = runtimeException;
            }
            AbstractC0068a.e(th, iVar);
        }
    }

    public static /* synthetic */ C e(P p2, boolean z2, U u2, int i2) {
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        return ((Z) p2).G(z2, (i2 & 2) != 0, u2);
    }

    public static final boolean f(int i2) {
        return i2 == 1 || i2 == 2;
    }

    public static e0 g(InterfaceC0062u interfaceC0062u, E0.p pVar) {
        w0.i a2 = a(interfaceC0062u.m(), w0.j.f3082e, true);
        T0.d dVar = B.f616a;
        if (a2 != dVar && a2.f(w0.e.f3081e) == null) {
            a2 = a2.k(dVar);
        }
        e0 e0Var = new e0(a2, true);
        e0Var.U(1, e0Var, pVar);
        return e0Var;
    }

    public static final Object h(Object obj) {
        return obj instanceof C0056n ? o.g.f(((C0056n) obj).f676a) : obj;
    }

    public static final void i(C0048f c0048f, w0.d dVar, boolean z2) {
        Object obj = C0048f.f659k.get(c0048f);
        Throwable f2 = c0048f.f(obj);
        Object f3 = f2 != null ? o.g.f(f2) : c0048f.h(obj);
        if (!z2) {
            dVar.resumeWith(f3);
            return;
        }
        F0.i.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        R0.h hVar = (R0.h) dVar;
        y0.b bVar = hVar.f908i;
        w0.i context = bVar.getContext();
        Object n2 = AbstractC0068a.n(context, hVar.f910k);
        j0 m2 = n2 != AbstractC0068a.f898f ? m(bVar, context, n2) : null;
        try {
            bVar.resumeWith(f3);
        } finally {
            if (m2 == null || m2.V()) {
                AbstractC0068a.h(context, n2);
            }
        }
    }

    public static Object j(E0.p pVar) {
        w0.j jVar = w0.j.f3082e;
        Thread currentThread = Thread.currentThread();
        w0.e eVar = w0.e.f3081e;
        H a2 = h0.a();
        w0.i a3 = a(jVar, a2, true);
        T0.d dVar = B.f616a;
        if (a3 != dVar && a3.f(eVar) == null) {
            a3 = a3.k(dVar);
        }
        C0045c c0045c = new C0045c(a3, currentThread, a2);
        c0045c.U(1, c0045c, pVar);
        H h2 = c0045c.f656i;
        if (h2 != null) {
            int i2 = H.f623j;
            h2.j(false);
        }
        while (!Thread.interrupted()) {
            try {
                long l2 = h2 != null ? h2.l() : Long.MAX_VALUE;
                if (!(c0045c.C() instanceof L)) {
                    if (h2 != null) {
                        int i3 = H.f623j;
                        h2.e(false);
                    }
                    Object l3 = l(c0045c.C());
                    C0056n c0056n = l3 instanceof C0056n ? (C0056n) l3 : null;
                    if (c0056n == null) {
                        return l3;
                    }
                    throw c0056n.f676a;
                }
                LockSupport.parkNanos(c0045c, l2);
            } catch (Throwable th) {
                if (h2 != null) {
                    int i4 = H.f623j;
                    h2.e(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        c0045c.q(interruptedException);
        throw interruptedException;
    }

    public static final String k(w0.d dVar) {
        Object f2;
        if (dVar instanceof R0.h) {
            return dVar.toString();
        }
        try {
            f2 = dVar + '@' + b(dVar);
        } catch (Throwable th) {
            f2 = o.g.f(th);
        }
        if (AbstractC0244d.a(f2) != null) {
            f2 = dVar.getClass().getName() + '@' + b(dVar);
        }
        return (String) f2;
    }

    public static final Object l(Object obj) {
        L l2;
        M m2 = obj instanceof M ? (M) obj : null;
        return (m2 == null || (l2 = m2.f629a) == null) ? obj : l2;
    }

    public static final j0 m(w0.d dVar, w0.i iVar, Object obj) {
        j0 j0Var = null;
        if (!(dVar instanceof y0.c)) {
            return null;
        }
        if (iVar.f(k0.f669e) != null) {
            y0.c cVar = (y0.c) dVar;
            while (true) {
                if ((cVar instanceof C0067z) || (cVar = cVar.g()) == null) {
                    break;
                }
                if (cVar instanceof j0) {
                    j0Var = (j0) cVar;
                    break;
                }
            }
            if (j0Var != null) {
                j0Var.W(iVar, obj);
            }
        }
        return j0Var;
    }

    public static final Object n(w0.i iVar, E0.p pVar, y0.f fVar) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        w0.i iVar2 = fVar.f3098f;
        F0.i.b(iVar2);
        w0.i k2 = !((Boolean) iVar.h(Boolean.FALSE, C0058p.f680h)).booleanValue() ? iVar2.k(iVar) : a(iVar2, iVar, false);
        P p2 = (P) k2.f(C0061t.f687f);
        if (p2 != null && !p2.b()) {
            throw ((Z) p2).y();
        }
        if (k2 == iVar2) {
            R0.u uVar = new R0.u(fVar, k2);
            return AbstractC0069a.I(uVar, uVar, pVar);
        }
        w0.e eVar = w0.e.f3081e;
        if (F0.i.a(k2.f(eVar), iVar2.f(eVar))) {
            j0 j0Var = new j0(k2, fVar);
            w0.i iVar3 = j0Var.f652g;
            Object n2 = AbstractC0068a.n(iVar3, null);
            try {
                return AbstractC0069a.I(j0Var, j0Var, pVar);
            } finally {
                AbstractC0068a.h(iVar3, n2);
            }
        }
        C0067z c0067z = new C0067z(fVar, k2);
        AbstractC0069a.H(pVar, c0067z, c0067z);
        do {
            atomicIntegerFieldUpdater = C0067z.f700i;
            int i2 = atomicIntegerFieldUpdater.get(c0067z);
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                Object l2 = l(c0067z.C());
                if (l2 instanceof C0056n) {
                    throw ((C0056n) l2).f676a;
                }
                return l2;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(c0067z, 0, 1));
        return x0.a.f3094e;
    }
}
