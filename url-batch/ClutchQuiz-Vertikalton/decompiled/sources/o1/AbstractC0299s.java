package o1;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import q.AbstractC0317e;

/* renamed from: o1.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0299s {

    /* renamed from: a, reason: collision with root package name */
    public static final T.r f3359a = new T.r("CLOSED_EMPTY", 1);

    /* renamed from: b, reason: collision with root package name */
    public static final T.r f3360b = new T.r("COMPLETING_ALREADY", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final T.r f3361c = new T.r("COMPLETING_WAITING_CHILDREN", 1);
    public static final T.r d = new T.r("COMPLETING_RETRY", 1);

    /* renamed from: e, reason: collision with root package name */
    public static final T.r f3362e = new T.r("TOO_LATE_TO_CANCEL", 1);

    /* renamed from: f, reason: collision with root package name */
    public static final T.r f3363f = new T.r("SEALED", 1);

    /* renamed from: g, reason: collision with root package name */
    public static final A f3364g = new A(false);
    public static final A h = new A(true);

    public static final void a(X0.i iVar, CancellationException cancellationException) {
        M m2 = (M) iVar.j(C0297p.f3358b);
        if (m2 != null) {
            U u2 = (U) m2;
            if (cancellationException == null) {
                cancellationException = new N(u2.m(), null, u2);
            }
            u2.i(cancellationException);
        }
    }

    public static final X0.i c(X0.i iVar, X0.i iVar2, boolean z2) {
        Boolean bool = Boolean.FALSE;
        C0293l c0293l = C0293l.d;
        boolean booleanValue = ((Boolean) iVar.u(bool, c0293l)).booleanValue();
        boolean booleanValue2 = ((Boolean) iVar2.u(bool, c0293l)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return iVar.k(iVar2);
        }
        X0.j jVar = X0.j.f1156a;
        X0.i iVar3 = (X0.i) iVar.u(jVar, new C0293l(2, 2));
        Object obj = iVar2;
        if (booleanValue2) {
            obj = iVar2.u(jVar, C0293l.f3351c);
        }
        return iVar3.k((X0.i) obj);
    }

    public static final String d(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final void e(X0.i iVar, Throwable th) {
        try {
            p1.b bVar = (p1.b) iVar.j(C0297p.f3357a);
            if (bVar != null) {
                bVar.y(iVar, th);
            } else {
                s1.a.a(iVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                T.d.g(runtimeException, th);
                th = runtimeException;
            }
            s1.a.a(iVar, th);
        }
    }

    public static InterfaceC0306z f(M m2, boolean z2, P p2, int i) {
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
            Object w2 = u2.w();
            if (w2 instanceof A) {
                A a2 = (A) w2;
                if (a2.f3305a) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = U.f3327a;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(u2, w2, p3)) {
                        if (atomicReferenceFieldUpdater2.get(u2) != w2) {
                            break;
                        }
                    }
                    return p3;
                }
                V v2 = new V();
                Object h2 = a2.f3305a ? v2 : new H(v2);
                do {
                    atomicReferenceFieldUpdater = U.f3327a;
                    if (atomicReferenceFieldUpdater.compareAndSet(u2, a2, h2)) {
                        break;
                    }
                } while (atomicReferenceFieldUpdater.get(u2) == a2);
            } else {
                if (!(w2 instanceof I)) {
                    if (z3) {
                        C0291j c0291j = w2 instanceof C0291j ? (C0291j) w2 : null;
                        p2.g(c0291j != null ? c0291j.f3348a : null);
                    }
                    return W.f3329a;
                }
                V b2 = ((I) w2).b();
                if (b2 == null) {
                    g1.f.c(w2, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    u2.G((P) w2);
                } else {
                    InterfaceC0306z interfaceC0306z = W.f3329a;
                    if (z2 && (w2 instanceof S)) {
                        synchronized (w2) {
                            try {
                                th = ((S) w2).d();
                                if (th != null) {
                                    if ((p2 instanceof C0289h) && !((S) w2).f()) {
                                    }
                                }
                                if (u2.d((I) w2, b2, p3)) {
                                    if (th == null) {
                                        return p3;
                                    }
                                    interfaceC0306z = p3;
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
                        return interfaceC0306z;
                    }
                    if (u2.d((I) w2, b2, p3)) {
                        return p3;
                    }
                }
            }
        }
    }

    public static final boolean g(int i) {
        return i == 1 || i == 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Z h(InterfaceC0298q interfaceC0298q, AbstractC0296o abstractC0296o, f1.p pVar) {
        X0.i c2 = c(interfaceC0298q.c(), abstractC0296o, true);
        u1.d dVar = AbstractC0305y.f3369a;
        if (c2 != dVar && c2.j(X0.e.f1155a) == null) {
            c2 = c2.k(dVar);
        }
        Z z2 = new Z(c2, true);
        int a2 = AbstractC0317e.a(1);
        if (a2 == 0) {
            h0.g.n(pVar, z2, z2);
        } else if (a2 != 1) {
            if (a2 == 2) {
                T.d.y(((Z0.e) pVar).a(z2, z2)).b(U0.i.f864a);
            } else {
                if (a2 != 3) {
                    throw new U0.c();
                }
                try {
                    X0.i iVar = z2.f3330c;
                    Object g2 = s1.a.g(iVar, null);
                    try {
                        g1.l.a(pVar);
                        Object d2 = pVar.d(z2, z2);
                        if (d2 != Y0.a.f1163a) {
                            z2.b(d2);
                        }
                    } finally {
                        s1.a.b(iVar, g2);
                    }
                } catch (Throwable th) {
                    z2.b(T.d.p(th));
                }
            }
        }
        return z2;
    }

    public static final Object i(Object obj) {
        return obj instanceof C0291j ? T.d.p(((C0291j) obj).f3348a) : obj;
    }

    public static final void j(C0285d c0285d, X0.d dVar, boolean z2) {
        Object obj = C0285d.f3335g.get(c0285d);
        Throwable d2 = c0285d.d(obj);
        Object p2 = d2 != null ? T.d.p(d2) : c0285d.f(obj);
        if (!z2) {
            dVar.b(p2);
            return;
        }
        g1.f.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        s1.f fVar = (s1.f) dVar;
        Z0.e eVar = fVar.f3647e;
        X0.i iVar = eVar.f1173b;
        g1.f.b(iVar);
        Object g2 = s1.a.g(iVar, fVar.f3649g);
        e0 l2 = g2 != s1.a.f3642e ? l(eVar, iVar, g2) : null;
        try {
            eVar.b(p2);
        } finally {
            if (l2 == null || l2.J()) {
                s1.a.b(iVar, g2);
            }
        }
    }

    public static final String k(X0.d dVar) {
        Object p2;
        if (dVar instanceof s1.f) {
            return dVar.toString();
        }
        try {
            p2 = dVar + '@' + d(dVar);
        } catch (Throwable th) {
            p2 = T.d.p(th);
        }
        if (U0.f.a(p2) != null) {
            p2 = dVar.getClass().getName() + '@' + d(dVar);
        }
        return (String) p2;
    }

    public static final e0 l(X0.d dVar, X0.i iVar, Object obj) {
        e0 e0Var = null;
        if (!(dVar instanceof Z0.b)) {
            return null;
        }
        if (iVar.j(f0.f3341a) != null) {
            Z0.b bVar = (Z0.b) dVar;
            while (true) {
                if ((bVar instanceof C0303w) || (bVar = bVar.e()) == null) {
                    break;
                }
                if (bVar instanceof e0) {
                    e0Var = (e0) bVar;
                    break;
                }
            }
            if (e0Var != null) {
                e0Var.K(iVar, obj);
            }
        }
        return e0Var;
    }

    public static final Object m(AbstractC0296o abstractC0296o, f1.p pVar, X0.d dVar) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        I i;
        X0.i h2 = dVar.h();
        X0.i k2 = !((Boolean) abstractC0296o.u(Boolean.FALSE, C0293l.d)).booleanValue() ? h2.k(abstractC0296o) : c(h2, abstractC0296o, false);
        M m2 = (M) k2.j(C0297p.f3358b);
        if (m2 != null && !m2.a()) {
            throw ((U) m2).s();
        }
        if (k2 == h2) {
            s1.q qVar = new s1.q(k2, dVar);
            return h0.g.o(qVar, qVar, pVar);
        }
        X0.e eVar = X0.e.f1155a;
        if (g1.f.a(k2.j(eVar), h2.j(eVar))) {
            e0 e0Var = new e0(k2, dVar);
            X0.i iVar = e0Var.f3330c;
            Object g2 = s1.a.g(iVar, null);
            try {
                return h0.g.o(e0Var, e0Var, pVar);
            } finally {
                s1.a.b(iVar, g2);
            }
        }
        C0303w c0303w = new C0303w(k2, dVar);
        h0.g.n(pVar, c0303w, c0303w);
        do {
            atomicIntegerFieldUpdater = C0303w.f3367e;
            int i2 = atomicIntegerFieldUpdater.get(c0303w);
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                Object w2 = c0303w.w();
                J j2 = w2 instanceof J ? (J) w2 : null;
                if (j2 != null && (i = j2.f3313a) != null) {
                    w2 = i;
                }
                if (w2 instanceof C0291j) {
                    throw ((C0291j) w2).f3348a;
                }
                return w2;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(c0303w, 0, 1));
        return Y0.a.f1163a;
    }
}
