package h1;

import b0.C0339h;
import e2.InterfaceC0426e;
import java.util.List;
import o2.C0746a;
import o2.EnumC0748c;
import q2.AbstractC0814a;
import q2.AbstractC0837y;
import q2.C0827n;
import q2.C0829p;
import q2.EnumC0836x;
import q2.InterfaceC0826m;
import q2.InterfaceC0835w;
import q2.g0;
import q2.m0;
import s2.EnumC0967a;
import t2.AbstractC1035F;
import t2.C1034E;
import t2.C1038I;
import t2.C1042M;
import t2.C1050c;
import t2.C1070w;
import t2.C1073z;
import t2.InterfaceC1053f;

/* loaded from: classes.dex */
public final class M implements InterfaceC0490h {

    /* renamed from: d, reason: collision with root package name */
    public final j1.f f6092d;

    /* renamed from: e, reason: collision with root package name */
    public final A1.i f6093e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0835w f6094f;

    /* renamed from: g, reason: collision with root package name */
    public final C1073z f6095g;

    /* renamed from: h, reason: collision with root package name */
    public final H1.c f6096h;

    /* renamed from: i, reason: collision with root package name */
    public final C1050c f6097i;

    /* renamed from: j, reason: collision with root package name */
    public final B.Y f6098j;

    /* renamed from: k, reason: collision with root package name */
    public final G1.g f6099k;

    /* renamed from: l, reason: collision with root package name */
    public final R1.n f6100l;

    /* renamed from: m, reason: collision with root package name */
    public final R1.n f6101m;

    /* renamed from: n, reason: collision with root package name */
    public final G1.g f6102n;

    public M(j1.f fVar, List list, A1.i iVar, InterfaceC0835w interfaceC0835w) {
        int i3 = 0;
        int i4 = 1;
        this.f6092d = fVar;
        this.f6093e = iVar;
        this.f6094f = interfaceC0835w;
        H1.c cVar = new H1.c(new G(this, null));
        int i5 = C0746a.f7442g;
        int i6 = ((int) 0) & 1;
        C1042M c1042m = new C1042M((i6 != 1 || C0746a.c(0L)) ? C0746a.e(0L, EnumC0748c.MILLISECONDS) : 0L, (i6 != 1 || C0746a.c(0L)) ? C0746a.e(0L, EnumC0748c.MILLISECONDS) : 0L);
        C0339h g3 = AbstractC1035F.g(cVar, 0);
        C1034E a3 = AbstractC1035F.a(0, g3.f5414a, (EnumC0967a) g3.f5416c);
        m1.q qVar = AbstractC1035F.f8976a;
        InterfaceC1053f interfaceC1053f = (InterfaceC1053f) g3.f5415b;
        EnumC0836x enumC0836x = c1042m.equals(C1038I.f8985a) ? EnumC0836x.f7934d : EnumC0836x.f7937g;
        C1070w c1070w = new C1070w(c1042m, interfaceC1053f, a3, qVar, null);
        V1.i h3 = AbstractC0837y.h(interfaceC0835w.q(), (V1.i) g3.f5417d, true);
        x2.e eVar = q2.E.f7851a;
        if (h3 != eVar && h3.v(V1.e.f4557d) == null) {
            h3 = h3.d(eVar);
        }
        AbstractC0814a g0Var = enumC0836x == EnumC0836x.f7935e ? new g0(h3, c1070w) : new m0(h3, true);
        g0Var.k0(enumC0836x, g0Var, c1070w);
        this.f6095g = new C1073z(a3);
        this.f6096h = new H1.c(new C0504w(this, null));
        this.f6097i = new C1050c(new C0499q(this, null), V1.j.f4558d, -2, EnumC0967a.f8359d);
        this.f6098j = new B.Y(26);
        this.f6099k = new G1.g(this, list);
        this.f6100l = R1.a.d(new C0495m(this, i4));
        this.f6101m = R1.a.d(new C0495m(this, i3));
        this.f6102n = new G1.g(interfaceC0835w, new A0.l(19, this), new J(this, null));
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
    /* JADX WARN: Type inference failed for: r2v3, types: [X1.i, e2.e] */
    /* JADX WARN: Type inference failed for: r2v9, types: [X1.i, e2.e] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(M m3, O o3, X1.c cVar) {
        C0500s c0500s;
        W1.a aVar;
        int i3;
        InterfaceC0826m interfaceC0826m;
        C0827n c0827n;
        M m4;
        Object b3;
        InterfaceC0826m interfaceC0826m2;
        Throwable a3;
        X f3;
        m3.getClass();
        if (cVar instanceof C0500s) {
            c0500s = (C0500s) cVar;
            int i4 = c0500s.f6194l;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0500s.f6194l = i4 - Integer.MIN_VALUE;
                Object obj = c0500s.f6192j;
                aVar = W1.a.f4608d;
                i3 = c0500s.f6194l;
                boolean z3 = true;
                if (i3 == 0) {
                    try {
                        if (i3 == 1) {
                            interfaceC0826m = (InterfaceC0826m) c0500s.f6189g;
                        } else if (i3 == 2) {
                            C0827n c0827n2 = c0500s.f6191i;
                            M m5 = c0500s.f6190h;
                            O o4 = (O) c0500s.f6189g;
                            R1.a.e(obj);
                            c0827n = c0827n2;
                            m4 = m5;
                            o3 = o4;
                        } else {
                            if (i3 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            interfaceC0826m = (InterfaceC0826m) c0500s.f6189g;
                        }
                        R1.a.e(obj);
                        interfaceC0826m2 = interfaceC0826m;
                    } catch (Throwable th) {
                        th = th;
                        obj = R1.a.b(th);
                        interfaceC0826m2 = m3;
                        a3 = R1.l.a(obj);
                        C0827n c0827n3 = (C0827n) interfaceC0826m2;
                        if (a3 != null) {
                        }
                        return R1.y.f4171a;
                    }
                    a3 = R1.l.a(obj);
                    C0827n c0827n32 = (C0827n) interfaceC0826m2;
                    if (a3 != null) {
                        c0827n32.V(obj);
                    } else {
                        c0827n32.getClass();
                        c0827n32.V(new C0829p(a3, false));
                    }
                    return R1.y.f4171a;
                }
                R1.a.e(obj);
                c0827n = o3.f6105b;
                try {
                    f3 = m3.f6098j.f();
                } catch (Throwable th2) {
                    th = th2;
                    m3 = c0827n;
                    obj = R1.a.b(th);
                    interfaceC0826m2 = m3;
                    a3 = R1.l.a(obj);
                    C0827n c0827n322 = (C0827n) interfaceC0826m2;
                    if (a3 != null) {
                    }
                    return R1.y.f4171a;
                }
                if (f3 instanceof C0485c) {
                    ?? r22 = o3.f6104a;
                    V1.i iVar = o3.f6107d;
                    c0500s.f6189g = c0827n;
                    c0500s.f6194l = 1;
                    try {
                        b3 = m3.f().b(new C0480D(m3, iVar, (InterfaceC0426e) r22, (V1.d) null), c0500s);
                        if (b3 == aVar) {
                            return aVar;
                        }
                        C0827n c0827n4 = c0827n;
                        obj = b3;
                        interfaceC0826m2 = c0827n4;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        m3 = c0827n;
                        obj = R1.a.b(th);
                        interfaceC0826m2 = m3;
                        a3 = R1.l.a(obj);
                        C0827n c0827n3222 = (C0827n) interfaceC0826m2;
                        if (a3 != null) {
                        }
                        return R1.y.f4171a;
                    }
                    a3 = R1.l.a(obj);
                    C0827n c0827n32222 = (C0827n) interfaceC0826m2;
                    if (a3 != null) {
                    }
                    return R1.y.f4171a;
                }
                if (!(f3 instanceof P)) {
                    z3 = f3 instanceof Z;
                }
                if (!z3) {
                    if (f3 instanceof N) {
                        throw ((N) f3).f6103b;
                    }
                    throw new C1.c();
                }
                if (f3 != o3.f6106c) {
                    f2.j.d(f3, "null cannot be cast to non-null type androidx.datastore.core.ReadException<T of androidx.datastore.core.DataStoreImpl.handleUpdate$lambda$0>");
                    throw ((P) f3).f6108b;
                }
                c0500s.f6189g = o3;
                c0500s.f6190h = m3;
                c0500s.f6191i = c0827n;
                c0500s.f6194l = 2;
                Object g3 = m3.g(c0500s);
                m4 = m3;
                if (g3 == aVar) {
                    return aVar;
                }
                ?? r23 = o3.f6104a;
                V1.i iVar2 = o3.f6107d;
                c0500s.f6189g = c0827n;
                c0500s.f6190h = null;
                c0500s.f6191i = null;
                c0500s.f6194l = 3;
                b3 = m4.f().b(new C0480D(m4, iVar2, (InterfaceC0426e) r23, (V1.d) null), c0500s);
                if (b3 == aVar) {
                    return aVar;
                }
                C0827n c0827n42 = c0827n;
                obj = b3;
                interfaceC0826m2 = c0827n42;
                a3 = R1.l.a(obj);
                C0827n c0827n322222 = (C0827n) interfaceC0826m2;
                if (a3 != null) {
                }
                return R1.y.f4171a;
            }
        }
        c0500s = new C0500s(m3, cVar);
        Object obj2 = c0500s.f6192j;
        aVar = W1.a.f4608d;
        i3 = c0500s.f6194l;
        boolean z32 = true;
        if (i3 == 0) {
        }
        ?? r232 = o3.f6104a;
        V1.i iVar22 = o3.f6107d;
        c0500s.f6189g = c0827n;
        c0500s.f6190h = null;
        c0500s.f6191i = null;
        c0500s.f6194l = 3;
        b3 = m4.f().b(new C0480D(m4, iVar22, (InterfaceC0426e) r232, (V1.d) null), c0500s);
        if (b3 == aVar) {
        }
        C0827n c0827n422 = c0827n;
        obj2 = b3;
        interfaceC0826m2 = c0827n422;
        a3 = R1.l.a(obj2);
        C0827n c0827n3222222 = (C0827n) interfaceC0826m2;
        if (a3 != null) {
        }
        return R1.y.f4171a;
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
    public static final Object d(M m3, boolean z3, V1.d dVar) {
        C0506y c0506y;
        int i3;
        M m4;
        X x3;
        boolean z4;
        M m5;
        R1.i iVar;
        m3.getClass();
        if (dVar instanceof C0506y) {
            c0506y = (C0506y) dVar;
            int i4 = c0506y.f6215l;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0506y.f6215l = i4 - Integer.MIN_VALUE;
                Object obj = c0506y.f6213j;
                W1.a aVar = W1.a.f4608d;
                i3 = c0506y.f6215l;
                if (i3 != 0) {
                    R1.a.e(obj);
                    X f3 = m3.f6098j.f();
                    if (f3 instanceof Z) {
                        throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                    }
                    W f4 = m3.f();
                    c0506y.f6210g = m3;
                    c0506y.f6211h = f3;
                    c0506y.f6212i = z3;
                    c0506y.f6215l = 1;
                    Integer a3 = f4.a();
                    if (a3 == aVar) {
                        return aVar;
                    }
                    m4 = m3;
                    x3 = f3;
                    obj = a3;
                } else if (i3 == 1) {
                    z3 = c0506y.f6212i;
                    x3 = c0506y.f6211h;
                    m4 = c0506y.f6210g;
                    R1.a.e(obj);
                } else {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        m5 = c0506y.f6210g;
                        R1.a.e(obj);
                        iVar = (R1.i) obj;
                        X x4 = (X) iVar.f4150d;
                        if (((Boolean) iVar.f4151e).booleanValue()) {
                            return x4;
                        }
                        m5.f6098j.s(x4);
                        return x4;
                    }
                    m5 = c0506y.f6210g;
                    R1.a.e(obj);
                    iVar = (R1.i) obj;
                    X x42 = (X) iVar.f4150d;
                    if (((Boolean) iVar.f4151e).booleanValue()) {
                    }
                }
                int intValue = ((Number) obj).intValue();
                z4 = x3 instanceof C0485c;
                int i5 = !z4 ? x3.f6130a : -1;
                if (!z4 && intValue == i5) {
                    return x3;
                }
                if (z3) {
                    W f5 = m4.f();
                    C0477A c0477a = new C0477A(m4, i5, null);
                    c0506y.f6210g = m4;
                    c0506y.f6211h = null;
                    c0506y.f6215l = 3;
                    obj = f5.c(c0477a, c0506y);
                    if (obj == aVar) {
                        return aVar;
                    }
                    m5 = m4;
                    iVar = (R1.i) obj;
                    X x422 = (X) iVar.f4150d;
                    if (((Boolean) iVar.f4151e).booleanValue()) {
                    }
                } else {
                    W f6 = m4.f();
                    C0507z c0507z = new C0507z(m4, null);
                    c0506y.f6210g = m4;
                    c0506y.f6211h = null;
                    c0506y.f6215l = 2;
                    obj = f6.b(c0507z, c0506y);
                    if (obj == aVar) {
                        return aVar;
                    }
                    m5 = m4;
                    iVar = (R1.i) obj;
                    X x4222 = (X) iVar.f4150d;
                    if (((Boolean) iVar.f4151e).booleanValue()) {
                    }
                }
            }
        }
        c0506y = new C0506y(m3, dVar);
        Object obj2 = c0506y.f6213j;
        W1.a aVar2 = W1.a.f4608d;
        i3 = c0506y.f6215l;
        if (i3 != 0) {
        }
        int intValue2 = ((Number) obj2).intValue();
        z4 = x3 instanceof C0485c;
        if (!z4) {
        }
        if (!z4) {
        }
        if (z3) {
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
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ea A[Catch: b -> 0x00ab, TryCatch #0 {b -> 0x00ab, blocks: (B:36:0x00a6, B:37:0x0144, B:41:0x00b4, B:42:0x0127, B:58:0x00d1, B:60:0x00ea, B:61:0x00ee, B:67:0x00da, B:71:0x0115), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(M m3, boolean z3, X1.c cVar) {
        C0478B c0478b;
        Integer a3;
        Object obj;
        M m4;
        int i3;
        C0484b c0484b;
        Object b3;
        f2.s sVar;
        f2.u uVar;
        m3.getClass();
        try {
            if (cVar instanceof C0478B) {
                c0478b = (C0478B) cVar;
                int i4 = c0478b.f6054o;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    c0478b.f6054o = i4 - Integer.MIN_VALUE;
                    Object obj2 = c0478b.f6052m;
                    W1.a aVar = W1.a.f4608d;
                    switch (c0478b.f6054o) {
                        case 0:
                            R1.a.e(obj2);
                            if (!z3) {
                                W f3 = m3.f();
                                c0478b.f6046g = m3;
                                c0478b.f6050k = z3;
                                c0478b.f6054o = 3;
                                obj2 = f3.a();
                                if (obj2 == aVar) {
                                    return aVar;
                                }
                                int intValue = ((Number) obj2).intValue();
                                W f4 = m3.f();
                                C0479C c0479c = new C0479C(m3, intValue, null);
                                c0478b.f6046g = m3;
                                c0478b.f6050k = z3;
                                c0478b.f6054o = 4;
                                obj2 = f4.c(c0479c, c0478b);
                                if (obj2 == aVar) {
                                    return aVar;
                                }
                                return (C0485c) obj2;
                            }
                            c0478b.f6046g = m3;
                            c0478b.f6050k = z3;
                            c0478b.f6054o = 1;
                            obj2 = m3.h(c0478b);
                            if (obj2 == aVar) {
                                return aVar;
                            }
                            int hashCode = obj2 != null ? obj2.hashCode() : 0;
                            W f5 = m3.f();
                            c0478b.f6046g = m3;
                            c0478b.f6047h = obj2;
                            c0478b.f6050k = z3;
                            c0478b.f6051l = hashCode;
                            c0478b.f6054o = 2;
                            a3 = f5.a();
                            if (a3 != aVar) {
                                return aVar;
                            }
                            obj = obj2;
                            obj2 = a3;
                            m4 = m3;
                            i3 = hashCode;
                            return new C0485c(i3, ((Number) obj2).intValue(), obj);
                        case 1:
                            z3 = c0478b.f6050k;
                            m3 = (M) c0478b.f6046g;
                            R1.a.e(obj2);
                            if (obj2 != null) {
                            }
                            W f52 = m3.f();
                            c0478b.f6046g = m3;
                            c0478b.f6047h = obj2;
                            c0478b.f6050k = z3;
                            c0478b.f6051l = hashCode;
                            c0478b.f6054o = 2;
                            a3 = f52.a();
                            if (a3 != aVar) {
                            }
                            break;
                        case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                            i3 = c0478b.f6051l;
                            z3 = c0478b.f6050k;
                            obj = c0478b.f6047h;
                            m4 = (M) c0478b.f6046g;
                            try {
                                R1.a.e(obj2);
                                return new C0485c(i3, ((Number) obj2).intValue(), obj);
                            } catch (C0484b e3) {
                                e = e3;
                                m3 = m4;
                                f2.u uVar2 = new f2.u();
                                A1.i iVar = m3.f6093e;
                                c0478b.f6046g = m3;
                                c0478b.f6047h = e;
                                c0478b.f6048i = uVar2;
                                c0478b.f6049j = uVar2;
                                c0478b.f6050k = z3;
                                c0478b.f6054o = 5;
                                throw e;
                            }
                        case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                            z3 = c0478b.f6050k;
                            m3 = (M) c0478b.f6046g;
                            R1.a.e(obj2);
                            int intValue2 = ((Number) obj2).intValue();
                            W f42 = m3.f();
                            C0479C c0479c2 = new C0479C(m3, intValue2, null);
                            c0478b.f6046g = m3;
                            c0478b.f6050k = z3;
                            c0478b.f6054o = 4;
                            obj2 = f42.c(c0479c2, c0478b);
                            if (obj2 == aVar) {
                            }
                            return (C0485c) obj2;
                        case k1.i.LONG_FIELD_NUMBER /* 4 */:
                            boolean z4 = c0478b.f6050k;
                            R1.a.e(obj2);
                            return (C0485c) obj2;
                        case 5:
                            boolean z5 = c0478b.f6050k;
                            f2.u uVar3 = c0478b.f6049j;
                            f2.u uVar4 = (f2.u) c0478b.f6048i;
                            C0484b c0484b2 = (C0484b) c0478b.f6047h;
                            M m5 = (M) c0478b.f6046g;
                            R1.a.e(obj2);
                            uVar3.f5832d = obj2;
                            f2.s sVar2 = new f2.s();
                            try {
                                C0480D c0480d = new C0480D(uVar4, m5, sVar2, (V1.d) null);
                                c0478b.f6046g = c0484b2;
                                c0478b.f6047h = uVar4;
                                c0478b.f6048i = sVar2;
                                c0478b.f6049j = null;
                                c0478b.f6054o = 6;
                                if (z5) {
                                    m5.getClass();
                                    b3 = c0480d.n(c0478b);
                                } else {
                                    b3 = m5.f().b(new r(c0480d, null), c0478b);
                                }
                                if (b3 == aVar) {
                                    return aVar;
                                }
                                sVar = sVar2;
                                uVar = uVar4;
                                Object obj3 = uVar.f5832d;
                                return new C0485c(obj3 != null ? obj3.hashCode() : 0, sVar.f5830d, obj3);
                            } catch (Throwable th) {
                                th = th;
                                c0484b = c0484b2;
                                R1.a.a(c0484b, th);
                                throw c0484b;
                            }
                        case 6:
                            sVar = (f2.s) c0478b.f6048i;
                            uVar = (f2.u) c0478b.f6047h;
                            c0484b = (C0484b) c0478b.f6046g;
                            try {
                                R1.a.e(obj2);
                                Object obj32 = uVar.f5832d;
                                return new C0485c(obj32 != null ? obj32.hashCode() : 0, sVar.f5830d, obj32);
                            } catch (Throwable th2) {
                                th = th2;
                                R1.a.a(c0484b, th);
                                throw c0484b;
                            }
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }
            switch (c0478b.f6054o) {
            }
        } catch (C0484b e4) {
            e = e4;
        }
        c0478b = new C0478B(m3, cVar);
        Object obj22 = c0478b.f6052m;
        W1.a aVar2 = W1.a.f4608d;
    }

    @Override // h1.InterfaceC0490h
    public final Object a(InterfaceC0426e interfaceC0426e, X1.c cVar) {
        b0 b0Var = (b0) cVar.t().v(a0.f6134d);
        if (b0Var != null) {
            b0Var.c(this);
        }
        return AbstractC0837y.z(new b0(b0Var, this), new H(this, interfaceC0426e, null), cVar);
    }

    @Override // h1.InterfaceC0490h
    public final InterfaceC1053f b() {
        return this.f6097i;
    }

    public final W f() {
        return (W) this.f6101m.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(X1.c cVar) {
        C0505x c0505x;
        Object obj;
        int i3;
        M m3;
        int intValue;
        int i4;
        Throwable th;
        M m4;
        G1.g gVar;
        try {
            if (cVar instanceof C0505x) {
                c0505x = (C0505x) cVar;
                int i5 = c0505x.f6209k;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    c0505x.f6209k = i5 - Integer.MIN_VALUE;
                    Object obj2 = c0505x.f6207i;
                    obj = W1.a.f4608d;
                    i3 = c0505x.f6209k;
                    if (i3 != 0) {
                        R1.a.e(obj2);
                        W f3 = f();
                        c0505x.f6205g = this;
                        c0505x.f6209k = 1;
                        obj2 = f3.a();
                        if (obj2 == obj) {
                            return obj;
                        }
                        m3 = this;
                    } else {
                        if (i3 != 1) {
                            if (i3 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            i4 = c0505x.f6206h;
                            m4 = c0505x.f6205g;
                            try {
                                R1.a.e(obj2);
                                return R1.y.f4171a;
                            } catch (Throwable th2) {
                                th = th2;
                                m4.f6098j.s(new P(i4, th));
                                throw th;
                            }
                        }
                        m3 = c0505x.f6205g;
                        R1.a.e(obj2);
                    }
                    intValue = ((Number) obj2).intValue();
                    gVar = m3.f6099k;
                    c0505x.f6205g = m3;
                    c0505x.f6206h = intValue;
                    c0505x.f6209k = 2;
                    if (gVar.l(c0505x) == obj) {
                        return obj;
                    }
                    return R1.y.f4171a;
                }
            }
            gVar = m3.f6099k;
            c0505x.f6205g = m3;
            c0505x.f6206h = intValue;
            c0505x.f6209k = 2;
            if (gVar.l(c0505x) == obj) {
            }
            return R1.y.f4171a;
        } catch (Throwable th3) {
            i4 = intValue;
            th = th3;
            m4 = m3;
            m4.f6098j.s(new P(i4, th));
            throw th;
        }
        c0505x = new C0505x(this, cVar);
        Object obj22 = c0505x.f6207i;
        obj = W1.a.f4608d;
        i3 = c0505x.f6209k;
        if (i3 != 0) {
        }
        intValue = ((Number) obj22).intValue();
    }

    public final Object h(X1.c cVar) {
        return ((j1.i) this.f6100l.getValue()).a(new Y(3, null), cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(Object obj, boolean z3, X1.c cVar) {
        K k3;
        int i3;
        f2.s sVar;
        if (cVar instanceof K) {
            k3 = (K) cVar;
            int i4 = k3.f6084j;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                k3.f6084j = i4 - Integer.MIN_VALUE;
                Object obj2 = k3.f6082h;
                W1.a aVar = W1.a.f4608d;
                i3 = k3.f6084j;
                if (i3 != 0) {
                    R1.a.e(obj2);
                    f2.s sVar2 = new f2.s();
                    j1.i iVar = (j1.i) this.f6100l.getValue();
                    L l3 = new L(sVar2, this, obj, z3, null);
                    k3.f6081g = sVar2;
                    k3.f6084j = 1;
                    if (iVar.b(l3, k3) == aVar) {
                        return aVar;
                    }
                    sVar = sVar2;
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sVar = k3.f6081g;
                    R1.a.e(obj2);
                }
                return new Integer(sVar.f5830d);
            }
        }
        k3 = new K(this, cVar);
        Object obj22 = k3.f6082h;
        W1.a aVar2 = W1.a.f4608d;
        i3 = k3.f6084j;
        if (i3 != 0) {
        }
        return new Integer(sVar.f5830d);
    }
}
