package j0;

import androidx.compose.material3.MinimumInteractiveModifier;
import androidx.compose.material3.internal.ChildSemanticsNodeElement;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final u1.m f3765a = new u1.m(0, null);

    /* renamed from: b, reason: collision with root package name */
    public static final u1.m f3766b = new u1.m(1, null);

    /* renamed from: c, reason: collision with root package name */
    public static final i0.b f3767c = new i0.b();

    public static final void a(final p6.a aVar, final u0.c cVar, y0.m mVar, final p6.e eVar, final p6.e eVar2, final p6.e eVar3, final f1.i0 i0Var, long j7, long j8, long j9, long j10, float f6, u2.o oVar, m0.s sVar, final int i) {
        int i8;
        u0.c cVar2;
        p6.e eVar4;
        p6.e eVar5;
        final y0.m mVar2;
        final long j11;
        final long j12;
        final long j13;
        final long j14;
        final float f8;
        final u2.o oVar2;
        int i9;
        y0.m mVar3;
        long j15;
        long j16;
        long j17;
        long j18;
        float f9;
        u2.o oVar3;
        sVar.W(94478519);
        if ((i & 6) == 0) {
            i8 = (sVar.h(aVar) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            cVar2 = cVar;
            i8 |= sVar.h(cVar2) ? 32 : 16;
        } else {
            cVar2 = cVar;
        }
        int i10 = i8 | 384;
        if ((i & 3072) == 0) {
            eVar4 = eVar;
            i10 |= sVar.h(eVar4) ? 2048 : 1024;
        } else {
            eVar4 = eVar;
        }
        int i11 = i10 | 24576;
        if ((196608 & i) == 0) {
            eVar5 = eVar2;
            i11 |= sVar.h(eVar5) ? 131072 : 65536;
        } else {
            eVar5 = eVar2;
        }
        if ((1572864 & i) == 0) {
            i11 |= sVar.h(eVar3) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i11 |= sVar.f(i0Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i11 |= 33554432;
        }
        if ((805306368 & i) == 0) {
            i11 |= 268435456;
        }
        if (sVar.N(i11 & 1, (306783379 & i11) != 306783378)) {
            sVar.S();
            if ((i & 1) == 0 || sVar.x()) {
                float f10 = a.f3523a;
                long d8 = c0.d(l0.f.f4529c, sVar);
                long d9 = c0.d(l0.f.f4534h, sVar);
                i9 = i11 & (-2113929217);
                long d10 = c0.d(l0.f.f4530d, sVar);
                long d11 = c0.d(l0.f.f4532f, sVar);
                float f11 = a.f3523a;
                u2.o oVar4 = new u2.o();
                mVar3 = y0.j.f8705a;
                j15 = d8;
                j16 = d10;
                j17 = d9;
                j18 = d11;
                f9 = f11;
                oVar3 = oVar4;
            } else {
                sVar.Q();
                i9 = i11 & (-2113929217);
                mVar3 = mVar;
                j15 = j7;
                j17 = j8;
                j16 = j9;
                j18 = j10;
                f9 = f6;
                oVar3 = oVar;
            }
            sVar.q();
            y0.m mVar4 = mVar3;
            j.c(aVar, cVar2, mVar4, eVar4, eVar5, eVar3, i0Var, j15, j17, j16, j18, f9, oVar3, sVar, i9 & 2147483646, 3456);
            mVar2 = mVar4;
            oVar2 = oVar3;
            f8 = f9;
            j14 = j18;
            j13 = j16;
            j12 = j17;
            j11 = j15;
        } else {
            sVar.Q();
            mVar2 = mVar;
            j11 = j7;
            j12 = j8;
            j13 = j9;
            j14 = j10;
            f8 = f6;
            oVar2 = oVar;
        }
        m0.t1 r7 = sVar.r();
        if (r7 != null) {
            r7.f5121d = new p6.e() { // from class: j0.k
                @Override // p6.e
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int w7 = m0.b.w(i | 1);
                    m.a(p6.a.this, cVar, mVar2, eVar, eVar2, eVar3, i0Var, j11, j12, j13, j14, f8, oVar2, (m0.s) obj, w7);
                    return c6.m.f1757a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:162:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(p6.a aVar, y0.m mVar, boolean z3, f1.i0 i0Var, n nVar, s sVar, t.t tVar, x.f0 f0Var, p6.f fVar, m0.s sVar2, int i, int i8) {
        int i9;
        boolean z7;
        n nVar2;
        s sVar3;
        int i10;
        t.t tVar2;
        int i11;
        x.f0 f0Var2;
        int i12;
        boolean z8;
        s sVar4;
        t.t tVar3;
        x.f0 f0Var3;
        n nVar3;
        m0.t1 r7;
        int i13;
        int i14;
        s sVar5;
        int i15;
        boolean z9;
        n nVar4;
        s sVar6;
        n nVar5;
        long j7;
        int i16;
        v.j jVar;
        s sVar7;
        boolean z10;
        r.k kVar;
        int i17;
        int i18;
        int i19;
        sVar2.W(-1310015664);
        if ((i & 6) == 0) {
            i9 = (sVar2.h(aVar) ? 4 : 2) | i;
        } else {
            i9 = i;
        }
        if ((i & 48) == 0) {
            i9 |= sVar2.f(mVar) ? 32 : 16;
        }
        int i20 = i8 & 4;
        if (i20 != 0) {
            i9 |= 384;
        } else if ((i & 384) == 0) {
            z7 = z3;
            i9 |= sVar2.g(z7) ? 256 : 128;
            if ((i & 3072) == 0) {
                i9 |= sVar2.f(i0Var) ? 2048 : 1024;
            }
            if ((i & 24576) != 0) {
                if ((i8 & 16) == 0) {
                    nVar2 = nVar;
                    if (sVar2.f(nVar2)) {
                        i19 = 16384;
                        i9 |= i19;
                    }
                } else {
                    nVar2 = nVar;
                }
                i19 = 8192;
                i9 |= i19;
            } else {
                nVar2 = nVar;
            }
            if ((196608 & i) != 0) {
                if ((i8 & 32) == 0) {
                    sVar3 = sVar;
                    if (sVar2.f(sVar3)) {
                        i18 = 131072;
                        i9 |= i18;
                    }
                } else {
                    sVar3 = sVar;
                }
                i18 = 65536;
                i9 |= i18;
            } else {
                sVar3 = sVar;
            }
            i10 = i8 & 64;
            if (i10 == 0) {
                i9 |= 1572864;
            } else if ((1572864 & i) == 0) {
                tVar2 = tVar;
                i9 |= sVar2.f(tVar2) ? 1048576 : 524288;
                i11 = i8 & 128;
                if (i11 != 0) {
                    i9 |= 12582912;
                    f0Var2 = f0Var;
                } else {
                    f0Var2 = f0Var;
                    if ((i & 12582912) == 0) {
                        i9 |= sVar2.f(f0Var2) ? 8388608 : 4194304;
                    }
                }
                if ((i8 & 256) != 0) {
                    i9 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i9 |= sVar2.f(null) ? 67108864 : 33554432;
                }
                if ((i & 805306368) == 0) {
                    i9 |= sVar2.h(fVar) ? 536870912 : 268435456;
                }
                i12 = i9;
                if (sVar2.N(i12 & 1, (i9 & 306783379) != 306783378)) {
                    sVar2.S();
                    if ((i & 1) == 0 || sVar2.x()) {
                        if (i20 != 0) {
                            z7 = true;
                        }
                        if ((i8 & 16) != 0) {
                            x.g0 g0Var = o.f3805a;
                            i13 = i12 & (-57345);
                            nVar2 = o.b((b0) sVar2.j(c0.f3599a));
                        } else {
                            i13 = i12;
                        }
                        if ((i8 & 32) != 0) {
                            x.g0 g0Var2 = o.f3805a;
                            sVar5 = new s(l0.h.f4539b, l0.h.f4547k, l0.h.f4545h, l0.h.i, l0.h.f4541d);
                            i14 = i13 & (-458753);
                        } else {
                            i14 = i13;
                            sVar5 = sVar3;
                        }
                        if (i10 != 0) {
                            tVar2 = null;
                        }
                        if (i11 != 0) {
                            f0Var2 = o.f3805a;
                        }
                        i15 = i14;
                        z9 = z7;
                        nVar4 = nVar2;
                        sVar6 = sVar5;
                    } else {
                        sVar2.Q();
                        int i21 = (i8 & 16) != 0 ? i12 & (-57345) : i12;
                        if ((i8 & 32) != 0) {
                            i21 &= -458753;
                        }
                        i15 = i21;
                        nVar4 = nVar2;
                        sVar6 = sVar3;
                        z9 = z7;
                    }
                    sVar2.q();
                    sVar2.V(1691738187);
                    Object K = sVar2.K();
                    Object obj = m0.n.f5019a;
                    if (K == obj) {
                        K = new v.j();
                        sVar2.f0(K);
                    }
                    v.j jVar2 = (v.j) K;
                    sVar2.p(false);
                    x.f0 f0Var4 = f0Var2;
                    long j8 = z9 ? nVar4.f3794a : nVar4.f3796c;
                    t.t tVar4 = tVar2;
                    long j9 = z9 ? nVar4.f3795b : nVar4.f3797d;
                    if (sVar6 == null) {
                        sVar2.V(1691921830);
                        i17 = 0;
                        sVar2.p(false);
                        nVar5 = nVar4;
                        sVar7 = sVar6;
                        j7 = j8;
                        i16 = i15;
                        jVar = jVar2;
                        z10 = z9;
                        kVar = null;
                    } else {
                        sVar2.V(-499611205);
                        nVar5 = nVar4;
                        int i22 = ((i15 >> 9) & 896) | ((i15 >> 6) & 14);
                        Object K2 = sVar2.K();
                        if (K2 == obj) {
                            K2 = new w0.p();
                            sVar2.f0(K2);
                        }
                        w0.p pVar = (w0.p) K2;
                        boolean f6 = sVar2.f(jVar2);
                        j7 = j8;
                        Object K3 = sVar2.K();
                        if (f6 || K3 == obj) {
                            K3 = new q(jVar2, pVar, null, 0);
                            sVar2.f0(K3);
                        }
                        m0.b.f(jVar2, sVar2, (p6.e) K3);
                        v.h hVar = (v.h) d6.m.Y(pVar);
                        float f8 = !z9 ? sVar6.f3885e : hVar instanceof v.l ? sVar6.f3882b : hVar instanceof v.f ? sVar6.f3884d : hVar instanceof v.d ? sVar6.f3883c : sVar6.f3881a;
                        Object K4 = sVar2.K();
                        if (K4 == obj) {
                            jVar = jVar2;
                            i16 = i15;
                            K4 = new r.c(new r2.f(f8), r.d.f6264l, null, 12);
                            sVar2.f0(K4);
                        } else {
                            i16 = i15;
                            jVar = jVar2;
                        }
                        r.c cVar = (r.c) K4;
                        r2.f fVar2 = new r2.f(f8);
                        boolean h8 = sVar2.h(cVar) | sVar2.c(f8) | ((((i22 & 14) ^ 6) > 4 && sVar2.g(z9)) || (i22 & 6) == 4) | ((((i22 & 896) ^ 384) > 256 && sVar2.f(sVar6)) || (i22 & 384) == 256) | sVar2.h(hVar);
                        Object K5 = sVar2.K();
                        if (h8 || K5 == obj) {
                            sVar7 = sVar6;
                            z10 = z9;
                            K5 = new r(cVar, f8, z10, sVar7, hVar, null, 0);
                            sVar2.f0(K5);
                        } else {
                            sVar7 = sVar6;
                            z10 = z9;
                        }
                        m0.b.f(fVar2, sVar2, (p6.e) K5);
                        kVar = cVar.f6235c;
                        i17 = 0;
                        sVar2.p(false);
                    }
                    float f9 = kVar != null ? ((r2.f) kVar.f6331e.getValue()).f6520d : i17;
                    Object K6 = sVar2.K();
                    if (K6 == obj) {
                        K6 = new l(1);
                        sVar2.f0(K6);
                    }
                    int i23 = i16;
                    l2.b(aVar, d2.l.a(mVar, (p6.c) K6), z10, i0Var, j7, j9, f9, tVar4, jVar, u0.h.d(-535639973, new v(j9, f0Var4, fVar), sVar2), sVar2, (i23 & 8078) | ((i23 << 6) & 234881024));
                    f0Var3 = f0Var4;
                    tVar3 = tVar4;
                    z8 = z10;
                    sVar4 = sVar7;
                    nVar3 = nVar5;
                } else {
                    sVar2.Q();
                    z8 = z7;
                    sVar4 = sVar3;
                    tVar3 = tVar2;
                    f0Var3 = f0Var2;
                    nVar3 = nVar2;
                }
                r7 = sVar2.r();
                if (r7 != null) {
                    r7.f5121d = new z.b(aVar, mVar, z8, i0Var, nVar3, sVar4, tVar3, f0Var3, fVar, i, i8);
                    return;
                }
                return;
            }
            tVar2 = tVar;
            i11 = i8 & 128;
            if (i11 != 0) {
            }
            if ((i8 & 256) != 0) {
            }
            if ((i & 805306368) == 0) {
            }
            i12 = i9;
            if (sVar2.N(i12 & 1, (i9 & 306783379) != 306783378)) {
            }
            r7 = sVar2.r();
            if (r7 != null) {
            }
        }
        z7 = z3;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) != 0) {
        }
        if ((196608 & i) != 0) {
        }
        i10 = i8 & 64;
        if (i10 == 0) {
        }
        tVar2 = tVar;
        i11 = i8 & 128;
        if (i11 != 0) {
        }
        if ((i8 & 256) != 0) {
        }
        if ((i & 805306368) == 0) {
        }
        i12 = i9;
        if (sVar2.N(i12 & 1, (i9 & 306783379) != 306783378)) {
        }
        r7 = sVar2.r();
        if (r7 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(final p6.a aVar, final y0.m mVar, boolean z3, final f1.i0 i0Var, final w wVar, x xVar, final u0.c cVar, m0.s sVar, final int i, final int i8) {
        int i9;
        boolean z7;
        final x xVar2;
        int i10;
        final boolean z8;
        m0.t1 r7;
        boolean z9;
        int i11;
        sVar.W(2136075085);
        if ((i & 6) == 0) {
            i9 = (sVar.h(aVar) ? 4 : 2) | i;
        } else {
            i9 = i;
        }
        if ((i & 48) == 0) {
            i9 |= sVar.f(mVar) ? 32 : 16;
        }
        int i12 = i8 & 4;
        if (i12 != 0) {
            i9 |= 384;
        } else if ((i & 384) == 0) {
            z7 = z3;
            i9 |= sVar.g(z7) ? 256 : 128;
            if ((i & 3072) == 0) {
                i9 |= sVar.f(i0Var) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                i9 |= sVar.f(wVar) ? 16384 : 8192;
            }
            if ((196608 & i) != 0) {
                if ((i8 & 32) == 0) {
                    xVar2 = xVar;
                    if (sVar.f(xVar2)) {
                        i11 = 131072;
                        i9 |= i11;
                    }
                } else {
                    xVar2 = xVar;
                }
                i11 = 65536;
                i9 |= i11;
            } else {
                xVar2 = xVar;
            }
            i10 = i9 | 14155776;
            if ((100663296 & i) == 0) {
                i10 |= sVar.h(cVar) ? 67108864 : 33554432;
            }
            if (sVar.N(i10 & 1, (38347923 & i10) == 38347922)) {
                sVar.Q();
                z8 = z7;
            } else {
                sVar.S();
                if ((i & 1) == 0 || sVar.x()) {
                    boolean z10 = i12 == 0 ? z7 : true;
                    if ((i8 & 32) != 0) {
                        i10 &= -458753;
                        xVar2 = k(63, 0.0f);
                    }
                    z9 = z10;
                } else {
                    sVar.Q();
                    if ((i8 & 32) != 0) {
                        i10 &= -458753;
                    }
                    z9 = z7;
                }
                sVar.q();
                sVar.V(1577885006);
                Object K = sVar.K();
                if (K == m0.n.f5019a) {
                    K = new v.j();
                    sVar.f0(K);
                }
                v.j jVar = (v.j) K;
                sVar.p(false);
                l2.b(aVar, mVar, z9, i0Var, z9 ? wVar.f3929a : wVar.f3931c, z9 ? wVar.f3930b : wVar.f3932d, ((r2.f) xVar2.a(z9, jVar, sVar, ((i10 >> 9) & 896) | ((i10 >> 6) & 14)).getValue()).f6520d, null, jVar, u0.h.d(-1347531112, new a0(cVar, 1), sVar), sVar, (i10 & 8190) | ((i10 << 6) & 234881024));
                z8 = z9;
            }
            r7 = sVar.r();
            if (r7 == null) {
                r7.f5121d = new p6.e() { // from class: j0.y
                    @Override // p6.e
                    public final Object g(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        m.c(p6.a.this, mVar, z8, i0Var, wVar, xVar2, cVar, (m0.s) obj, m0.b.w(i | 1), i8);
                        return c6.m.f1757a;
                    }
                };
                return;
            }
            return;
        }
        z7 = z3;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) != 0) {
        }
        i10 = i9 | 14155776;
        if ((100663296 & i) == 0) {
        }
        if (sVar.N(i10 & 1, (38347923 & i10) == 38347922)) {
        }
        r7 = sVar.r();
        if (r7 == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x009a, code lost:
    
        if ((r25 & 8) != 0) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(final y0.m mVar, final f1.i0 i0Var, final w wVar, x xVar, final u0.c cVar, m0.s sVar, final int i, final int i8) {
        y0.m mVar2;
        int i9;
        final x xVar2;
        int i10;
        sVar.W(1359693790);
        if ((i & 6) == 0) {
            mVar2 = mVar;
            i9 = (sVar.f(mVar2) ? 4 : 2) | i;
        } else {
            mVar2 = mVar;
            i9 = i;
        }
        if ((i & 48) == 0) {
            i9 |= sVar.f(i0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i9 |= sVar.f(wVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            if ((i8 & 8) == 0) {
                xVar2 = xVar;
                if (sVar.f(xVar2)) {
                    i10 = 2048;
                    i9 |= i10;
                }
            } else {
                xVar2 = xVar;
            }
            i10 = 1024;
            i9 |= i10;
        } else {
            xVar2 = xVar;
        }
        int i11 = i9 | 24576;
        if ((196608 & i) == 0) {
            i11 |= sVar.h(cVar) ? 131072 : 65536;
        }
        if (sVar.N(i11 & 1, (74899 & i11) != 74898)) {
            sVar.S();
            if ((i & 1) == 0 || sVar.x()) {
                if ((i8 & 8) != 0) {
                    xVar2 = k(63, 0.0f);
                    i11 &= -7169;
                }
                sVar.q();
                l2.a(mVar2, i0Var, wVar.f3929a, wVar.f3930b, 0.0f, ((r2.f) xVar2.a(true, null, sVar, ((i11 >> 3) & 896) | 54).getValue()).f6520d, u0.h.d(-97109725, new a0(cVar, 0), sVar), sVar, (i11 & 14) | 12582912 | (i11 & 112) | ((i11 << 6) & 3670016), 16);
            } else {
                sVar.Q();
            }
        } else {
            sVar.Q();
        }
        m0.t1 r7 = sVar.r();
        if (r7 != null) {
            r7.f5121d = new p6.e() { // from class: j0.z
                @Override // p6.e
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    m.d(y0.m.this, i0Var, wVar, xVar2, cVar, (m0.s) obj, m0.b.w(i | 1), i8);
                    return c6.m.f1757a;
                }
            };
        }
    }

    public static final void e(final y0.m mVar, final float f6, final long j7, m0.s sVar, final int i) {
        float f8;
        sVar.W(1562471785);
        int i8 = (sVar.e(j7) ? 256 : 128) | i;
        if (sVar.N(i8 & 1, (i8 & 147) != 146)) {
            sVar.S();
            if ((i & 1) != 0 && !sVar.x()) {
                sVar.Q();
            }
            sVar.q();
            if (r2.f.a(f6, 0.0f)) {
                sVar.V(-1258250053);
                f8 = 1.0f / ((r2.c) sVar.j(x1.b1.f8370h)).b();
                sVar.p(false);
            } else {
                sVar.V(-1258183496);
                sVar.p(false);
                f8 = f6;
            }
            x.k.a(androidx.compose.foundation.a.b(androidx.compose.foundation.layout.a.e(androidx.compose.foundation.layout.a.d(mVar, 1.0f), f8), j7, f1.p.f2693a), sVar, 0);
        } else {
            sVar.Q();
        }
        m0.t1 r7 = sVar.r();
        if (r7 != null) {
            r7.f5121d = new p6.e(f6, j7, i) { // from class: j0.n0

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ float f3799e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ long f3800f;

                @Override // p6.e
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int w7 = m0.b.w(55);
                    m.e(y0.m.this, this.f3799e, this.f3800f, (m0.s) obj, w7);
                    return c6.m.f1757a;
                }
            };
        }
    }

    public static final void f(final int i, f1.i0 i0Var, p0 p0Var, m0.s sVar, final p6.a aVar, y0.m mVar, boolean z3) {
        final f1.i0 i0Var2;
        final p0 p0Var2;
        final y0.m mVar2;
        final boolean z7;
        p0 p0Var3;
        p0 p0Var4;
        f1.i0 i0Var3;
        float f6 = l0.o.f4580g;
        sVar.W(1413012038);
        int i8 = i | 91568;
        if (sVar.N(i8 & 1, (599187 & i8) != 599186)) {
            sVar.S();
            if ((i & 1) == 0 || sVar.x()) {
                long j7 = ((f1.s) sVar.j(g0.f3652a)).f2705a;
                b0 b0Var = (b0) sVar.j(c0.f3599a);
                p0 p0Var5 = b0Var.f3556a0;
                if (p0Var5 == null) {
                    long j8 = f1.s.f2703g;
                    p0 p0Var6 = new p0(j8, j7, j8, f1.s.b(j7, f6));
                    b0Var.f3556a0 = p0Var6;
                    p0Var5 = p0Var6;
                }
                long j9 = p0Var5.f3847b;
                if (f1.s.c(j9, j7)) {
                    p0Var3 = p0Var5;
                } else {
                    long b8 = f1.s.b(j7, f6);
                    long j10 = p0Var5.f3846a;
                    long j11 = p0Var5.f3848c;
                    if (j7 == 16) {
                        j7 = j9;
                    }
                    if (b8 == 16) {
                        b8 = p0Var5.f3849d;
                    }
                    p0Var3 = new p0(j10, j7, j11, b8);
                }
                f1.i0 a8 = h2.a(l0.s.f4619b, sVar);
                z7 = true;
                p0Var4 = p0Var3;
                mVar2 = y0.j.f8705a;
                i0Var3 = a8;
            } else {
                sVar.Q();
                i0Var3 = i0Var;
                p0Var4 = p0Var;
                mVar2 = mVar;
                z7 = z3;
            }
            sVar.q();
            g(1769910, i0Var3, p0Var4, sVar, aVar, mVar2, z7);
            p0Var2 = p0Var4;
            i0Var2 = i0Var3;
        } else {
            sVar.Q();
            i0Var2 = i0Var;
            p0Var2 = p0Var;
            mVar2 = mVar;
            z7 = z3;
        }
        m0.t1 r7 = sVar.r();
        if (r7 != null) {
            r7.f5121d = new p6.e(i, i0Var2, p0Var2, aVar, mVar2, z7) { // from class: j0.q0

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ p6.a f3860d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ y0.m f3861e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ boolean f3862f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ p0 f3863g;

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ f1.i0 f3864h;

                {
                    this.f3860d = aVar;
                    this.f3861e = mVar2;
                    this.f3862f = z7;
                    this.f3863g = p0Var2;
                    this.f3864h = i0Var2;
                }

                @Override // p6.e
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    m.f(m0.b.w(1572871), this.f3864h, this.f3863g, (m0.s) obj, this.f3860d, this.f3861e, this.f3862f);
                    return c6.m.f1757a;
                }
            };
        }
    }

    public static final void g(final int i, final f1.i0 i0Var, final p0 p0Var, m0.s sVar, final p6.a aVar, final y0.m mVar, final boolean z3) {
        int i8;
        u0.c cVar = b6.k.f1364j;
        sVar.W(-1134296466);
        if ((i & 6) == 0) {
            i8 = (sVar.f(mVar) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= sVar.h(aVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i8 |= sVar.g(z3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i8 |= sVar.f(i0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i8 |= sVar.f(p0Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i8 |= sVar.f(null) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i8 |= sVar.h(cVar) ? 1048576 : 524288;
        }
        int i9 = i8;
        if (sVar.N(i9 & 1, (599187 & i9) != 599186)) {
            sVar.V(977045485);
            Object K = sVar.K();
            if (K == m0.n.f5019a) {
                K = new v.j();
                sVar.f0(K);
            }
            v.j jVar = (v.j) K;
            sVar.p(false);
            u1.k kVar = x0.f3942a;
            y0.m d8 = mVar.d(MinimumInteractiveModifier.f537a);
            float f6 = l0.s.f4620c;
            long floatToRawIntBits = (Float.floatToRawIntBits(l0.s.f4621d + (f6 + f6)) << 32) | (Float.floatToRawIntBits(l0.s.f4618a) & 4294967295L);
            y0.m d9 = androidx.compose.foundation.a.c(androidx.compose.foundation.a.b(a.a.f(androidx.compose.foundation.layout.a.k(d8, Float.intBitsToFloat((int) (floatToRawIntBits >> 32)), Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L))), i0Var), z3 ? p0Var.f3846a : p0Var.f3848c, i0Var), jVar, w1.a(), z3, new d2.g(0), aVar, 8).d(new ChildSemanticsNodeElement(new l(2)));
            u1.e0 d10 = x.k.d(y0.b.f8685h, false);
            int hashCode = Long.hashCode(sVar.T);
            m0.o1 l3 = sVar.l();
            y0.m a02 = r2.o.a0(sVar, d9);
            w1.i.f7684c.getClass();
            p6.a aVar2 = w1.h.f7675b;
            sVar.Y();
            if (sVar.S) {
                sVar.k(aVar2);
            } else {
                sVar.i0();
            }
            m0.b.u(d10, sVar, w1.h.f7678e);
            m0.b.u(l3, sVar, w1.h.f7677d);
            w1.g gVar = w1.h.f7679f;
            if (sVar.S || !q6.i.a(sVar.K(), Integer.valueOf(hashCode))) {
                a0.q.n(hashCode, sVar, hashCode, gVar);
            }
            m0.b.u(a02, sVar, w1.h.f7676c);
            m0.b.a(g0.f3652a.a(new f1.s(z3 ? p0Var.f3847b : p0Var.f3849d)), cVar, sVar, ((i9 >> 15) & 112) | 8);
            sVar.p(true);
        } else {
            sVar.Q();
        }
        m0.t1 r7 = sVar.r();
        if (r7 != null) {
            r7.f5121d = new p6.e() { // from class: j0.r0
                @Override // p6.e
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    m.g(m0.b.w(i | 1), i0Var, p0Var, (m0.s) obj, aVar, mVar, z3);
                    return c6.m.f1757a;
                }
            };
        }
    }

    public static final void h(p6.a aVar, y0.m mVar, boolean z3, f1.i0 i0Var, n nVar, t.t tVar, x.f0 f0Var, m0.s sVar, int i) {
        p6.a aVar2;
        int i8;
        y0.m mVar2;
        f1.i0 i0Var2;
        boolean z7;
        n nVar2;
        t.t tVar2;
        x.f0 f0Var2;
        int i9;
        int i10;
        x.f0 f0Var3;
        n nVar3;
        u0.c cVar = b6.k.f1367m;
        sVar.W(399974542);
        if ((i & 6) == 0) {
            aVar2 = aVar;
            i8 = (sVar.h(aVar2) ? 4 : 2) | i;
        } else {
            aVar2 = aVar;
            i8 = i;
        }
        if ((i & 48) == 0) {
            mVar2 = mVar;
            i8 |= sVar.f(mVar2) ? 32 : 16;
        } else {
            mVar2 = mVar;
        }
        int i11 = i8 | 384;
        if ((i & 3072) == 0) {
            i0Var2 = i0Var;
            i11 |= sVar.f(i0Var2) ? 2048 : 1024;
        } else {
            i0Var2 = i0Var;
        }
        if ((i & 24576) == 0) {
            i11 |= 8192;
        }
        int i12 = 196608 | i11;
        if ((1572864 & i) == 0) {
            i12 = 720896 | i11;
        }
        int i13 = 113246208 | i12;
        if ((805306368 & i) == 0) {
            i13 |= sVar.h(cVar) ? 536870912 : 268435456;
        }
        boolean z8 = true;
        if (sVar.N(i13 & 1, (306783379 & i13) != 306783378)) {
            sVar.S();
            if ((i & 1) == 0 || sVar.x()) {
                x.g0 g0Var = o.f3805a;
                b0 b0Var = (b0) sVar.j(c0.f3599a);
                n nVar4 = b0Var.X;
                if (nVar4 == null) {
                    long j7 = f1.s.f2703g;
                    i9 = -3727361;
                    n nVar5 = new n(j7, c0.c(b0Var, l0.o.f4576c), j7, f1.s.b(c0.c(b0Var, l0.o.f4574a), l0.o.f4575b));
                    b0Var.X = nVar5;
                    nVar4 = nVar5;
                } else {
                    i9 = -3727361;
                }
                float f6 = l0.b.f4464c;
                sVar.V(-112346942);
                long d8 = c0.d(l0.o.f4577d, sVar);
                sVar.p(false);
                tVar2 = new t.t(f6, new f1.k0(d8));
                i10 = i13 & i9;
                f0Var3 = o.f3805a;
                nVar3 = nVar4;
            } else {
                sVar.Q();
                z8 = z3;
                nVar3 = nVar;
                tVar2 = tVar;
                i10 = i13 & (-3727361);
                f0Var3 = f0Var;
            }
            sVar.q();
            boolean z9 = z8;
            f0Var2 = f0Var3;
            b(aVar2, mVar2, z9, i0Var2, nVar3, null, tVar2, f0Var2, cVar, sVar, 2147483646 & i10, 0);
            z7 = z9;
            nVar2 = nVar3;
        } else {
            sVar.Q();
            z7 = z3;
            nVar2 = nVar;
            tVar2 = tVar;
            f0Var2 = f0Var;
        }
        m0.t1 r7 = sVar.r();
        if (r7 != null) {
            r7.f5121d = new t(aVar, mVar, z7, i0Var, nVar2, tVar2, f0Var2, i);
        }
    }

    public static final void i(final p6.a aVar, y0.m mVar, boolean z3, f1.i0 i0Var, n nVar, x.f0 f0Var, m0.s sVar, final int i) {
        final y0.m mVar2;
        final boolean z7;
        final f1.i0 i0Var2;
        final n nVar2;
        final x.f0 f0Var2;
        n nVar3;
        int i8;
        x.f0 f0Var3;
        boolean z8;
        f1.i0 i0Var3;
        y0.m mVar3;
        n nVar4;
        u0.c cVar = b6.k.f1361f;
        sVar.W(-1061374109);
        int i9 = i | (sVar.h(aVar) ? 4 : 2) | 115025328;
        if (sVar.N(i9 & 1, (306783379 & i9) != 306783378)) {
            sVar.S();
            if ((i & 1) == 0 || sVar.x()) {
                x.g0 g0Var = o.f3805a;
                f1.i0 a8 = h2.a(l0.b.f4463b, sVar);
                b0 b0Var = (b0) sVar.j(c0.f3599a);
                n nVar5 = b0Var.Y;
                if (nVar5 == null) {
                    long j7 = f1.s.f2703g;
                    nVar3 = new n(j7, c0.c(b0Var, l0.e.i), j7, f1.s.b(c0.c(b0Var, l0.o.f4578e), l0.o.f4579f));
                    b0Var.Y = nVar3;
                } else {
                    nVar3 = nVar5;
                }
                i8 = i9 & (-64513);
                f0Var3 = o.f3806b;
                z8 = true;
                i0Var3 = a8;
                mVar3 = y0.j.f8705a;
                nVar4 = nVar3;
            } else {
                sVar.Q();
                i8 = i9 & (-64513);
                mVar3 = mVar;
                z8 = z3;
                i0Var3 = i0Var;
                nVar4 = nVar;
                f0Var3 = f0Var;
            }
            sVar.q();
            b(aVar, mVar3, z8, i0Var3, nVar4, null, null, f0Var3, cVar, sVar, i8 & 2147483646, 0);
            mVar2 = mVar3;
            z7 = z8;
            i0Var2 = i0Var3;
            nVar2 = nVar4;
            f0Var2 = f0Var3;
        } else {
            sVar.Q();
            mVar2 = mVar;
            z7 = z3;
            i0Var2 = i0Var;
            nVar2 = nVar;
            f0Var2 = f0Var;
        }
        m0.t1 r7 = sVar.r();
        if (r7 != null) {
            r7.f5121d = new p6.e(mVar2, z7, i0Var2, nVar2, f0Var2, i) { // from class: j0.u

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ y0.m f3916e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ boolean f3917f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ f1.i0 f3918g;

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ n f3919h;
                public final /* synthetic */ x.f0 i;

                @Override // p6.e
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int w7 = m0.b.w(805306369);
                    m.i(p6.a.this, this.f3916e, this.f3917f, this.f3918g, this.f3919h, this.i, (m0.s) obj, w7);
                    return c6.m.f1757a;
                }
            };
        }
    }

    public static w j(long j7, m0.s sVar, int i) {
        long j8;
        long b8 = c0.b(j7, sVar);
        long j9 = f1.s.f2704h;
        long b9 = f1.s.b(b8, 0.38f);
        b0 b0Var = (b0) sVar.j(c0.f3599a);
        w wVar = b0Var.Z;
        if (wVar == null) {
            l0.e eVar = l0.i.f4548a;
            j8 = b8;
            w wVar2 = new w(c0.c(b0Var, eVar), c0.a(b0Var, c0.c(b0Var, eVar)), f1.p.h(f1.s.b(c0.c(b0Var, l0.i.f4550c), l0.i.f4552e), c0.c(b0Var, eVar)), f1.s.b(c0.a(b0Var, c0.c(b0Var, eVar)), 0.38f));
            b0Var.Z = wVar2;
            wVar = wVar2;
        } else {
            j8 = b8;
        }
        long j10 = j7 != 16 ? j7 : wVar.f3929a;
        long j11 = j8 != 16 ? j8 : wVar.f3930b;
        if (j9 == 16) {
            j9 = wVar.f3931c;
        }
        long j12 = j9;
        if (b9 == 16) {
            b9 = wVar.f3932d;
        }
        return new w(j10, j11, j12, b9);
    }

    public static x k(int i, float f6) {
        if ((i & 1) != 0) {
            f6 = l0.i.f4549b;
        }
        return new x(f6, l0.i.i, l0.i.f4554g, l0.i.f4555h, l0.i.f4553f, l0.i.f4551d);
    }

    public static final r.u0 l(l0.k kVar, m0.s sVar) {
        d1 d1Var = (d1) sVar.j(z0.f3976a);
        int ordinal = kVar.ordinal();
        if (ordinal == 0) {
            ((c1) d1Var).getClass();
            r.u0 u0Var = c1.f3602b;
            q6.i.c(u0Var, "null cannot be cast to non-null type androidx.compose.animation.core.FiniteAnimationSpec<T of androidx.compose.material3.MotionScheme.StandardMotionSchemeImpl.defaultSpatialSpec>");
            return u0Var;
        }
        if (ordinal == 1) {
            ((c1) d1Var).getClass();
            r.u0 u0Var2 = c1.f3603c;
            q6.i.c(u0Var2, "null cannot be cast to non-null type androidx.compose.animation.core.FiniteAnimationSpec<T of androidx.compose.material3.MotionScheme.StandardMotionSchemeImpl.fastSpatialSpec>");
            return u0Var2;
        }
        if (ordinal == 2) {
            ((c1) d1Var).getClass();
            r.u0 u0Var3 = c1.f3604d;
            q6.i.c(u0Var3, "null cannot be cast to non-null type androidx.compose.animation.core.FiniteAnimationSpec<T of androidx.compose.material3.MotionScheme.StandardMotionSchemeImpl.slowSpatialSpec>");
            return u0Var3;
        }
        if (ordinal == 3) {
            ((c1) d1Var).getClass();
            r.u0 u0Var4 = c1.f3605e;
            q6.i.c(u0Var4, "null cannot be cast to non-null type androidx.compose.animation.core.FiniteAnimationSpec<T of androidx.compose.material3.MotionScheme.StandardMotionSchemeImpl.defaultEffectsSpec>");
            return u0Var4;
        }
        if (ordinal == 4) {
            ((c1) d1Var).getClass();
            r.u0 u0Var5 = c1.f3606f;
            q6.i.c(u0Var5, "null cannot be cast to non-null type androidx.compose.animation.core.FiniteAnimationSpec<T of androidx.compose.material3.MotionScheme.StandardMotionSchemeImpl.fastEffectsSpec>");
            return u0Var5;
        }
        if (ordinal != 5) {
            throw new a5.c();
        }
        ((c1) d1Var).getClass();
        r.u0 u0Var6 = c1.f3607g;
        q6.i.c(u0Var6, "null cannot be cast to non-null type androidx.compose.animation.core.FiniteAnimationSpec<T of androidx.compose.material3.MotionScheme.StandardMotionSchemeImpl.slowEffectsSpec>");
        return u0Var6;
    }
}
