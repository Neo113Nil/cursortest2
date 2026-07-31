package j0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class u0 {

    /* renamed from: a, reason: collision with root package name */
    public static final y0.m f3920a = androidx.compose.foundation.layout.a.j(l0.s.f4621d);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final l1.e eVar, final String str, y0.m mVar, long j7, m0.s sVar, final int i, final int i8) {
        String str2;
        y0.m mVar2;
        long j8;
        int i9;
        int i10;
        final y0.m mVar3;
        final long j9;
        m0.t1 r7;
        y0.m mVar4;
        y0.m mVar5;
        Object[] objArr;
        long j10;
        sVar.W(-126890956);
        int i11 = (sVar.f(eVar) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            str2 = str;
            i11 |= sVar.f(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        int i12 = i8 & 4;
        if (i12 != 0) {
            i11 |= 384;
        } else if ((i & 384) == 0) {
            mVar2 = mVar;
            i11 |= sVar.f(mVar2) ? 256 : 128;
            if ((i8 & 8) != 0) {
                j8 = j7;
                if (sVar.e(j8)) {
                    i9 = 2048;
                    i10 = i11 | i9;
                    if (sVar.N(i10 & 1, (i10 & 1171) != 1170)) {
                        sVar.S();
                        if ((i & 1) == 0 || sVar.x()) {
                            mVar4 = i12 != 0 ? y0.j.f8705a : mVar2;
                            if ((i8 & 8) != 0) {
                                j8 = ((f1.s) sVar.j(g0.f3652a)).f2705a;
                                i10 &= -7169;
                            }
                        } else {
                            sVar.Q();
                            if ((i8 & 8) != 0) {
                                i10 &= -7169;
                            }
                            mVar4 = mVar2;
                        }
                        sVar.q();
                        r2.c cVar = (r2.c) sVar.j(x1.b1.f8370h);
                        float f6 = eVar.i;
                        boolean e8 = sVar.e((Float.floatToRawIntBits(cVar.b()) & 4294967295L) | (Float.floatToRawIntBits(f6) << 32));
                        Object K = sVar.K();
                        if (e8 || K == m0.n.f5019a) {
                            l1.b bVar = new l1.b();
                            m.a.p(bVar, eVar.f4765f);
                            float f8 = eVar.f4761b;
                            float f9 = eVar.f4762c;
                            float u7 = cVar.u(f8);
                            mVar5 = mVar4;
                            long floatToRawIntBits = (Float.floatToRawIntBits(cVar.u(f9)) & 4294967295L) | (Float.floatToRawIntBits(u7) << 32);
                            float f10 = eVar.f4763d;
                            float f11 = eVar.f4764e;
                            if (Float.isNaN(f10)) {
                                objArr = 32;
                                j10 = 4294967295L;
                                f10 = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
                            } else {
                                objArr = 32;
                                j10 = 4294967295L;
                            }
                            if (Float.isNaN(f11)) {
                                f11 = Float.intBitsToFloat((int) (floatToRawIntBits & j10));
                            }
                            long floatToRawIntBits2 = (Float.floatToRawIntBits(f11) & j10) | (Float.floatToRawIntBits(f10) << (objArr == true ? 1L : 0L));
                            l1.a0 a0Var = new l1.a0(bVar);
                            String str3 = eVar.f4760a;
                            long j11 = eVar.f4766g;
                            f1.m mVar6 = j11 != 16 ? new f1.m(eVar.f4767h, j11) : null;
                            a0Var.f4727d.setValue(new e1.e(floatToRawIntBits));
                            a0Var.f4728e.setValue(Boolean.FALSE);
                            l1.v vVar = a0Var.f4729f;
                            vVar.f4817g.setValue(mVar6);
                            vVar.i.setValue(new e1.e(floatToRawIntBits2));
                            vVar.f4813c = str3;
                            sVar.f0(a0Var);
                            K = a0Var;
                        } else {
                            mVar5 = mVar4;
                        }
                        y0.m mVar7 = mVar5;
                        long j12 = j8;
                        b((l1.a0) K, str2, mVar7, j12, sVar, (i10 & 112) | 8 | (i10 & 896) | (i10 & 7168));
                        mVar3 = mVar7;
                        j9 = j12;
                    } else {
                        sVar.Q();
                        mVar3 = mVar2;
                        j9 = j8;
                    }
                    r7 = sVar.r();
                    if (r7 != null) {
                        r7.f5121d = new p6.e() { // from class: j0.s0
                            @Override // p6.e
                            public final Object g(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                u0.a(l1.e.this, str, mVar3, j9, (m0.s) obj, m0.b.w(i | 1), i8);
                                return c6.m.f1757a;
                            }
                        };
                        return;
                    }
                    return;
                }
            } else {
                j8 = j7;
            }
            i9 = 1024;
            i10 = i11 | i9;
            if (sVar.N(i10 & 1, (i10 & 1171) != 1170)) {
            }
            r7 = sVar.r();
            if (r7 != null) {
            }
        }
        mVar2 = mVar;
        if ((i8 & 8) != 0) {
        }
        i9 = 1024;
        i10 = i11 | i9;
        if (sVar.N(i10 & 1, (i10 & 1171) != 1170)) {
        }
        r7 = sVar.r();
        if (r7 != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0108, code lost:
    
        if (java.lang.Float.isInfinite(java.lang.Float.intBitsToFloat((int) (r9 & 4294967295L))) != false) goto L74;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final l1.a0 a0Var, final String str, final y0.m mVar, final long j7, m0.s sVar, final int i) {
        int i8;
        sVar.W(-2142239481);
        if ((i & 6) == 0) {
            i8 = (sVar.h(a0Var) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= sVar.f(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i8 |= sVar.f(mVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i8 |= sVar.e(j7) ? 2048 : 1024;
        }
        if (sVar.N(i8 & 1, (i8 & 1171) != 1170)) {
            sVar.S();
            if ((i & 1) != 0 && !sVar.x()) {
                sVar.Q();
            }
            sVar.q();
            boolean z3 = (((i8 & 7168) ^ 3072) > 2048 && sVar.e(j7)) || (i8 & 3072) == 2048;
            Object K = sVar.K();
            m0.v0 v0Var = m0.n.f5019a;
            if (z3 || K == v0Var) {
                K = f1.s.c(j7, f1.s.f2704h) ? null : new f1.m(5, j7);
                sVar.f0(K);
            }
            f1.m mVar2 = (f1.m) K;
            sVar.V(-536990979);
            boolean z7 = (i8 & 112) == 32;
            Object K2 = sVar.K();
            if (z7 || K2 == v0Var) {
                K2 = new h0(str, 1);
                sVar.f0(K2);
            }
            y0.m mVar3 = y0.j.f8705a;
            y0.m a8 = d2.l.a(mVar3, (p6.c) K2);
            sVar.p(false);
            if (!e1.e.a(a0Var.b(), 9205357640488583168L)) {
                long b8 = a0Var.b();
                if (Float.isInfinite(Float.intBitsToFloat((int) (b8 >> 32)))) {
                }
                x.k.a(androidx.compose.ui.draw.a.b(mVar.d(mVar3), a0Var, mVar2).d(a8), sVar, 0);
            }
            mVar3 = f3920a;
            x.k.a(androidx.compose.ui.draw.a.b(mVar.d(mVar3), a0Var, mVar2).d(a8), sVar, 0);
        } else {
            sVar.Q();
        }
        m0.t1 r7 = sVar.r();
        if (r7 != null) {
            r7.f5121d = new p6.e() { // from class: j0.t0
                @Override // p6.e
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    u0.b(l1.a0.this, str, mVar, j7, (m0.s) obj, m0.b.w(i | 1));
                    return c6.m.f1757a;
                }
            };
        }
    }
}
