package D;

import M0.AbstractC0063v;
import M0.C0054l;
import M0.C0056n;
import M0.C0061t;
import M0.InterfaceC0053k;
import M0.InterfaceC0062u;
import java.util.List;
import u0.AbstractC0244d;
import u0.C0242b;
import u0.C0245e;
import u0.C0247g;

/* loaded from: classes.dex */
public final class S implements InterfaceC0008i {

    /* renamed from: e, reason: collision with root package name */
    public final X f126e;

    /* renamed from: f, reason: collision with root package name */
    public final E.a f127f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC0062u f128g;

    /* renamed from: j, reason: collision with root package name */
    public int f131j;

    /* renamed from: k, reason: collision with root package name */
    public M0.e0 f132k;

    /* renamed from: m, reason: collision with root package name */
    public final C0013n f134m;

    /* renamed from: n, reason: collision with root package name */
    public final C0245e f135n;

    /* renamed from: o, reason: collision with root package name */
    public final C0245e f136o;

    /* renamed from: p, reason: collision with root package name */
    public final C0013n f137p;

    /* renamed from: h, reason: collision with root package name */
    public final A.j f129h = new A.j(new C0020v(this, null));

    /* renamed from: i, reason: collision with root package name */
    public final U0.d f130i = U0.e.a();

    /* renamed from: l, reason: collision with root package name */
    public final A.j f133l = new A.j(3);

    public S(X x2, List list, E.a aVar, InterfaceC0062u interfaceC0062u) {
        this.f126e = x2;
        this.f127f = aVar;
        this.f128g = interfaceC0062u;
        C0013n c0013n = new C0013n();
        c0013n.f247d = this;
        c0013n.f244a = U0.e.a();
        C0054l c0054l = new C0054l(true);
        c0054l.F(null);
        c0013n.f245b = c0054l;
        c0013n.f246c = v0.d.F(list);
        this.f134m = c0013n;
        this.f135n = new C0245e(new C0014o(this, 1));
        this.f136o = new C0245e(new C0014o(this, 0));
        M m2 = new M(0, this);
        O o2 = new O(this, null);
        C0013n c0013n2 = new C0013n();
        c0013n2.f244a = interfaceC0062u;
        c0013n2.f245b = o2;
        c0013n2.f246c = O0.i.a(Integer.MAX_VALUE, 0, 6);
        c0013n2.f247d = new A.j(1);
        M0.P p2 = (M0.P) interfaceC0062u.m().f(C0061t.f687f);
        if (p2 != null) {
            ((M0.Z) p2).G(false, true, new U0.b(2, m2, c0013n2));
        }
        this.f137p = c0013n2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0053 A[Catch: all -> 0x005d, TryCatch #0 {all -> 0x005d, blocks: (B:12:0x004b, B:14:0x0053, B:16:0x0057, B:17:0x005a), top: B:11:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(S s2, y0.b bVar) {
        C0021w c0021w;
        int i2;
        U0.d dVar;
        int i3;
        s2.getClass();
        try {
            if (bVar instanceof C0021w) {
                c0021w = (C0021w) bVar;
                int i4 = c0021w.f276l;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    c0021w.f276l = i4 - Integer.MIN_VALUE;
                    Object obj = c0021w.f274j;
                    x0.a aVar = x0.a.f3094e;
                    i2 = c0021w.f276l;
                    if (i2 != 0) {
                        o.g.z(obj);
                        c0021w.f272h = s2;
                        dVar = s2.f130i;
                        c0021w.f273i = dVar;
                        c0021w.f276l = 1;
                        if (dVar.c(c0021w) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        U0.d dVar2 = c0021w.f273i;
                        S s3 = c0021w.f272h;
                        o.g.z(obj);
                        dVar = dVar2;
                        s2 = s3;
                    }
                    i3 = s2.f131j - 1;
                    s2.f131j = i3;
                    if (i3 == 0) {
                        M0.e0 e0Var = s2.f132k;
                        if (e0Var != null) {
                            e0Var.a(null);
                        }
                        s2.f132k = null;
                    }
                    dVar.e(null);
                    return C0247g.f3005a;
                }
            }
            i3 = s2.f131j - 1;
            s2.f131j = i3;
            if (i3 == 0) {
            }
            dVar.e(null);
            return C0247g.f3005a;
        } catch (Throwable th) {
            dVar.e(null);
            throw th;
        }
        c0021w = new C0021w(s2, bVar);
        Object obj2 = c0021w.f274j;
        x0.a aVar2 = x0.a.f3094e;
        i2 = c0021w.f276l;
        if (i2 != 0) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:0|1|(2:3|(12:5|6|(7:57|(1:(1:(1:61)(2:63|64))(3:65|66|67))(1:68)|62|17|(1:19)(1:23)|20|21)(4:8|9|10|(9:12|13|14|(1:24)|16|17|(0)(0)|20|21)(3:30|(1:32)(1:55)|(2:34|(2:36|(2:38|39))(2:47|48))(2:49|(2:51|52)(2:53|54))))|40|41|42|(1:44)|16|17|(0)(0)|20|21))|70|6|(0)(0)|40|41|42|(0)|16|17|(0)(0)|20|21|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c1, code lost:
    
        r9 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0027 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0055  */
    /* JADX WARN: Type inference failed for: r2v3, types: [E0.p, y0.f] */
    /* JADX WARN: Type inference failed for: r2v9, types: [E0.p, y0.f] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(S s2, e0 e0Var, y0.b bVar) {
        C0023y c0023y;
        x0.a aVar;
        int i2;
        InterfaceC0053k interfaceC0053k;
        C0054l c0054l;
        S s3;
        Object b2;
        InterfaceC0053k interfaceC0053k2;
        Throwable a2;
        m0 x2;
        s2.getClass();
        if (bVar instanceof C0023y) {
            c0023y = (C0023y) bVar;
            int i3 = c0023y.f284m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c0023y.f284m = i3 - Integer.MIN_VALUE;
                Object obj = c0023y.f282k;
                aVar = x0.a.f3094e;
                i2 = c0023y.f284m;
                boolean z2 = true;
                if (i2 == 0) {
                    try {
                        if (i2 == 1) {
                            interfaceC0053k = (InterfaceC0053k) c0023y.f279h;
                        } else if (i2 == 2) {
                            C0054l c0054l2 = c0023y.f281j;
                            S s4 = c0023y.f280i;
                            e0 e0Var2 = (e0) c0023y.f279h;
                            o.g.z(obj);
                            c0054l = c0054l2;
                            s3 = s4;
                            e0Var = e0Var2;
                        } else {
                            if (i2 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            interfaceC0053k = (InterfaceC0053k) c0023y.f279h;
                        }
                        o.g.z(obj);
                        interfaceC0053k2 = interfaceC0053k;
                    } catch (Throwable th) {
                        th = th;
                        obj = o.g.f(th);
                        interfaceC0053k2 = s2;
                        a2 = AbstractC0244d.a(obj);
                        C0054l c0054l3 = (C0054l) interfaceC0053k2;
                        if (a2 != null) {
                        }
                        return C0247g.f3005a;
                    }
                    a2 = AbstractC0244d.a(obj);
                    C0054l c0054l32 = (C0054l) interfaceC0053k2;
                    if (a2 != null) {
                        c0054l32.I(obj);
                    } else {
                        c0054l32.getClass();
                        c0054l32.I(new C0056n(a2, false));
                    }
                    return C0247g.f3005a;
                }
                o.g.z(obj);
                c0054l = e0Var.f182b;
                try {
                    x2 = s2.f133l.x();
                } catch (Throwable th2) {
                    th = th2;
                    s2 = c0054l;
                    obj = o.g.f(th);
                    interfaceC0053k2 = s2;
                    a2 = AbstractC0244d.a(obj);
                    C0054l c0054l322 = (C0054l) interfaceC0053k2;
                    if (a2 != null) {
                    }
                    return C0247g.f3005a;
                }
                if (x2 instanceof C0003d) {
                    ?? r2 = e0Var.f181a;
                    w0.i iVar = e0Var.f184d;
                    c0023y.f279h = c0054l;
                    c0023y.f284m = 1;
                    try {
                        b2 = s2.g().b(new I(s2, iVar, (E0.p) r2, (w0.d) null), c0023y);
                        if (b2 == aVar) {
                            return aVar;
                        }
                        C0054l c0054l4 = c0054l;
                        obj = b2;
                        interfaceC0053k2 = c0054l4;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        s2 = c0054l;
                        obj = o.g.f(th);
                        interfaceC0053k2 = s2;
                        a2 = AbstractC0244d.a(obj);
                        C0054l c0054l3222 = (C0054l) interfaceC0053k2;
                        if (a2 != null) {
                        }
                        return C0247g.f3005a;
                    }
                    a2 = AbstractC0244d.a(obj);
                    C0054l c0054l32222 = (C0054l) interfaceC0053k2;
                    if (a2 != null) {
                    }
                    return C0247g.f3005a;
                }
                if (!(x2 instanceof f0)) {
                    z2 = x2 instanceof n0;
                }
                if (!z2) {
                    if (x2 instanceof d0) {
                        throw ((d0) x2).f177b;
                    }
                    throw new M.c();
                }
                if (x2 != e0Var.f183c) {
                    F0.i.c(x2, "null cannot be cast to non-null type androidx.datastore.core.ReadException<T of androidx.datastore.core.DataStoreImpl.handleUpdate$lambda$2>");
                    throw ((f0) x2).f189b;
                }
                c0023y.f279h = e0Var;
                c0023y.f280i = s2;
                c0023y.f281j = c0054l;
                c0023y.f284m = 2;
                Object h2 = s2.h(c0023y);
                s3 = s2;
                if (h2 == aVar) {
                    return aVar;
                }
                ?? r22 = e0Var.f181a;
                w0.i iVar2 = e0Var.f184d;
                c0023y.f279h = c0054l;
                c0023y.f280i = null;
                c0023y.f281j = null;
                c0023y.f284m = 3;
                b2 = s3.g().b(new I(s3, iVar2, (E0.p) r22, (w0.d) null), c0023y);
                if (b2 == aVar) {
                    return aVar;
                }
                C0054l c0054l42 = c0054l;
                obj = b2;
                interfaceC0053k2 = c0054l42;
                a2 = AbstractC0244d.a(obj);
                C0054l c0054l322222 = (C0054l) interfaceC0053k2;
                if (a2 != null) {
                }
                return C0247g.f3005a;
            }
        }
        c0023y = new C0023y(s2, bVar);
        Object obj2 = c0023y.f282k;
        aVar = x0.a.f3094e;
        i2 = c0023y.f284m;
        boolean z22 = true;
        if (i2 == 0) {
        }
        ?? r222 = e0Var.f181a;
        w0.i iVar22 = e0Var.f184d;
        c0023y.f279h = c0054l;
        c0023y.f280i = null;
        c0023y.f281j = null;
        c0023y.f284m = 3;
        b2 = s3.g().b(new I(s3, iVar22, (E0.p) r222, (w0.d) null), c0023y);
        if (b2 == aVar) {
        }
        C0054l c0054l422 = c0054l;
        obj2 = b2;
        interfaceC0053k2 = c0054l422;
        a2 = AbstractC0244d.a(obj2);
        C0054l c0054l3222222 = (C0054l) interfaceC0053k2;
        if (a2 != null) {
        }
        return C0247g.f3005a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0052 A[Catch: all -> 0x0060, TRY_LEAVE, TryCatch #0 {all -> 0x0060, blocks: (B:12:0x004b, B:14:0x0052), top: B:11:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(S s2, y0.b bVar) {
        C0024z c0024z;
        int i2;
        U0.d dVar;
        int i3;
        s2.getClass();
        try {
            if (bVar instanceof C0024z) {
                c0024z = (C0024z) bVar;
                int i4 = c0024z.f289l;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    c0024z.f289l = i4 - Integer.MIN_VALUE;
                    Object obj = c0024z.f287j;
                    x0.a aVar = x0.a.f3094e;
                    i2 = c0024z.f289l;
                    if (i2 != 0) {
                        o.g.z(obj);
                        c0024z.f285h = s2;
                        dVar = s2.f130i;
                        c0024z.f286i = dVar;
                        c0024z.f289l = 1;
                        if (dVar.c(c0024z) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        U0.d dVar2 = c0024z.f286i;
                        S s3 = c0024z.f285h;
                        o.g.z(obj);
                        dVar = dVar2;
                        s2 = s3;
                    }
                    i3 = s2.f131j + 1;
                    s2.f131j = i3;
                    if (i3 == 1) {
                        s2.f132k = AbstractC0063v.g(s2.f128g, new B(s2, null));
                    }
                    dVar.e(null);
                    return C0247g.f3005a;
                }
            }
            i3 = s2.f131j + 1;
            s2.f131j = i3;
            if (i3 == 1) {
            }
            dVar.e(null);
            return C0247g.f3005a;
        } catch (Throwable th) {
            dVar.e(null);
            throw th;
        }
        c0024z = new C0024z(s2, bVar);
        Object obj2 = c0024z.f287j;
        x0.a aVar2 = x0.a.f3094e;
        i2 = c0024z.f289l;
        if (i2 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(S s2, boolean z2, w0.d dVar) {
        D d2;
        int i2;
        S s3;
        m0 m0Var;
        boolean z3;
        S s4;
        C0242b c0242b;
        s2.getClass();
        if (dVar instanceof D) {
            d2 = (D) dVar;
            int i3 = d2.f71m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                d2.f71m = i3 - Integer.MIN_VALUE;
                Object obj = d2.f69k;
                x0.a aVar = x0.a.f3094e;
                i2 = d2.f71m;
                if (i2 != 0) {
                    o.g.z(obj);
                    m0 x2 = s2.f133l.x();
                    if (x2 instanceof n0) {
                        throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                    }
                    l0 g2 = s2.g();
                    d2.f66h = s2;
                    d2.f67i = x2;
                    d2.f68j = z2;
                    d2.f71m = 1;
                    Integer a2 = g2.a();
                    if (a2 == aVar) {
                        return aVar;
                    }
                    s3 = s2;
                    m0Var = x2;
                    obj = a2;
                } else if (i2 == 1) {
                    z2 = d2.f68j;
                    m0Var = d2.f67i;
                    s3 = d2.f66h;
                    o.g.z(obj);
                } else {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s4 = d2.f66h;
                        o.g.z(obj);
                        c0242b = (C0242b) obj;
                        m0 m0Var2 = (m0) c0242b.f2998e;
                        if (((Boolean) c0242b.f2999f).booleanValue()) {
                            return m0Var2;
                        }
                        s4.f133l.G(m0Var2);
                        return m0Var2;
                    }
                    s4 = d2.f66h;
                    o.g.z(obj);
                    c0242b = (C0242b) obj;
                    m0 m0Var22 = (m0) c0242b.f2998e;
                    if (((Boolean) c0242b.f2999f).booleanValue()) {
                    }
                }
                int intValue = ((Number) obj).intValue();
                z3 = m0Var instanceof C0003d;
                int i4 = !z3 ? m0Var.f243a : -1;
                if (!z3 && intValue == i4) {
                    return m0Var;
                }
                if (z2) {
                    l0 g3 = s3.g();
                    F f2 = new F(s3, i4, null);
                    d2.f66h = s3;
                    d2.f67i = null;
                    d2.f71m = 3;
                    obj = g3.c(f2, d2);
                    if (obj == aVar) {
                        return aVar;
                    }
                    s4 = s3;
                    c0242b = (C0242b) obj;
                    m0 m0Var222 = (m0) c0242b.f2998e;
                    if (((Boolean) c0242b.f2999f).booleanValue()) {
                    }
                } else {
                    l0 g4 = s3.g();
                    E e2 = new E(s3, null);
                    d2.f66h = s3;
                    d2.f67i = null;
                    d2.f71m = 2;
                    obj = g4.b(e2, d2);
                    if (obj == aVar) {
                        return aVar;
                    }
                    s4 = s3;
                    c0242b = (C0242b) obj;
                    m0 m0Var2222 = (m0) c0242b.f2998e;
                    if (((Boolean) c0242b.f2999f).booleanValue()) {
                    }
                }
            }
        }
        d2 = new D(s2, dVar);
        Object obj2 = d2.f69k;
        x0.a aVar2 = x0.a.f3094e;
        i2 = d2.f71m;
        if (i2 != 0) {
        }
        int intValue2 = ((Number) obj2).intValue();
        z3 = m0Var instanceof C0003d;
        if (!z3) {
        }
        if (!z3) {
        }
        if (z2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ea A[Catch: c -> 0x00ab, TryCatch #1 {c -> 0x00ab, blocks: (B:36:0x00a6, B:37:0x0144, B:41:0x00b4, B:42:0x0127, B:58:0x00d1, B:60:0x00ea, B:61:0x00ee, B:67:0x00da, B:71:0x0115), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(S s2, boolean z2, y0.b bVar) {
        G g2;
        Integer a2;
        Object obj;
        S s3;
        int i2;
        C0002c c0002c;
        Object b2;
        F0.o oVar;
        F0.p pVar;
        s2.getClass();
        try {
            if (bVar instanceof G) {
                g2 = (G) bVar;
                int i3 = g2.f88p;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    g2.f88p = i3 - Integer.MIN_VALUE;
                    Object obj2 = g2.f86n;
                    x0.a aVar = x0.a.f3094e;
                    switch (g2.f88p) {
                        case 0:
                            o.g.z(obj2);
                            if (!z2) {
                                l0 g3 = s2.g();
                                g2.f80h = s2;
                                g2.f84l = z2;
                                g2.f88p = 3;
                                obj2 = g3.a();
                                if (obj2 == aVar) {
                                    return aVar;
                                }
                                int intValue = ((Number) obj2).intValue();
                                l0 g4 = s2.g();
                                H h2 = new H(s2, intValue, null);
                                g2.f80h = s2;
                                g2.f84l = z2;
                                g2.f88p = 4;
                                obj2 = g4.c(h2, g2);
                                if (obj2 == aVar) {
                                    return aVar;
                                }
                                return (C0003d) obj2;
                            }
                            g2.f80h = s2;
                            g2.f84l = z2;
                            g2.f88p = 1;
                            obj2 = s2.i(g2);
                            if (obj2 == aVar) {
                                return aVar;
                            }
                            int hashCode = obj2 != null ? obj2.hashCode() : 0;
                            l0 g5 = s2.g();
                            g2.f80h = s2;
                            g2.f81i = obj2;
                            g2.f84l = z2;
                            g2.f85m = hashCode;
                            g2.f88p = 2;
                            a2 = g5.a();
                            if (a2 != aVar) {
                                return aVar;
                            }
                            obj = obj2;
                            obj2 = a2;
                            s3 = s2;
                            i2 = hashCode;
                            return new C0003d(obj, i2, ((Number) obj2).intValue());
                        case 1:
                            z2 = g2.f84l;
                            s2 = (S) g2.f80h;
                            o.g.z(obj2);
                            if (obj2 != null) {
                            }
                            l0 g52 = s2.g();
                            g2.f80h = s2;
                            g2.f81i = obj2;
                            g2.f84l = z2;
                            g2.f85m = hashCode;
                            g2.f88p = 2;
                            a2 = g52.a();
                            if (a2 != aVar) {
                            }
                            break;
                        case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                            i2 = g2.f85m;
                            z2 = g2.f84l;
                            obj = g2.f81i;
                            s3 = (S) g2.f80h;
                            try {
                                o.g.z(obj2);
                                return new C0003d(obj, i2, ((Number) obj2).intValue());
                            } catch (C0002c e2) {
                                e = e2;
                                s2 = s3;
                                F0.p pVar2 = new F0.p();
                                E.a aVar2 = s2.f127f;
                                g2.f80h = s2;
                                g2.f81i = e;
                                g2.f82j = pVar2;
                                g2.f83k = pVar2;
                                g2.f84l = z2;
                                g2.f88p = 5;
                                throw e;
                            }
                        case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                            z2 = g2.f84l;
                            s2 = (S) g2.f80h;
                            o.g.z(obj2);
                            int intValue2 = ((Number) obj2).intValue();
                            l0 g42 = s2.g();
                            H h22 = new H(s2, intValue2, null);
                            g2.f80h = s2;
                            g2.f84l = z2;
                            g2.f88p = 4;
                            obj2 = g42.c(h22, g2);
                            if (obj2 == aVar) {
                            }
                            return (C0003d) obj2;
                        case F.k.LONG_FIELD_NUMBER /* 4 */:
                            boolean z3 = g2.f84l;
                            o.g.z(obj2);
                            return (C0003d) obj2;
                        case F.k.STRING_FIELD_NUMBER /* 5 */:
                            boolean z4 = g2.f84l;
                            F0.p pVar3 = g2.f83k;
                            F0.p pVar4 = (F0.p) g2.f82j;
                            C0002c c0002c2 = (C0002c) g2.f81i;
                            S s4 = (S) g2.f80h;
                            o.g.z(obj2);
                            pVar3.f324e = obj2;
                            F0.o oVar2 = new F0.o();
                            try {
                                I i4 = new I(pVar4, s4, oVar2, (w0.d) null);
                                g2.f80h = c0002c2;
                                g2.f81i = pVar4;
                                g2.f82j = oVar2;
                                g2.f83k = null;
                                g2.f88p = 6;
                                if (z4) {
                                    s4.getClass();
                                    b2 = i4.i(g2);
                                } else {
                                    b2 = s4.g().b(new C0022x(i4, null), g2);
                                }
                                if (b2 == aVar) {
                                    return aVar;
                                }
                                oVar = oVar2;
                                pVar = pVar4;
                                Object obj3 = pVar.f324e;
                                return new C0003d(obj3, obj3 != null ? obj3.hashCode() : 0, oVar.f323e);
                            } catch (Throwable th) {
                                th = th;
                                c0002c = c0002c2;
                                o.g.a(c0002c, th);
                                throw c0002c;
                            }
                        case F.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            oVar = (F0.o) g2.f82j;
                            pVar = (F0.p) g2.f81i;
                            c0002c = (C0002c) g2.f80h;
                            try {
                                o.g.z(obj2);
                                Object obj32 = pVar.f324e;
                                return new C0003d(obj32, obj32 != null ? obj32.hashCode() : 0, oVar.f323e);
                            } catch (Throwable th2) {
                                th = th2;
                                o.g.a(c0002c, th);
                                throw c0002c;
                            }
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }
            switch (g2.f88p) {
            }
        } catch (C0002c e3) {
            e = e3;
        }
        g2 = new G(s2, bVar);
        Object obj22 = g2.f86n;
        x0.a aVar3 = x0.a.f3094e;
    }

    @Override // D.InterfaceC0008i
    public final Object e(E0.p pVar, y0.f fVar) {
        w0.i iVar = fVar.f3098f;
        F0.i.b(iVar);
        q0 q0Var = (q0) iVar.f(p0.f254e);
        if (q0Var != null) {
            q0Var.c(this);
        }
        return AbstractC0063v.n(new q0(q0Var, this), new L(this, pVar, null), fVar);
    }

    public final l0 g() {
        return (l0) this.f136o.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(y0.b bVar) {
        C c2;
        Object obj;
        int i2;
        S s2;
        int intValue;
        int i3;
        Throwable th;
        S s3;
        C0013n c0013n;
        try {
            if (bVar instanceof C) {
                c2 = (C) bVar;
                int i4 = c2.f65l;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    c2.f65l = i4 - Integer.MIN_VALUE;
                    Object obj2 = c2.f63j;
                    obj = x0.a.f3094e;
                    i2 = c2.f65l;
                    if (i2 != 0) {
                        o.g.z(obj2);
                        l0 g2 = g();
                        c2.f61h = this;
                        c2.f65l = 1;
                        obj2 = g2.a();
                        if (obj2 == obj) {
                            return obj;
                        }
                        s2 = this;
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            i3 = c2.f62i;
                            s3 = c2.f61h;
                            try {
                                o.g.z(obj2);
                                return C0247g.f3005a;
                            } catch (Throwable th2) {
                                th = th2;
                                s3.f133l.G(new f0(th, i3));
                                throw th;
                            }
                        }
                        s2 = c2.f61h;
                        o.g.z(obj2);
                    }
                    intValue = ((Number) obj2).intValue();
                    c0013n = s2.f134m;
                    c2.f61h = s2;
                    c2.f62i = intValue;
                    c2.f65l = 2;
                    if (c0013n.h(c2) == obj) {
                        return obj;
                    }
                    return C0247g.f3005a;
                }
            }
            c0013n = s2.f134m;
            c2.f61h = s2;
            c2.f62i = intValue;
            c2.f65l = 2;
            if (c0013n.h(c2) == obj) {
            }
            return C0247g.f3005a;
        } catch (Throwable th3) {
            i3 = intValue;
            th = th3;
            s3 = s2;
            s3.f133l.G(new f0(th, i3));
            throw th;
        }
        c2 = new C(this, bVar);
        Object obj22 = c2.f63j;
        obj = x0.a.f3094e;
        i2 = c2.f65l;
        if (i2 != 0) {
        }
        intValue = ((Number) obj22).intValue();
    }

    public final Object i(y0.b bVar) {
        return ((a0) this.f135n.a()).a(new C0017s(3, (w0.d) null), bVar);
    }

    @Override // D.InterfaceC0008i
    public final P0.d j() {
        return this.f129h;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj, boolean z2, y0.b bVar) {
        P p2;
        int i2;
        F0.o oVar;
        if (bVar instanceof P) {
            p2 = (P) bVar;
            int i3 = p2.f118k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                p2.f118k = i3 - Integer.MIN_VALUE;
                Object obj2 = p2.f116i;
                x0.a aVar = x0.a.f3094e;
                i2 = p2.f118k;
                if (i2 != 0) {
                    o.g.z(obj2);
                    F0.o oVar2 = new F0.o();
                    a0 a0Var = (a0) this.f135n.a();
                    Q q2 = new Q(oVar2, this, obj, z2, null);
                    p2.f115h = oVar2;
                    p2.f118k = 1;
                    if (a0Var.b(q2, p2) == aVar) {
                        return aVar;
                    }
                    oVar = oVar2;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oVar = p2.f115h;
                    o.g.z(obj2);
                }
                return new Integer(oVar.f323e);
            }
        }
        p2 = new P(this, bVar);
        Object obj22 = p2.f116i;
        x0.a aVar2 = x0.a.f3094e;
        i2 = p2.f118k;
        if (i2 != 0) {
        }
        return new Integer(oVar.f323e);
    }
}
