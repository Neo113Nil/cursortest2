package t2;

import a.AbstractC0129a;
import b2.C0192f;
import d2.C0301d;
import d2.InterfaceC0300c;
import e2.EnumC0317a;
import f2.AbstractC0326c;
import f2.InterfaceC0327d;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import n0.C1148j;

/* renamed from: t2.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1212w {

    /* renamed from: a, reason: collision with root package name */
    public static final C1148j f10445a = new C1148j("RESUME_TOKEN");

    /* renamed from: b, reason: collision with root package name */
    public static final C1148j f10446b = new C1148j("CLOSED_EMPTY");

    /* renamed from: c, reason: collision with root package name */
    public static final C1148j f10447c = new C1148j("COMPLETING_ALREADY");

    /* renamed from: d, reason: collision with root package name */
    public static final C1148j f10448d = new C1148j("COMPLETING_WAITING_CHILDREN");

    /* renamed from: e, reason: collision with root package name */
    public static final C1148j f10449e = new C1148j("COMPLETING_RETRY");
    public static final C1148j f = new C1148j("TOO_LATE_TO_CANCEL");

    /* renamed from: g, reason: collision with root package name */
    public static final C1148j f10450g = new C1148j("SEALED");

    /* renamed from: h, reason: collision with root package name */
    public static final G f10451h = new G(false);

    /* renamed from: i, reason: collision with root package name */
    public static final G f10452i = new G(true);

    public static final y2.e a(d2.h hVar) {
        if (hVar.h(C1209t.f10441b) == null) {
            hVar = hVar.i(new X());
        }
        return new y2.e(hVar);
    }

    public static final d2.h b(d2.h hVar, d2.h hVar2, boolean z) {
        Boolean bool = Boolean.FALSE;
        C1206p c1206p = C1206p.f10434g;
        boolean booleanValue = ((Boolean) hVar.l(bool, c1206p)).booleanValue();
        boolean booleanValue2 = ((Boolean) hVar2.l(bool, c1206p)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return hVar.i(hVar2);
        }
        d2.i iVar = d2.i.f4951a;
        d2.h hVar3 = (d2.h) hVar.l(iVar, new C1206p(2, 2));
        Object obj = hVar2;
        if (booleanValue2) {
            obj = hVar2.l(iVar, C1206p.f);
        }
        return hVar3.i((d2.h) obj);
    }

    public static final String c(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final C1196f d(InterfaceC0300c interfaceC0300c) {
        C1196f c1196f;
        C1196f c1196f2;
        if (!(interfaceC0300c instanceof y2.h)) {
            return new C1196f(1, interfaceC0300c);
        }
        y2.h hVar = (y2.h) interfaceC0300c;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = y2.h.f10843h;
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            C1148j c1148j = y2.a.f10834d;
            c1196f = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(hVar, c1148j);
                c1196f2 = null;
                break;
            }
            if (obj instanceof C1196f) {
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, c1148j)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                        break;
                    }
                }
                c1196f2 = (C1196f) obj;
                break loop0;
            }
            if (obj != c1148j && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (c1196f2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C1196f.f10415g;
            Object obj2 = atomicReferenceFieldUpdater2.get(c1196f2);
            if (!(obj2 instanceof C1203m) || ((C1203m) obj2).f10427d == null) {
                C1196f.f.set(c1196f2, 536870911);
                atomicReferenceFieldUpdater2.set(c1196f2, C1192b.f10398a);
                c1196f = c1196f2;
            } else {
                c1196f2.p();
            }
            if (c1196f != null) {
                return c1196f;
            }
        }
        return new C1196f(2, interfaceC0300c);
    }

    public static final void e(d2.h hVar, Throwable th) {
        try {
            u2.b bVar = (u2.b) hVar.h(C1209t.f10440a);
            if (bVar != null) {
                bVar.c(th);
            } else {
                y2.a.c(hVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                AbstractC0129a.e(runtimeException, th);
                th = runtimeException;
            }
            y2.a.c(hVar, th);
        }
    }

    public static E f(U u3, boolean z, Z z2, int i3) {
        if ((i3 & 1) != 0) {
            z = false;
        }
        boolean z3 = (i3 & 2) != 0;
        if (u3 instanceof e0) {
            return ((e0) u3).H(z, z3, z2);
        }
        Y y3 = new Y(1, z2, Q.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0);
        e0 e0Var = (e0) u3;
        e0Var.getClass();
        return e0Var.H(z, z3, new P(y3));
    }

    public static C1215z g(InterfaceC1210u interfaceC1210u, AbstractC1208s abstractC1208s, l2.p pVar, int i3) {
        boolean z = true;
        d2.h hVar = abstractC1208s;
        if ((i3 & 1) != 0) {
            hVar = d2.i.f4951a;
        }
        EnumC1211v enumC1211v = EnumC1211v.f10442a;
        C1215z c1215z = new C1215z(h(interfaceC1210u, hVar), z, 1);
        c1215z.V(enumC1211v, c1215z, pVar);
        return c1215z;
    }

    public static final d2.h h(InterfaceC1210u interfaceC1210u, d2.h hVar) {
        d2.h b3 = b(interfaceC1210u.e(), hVar, true);
        A2.e eVar = D.f10377a;
        return (b3 == eVar || b3.h(C0301d.f4950a) != null) ? b3 : b3.i(eVar);
    }

    public static final Object i(Object obj) {
        return obj instanceof C1204n ? android.support.v4.media.session.a.k(((C1204n) obj).f10431a) : obj;
    }

    public static final void j(C1196f c1196f, InterfaceC0300c interfaceC0300c, boolean z) {
        Object obj = C1196f.f10415g.get(c1196f);
        Throwable g3 = c1196f.g(obj);
        Object k3 = g3 != null ? android.support.v4.media.session.a.k(g3) : c1196f.h(obj);
        if (!z) {
            interfaceC0300c.f(k3);
            return;
        }
        kotlin.jvm.internal.j.c(interfaceC0300c, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        y2.h hVar = (y2.h) interfaceC0300c;
        AbstractC0326c abstractC0326c = hVar.f10845e;
        d2.h context = abstractC0326c.getContext();
        Object l3 = y2.a.l(context, hVar.f10846g);
        n0 n3 = l3 != y2.a.f ? n(abstractC0326c, context, l3) : null;
        try {
            abstractC0326c.f(k3);
            if (n3 == null || n3.W()) {
                y2.a.f(context, l3);
            }
        } catch (Throwable th) {
            if (n3 == null || n3.W()) {
                y2.a.f(context, l3);
            }
            throw th;
        }
    }

    public static Object k(l2.p pVar) {
        d2.h hVar;
        Thread currentThread = Thread.currentThread();
        C0301d c0301d = C0301d.f4950a;
        J a3 = l0.a();
        boolean booleanValue = ((Boolean) a3.l(Boolean.FALSE, C1206p.f10434g)).booleanValue();
        if (booleanValue) {
            d2.i iVar = d2.i.f4951a;
            hVar = (d2.h) (booleanValue ? a3.l(iVar, C1206p.f) : a3);
            iVar.i(hVar);
        } else {
            hVar = a3;
        }
        A2.e eVar = D.f10377a;
        if (hVar != eVar && hVar.h(c0301d) == null) {
            hVar = hVar.i(eVar);
        }
        C1193c c1193c = new C1193c(hVar, currentThread, a3);
        c1193c.V(EnumC1211v.f10442a, c1193c, pVar);
        J j3 = c1193c.f10403e;
        if (j3 != null) {
            int i3 = J.f;
            j3.g(false);
        }
        while (!Thread.interrupted()) {
            try {
                long j4 = j3 != null ? j3.j() : Long.MAX_VALUE;
                if (!(c1193c.D() instanceof N)) {
                    if (j3 != null) {
                        int i4 = J.f;
                        j3.e(false);
                    }
                    Object m3 = m(c1193c.D());
                    C1204n c1204n = m3 instanceof C1204n ? (C1204n) m3 : null;
                    if (c1204n == null) {
                        return m3;
                    }
                    throw c1204n.f10431a;
                }
                LockSupport.parkNanos(c1193c, j4);
            } catch (Throwable th) {
                if (j3 != null) {
                    int i5 = J.f;
                    j3.e(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        c1193c.r(interruptedException);
        throw interruptedException;
    }

    public static final String l(InterfaceC0300c interfaceC0300c) {
        Object k3;
        if (interfaceC0300c instanceof y2.h) {
            return interfaceC0300c.toString();
        }
        try {
            k3 = interfaceC0300c + '@' + c(interfaceC0300c);
        } catch (Throwable th) {
            k3 = android.support.v4.media.session.a.k(th);
        }
        if (C0192f.a(k3) != null) {
            k3 = interfaceC0300c.getClass().getName() + '@' + c(interfaceC0300c);
        }
        return (String) k3;
    }

    public static final Object m(Object obj) {
        N n3;
        O o = obj instanceof O ? (O) obj : null;
        return (o == null || (n3 = o.f10389a) == null) ? obj : n3;
    }

    public static final n0 n(InterfaceC0300c interfaceC0300c, d2.h hVar, Object obj) {
        n0 n0Var = null;
        if ((interfaceC0300c instanceof InterfaceC0327d) && hVar.h(o0.f10433a) != null) {
            InterfaceC0327d interfaceC0327d = (InterfaceC0327d) interfaceC0300c;
            while (true) {
                if ((interfaceC0327d instanceof B) || (interfaceC0327d = interfaceC0327d.c()) == null) {
                    break;
                }
                if (interfaceC0327d instanceof n0) {
                    n0Var = (n0) interfaceC0327d;
                    break;
                }
            }
            if (n0Var != null) {
                n0Var.X(hVar, obj);
            }
        }
        return n0Var;
    }

    public static final Object o(d2.h hVar, l2.p pVar, f2.i iVar) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        d2.h hVar2 = iVar.f4981b;
        kotlin.jvm.internal.j.b(hVar2);
        d2.h i3 = !((Boolean) hVar.l(Boolean.FALSE, C1206p.f10434g)).booleanValue() ? hVar2.i(hVar) : b(hVar2, hVar, false);
        U u3 = (U) i3.h(C1209t.f10441b);
        if (u3 != null && !u3.a()) {
            throw ((e0) u3).z();
        }
        if (i3 == hVar2) {
            y2.s sVar = new y2.s(iVar, i3);
            return C2.b.I(sVar, sVar, pVar);
        }
        C0301d c0301d = C0301d.f4950a;
        if (kotlin.jvm.internal.j.a(i3.h(c0301d), hVar2.h(c0301d))) {
            n0 n0Var = new n0(i3, iVar);
            d2.h hVar3 = n0Var.f10396c;
            Object l3 = y2.a.l(hVar3, null);
            try {
                return C2.b.I(n0Var, n0Var, pVar);
            } finally {
                y2.a.f(hVar3, l3);
            }
        }
        B b3 = new B(iVar, i3);
        android.support.v4.media.session.a.S(pVar, b3, b3);
        do {
            atomicIntegerFieldUpdater = B.f10375e;
            int i4 = atomicIntegerFieldUpdater.get(b3);
            if (i4 != 0) {
                if (i4 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                Object m3 = m(b3.D());
                if (m3 instanceof C1204n) {
                    throw ((C1204n) m3).f10431a;
                }
                return m3;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(b3, 0, 1));
        return EnumC0317a.f4969a;
    }
}
