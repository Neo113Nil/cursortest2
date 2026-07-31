package r;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final l f6254a = new l(Float.POSITIVE_INFINITY);

    /* renamed from: b, reason: collision with root package name */
    public static final m f6255b = new m(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: c, reason: collision with root package name */
    public static final n f6256c = new n(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: d, reason: collision with root package name */
    public static final o f6257d = new o(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: e, reason: collision with root package name */
    public static final l f6258e = new l(Float.NEGATIVE_INFINITY);

    /* renamed from: f, reason: collision with root package name */
    public static final m f6259f = new m(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* renamed from: g, reason: collision with root package name */
    public static final n f6260g = new n(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* renamed from: h, reason: collision with root package name */
    public static final o f6261h = new o(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final float[] i = new float[91];

    /* renamed from: j, reason: collision with root package name */
    public static final r1 f6262j = new r1(new j0.l(20), new s1(7));

    /* renamed from: k, reason: collision with root package name */
    public static final r1 f6263k = new r1(new j0.l(21), new j0.l(22));

    /* renamed from: l, reason: collision with root package name */
    public static final r1 f6264l = new r1(new j0.l(23), new j0.l(24));

    /* renamed from: m, reason: collision with root package name */
    public static final r1 f6265m = new r1(new j0.l(25), new j0.l(26));

    /* renamed from: n, reason: collision with root package name */
    public static final r1 f6266n = new r1(new j0.l(27), new j0.l(28));

    /* renamed from: o, reason: collision with root package name */
    public static final r1 f6267o = new r1(new j0.l(29), new s1(0));

    /* renamed from: p, reason: collision with root package name */
    public static final r1 f6268p = new r1(new s1(1), new s1(2));

    /* renamed from: q, reason: collision with root package name */
    public static final r1 f6269q = new r1(new s1(3), new s1(4));

    /* renamed from: r, reason: collision with root package name */
    public static final r1 f6270r = new r1(new s1(5), new s1(6));

    public static k a(int i8, float f6) {
        if ((i8 & 2) != 0) {
            f6 = 0.0f;
        }
        return new k(f6262j, Float.valueOf(0.0f), new l(f6), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(3:(1:(1:11)(2:54|55))(1:56)|12|13)(8:57|(11:67|68|69|70|71|72|73|74|(2:76|(1:78)(2:81|82))(1:83)|(1:80)|29)(7:59|60|61|62|15|16|(7:18|19|20|21|22|23|(1:34)(2:25|(2:31|32)(1:27)))(2:48|49))|66|39|(1:41)|42|(1:46)|47)|14|15|16|(0)(0)))|92|6|7|(0)(0)|14|15|16|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0183, code lost:
    
        if (m0.b.o(r9.f()).d(r5, r9) == r12) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c5, code lost:
    
        if (m0.b.o(r9.f()).d(new r.x0(r5, 0), r9) == r12) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x018c, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x018d, code lost:
    
        r2 = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0120 A[Catch: CancellationException -> 0x018c, TRY_LEAVE, TryCatch #3 {CancellationException -> 0x018c, blocks: (B:16:0x010b, B:18:0x0120), top: B:15:0x010b }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(k kVar, g gVar, long j7, final p6.c cVar, i6.c cVar2) {
        b1 b1Var;
        int i8;
        final k kVar2;
        q6.s sVar;
        k kVar3;
        final float i9;
        Object d8;
        p6.c cVar3;
        q6.s sVar2;
        q6.s sVar3;
        i iVar;
        i iVar2;
        Object obj;
        final p6.c cVar4;
        final q6.s sVar4;
        final g gVar2;
        final k kVar4;
        final g gVar3 = gVar;
        x1.k1 k1Var = x1.k1.f8492d;
        if (cVar2 instanceof b1) {
            b1Var = (b1) cVar2;
            int i10 = b1Var.f6232l;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                b1Var.f6232l = i10 - Integer.MIN_VALUE;
                b1 b1Var2 = b1Var;
                g6.h hVar = b1Var2.f3460e;
                Object obj2 = b1Var2.f6231k;
                i8 = b1Var2.f6232l;
                h6.a aVar = h6.a.f3204d;
                if (i8 != 0) {
                    s6.a.K(obj2);
                    final Object b8 = gVar3.b(0L);
                    final p f6 = gVar3.f(0L);
                    final q6.s sVar5 = new q6.s();
                    if (j7 == Long.MIN_VALUE) {
                        try {
                            q6.i.b(hVar);
                            i9 = i(hVar);
                            kVar2 = kVar;
                        } catch (CancellationException e8) {
                            e = e8;
                            kVar2 = kVar;
                        }
                        try {
                            p6.c cVar5 = new p6.c() { // from class: r.z0
                                @Override // p6.c
                                public final Object i(Object obj3) {
                                    long longValue = ((Long) obj3).longValue();
                                    g gVar4 = gVar3;
                                    r1 d9 = gVar4.d();
                                    Object e9 = gVar4.e();
                                    k kVar5 = kVar2;
                                    i iVar3 = new i(b8, d9, f6, longValue, e9, longValue, new y0(kVar5, 0));
                                    d.h(iVar3, longValue, i9, gVar4, kVar5, cVar);
                                    q6.s.this.f6205d = iVar3;
                                    return c6.m.f1757a;
                                }
                            };
                            sVar = sVar5;
                            try {
                                b1Var2.f6228g = kVar2;
                                b1Var2.f6229h = gVar3;
                                b1Var2.i = cVar;
                                b1Var2.f6230j = sVar;
                                b1Var2.f6232l = 1;
                                if (!gVar3.a()) {
                                    d8 = m0.b.o(b1Var2.f()).d(new x0(cVar5, 0), b1Var2);
                                } else {
                                    if (b1Var2.f().l(k1Var) != null) {
                                        throw new ClassCastException();
                                    }
                                    d8 = m0.b.o(b1Var2.f()).d(cVar5, b1Var2);
                                }
                                if (d8 != aVar) {
                                    kVar3 = kVar2;
                                    cVar3 = cVar;
                                    sVar2 = sVar;
                                }
                                return aVar;
                            } catch (CancellationException e9) {
                                e = e9;
                                kVar3 = kVar2;
                                sVar2 = sVar;
                                iVar = (i) sVar2.f6205d;
                                if (iVar != null) {
                                }
                                iVar2 = (i) sVar2.f6205d;
                                if (iVar2 != null) {
                                    kVar3.i = false;
                                }
                                throw e;
                            }
                        } catch (CancellationException e10) {
                            e = e10;
                            sVar = sVar5;
                            kVar3 = kVar2;
                            sVar2 = sVar;
                            iVar = (i) sVar2.f6205d;
                            if (iVar != null) {
                            }
                            iVar2 = (i) sVar2.f6205d;
                            if (iVar2 != null) {
                            }
                            throw e;
                        }
                    }
                    sVar = sVar5;
                    try {
                        i iVar3 = new i(b8, gVar3.d(), f6, j7, gVar3.e(), j7, new y0(kVar, 1));
                        q6.i.b(hVar);
                        h(iVar3, j7, i(hVar), gVar3, kVar, cVar);
                        sVar.f6205d = iVar3;
                        kVar3 = kVar;
                        gVar3 = gVar;
                        cVar3 = cVar;
                        sVar3 = sVar;
                        obj = sVar3.f6205d;
                        q6.i.b(obj);
                        if (!((Boolean) ((i) obj).i.getValue()).booleanValue()) {
                            return c6.m.f1757a;
                        }
                        try {
                            g6.h hVar2 = b1Var2.f3460e;
                            q6.i.b(hVar2);
                            final float i11 = i(hVar2);
                            p6.c cVar6 = new p6.c() { // from class: r.a1
                                @Override // p6.c
                                public final Object i(Object obj3) {
                                    long longValue = ((Long) obj3).longValue();
                                    Object obj4 = q6.s.this.f6205d;
                                    q6.i.b(obj4);
                                    d.h((i) obj4, longValue, i11, gVar2, kVar4, cVar4);
                                    return c6.m.f1757a;
                                }
                            };
                            sVar2 = sVar4;
                            gVar3 = gVar2;
                            kVar3 = kVar4;
                            cVar3 = cVar4;
                            b1Var2.f6228g = kVar3;
                            b1Var2.f6229h = gVar3;
                            b1Var2.i = cVar3;
                            b1Var2.f6230j = sVar2;
                            b1Var2.f6232l = 2;
                            if (!gVar3.a()) {
                            } else if (b1Var2.f().l(k1Var) != null) {
                                throw new ClassCastException();
                            }
                        } catch (CancellationException e11) {
                            e = e11;
                            sVar2 = sVar4;
                            kVar3 = kVar4;
                        }
                        cVar4 = cVar3;
                        sVar4 = sVar3;
                        gVar2 = gVar3;
                        kVar4 = kVar3;
                    } catch (CancellationException e12) {
                        e = e12;
                        kVar3 = kVar;
                    }
                    sVar2 = sVar;
                    iVar = (i) sVar2.f6205d;
                    if (iVar != null) {
                        iVar.i.setValue(Boolean.FALSE);
                    }
                    iVar2 = (i) sVar2.f6205d;
                    if (iVar2 != null && iVar2.f6309g == kVar3.f6333g) {
                        kVar3.i = false;
                    }
                    throw e;
                }
                if (i8 == 1) {
                    sVar2 = b1Var2.f6230j;
                    cVar3 = b1Var2.i;
                    gVar3 = b1Var2.f6229h;
                    kVar3 = b1Var2.f6228g;
                } else {
                    if (i8 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sVar2 = b1Var2.f6230j;
                    cVar3 = b1Var2.i;
                    gVar3 = b1Var2.f6229h;
                    kVar3 = b1Var2.f6228g;
                }
                try {
                    s6.a.K(obj2);
                } catch (CancellationException e13) {
                    e = e13;
                }
                sVar3 = sVar2;
                obj = sVar3.f6205d;
                q6.i.b(obj);
                if (!((Boolean) ((i) obj).i.getValue()).booleanValue()) {
                }
            }
        }
        b1Var = new b1(cVar2);
        b1 b1Var22 = b1Var;
        g6.h hVar3 = b1Var22.f3460e;
        Object obj22 = b1Var22.f6231k;
        i8 = b1Var22.f6232l;
        h6.a aVar2 = h6.a.f3204d;
        if (i8 != 0) {
        }
        sVar3 = sVar2;
        obj = sVar3.f6205d;
        q6.i.b(obj);
        if (!((Boolean) ((i) obj).i.getValue()).booleanValue()) {
        }
    }

    public static Object c(float f6, float f8, q1 q1Var, p6.e eVar, i6.i iVar, int i8) {
        v vVar = q1Var;
        if ((i8 & 8) != 0) {
            vVar = l(0.0f, 0.0f, null, 7);
        }
        v vVar2 = vVar;
        Float f9 = new Float(f6);
        Float f10 = new Float(f8);
        Float f11 = new Float(0.0f);
        r1 r1Var = f6262j;
        p6.c cVar = r1Var.f6413a;
        p pVar = (p) cVar.i(f11);
        if (pVar == null) {
            pVar = ((p) cVar.i(f9)).c();
        }
        p pVar2 = pVar;
        Object b8 = b(new k(r1Var, f9, pVar2, 56), new c1(vVar2, r1Var, f9, f10, pVar2), Long.MIN_VALUE, new a0.t(18, eVar), iVar);
        c6.m mVar = c6.m.f1757a;
        h6.a aVar = h6.a.f3204d;
        if (b8 != aVar) {
            b8 = mVar;
        }
        return b8 == aVar ? b8 : mVar;
    }

    public static final a0 d(c0 c0Var, float f6, float f8, final z zVar, String str, m0.s sVar, int i8) {
        final Float valueOf = Float.valueOf(f6);
        final Float valueOf2 = Float.valueOf(f8);
        int i9 = (i8 & 1022) | 32768 | ((i8 << 3) & 458752);
        Object K = sVar.K();
        Object obj = m0.n.f5019a;
        if (K == obj) {
            K = new a0(c0Var, valueOf, valueOf2, zVar);
            sVar.f0(K);
        }
        final a0 a0Var = (a0) K;
        boolean h8 = ((((i9 & 896) ^ 384) > 256 && sVar.h(valueOf2)) || (i9 & 384) == 256) | sVar.h(zVar);
        Object K2 = sVar.K();
        if (h8 || K2 == obj) {
            K2 = new p6.a() { // from class: r.d0
                @Override // p6.a
                public final Object b() {
                    a0 a0Var2 = a0Var;
                    Float f9 = a0Var2.f6214d;
                    Float f10 = valueOf;
                    boolean equals = f10.equals(f9);
                    Float f11 = valueOf2;
                    if (!equals || !f11.equals(a0Var2.f6215e)) {
                        a0Var2.f6214d = f10;
                        a0Var2.f6215e = f11;
                        a0Var2.f6217g = new c1(zVar, d.f6262j, f10, f11, null);
                        a0Var2.f6220k.f6243b.setValue(Boolean.TRUE);
                        a0Var2.f6218h = false;
                        a0Var2.i = true;
                    }
                    return c6.m.f1757a;
                }
            };
            sVar.f0(K2);
        }
        m0.b.g((p6.a) K2, sVar);
        boolean h9 = sVar.h(c0Var);
        Object K3 = sVar.K();
        if (h9 || K3 == obj) {
            K3 = new a0.v0(11, c0Var, a0Var);
            sVar.f0(K3);
        }
        m0.b.d(a0Var, (p6.c) K3, sVar);
        return a0Var;
    }

    public static final Object e(k kVar, Float f6, v vVar, p6.c cVar, i6.i iVar) {
        Object b8 = b(kVar, new c1(vVar, kVar.f6330d, kVar.f6331e.getValue(), f6, kVar.f6332f), kVar.f6333g, cVar, iVar);
        return b8 == h6.a.f3204d ? b8 : c6.m.f1757a;
    }

    public static final p f(p pVar) {
        p c8 = pVar.c();
        int b8 = c8.b();
        for (int i8 = 0; i8 < b8; i8++) {
            c8.e(i8, pVar.a(i8));
        }
        return c8;
    }

    public static k g(k kVar, float f6) {
        float f8 = ((l) kVar.f6332f).f6337a;
        return new k(kVar.f6330d, Float.valueOf(f6), new l(f8), kVar.f6333g, kVar.f6334h, kVar.i);
    }

    public static final void h(i iVar, long j7, float f6, g gVar, k kVar, p6.c cVar) {
        long c8 = f6 == 0.0f ? gVar.c() : (long) ((j7 - iVar.f6305c) / f6);
        iVar.f6309g = j7;
        iVar.f6307e.setValue(gVar.b(c8));
        iVar.f6308f = gVar.f(c8);
        if (gVar.g(c8)) {
            iVar.f6310h = iVar.f6309g;
            iVar.i.setValue(Boolean.FALSE);
        }
        n(iVar, kVar);
        cVar.i(iVar);
    }

    public static final float i(g6.h hVar) {
        y0.n nVar = (y0.n) hVar.l(y0.b.f8695s);
        float u7 = nVar != null ? nVar.u() : 1.0f;
        if (u7 >= 0.0f) {
            return u7;
        }
        i0.b("negative scale factor");
        return u7;
    }

    public static z j(q1 q1Var, j0 j0Var) {
        return new z(q1Var, j0Var, 0);
    }

    public static final c0 k(String str, m0.s sVar) {
        Object K = sVar.K();
        if (K == m0.n.f5019a) {
            K = new c0();
            sVar.f0(K);
        }
        c0 c0Var = (c0) K;
        c0Var.a(sVar, 0);
        return c0Var;
    }

    public static u0 l(float f6, float f8, Object obj, int i8) {
        if ((i8 & 1) != 0) {
            f6 = 1.0f;
        }
        if ((i8 & 2) != 0) {
            f8 = 1500.0f;
        }
        if ((i8 & 4) != 0) {
            obj = null;
        }
        return new u0(f6, f8, obj);
    }

    public static q1 m(int i8, int i9, t tVar) {
        int i10 = (i9 & 2) != 0 ? 0 : 90;
        if ((i9 & 4) != 0) {
            tVar = u.f6437a;
        }
        return new q1(i8, i10, tVar);
    }

    public static final void n(i iVar, k kVar) {
        kVar.f6331e.setValue(iVar.f6307e.getValue());
        p pVar = kVar.f6332f;
        p pVar2 = iVar.f6308f;
        int b8 = pVar.b();
        for (int i8 = 0; i8 < b8; i8++) {
            pVar.e(i8, pVar2.a(i8));
        }
        kVar.f6334h = iVar.f6310h;
        kVar.f6333g = iVar.f6309g;
        kVar.i = ((Boolean) iVar.i.getValue()).booleanValue();
    }
}
