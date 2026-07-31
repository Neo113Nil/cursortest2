package w1;

import java.util.Map;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class n0 extends u1.l0 implements u1.g0, y0 {
    public k0 i;

    /* renamed from: j, reason: collision with root package name */
    public p6.c f7726j;

    /* renamed from: k, reason: collision with root package name */
    public o1 f7727k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f7728l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f7729m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f7730n;

    /* renamed from: o, reason: collision with root package name */
    public final u1.b0 f7731o = new u1.b0(0, this);

    /* renamed from: p, reason: collision with root package name */
    public l.n f7732p;

    /* renamed from: q, reason: collision with root package name */
    public o.j0 f7733q;

    public static void q0(d1 d1Var) {
        g0 g0Var;
        d1 d1Var2 = d1Var.f7615s;
        f0 f0Var = d1Var.f7614r;
        if (!q6.i.a(d1Var2 != null ? d1Var2.f7614r : null, f0Var)) {
            f0Var.G.f7700p.f7816z.f();
            return;
        }
        a o2 = f0Var.G.f7700p.o();
        if (o2 == null || (g0Var = ((w0) o2).f7816z) == null) {
            return;
        }
        g0Var.f();
    }

    @Override // u1.g0
    public final u1.f0 J(int i, int i8, Map map, p6.c cVar, p6.c cVar2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i8) != 0) {
            t1.a.b("Size(" + i + " x " + i8 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new m0(i, i8, map, cVar, cVar2, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z(f0 f0Var, u1.m mVar) {
        char c8;
        long j7;
        long j8;
        long j9;
        o.j0 j0Var;
        o.j0 j0Var2;
        Object g3;
        long[] jArr;
        long[] jArr2;
        long j10;
        int i;
        char c9;
        long j11;
        long j12;
        int i8;
        int i9;
        int i10;
        o.j0 j0Var3 = this.f7733q;
        char c10 = 7;
        long j13 = -9187201950435737472L;
        int i11 = 8;
        if (j0Var3 != null) {
            Object[] objArr = j0Var3.f5484c;
            long[] jArr3 = j0Var3.f5482a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i12 = 0;
                long j14 = 128;
                while (true) {
                    long j15 = jArr3[i12];
                    j8 = 255;
                    if ((((~j15) << c10) & j15 & j13) != j13) {
                        int i13 = 8 - ((~(i12 - length)) >>> 31);
                        int i14 = 0;
                        while (i14 < i13) {
                            if ((j15 & 255) < j14) {
                                c9 = c10;
                                o.k0 k0Var = (o.k0) objArr[(i12 << 3) + i14];
                                j11 = j13;
                                Object[] objArr2 = k0Var.f5490b;
                                long[] jArr4 = k0Var.f5489a;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j12 = j14;
                                    int i15 = 0;
                                    int i16 = i11;
                                    while (true) {
                                        int i17 = length2;
                                        long j16 = jArr4[i15];
                                        jArr2 = jArr3;
                                        j10 = j15;
                                        if ((((~j16) << c9) & j16 & j11) != j11) {
                                            int i18 = 8 - ((~(i15 - i17)) >>> 31);
                                            int i19 = 0;
                                            while (i19 < i18) {
                                                if ((j16 & 255) < j12) {
                                                    int i20 = (i15 << 3) + i19;
                                                    f0 f0Var2 = (f0) ((z1) objArr2[i20]).get();
                                                    i9 = i19;
                                                    if (f0Var2 != null) {
                                                        boolean G = f0Var2.G();
                                                        i10 = i14;
                                                        if (G) {
                                                        }
                                                    } else {
                                                        i10 = i14;
                                                    }
                                                    k0Var.m(i20);
                                                } else {
                                                    i9 = i19;
                                                    i10 = i14;
                                                }
                                                j16 >>= i16;
                                                i19 = i9 + 1;
                                                i14 = i10;
                                            }
                                            i = i14;
                                            if (i18 != i16) {
                                                break;
                                            }
                                        } else {
                                            i = i14;
                                        }
                                        length2 = i17;
                                        if (i15 == length2) {
                                            break;
                                        }
                                        i15++;
                                        jArr3 = jArr2;
                                        j15 = j10;
                                        i14 = i;
                                        i16 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    j10 = j15;
                                    i = i14;
                                    j12 = j14;
                                }
                                i8 = 8;
                            } else {
                                jArr2 = jArr3;
                                j10 = j15;
                                i = i14;
                                c9 = c10;
                                j11 = j13;
                                j12 = j14;
                                i8 = i11;
                            }
                            i11 = i8;
                            j15 = j10 >> i8;
                            c10 = c9;
                            j13 = j11;
                            j14 = j12;
                            i14 = i + 1;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        c8 = c10;
                        j7 = j13;
                        j9 = j14;
                        if (i13 != i11) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        c8 = c10;
                        j7 = j13;
                        j9 = j14;
                    }
                    if (i12 == length) {
                        break;
                    }
                    i12++;
                    c10 = c8;
                    j13 = j7;
                    j14 = j9;
                    jArr3 = jArr;
                    i11 = 8;
                }
                j0Var = this.f7733q;
                if (j0Var != null) {
                    long[] jArr5 = j0Var.f5482a;
                    int length3 = jArr5.length - 2;
                    if (length3 >= 0) {
                        int i21 = 0;
                        while (true) {
                            long j17 = jArr5[i21];
                            if ((((~j17) << c8) & j17 & j7) != j7) {
                                int i22 = 8 - ((~(i21 - length3)) >>> 31);
                                for (int i23 = 0; i23 < i22; i23++) {
                                    if ((j17 & j8) < j9) {
                                        int i24 = (i21 << 3) + i23;
                                        if (((o.k0) j0Var.f5484c[i24]).g()) {
                                            j0Var.l(i24);
                                        }
                                    }
                                    j17 >>= 8;
                                }
                                if (i22 != 8) {
                                    break;
                                }
                            }
                            if (i21 == length3) {
                                break;
                            } else {
                                i21++;
                            }
                        }
                    }
                }
                j0Var2 = this.f7733q;
                if (j0Var2 == null) {
                    j0Var2 = new o.j0();
                    this.f7733q = j0Var2;
                }
                g3 = j0Var2.g(mVar);
                if (g3 == null) {
                    g3 = new o.k0();
                    j0Var2.m(mVar, g3);
                }
                ((o.k0) g3).j(new z1(f0Var));
            }
        }
        c8 = 7;
        j7 = -9187201950435737472L;
        j8 = 255;
        j9 = 128;
        j0Var = this.f7733q;
        if (j0Var != null) {
        }
        j0Var2 = this.f7733q;
        if (j0Var2 == null) {
        }
        g3 = j0Var2.g(mVar);
        if (g3 == null) {
        }
        ((o.k0) g3).j(new z1(f0Var));
    }

    public abstract int b0(u1.a aVar);

    /* JADX WARN: Multi-variable type inference failed */
    public final void f0(o1 o1Var, long j7, long j8) {
        char c8;
        long j9;
        long j10;
        long j11;
        f0 f0Var;
        int i;
        char c9;
        long j12;
        n0 n02;
        m1 snapshotObserver;
        o.j0 j0Var = this.f7733q;
        l.n nVar = this.f7732p;
        if (nVar == null) {
            nVar = new l.n();
            this.f7732p = nVar;
        }
        l.n nVar2 = nVar;
        k1 k1Var = l0().f7650p;
        if (k1Var != null && (snapshotObserver = ((x1.t) k1Var).getSnapshotObserver()) != null) {
            snapshotObserver.a(o1Var, e.f7624g, new l0(this, j7, j8, o1Var));
        }
        boolean p7 = p();
        o.k0 k0Var = (o.k0) nVar2.f4352e;
        o.k0 k0Var2 = (o.k0) nVar2.f4353f;
        int i8 = nVar2.f4348a;
        for (int i9 = 0; i9 < i8; i9++) {
            byte b8 = ((byte[]) nVar2.f4351d)[i9];
            if (b8 == 3) {
                u1.m mVar = ((u1.m[]) nVar2.f4349b)[i9];
                q6.i.b(mVar);
                k0Var2.j(mVar);
            } else if (b8 != 0 && j0Var != null) {
                u1.m mVar2 = ((u1.m[]) nVar2.f4349b)[i9];
                q6.i.b(mVar2);
                o.k0 k0Var3 = (o.k0) j0Var.k(mVar2);
                if (k0Var3 != null) {
                    k0Var.k(k0Var3);
                }
            }
        }
        int i10 = nVar2.f4348a;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            byte[] bArr = (byte[]) nVar2.f4351d;
            if (bArr[i12] == 2) {
                i11++;
            } else if (i11 > 0) {
                u1.m[] mVarArr = (u1.m[]) nVar2.f4349b;
                mVarArr[i12 - i11] = mVarArr[i12];
            }
            bArr[i12] = 2;
        }
        int i13 = nVar2.f4348a;
        for (int i14 = i13 - i11; i14 < i13; i14++) {
            ((u1.m[]) nVar2.f4349b)[i14] = null;
        }
        nVar2.f4348a -= i11;
        n0 n03 = n0();
        Object[] objArr = k0Var2.f5490b;
        long[] jArr = k0Var2.f5489a;
        int length = jArr.length - 2;
        char c10 = 7;
        long j13 = -9187201950435737472L;
        int i15 = 8;
        if (length >= 0) {
            j10 = 128;
            int i16 = 0;
            while (true) {
                long j14 = jArr[i16];
                j11 = 255;
                if ((((~j14) << c10) & j14 & j13) != j13) {
                    int i17 = 8 - ((~(i16 - length)) >>> 31);
                    int i18 = 0;
                    while (i18 < i17) {
                        if ((j14 & 255) < 128) {
                            c9 = c10;
                            u1.m mVar3 = (u1.m) objArr[(i16 << 3) + i18];
                            j12 = j13;
                            n0 n0Var = n03 == null ? this : n03;
                            i = i15;
                            n0 n0Var2 = n0Var;
                            while (true) {
                                l.n nVar3 = n0Var2.f7732p;
                                if ((nVar3 == null || d6.l.P((u1.m[]) nVar3.f4349b, mVar3) < 0) && (n02 = n0Var2.n0()) != null) {
                                    n0Var2 = n02;
                                }
                            }
                            o.j0 j0Var2 = n0Var2.f7733q;
                            o.k0 k0Var4 = j0Var2 != null ? (o.k0) j0Var2.k(mVar3) : null;
                            if (k0Var4 != null) {
                                n0Var.r0(k0Var4);
                            }
                        } else {
                            i = i15;
                            c9 = c10;
                            j12 = j13;
                        }
                        j14 >>= i;
                        i18++;
                        c10 = c9;
                        j13 = j12;
                        i15 = i;
                    }
                    c8 = c10;
                    j9 = j13;
                    if (i17 != i15) {
                        break;
                    }
                } else {
                    c8 = c10;
                    j9 = j13;
                }
                if (i16 == length) {
                    break;
                }
                i16++;
                c10 = c8;
                j13 = j9;
                i15 = 8;
            }
        } else {
            c8 = 7;
            j9 = -9187201950435737472L;
            j10 = 128;
            j11 = 255;
        }
        k0Var2.b();
        Object[] objArr2 = k0Var.f5490b;
        long[] jArr2 = k0Var.f5489a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i19 = 0;
            while (true) {
                long j15 = jArr2[i19];
                if ((((~j15) << c8) & j15 & j9) != j9) {
                    int i20 = 8 - ((~(i19 - length2)) >>> 31);
                    for (int i21 = 0; i21 < i20; i21++) {
                        if ((j15 & j11) < j10 && (f0Var = (f0) ((z1) objArr2[(i19 << 3) + i21]).get()) != null) {
                            if (p7) {
                                f0Var.R(false);
                            } else {
                                f0Var.T(false);
                            }
                        }
                        j15 >>= 8;
                    }
                    if (i20 != 8) {
                        break;
                    }
                }
                if (i19 == length2) {
                    break;
                } else {
                    i19++;
                }
            }
        }
        k0Var.b();
    }

    public final void g0(u1.f0 f0Var) {
        long j7;
        long j8;
        o.j0 j0Var = this.f7733q;
        if (!this.f7730n) {
            p6.c d8 = f0Var.d();
            if (d8 != null) {
                boolean z3 = this.f7726j != d8;
                if (z3 || !p0().f7702d) {
                    j7 = 0;
                    j8 = 9223372034707292159L;
                } else {
                    u1.p j02 = j0();
                    long K = m.a.K(j02.d(0L));
                    long G = j02.G();
                    j8 = K;
                    j7 = G;
                    z3 = (r2.i.a(K, p0().f7703e) && r2.k.a(G, p0().f7704f)) ? false : true;
                }
                if (z3) {
                    o1 o1Var = this.f7727k;
                    if (o1Var != null) {
                        o1Var.f7743d = f0Var;
                    } else {
                        o1Var = new o1(f0Var, this);
                        this.f7727k = o1Var;
                    }
                    f0(o1Var, j8, j7);
                    this.f7726j = f0Var.d();
                }
            } else if (j0Var != null) {
                Object[] objArr = j0Var.f5484c;
                long[] jArr = j0Var.f5482a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j9 = jArr[i];
                        if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i8 = 8 - ((~(i - length)) >>> 31);
                            for (int i9 = 0; i9 < i8; i9++) {
                                if ((255 & j9) < 128) {
                                    r0((o.k0) objArr[(i << 3) + i9]);
                                }
                                j9 >>= 8;
                            }
                            if (i8 != 8) {
                                break;
                            }
                        }
                        if (i == length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                j0Var.a();
            }
        }
    }

    public final int h0(u1.a aVar) {
        int b02;
        if (k0() && (b02 = b0(aVar)) != Integer.MIN_VALUE) {
            return b02 + ((int) (aVar instanceof u1.z0 ? this.f7234h >> 32 : this.f7234h & 4294967295L));
        }
        return Integer.MIN_VALUE;
    }

    public abstract n0 i0();

    public abstract u1.p j0();

    @Override // w1.y0
    public final void k(boolean z3) {
        n0 n02 = n0();
        f0 l02 = n02 != null ? n02.l0() : null;
        if (q6.i.a(l02, l0())) {
            this.f7728l = z3;
            return;
        }
        if ((l02 != null ? l02.G.f7689d : null) != b0.f7592f) {
            if ((l02 != null ? l02.G.f7689d : null) != b0.f7593g) {
                return;
            }
        }
        this.f7728l = z3;
    }

    public abstract boolean k0();

    public abstract f0 l0();

    public abstract u1.f0 m0();

    public abstract n0 n0();

    public abstract long o0();

    @Override // u1.g0
    public boolean p() {
        return false;
    }

    public final k0 p0() {
        k0 k0Var = this.i;
        if (k0Var != null) {
            return k0Var;
        }
        k0 k0Var2 = new k0(this);
        this.i = k0Var2;
        return k0Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r0(o.k0 k0Var) {
        f0 f0Var;
        Object[] objArr = k0Var.f5490b;
        long[] jArr = k0Var.f5489a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j7 = jArr[i];
            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j7) < 128 && (f0Var = (f0) ((z1) objArr[(i << 3) + i9]).get()) != null) {
                        if (p()) {
                            f0Var.R(false);
                        } else {
                            f0Var.T(false);
                        }
                    }
                    j7 >>= 8;
                }
                if (i8 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public abstract void s0();
}
