package j0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class n2 {

    /* renamed from: a, reason: collision with root package name */
    public static final m0.b0 f3804a = new m0.b0(new c.e(15));

    public static final void a(g2.i0 i0Var, u0.c cVar, m0.s sVar, int i) {
        sVar.W(15327438);
        int i8 = (sVar.f(i0Var) ? 4 : 2) | i | (sVar.h(cVar) ? 32 : 16);
        if (sVar.N(i8 & 1, (i8 & 19) != 18)) {
            m0.b0 b0Var = f3804a;
            m0.b.a(b0Var.a(((g2.i0) sVar.j(b0Var)).c(i0Var)), cVar, sVar, (i8 & 112) | 8);
        } else {
            sVar.Q();
        }
        m0.t1 r7 = sVar.r();
        if (r7 != null) {
            r7.f5121d = new a0.e0(i, 8, i0Var, cVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final String str, y0.m mVar, long j7, long j8, j2.i iVar, j2.k kVar, long j9, q2.k kVar2, long j10, int i, boolean z3, int i8, int i9, g2.i0 i0Var, m0.s sVar, final int i10, final int i11, final int i12) {
        int i13;
        y0.m mVar2;
        int i14;
        long j11;
        int i15;
        long j12;
        int i16;
        j2.i iVar2;
        int i17;
        final j2.k kVar3;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        final q2.k kVar4;
        final int i23;
        final boolean z7;
        final int i24;
        final int i25;
        final g2.i0 i0Var2;
        final j2.i iVar3;
        final y0.m mVar3;
        final long j13;
        final long j14;
        final long j15;
        final long j16;
        m0.t1 r7;
        long j17;
        long j18;
        q2.k kVar5;
        long j19;
        int i26;
        g2.i0 i0Var3;
        boolean z8;
        int i27;
        long b8;
        long j20;
        boolean z9;
        sVar.W(1809465675);
        if ((i10 & 6) == 0) {
            i13 = (sVar.f(str) ? 4 : 2) | i10;
        } else {
            i13 = i10;
        }
        int i28 = i12 & 2;
        if (i28 != 0) {
            i13 |= 48;
        } else if ((i10 & 48) == 0) {
            mVar2 = mVar;
            i13 |= sVar.f(mVar2) ? 32 : 16;
            i14 = i12 & 4;
            if (i14 == 0) {
                i13 |= 384;
            } else if ((i10 & 384) == 0) {
                j11 = j7;
                i13 |= sVar.e(j11) ? 256 : 128;
                int i29 = i13 | 3072;
                i15 = i12 & 16;
                if (i15 != 0) {
                    i29 = i13 | 27648;
                    j12 = j8;
                } else {
                    j12 = j8;
                    if ((i10 & 24576) == 0) {
                        i29 |= sVar.e(j12) ? 16384 : 8192;
                    }
                }
                i16 = i12 & 32;
                if (i16 != 0) {
                    i29 |= 196608;
                    iVar2 = iVar;
                } else {
                    iVar2 = iVar;
                    if ((i10 & 196608) == 0) {
                        i29 |= sVar.f(iVar2) ? 131072 : 65536;
                    }
                }
                i17 = i12 & 64;
                if (i17 != 0) {
                    i29 |= 1572864;
                    kVar3 = kVar;
                } else {
                    kVar3 = kVar;
                    if ((i10 & 1572864) == 0) {
                        i29 |= sVar.f(kVar3) ? 1048576 : 524288;
                    }
                }
                i18 = i29 | 918552576;
                i19 = i12 & 1024;
                if (i19 != 0) {
                    i20 = i11 | 6;
                } else {
                    i20 = i11 | (sVar.f(kVar2) ? 4 : 2);
                }
                i21 = i12 & 2048;
                if (i21 != 0) {
                    i20 |= 48;
                } else if ((i11 & 48) == 0) {
                    i22 = i21;
                    i20 |= sVar.e(j10) ? 32 : 16;
                    int i30 = 1;
                    if (sVar.N(i18 & 1, (i18 & 306783379) == 306783378 || ((i20 | 5991808) & 4793491) != 4793490)) {
                        sVar.Q();
                        kVar4 = kVar2;
                        i23 = i;
                        z7 = z3;
                        i24 = i8;
                        i25 = i9;
                        i0Var2 = i0Var;
                        iVar3 = iVar2;
                        mVar3 = mVar2;
                        j13 = j9;
                        j14 = j12;
                        j15 = j11;
                        j16 = j10;
                    } else {
                        sVar.S();
                        if ((i10 & 1) == 0 || sVar.x()) {
                            if (i28 != 0) {
                                mVar2 = y0.j.f8705a;
                            }
                            if (i14 != 0) {
                                j11 = f1.s.f2704h;
                            }
                            j17 = i15 != 0 ? r2.n.f6534c : j12;
                            if (i16 != 0) {
                                iVar2 = null;
                            }
                            if (i17 != 0) {
                                kVar3 = null;
                            }
                            j18 = r2.n.f6534c;
                            kVar5 = i19 == 0 ? kVar2 : null;
                            j19 = i22 != 0 ? j18 : j10;
                            i26 = Integer.MAX_VALUE;
                            i0Var3 = (g2.i0) sVar.j(f3804a);
                            z8 = true;
                            i27 = 1;
                        } else {
                            sVar.Q();
                            j18 = j9;
                            j19 = j10;
                            i30 = i;
                            i26 = i8;
                            i27 = i9;
                            i0Var3 = i0Var;
                            j17 = j12;
                            kVar5 = kVar2;
                            z8 = z3;
                        }
                        sVar.q();
                        sVar.V(-565217106);
                        if (j11 != 16) {
                            j20 = j17;
                            b8 = j11;
                            z9 = false;
                        } else {
                            sVar.V(-565216333);
                            b8 = i0Var3.b();
                            if (b8 != 16) {
                                j20 = j17;
                            } else {
                                j20 = j17;
                                b8 = ((f1.s) sVar.j(g0.f3652a)).f2705a;
                            }
                            z9 = false;
                            sVar.p(false);
                        }
                        sVar.p(z9);
                        g2.i0 i0Var4 = i0Var3;
                        long j21 = j18;
                        long j22 = j19;
                        long j23 = j20;
                        boolean z10 = z8;
                        int i31 = i27;
                        y0.m mVar4 = mVar2;
                        int i32 = i30;
                        a.a.a(str, mVar4, g2.i0.d(i0Var4, b8, j20, kVar3, iVar2, j21, kVar5 != null ? kVar5.f6055a : Integer.MIN_VALUE, j22, 16609104), i32, z10, i26, i31, sVar, (i18 & 126) | 14380032 | ((i18 << 18) & 1879048192));
                        int i33 = i26;
                        iVar3 = iVar2;
                        j14 = j23;
                        i24 = i33;
                        i0Var2 = i0Var4;
                        mVar3 = mVar2;
                        j13 = j21;
                        z7 = z10;
                        i25 = i31;
                        kVar4 = kVar5;
                        j15 = j11;
                        i23 = i30;
                        j16 = j22;
                    }
                    r7 = sVar.r();
                    if (r7 == null) {
                        r7.f5121d = new p6.e() { // from class: j0.m2
                            @Override // p6.e
                            public final Object g(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int w7 = m0.b.w(i10 | 1);
                                int w8 = m0.b.w(i11);
                                n2.b(str, mVar3, j15, j14, iVar3, kVar3, j13, kVar4, j16, i23, z7, i24, i25, i0Var2, (m0.s) obj, w7, w8, i12);
                                return c6.m.f1757a;
                            }
                        };
                        return;
                    }
                    return;
                }
                i22 = i21;
                int i302 = 1;
                if (sVar.N(i18 & 1, (i18 & 306783379) == 306783378 || ((i20 | 5991808) & 4793491) != 4793490)) {
                }
                r7 = sVar.r();
                if (r7 == null) {
                }
            }
            j11 = j7;
            int i292 = i13 | 3072;
            i15 = i12 & 16;
            if (i15 != 0) {
            }
            i16 = i12 & 32;
            if (i16 != 0) {
            }
            i17 = i12 & 64;
            if (i17 != 0) {
            }
            i18 = i292 | 918552576;
            i19 = i12 & 1024;
            if (i19 != 0) {
            }
            i21 = i12 & 2048;
            if (i21 != 0) {
            }
            i22 = i21;
            int i3022 = 1;
            if (sVar.N(i18 & 1, (i18 & 306783379) == 306783378 || ((i20 | 5991808) & 4793491) != 4793490)) {
            }
            r7 = sVar.r();
            if (r7 == null) {
            }
        }
        mVar2 = mVar;
        i14 = i12 & 4;
        if (i14 == 0) {
        }
        j11 = j7;
        int i2922 = i13 | 3072;
        i15 = i12 & 16;
        if (i15 != 0) {
        }
        i16 = i12 & 32;
        if (i16 != 0) {
        }
        i17 = i12 & 64;
        if (i17 != 0) {
        }
        i18 = i2922 | 918552576;
        i19 = i12 & 1024;
        if (i19 != 0) {
        }
        i21 = i12 & 2048;
        if (i21 != 0) {
        }
        i22 = i21;
        int i30222 = 1;
        if (sVar.N(i18 & 1, (i18 & 306783379) == 306783378 || ((i20 | 5991808) & 4793491) != 4793490)) {
        }
        r7 = sVar.r();
        if (r7 == null) {
        }
    }
}
