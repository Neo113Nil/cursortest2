package k1;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static final o0.a f717a;

    /* renamed from: b, reason: collision with root package name */
    public static final o0.a f718b;

    /* renamed from: c, reason: collision with root package name */
    public static final o0.a f719c;

    /* renamed from: d, reason: collision with root package name */
    public static final o0.a f720d;

    /* renamed from: e, reason: collision with root package name */
    public static final o0.a f721e;

    /* renamed from: f, reason: collision with root package name */
    public static final o0.a f722f;

    /* renamed from: g, reason: collision with root package name */
    public static final o0.a f723g;

    /* renamed from: h, reason: collision with root package name */
    public static final a0 f724h = new a0(false);

    /* renamed from: i, reason: collision with root package name */
    public static final a0 f725i = new a0(true);

    static {
        int i2 = 2;
        f717a = new o0.a(i2, "RESUME_TOKEN");
        f718b = new o0.a(i2, "CLOSED_EMPTY");
        f719c = new o0.a(i2, "COMPLETING_ALREADY");
        f720d = new o0.a(i2, "COMPLETING_WAITING_CHILDREN");
        f721e = new o0.a(i2, "COMPLETING_RETRY");
        f722f = new o0.a(i2, "TOO_LATE_TO_CANCEL");
        f723g = new o0.a(i2, "SEALED");
    }

    public static final String a(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final d b(v0.d dVar) {
        d dVar2;
        d dVar3;
        if (!(dVar instanceof p1.h)) {
            return new d(dVar, 1);
        }
        p1.h hVar = (p1.h) dVar;
        o0.a aVar = p1.a.f1036d;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = p1.h.f1046i;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            dVar2 = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(hVar, aVar);
                dVar3 = null;
                break;
            }
            if (obj instanceof d) {
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, aVar)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                        break;
                    }
                }
                dVar3 = (d) obj;
                break loop0;
            }
            if (obj != aVar && !(obj instanceof Throwable)) {
                f0.l.f("Inconsistent state ", obj);
                return null;
            }
        }
        if (dVar3 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = d.f672h;
            Object obj2 = atomicReferenceFieldUpdater2.get(dVar3);
            if (!(obj2 instanceof i) || ((i) obj2).f684c == null) {
                d.f671g.set(dVar3, 536870911);
                atomicReferenceFieldUpdater2.set(dVar3, b.f663a);
                dVar2 = dVar3;
            } else {
                dVar3.n();
            }
            if (dVar2 != null) {
                return dVar2;
            }
        }
        return new d(dVar, 2);
    }

    public static final void c(v0.h hVar, Throwable th) {
        try {
            l1.b bVar = (l1.b) hVar.j(q.f712b);
            if (bVar != null) {
                bVar.b(th);
            } else {
                p1.a.c(hVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                a.a.a(runtimeException, th);
                th = runtimeException;
            }
            p1.a.c(hVar, th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c1, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static z d(q0 q0Var, m0 m0Var, int i2) {
        m0 m0Var2;
        Throwable th;
        boolean z2 = (i2 & 1) == 0;
        boolean z3 = (i2 & 2) != 0;
        q0Var.getClass();
        if (z2) {
            m0Var2 = m0Var instanceof k0 ? (k0) m0Var : null;
            if (m0Var2 == null) {
                m0Var2 = new i0(m0Var);
            }
        } else {
            m0Var2 = m0Var;
        }
        m0Var2.f695e = q0Var;
        loop0: while (true) {
            Object x2 = q0Var.x();
            if (x2 instanceof a0) {
                a0 a0Var = (a0) x2;
                if (a0Var.f662b) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = q0.f714b;
                    while (!atomicReferenceFieldUpdater.compareAndSet(q0Var, x2, m0Var2)) {
                        if (atomicReferenceFieldUpdater.get(q0Var) != x2) {
                            break;
                        }
                    }
                    break loop0;
                }
                r0 r0Var = new r0();
                Object f0Var = a0Var.f662b ? r0Var : new f0(r0Var);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = q0.f714b;
                while (!atomicReferenceFieldUpdater2.compareAndSet(q0Var, a0Var, f0Var) && atomicReferenceFieldUpdater2.get(q0Var) == a0Var) {
                }
            } else {
                if (!(x2 instanceof g0)) {
                    if (z3) {
                        j jVar = x2 instanceof j ? (j) x2 : null;
                        m0Var.h(jVar != null ? jVar.f689a : null);
                    }
                    return s0.f716b;
                }
                g0 g0Var = (g0) x2;
                r0 e2 = g0Var.e();
                if (e2 == null) {
                    q0Var.H((m0) x2);
                } else {
                    z zVar = s0.f716b;
                    if (z2 && (x2 instanceof o0)) {
                        synchronized (x2) {
                            try {
                                th = ((o0) x2).b();
                                if (th != null) {
                                    if ((m0Var instanceof h) && !((o0) x2).d()) {
                                    }
                                }
                                if (q0Var.k((g0) x2, e2, m0Var2)) {
                                    if (th == null) {
                                        return m0Var2;
                                    }
                                    zVar = m0Var2;
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
                            m0Var.h(th);
                        }
                        return zVar;
                    }
                    if (q0Var.k(g0Var, e2, m0Var2)) {
                        break;
                    }
                }
            }
        }
    }

    public static final v0.h e(r rVar, v0.h hVar) {
        v0.h h2;
        v0.h e2 = rVar.e();
        Boolean bool = Boolean.FALSE;
        m mVar = m.f693e;
        boolean booleanValue = ((Boolean) e2.a(bool, mVar)).booleanValue();
        boolean booleanValue2 = ((Boolean) hVar.a(bool, mVar)).booleanValue();
        if (booleanValue || booleanValue2) {
            m mVar2 = new m(2, 2);
            v0.i iVar = v0.i.f1196b;
            v0.h hVar2 = (v0.h) e2.a(iVar, mVar2);
            Object obj = hVar;
            if (booleanValue2) {
                obj = hVar.a(iVar, m.f692d);
            }
            h2 = hVar2.h((v0.h) obj);
        } else {
            h2 = e2.h(hVar);
        }
        q1.d dVar = y.f733a;
        return (h2 == dVar || h2.j(v0.e.f1195b) != null) ? h2 : h2.h(dVar);
    }

    public static final void f(d dVar, v0.d dVar2, boolean z2) {
        Object obj = d.f672h.get(dVar);
        Throwable g2 = dVar.g(obj);
        Object cVar = g2 != null ? new t0.c(g2) : dVar.h(obj);
        if (!z2) {
            dVar2.f(cVar);
            return;
        }
        dVar2.getClass();
        p1.h hVar = (p1.h) dVar2;
        x0.b bVar = hVar.f1048f;
        Object obj2 = hVar.f1050h;
        v0.h hVar2 = bVar.f1231c;
        hVar2.getClass();
        Object k2 = p1.a.k(hVar2, obj2);
        if (k2 != p1.a.f1038f) {
            h(bVar, hVar2);
        }
        try {
            bVar.f(cVar);
        } finally {
            p1.a.f(hVar2, k2);
        }
    }

    public static final String g(v0.d dVar) {
        Object cVar;
        if (dVar instanceof p1.h) {
            return dVar.toString();
        }
        try {
            cVar = dVar + '@' + a(dVar);
        } catch (Throwable th) {
            cVar = new t0.c(th);
        }
        if (t0.d.a(cVar) != null) {
            cVar = dVar.getClass().getName() + '@' + a(dVar);
        }
        return (String) cVar;
    }

    public static final void h(v0.d dVar, v0.h hVar) {
        if ((dVar instanceof x0.c) && hVar.j(x0.f732b) != null) {
            x0.c cVar = (x0.c) dVar;
            do {
                cVar = cVar.b();
            } while (cVar != null);
        }
    }
}
