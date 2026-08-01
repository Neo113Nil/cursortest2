package r1;

import a.AbstractC0058a;
import b1.EnumC0098a;
import c1.AbstractC0104a;
import c1.AbstractC0106c;
import c1.InterfaceC0107d;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import s.AbstractC0380e;

/* renamed from: r1.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0369t {

    /* renamed from: a, reason: collision with root package name */
    public static final V.q f4091a = new V.q("RESUME_TOKEN", 1);

    /* renamed from: b, reason: collision with root package name */
    public static final V.q f4092b = new V.q("CLOSED_EMPTY", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final V.q f4093c = new V.q("COMPLETING_ALREADY", 1);

    /* renamed from: d, reason: collision with root package name */
    public static final V.q f4094d = new V.q("COMPLETING_WAITING_CHILDREN", 1);
    public static final V.q e = new V.q("COMPLETING_RETRY", 1);

    /* renamed from: f, reason: collision with root package name */
    public static final V.q f4095f = new V.q("TOO_LATE_TO_CANCEL", 1);

    /* renamed from: g, reason: collision with root package name */
    public static final V.q f4096g = new V.q("SEALED", 1);

    /* renamed from: h, reason: collision with root package name */
    public static final B f4097h = new B(false);
    public static final B i = new B(true);

    public static final void a(a1.i iVar, CancellationException cancellationException) {
        N n2 = (N) iVar.d(C0367q.f4090b);
        if (n2 != null) {
            ((V) n2).g(cancellationException);
        }
    }

    public static final a1.i b(a1.i iVar, a1.i iVar2, boolean z2) {
        Boolean bool = Boolean.FALSE;
        C0363m c0363m = C0363m.f4083d;
        boolean booleanValue = ((Boolean) iVar.q(bool, c0363m)).booleanValue();
        boolean booleanValue2 = ((Boolean) iVar2.q(bool, c0363m)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return iVar.B(iVar2);
        }
        a1.j jVar = a1.j.f1673a;
        a1.i iVar3 = (a1.i) iVar.q(jVar, new C0363m(2, 2));
        Object obj = iVar2;
        if (booleanValue2) {
            obj = iVar2.q(jVar, C0363m.f4082c);
        }
        return iVar3.B((a1.i) obj);
    }

    public static final String c(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final C0355e d(a1.d dVar) {
        C0355e c0355e;
        C0355e c0355e2;
        if (!(dVar instanceof w1.g)) {
            return new C0355e(dVar, 1);
        }
        w1.g gVar = (w1.g) dVar;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = w1.g.f4473h;
            Object obj = atomicReferenceFieldUpdater.get(gVar);
            V.q qVar = w1.a.f4465d;
            c0355e = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(gVar, qVar);
                c0355e2 = null;
                break;
            }
            if (obj instanceof C0355e) {
                while (!atomicReferenceFieldUpdater.compareAndSet(gVar, obj, qVar)) {
                    if (atomicReferenceFieldUpdater.get(gVar) != obj) {
                        break;
                    }
                }
                c0355e2 = (C0355e) obj;
                break loop0;
            }
            if (obj != qVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (c0355e2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0355e.f4068g;
            Object obj2 = atomicReferenceFieldUpdater2.get(c0355e2);
            if (!(obj2 instanceof C0360j) || ((C0360j) obj2).f4077d == null) {
                C0355e.f4067f.set(c0355e2, 536870911);
                atomicReferenceFieldUpdater2.set(c0355e2, C0352b.f4064a);
                c0355e = c0355e2;
            } else {
                c0355e2.l();
            }
            if (c0355e != null) {
                return c0355e;
            }
        }
        return new C0355e(dVar, 2);
    }

    public static final void e(a1.i iVar, Throwable th) {
        try {
            s1.b bVar = (s1.b) iVar.d(C0367q.f4089a);
            if (bVar != null) {
                bVar.D(iVar, th);
            } else {
                w1.a.e(iVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                AbstractC0058a.a(runtimeException, th);
                th = runtimeException;
            }
            w1.a.e(iVar, th);
        }
    }

    public static A f(N n2, boolean z2, Q q2, int i2) {
        Q q3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Throwable th;
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        boolean z3 = (i2 & 2) != 0;
        V v2 = (V) n2;
        v2.getClass();
        if (z2) {
            q3 = q2 instanceof P ? (P) q2 : null;
            if (q3 == null) {
                q3 = new M(q2);
            }
        } else {
            q3 = q2;
        }
        q3.f4049d = v2;
        while (true) {
            Object s2 = v2.s();
            if (s2 instanceof B) {
                B b2 = (B) s2;
                if (b2.f4036a) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = V.f4060a;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(v2, s2, q3)) {
                        if (atomicReferenceFieldUpdater2.get(v2) != s2) {
                            break;
                        }
                    }
                    return q3;
                }
                W w2 = new W();
                Object i3 = b2.f4036a ? w2 : new I(w2);
                do {
                    atomicReferenceFieldUpdater = V.f4060a;
                    if (atomicReferenceFieldUpdater.compareAndSet(v2, b2, i3)) {
                        break;
                    }
                } while (atomicReferenceFieldUpdater.get(v2) == b2);
            } else {
                if (!(s2 instanceof J)) {
                    if (z3) {
                        C0361k c0361k = s2 instanceof C0361k ? (C0361k) s2 : null;
                        q2.g(c0361k != null ? c0361k.f4079a : null);
                    }
                    return X.f4062a;
                }
                W b3 = ((J) s2).b();
                if (b3 == null) {
                    j1.h.c(s2, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    v2.E((Q) s2);
                } else {
                    A a2 = X.f4062a;
                    if (z2 && (s2 instanceof T)) {
                        synchronized (s2) {
                            try {
                                th = ((T) s2).d();
                                if (th != null) {
                                    if ((q2 instanceof C0359i) && !((T) s2).f()) {
                                    }
                                }
                                if (v2.c((J) s2, b3, q3)) {
                                    if (th == null) {
                                        return q3;
                                    }
                                    a2 = q3;
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
                            q2.g(th);
                        }
                        return a2;
                    }
                    if (v2.c((J) s2, b3, q3)) {
                        return q3;
                    }
                }
            }
        }
    }

    public static final boolean g(int i2) {
        return i2 == 1 || i2 == 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static a0 h(r rVar, AbstractC0366p abstractC0366p, i1.p pVar, int i2) {
        a1.i iVar = abstractC0366p;
        if ((i2 & 1) != 0) {
            iVar = a1.j.f1673a;
        }
        a1.i b2 = b(rVar.b(), iVar, true);
        y1.d dVar = AbstractC0375z.f4100a;
        if (b2 != dVar && b2.d(a1.e.f1672a) == null) {
            b2 = b2.B(dVar);
        }
        a0 a0Var = new a0(b2, true);
        int a2 = AbstractC0380e.a(1);
        if (a2 == 0) {
            H1.l.g0(pVar, a0Var, a0Var);
        } else if (a2 != 1) {
            if (a2 == 2) {
                H1.l.C(((AbstractC0104a) pVar).create(a0Var, a0Var)).resumeWith(W0.i.f1345a);
            } else {
                if (a2 != 3) {
                    throw new W0.c();
                }
                try {
                    a1.i iVar2 = a0Var.f4063c;
                    Object m2 = w1.a.m(iVar2, null);
                    try {
                        j1.n.a(2, pVar);
                        Object d2 = pVar.d(a0Var, a0Var);
                        if (d2 != EnumC0098a.f2223a) {
                            a0Var.resumeWith(d2);
                        }
                    } finally {
                        w1.a.h(iVar2, m2);
                    }
                } catch (Throwable th) {
                    a0Var.resumeWith(H1.d.r(th));
                }
            }
        }
        return a0Var;
    }

    public static final Object i(Object obj) {
        return obj instanceof C0361k ? H1.d.r(((C0361k) obj).f4079a) : obj;
    }

    public static final void j(C0355e c0355e, a1.d dVar, boolean z2) {
        Object obj = C0355e.f4068g.get(c0355e);
        Throwable d2 = c0355e.d(obj);
        Object r2 = d2 != null ? H1.d.r(d2) : c0355e.e(obj);
        if (!z2) {
            dVar.resumeWith(r2);
            return;
        }
        j1.h.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        w1.g gVar = (w1.g) dVar;
        AbstractC0106c abstractC0106c = gVar.e;
        a1.i context = abstractC0106c.getContext();
        Object m2 = w1.a.m(context, gVar.f4476g);
        f0 l2 = m2 != w1.a.f4466f ? l(abstractC0106c, context, m2) : null;
        try {
            abstractC0106c.resumeWith(r2);
        } finally {
            if (l2 == null || l2.H()) {
                w1.a.h(context, m2);
            }
        }
    }

    public static final String k(a1.d dVar) {
        Object r2;
        if (dVar instanceof w1.g) {
            return dVar.toString();
        }
        try {
            r2 = dVar + '@' + c(dVar);
        } catch (Throwable th) {
            r2 = H1.d.r(th);
        }
        if (W0.f.a(r2) != null) {
            r2 = dVar.getClass().getName() + '@' + c(dVar);
        }
        return (String) r2;
    }

    public static final f0 l(a1.d dVar, a1.i iVar, Object obj) {
        f0 f0Var = null;
        if (!(dVar instanceof InterfaceC0107d)) {
            return null;
        }
        if (iVar.d(g0.f4073a) != null) {
            InterfaceC0107d interfaceC0107d = (InterfaceC0107d) dVar;
            while (true) {
                if ((interfaceC0107d instanceof C0373x) || (interfaceC0107d = interfaceC0107d.getCallerFrame()) == null) {
                    break;
                }
                if (interfaceC0107d instanceof f0) {
                    f0Var = (f0) interfaceC0107d;
                    break;
                }
            }
            if (f0Var != null) {
                f0Var.I(iVar, obj);
            }
        }
        return f0Var;
    }
}
