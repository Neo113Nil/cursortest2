package F;

import B0.C0000a;
import W0.AbstractC0081v;
import W0.C0072l;
import W0.C0074n;
import W0.C0079t;
import W0.InterfaceC0071k;
import W0.InterfaceC0080u;
import a.AbstractC0086a;
import java.util.List;

/* loaded from: classes.dex */
public final class P implements InterfaceC0027i {

    /* renamed from: e, reason: collision with root package name */
    public final V f288e;

    /* renamed from: f, reason: collision with root package name */
    public final C0000a f289f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC0080u f290g;

    /* renamed from: j, reason: collision with root package name */
    public int f293j;

    /* renamed from: k, reason: collision with root package name */
    public W0.e0 f294k;

    /* renamed from: m, reason: collision with root package name */
    public final C0032n f296m;

    /* renamed from: n, reason: collision with root package name */
    public final D0.f f297n;

    /* renamed from: o, reason: collision with root package name */
    public final D0.f f298o;

    /* renamed from: p, reason: collision with root package name */
    public final C0032n f299p;

    /* renamed from: h, reason: collision with root package name */
    public final B0.E f291h = new B0.E(new C0038u(this, null));

    /* renamed from: i, reason: collision with root package name */
    public final e1.d f292i = new e1.d();

    /* renamed from: l, reason: collision with root package name */
    public final B0.E f295l = new B0.E(4);

    public P(V v2, List list, C0000a c0000a, InterfaceC0080u interfaceC0080u) {
        this.f288e = v2;
        this.f289f = c0000a;
        this.f290g = interfaceC0080u;
        C0032n c0032n = new C0032n();
        c0032n.f412d = this;
        c0032n.f409a = new e1.d();
        C0072l c0072l = new C0072l(true);
        c0072l.G(null);
        c0032n.f410b = c0072l;
        c0032n.f411c = E0.f.S(list);
        this.f296m = c0032n;
        this.f297n = new D0.f(new C0033o(this, 1));
        this.f298o = new D0.f(new C0033o(this, 0));
        L l2 = new L(0, this);
        M m2 = new M(this, null);
        C0032n c0032n2 = new C0032n();
        c0032n2.f409a = interfaceC0080u;
        c0032n2.f410b = m2;
        c0032n2.f411c = Y0.i.a(Integer.MAX_VALUE, 0, 6);
        c0032n2.f412d = new B0.E(2);
        W0.P p2 = (W0.P) interfaceC0080u.c().m(C0079t.f974f);
        if (p2 != null) {
            ((W0.Z) p2).H(false, true, new f0(l2, c0032n2));
        }
        this.f299p = c0032n2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0050 A[Catch: all -> 0x0058, TryCatch #0 {all -> 0x0058, blocks: (B:12:0x0048, B:14:0x0050, B:16:0x0054, B:17:0x005a), top: B:11:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(P p2, I0.b bVar) {
        C0039v c0039v;
        int i2;
        e1.d dVar;
        int i3;
        try {
            if (bVar instanceof C0039v) {
                c0039v = (C0039v) bVar;
                int i4 = c0039v.f438l;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    c0039v.f438l = i4 - Integer.MIN_VALUE;
                    Object obj = c0039v.f436j;
                    i2 = c0039v.f438l;
                    if (i2 != 0) {
                        AbstractC0086a.I(obj);
                        dVar = p2.f292i;
                        c0039v.f434h = p2;
                        c0039v.f435i = dVar;
                        c0039v.f438l = 1;
                        Object c2 = dVar.c(c0039v);
                        H0.a aVar = H0.a.f511e;
                        if (c2 == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        e1.d dVar2 = c0039v.f435i;
                        P p3 = c0039v.f434h;
                        AbstractC0086a.I(obj);
                        dVar = dVar2;
                        p2 = p3;
                    }
                    i3 = p2.f293j - 1;
                    p2.f293j = i3;
                    if (i3 == 0) {
                        W0.e0 e0Var = p2.f294k;
                        if (e0Var != null) {
                            e0Var.b(null);
                        }
                        p2.f294k = null;
                    }
                    dVar.e(null);
                    return D0.h.f206a;
                }
            }
            i3 = p2.f293j - 1;
            p2.f293j = i3;
            if (i3 == 0) {
            }
            dVar.e(null);
            return D0.h.f206a;
        } catch (Throwable th) {
            dVar.e(null);
            throw th;
        }
        c0039v = new C0039v(p2, bVar);
        Object obj2 = c0039v.f436j;
        i2 = c0039v.f438l;
        if (i2 != 0) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|(7:55|(1:(1:(1:59)(2:61|62))(3:63|64|65))(1:66)|60|17|(1:19)(1:23)|20|21)(5:8|9|10|(3:12|13|14)(3:30|(1:32)(1:53)|(2:34|(2:36|(1:38))(2:45|46))(2:47|(2:49|50)(2:51|52)))|24)|39|40|41))|68|6|(0)(0)|39|40|41|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0076, code lost:
    
        if (r9 == r6) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0079, code lost:
    
        r8 = r11;
        r11 = r9;
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ba, code lost:
    
        if (r9 != r6) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bd, code lost:
    
        r9 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0024 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0052  */
    /* JADX WARN: Type inference failed for: r1v3, types: [I0.g, O0.p] */
    /* JADX WARN: Type inference failed for: r1v9, types: [I0.g, O0.p] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(P p2, c0 c0Var, I0.b bVar) {
        C0041x c0041x;
        int i2;
        InterfaceC0071k interfaceC0071k;
        C0072l c0072l;
        P p3;
        Object b2;
        InterfaceC0071k interfaceC0071k2;
        Throwable a2;
        if (bVar instanceof C0041x) {
            c0041x = (C0041x) bVar;
            int i3 = c0041x.f446m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c0041x.f446m = i3 - Integer.MIN_VALUE;
                Object obj = c0041x.f444k;
                i2 = c0041x.f446m;
                boolean z2 = true;
                H0.a aVar = H0.a.f511e;
                if (i2 == 0) {
                    try {
                        if (i2 == 1) {
                            interfaceC0071k = (InterfaceC0071k) c0041x.f441h;
                        } else if (i2 == 2) {
                            C0072l c0072l2 = c0041x.f443j;
                            P p4 = c0041x.f442i;
                            c0 c0Var2 = (c0) c0041x.f441h;
                            AbstractC0086a.I(obj);
                            c0072l = c0072l2;
                            p3 = p4;
                            c0Var = c0Var2;
                        } else {
                            if (i2 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            interfaceC0071k = (InterfaceC0071k) c0041x.f441h;
                        }
                        AbstractC0086a.I(obj);
                        interfaceC0071k2 = interfaceC0071k;
                    } catch (Throwable th) {
                        th = th;
                        obj = AbstractC0086a.l(th);
                        interfaceC0071k2 = p2;
                        a2 = D0.e.a(obj);
                        C0072l c0072l3 = (C0072l) interfaceC0071k2;
                        if (a2 == null) {
                        }
                        return D0.h.f206a;
                    }
                    a2 = D0.e.a(obj);
                    C0072l c0072l32 = (C0072l) interfaceC0071k2;
                    if (a2 == null) {
                        c0072l32.J(obj);
                    } else {
                        c0072l32.getClass();
                        c0072l32.J(new C0074n(a2, false));
                    }
                    return D0.h.f206a;
                }
                AbstractC0086a.I(obj);
                c0072l = c0Var.f339b;
                try {
                    l0 z3 = p2.f295l.z();
                    if (z3 instanceof C0022d) {
                        ?? r1 = c0Var.f338a;
                        G0.i iVar = c0Var.f341d;
                        c0041x.f441h = c0072l;
                        c0041x.f446m = 1;
                        try {
                            b2 = p2.g().b(new H(p2, iVar, (O0.p) r1, (G0.d) null), c0041x);
                        } catch (Throwable th2) {
                            th = th2;
                            th = th;
                            p2 = c0072l;
                            obj = AbstractC0086a.l(th);
                            interfaceC0071k2 = p2;
                            a2 = D0.e.a(obj);
                            C0072l c0072l322 = (C0072l) interfaceC0071k2;
                            if (a2 == null) {
                            }
                            return D0.h.f206a;
                        }
                    } else {
                        if (!(z3 instanceof d0)) {
                            z2 = z3 instanceof m0;
                        }
                        if (!z2) {
                            if (z3 instanceof b0) {
                                throw ((b0) z3).f337b;
                            }
                            throw new D0.b();
                        }
                        if (z3 != c0Var.f340c) {
                            P0.h.c(z3, "null cannot be cast to non-null type androidx.datastore.core.ReadException<T of androidx.datastore.core.DataStoreImpl.handleUpdate$lambda$2>");
                            throw ((d0) z3).f344b;
                        }
                        c0041x.f441h = c0Var;
                        c0041x.f442i = p2;
                        c0041x.f443j = c0072l;
                        c0041x.f446m = 2;
                        Object h2 = p2.h(c0041x);
                        p3 = p2;
                        if (h2 == aVar) {
                        }
                    }
                    return aVar;
                } catch (Throwable th3) {
                    th = th3;
                    p2 = c0072l;
                    obj = AbstractC0086a.l(th);
                    interfaceC0071k2 = p2;
                    a2 = D0.e.a(obj);
                    C0072l c0072l3222 = (C0072l) interfaceC0071k2;
                    if (a2 == null) {
                    }
                    return D0.h.f206a;
                }
                ?? r12 = c0Var.f338a;
                G0.i iVar2 = c0Var.f341d;
                c0041x.f441h = c0072l;
                c0041x.f442i = null;
                c0041x.f443j = null;
                c0041x.f446m = 3;
                b2 = p3.g().b(new H(p3, iVar2, (O0.p) r12, (G0.d) null), c0041x);
            }
        }
        c0041x = new C0041x(p2, bVar);
        Object obj2 = c0041x.f444k;
        i2 = c0041x.f446m;
        boolean z22 = true;
        H0.a aVar2 = H0.a.f511e;
        if (i2 == 0) {
        }
        ?? r122 = c0Var.f338a;
        G0.i iVar22 = c0Var.f341d;
        c0041x.f441h = c0072l;
        c0041x.f442i = null;
        c0041x.f443j = null;
        c0041x.f446m = 3;
        b2 = p3.g().b(new H(p3, iVar22, (O0.p) r122, (G0.d) null), c0041x);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004f A[Catch: all -> 0x005d, TRY_LEAVE, TryCatch #0 {all -> 0x005d, blocks: (B:12:0x0048, B:14:0x004f), top: B:11:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(P p2, I0.b bVar) {
        C0042y c0042y;
        int i2;
        e1.d dVar;
        int i3;
        try {
            if (bVar instanceof C0042y) {
                c0042y = (C0042y) bVar;
                int i4 = c0042y.f451l;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    c0042y.f451l = i4 - Integer.MIN_VALUE;
                    Object obj = c0042y.f449j;
                    i2 = c0042y.f451l;
                    if (i2 != 0) {
                        AbstractC0086a.I(obj);
                        dVar = p2.f292i;
                        c0042y.f447h = p2;
                        c0042y.f448i = dVar;
                        c0042y.f451l = 1;
                        Object c2 = dVar.c(c0042y);
                        H0.a aVar = H0.a.f511e;
                        if (c2 == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        e1.d dVar2 = c0042y.f448i;
                        P p3 = c0042y.f447h;
                        AbstractC0086a.I(obj);
                        dVar = dVar2;
                        p2 = p3;
                    }
                    i3 = p2.f293j + 1;
                    p2.f293j = i3;
                    if (i3 == 1) {
                        p2.f294k = AbstractC0081v.f(p2.f290g, new A(p2, null));
                    }
                    dVar.e(null);
                    return D0.h.f206a;
                }
            }
            i3 = p2.f293j + 1;
            p2.f293j = i3;
            if (i3 == 1) {
            }
            dVar.e(null);
            return D0.h.f206a;
        } catch (Throwable th) {
            dVar.e(null);
            throw th;
        }
        c0042y = new C0042y(p2, bVar);
        Object obj2 = c0042y.f449j;
        i2 = c0042y.f451l;
        if (i2 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(P p2, boolean z2, I0.b bVar) {
        C c2;
        int i2;
        H0.a aVar;
        P p3;
        l0 l0Var;
        boolean z3;
        P p4;
        D0.c cVar;
        if (bVar instanceof C) {
            c2 = (C) bVar;
            int i3 = c2.f234m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c2.f234m = i3 - Integer.MIN_VALUE;
                Object obj = c2.f232k;
                i2 = c2.f234m;
                aVar = H0.a.f511e;
                if (i2 != 0) {
                    AbstractC0086a.I(obj);
                    l0 z4 = p2.f295l.z();
                    if (z4 instanceof m0) {
                        throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                    }
                    k0 g2 = p2.g();
                    c2.f229h = p2;
                    c2.f230i = z4;
                    c2.f231j = z2;
                    c2.f234m = 1;
                    Integer a2 = g2.a();
                    if (a2 != aVar) {
                        p3 = p2;
                        l0Var = z4;
                        obj = a2;
                    }
                    return aVar;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        p4 = c2.f229h;
                        AbstractC0086a.I(obj);
                        cVar = (D0.c) obj;
                        l0 l0Var2 = (l0) cVar.f199e;
                        if (((Boolean) cVar.f200f).booleanValue()) {
                        }
                        return l0Var2;
                    }
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p4 = c2.f229h;
                    AbstractC0086a.I(obj);
                    cVar = (D0.c) obj;
                    l0 l0Var22 = (l0) cVar.f199e;
                    if (((Boolean) cVar.f200f).booleanValue()) {
                        p4.f295l.D(l0Var22);
                    }
                    return l0Var22;
                }
                z2 = c2.f231j;
                l0Var = c2.f230i;
                p3 = c2.f229h;
                AbstractC0086a.I(obj);
                int intValue = ((Number) obj).intValue();
                z3 = l0Var instanceof C0022d;
                int i4 = !z3 ? l0Var.f398a : -1;
                if (!z3 && intValue == i4) {
                    return l0Var;
                }
                if (z2) {
                    k0 g3 = p3.g();
                    E e2 = new E(p3, i4, null);
                    c2.f229h = p3;
                    c2.f230i = null;
                    c2.f234m = 3;
                    obj = g3.c(e2, c2);
                    if (obj != aVar) {
                        p4 = p3;
                        cVar = (D0.c) obj;
                        l0 l0Var222 = (l0) cVar.f199e;
                        if (((Boolean) cVar.f200f).booleanValue()) {
                        }
                        return l0Var222;
                    }
                } else {
                    k0 g4 = p3.g();
                    D d2 = new D(p3, null);
                    c2.f229h = p3;
                    c2.f230i = null;
                    c2.f234m = 2;
                    obj = g4.b(d2, c2);
                    if (obj != aVar) {
                        p4 = p3;
                        cVar = (D0.c) obj;
                        l0 l0Var2222 = (l0) cVar.f199e;
                        if (((Boolean) cVar.f200f).booleanValue()) {
                        }
                        return l0Var2222;
                    }
                }
                return aVar;
            }
        }
        c2 = new C(p2, bVar);
        Object obj2 = c2.f232k;
        i2 = c2.f234m;
        aVar = H0.a.f511e;
        if (i2 != 0) {
        }
        int intValue2 = ((Number) obj2).intValue();
        z3 = l0Var instanceof C0022d;
        if (!z3) {
        }
        if (!z3) {
        }
        if (z2) {
        }
        return aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x013e, code lost:
    
        if (r11 != r4) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e6 A[Catch: c -> 0x00a7, TryCatch #3 {c -> 0x00a7, blocks: (B:36:0x00a2, B:37:0x0141, B:40:0x00b0, B:41:0x0124, B:54:0x00cd, B:56:0x00e6, B:57:0x00ea, B:62:0x00d6, B:65:0x0112), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(P p2, boolean z2, I0.b bVar) {
        F f2;
        int i2;
        Integer a2;
        P p3;
        int i3;
        Object obj;
        C0021c c0021c;
        Object b2;
        P0.n nVar;
        P0.o oVar;
        try {
            if (bVar instanceof F) {
                f2 = (F) bVar;
                int i4 = f2.f251p;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    f2.f251p = i4 - Integer.MIN_VALUE;
                    Object obj2 = f2.f249n;
                    i2 = f2.f251p;
                    H0.a aVar = H0.a.f511e;
                    switch (i2) {
                        case 0:
                            AbstractC0086a.I(obj2);
                            if (!z2) {
                                k0 g2 = p2.g();
                                f2.f243h = p2;
                                f2.f247l = z2;
                                f2.f251p = 3;
                                obj2 = g2.a();
                                if (obj2 == aVar) {
                                }
                                int intValue = ((Number) obj2).intValue();
                                k0 g3 = p2.g();
                                G g4 = new G(p2, intValue, null);
                                f2.f243h = p2;
                                f2.f247l = z2;
                                f2.f251p = 4;
                                obj2 = g3.c(g4, f2);
                                break;
                            } else {
                                f2.f243h = p2;
                                f2.f247l = z2;
                                f2.f251p = 1;
                                obj2 = p2.i(f2);
                                if (obj2 == aVar) {
                                }
                                int hashCode = obj2 != null ? obj2.hashCode() : 0;
                                k0 g5 = p2.g();
                                f2.f243h = p2;
                                f2.f244i = obj2;
                                f2.f247l = z2;
                                f2.f248m = hashCode;
                                f2.f251p = 2;
                                a2 = g5.a();
                                if (a2 != aVar) {
                                    int i5 = hashCode;
                                    p3 = p2;
                                    i3 = i5;
                                    obj = obj2;
                                    obj2 = a2;
                                    return new C0022d(obj, i3, ((Number) obj2).intValue());
                                }
                            }
                            return aVar;
                        case 1:
                            z2 = f2.f247l;
                            p2 = (P) f2.f243h;
                            AbstractC0086a.I(obj2);
                            if (obj2 != null) {
                            }
                            k0 g52 = p2.g();
                            f2.f243h = p2;
                            f2.f244i = obj2;
                            f2.f247l = z2;
                            f2.f248m = hashCode;
                            f2.f251p = 2;
                            a2 = g52.a();
                            if (a2 != aVar) {
                            }
                            return aVar;
                        case H.k.FLOAT_FIELD_NUMBER /* 2 */:
                            i3 = f2.f248m;
                            z2 = f2.f247l;
                            obj = f2.f244i;
                            p3 = (P) f2.f243h;
                            try {
                                AbstractC0086a.I(obj2);
                                return new C0022d(obj, i3, ((Number) obj2).intValue());
                            } catch (C0021c e2) {
                                e = e2;
                                p2 = p3;
                                P0.o oVar2 = new P0.o();
                                C0000a c0000a = p2.f289f;
                                f2.f243h = p2;
                                f2.f244i = e;
                                f2.f245j = oVar2;
                                f2.f246k = oVar2;
                                f2.f247l = z2;
                                f2.f251p = 5;
                                throw e;
                            }
                        case H.k.INTEGER_FIELD_NUMBER /* 3 */:
                            z2 = f2.f247l;
                            p2 = (P) f2.f243h;
                            AbstractC0086a.I(obj2);
                            int intValue2 = ((Number) obj2).intValue();
                            k0 g32 = p2.g();
                            G g42 = new G(p2, intValue2, null);
                            f2.f243h = p2;
                            f2.f247l = z2;
                            f2.f251p = 4;
                            obj2 = g32.c(g42, f2);
                            break;
                        case H.k.LONG_FIELD_NUMBER /* 4 */:
                            boolean z3 = f2.f247l;
                            AbstractC0086a.I(obj2);
                            return (C0022d) obj2;
                        case H.k.STRING_FIELD_NUMBER /* 5 */:
                            boolean z4 = f2.f247l;
                            P0.o oVar3 = f2.f246k;
                            P0.o oVar4 = (P0.o) f2.f245j;
                            C0021c c0021c2 = (C0021c) f2.f244i;
                            P p4 = (P) f2.f243h;
                            AbstractC0086a.I(obj2);
                            oVar3.f807e = obj2;
                            P0.n nVar2 = new P0.n();
                            try {
                                H h2 = new H(oVar4, p4, nVar2, (G0.d) null);
                                f2.f243h = c0021c2;
                                f2.f244i = oVar4;
                                f2.f245j = nVar2;
                                f2.f246k = null;
                                f2.f251p = 6;
                                if (z4) {
                                    p4.getClass();
                                    b2 = h2.j(f2);
                                } else {
                                    b2 = p4.g().b(new C0040w(h2, null), f2);
                                }
                                if (b2 != aVar) {
                                    nVar = nVar2;
                                    oVar = oVar4;
                                    Object obj3 = oVar.f807e;
                                    return new C0022d(obj3, obj3 != null ? obj3.hashCode() : 0, nVar.f806e);
                                }
                                return aVar;
                            } catch (Throwable th) {
                                th = th;
                                c0021c = c0021c2;
                                AbstractC0086a.c(c0021c, th);
                                throw c0021c;
                            }
                        case H.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            nVar = (P0.n) f2.f245j;
                            oVar = (P0.o) f2.f244i;
                            c0021c = (C0021c) f2.f243h;
                            try {
                                AbstractC0086a.I(obj2);
                                Object obj32 = oVar.f807e;
                                return new C0022d(obj32, obj32 != null ? obj32.hashCode() : 0, nVar.f806e);
                            } catch (Throwable th2) {
                                th = th2;
                                AbstractC0086a.c(c0021c, th);
                                throw c0021c;
                            }
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }
            switch (i2) {
            }
        } catch (C0021c e3) {
            e = e3;
        }
        f2 = new F(p2, bVar);
        Object obj22 = f2.f249n;
        i2 = f2.f251p;
        H0.a aVar2 = H0.a.f511e;
    }

    @Override // F.InterfaceC0027i
    public final Object f(O0.p pVar, I0.g gVar) {
        G0.i iVar = gVar.f527f;
        P0.h.b(iVar);
        p0 p0Var = (p0) iVar.m(o0.f416e);
        if (p0Var != null) {
            p0Var.c(this);
        }
        return AbstractC0081v.m(new p0(p0Var, this), new K(this, pVar, null), gVar);
    }

    public final k0 g() {
        return (k0) this.f298o.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
    
        if (r3.h(r0) != r4) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(I0.b bVar) {
        B b2;
        int i2;
        P p2;
        int intValue;
        int i3;
        Throwable th;
        P p3;
        try {
            if (bVar instanceof B) {
                b2 = (B) bVar;
                int i4 = b2.f228l;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    b2.f228l = i4 - Integer.MIN_VALUE;
                    Object obj = b2.f226j;
                    i2 = b2.f228l;
                    Object obj2 = H0.a.f511e;
                    if (i2 != 0) {
                        AbstractC0086a.I(obj);
                        k0 g2 = g();
                        b2.f224h = this;
                        b2.f228l = 1;
                        obj = g2.a();
                        if (obj != obj2) {
                            p2 = this;
                        }
                        return obj2;
                    }
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i3 = b2.f225i;
                        p3 = b2.f224h;
                        try {
                            AbstractC0086a.I(obj);
                            return D0.h.f206a;
                        } catch (Throwable th2) {
                            th = th2;
                            p3.f295l.D(new d0(th, i3));
                            throw th;
                        }
                    }
                    p2 = b2.f224h;
                    AbstractC0086a.I(obj);
                    intValue = ((Number) obj).intValue();
                    C0032n c0032n = p2.f296m;
                    b2.f224h = p2;
                    b2.f225i = intValue;
                    b2.f228l = 2;
                }
            }
            C0032n c0032n2 = p2.f296m;
            b2.f224h = p2;
            b2.f225i = intValue;
            b2.f228l = 2;
        } catch (Throwable th3) {
            P p4 = p2;
            i3 = intValue;
            th = th3;
            p3 = p4;
            p3.f295l.D(new d0(th, i3));
            throw th;
        }
        b2 = new B(this, bVar);
        Object obj3 = b2.f226j;
        i2 = b2.f228l;
        Object obj22 = H0.a.f511e;
        if (i2 != 0) {
        }
        intValue = ((Number) obj3).intValue();
    }

    public final Object i(I0.b bVar) {
        return ((Y) this.f297n.a()).a(new C0036s(3, (G0.d) null), bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(Object obj, boolean z2, I0.b bVar) {
        N n2;
        int i2;
        P0.n nVar;
        if (bVar instanceof N) {
            n2 = (N) bVar;
            int i3 = n2.f280k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                n2.f280k = i3 - Integer.MIN_VALUE;
                Object obj2 = n2.f278i;
                i2 = n2.f280k;
                if (i2 != 0) {
                    AbstractC0086a.I(obj2);
                    P0.n nVar2 = new P0.n();
                    Y y2 = (Y) this.f297n.a();
                    O o2 = new O(nVar2, this, obj, z2, null);
                    n2.f277h = nVar2;
                    n2.f280k = 1;
                    Object b2 = y2.b(o2, n2);
                    H0.a aVar = H0.a.f511e;
                    if (b2 == aVar) {
                        return aVar;
                    }
                    nVar = nVar2;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    nVar = n2.f277h;
                    AbstractC0086a.I(obj2);
                }
                return new Integer(nVar.f806e);
            }
        }
        n2 = new N(this, bVar);
        Object obj22 = n2.f278i;
        i2 = n2.f280k;
        if (i2 != 0) {
        }
        return new Integer(nVar.f806e);
    }

    @Override // F.InterfaceC0027i
    public final Z0.d u() {
        return this.f291h;
    }
}
