package s1;

import c1.AbstractC0091d;
import c1.EnumC0088a;
import d1.AbstractC0095c;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import q.AbstractC0309e;

/* renamed from: s1.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0335s {

    /* renamed from: b, reason: collision with root package name */
    public static final U.q f4063b;

    /* renamed from: c, reason: collision with root package name */
    public static final U.q f4064c;
    public static final U.q d;

    /* renamed from: e, reason: collision with root package name */
    public static final U.q f4065e;

    /* renamed from: f, reason: collision with root package name */
    public static final U.q f4066f;

    /* renamed from: a, reason: collision with root package name */
    public static final U.q f4062a = new U.q("CLOSED_EMPTY", 2);

    /* renamed from: g, reason: collision with root package name */
    public static final A f4067g = new A(false);
    public static final A h = new A(true);

    static {
        int i = 2;
        f4063b = new U.q("COMPLETING_ALREADY", i);
        f4064c = new U.q("COMPLETING_WAITING_CHILDREN", i);
        d = new U.q("COMPLETING_RETRY", i);
        f4065e = new U.q("TOO_LATE_TO_CANCEL", i);
        f4066f = new U.q("SEALED", i);
    }

    public static final void a(b1.j jVar, CancellationException cancellationException) {
        M m2 = (M) jVar.p(C0333p.f4061b);
        if (m2 != null) {
            ((U) m2).l(cancellationException);
        }
    }

    public static final b1.j b(b1.j jVar, b1.j jVar2, boolean z2) {
        Boolean bool = Boolean.FALSE;
        C0329l c0329l = C0329l.d;
        boolean booleanValue = ((Boolean) jVar.k(bool, c0329l)).booleanValue();
        boolean booleanValue2 = ((Boolean) jVar2.k(bool, c0329l)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return jVar.j(jVar2);
        }
        b1.k kVar = b1.k.f2050a;
        b1.j jVar3 = (b1.j) jVar.k(kVar, new C0329l(2, 2));
        Object obj = jVar2;
        if (booleanValue2) {
            obj = jVar2.k(kVar, C0329l.f4054c);
        }
        return jVar3.j((b1.j) obj);
    }

    public static final String c(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final void d(b1.j jVar, Throwable th) {
        try {
            t1.b bVar = (t1.b) jVar.p(C0333p.f4060a);
            if (bVar != null) {
                bVar.r(jVar, th);
            } else {
                w1.a.a(jVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                H1.d.b(runtimeException, th);
                th = runtimeException;
            }
            w1.a.a(jVar, th);
        }
    }

    public static InterfaceC0342z e(M m2, boolean z2, P p2, int i) {
        P p3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Throwable th;
        if ((i & 1) != 0) {
            z2 = false;
        }
        boolean z3 = (i & 2) != 0;
        U u2 = (U) m2;
        u2.getClass();
        if (z2) {
            p3 = p2 instanceof O ? (O) p2 : null;
            if (p3 == null) {
                p3 = new L(p2);
            }
        } else {
            p3 = p2;
        }
        p3.d = u2;
        while (true) {
            Object x2 = u2.x();
            if (x2 instanceof A) {
                A a2 = (A) x2;
                if (a2.f4008a) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = U.f4030a;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(u2, x2, p3)) {
                        if (atomicReferenceFieldUpdater2.get(u2) != x2) {
                            break;
                        }
                    }
                    return p3;
                }
                V v2 = new V();
                Object h2 = a2.f4008a ? v2 : new H(v2);
                do {
                    atomicReferenceFieldUpdater = U.f4030a;
                    if (atomicReferenceFieldUpdater.compareAndSet(u2, a2, h2)) {
                        break;
                    }
                } while (atomicReferenceFieldUpdater.get(u2) == a2);
            } else {
                if (!(x2 instanceof I)) {
                    if (z3) {
                        C0327j c0327j = x2 instanceof C0327j ? (C0327j) x2 : null;
                        p2.g(c0327j != null ? c0327j.f4051a : null);
                    }
                    return W.f4032a;
                }
                V b2 = ((I) x2).b();
                if (b2 == null) {
                    k1.e.c(x2, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    u2.H((P) x2);
                } else {
                    InterfaceC0342z interfaceC0342z = W.f4032a;
                    if (z2 && (x2 instanceof S)) {
                        synchronized (x2) {
                            try {
                                th = ((S) x2).d();
                                if (th != null) {
                                    if ((p2 instanceof C0325h) && !((S) x2).f()) {
                                    }
                                }
                                if (u2.f((I) x2, b2, p3)) {
                                    if (th == null) {
                                        return p3;
                                    }
                                    interfaceC0342z = p3;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } else {
                        th = null;
                    }
                    if (th != null) {
                        if (z3) {
                            p2.g(th);
                        }
                        return interfaceC0342z;
                    }
                    if (u2.f((I) x2, b2, p3)) {
                        return p3;
                    }
                }
            }
        }
    }

    public static final boolean f(int i) {
        return i == 1 || i == 2;
    }

    public static Z g(InterfaceC0334q interfaceC0334q, AbstractC0332o abstractC0332o, j1.p pVar, int i) {
        b1.j jVar = abstractC0332o;
        if ((i & 1) != 0) {
            jVar = b1.k.f2050a;
        }
        b1.j b2 = b(interfaceC0334q.c(), jVar, true);
        y1.d dVar = AbstractC0341y.f4072a;
        if (b2 != dVar && b2.p(b1.e.f2046a) == null) {
            b2 = b2.j(dVar);
        }
        Z z2 = new Z(b2, true);
        int a2 = AbstractC0309e.a(1);
        if (a2 == 0) {
            b1.g.A(pVar, z2, z2);
        } else if (a2 != 1) {
            if (a2 == 2) {
                AbstractC0091d.m(AbstractC0091d.e(z2, z2, pVar)).b(X0.g.f1277c);
            } else {
                if (a2 != 3) {
                    throw new X0.b();
                }
                try {
                    b1.j jVar2 = z2.f4033c;
                    Object g2 = w1.a.g(jVar2, null);
                    try {
                        k1.k.a(pVar);
                        Object d2 = pVar.d(z2, z2);
                        if (d2 != EnumC0088a.f2060a) {
                            z2.b(d2);
                        }
                    } finally {
                        w1.a.b(jVar2, g2);
                    }
                } catch (Throwable th) {
                    z2.b(H1.l.w(th));
                }
            }
        }
        return z2;
    }

    public static final Object h(Object obj) {
        return obj instanceof C0327j ? H1.l.w(((C0327j) obj).f4051a) : obj;
    }

    public static final void i(C0321d c0321d, b1.d dVar, boolean z2) {
        Object obj = C0321d.f4038g.get(c0321d);
        Throwable d2 = c0321d.d(obj);
        Object w2 = d2 != null ? H1.l.w(d2) : c0321d.f(obj);
        if (!z2) {
            dVar.b(w2);
            return;
        }
        k1.e.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        w1.f fVar = (w1.f) dVar;
        AbstractC0095c abstractC0095c = fVar.f4496e;
        b1.j jVar = abstractC0095c.f2474b;
        k1.e.b(jVar);
        Object g2 = w1.a.g(jVar, fVar.f4498g);
        e0 k2 = g2 != w1.a.f4491e ? k(abstractC0095c, jVar, g2) : null;
        try {
            abstractC0095c.b(w2);
        } finally {
            if (k2 == null || k2.K()) {
                w1.a.b(jVar, g2);
            }
        }
    }

    public static final String j(b1.d dVar) {
        Object w2;
        if (dVar instanceof w1.f) {
            return dVar.toString();
        }
        try {
            w2 = dVar + '@' + c(dVar);
        } catch (Throwable th) {
            w2 = H1.l.w(th);
        }
        if (X0.e.a(w2) != null) {
            w2 = dVar.getClass().getName() + '@' + c(dVar);
        }
        return (String) w2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [d1.c] */
    /* JADX WARN: Type inference failed for: r2v1, types: [d1.d] */
    /* JADX WARN: Type inference failed for: r2v2, types: [d1.d] */
    public static final e0 k(AbstractC0095c abstractC0095c, b1.j jVar, Object obj) {
        e0 e0Var = null;
        if (abstractC0095c == 0) {
            return null;
        }
        if (jVar.p(f0.f4044a) != null) {
            while (true) {
                if ((abstractC0095c instanceof C0339w) || (abstractC0095c = abstractC0095c.e()) == 0) {
                    break;
                }
                if (abstractC0095c instanceof e0) {
                    e0Var = (e0) abstractC0095c;
                    break;
                }
            }
            if (e0Var != null) {
                e0Var.L(jVar, obj);
            }
        }
        return e0Var;
    }
}
