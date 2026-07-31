package e1;

import F.C0047j0;
import b0.C0276i;
import g1.C0399f;
import g1.C0402i;
import h1.C0438i;
import i2.C0472a;
import i2.EnumC0474c;
import java.util.List;
import k2.AbstractC0529a;
import k2.AbstractC0552y;
import k2.C0542n;
import k2.C0544p;
import k2.EnumC0551x;
import k2.InterfaceC0541m;
import k2.InterfaceC0550w;
import k2.g0;
import k2.m0;
import m2.EnumC0626a;
import n2.AbstractC0682G;
import n2.C0677B;
import n2.C0681F;
import n2.C0685J;
import n2.C0689N;
import n2.C0697c;
import n2.C0717w;
import n2.C0720z;
import n2.InterfaceC0700f;

/* renamed from: e1.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0351N implements InterfaceC0359h {

    /* renamed from: a, reason: collision with root package name */
    public final C0399f f4639a;

    /* renamed from: b, reason: collision with root package name */
    public final F0.a f4640b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0550w f4641c;

    /* renamed from: d, reason: collision with root package name */
    public final C0720z f4642d;

    /* renamed from: e, reason: collision with root package name */
    public final C0677B f4643e;

    /* renamed from: f, reason: collision with root package name */
    public final C0697c f4644f;

    /* renamed from: g, reason: collision with root package name */
    public final A2.g f4645g;

    /* renamed from: h, reason: collision with root package name */
    public final A2.k f4646h;

    /* renamed from: i, reason: collision with root package name */
    public final L1.o f4647i;

    /* renamed from: j, reason: collision with root package name */
    public final L1.o f4648j;

    /* renamed from: k, reason: collision with root package name */
    public final A2.k f4649k;

    public C0351N(C0399f c0399f, List list, F0.a aVar, InterfaceC0550w interfaceC0550w) {
        int i3 = 0;
        int i4 = 1;
        this.f4639a = c0399f;
        this.f4640b = aVar;
        this.f4641c = interfaceC0550w;
        C0677B c0677b = new C0677B(new C0345H(this, null));
        int i5 = C0472a.f5118g;
        int i6 = ((int) 0) & 1;
        C0689N c0689n = new C0689N((i6 != 1 || C0472a.c(0L)) ? C0472a.e(0L, EnumC0474c.f5122f) : 0L, (i6 != 1 || C0472a.c(0L)) ? C0472a.e(0L, EnumC0474c.f5122f) : 0L);
        C0276i f3 = AbstractC0682G.f(c0677b, 0);
        C0681F a3 = AbstractC0682G.a(0, f3.f4272a, (EnumC0626a) f3.f4274c);
        j1.p pVar = AbstractC0682G.f6293a;
        InterfaceC0700f interfaceC0700f = (InterfaceC0700f) f3.f4273b;
        EnumC0551x enumC0551x = c0689n.equals(C0685J.f6302a) ? EnumC0551x.f5395d : EnumC0551x.f5398g;
        C0717w c0717w = new C0717w(c0689n, interfaceC0700f, a3, pVar, null);
        P1.i g3 = AbstractC0552y.g(interfaceC0550w.u(), (P1.i) f3.f4275d, true);
        r2.e eVar = k2.E.f5312a;
        if (g3 != eVar && g3.k(P1.e.f3072d) == null) {
            g3 = g3.o(eVar);
        }
        AbstractC0529a g0Var = enumC0551x == EnumC0551x.f5396e ? new g0(g3, c0717w) : new m0(g3, true);
        g0Var.g0(enumC0551x, g0Var, c0717w);
        this.f4642d = new C0720z(a3);
        this.f4643e = new C0677B(new C0373w(this, null));
        this.f4644f = new C0697c(new C0368q(this, null), P1.j.f3073d, -2, EnumC0626a.f5929d);
        this.f4645g = new A2.g(22);
        this.f4646h = new A2.k(this, list);
        this.f4647i = I2.d.F(new C0364m(this, i4));
        this.f4648j = I2.d.F(new C0364m(this, i3));
        this.f4649k = new A2.k(interfaceC0550w, new C0047j0(15, this), new C0348K(this, null));
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
    /* JADX WARN: Type inference failed for: r2v3, types: [R1.i, Y1.e] */
    /* JADX WARN: Type inference failed for: r2v9, types: [R1.i, Y1.e] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(C0351N c0351n, P p, R1.c cVar) {
        C0369s c0369s;
        Q1.a aVar;
        int i3;
        InterfaceC0541m interfaceC0541m;
        C0542n c0542n;
        C0351N c0351n2;
        Object b2;
        InterfaceC0541m interfaceC0541m2;
        Throwable a3;
        Y l3;
        c0351n.getClass();
        if (cVar instanceof C0369s) {
            c0369s = (C0369s) cVar;
            int i4 = c0369s.f4741i;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0369s.f4741i = i4 - Integer.MIN_VALUE;
                Object obj = c0369s.f4739g;
                aVar = Q1.a.f3113d;
                i3 = c0369s.f4741i;
                boolean z3 = true;
                if (i3 == 0) {
                    try {
                        if (i3 == 1) {
                            interfaceC0541m = (InterfaceC0541m) c0369s.f4736d;
                        } else if (i3 == 2) {
                            C0542n c0542n2 = c0369s.f4738f;
                            C0351N c0351n3 = c0369s.f4737e;
                            P p3 = (P) c0369s.f4736d;
                            I2.l.Q(obj);
                            c0542n = c0542n2;
                            c0351n2 = c0351n3;
                            p = p3;
                        } else {
                            if (i3 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            interfaceC0541m = (InterfaceC0541m) c0369s.f4736d;
                        }
                        I2.l.Q(obj);
                        interfaceC0541m2 = interfaceC0541m;
                    } catch (Throwable th) {
                        th = th;
                        obj = I2.l.t(th);
                        interfaceC0541m2 = c0351n;
                        a3 = L1.m.a(obj);
                        C0542n c0542n3 = (C0542n) interfaceC0541m2;
                        if (a3 != null) {
                        }
                        return L1.z.f2729a;
                    }
                    a3 = L1.m.a(obj);
                    C0542n c0542n32 = (C0542n) interfaceC0541m2;
                    if (a3 != null) {
                        c0542n32.R(obj);
                    } else {
                        c0542n32.getClass();
                        c0542n32.R(new C0544p(a3, false));
                    }
                    return L1.z.f2729a;
                }
                I2.l.Q(obj);
                c0542n = p.f4652b;
                try {
                    l3 = c0351n.f4645g.l();
                } catch (Throwable th2) {
                    th = th2;
                    c0351n = c0542n;
                    obj = I2.l.t(th);
                    interfaceC0541m2 = c0351n;
                    a3 = L1.m.a(obj);
                    C0542n c0542n322 = (C0542n) interfaceC0541m2;
                    if (a3 != null) {
                    }
                    return L1.z.f2729a;
                }
                if (l3 instanceof C0354c) {
                    ?? r22 = p.f4651a;
                    P1.i iVar = p.f4654d;
                    c0369s.f4736d = c0542n;
                    c0369s.f4741i = 1;
                    try {
                        b2 = c0351n.d().b(new C0344G(c0351n, iVar, r22, null), c0369s);
                        if (b2 == aVar) {
                            return aVar;
                        }
                        C0542n c0542n4 = c0542n;
                        obj = b2;
                        interfaceC0541m2 = c0542n4;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        c0351n = c0542n;
                        obj = I2.l.t(th);
                        interfaceC0541m2 = c0351n;
                        a3 = L1.m.a(obj);
                        C0542n c0542n3222 = (C0542n) interfaceC0541m2;
                        if (a3 != null) {
                        }
                        return L1.z.f2729a;
                    }
                    a3 = L1.m.a(obj);
                    C0542n c0542n32222 = (C0542n) interfaceC0541m2;
                    if (a3 != null) {
                    }
                    return L1.z.f2729a;
                }
                if (!(l3 instanceof Q)) {
                    z3 = l3 instanceof a0;
                }
                if (!z3) {
                    if (l3 instanceof O) {
                        throw ((O) l3).f4650b;
                    }
                    throw new L1.f();
                }
                if (l3 != p.f4653c) {
                    Z1.i.d(l3, "null cannot be cast to non-null type androidx.datastore.core.ReadException<T of androidx.datastore.core.DataStoreImpl.handleUpdate$lambda$0>");
                    throw ((Q) l3).f4655b;
                }
                c0369s.f4736d = p;
                c0369s.f4737e = c0351n;
                c0369s.f4738f = c0542n;
                c0369s.f4741i = 2;
                Object e3 = c0351n.e(c0369s);
                c0351n2 = c0351n;
                if (e3 == aVar) {
                    return aVar;
                }
                ?? r23 = p.f4651a;
                P1.i iVar2 = p.f4654d;
                c0369s.f4736d = c0542n;
                c0369s.f4737e = null;
                c0369s.f4738f = null;
                c0369s.f4741i = 3;
                b2 = c0351n2.d().b(new C0344G(c0351n2, iVar2, r23, null), c0369s);
                if (b2 == aVar) {
                    return aVar;
                }
                C0542n c0542n42 = c0542n;
                obj = b2;
                interfaceC0541m2 = c0542n42;
                a3 = L1.m.a(obj);
                C0542n c0542n322222 = (C0542n) interfaceC0541m2;
                if (a3 != null) {
                }
                return L1.z.f2729a;
            }
        }
        c0369s = new C0369s(c0351n, cVar);
        Object obj2 = c0369s.f4739g;
        aVar = Q1.a.f3113d;
        i3 = c0369s.f4741i;
        boolean z32 = true;
        if (i3 == 0) {
        }
        ?? r232 = p.f4651a;
        P1.i iVar22 = p.f4654d;
        c0369s.f4736d = c0542n;
        c0369s.f4737e = null;
        c0369s.f4738f = null;
        c0369s.f4741i = 3;
        b2 = c0351n2.d().b(new C0344G(c0351n2, iVar22, r232, null), c0369s);
        if (b2 == aVar) {
        }
        C0542n c0542n422 = c0542n;
        obj2 = b2;
        interfaceC0541m2 = c0542n422;
        a3 = L1.m.a(obj2);
        C0542n c0542n3222222 = (C0542n) interfaceC0541m2;
        if (a3 != null) {
        }
        return L1.z.f2729a;
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
    public static final Object b(C0351N c0351n, boolean z3, P1.d dVar) {
        C0375y c0375y;
        int i3;
        C0351N c0351n2;
        Y y3;
        boolean z4;
        C0351N c0351n3;
        L1.j jVar;
        c0351n.getClass();
        if (dVar instanceof C0375y) {
            c0375y = (C0375y) dVar;
            int i4 = c0375y.f4762i;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0375y.f4762i = i4 - Integer.MIN_VALUE;
                Object obj = c0375y.f4760g;
                Q1.a aVar = Q1.a.f3113d;
                i3 = c0375y.f4762i;
                if (i3 != 0) {
                    I2.l.Q(obj);
                    Y l3 = c0351n.f4645g.l();
                    if (l3 instanceof a0) {
                        throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                    }
                    X d3 = c0351n.d();
                    c0375y.f4757d = c0351n;
                    c0375y.f4758e = l3;
                    c0375y.f4759f = z3;
                    c0375y.f4762i = 1;
                    Integer a3 = d3.a();
                    if (a3 == aVar) {
                        return aVar;
                    }
                    c0351n2 = c0351n;
                    y3 = l3;
                    obj = a3;
                } else if (i3 == 1) {
                    z3 = c0375y.f4759f;
                    y3 = c0375y.f4758e;
                    c0351n2 = c0375y.f4757d;
                    I2.l.Q(obj);
                } else {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c0351n3 = c0375y.f4757d;
                        I2.l.Q(obj);
                        jVar = (L1.j) obj;
                        Y y4 = (Y) jVar.f2708d;
                        if (((Boolean) jVar.f2709e).booleanValue()) {
                            return y4;
                        }
                        c0351n3.f4645g.v(y4);
                        return y4;
                    }
                    c0351n3 = c0375y.f4757d;
                    I2.l.Q(obj);
                    jVar = (L1.j) obj;
                    Y y42 = (Y) jVar.f2708d;
                    if (((Boolean) jVar.f2709e).booleanValue()) {
                    }
                }
                int intValue = ((Number) obj).intValue();
                z4 = y3 instanceof C0354c;
                int i5 = !z4 ? y3.f4677a : -1;
                if (!z4 && intValue == i5) {
                    return y3;
                }
                if (z3) {
                    X d4 = c0351n2.d();
                    C0338A c0338a = new C0338A(c0351n2, i5, null);
                    c0375y.f4757d = c0351n2;
                    c0375y.f4758e = null;
                    c0375y.f4762i = 3;
                    obj = d4.c(c0338a, c0375y);
                    if (obj == aVar) {
                        return aVar;
                    }
                    c0351n3 = c0351n2;
                    jVar = (L1.j) obj;
                    Y y422 = (Y) jVar.f2708d;
                    if (((Boolean) jVar.f2709e).booleanValue()) {
                    }
                } else {
                    X d5 = c0351n2.d();
                    C0376z c0376z = new C0376z(c0351n2, null);
                    c0375y.f4757d = c0351n2;
                    c0375y.f4758e = null;
                    c0375y.f4762i = 2;
                    obj = d5.b(c0376z, c0375y);
                    if (obj == aVar) {
                        return aVar;
                    }
                    c0351n3 = c0351n2;
                    jVar = (L1.j) obj;
                    Y y4222 = (Y) jVar.f2708d;
                    if (((Boolean) jVar.f2709e).booleanValue()) {
                    }
                }
            }
        }
        c0375y = new C0375y(c0351n, dVar);
        Object obj2 = c0375y.f4760g;
        Q1.a aVar2 = Q1.a.f3113d;
        i3 = c0375y.f4762i;
        if (i3 != 0) {
        }
        int intValue2 = ((Number) obj2).intValue();
        z4 = y3 instanceof C0354c;
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
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ea A[Catch: b -> 0x00ab, TryCatch #1 {b -> 0x00ab, blocks: (B:36:0x00a6, B:37:0x0144, B:41:0x00b4, B:42:0x0127, B:58:0x00d1, B:60:0x00ea, B:61:0x00ee, B:67:0x00da, B:71:0x0115), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(C0351N c0351n, boolean z3, R1.c cVar) {
        C0339B c0339b;
        Integer a3;
        Object obj;
        C0351N c0351n2;
        int i3;
        C0353b c0353b;
        Object b2;
        Z1.r rVar;
        Z1.t tVar;
        c0351n.getClass();
        try {
            if (cVar instanceof C0339B) {
                c0339b = (C0339B) cVar;
                int i4 = c0339b.f4597l;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    c0339b.f4597l = i4 - Integer.MIN_VALUE;
                    Object obj2 = c0339b.f4595j;
                    Q1.a aVar = Q1.a.f3113d;
                    switch (c0339b.f4597l) {
                        case 0:
                            I2.l.Q(obj2);
                            if (!z3) {
                                X d3 = c0351n.d();
                                c0339b.f4589d = c0351n;
                                c0339b.f4593h = z3;
                                c0339b.f4597l = 3;
                                obj2 = d3.a();
                                if (obj2 == aVar) {
                                    return aVar;
                                }
                                int intValue = ((Number) obj2).intValue();
                                X d4 = c0351n.d();
                                C0340C c0340c = new C0340C(c0351n, intValue, null);
                                c0339b.f4589d = c0351n;
                                c0339b.f4593h = z3;
                                c0339b.f4597l = 4;
                                obj2 = d4.c(c0340c, c0339b);
                                if (obj2 == aVar) {
                                    return aVar;
                                }
                                return (C0354c) obj2;
                            }
                            c0339b.f4589d = c0351n;
                            c0339b.f4593h = z3;
                            c0339b.f4597l = 1;
                            obj2 = c0351n.f(c0339b);
                            if (obj2 == aVar) {
                                return aVar;
                            }
                            int hashCode = obj2 != null ? obj2.hashCode() : 0;
                            X d5 = c0351n.d();
                            c0339b.f4589d = c0351n;
                            c0339b.f4590e = obj2;
                            c0339b.f4593h = z3;
                            c0339b.f4594i = hashCode;
                            c0339b.f4597l = 2;
                            a3 = d5.a();
                            if (a3 != aVar) {
                                return aVar;
                            }
                            obj = obj2;
                            obj2 = a3;
                            c0351n2 = c0351n;
                            i3 = hashCode;
                            return new C0354c(obj, i3, ((Number) obj2).intValue());
                        case 1:
                            z3 = c0339b.f4593h;
                            c0351n = (C0351N) c0339b.f4589d;
                            I2.l.Q(obj2);
                            if (obj2 != null) {
                            }
                            X d52 = c0351n.d();
                            c0339b.f4589d = c0351n;
                            c0339b.f4590e = obj2;
                            c0339b.f4593h = z3;
                            c0339b.f4594i = hashCode;
                            c0339b.f4597l = 2;
                            a3 = d52.a();
                            if (a3 != aVar) {
                            }
                            break;
                        case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                            i3 = c0339b.f4594i;
                            z3 = c0339b.f4593h;
                            obj = c0339b.f4590e;
                            c0351n2 = (C0351N) c0339b.f4589d;
                            try {
                                I2.l.Q(obj2);
                                return new C0354c(obj, i3, ((Number) obj2).intValue());
                            } catch (C0353b e3) {
                                e = e3;
                                c0351n = c0351n2;
                                Z1.t tVar2 = new Z1.t();
                                F0.a aVar2 = c0351n.f4640b;
                                c0339b.f4589d = c0351n;
                                c0339b.f4590e = e;
                                c0339b.f4591f = tVar2;
                                c0339b.f4592g = tVar2;
                                c0339b.f4593h = z3;
                                c0339b.f4597l = 5;
                                throw e;
                            }
                        case C0438i.INTEGER_FIELD_NUMBER /* 3 */:
                            z3 = c0339b.f4593h;
                            c0351n = (C0351N) c0339b.f4589d;
                            I2.l.Q(obj2);
                            int intValue2 = ((Number) obj2).intValue();
                            X d42 = c0351n.d();
                            C0340C c0340c2 = new C0340C(c0351n, intValue2, null);
                            c0339b.f4589d = c0351n;
                            c0339b.f4593h = z3;
                            c0339b.f4597l = 4;
                            obj2 = d42.c(c0340c2, c0339b);
                            if (obj2 == aVar) {
                            }
                            return (C0354c) obj2;
                        case C0438i.LONG_FIELD_NUMBER /* 4 */:
                            boolean z4 = c0339b.f4593h;
                            I2.l.Q(obj2);
                            return (C0354c) obj2;
                        case 5:
                            boolean z5 = c0339b.f4593h;
                            Z1.t tVar3 = c0339b.f4592g;
                            Z1.t tVar4 = (Z1.t) c0339b.f4591f;
                            C0353b c0353b2 = (C0353b) c0339b.f4590e;
                            C0351N c0351n3 = (C0351N) c0339b.f4589d;
                            I2.l.Q(obj2);
                            tVar3.f3480d = obj2;
                            Z1.r rVar2 = new Z1.r();
                            try {
                                C0341D c0341d = new C0341D(tVar4, c0351n3, rVar2, null);
                                c0339b.f4589d = c0353b2;
                                c0339b.f4590e = tVar4;
                                c0339b.f4591f = rVar2;
                                c0339b.f4592g = null;
                                c0339b.f4597l = 6;
                                if (z5) {
                                    c0351n3.getClass();
                                    b2 = c0341d.j(c0339b);
                                } else {
                                    b2 = c0351n3.d().b(new r(c0341d, null), c0339b);
                                }
                                if (b2 == aVar) {
                                    return aVar;
                                }
                                rVar = rVar2;
                                tVar = tVar4;
                                Object obj3 = tVar.f3480d;
                                return new C0354c(obj3, obj3 != null ? obj3.hashCode() : 0, rVar.f3478d);
                            } catch (Throwable th) {
                                th = th;
                                c0353b = c0353b2;
                                M1.B.o(c0353b, th);
                                throw c0353b;
                            }
                        case 6:
                            rVar = (Z1.r) c0339b.f4591f;
                            tVar = (Z1.t) c0339b.f4590e;
                            c0353b = (C0353b) c0339b.f4589d;
                            try {
                                I2.l.Q(obj2);
                                Object obj32 = tVar.f3480d;
                                return new C0354c(obj32, obj32 != null ? obj32.hashCode() : 0, rVar.f3478d);
                            } catch (Throwable th2) {
                                th = th2;
                                M1.B.o(c0353b, th);
                                throw c0353b;
                            }
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }
            switch (c0339b.f4597l) {
            }
        } catch (C0353b e4) {
            e = e4;
        }
        c0339b = new C0339B(c0351n, cVar);
        Object obj22 = c0339b.f4595j;
        Q1.a aVar3 = Q1.a.f3113d;
    }

    public final X d() {
        return (X) this.f4648j.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(R1.c cVar) {
        C0374x c0374x;
        Object obj;
        int i3;
        C0351N c0351n;
        int intValue;
        int i4;
        Throwable th;
        C0351N c0351n2;
        A2.k kVar;
        try {
            if (cVar instanceof C0374x) {
                c0374x = (C0374x) cVar;
                int i5 = c0374x.f4756h;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    c0374x.f4756h = i5 - Integer.MIN_VALUE;
                    Object obj2 = c0374x.f4754f;
                    obj = Q1.a.f3113d;
                    i3 = c0374x.f4756h;
                    if (i3 != 0) {
                        I2.l.Q(obj2);
                        X d3 = d();
                        c0374x.f4752d = this;
                        c0374x.f4756h = 1;
                        obj2 = d3.a();
                        if (obj2 == obj) {
                            return obj;
                        }
                        c0351n = this;
                    } else {
                        if (i3 != 1) {
                            if (i3 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            i4 = c0374x.f4753e;
                            c0351n2 = c0374x.f4752d;
                            try {
                                I2.l.Q(obj2);
                                return L1.z.f2729a;
                            } catch (Throwable th2) {
                                th = th2;
                                c0351n2.f4645g.v(new Q(i4, th));
                                throw th;
                            }
                        }
                        c0351n = c0374x.f4752d;
                        I2.l.Q(obj2);
                    }
                    intValue = ((Number) obj2).intValue();
                    kVar = c0351n.f4646h;
                    c0374x.f4752d = c0351n;
                    c0374x.f4753e = intValue;
                    c0374x.f4756h = 2;
                    if (kVar.l(c0374x) == obj) {
                        return obj;
                    }
                    return L1.z.f2729a;
                }
            }
            kVar = c0351n.f4646h;
            c0374x.f4752d = c0351n;
            c0374x.f4753e = intValue;
            c0374x.f4756h = 2;
            if (kVar.l(c0374x) == obj) {
            }
            return L1.z.f2729a;
        } catch (Throwable th3) {
            i4 = intValue;
            th = th3;
            c0351n2 = c0351n;
            c0351n2.f4645g.v(new Q(i4, th));
            throw th;
        }
        c0374x = new C0374x(this, cVar);
        Object obj22 = c0374x.f4754f;
        obj = Q1.a.f3113d;
        i3 = c0374x.f4756h;
        if (i3 != 0) {
        }
        intValue = ((Number) obj22).intValue();
    }

    public final Object f(R1.c cVar) {
        return ((C0402i) this.f4647i.getValue()).a(new Z(3, null), cVar);
    }

    @Override // e1.InterfaceC0359h
    public final InterfaceC0700f g() {
        return this.f4644f;
    }

    @Override // e1.InterfaceC0359h
    public final Object h(Y1.e eVar, R1.c cVar) {
        c0 c0Var = (c0) cVar.getContext().k(b0.f4681d);
        if (c0Var != null) {
            c0Var.c(this);
        }
        return AbstractC0552y.y(new c0(c0Var, this), new C0346I(this, eVar, null), cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(Object obj, boolean z3, R1.c cVar) {
        C0349L c0349l;
        int i3;
        Z1.r rVar;
        if (cVar instanceof C0349L) {
            c0349l = (C0349L) cVar;
            int i4 = c0349l.f4631g;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0349l.f4631g = i4 - Integer.MIN_VALUE;
                Object obj2 = c0349l.f4629e;
                Q1.a aVar = Q1.a.f3113d;
                i3 = c0349l.f4631g;
                if (i3 != 0) {
                    I2.l.Q(obj2);
                    Z1.r rVar2 = new Z1.r();
                    C0402i c0402i = (C0402i) this.f4647i.getValue();
                    C0350M c0350m = new C0350M(rVar2, this, obj, z3, null);
                    c0349l.f4628d = rVar2;
                    c0349l.f4631g = 1;
                    if (c0402i.b(c0350m, c0349l) == aVar) {
                        return aVar;
                    }
                    rVar = rVar2;
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    rVar = c0349l.f4628d;
                    I2.l.Q(obj2);
                }
                return new Integer(rVar.f3478d);
            }
        }
        c0349l = new C0349L(this, cVar);
        Object obj22 = c0349l.f4629e;
        Q1.a aVar2 = Q1.a.f3113d;
        i3 = c0349l.f4631g;
        if (i3 != 0) {
        }
        return new Integer(rVar.f3478d);
    }
}
