package M;

import D4.AbstractC0024y;
import D4.C0013m;
import D4.C0016p;
import D4.InterfaceC0012l;
import D4.InterfaceC0022w;
import a.AbstractC0169a;
import f4.AbstractC0432i;
import f4.C0430g;
import f4.C0434k;
import g4.AbstractC0465j;
import h2.C0482c;
import java.util.List;
import k4.InterfaceC1218d;
import k4.InterfaceC1223i;
import l4.EnumC1260a;
import m4.AbstractC1295c;
import t4.InterfaceC1445p;

/* loaded from: classes.dex */
public final class P implements InterfaceC0080i {

    /* renamed from: a, reason: collision with root package name */
    public final V f1613a;

    /* renamed from: b, reason: collision with root package name */
    public final l1.j f1614b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0022w f1615c;

    /* renamed from: f, reason: collision with root package name */
    public int f1618f;

    /* renamed from: g, reason: collision with root package name */
    public D4.m0 f1619g;

    /* renamed from: i, reason: collision with root package name */
    public final f2.t f1621i;

    /* renamed from: j, reason: collision with root package name */
    public final C0434k f1622j;

    /* renamed from: k, reason: collision with root package name */
    public final C0434k f1623k;

    /* renamed from: l, reason: collision with root package name */
    public final B0.i f1624l;

    /* renamed from: d, reason: collision with root package name */
    public final C0482c f1616d = new C0482c(new C0091u(this, null));

    /* renamed from: e, reason: collision with root package name */
    public final L4.d f1617e = L4.e.a();

    /* renamed from: h, reason: collision with root package name */
    public final C0482c f1620h = new C0482c(23);

    public P(V v4, List list, l1.j jVar, InterfaceC0022w interfaceC0022w) {
        this.f1613a = v4;
        this.f1614b = jVar;
        this.f1615c = interfaceC0022w;
        f2.t tVar = new f2.t();
        tVar.f5639d = this;
        tVar.f5636a = L4.e.a();
        tVar.f5637b = AbstractC0024y.a();
        tVar.f5638c = AbstractC0465j.S0(list);
        this.f1621i = tVar;
        this.f1622j = AbstractC0169a.A(new C0085n(this, 1));
        this.f1623k = AbstractC0169a.A(new C0085n(this, 0));
        this.f1624l = new B0.i(interfaceC0022w, new F4.o(3, this), new M(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0053 A[Catch: all -> 0x005d, TryCatch #0 {all -> 0x005d, blocks: (B:12:0x004b, B:14:0x0053, B:16:0x0057, B:17:0x005a), top: B:11:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(P p5, AbstractC1295c abstractC1295c) {
        C0092v c0092v;
        int i2;
        L4.d dVar;
        int i3;
        p5.getClass();
        try {
            if (abstractC1295c instanceof C0092v) {
                c0092v = (C0092v) abstractC1295c;
                int i6 = c0092v.f1760e;
                if ((i6 & Integer.MIN_VALUE) != 0) {
                    c0092v.f1760e = i6 - Integer.MIN_VALUE;
                    Object obj = c0092v.f1758c;
                    EnumC1260a enumC1260a = EnumC1260a.f11058a;
                    i2 = c0092v.f1760e;
                    if (i2 != 0) {
                        e5.g.y(obj);
                        c0092v.f1756a = p5;
                        dVar = p5.f1617e;
                        c0092v.f1757b = dVar;
                        c0092v.f1760e = 1;
                        if (dVar.c(c0092v) == enumC1260a) {
                            return enumC1260a;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        L4.d dVar2 = c0092v.f1757b;
                        P p6 = c0092v.f1756a;
                        e5.g.y(obj);
                        dVar = dVar2;
                        p5 = p6;
                    }
                    i3 = p5.f1618f - 1;
                    p5.f1618f = i3;
                    if (i3 == 0) {
                        D4.m0 m0Var = p5.f1619g;
                        if (m0Var != null) {
                            m0Var.b(null);
                        }
                        p5.f1619g = null;
                    }
                    dVar.e(null);
                    return f4.v.f5689a;
                }
            }
            i3 = p5.f1618f - 1;
            p5.f1618f = i3;
            if (i3 == 0) {
            }
            dVar.e(null);
            return f4.v.f5689a;
        } catch (Throwable th) {
            dVar.e(null);
            throw th;
        }
        c0092v = new C0092v(p5, abstractC1295c);
        Object obj2 = c0092v.f1758c;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = c0092v.f1760e;
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
    /* JADX WARN: Type inference failed for: r2v3, types: [m4.h, t4.p] */
    /* JADX WARN: Type inference failed for: r2v9, types: [m4.h, t4.p] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(P p5, c0 c0Var, AbstractC1295c abstractC1295c) {
        C0094x c0094x;
        EnumC1260a enumC1260a;
        int i2;
        InterfaceC0012l interfaceC0012l;
        C0013m c0013m;
        P p6;
        Object b6;
        InterfaceC0012l interfaceC0012l2;
        Throwable a6;
        k0 f3;
        p5.getClass();
        if (abstractC1295c instanceof C0094x) {
            c0094x = (C0094x) abstractC1295c;
            int i3 = c0094x.f1768f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c0094x.f1768f = i3 - Integer.MIN_VALUE;
                Object obj = c0094x.f1766d;
                enumC1260a = EnumC1260a.f11058a;
                i2 = c0094x.f1768f;
                boolean z = true;
                if (i2 == 0) {
                    try {
                        if (i2 == 1) {
                            interfaceC0012l = (InterfaceC0012l) c0094x.f1763a;
                        } else if (i2 == 2) {
                            C0013m c0013m2 = c0094x.f1765c;
                            P p7 = c0094x.f1764b;
                            c0 c0Var2 = (c0) c0094x.f1763a;
                            e5.g.y(obj);
                            c0013m = c0013m2;
                            p6 = p7;
                            c0Var = c0Var2;
                        } else {
                            if (i2 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            interfaceC0012l = (InterfaceC0012l) c0094x.f1763a;
                        }
                        e5.g.y(obj);
                        interfaceC0012l2 = interfaceC0012l;
                    } catch (Throwable th) {
                        th = th;
                        obj = e5.g.l(th);
                        interfaceC0012l2 = p5;
                        a6 = AbstractC0432i.a(obj);
                        C0013m c0013m3 = (C0013m) interfaceC0012l2;
                        if (a6 != null) {
                        }
                        return f4.v.f5689a;
                    }
                    a6 = AbstractC0432i.a(obj);
                    C0013m c0013m32 = (C0013m) interfaceC0012l2;
                    if (a6 != null) {
                        c0013m32.L(obj);
                    } else {
                        c0013m32.getClass();
                        c0013m32.L(new C0016p(a6, false));
                    }
                    return f4.v.f5689a;
                }
                e5.g.y(obj);
                c0013m = c0Var.f1664b;
                try {
                    f3 = p5.f1620h.f();
                } catch (Throwable th2) {
                    th = th2;
                    p5 = c0013m;
                    obj = e5.g.l(th);
                    interfaceC0012l2 = p5;
                    a6 = AbstractC0432i.a(obj);
                    C0013m c0013m322 = (C0013m) interfaceC0012l2;
                    if (a6 != null) {
                    }
                    return f4.v.f5689a;
                }
                if (f3 instanceof C0075d) {
                    ?? r22 = c0Var.f1663a;
                    InterfaceC1223i interfaceC1223i = c0Var.f1666d;
                    c0094x.f1763a = c0013m;
                    c0094x.f1768f = 1;
                    try {
                        b6 = p5.g().b(new J(p5, interfaceC1223i, r22, null), c0094x);
                        if (b6 == enumC1260a) {
                            return enumC1260a;
                        }
                        C0013m c0013m4 = c0013m;
                        obj = b6;
                        interfaceC0012l2 = c0013m4;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        p5 = c0013m;
                        obj = e5.g.l(th);
                        interfaceC0012l2 = p5;
                        a6 = AbstractC0432i.a(obj);
                        C0013m c0013m3222 = (C0013m) interfaceC0012l2;
                        if (a6 != null) {
                        }
                        return f4.v.f5689a;
                    }
                    a6 = AbstractC0432i.a(obj);
                    C0013m c0013m32222 = (C0013m) interfaceC0012l2;
                    if (a6 != null) {
                    }
                    return f4.v.f5689a;
                }
                if (!(f3 instanceof d0)) {
                    z = f3 instanceof l0;
                }
                if (!z) {
                    if (f3 instanceof b0) {
                        throw ((b0) f3).f1662b;
                    }
                    throw new C1.b();
                }
                if (f3 != c0Var.f1665c) {
                    kotlin.jvm.internal.i.c(f3, "null cannot be cast to non-null type androidx.datastore.core.ReadException<T of androidx.datastore.core.DataStoreImpl.handleUpdate$lambda$2>");
                    throw ((d0) f3).f1669b;
                }
                c0094x.f1763a = c0Var;
                c0094x.f1764b = p5;
                c0094x.f1765c = c0013m;
                c0094x.f1768f = 2;
                Object h3 = p5.h(c0094x);
                p6 = p5;
                if (h3 == enumC1260a) {
                    return enumC1260a;
                }
                ?? r23 = c0Var.f1663a;
                InterfaceC1223i interfaceC1223i2 = c0Var.f1666d;
                c0094x.f1763a = c0013m;
                c0094x.f1764b = null;
                c0094x.f1765c = null;
                c0094x.f1768f = 3;
                b6 = p6.g().b(new J(p6, interfaceC1223i2, r23, null), c0094x);
                if (b6 == enumC1260a) {
                    return enumC1260a;
                }
                C0013m c0013m42 = c0013m;
                obj = b6;
                interfaceC0012l2 = c0013m42;
                a6 = AbstractC0432i.a(obj);
                C0013m c0013m322222 = (C0013m) interfaceC0012l2;
                if (a6 != null) {
                }
                return f4.v.f5689a;
            }
        }
        c0094x = new C0094x(p5, abstractC1295c);
        Object obj2 = c0094x.f1766d;
        enumC1260a = EnumC1260a.f11058a;
        i2 = c0094x.f1768f;
        boolean z5 = true;
        if (i2 == 0) {
        }
        ?? r232 = c0Var.f1663a;
        InterfaceC1223i interfaceC1223i22 = c0Var.f1666d;
        c0094x.f1763a = c0013m;
        c0094x.f1764b = null;
        c0094x.f1765c = null;
        c0094x.f1768f = 3;
        b6 = p6.g().b(new J(p6, interfaceC1223i22, r232, null), c0094x);
        if (b6 == enumC1260a) {
        }
        C0013m c0013m422 = c0013m;
        obj2 = b6;
        interfaceC0012l2 = c0013m422;
        a6 = AbstractC0432i.a(obj2);
        C0013m c0013m3222222 = (C0013m) interfaceC0012l2;
        if (a6 != null) {
        }
        return f4.v.f5689a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0052 A[Catch: all -> 0x0062, TRY_LEAVE, TryCatch #0 {all -> 0x0062, blocks: (B:12:0x004b, B:14:0x0052), top: B:11:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(P p5, AbstractC1295c abstractC1295c) {
        C0095y c0095y;
        int i2;
        L4.d dVar;
        int i3;
        p5.getClass();
        try {
            if (abstractC1295c instanceof C0095y) {
                c0095y = (C0095y) abstractC1295c;
                int i6 = c0095y.f1773e;
                if ((i6 & Integer.MIN_VALUE) != 0) {
                    c0095y.f1773e = i6 - Integer.MIN_VALUE;
                    Object obj = c0095y.f1771c;
                    EnumC1260a enumC1260a = EnumC1260a.f11058a;
                    i2 = c0095y.f1773e;
                    if (i2 != 0) {
                        e5.g.y(obj);
                        c0095y.f1769a = p5;
                        dVar = p5.f1617e;
                        c0095y.f1770b = dVar;
                        c0095y.f1773e = 1;
                        if (dVar.c(c0095y) == enumC1260a) {
                            return enumC1260a;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        L4.d dVar2 = c0095y.f1770b;
                        P p6 = c0095y.f1769a;
                        e5.g.y(obj);
                        dVar = dVar2;
                        p5 = p6;
                    }
                    i3 = p5.f1618f + 1;
                    p5.f1618f = i3;
                    if (i3 == 1) {
                        p5.f1619g = AbstractC0024y.n(p5.f1615c, null, 0, new C0096z(p5, null), 3);
                    }
                    dVar.e(null);
                    return f4.v.f5689a;
                }
            }
            i3 = p5.f1618f + 1;
            p5.f1618f = i3;
            if (i3 == 1) {
            }
            dVar.e(null);
            return f4.v.f5689a;
        } catch (Throwable th) {
            dVar.e(null);
            throw th;
        }
        c0095y = new C0095y(p5, abstractC1295c);
        Object obj2 = c0095y.f1771c;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = c0095y.f1773e;
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
    public static final Object e(P p5, boolean z, InterfaceC1218d interfaceC1218d) {
        B b6;
        int i2;
        P p6;
        k0 k0Var;
        boolean z5;
        P p7;
        C0430g c0430g;
        p5.getClass();
        if (interfaceC1218d instanceof B) {
            b6 = (B) interfaceC1218d;
            int i3 = b6.f1556f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                b6.f1556f = i3 - Integer.MIN_VALUE;
                Object obj = b6.f1554d;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = b6.f1556f;
                if (i2 != 0) {
                    e5.g.y(obj);
                    k0 f3 = p5.f1620h.f();
                    if (f3 instanceof l0) {
                        throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                    }
                    j0 g6 = p5.g();
                    b6.f1551a = p5;
                    b6.f1552b = f3;
                    b6.f1553c = z;
                    b6.f1556f = 1;
                    Integer a6 = g6.a();
                    if (a6 == enumC1260a) {
                        return enumC1260a;
                    }
                    p6 = p5;
                    k0Var = f3;
                    obj = a6;
                } else if (i2 == 1) {
                    z = b6.f1553c;
                    k0Var = b6.f1552b;
                    p6 = b6.f1551a;
                    e5.g.y(obj);
                } else {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p7 = b6.f1551a;
                        e5.g.y(obj);
                        c0430g = (C0430g) obj;
                        k0 k0Var2 = (k0) c0430g.f5668a;
                        if (((Boolean) c0430g.f5669b).booleanValue()) {
                            return k0Var2;
                        }
                        p7.f1620h.h(k0Var2);
                        return k0Var2;
                    }
                    p7 = b6.f1551a;
                    e5.g.y(obj);
                    c0430g = (C0430g) obj;
                    k0 k0Var22 = (k0) c0430g.f5668a;
                    if (((Boolean) c0430g.f5669b).booleanValue()) {
                    }
                }
                int intValue = ((Number) obj).intValue();
                z5 = k0Var instanceof C0075d;
                int i6 = !z5 ? k0Var.f1717a : -1;
                if (!z5 && intValue == i6) {
                    return k0Var;
                }
                if (z) {
                    j0 g7 = p6.g();
                    D d6 = new D(p6, i6, null);
                    b6.f1551a = p6;
                    b6.f1552b = null;
                    b6.f1556f = 3;
                    obj = g7.c(d6, b6);
                    if (obj == enumC1260a) {
                        return enumC1260a;
                    }
                    p7 = p6;
                    c0430g = (C0430g) obj;
                    k0 k0Var222 = (k0) c0430g.f5668a;
                    if (((Boolean) c0430g.f5669b).booleanValue()) {
                    }
                } else {
                    j0 g8 = p6.g();
                    C c2 = new C(p6, null);
                    b6.f1551a = p6;
                    b6.f1552b = null;
                    b6.f1556f = 2;
                    obj = g8.b(c2, b6);
                    if (obj == enumC1260a) {
                        return enumC1260a;
                    }
                    p7 = p6;
                    c0430g = (C0430g) obj;
                    k0 k0Var2222 = (k0) c0430g.f5668a;
                    if (((Boolean) c0430g.f5669b).booleanValue()) {
                    }
                }
            }
        }
        b6 = new B(p5, interfaceC1218d);
        Object obj2 = b6.f1554d;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = b6.f1556f;
        if (i2 != 0) {
        }
        int intValue2 = ((Number) obj2).intValue();
        z5 = k0Var instanceof C0075d;
        if (!z5) {
        }
        if (!z5) {
        }
        if (z) {
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
    public static final Object f(P p5, boolean z, AbstractC1295c abstractC1295c) {
        E e3;
        Integer a6;
        Object obj;
        P p6;
        int i2;
        C0074c c0074c;
        Object b6;
        kotlin.jvm.internal.r rVar;
        kotlin.jvm.internal.s sVar;
        p5.getClass();
        try {
            if (abstractC1295c instanceof E) {
                e3 = (E) abstractC1295c;
                int i3 = e3.f1573i;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    e3.f1573i = i3 - Integer.MIN_VALUE;
                    Object obj2 = e3.f1571g;
                    EnumC1260a enumC1260a = EnumC1260a.f11058a;
                    switch (e3.f1573i) {
                        case 0:
                            e5.g.y(obj2);
                            if (!z) {
                                j0 g6 = p5.g();
                                e3.f1565a = p5;
                                e3.f1569e = z;
                                e3.f1573i = 3;
                                obj2 = g6.a();
                                if (obj2 == enumC1260a) {
                                    return enumC1260a;
                                }
                                int intValue = ((Number) obj2).intValue();
                                j0 g7 = p5.g();
                                F f3 = new F(p5, intValue, null);
                                e3.f1565a = p5;
                                e3.f1569e = z;
                                e3.f1573i = 4;
                                obj2 = g7.c(f3, e3);
                                if (obj2 == enumC1260a) {
                                    return enumC1260a;
                                }
                                return (C0075d) obj2;
                            }
                            e3.f1565a = p5;
                            e3.f1569e = z;
                            e3.f1573i = 1;
                            obj2 = p5.i(e3);
                            if (obj2 == enumC1260a) {
                                return enumC1260a;
                            }
                            int hashCode = obj2 != null ? obj2.hashCode() : 0;
                            j0 g8 = p5.g();
                            e3.f1565a = p5;
                            e3.f1566b = obj2;
                            e3.f1569e = z;
                            e3.f1570f = hashCode;
                            e3.f1573i = 2;
                            a6 = g8.a();
                            if (a6 != enumC1260a) {
                                return enumC1260a;
                            }
                            obj = obj2;
                            obj2 = a6;
                            p6 = p5;
                            i2 = hashCode;
                            return new C0075d(i2, ((Number) obj2).intValue(), obj);
                        case 1:
                            z = e3.f1569e;
                            p5 = (P) e3.f1565a;
                            e5.g.y(obj2);
                            if (obj2 != null) {
                            }
                            j0 g82 = p5.g();
                            e3.f1565a = p5;
                            e3.f1566b = obj2;
                            e3.f1569e = z;
                            e3.f1570f = hashCode;
                            e3.f1573i = 2;
                            a6 = g82.a();
                            if (a6 != enumC1260a) {
                            }
                            break;
                        case 2:
                            i2 = e3.f1570f;
                            z = e3.f1569e;
                            obj = e3.f1566b;
                            p6 = (P) e3.f1565a;
                            try {
                                e5.g.y(obj2);
                                return new C0075d(i2, ((Number) obj2).intValue(), obj);
                            } catch (C0074c e6) {
                                e = e6;
                                p5 = p6;
                                kotlin.jvm.internal.s sVar2 = new kotlin.jvm.internal.s();
                                l1.j jVar = p5.f1614b;
                                e3.f1565a = p5;
                                e3.f1566b = e;
                                e3.f1567c = sVar2;
                                e3.f1568d = sVar2;
                                e3.f1569e = z;
                                e3.f1573i = 5;
                                throw e;
                            }
                        case 3:
                            z = e3.f1569e;
                            p5 = (P) e3.f1565a;
                            e5.g.y(obj2);
                            int intValue2 = ((Number) obj2).intValue();
                            j0 g72 = p5.g();
                            F f32 = new F(p5, intValue2, null);
                            e3.f1565a = p5;
                            e3.f1569e = z;
                            e3.f1573i = 4;
                            obj2 = g72.c(f32, e3);
                            if (obj2 == enumC1260a) {
                            }
                            return (C0075d) obj2;
                        case 4:
                            boolean z5 = e3.f1569e;
                            e5.g.y(obj2);
                            return (C0075d) obj2;
                        case 5:
                            boolean z6 = e3.f1569e;
                            kotlin.jvm.internal.s sVar3 = e3.f1568d;
                            kotlin.jvm.internal.s sVar4 = (kotlin.jvm.internal.s) e3.f1567c;
                            C0074c c0074c2 = (C0074c) e3.f1566b;
                            P p7 = (P) e3.f1565a;
                            e5.g.y(obj2);
                            sVar3.f10741a = obj2;
                            kotlin.jvm.internal.r rVar2 = new kotlin.jvm.internal.r();
                            try {
                                G g9 = new G(sVar4, p7, rVar2, null);
                                e3.f1565a = c0074c2;
                                e3.f1566b = sVar4;
                                e3.f1567c = rVar2;
                                e3.f1568d = null;
                                e3.f1573i = 6;
                                if (z6) {
                                    p7.getClass();
                                    b6 = g9.invoke(e3);
                                } else {
                                    b6 = p7.g().b(new C0093w(g9, null), e3);
                                }
                                if (b6 == enumC1260a) {
                                    return enumC1260a;
                                }
                                rVar = rVar2;
                                sVar = sVar4;
                                Object obj3 = sVar.f10741a;
                                return new C0075d(obj3 != null ? obj3.hashCode() : 0, rVar.f10740a, obj3);
                            } catch (Throwable th) {
                                th = th;
                                c0074c = c0074c2;
                                K1.b.C(c0074c, th);
                                throw c0074c;
                            }
                        case 6:
                            rVar = (kotlin.jvm.internal.r) e3.f1567c;
                            sVar = (kotlin.jvm.internal.s) e3.f1566b;
                            c0074c = (C0074c) e3.f1565a;
                            try {
                                e5.g.y(obj2);
                                Object obj32 = sVar.f10741a;
                                return new C0075d(obj32 != null ? obj32.hashCode() : 0, rVar.f10740a, obj32);
                            } catch (Throwable th2) {
                                th = th2;
                                K1.b.C(c0074c, th);
                                throw c0074c;
                            }
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }
            switch (e3.f1573i) {
            }
        } catch (C0074c e7) {
            e = e7;
        }
        e3 = new E(p5, abstractC1295c);
        Object obj22 = e3.f1571g;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
    }

    @Override // M.InterfaceC0080i
    public final Object c(InterfaceC1445p interfaceC1445p, m4.h hVar) {
        o0 o0Var = (o0) hVar.getContext().o(n0.f1736a);
        if (o0Var != null) {
            o0Var.d(this);
        }
        return AbstractC0024y.w(new o0(o0Var, this), new K(this, interfaceC1445p, null), hVar);
    }

    public final j0 g() {
        return (j0) this.f1623k.getValue();
    }

    @Override // M.InterfaceC0080i
    public final G4.d getData() {
        return this.f1616d;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(AbstractC1295c abstractC1295c) {
        A a6;
        Object obj;
        int i2;
        P p5;
        int intValue;
        int i3;
        Throwable th;
        P p6;
        f2.t tVar;
        try {
            if (abstractC1295c instanceof A) {
                a6 = (A) abstractC1295c;
                int i6 = a6.f1550e;
                if ((i6 & Integer.MIN_VALUE) != 0) {
                    a6.f1550e = i6 - Integer.MIN_VALUE;
                    Object obj2 = a6.f1548c;
                    obj = EnumC1260a.f11058a;
                    i2 = a6.f1550e;
                    if (i2 != 0) {
                        e5.g.y(obj2);
                        j0 g6 = g();
                        a6.f1546a = this;
                        a6.f1550e = 1;
                        obj2 = g6.a();
                        if (obj2 == obj) {
                            return obj;
                        }
                        p5 = this;
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            i3 = a6.f1547b;
                            p6 = a6.f1546a;
                            try {
                                e5.g.y(obj2);
                                return f4.v.f5689a;
                            } catch (Throwable th2) {
                                th = th2;
                                p6.f1620h.h(new d0(i3, th));
                                throw th;
                            }
                        }
                        p5 = a6.f1546a;
                        e5.g.y(obj2);
                    }
                    intValue = ((Number) obj2).intValue();
                    tVar = p5.f1621i;
                    a6.f1546a = p5;
                    a6.f1547b = intValue;
                    a6.f1550e = 2;
                    if (tVar.f(a6) == obj) {
                        return obj;
                    }
                    return f4.v.f5689a;
                }
            }
            tVar = p5.f1621i;
            a6.f1546a = p5;
            a6.f1547b = intValue;
            a6.f1550e = 2;
            if (tVar.f(a6) == obj) {
            }
            return f4.v.f5689a;
        } catch (Throwable th3) {
            i3 = intValue;
            th = th3;
            p6 = p5;
            p6.f1620h.h(new d0(i3, th));
            throw th;
        }
        a6 = new A(this, abstractC1295c);
        Object obj22 = a6.f1548c;
        obj = EnumC1260a.f11058a;
        i2 = a6.f1550e;
        if (i2 != 0) {
        }
        intValue = ((Number) obj22).intValue();
    }

    public final Object i(AbstractC1295c abstractC1295c) {
        return ((Y) this.f1622j.getValue()).a(new r(3, (InterfaceC1218d) null), abstractC1295c);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(Object obj, boolean z, AbstractC1295c abstractC1295c) {
        N n6;
        int i2;
        kotlin.jvm.internal.r rVar;
        if (abstractC1295c instanceof N) {
            n6 = (N) abstractC1295c;
            int i3 = n6.f1605d;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                n6.f1605d = i3 - Integer.MIN_VALUE;
                Object obj2 = n6.f1603b;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = n6.f1605d;
                if (i2 != 0) {
                    e5.g.y(obj2);
                    kotlin.jvm.internal.r rVar2 = new kotlin.jvm.internal.r();
                    Y y5 = (Y) this.f1622j.getValue();
                    O o2 = new O(rVar2, this, obj, z, null);
                    n6.f1602a = rVar2;
                    n6.f1605d = 1;
                    if (y5.b(o2, n6) == enumC1260a) {
                        return enumC1260a;
                    }
                    rVar = rVar2;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    rVar = n6.f1602a;
                    e5.g.y(obj2);
                }
                return new Integer(rVar.f10740a);
            }
        }
        n6 = new N(this, abstractC1295c);
        Object obj22 = n6.f1603b;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = n6.f1605d;
        if (i2 != 0) {
        }
        return new Integer(rVar.f10740a);
    }
}
