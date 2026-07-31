package H5;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import k5.AbstractC0479i;
import o5.C0565e;
import o5.C0570j;
import o5.InterfaceC0564d;
import o5.InterfaceC0567g;
import o5.InterfaceC0569i;
import p5.EnumC0580a;
import q5.AbstractC0607c;
import u0.AbstractC0676f;
import x5.InterfaceC0747p;

/* renamed from: H5.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0165z {

    /* renamed from: a, reason: collision with root package name */
    public static final M5.v f1114a = new M5.v("RESUME_TOKEN", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final M5.v f1115b = new M5.v("REMOVED_TASK", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final M5.v f1116c = new M5.v("CLOSED_EMPTY", 0);

    /* renamed from: d, reason: collision with root package name */
    public static final M5.v f1117d = new M5.v("COMPLETING_ALREADY", 0);

    /* renamed from: e, reason: collision with root package name */
    public static final M5.v f1118e = new M5.v("COMPLETING_WAITING_CHILDREN", 0);

    /* renamed from: f, reason: collision with root package name */
    public static final M5.v f1119f = new M5.v("COMPLETING_RETRY", 0);

    /* renamed from: g, reason: collision with root package name */
    public static final M5.v f1120g = new M5.v("TOO_LATE_TO_CANCEL", 0);

    /* renamed from: h, reason: collision with root package name */
    public static final M5.v f1121h = new M5.v("SEALED", 0);

    /* renamed from: i, reason: collision with root package name */
    public static final J f1122i = new J(false);

    /* renamed from: j, reason: collision with root package name */
    public static final J f1123j = new J(true);

    public static C0153m a() {
        C0153m c0153m = new C0153m(true);
        c0153m.F(null);
        return c0153m;
    }

    public static final M5.e b(InterfaceC0569i interfaceC0569i) {
        if (interfaceC0569i.m(C0162w.f1110g) == null) {
            interfaceC0569i = interfaceC0569i.v(new a0());
        }
        return new M5.e(interfaceC0569i);
    }

    public static void c(InterfaceC0163x interfaceC0163x) {
        X x6 = (X) interfaceC0163x.e().m(C0162w.f1110g);
        if (x6 != null) {
            x6.d(null);
        } else {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + interfaceC0163x).toString());
        }
    }

    public static final Object d(long j4, InterfaceC0564d interfaceC0564d) {
        if (j4 > 0) {
            C0147g c0147g = new C0147g(1, AbstractC0676f.m(interfaceC0564d));
            c0147g.r();
            if (j4 < Long.MAX_VALUE) {
                f(c0147g.f1079j).e(j4, c0147g);
            }
            Object q6 = c0147g.q();
            if (q6 == EnumC0580a.f5697f) {
                return q6;
            }
        }
        return k5.v.f5219a;
    }

    public static final InterfaceC0569i e(InterfaceC0569i interfaceC0569i, InterfaceC0569i interfaceC0569i2, boolean z5) {
        Boolean bool = Boolean.FALSE;
        C0158s c0158s = C0158s.f1097h;
        boolean booleanValue = ((Boolean) interfaceC0569i.h(bool, c0158s)).booleanValue();
        boolean booleanValue2 = ((Boolean) interfaceC0569i2.h(bool, c0158s)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return interfaceC0569i.v(interfaceC0569i2);
        }
        C0158s c0158s2 = new C0158s(2, 2);
        C0570j c0570j = C0570j.f5620f;
        InterfaceC0569i interfaceC0569i3 = (InterfaceC0569i) interfaceC0569i.h(c0570j, c0158s2);
        Object obj = interfaceC0569i2;
        if (booleanValue2) {
            obj = interfaceC0569i2.h(c0570j, C0158s.f1096g);
        }
        return interfaceC0569i3.v((InterfaceC0569i) obj);
    }

    public static final C f(InterfaceC0569i interfaceC0569i) {
        InterfaceC0567g m4 = interfaceC0569i.m(C0565e.f5619f);
        C c7 = m4 instanceof C ? (C) m4 : null;
        return c7 == null ? B.f1024a : c7;
    }

    public static final String g(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final C0147g h(InterfaceC0564d interfaceC0564d) {
        C0147g c0147g;
        C0147g c0147g2;
        if (!(interfaceC0564d instanceof M5.h)) {
            return new C0147g(1, interfaceC0564d);
        }
        M5.h hVar = (M5.h) interfaceC0564d;
        M5.v vVar = M5.a.f1585d;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = M5.h.f1595m;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            c0147g = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(hVar, vVar);
                c0147g2 = null;
                break;
            }
            if (obj instanceof C0147g) {
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, vVar)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                        break;
                    }
                }
                c0147g2 = (C0147g) obj;
                break loop0;
            }
            if (obj != vVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (c0147g2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0147g.f1076l;
            Object obj2 = atomicReferenceFieldUpdater2.get(c0147g2);
            if (!(obj2 instanceof C0155o) || ((C0155o) obj2).f1090d == null) {
                C0147g.f1075k.set(c0147g2, 536870911);
                atomicReferenceFieldUpdater2.set(c0147g2, C0142b.f1055f);
                c0147g = c0147g2;
            } else {
                c0147g2.n();
            }
            if (c0147g != null) {
                return c0147g;
            }
        }
        return new C0147g(2, interfaceC0564d);
    }

    public static final void i(InterfaceC0569i interfaceC0569i, Throwable th) {
        try {
            I5.b bVar = (I5.b) interfaceC0569i.m(C0162w.f1109f);
            if (bVar != null) {
                bVar.F(th);
            } else {
                M5.a.d(interfaceC0569i, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                i6.g.a(runtimeException, th);
                th = runtimeException;
            }
            M5.a.d(interfaceC0569i, th);
        }
    }

    public static /* synthetic */ H j(X x6, b0 b0Var, int i7) {
        return ((g0) x6).G((i7 & 1) == 0, (i7 & 2) != 0, b0Var);
    }

    public static final boolean k(InterfaceC0163x interfaceC0163x) {
        X x6 = (X) interfaceC0163x.e().m(C0162w.f1110g);
        if (x6 != null) {
            return x6.a();
        }
        return true;
    }

    public static m0 l(InterfaceC0163x interfaceC0163x, InterfaceC0569i interfaceC0569i, InterfaceC0747p interfaceC0747p, int i7) {
        if ((i7 & 1) != 0) {
            interfaceC0569i = C0570j.f5620f;
        }
        int i8 = (i7 & 2) != 0 ? 1 : 4;
        InterfaceC0569i e4 = e(interfaceC0163x.e(), interfaceC0569i, true);
        O5.d dVar = F.f1027a;
        if (e4 != dVar && e4.m(C0565e.f5619f) == null) {
            e4 = e4.v(dVar);
        }
        if (i8 == 0) {
            throw null;
        }
        m0 h0Var = i8 == 2 ? new h0(e4, interfaceC0747p) : new m0(e4, true);
        h0Var.V(i8, h0Var, interfaceC0747p);
        return h0Var;
    }

    public static final Object m(Object obj) {
        return obj instanceof C0156p ? AbstractC0676f.f(((C0156p) obj).f1093a) : obj;
    }

    public static final void n(C0147g c0147g, InterfaceC0564d interfaceC0564d, boolean z5) {
        Object obj = C0147g.f1076l.get(c0147g);
        Throwable d7 = c0147g.d(obj);
        Object f7 = d7 != null ? AbstractC0676f.f(d7) : c0147g.e(obj);
        if (!z5) {
            interfaceC0564d.resumeWith(f7);
            return;
        }
        kotlin.jvm.internal.i.c(interfaceC0564d, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        M5.h hVar = (M5.h) interfaceC0564d;
        AbstractC0607c abstractC0607c = hVar.f1597j;
        Object obj2 = hVar.f1599l;
        InterfaceC0569i context = abstractC0607c.getContext();
        Object m4 = M5.a.m(context, obj2);
        v0 s6 = m4 != M5.a.f1587f ? s(abstractC0607c, context, m4) : null;
        try {
            abstractC0607c.resumeWith(f7);
            if (s6 == null || s6.W()) {
                M5.a.g(context, m4);
            }
        } catch (Throwable th) {
            if (s6 == null || s6.W()) {
                M5.a.g(context, m4);
            }
            throw th;
        }
    }

    public static Object o(InterfaceC0747p interfaceC0747p) {
        InterfaceC0569i interfaceC0569i;
        Thread currentThread = Thread.currentThread();
        P a7 = p0.a();
        boolean booleanValue = ((Boolean) a7.h(Boolean.FALSE, C0158s.f1097h)).booleanValue();
        if (booleanValue) {
            C0570j c0570j = C0570j.f5620f;
            interfaceC0569i = (InterfaceC0569i) (booleanValue ? a7.h(c0570j, C0158s.f1096g) : a7);
            c0570j.v(interfaceC0569i);
        } else {
            interfaceC0569i = a7;
        }
        O5.d dVar = F.f1027a;
        if (interfaceC0569i != dVar && interfaceC0569i.m(C0565e.f5619f) == null) {
            interfaceC0569i = interfaceC0569i.v(dVar);
        }
        C0143c c0143c = new C0143c(interfaceC0569i, currentThread, a7);
        c0143c.V(1, c0143c, interfaceC0747p);
        P p4 = c0143c.f1058j;
        if (p4 != null) {
            int i7 = P.f1043k;
            p4.L(false);
        }
        while (!Thread.interrupted()) {
            try {
                long M3 = p4 != null ? p4.M() : Long.MAX_VALUE;
                if (!(c0143c.C() instanceof U)) {
                    if (p4 != null) {
                        int i8 = P.f1043k;
                        p4.I(false);
                    }
                    Object r6 = r(c0143c.C());
                    C0156p c0156p = r6 instanceof C0156p ? (C0156p) r6 : null;
                    if (c0156p == null) {
                        return r6;
                    }
                    throw c0156p.f1093a;
                }
                LockSupport.parkNanos(c0143c, M3);
            } catch (Throwable th) {
                if (p4 != null) {
                    int i9 = P.f1043k;
                    p4.I(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        c0143c.n(interruptedException);
        throw interruptedException;
    }

    public static final Object p(s0 s0Var, InterfaceC0747p interfaceC0747p) {
        Object c0156p;
        Object J3;
        s0Var.G(false, true, new I(0, f(s0Var.f1620i.getContext()).g(s0Var.f1099j, s0Var, s0Var.f1053h)));
        try {
            kotlin.jvm.internal.v.b(2, interfaceC0747p);
            c0156p = interfaceC0747p.invoke(s0Var, s0Var);
        } catch (Throwable th) {
            c0156p = new C0156p(th, false);
        }
        EnumC0580a enumC0580a = EnumC0580a.f5697f;
        if (c0156p == enumC0580a || (J3 = s0Var.J(c0156p)) == f1118e) {
            return enumC0580a;
        }
        if (J3 instanceof C0156p) {
            Throwable th2 = ((C0156p) J3).f1093a;
            if (!(th2 instanceof r0)) {
                throw th2;
            }
            if (((r0) th2).f1095f != s0Var) {
                throw th2;
            }
            if (c0156p instanceof C0156p) {
                throw ((C0156p) c0156p).f1093a;
            }
        } else {
            c0156p = r(J3);
        }
        return c0156p;
    }

    public static final String q(InterfaceC0564d interfaceC0564d) {
        Object f7;
        if (interfaceC0564d instanceof M5.h) {
            return interfaceC0564d.toString();
        }
        try {
            f7 = interfaceC0564d + '@' + g(interfaceC0564d);
        } catch (Throwable th) {
            f7 = AbstractC0676f.f(th);
        }
        if (AbstractC0479i.a(f7) != null) {
            f7 = interfaceC0564d.getClass().getName() + '@' + g(interfaceC0564d);
        }
        return (String) f7;
    }

    public static final Object r(Object obj) {
        U u6;
        V v5 = obj instanceof V ? (V) obj : null;
        return (v5 == null || (u6 = v5.f1049a) == null) ? obj : u6;
    }

    public static final v0 s(InterfaceC0564d interfaceC0564d, InterfaceC0569i interfaceC0569i, Object obj) {
        v0 v0Var = null;
        if ((interfaceC0564d instanceof q5.d) && interfaceC0569i.m(w0.f1111f) != null) {
            q5.d dVar = (q5.d) interfaceC0564d;
            while (true) {
                if ((dVar instanceof D) || (dVar = dVar.getCallerFrame()) == null) {
                    break;
                }
                if (dVar instanceof v0) {
                    v0Var = (v0) dVar;
                    break;
                }
            }
            if (v0Var != null) {
                v0Var.X(interfaceC0569i, obj);
            }
        }
        return v0Var;
    }

    public static final Object t(InterfaceC0569i interfaceC0569i, InterfaceC0747p interfaceC0747p, InterfaceC0564d interfaceC0564d) {
        Object r6;
        InterfaceC0569i context = interfaceC0564d.getContext();
        InterfaceC0569i v5 = !((Boolean) interfaceC0569i.h(Boolean.FALSE, C0158s.f1097h)).booleanValue() ? context.v(interfaceC0569i) : e(context, interfaceC0569i, false);
        X x6 = (X) v5.m(C0162w.f1110g);
        if (x6 != null && !x6.a()) {
            throw ((g0) x6).w();
        }
        if (v5 == context) {
            M5.s sVar = new M5.s(v5, interfaceC0564d);
            r6 = A3.c.i0(sVar, sVar, interfaceC0747p);
        } else {
            C0565e c0565e = C0565e.f5619f;
            if (kotlin.jvm.internal.i.a(v5.m(c0565e), context.m(c0565e))) {
                v0 v0Var = new v0(v5, interfaceC0564d);
                InterfaceC0569i interfaceC0569i2 = v0Var.f1053h;
                Object m4 = M5.a.m(interfaceC0569i2, null);
                try {
                    Object i02 = A3.c.i0(v0Var, v0Var, interfaceC0747p);
                    M5.a.g(interfaceC0569i2, m4);
                    r6 = i02;
                } catch (Throwable th) {
                    M5.a.g(interfaceC0569i2, m4);
                    throw th;
                }
            } else {
                D d7 = new D(v5, interfaceC0564d);
                AbstractC0676f.v(interfaceC0747p, d7, d7);
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = D.f1025j;
                while (true) {
                    int i7 = atomicIntegerFieldUpdater.get(d7);
                    if (i7 != 0) {
                        if (i7 != 2) {
                            throw new IllegalStateException("Already suspended");
                        }
                        r6 = r(d7.C());
                        if (r6 instanceof C0156p) {
                            throw ((C0156p) r6).f1093a;
                        }
                    } else if (atomicIntegerFieldUpdater.compareAndSet(d7, 0, 1)) {
                        r6 = EnumC0580a.f5697f;
                        break;
                    }
                }
            }
        }
        EnumC0580a enumC0580a = EnumC0580a.f5697f;
        return r6;
    }

    public static final Object u(long j4, InterfaceC0747p interfaceC0747p, AbstractC0607c abstractC0607c) {
        if (j4 <= 0) {
            throw new r0("Timed out immediately", null);
        }
        Object p4 = p(new s0(j4, abstractC0607c), interfaceC0747p);
        EnumC0580a enumC0580a = EnumC0580a.f5697f;
        return p4;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005d A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object v(long j4, InterfaceC0747p interfaceC0747p, InterfaceC0564d interfaceC0564d) {
        t0 t0Var;
        int i7;
        kotlin.jvm.internal.s sVar;
        if (interfaceC0564d instanceof t0) {
            t0Var = (t0) interfaceC0564d;
            int i8 = t0Var.f1103h;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                t0Var.f1103h = i8 - Integer.MIN_VALUE;
                Object obj = t0Var.f1102g;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = t0Var.f1103h;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    if (j4 <= 0) {
                        return null;
                    }
                    kotlin.jvm.internal.s sVar2 = new kotlin.jvm.internal.s();
                    try {
                        t0Var.f1101f = sVar2;
                        t0Var.f1103h = 1;
                        s0 s0Var = new s0(j4, t0Var);
                        sVar2.f5233f = s0Var;
                        Object p4 = p(s0Var, interfaceC0747p);
                        return p4 == enumC0580a ? enumC0580a : p4;
                    } catch (r0 e4) {
                        e = e4;
                        sVar = sVar2;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sVar = t0Var.f1101f;
                    try {
                        AbstractC0676f.w(obj);
                        return obj;
                    } catch (r0 e7) {
                        e = e7;
                    }
                }
                if (e.f1095f != sVar.f5233f) {
                    return null;
                }
                throw e;
            }
        }
        t0Var = new t0(interfaceC0564d);
        Object obj2 = t0Var.f1102g;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = t0Var.f1103h;
        if (i7 != 0) {
        }
        if (e.f1095f != sVar.f5233f) {
        }
    }
}
