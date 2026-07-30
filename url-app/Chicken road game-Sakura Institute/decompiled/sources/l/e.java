package l;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final m f5459a = new m(Float.POSITIVE_INFINITY);

    /* renamed from: b, reason: collision with root package name */
    public static final n f5460b = new n(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: c, reason: collision with root package name */
    public static final o f5461c = new o(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: d, reason: collision with root package name */
    public static final p f5462d = new p(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: e, reason: collision with root package name */
    public static final m f5463e = new m(Float.NEGATIVE_INFINITY);

    /* renamed from: f, reason: collision with root package name */
    public static final n f5464f = new n(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* renamed from: g, reason: collision with root package name */
    public static final o f5465g = new o(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* renamed from: h, reason: collision with root package name */
    public static final p f5466h = new p(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    public static d a() {
        return new d(Float.valueOf(0.0f), x1.f5722a, Float.valueOf(0.01f), 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0117 A[Catch: CancellationException -> 0x003b, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x003b, blocks: (B:16:0x0036, B:18:0x0102, B:20:0x0117, B:25:0x013a, B:27:0x014a, B:29:0x0154, B:36:0x0161, B:37:0x0166, B:39:0x0167), top: B:15:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0182 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(l lVar, g gVar, long j8, q6.c cVar, j6.c cVar2) {
        d1 d1Var;
        int i7;
        i6.a aVar;
        r6.v vVar;
        l lVar2;
        l lVar3;
        r6.v vVar2;
        Object t2;
        q6.c cVar3;
        j jVar;
        j jVar2;
        Object obj;
        Object t8;
        g gVar2 = gVar;
        s1.o1 o1Var = s1.o1.f8336f;
        if (cVar2 instanceof d1) {
            d1Var = (d1) cVar2;
            int i8 = d1Var.f5445k;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                d1Var.f5445k = i8 - Integer.MIN_VALUE;
                d1 d1Var2 = d1Var;
                Object obj2 = d1Var2.f5444j;
                i7 = d1Var2.f5445k;
                aVar = i6.a.f4956f;
                if (i7 != 0) {
                    d6.a.e(obj2);
                    Object b9 = gVar2.b(0L);
                    q f9 = gVar2.f(0L);
                    vVar = new r6.v();
                    if (j8 == Long.MIN_VALUE) {
                        try {
                            lVar2 = lVar;
                            try {
                                f1 f1Var = new f1(vVar, b9, gVar2, f9, lVar2, i(d1Var2.getContext()), cVar);
                                vVar2 = vVar;
                                try {
                                    d1Var2.f5440f = lVar2;
                                    d1Var2.f5441g = gVar2;
                                    d1Var2.f5442h = cVar;
                                    d1Var2.f5443i = vVar2;
                                    d1Var2.f5445k = 1;
                                    if (!gVar2.a()) {
                                        t2 = g0.d.E(d1Var2.getContext()).t(new g0.v0(f1Var, 2), d1Var2);
                                    } else {
                                        if (d1Var2.getContext().u(o1Var) != null) {
                                            throw new ClassCastException();
                                        }
                                        t2 = g0.d.E(d1Var2.getContext()).t(f1Var, d1Var2);
                                    }
                                    if (t2 != aVar) {
                                        lVar3 = lVar2;
                                        cVar3 = cVar;
                                    }
                                    return aVar;
                                } catch (CancellationException e9) {
                                    e = e9;
                                    lVar3 = lVar2;
                                    vVar = vVar2;
                                    jVar = (j) vVar.f7968f;
                                    if (jVar != null) {
                                        jVar.f5549i.setValue(Boolean.FALSE);
                                    }
                                    jVar2 = (j) vVar.f7968f;
                                    if (jVar2 != null && jVar2.f5547g == lVar3.f5565i) {
                                        lVar3.f5567k = false;
                                    }
                                    throw e;
                                }
                            } catch (CancellationException e10) {
                                e = e10;
                                lVar3 = lVar2;
                                jVar = (j) vVar.f7968f;
                                if (jVar != null) {
                                }
                                jVar2 = (j) vVar.f7968f;
                                if (jVar2 != null) {
                                    lVar3.f5567k = false;
                                }
                                throw e;
                            }
                        } catch (CancellationException e11) {
                            e = e11;
                            lVar2 = lVar;
                        }
                    } else {
                        vVar2 = vVar;
                        try {
                            j jVar3 = new j(b9, gVar2.d(), f9, j8, gVar2.e(), j8, new e1(lVar, 1));
                            h(jVar3, j8, i(d1Var2.getContext()), gVar2, lVar, cVar);
                            vVar2.f7968f = jVar3;
                            lVar3 = lVar;
                            gVar2 = gVar;
                            cVar3 = cVar;
                        } catch (CancellationException e12) {
                            e = e12;
                            lVar3 = lVar;
                            vVar = vVar2;
                            jVar = (j) vVar.f7968f;
                            if (jVar != null) {
                            }
                            jVar2 = (j) vVar.f7968f;
                            if (jVar2 != null) {
                            }
                            throw e;
                        }
                    }
                    vVar = vVar2;
                } else {
                    if (i7 != 1 && i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    vVar = d1Var2.f5443i;
                    cVar3 = d1Var2.f5442h;
                    gVar2 = d1Var2.f5441g;
                    lVar3 = d1Var2.f5440f;
                    try {
                        d6.a.e(obj2);
                    } catch (CancellationException e13) {
                        e = e13;
                        jVar = (j) vVar.f7968f;
                        if (jVar != null) {
                        }
                        jVar2 = (j) vVar.f7968f;
                        if (jVar2 != null) {
                        }
                        throw e;
                    }
                }
                do {
                    obj = vVar.f7968f;
                    r6.k.c(obj);
                    if (((Boolean) ((j) obj).f5549i.getValue()).booleanValue()) {
                        return d6.z.f2639a;
                    }
                    r6.v vVar3 = vVar;
                    q6.c cVar4 = cVar3;
                    g gVar3 = gVar2;
                    l lVar4 = lVar3;
                    try {
                        g1 g1Var = new g1(vVar3, i(d1Var2.getContext()), gVar3, lVar4, cVar4);
                        vVar = vVar3;
                        gVar2 = gVar3;
                        lVar3 = lVar4;
                        cVar3 = cVar4;
                        d1Var2.f5440f = lVar3;
                        d1Var2.f5441g = gVar2;
                        d1Var2.f5442h = cVar3;
                        d1Var2.f5443i = vVar;
                        d1Var2.f5445k = 2;
                        if (!gVar2.a()) {
                            t8 = g0.d.E(d1Var2.getContext()).t(new g0.v0(g1Var, 2), d1Var2);
                        } else {
                            if (d1Var2.getContext().u(o1Var) != null) {
                                throw new ClassCastException();
                            }
                            t8 = g0.d.E(d1Var2.getContext()).t(g1Var, d1Var2);
                        }
                    } catch (CancellationException e14) {
                        e = e14;
                        vVar = vVar3;
                        lVar3 = lVar4;
                        jVar = (j) vVar.f7968f;
                        if (jVar != null) {
                        }
                        jVar2 = (j) vVar.f7968f;
                        if (jVar2 != null) {
                        }
                        throw e;
                    }
                } while (t8 != aVar);
                return aVar;
            }
        }
        d1Var = new d1(cVar2);
        d1 d1Var22 = d1Var;
        Object obj22 = d1Var22.f5444j;
        i7 = d1Var22.f5445k;
        aVar = i6.a.f4956f;
        if (i7 != 0) {
        }
        do {
            obj = vVar.f7968f;
            r6.k.c(obj);
            if (((Boolean) ((j) obj).f5549i.getValue()).booleanValue()) {
            }
        } while (t8 != aVar);
        return aVar;
    }

    public static Object c(float f9, float f10, v1 v1Var, q6.e eVar, j6.i iVar, int i7) {
        a0 a0Var = v1Var;
        if ((i7 & 8) != 0) {
            a0Var = k(7, null);
        }
        w1 w1Var = x1.f5722a;
        Float f11 = new Float(f9);
        Float f12 = new Float(f10);
        m mVar = new m(new Float(0.0f).floatValue());
        Object b9 = b(new l(w1Var, f11, mVar, 56), new i1(a0Var, w1Var, f11, f12, mVar), Long.MIN_VALUE, new g0.v0(eVar), iVar);
        d6.z zVar = d6.z.f2639a;
        i6.a aVar = i6.a.f4956f;
        if (b9 != aVar) {
            b9 = zVar;
        }
        return b9 == aVar ? b9 : zVar;
    }

    public static final f0 d(h0 h0Var, float f9, e0 e0Var, g0.p pVar) {
        return f(h0Var, Float.valueOf(0.0f), Float.valueOf(f9), x1.f5722a, e0Var, pVar, 33208, 0);
    }

    public static Object e(l lVar, Float f9, a1 a1Var, j6.i iVar) {
        Object b9 = b(lVar, new i1(a1Var, lVar.f5562f, lVar.f5563g.getValue(), f9, lVar.f5564h), lVar.f5565i, h1.f5504h, iVar);
        return b9 == i6.a.f4956f ? b9 : d6.z.f2639a;
    }

    public static final f0 f(h0 h0Var, Number number, Number number2, w1 w1Var, e0 e0Var, g0.p pVar, int i7, int i8) {
        h0 h0Var2;
        Number number3;
        Number number4;
        e0 e0Var2;
        Object G = pVar.G();
        g0.t0 t0Var = g0.l.f3784a;
        if (G == t0Var) {
            h0Var2 = h0Var;
            number3 = number;
            number4 = number2;
            e0Var2 = e0Var;
            f0 f0Var = new f0(h0Var2, number3, number4, w1Var, e0Var2);
            pVar.a0(f0Var);
            G = f0Var;
        } else {
            h0Var2 = h0Var;
            number3 = number;
            number4 = number2;
            e0Var2 = e0Var;
        }
        f0 f0Var2 = (f0) G;
        boolean z8 = (((57344 & i7) ^ 24576) > 16384 && pVar.h(e0Var2)) || (i7 & 24576) == 16384;
        Object G2 = pVar.G();
        if (z8 || G2 == t0Var) {
            G2 = new i0(number3, f0Var2, number4, e0Var2);
            pVar.a0(G2);
        }
        g0.d.g((q6.a) G2, pVar);
        boolean h3 = pVar.h(h0Var2);
        Object G3 = pVar.G();
        if (h3 || G3 == t0Var) {
            G3 = new a0.y(h0Var2, 17, f0Var2);
            pVar.a0(G3);
        }
        g0.d.d(f0Var2, (q6.c) G3, pVar);
        return f0Var2;
    }

    public static final q g(q qVar) {
        q c4 = qVar.c();
        int b9 = c4.b();
        for (int i7 = 0; i7 < b9; i7++) {
            c4.e(qVar.a(i7), i7);
        }
        return c4;
    }

    public static final void h(j jVar, long j8, float f9, g gVar, l lVar, q6.c cVar) {
        long c4 = f9 == 0.0f ? gVar.c() : (long) ((j8 - jVar.f5543c) / f9);
        jVar.f5547g = j8;
        jVar.f5545e.setValue(gVar.b(c4));
        jVar.f5546f = gVar.f(c4);
        if (gVar.g(c4)) {
            jVar.f5548h = jVar.f5547g;
            jVar.f5549i.setValue(Boolean.FALSE);
        }
        m(jVar, lVar);
        cVar.f(jVar);
    }

    public static final float i(h6.i iVar) {
        s0.p pVar = (s0.p) iVar.u(s0.b.f8092t);
        float E = pVar != null ? pVar.E() : 1.0f;
        if (E >= 0.0f) {
            return E;
        }
        throw new IllegalStateException("negative scale factor");
    }

    public static e0 j(x xVar) {
        return new e0(xVar, 0);
    }

    public static a1 k(int i7, Object obj) {
        float f9 = (i7 & 2) != 0 ? 1500.0f : 400.0f;
        if ((i7 & 4) != 0) {
            obj = null;
        }
        return new a1(1.0f, f9, obj);
    }

    public static v1 l(int i7, int i8, y yVar) {
        int i9 = (i8 & 2) != 0 ? 0 : 90;
        if ((i8 & 4) != 0) {
            yVar = z.f5732a;
        }
        return new v1(i7, i9, yVar);
    }

    public static final void m(j jVar, l lVar) {
        lVar.f5563g.setValue(jVar.f5545e.getValue());
        q qVar = lVar.f5564h;
        q qVar2 = jVar.f5546f;
        int b9 = qVar.b();
        for (int i7 = 0; i7 < b9; i7++) {
            qVar.e(qVar2.a(i7), i7);
        }
        lVar.f5566j = jVar.f5548h;
        lVar.f5565i = jVar.f5547g;
        lVar.f5567k = ((Boolean) jVar.f5549i.getValue()).booleanValue();
    }
}
