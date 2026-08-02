package K;

import c3.C0292d;
import c3.C0294f;
import c3.C0295g;
import c3.C0297i;
import f3.InterfaceC0425c;
import f3.InterfaceC0430h;
import g3.EnumC0441a;
import java.util.List;
import x3.AbstractC1562w;
import x3.C1552l;
import x3.C1554n;
import x3.InterfaceC1551k;
import x3.InterfaceC1560u;

/* loaded from: classes.dex */
public final class M implements InterfaceC0059h {

    /* renamed from: a, reason: collision with root package name */
    public final Q f1273a;

    /* renamed from: b, reason: collision with root package name */
    public final a2.i f1274b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1560u f1275c;

    /* renamed from: f, reason: collision with root package name */
    public int f1278f;

    /* renamed from: g, reason: collision with root package name */
    public x3.i0 f1279g;

    /* renamed from: i, reason: collision with root package name */
    public final G1.c f1281i;

    /* renamed from: l, reason: collision with root package name */
    public final G1.c f1284l;

    /* renamed from: d, reason: collision with root package name */
    public final A3.t f1276d = new A3.t(new C0069s(this, null));

    /* renamed from: e, reason: collision with root package name */
    public final F3.d f1277e = new F3.d();

    /* renamed from: h, reason: collision with root package name */
    public final t1.h f1280h = new t1.h(9);

    /* renamed from: j, reason: collision with root package name */
    public final C0295g f1282j = new C0295g(new C0064m(this, 1));

    /* renamed from: k, reason: collision with root package name */
    public final C0295g f1283k = new C0295g(new C0064m(this, 0));

    public M(Q q4, List list, a2.i iVar, InterfaceC1560u interfaceC1560u) {
        this.f1273a = q4;
        this.f1274b = iVar;
        this.f1275c = interfaceC1560u;
        this.f1281i = new G1.c(this, list);
        this.f1284l = new G1.c(interfaceC1560u, new F3.g(1, this), new J(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0050 A[Catch: all -> 0x0058, TryCatch #0 {all -> 0x0058, blocks: (B:12:0x0048, B:14:0x0050, B:16:0x0054, B:17:0x005a), top: B:11:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(M m4, h3.c cVar) {
        C0070t c0070t;
        int i4;
        F3.d dVar;
        int i5;
        try {
            if (cVar instanceof C0070t) {
                c0070t = (C0070t) cVar;
                int i6 = c0070t.f1417e;
                if ((i6 & Integer.MIN_VALUE) != 0) {
                    c0070t.f1417e = i6 - Integer.MIN_VALUE;
                    Object obj = c0070t.f1415c;
                    EnumC0441a enumC0441a = EnumC0441a.f9038a;
                    i4 = c0070t.f1417e;
                    if (i4 != 0) {
                        O3.l.w(obj);
                        dVar = m4.f1277e;
                        c0070t.f1413a = m4;
                        c0070t.f1414b = dVar;
                        c0070t.f1417e = 1;
                        if (dVar.c(c0070t) == enumC0441a) {
                            return enumC0441a;
                        }
                    } else {
                        if (i4 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        F3.d dVar2 = c0070t.f1414b;
                        M m5 = c0070t.f1413a;
                        O3.l.w(obj);
                        dVar = dVar2;
                        m4 = m5;
                    }
                    i5 = m4.f1278f - 1;
                    m4.f1278f = i5;
                    if (i5 == 0) {
                        x3.i0 i0Var = m4.f1279g;
                        if (i0Var != null) {
                            i0Var.b(null);
                        }
                        m4.f1279g = null;
                    }
                    dVar.e(null);
                    return C0297i.f5732a;
                }
            }
            i5 = m4.f1278f - 1;
            m4.f1278f = i5;
            if (i5 == 0) {
            }
            dVar.e(null);
            return C0297i.f5732a;
        } catch (Throwable th) {
            dVar.e(null);
            throw th;
        }
        c0070t = new C0070t(m4, cVar);
        Object obj2 = c0070t.f1415c;
        EnumC0441a enumC0441a2 = EnumC0441a.f9038a;
        i4 = c0070t.f1417e;
        if (i4 != 0) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|(7:55|(1:(1:(1:59)(2:61|62))(3:63|64|65))(1:66)|60|17|(1:19)(1:23)|20|21)(5:8|9|10|(3:12|13|14)(3:30|(1:32)(1:53)|(2:34|(2:36|(1:38))(2:45|46))(2:47|(2:49|50)(2:51|52)))|24)|39|40|41))|68|6|(0)(0)|39|40|41|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0076, code lost:
    
        if (r9 == r1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0079, code lost:
    
        r8 = r11;
        r11 = r9;
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ba, code lost:
    
        if (r9 != r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bd, code lost:
    
        r9 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0024 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0052  */
    /* JADX WARN: Type inference failed for: r2v3, types: [h3.g, o3.p] */
    /* JADX WARN: Type inference failed for: r2v9, types: [h3.g, o3.p] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(M m4, Y y4, h3.c cVar) {
        C0072v c0072v;
        int i4;
        InterfaceC1551k interfaceC1551k;
        C1552l c1552l;
        M m5;
        Object b4;
        InterfaceC1551k interfaceC1551k2;
        Throwable a3;
        if (cVar instanceof C0072v) {
            c0072v = (C0072v) cVar;
            int i5 = c0072v.f1425f;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c0072v.f1425f = i5 - Integer.MIN_VALUE;
                Object obj = c0072v.f1423d;
                EnumC0441a enumC0441a = EnumC0441a.f9038a;
                i4 = c0072v.f1425f;
                boolean z = true;
                if (i4 == 0) {
                    try {
                        if (i4 == 1) {
                            interfaceC1551k = (InterfaceC1551k) c0072v.f1420a;
                        } else if (i4 == 2) {
                            C1552l c1552l2 = c0072v.f1422c;
                            M m6 = c0072v.f1421b;
                            Y y5 = (Y) c0072v.f1420a;
                            O3.l.w(obj);
                            c1552l = c1552l2;
                            m5 = m6;
                            y4 = y5;
                        } else {
                            if (i4 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            interfaceC1551k = (InterfaceC1551k) c0072v.f1420a;
                        }
                        O3.l.w(obj);
                        interfaceC1551k2 = interfaceC1551k;
                    } catch (Throwable th) {
                        th = th;
                        obj = O3.l.h(th);
                        interfaceC1551k2 = m4;
                        a3 = C0294f.a(obj);
                        C1552l c1552l3 = (C1552l) interfaceC1551k2;
                        if (a3 == null) {
                        }
                        return C0297i.f5732a;
                    }
                    a3 = C0294f.a(obj);
                    C1552l c1552l32 = (C1552l) interfaceC1551k2;
                    if (a3 == null) {
                        c1552l32.G(obj);
                    } else {
                        c1552l32.getClass();
                        c1552l32.G(new C1554n(a3, false));
                    }
                    return C0297i.f5732a;
                }
                O3.l.w(obj);
                c1552l = y4.f1322b;
                try {
                    h0 j4 = m4.f1280h.j();
                    if (j4 instanceof C0054c) {
                        ?? r22 = y4.f1321a;
                        InterfaceC0430h interfaceC0430h = y4.f1324d;
                        c0072v.f1420a = c1552l;
                        c0072v.f1425f = 1;
                        try {
                            b4 = m4.g().b(new H(m4, interfaceC0430h, r22, null), c0072v);
                        } catch (Throwable th2) {
                            th = th2;
                            th = th;
                            m4 = c1552l;
                            obj = O3.l.h(th);
                            interfaceC1551k2 = m4;
                            a3 = C0294f.a(obj);
                            C1552l c1552l322 = (C1552l) interfaceC1551k2;
                            if (a3 == null) {
                            }
                            return C0297i.f5732a;
                        }
                    } else {
                        if (!(j4 instanceof Z)) {
                            z = j4 instanceof i0;
                        }
                        if (!z) {
                            if (j4 instanceof X) {
                                throw ((X) j4).f1320b;
                            }
                            throw new G1.a();
                        }
                        if (j4 != y4.f1323c) {
                            kotlin.jvm.internal.i.c(j4, "null cannot be cast to non-null type androidx.datastore.core.ReadException<T of androidx.datastore.core.DataStoreImpl.handleUpdate$lambda$2>");
                            throw ((Z) j4).f1325b;
                        }
                        c0072v.f1420a = y4;
                        c0072v.f1421b = m4;
                        c0072v.f1422c = c1552l;
                        c0072v.f1425f = 2;
                        Object h2 = m4.h(c0072v);
                        m5 = m4;
                        if (h2 == enumC0441a) {
                        }
                    }
                    return enumC0441a;
                } catch (Throwable th3) {
                    th = th3;
                    m4 = c1552l;
                    obj = O3.l.h(th);
                    interfaceC1551k2 = m4;
                    a3 = C0294f.a(obj);
                    C1552l c1552l3222 = (C1552l) interfaceC1551k2;
                    if (a3 == null) {
                    }
                    return C0297i.f5732a;
                }
                ?? r23 = y4.f1321a;
                InterfaceC0430h interfaceC0430h2 = y4.f1324d;
                c0072v.f1420a = c1552l;
                c0072v.f1421b = null;
                c0072v.f1422c = null;
                c0072v.f1425f = 3;
                b4 = m5.g().b(new H(m5, interfaceC0430h2, r23, null), c0072v);
            }
        }
        c0072v = new C0072v(m4, cVar);
        Object obj2 = c0072v.f1423d;
        EnumC0441a enumC0441a2 = EnumC0441a.f9038a;
        i4 = c0072v.f1425f;
        boolean z4 = true;
        if (i4 == 0) {
        }
        ?? r232 = y4.f1321a;
        InterfaceC0430h interfaceC0430h22 = y4.f1324d;
        c0072v.f1420a = c1552l;
        c0072v.f1421b = null;
        c0072v.f1422c = null;
        c0072v.f1425f = 3;
        b4 = m5.g().b(new H(m5, interfaceC0430h22, r232, null), c0072v);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004f A[Catch: all -> 0x005e, TRY_LEAVE, TryCatch #0 {all -> 0x005e, blocks: (B:12:0x0048, B:14:0x004f), top: B:11:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(M m4, h3.c cVar) {
        C0073w c0073w;
        int i4;
        F3.d dVar;
        int i5;
        try {
            if (cVar instanceof C0073w) {
                c0073w = (C0073w) cVar;
                int i6 = c0073w.f1430e;
                if ((i6 & Integer.MIN_VALUE) != 0) {
                    c0073w.f1430e = i6 - Integer.MIN_VALUE;
                    Object obj = c0073w.f1428c;
                    EnumC0441a enumC0441a = EnumC0441a.f9038a;
                    i4 = c0073w.f1430e;
                    if (i4 != 0) {
                        O3.l.w(obj);
                        dVar = m4.f1277e;
                        c0073w.f1426a = m4;
                        c0073w.f1427b = dVar;
                        c0073w.f1430e = 1;
                        if (dVar.c(c0073w) == enumC0441a) {
                            return enumC0441a;
                        }
                    } else {
                        if (i4 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        F3.d dVar2 = c0073w.f1427b;
                        M m5 = c0073w.f1426a;
                        O3.l.w(obj);
                        dVar = dVar2;
                        m4 = m5;
                    }
                    i5 = m4.f1278f + 1;
                    m4.f1278f = i5;
                    if (i5 == 1) {
                        m4.f1279g = AbstractC1562w.g(m4.f1275c, null, new C0074x(m4, null), 3);
                    }
                    dVar.e(null);
                    return C0297i.f5732a;
                }
            }
            i5 = m4.f1278f + 1;
            m4.f1278f = i5;
            if (i5 == 1) {
            }
            dVar.e(null);
            return C0297i.f5732a;
        } catch (Throwable th) {
            dVar.e(null);
            throw th;
        }
        c0073w = new C0073w(m4, cVar);
        Object obj2 = c0073w.f1428c;
        EnumC0441a enumC0441a2 = EnumC0441a.f9038a;
        i4 = c0073w.f1430e;
        if (i4 != 0) {
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
    public static final Object e(M m4, boolean z, h3.c cVar) {
        C0076z c0076z;
        EnumC0441a enumC0441a;
        int i4;
        M m5;
        h0 h0Var;
        boolean z4;
        M m6;
        C0292d c0292d;
        if (cVar instanceof C0076z) {
            c0076z = (C0076z) cVar;
            int i5 = c0076z.f1443f;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c0076z.f1443f = i5 - Integer.MIN_VALUE;
                Object obj = c0076z.f1441d;
                enumC0441a = EnumC0441a.f9038a;
                i4 = c0076z.f1443f;
                if (i4 != 0) {
                    O3.l.w(obj);
                    h0 j4 = m4.f1280h.j();
                    if (j4 instanceof i0) {
                        throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                    }
                    g0 g4 = m4.g();
                    c0076z.f1438a = m4;
                    c0076z.f1439b = j4;
                    c0076z.f1440c = z;
                    c0076z.f1443f = 1;
                    Integer a3 = g4.a();
                    if (a3 != enumC0441a) {
                        m5 = m4;
                        h0Var = j4;
                        obj = a3;
                    }
                    return enumC0441a;
                }
                if (i4 != 1) {
                    if (i4 == 2) {
                        m6 = c0076z.f1438a;
                        O3.l.w(obj);
                        c0292d = (C0292d) obj;
                        h0 h0Var2 = (h0) c0292d.f5724a;
                        if (((Boolean) c0292d.f5725b).booleanValue()) {
                        }
                        return h0Var2;
                    }
                    if (i4 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    m6 = c0076z.f1438a;
                    O3.l.w(obj);
                    c0292d = (C0292d) obj;
                    h0 h0Var22 = (h0) c0292d.f5724a;
                    if (((Boolean) c0292d.f5725b).booleanValue()) {
                        m6.f1280h.o(h0Var22);
                    }
                    return h0Var22;
                }
                z = c0076z.f1440c;
                h0Var = c0076z.f1439b;
                m5 = c0076z.f1438a;
                O3.l.w(obj);
                int intValue = ((Number) obj).intValue();
                z4 = h0Var instanceof C0054c;
                int i6 = !z4 ? h0Var.f1365a : -1;
                if (!z4 && intValue == i6) {
                    return h0Var;
                }
                if (z) {
                    g0 g5 = m5.g();
                    B b4 = new B(m5, i6, null);
                    c0076z.f1438a = m5;
                    c0076z.f1439b = null;
                    c0076z.f1443f = 3;
                    obj = g5.c(b4, c0076z);
                    if (obj != enumC0441a) {
                        m6 = m5;
                        c0292d = (C0292d) obj;
                        h0 h0Var222 = (h0) c0292d.f5724a;
                        if (((Boolean) c0292d.f5725b).booleanValue()) {
                        }
                        return h0Var222;
                    }
                } else {
                    g0 g6 = m5.g();
                    A a4 = new A(m5, null);
                    c0076z.f1438a = m5;
                    c0076z.f1439b = null;
                    c0076z.f1443f = 2;
                    obj = g6.b(a4, c0076z);
                    if (obj != enumC0441a) {
                        m6 = m5;
                        c0292d = (C0292d) obj;
                        h0 h0Var2222 = (h0) c0292d.f5724a;
                        if (((Boolean) c0292d.f5725b).booleanValue()) {
                        }
                        return h0Var2222;
                    }
                }
                return enumC0441a;
            }
        }
        c0076z = new C0076z(m4, cVar);
        Object obj2 = c0076z.f1441d;
        enumC0441a = EnumC0441a.f9038a;
        i4 = c0076z.f1443f;
        if (i4 != 0) {
        }
        int intValue2 = ((Number) obj2).intValue();
        z4 = h0Var instanceof C0054c;
        if (!z4) {
        }
        if (!z4) {
        }
        if (z) {
        }
        return enumC0441a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x013c, code lost:
    
        if (r10 != r1) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e6 A[Catch: b -> 0x00a7, TryCatch #2 {b -> 0x00a7, blocks: (B:36:0x00a2, B:37:0x013f, B:40:0x00b0, B:41:0x0122, B:54:0x00cd, B:56:0x00e6, B:57:0x00ea, B:62:0x00d6, B:65:0x0110), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(M m4, boolean z, h3.c cVar) {
        C c4;
        Integer a3;
        Object obj;
        M m5;
        int i4;
        C0053b c0053b;
        Object b4;
        kotlin.jvm.internal.o oVar;
        kotlin.jvm.internal.p pVar;
        try {
            if (cVar instanceof C) {
                c4 = (C) cVar;
                int i5 = c4.f1234i;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    c4.f1234i = i5 - Integer.MIN_VALUE;
                    Object obj2 = c4.f1232g;
                    EnumC0441a enumC0441a = EnumC0441a.f9038a;
                    switch (c4.f1234i) {
                        case 0:
                            O3.l.w(obj2);
                            if (!z) {
                                g0 g4 = m4.g();
                                c4.f1226a = m4;
                                c4.f1230e = z;
                                c4.f1234i = 3;
                                obj2 = g4.a();
                                if (obj2 == enumC0441a) {
                                }
                                int intValue = ((Number) obj2).intValue();
                                g0 g5 = m4.g();
                                D d4 = new D(m4, intValue, null);
                                c4.f1226a = m4;
                                c4.f1230e = z;
                                c4.f1234i = 4;
                                obj2 = g5.c(d4, c4);
                                break;
                            } else {
                                c4.f1226a = m4;
                                c4.f1230e = z;
                                c4.f1234i = 1;
                                obj2 = m4.i(c4);
                                if (obj2 == enumC0441a) {
                                }
                                int hashCode = obj2 != null ? obj2.hashCode() : 0;
                                g0 g6 = m4.g();
                                c4.f1226a = m4;
                                c4.f1227b = obj2;
                                c4.f1230e = z;
                                c4.f1231f = hashCode;
                                c4.f1234i = 2;
                                a3 = g6.a();
                                if (a3 != enumC0441a) {
                                    obj = obj2;
                                    obj2 = a3;
                                    m5 = m4;
                                    i4 = hashCode;
                                    return new C0054c(i4, ((Number) obj2).intValue(), obj);
                                }
                            }
                            return enumC0441a;
                        case 1:
                            z = c4.f1230e;
                            m4 = (M) c4.f1226a;
                            O3.l.w(obj2);
                            if (obj2 != null) {
                            }
                            g0 g62 = m4.g();
                            c4.f1226a = m4;
                            c4.f1227b = obj2;
                            c4.f1230e = z;
                            c4.f1231f = hashCode;
                            c4.f1234i = 2;
                            a3 = g62.a();
                            if (a3 != enumC0441a) {
                            }
                            return enumC0441a;
                        case 2:
                            i4 = c4.f1231f;
                            z = c4.f1230e;
                            obj = c4.f1227b;
                            m5 = (M) c4.f1226a;
                            try {
                                O3.l.w(obj2);
                                return new C0054c(i4, ((Number) obj2).intValue(), obj);
                            } catch (C0053b e4) {
                                e = e4;
                                m4 = m5;
                                kotlin.jvm.internal.p pVar2 = new kotlin.jvm.internal.p();
                                a2.i iVar = m4.f1274b;
                                c4.f1226a = m4;
                                c4.f1227b = e;
                                c4.f1228c = pVar2;
                                c4.f1229d = pVar2;
                                c4.f1230e = z;
                                c4.f1234i = 5;
                                throw e;
                            }
                        case 3:
                            z = c4.f1230e;
                            m4 = (M) c4.f1226a;
                            O3.l.w(obj2);
                            int intValue2 = ((Number) obj2).intValue();
                            g0 g52 = m4.g();
                            D d42 = new D(m4, intValue2, null);
                            c4.f1226a = m4;
                            c4.f1230e = z;
                            c4.f1234i = 4;
                            obj2 = g52.c(d42, c4);
                            break;
                        case 4:
                            boolean z4 = c4.f1230e;
                            O3.l.w(obj2);
                            return (C0054c) obj2;
                        case 5:
                            boolean z5 = c4.f1230e;
                            kotlin.jvm.internal.p pVar3 = c4.f1229d;
                            kotlin.jvm.internal.p pVar4 = (kotlin.jvm.internal.p) c4.f1228c;
                            C0053b c0053b2 = (C0053b) c4.f1227b;
                            M m6 = (M) c4.f1226a;
                            O3.l.w(obj2);
                            pVar3.f14159a = obj2;
                            kotlin.jvm.internal.o oVar2 = new kotlin.jvm.internal.o();
                            try {
                                E e5 = new E(pVar4, m6, oVar2, null);
                                c4.f1226a = c0053b2;
                                c4.f1227b = pVar4;
                                c4.f1228c = oVar2;
                                c4.f1229d = null;
                                c4.f1234i = 6;
                                if (z5) {
                                    m6.getClass();
                                    b4 = e5.invoke(c4);
                                } else {
                                    b4 = m6.g().b(new C0071u(e5, null), c4);
                                }
                                if (b4 != enumC0441a) {
                                    oVar = oVar2;
                                    pVar = pVar4;
                                    Object obj3 = pVar.f14159a;
                                    return new C0054c(obj3 != null ? obj3.hashCode() : 0, oVar.f14158a, obj3);
                                }
                                return enumC0441a;
                            } catch (Throwable th) {
                                th = th;
                                c0053b = c0053b2;
                                O3.d.c(c0053b, th);
                                throw c0053b;
                            }
                        case 6:
                            oVar = (kotlin.jvm.internal.o) c4.f1228c;
                            pVar = (kotlin.jvm.internal.p) c4.f1227b;
                            c0053b = (C0053b) c4.f1226a;
                            try {
                                O3.l.w(obj2);
                                Object obj32 = pVar.f14159a;
                                return new C0054c(obj32 != null ? obj32.hashCode() : 0, oVar.f14158a, obj32);
                            } catch (Throwable th2) {
                                th = th2;
                                O3.d.c(c0053b, th);
                                throw c0053b;
                            }
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }
            switch (c4.f1234i) {
            }
        } catch (C0053b e6) {
            e = e6;
        }
        c4 = new C(m4, cVar);
        Object obj22 = c4.f1232g;
        EnumC0441a enumC0441a2 = EnumC0441a.f9038a;
    }

    @Override // K.InterfaceC0059h
    public final Object a(o3.p pVar, InterfaceC0425c interfaceC0425c) {
        l0 l0Var = (l0) interfaceC0425c.getContext().n(k0.f1384a);
        if (l0Var != null) {
            l0Var.c(this);
        }
        return AbstractC1562w.n(new l0(l0Var, this), new I(this, pVar, null), interfaceC0425c);
    }

    public final g0 g() {
        return (g0) this.f1283k.a();
    }

    @Override // K.InterfaceC0059h
    public final A3.d getData() {
        return this.f1276d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
    
        if (r4.j(r0) != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(h3.c cVar) {
        C0075y c0075y;
        int i4;
        M m4;
        int intValue;
        int i5;
        Throwable th;
        M m5;
        try {
            if (cVar instanceof C0075y) {
                c0075y = (C0075y) cVar;
                int i6 = c0075y.f1437e;
                if ((i6 & Integer.MIN_VALUE) != 0) {
                    c0075y.f1437e = i6 - Integer.MIN_VALUE;
                    Object obj = c0075y.f1435c;
                    Object obj2 = EnumC0441a.f9038a;
                    i4 = c0075y.f1437e;
                    if (i4 != 0) {
                        O3.l.w(obj);
                        g0 g4 = g();
                        c0075y.f1433a = this;
                        c0075y.f1437e = 1;
                        obj = g4.a();
                        if (obj != obj2) {
                            m4 = this;
                        }
                        return obj2;
                    }
                    if (i4 != 1) {
                        if (i4 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i5 = c0075y.f1434b;
                        m5 = c0075y.f1433a;
                        try {
                            O3.l.w(obj);
                            return C0297i.f5732a;
                        } catch (Throwable th2) {
                            th = th2;
                            m5.f1280h.o(new Z(th, i5));
                            throw th;
                        }
                    }
                    m4 = c0075y.f1433a;
                    O3.l.w(obj);
                    intValue = ((Number) obj).intValue();
                    G1.c cVar2 = m4.f1281i;
                    c0075y.f1433a = m4;
                    c0075y.f1434b = intValue;
                    c0075y.f1437e = 2;
                }
            }
            G1.c cVar22 = m4.f1281i;
            c0075y.f1433a = m4;
            c0075y.f1434b = intValue;
            c0075y.f1437e = 2;
        } catch (Throwable th3) {
            i5 = intValue;
            th = th3;
            m5 = m4;
            m5.f1280h.o(new Z(th, i5));
            throw th;
        }
        c0075y = new C0075y(this, cVar);
        Object obj3 = c0075y.f1435c;
        Object obj22 = EnumC0441a.f9038a;
        i4 = c0075y.f1437e;
        if (i4 != 0) {
        }
        intValue = ((Number) obj3).intValue();
    }

    public final Object i(h3.c cVar) {
        return ((U) this.f1282j.a()).a(new C0068q(3, (InterfaceC0425c) null), cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(Object obj, boolean z, h3.c cVar) {
        K k4;
        int i4;
        kotlin.jvm.internal.o oVar;
        if (cVar instanceof K) {
            k4 = (K) cVar;
            int i5 = k4.f1265d;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                k4.f1265d = i5 - Integer.MIN_VALUE;
                Object obj2 = k4.f1263b;
                EnumC0441a enumC0441a = EnumC0441a.f9038a;
                i4 = k4.f1265d;
                if (i4 != 0) {
                    O3.l.w(obj2);
                    kotlin.jvm.internal.o oVar2 = new kotlin.jvm.internal.o();
                    U u4 = (U) this.f1282j.a();
                    L l4 = new L(oVar2, this, obj, z, null);
                    k4.f1262a = oVar2;
                    k4.f1265d = 1;
                    if (u4.b(l4, k4) == enumC0441a) {
                        return enumC0441a;
                    }
                    oVar = oVar2;
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oVar = k4.f1262a;
                    O3.l.w(obj2);
                }
                return new Integer(oVar.f14158a);
            }
        }
        k4 = new K(this, cVar);
        Object obj22 = k4.f1263b;
        EnumC0441a enumC0441a2 = EnumC0441a.f9038a;
        i4 = k4.f1265d;
        if (i4 != 0) {
        }
        return new Integer(oVar.f14158a);
    }
}
