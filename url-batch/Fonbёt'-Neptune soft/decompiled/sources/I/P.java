package I;

import B0.C0023a;
import Y0.AbstractC0127v;
import Y0.C0118l;
import Y0.C0120n;
import Y0.C0125t;
import Y0.InterfaceC0117k;
import Y0.InterfaceC0126u;
import a.AbstractC0132a;
import java.util.List;

/* loaded from: classes.dex */
public final class P implements InterfaceC0074i {

    /* renamed from: e, reason: collision with root package name */
    public final V f569e;

    /* renamed from: f, reason: collision with root package name */
    public final C0023a f570f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC0126u f571g;

    /* renamed from: j, reason: collision with root package name */
    public int f574j;

    /* renamed from: k, reason: collision with root package name */
    public Y0.e0 f575k;

    /* renamed from: m, reason: collision with root package name */
    public final C0079n f577m;

    /* renamed from: n, reason: collision with root package name */
    public final F0.f f578n;

    /* renamed from: o, reason: collision with root package name */
    public final F0.f f579o;

    /* renamed from: p, reason: collision with root package name */
    public final C0079n f580p;

    /* renamed from: h, reason: collision with root package name */
    public final B.m f572h = new B.m(new C0085u(this, null));

    /* renamed from: i, reason: collision with root package name */
    public final g1.d f573i = g1.e.a();

    /* renamed from: l, reason: collision with root package name */
    public final B.m f576l = new B.m(6);

    public P(V v, List list, C0023a c0023a, InterfaceC0126u interfaceC0126u) {
        this.f569e = v;
        this.f570f = c0023a;
        this.f571g = interfaceC0126u;
        C0079n c0079n = new C0079n();
        c0079n.f692h = this;
        c0079n.f689e = g1.e.a();
        C0118l c0118l = new C0118l(true);
        c0118l.H(null);
        c0079n.f690f = c0118l;
        c0079n.f691g = G0.d.S(list);
        this.f577m = c0079n;
        this.f578n = new F0.f(new C0080o(this, 1));
        this.f579o = new F0.f(new C0080o(this, 0));
        D0.P p2 = new D0.P(1, this);
        M m2 = new M(this, null);
        C0079n c0079n2 = new C0079n();
        c0079n2.f689e = interfaceC0126u;
        c0079n2.f690f = m2;
        c0079n2.f691g = a1.i.a(Integer.MAX_VALUE, 0, 6);
        c0079n2.f692h = new B.m(4);
        Y0.P p3 = (Y0.P) interfaceC0126u.h().k(C0125t.f1230f);
        if (p3 != null) {
            ((Y0.Z) p3).I(false, true, new g1.b(2, p2, c0079n2));
        }
        this.f580p = c0079n2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0053 A[Catch: all -> 0x005d, TryCatch #0 {all -> 0x005d, blocks: (B:12:0x004b, B:14:0x0053, B:16:0x0057, B:17:0x005a), top: B:11:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(P p2, J0.b bVar) {
        C0086v c0086v;
        int i2;
        g1.d dVar;
        int i3;
        p2.getClass();
        try {
            if (bVar instanceof C0086v) {
                c0086v = (C0086v) bVar;
                int i4 = c0086v.f717l;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    c0086v.f717l = i4 - Integer.MIN_VALUE;
                    Object obj = c0086v.f715j;
                    I0.a aVar = I0.a.f733e;
                    i2 = c0086v.f717l;
                    if (i2 != 0) {
                        i1.a.G(obj);
                        c0086v.f713h = p2;
                        dVar = p2.f573i;
                        c0086v.f714i = dVar;
                        c0086v.f717l = 1;
                        if (dVar.c(c0086v) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        g1.d dVar2 = c0086v.f714i;
                        P p3 = c0086v.f713h;
                        i1.a.G(obj);
                        dVar = dVar2;
                        p2 = p3;
                    }
                    i3 = p2.f574j - 1;
                    p2.f574j = i3;
                    if (i3 == 0) {
                        Y0.e0 e0Var = p2.f575k;
                        if (e0Var != null) {
                            e0Var.a(null);
                        }
                        p2.f575k = null;
                    }
                    dVar.e(null);
                    return F0.h.f469a;
                }
            }
            i3 = p2.f574j - 1;
            p2.f574j = i3;
            if (i3 == 0) {
            }
            dVar.e(null);
            return F0.h.f469a;
        } catch (Throwable th) {
            dVar.e(null);
            throw th;
        }
        c0086v = new C0086v(p2, bVar);
        Object obj2 = c0086v.f715j;
        I0.a aVar2 = I0.a.f733e;
        i2 = c0086v.f717l;
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
    /* JADX WARN: Type inference failed for: r2v3, types: [J0.g, P0.p] */
    /* JADX WARN: Type inference failed for: r2v9, types: [J0.g, P0.p] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(P p2, c0 c0Var, J0.b bVar) {
        C0088x c0088x;
        I0.a aVar;
        int i2;
        InterfaceC0117k interfaceC0117k;
        C0118l c0118l;
        P p3;
        Object b2;
        InterfaceC0117k interfaceC0117k2;
        Throwable a2;
        k0 m2;
        p2.getClass();
        if (bVar instanceof C0088x) {
            c0088x = (C0088x) bVar;
            int i3 = c0088x.f725m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c0088x.f725m = i3 - Integer.MIN_VALUE;
                Object obj = c0088x.f723k;
                aVar = I0.a.f733e;
                i2 = c0088x.f725m;
                boolean z2 = true;
                if (i2 == 0) {
                    try {
                        if (i2 == 1) {
                            interfaceC0117k = (InterfaceC0117k) c0088x.f720h;
                        } else if (i2 == 2) {
                            C0118l c0118l2 = c0088x.f722j;
                            P p4 = c0088x.f721i;
                            c0 c0Var2 = (c0) c0088x.f720h;
                            i1.a.G(obj);
                            c0118l = c0118l2;
                            p3 = p4;
                            c0Var = c0Var2;
                        } else {
                            if (i2 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            interfaceC0117k = (InterfaceC0117k) c0088x.f720h;
                        }
                        i1.a.G(obj);
                        interfaceC0117k2 = interfaceC0117k;
                    } catch (Throwable th) {
                        th = th;
                        obj = i1.a.b(th);
                        interfaceC0117k2 = p2;
                        a2 = F0.e.a(obj);
                        C0118l c0118l3 = (C0118l) interfaceC0117k2;
                        if (a2 != null) {
                        }
                        return F0.h.f469a;
                    }
                    a2 = F0.e.a(obj);
                    C0118l c0118l32 = (C0118l) interfaceC0117k2;
                    if (a2 != null) {
                        c0118l32.K(obj);
                    } else {
                        c0118l32.getClass();
                        c0118l32.K(new C0120n(a2, false));
                    }
                    return F0.h.f469a;
                }
                i1.a.G(obj);
                c0118l = c0Var.f620b;
                try {
                    m2 = p2.f576l.m();
                } catch (Throwable th2) {
                    th = th2;
                    p2 = c0118l;
                    obj = i1.a.b(th);
                    interfaceC0117k2 = p2;
                    a2 = F0.e.a(obj);
                    C0118l c0118l322 = (C0118l) interfaceC0117k2;
                    if (a2 != null) {
                    }
                    return F0.h.f469a;
                }
                if (m2 instanceof C0069d) {
                    ?? r2 = c0Var.f619a;
                    H0.i iVar = c0Var.f622d;
                    c0088x.f720h = c0118l;
                    c0088x.f725m = 1;
                    try {
                        b2 = p2.g().b(new H(p2, iVar, (P0.p) r2, (H0.d) null), c0088x);
                        if (b2 == aVar) {
                            return aVar;
                        }
                        C0118l c0118l4 = c0118l;
                        obj = b2;
                        interfaceC0117k2 = c0118l4;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        p2 = c0118l;
                        obj = i1.a.b(th);
                        interfaceC0117k2 = p2;
                        a2 = F0.e.a(obj);
                        C0118l c0118l3222 = (C0118l) interfaceC0117k2;
                        if (a2 != null) {
                        }
                        return F0.h.f469a;
                    }
                    a2 = F0.e.a(obj);
                    C0118l c0118l32222 = (C0118l) interfaceC0117k2;
                    if (a2 != null) {
                    }
                    return F0.h.f469a;
                }
                if (!(m2 instanceof d0)) {
                    z2 = m2 instanceof l0;
                }
                if (!z2) {
                    if (m2 instanceof b0) {
                        throw ((b0) m2).f618b;
                    }
                    throw new F0.b();
                }
                if (m2 != c0Var.f621c) {
                    Q0.h.c(m2, "null cannot be cast to non-null type androidx.datastore.core.ReadException<T of androidx.datastore.core.DataStoreImpl.handleUpdate$lambda$2>");
                    throw ((d0) m2).f625b;
                }
                c0088x.f720h = c0Var;
                c0088x.f721i = p2;
                c0088x.f722j = c0118l;
                c0088x.f725m = 2;
                Object h2 = p2.h(c0088x);
                p3 = p2;
                if (h2 == aVar) {
                    return aVar;
                }
                ?? r22 = c0Var.f619a;
                H0.i iVar2 = c0Var.f622d;
                c0088x.f720h = c0118l;
                c0088x.f721i = null;
                c0088x.f722j = null;
                c0088x.f725m = 3;
                b2 = p3.g().b(new H(p3, iVar2, (P0.p) r22, (H0.d) null), c0088x);
                if (b2 == aVar) {
                    return aVar;
                }
                C0118l c0118l42 = c0118l;
                obj = b2;
                interfaceC0117k2 = c0118l42;
                a2 = F0.e.a(obj);
                C0118l c0118l322222 = (C0118l) interfaceC0117k2;
                if (a2 != null) {
                }
                return F0.h.f469a;
            }
        }
        c0088x = new C0088x(p2, bVar);
        Object obj2 = c0088x.f723k;
        aVar = I0.a.f733e;
        i2 = c0088x.f725m;
        boolean z22 = true;
        if (i2 == 0) {
        }
        ?? r222 = c0Var.f619a;
        H0.i iVar22 = c0Var.f622d;
        c0088x.f720h = c0118l;
        c0088x.f721i = null;
        c0088x.f722j = null;
        c0088x.f725m = 3;
        b2 = p3.g().b(new H(p3, iVar22, (P0.p) r222, (H0.d) null), c0088x);
        if (b2 == aVar) {
        }
        C0118l c0118l422 = c0118l;
        obj2 = b2;
        interfaceC0117k2 = c0118l422;
        a2 = F0.e.a(obj2);
        C0118l c0118l3222222 = (C0118l) interfaceC0117k2;
        if (a2 != null) {
        }
        return F0.h.f469a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0052 A[Catch: all -> 0x0060, TRY_LEAVE, TryCatch #0 {all -> 0x0060, blocks: (B:12:0x004b, B:14:0x0052), top: B:11:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(P p2, J0.b bVar) {
        C0089y c0089y;
        int i2;
        g1.d dVar;
        int i3;
        p2.getClass();
        try {
            if (bVar instanceof C0089y) {
                c0089y = (C0089y) bVar;
                int i4 = c0089y.f730l;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    c0089y.f730l = i4 - Integer.MIN_VALUE;
                    Object obj = c0089y.f728j;
                    I0.a aVar = I0.a.f733e;
                    i2 = c0089y.f730l;
                    if (i2 != 0) {
                        i1.a.G(obj);
                        c0089y.f726h = p2;
                        dVar = p2.f573i;
                        c0089y.f727i = dVar;
                        c0089y.f730l = 1;
                        if (dVar.c(c0089y) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        g1.d dVar2 = c0089y.f727i;
                        P p3 = c0089y.f726h;
                        i1.a.G(obj);
                        dVar = dVar2;
                        p2 = p3;
                    }
                    i3 = p2.f574j + 1;
                    p2.f574j = i3;
                    if (i3 == 1) {
                        p2.f575k = AbstractC0127v.g(p2.f571g, new A(p2, null));
                    }
                    dVar.e(null);
                    return F0.h.f469a;
                }
            }
            i3 = p2.f574j + 1;
            p2.f574j = i3;
            if (i3 == 1) {
            }
            dVar.e(null);
            return F0.h.f469a;
        } catch (Throwable th) {
            dVar.e(null);
            throw th;
        }
        c0089y = new C0089y(p2, bVar);
        Object obj2 = c0089y.f728j;
        I0.a aVar2 = I0.a.f733e;
        i2 = c0089y.f730l;
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
    public static final Object e(P p2, boolean z2, H0.d dVar) {
        C c2;
        int i2;
        P p3;
        k0 k0Var;
        boolean z3;
        P p4;
        F0.c cVar;
        p2.getClass();
        if (dVar instanceof C) {
            c2 = (C) dVar;
            int i3 = c2.f516m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c2.f516m = i3 - Integer.MIN_VALUE;
                Object obj = c2.f514k;
                I0.a aVar = I0.a.f733e;
                i2 = c2.f516m;
                if (i2 != 0) {
                    i1.a.G(obj);
                    k0 m2 = p2.f576l.m();
                    if (m2 instanceof l0) {
                        throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                    }
                    j0 g2 = p2.g();
                    c2.f511h = p2;
                    c2.f512i = m2;
                    c2.f513j = z2;
                    c2.f516m = 1;
                    Integer a2 = g2.a();
                    if (a2 == aVar) {
                        return aVar;
                    }
                    p3 = p2;
                    k0Var = m2;
                    obj = a2;
                } else if (i2 == 1) {
                    z2 = c2.f513j;
                    k0Var = c2.f512i;
                    p3 = c2.f511h;
                    i1.a.G(obj);
                } else {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p4 = c2.f511h;
                        i1.a.G(obj);
                        cVar = (F0.c) obj;
                        k0 k0Var2 = (k0) cVar.f461e;
                        if (((Boolean) cVar.f462f).booleanValue()) {
                            return k0Var2;
                        }
                        p4.f576l.t(k0Var2);
                        return k0Var2;
                    }
                    p4 = c2.f511h;
                    i1.a.G(obj);
                    cVar = (F0.c) obj;
                    k0 k0Var22 = (k0) cVar.f461e;
                    if (((Boolean) cVar.f462f).booleanValue()) {
                    }
                }
                int intValue = ((Number) obj).intValue();
                z3 = k0Var instanceof C0069d;
                int i4 = !z3 ? k0Var.f673a : -1;
                if (!z3 && intValue == i4) {
                    return k0Var;
                }
                if (z2) {
                    j0 g3 = p3.g();
                    E e2 = new E(p3, i4, null);
                    c2.f511h = p3;
                    c2.f512i = null;
                    c2.f516m = 3;
                    obj = g3.c(e2, c2);
                    if (obj == aVar) {
                        return aVar;
                    }
                    p4 = p3;
                    cVar = (F0.c) obj;
                    k0 k0Var222 = (k0) cVar.f461e;
                    if (((Boolean) cVar.f462f).booleanValue()) {
                    }
                } else {
                    j0 g4 = p3.g();
                    D d2 = new D(p3, null);
                    c2.f511h = p3;
                    c2.f512i = null;
                    c2.f516m = 2;
                    obj = g4.b(d2, c2);
                    if (obj == aVar) {
                        return aVar;
                    }
                    p4 = p3;
                    cVar = (F0.c) obj;
                    k0 k0Var2222 = (k0) cVar.f461e;
                    if (((Boolean) cVar.f462f).booleanValue()) {
                    }
                }
            }
        }
        c2 = new C(p2, dVar);
        Object obj2 = c2.f514k;
        I0.a aVar2 = I0.a.f733e;
        i2 = c2.f516m;
        if (i2 != 0) {
        }
        int intValue2 = ((Number) obj2).intValue();
        z3 = k0Var instanceof C0069d;
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
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ea A[Catch: c -> 0x00ab, TryCatch #2 {c -> 0x00ab, blocks: (B:36:0x00a6, B:37:0x0144, B:41:0x00b4, B:42:0x0127, B:58:0x00d1, B:60:0x00ea, B:61:0x00ee, B:67:0x00da, B:71:0x0115), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(P p2, boolean z2, J0.b bVar) {
        F f2;
        Integer a2;
        Object obj;
        P p3;
        int i2;
        C0068c c0068c;
        Object b2;
        Q0.n nVar;
        Q0.o oVar;
        p2.getClass();
        try {
            if (bVar instanceof F) {
                f2 = (F) bVar;
                int i3 = f2.f533p;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    f2.f533p = i3 - Integer.MIN_VALUE;
                    Object obj2 = f2.f531n;
                    I0.a aVar = I0.a.f733e;
                    switch (f2.f533p) {
                        case 0:
                            i1.a.G(obj2);
                            if (!z2) {
                                j0 g2 = p2.g();
                                f2.f525h = p2;
                                f2.f529l = z2;
                                f2.f533p = 3;
                                obj2 = g2.a();
                                if (obj2 == aVar) {
                                    return aVar;
                                }
                                int intValue = ((Number) obj2).intValue();
                                j0 g3 = p2.g();
                                G g4 = new G(p2, intValue, null);
                                f2.f525h = p2;
                                f2.f529l = z2;
                                f2.f533p = 4;
                                obj2 = g3.c(g4, f2);
                                if (obj2 == aVar) {
                                    return aVar;
                                }
                                return (C0069d) obj2;
                            }
                            f2.f525h = p2;
                            f2.f529l = z2;
                            f2.f533p = 1;
                            obj2 = p2.i(f2);
                            if (obj2 == aVar) {
                                return aVar;
                            }
                            int hashCode = obj2 != null ? obj2.hashCode() : 0;
                            j0 g5 = p2.g();
                            f2.f525h = p2;
                            f2.f526i = obj2;
                            f2.f529l = z2;
                            f2.f530m = hashCode;
                            f2.f533p = 2;
                            a2 = g5.a();
                            if (a2 != aVar) {
                                return aVar;
                            }
                            obj = obj2;
                            obj2 = a2;
                            p3 = p2;
                            i2 = hashCode;
                            return new C0069d(obj, i2, ((Number) obj2).intValue());
                        case 1:
                            z2 = f2.f529l;
                            p2 = (P) f2.f525h;
                            i1.a.G(obj2);
                            if (obj2 != null) {
                            }
                            j0 g52 = p2.g();
                            f2.f525h = p2;
                            f2.f526i = obj2;
                            f2.f529l = z2;
                            f2.f530m = hashCode;
                            f2.f533p = 2;
                            a2 = g52.a();
                            if (a2 != aVar) {
                            }
                            break;
                        case 2:
                            i2 = f2.f530m;
                            z2 = f2.f529l;
                            obj = f2.f526i;
                            p3 = (P) f2.f525h;
                            try {
                                i1.a.G(obj2);
                                return new C0069d(obj, i2, ((Number) obj2).intValue());
                            } catch (C0068c e2) {
                                e = e2;
                                p2 = p3;
                                Q0.o oVar2 = new Q0.o();
                                C0023a c0023a = p2.f570f;
                                f2.f525h = p2;
                                f2.f526i = e;
                                f2.f527j = oVar2;
                                f2.f528k = oVar2;
                                f2.f529l = z2;
                                f2.f533p = 5;
                                throw e;
                            }
                        case 3:
                            z2 = f2.f529l;
                            p2 = (P) f2.f525h;
                            i1.a.G(obj2);
                            int intValue2 = ((Number) obj2).intValue();
                            j0 g32 = p2.g();
                            G g42 = new G(p2, intValue2, null);
                            f2.f525h = p2;
                            f2.f529l = z2;
                            f2.f533p = 4;
                            obj2 = g32.c(g42, f2);
                            if (obj2 == aVar) {
                            }
                            return (C0069d) obj2;
                        case K.k.LONG_FIELD_NUMBER /* 4 */:
                            boolean z3 = f2.f529l;
                            i1.a.G(obj2);
                            return (C0069d) obj2;
                        case K.k.STRING_FIELD_NUMBER /* 5 */:
                            boolean z4 = f2.f529l;
                            Q0.o oVar3 = f2.f528k;
                            Q0.o oVar4 = (Q0.o) f2.f527j;
                            C0068c c0068c2 = (C0068c) f2.f526i;
                            P p4 = (P) f2.f525h;
                            i1.a.G(obj2);
                            oVar3.f983e = obj2;
                            Q0.n nVar2 = new Q0.n();
                            try {
                                H h2 = new H(oVar4, p4, nVar2, (H0.d) null);
                                f2.f525h = c0068c2;
                                f2.f526i = oVar4;
                                f2.f527j = nVar2;
                                f2.f528k = null;
                                f2.f533p = 6;
                                if (z4) {
                                    p4.getClass();
                                    b2 = h2.i(f2);
                                } else {
                                    b2 = p4.g().b(new C0087w(h2, null), f2);
                                }
                                if (b2 == aVar) {
                                    return aVar;
                                }
                                nVar = nVar2;
                                oVar = oVar4;
                                Object obj3 = oVar.f983e;
                                return new C0069d(obj3, obj3 != null ? obj3.hashCode() : 0, nVar.f982e);
                            } catch (Throwable th) {
                                th = th;
                                c0068c = c0068c2;
                                AbstractC0132a.c(c0068c, th);
                                throw c0068c;
                            }
                        case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            nVar = (Q0.n) f2.f527j;
                            oVar = (Q0.o) f2.f526i;
                            c0068c = (C0068c) f2.f525h;
                            try {
                                i1.a.G(obj2);
                                Object obj32 = oVar.f983e;
                                return new C0069d(obj32, obj32 != null ? obj32.hashCode() : 0, nVar.f982e);
                            } catch (Throwable th2) {
                                th = th2;
                                AbstractC0132a.c(c0068c, th);
                                throw c0068c;
                            }
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }
            switch (f2.f533p) {
            }
        } catch (C0068c e3) {
            e = e3;
        }
        f2 = new F(p2, bVar);
        Object obj22 = f2.f531n;
        I0.a aVar2 = I0.a.f733e;
    }

    @Override // I.InterfaceC0074i
    public final Object c(P0.p pVar, J0.g gVar) {
        H0.i iVar = gVar.f737f;
        Q0.h.b(iVar);
        o0 o0Var = (o0) iVar.k(n0.f693e);
        if (o0Var != null) {
            o0Var.c(this);
        }
        return AbstractC0127v.n(new o0(o0Var, this), new K(this, pVar, null), gVar);
    }

    public final j0 g() {
        return (j0) this.f579o.a();
    }

    @Override // I.InterfaceC0074i
    public final b1.d getData() {
        return this.f572h;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(J0.b bVar) {
        B b2;
        Object obj;
        int i2;
        P p2;
        int intValue;
        int i3;
        Throwable th;
        P p3;
        C0079n c0079n;
        try {
            if (bVar instanceof B) {
                b2 = (B) bVar;
                int i4 = b2.f510l;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    b2.f510l = i4 - Integer.MIN_VALUE;
                    Object obj2 = b2.f508j;
                    obj = I0.a.f733e;
                    i2 = b2.f510l;
                    if (i2 != 0) {
                        i1.a.G(obj2);
                        j0 g2 = g();
                        b2.f506h = this;
                        b2.f510l = 1;
                        obj2 = g2.a();
                        if (obj2 == obj) {
                            return obj;
                        }
                        p2 = this;
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            i3 = b2.f507i;
                            p3 = b2.f506h;
                            try {
                                i1.a.G(obj2);
                                return F0.h.f469a;
                            } catch (Throwable th2) {
                                th = th2;
                                p3.f576l.t(new d0(th, i3));
                                throw th;
                            }
                        }
                        p2 = b2.f506h;
                        i1.a.G(obj2);
                    }
                    intValue = ((Number) obj2).intValue();
                    c0079n = p2.f577m;
                    b2.f506h = p2;
                    b2.f507i = intValue;
                    b2.f510l = 2;
                    if (c0079n.g(b2) == obj) {
                        return obj;
                    }
                    return F0.h.f469a;
                }
            }
            c0079n = p2.f577m;
            b2.f506h = p2;
            b2.f507i = intValue;
            b2.f510l = 2;
            if (c0079n.g(b2) == obj) {
            }
            return F0.h.f469a;
        } catch (Throwable th3) {
            i3 = intValue;
            th = th3;
            p3 = p2;
            p3.f576l.t(new d0(th, i3));
            throw th;
        }
        b2 = new B(this, bVar);
        Object obj22 = b2.f508j;
        obj = I0.a.f733e;
        i2 = b2.f510l;
        if (i2 != 0) {
        }
        intValue = ((Number) obj22).intValue();
    }

    public final Object i(J0.b bVar) {
        return ((Y) this.f578n.a()).a(new C0083s(3, (H0.d) null), bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(Object obj, boolean z2, J0.b bVar) {
        N n2;
        int i2;
        Q0.n nVar;
        if (bVar instanceof N) {
            n2 = (N) bVar;
            int i3 = n2.f561k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                n2.f561k = i3 - Integer.MIN_VALUE;
                Object obj2 = n2.f559i;
                I0.a aVar = I0.a.f733e;
                i2 = n2.f561k;
                if (i2 != 0) {
                    i1.a.G(obj2);
                    Q0.n nVar2 = new Q0.n();
                    Y y2 = (Y) this.f578n.a();
                    O o2 = new O(nVar2, this, obj, z2, null);
                    n2.f558h = nVar2;
                    n2.f561k = 1;
                    if (y2.b(o2, n2) == aVar) {
                        return aVar;
                    }
                    nVar = nVar2;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    nVar = n2.f558h;
                    i1.a.G(obj2);
                }
                return new Integer(nVar.f982e);
            }
        }
        n2 = new N(this, bVar);
        Object obj22 = n2.f559i;
        I0.a aVar2 = I0.a.f733e;
        i2 = n2.f561k;
        if (i2 != 0) {
        }
        return new Integer(nVar.f982e);
    }
}
