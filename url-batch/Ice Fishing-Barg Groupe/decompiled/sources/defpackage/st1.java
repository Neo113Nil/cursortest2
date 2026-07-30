package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class st1 {
    public long OPXfSBeufaJ8;
    public final r1 PxuCJdSBwIXG;
    public boolean RAsUl2FVSrh6;
    public final uj2 TSizfFm2Yiuu;
    public final p81 Y1f8riQaR6yg;
    public boolean a92UlCVFR9N8;
    public final u81 dgRBjINgWbAK;
    public boolean e9gEMXR7LXtO;
    public final x3 lS5Rgt96tfkO;
    public a1 rtx2ld2ELZv4;
    public final y4 wdg6QnbFHrFF;

    public st1(r1 r1Var) {
        this.PxuCJdSBwIXG = r1Var;
        x3 x3Var = new x3();
        x3Var.lS5Rgt96tfkO = new long[192];
        x3Var.TSizfFm2Yiuu = new long[192];
        this.lS5Rgt96tfkO = x3Var;
        this.TSizfFm2Yiuu = new uj2();
        this.Y1f8riQaR6yg = new p81();
        this.OPXfSBeufaJ8 = -1L;
        this.wdg6QnbFHrFF = new y4(12, this);
        this.dgRBjINgWbAK = new u81();
    }

    public static boolean TSizfFm2Yiuu(pd1 pd1Var) {
        ci1 ci1Var = pd1Var.zf8DYfih6EZu;
        return (ci1Var == null || vi0.J54yh1s3n4Aq(((uh0) ci1Var).lS5Rgt96tfkO())) ? false : true;
    }

    public static long e9gEMXR7LXtO(vw0 vw0Var) {
        pd1 pd1Var = vw0Var.nLZGh9p8gVSu.Y1f8riQaR6yg;
        wq0.Companion.getClass();
        long j = 0;
        for (pd1 pd1Var2 = vw0Var.nLZGh9p8gVSu.TSizfFm2Yiuu; pd1Var2 != null && pd1Var2 != pd1Var; pd1Var2 = pd1Var2.ZbWwgt3aGe7A) {
            if (TSizfFm2Yiuu(pd1Var2)) {
                wq0.Companion.getClass();
                return 9223372034707292159L;
            }
            j = wq0.TSizfFm2Yiuu(j, pd1Var2.ozEBbv0hFTAB);
        }
        return j;
    }

    public static void rtx2ld2ELZv4(vw0 vw0Var) {
        if (!vw0Var.wdg6QnbFHrFF || TSizfFm2Yiuu(vw0Var.nLZGh9p8gVSu.Y1f8riQaR6yg)) {
            return;
        }
        vw0Var.wdg6QnbFHrFF = false;
        if (vw0Var.x50lh2ztY7Y5) {
            vw0Var.dgRBjINgWbAK = e9gEMXR7LXtO(vw0Var);
            vw0Var.x50lh2ztY7Y5 = false;
        }
        long j = vw0Var.dgRBjINgWbAK;
        wq0.Companion.getClass();
        if (wq0.PxuCJdSBwIXG(j, 9223372034707292159L)) {
            return;
        }
        f91 pnx5pC0XzaCw = vw0Var.pnx5pC0XzaCw();
        Object[] objArr = pnx5pC0XzaCw.rtx2ld2ELZv4;
        int i = pnx5pC0XzaCw.wdg6QnbFHrFF;
        for (int i2 = 0; i2 < i; i2++) {
            rtx2ld2ELZv4((vw0) objArr[i2]);
        }
    }

    public final void OPXfSBeufaJ8() {
        a1 a1Var = this.rtx2ld2ELZv4;
        boolean z = a1Var != null;
        long j = this.TSizfFm2Yiuu.TSizfFm2Yiuu;
        if (j >= 0 || !z) {
            if (this.OPXfSBeufaJ8 == j && z) {
                return;
            }
            r1 r1Var = this.PxuCJdSBwIXG;
            if (a1Var != null) {
                r1Var.removeCallbacks(a1Var);
            }
            long currentTimeMillis = System.currentTimeMillis();
            long max = Math.max(j, 16 + currentTimeMillis);
            this.OPXfSBeufaJ8 = max;
            a1 a1Var2 = new a1(0, this.wdg6QnbFHrFF);
            r1Var.postDelayed(a1Var2, max - currentTimeMillis);
            this.rtx2ld2ELZv4 = a1Var2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0219  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void PxuCJdSBwIXG() {
        boolean z;
        long j;
        x3 x3Var;
        int i;
        long j2;
        long j3;
        int i2;
        long[] jArr;
        long j4;
        long j5;
        a1 a1Var = this.rtx2ld2ELZv4;
        if (a1Var != null) {
            this.PxuCJdSBwIXG.removeCallbacks(a1Var);
            this.rtx2ld2ELZv4 = null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        boolean z2 = this.e9gEMXR7LXtO;
        boolean z3 = z2 || this.a92UlCVFR9N8;
        x3 x3Var2 = this.lS5Rgt96tfkO;
        boolean z4 = true;
        uj2 uj2Var = this.TSizfFm2Yiuu;
        if (z2) {
            this.e9gEMXR7LXtO = false;
            p81 p81Var = this.Y1f8riQaR6yg;
            Object[] objArr = p81Var.PxuCJdSBwIXG;
            int i3 = p81Var.lS5Rgt96tfkO;
            for (int i4 = 0; i4 < i3; i4++) {
                ((ae0) objArr[i4]).PxuCJdSBwIXG();
            }
            long[] jArr2 = (long[]) x3Var2.lS5Rgt96tfkO;
            int i5 = x3Var2.PxuCJdSBwIXG;
            int i6 = 0;
            while (i6 < jArr2.length - 2 && i6 < i5) {
                long j6 = jArr2[i6 + 2];
                boolean z5 = z4;
                int i7 = i5;
                if ((((int) (j6 >> 60)) & 1) != 0) {
                    long j7 = jArr2[i6];
                    long j8 = jArr2[i6 + 1];
                    tj2 tj2Var = (tj2) uj2Var.PxuCJdSBwIXG.lS5Rgt96tfkO(((int) j6) & 33554431);
                    while (tj2Var != null) {
                        tj2 tj2Var2 = tj2Var.Y1f8riQaR6yg;
                        boolean z6 = z3;
                        long j9 = tj2Var.RAsUl2FVSrh6;
                        boolean z7 = (currentTimeMillis - j9 >= 0 || j9 == Long.MIN_VALUE) ? z5 : false;
                        tj2Var.e9gEMXR7LXtO = j7;
                        tj2Var.a92UlCVFR9N8 = j8;
                        if (z7) {
                            tj2Var.RAsUl2FVSrh6 = currentTimeMillis;
                            j4 = j7;
                            j5 = j8;
                            tj2Var.PxuCJdSBwIXG(j4, j5, uj2Var.Y1f8riQaR6yg, uj2Var.e9gEMXR7LXtO, uj2Var.RAsUl2FVSrh6);
                        } else {
                            j4 = j7;
                            j5 = j8;
                        }
                        tj2Var = tj2Var2;
                        j7 = j4;
                        j8 = j5;
                        z3 = z6;
                    }
                }
                i6 += 3;
                z4 = z5;
                i5 = i7;
                z3 = z3;
            }
            z = z3;
            j = 0;
            long[] jArr3 = (long[]) x3Var2.lS5Rgt96tfkO;
            int i8 = x3Var2.PxuCJdSBwIXG;
            for (int i9 = 0; i9 < jArr3.length - 2 && i9 < i8; i9 += 3) {
                int i10 = i9 + 2;
                jArr3[i10] = jArr3[i10] & (-1152921504606846977L);
            }
        } else {
            z = z3;
            j = 0;
        }
        if (this.a92UlCVFR9N8) {
            this.a92UlCVFR9N8 = false;
            long j10 = uj2Var.Y1f8riQaR6yg;
            long j11 = uj2Var.e9gEMXR7LXtO;
            float[] fArr = uj2Var.RAsUl2FVSrh6;
            c81 c81Var = uj2Var.PxuCJdSBwIXG;
            j2 = 128;
            Object[] objArr2 = c81Var.TSizfFm2Yiuu;
            long[] jArr4 = c81Var.PxuCJdSBwIXG;
            int length = jArr4.length - 2;
            if (length >= 0) {
                int i11 = 0;
                int i12 = 8;
                j3 = 255;
                while (true) {
                    long j12 = j10;
                    long j13 = jArr4[i11];
                    int i13 = i12;
                    x3Var = x3Var2;
                    if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i14 = 8 - ((~(i11 - length)) >>> 31);
                        long j14 = j13;
                        int i15 = 0;
                        while (i15 < i14) {
                            if ((j14 & 255) < 128) {
                                tj2 tj2Var3 = (tj2) objArr2[(i11 << 3) + i15];
                                while (tj2Var3 != null) {
                                    uj2Var.PxuCJdSBwIXG(tj2Var3, j12, j11, fArr, currentTimeMillis);
                                    tj2Var3 = tj2Var3.Y1f8riQaR6yg;
                                    i13 = i13;
                                    jArr4 = jArr4;
                                }
                            }
                            long[] jArr5 = jArr4;
                            int i16 = i13;
                            j14 >>= i16;
                            i15++;
                            j12 = j12;
                            i13 = i16;
                            jArr4 = jArr5;
                        }
                        jArr = jArr4;
                        i = i13;
                        j10 = j12;
                        if (i14 != i) {
                            break;
                        }
                    } else {
                        jArr = jArr4;
                        i = i13;
                        j10 = j12;
                    }
                    if (i11 == length) {
                        break;
                    }
                    i11++;
                    i12 = i;
                    x3Var2 = x3Var;
                    jArr4 = jArr;
                }
                if (z) {
                    long j15 = uj2Var.Y1f8riQaR6yg;
                    long j16 = uj2Var.e9gEMXR7LXtO;
                    float[] fArr2 = uj2Var.RAsUl2FVSrh6;
                    tj2 tj2Var4 = uj2Var.lS5Rgt96tfkO;
                    if (tj2Var4 != null) {
                        while (tj2Var4 != null) {
                            vw0 zf8DYfih6EZu = zv.zf8DYfih6EZu(tj2Var4.lS5Rgt96tfkO);
                            tj2Var4.e9gEMXR7LXtO = ((r1) yw0.PxuCJdSBwIXG(zf8DYfih6EZu)).getRectManager().lS5Rgt96tfkO(zf8DYfih6EZu);
                            i51 i51Var = zf8DYfih6EZu.ryVscX7ZL4Ux.gPXPFXrUH4XX;
                            tj2Var4.a92UlCVFR9N8 = ((i51Var.rtx2ld2ELZv4 + ((int) (r12 >> 32))) << 32) | ((i51Var.OPXfSBeufaJ8 + ((int) (r12 & 4294967295L))) & 4294967295L);
                            uj2Var.PxuCJdSBwIXG(tj2Var4, j15, j16, fArr2, currentTimeMillis);
                            tj2Var4 = tj2Var4.Y1f8riQaR6yg;
                        }
                    }
                }
                if (this.RAsUl2FVSrh6) {
                    i2 = 0;
                } else {
                    i2 = 0;
                    this.RAsUl2FVSrh6 = false;
                    x3 x3Var3 = x3Var;
                    long[] jArr6 = (long[]) x3Var3.lS5Rgt96tfkO;
                    int i17 = x3Var3.PxuCJdSBwIXG;
                    long[] jArr7 = (long[]) x3Var3.TSizfFm2Yiuu;
                    int i18 = 0;
                    for (int i19 = 0; i19 < jArr6.length - 2 && i18 < jArr7.length - 2 && i19 < i17; i19 += 3) {
                        int i20 = i19 + 2;
                        if (jArr6[i20] != rt1.PxuCJdSBwIXG) {
                            jArr7[i18] = jArr6[i19];
                            jArr7[i18 + 1] = jArr6[i19 + 1];
                            jArr7[i18 + 2] = jArr6[i20];
                            i18 += 3;
                        }
                    }
                    x3Var3.PxuCJdSBwIXG = i18;
                    x3Var3.lS5Rgt96tfkO = jArr7;
                    x3Var3.TSizfFm2Yiuu = jArr6;
                }
                if (uj2Var.TSizfFm2Yiuu <= currentTimeMillis) {
                    c81 c81Var2 = uj2Var.PxuCJdSBwIXG;
                    Object[] objArr3 = c81Var2.TSizfFm2Yiuu;
                    long[] jArr8 = c81Var2.PxuCJdSBwIXG;
                    int length2 = jArr8.length - 2;
                    if (length2 >= 0) {
                        int i21 = i2;
                        while (true) {
                            long j17 = jArr8[i21];
                            if ((((~j17) << 7) & j17 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i22 = 8 - ((~(i21 - length2)) >>> 31);
                                long j18 = j17;
                                for (int i23 = i2; i23 < i22; i23++) {
                                    if ((j18 & j3) < j2) {
                                        for (tj2 tj2Var5 = (tj2) objArr3[(i21 << 3) + i23]; tj2Var5 != null; tj2Var5 = tj2Var5.Y1f8riQaR6yg) {
                                        }
                                    }
                                    j18 >>= i;
                                }
                                if (i22 != i) {
                                    break;
                                }
                            }
                            if (i21 == length2) {
                                break;
                            } else {
                                i21++;
                            }
                        }
                    }
                    tj2 tj2Var6 = uj2Var.lS5Rgt96tfkO;
                    if (tj2Var6 != null) {
                        while (tj2Var6 != null) {
                            tj2Var6 = tj2Var6.Y1f8riQaR6yg;
                        }
                    }
                    uj2Var.TSizfFm2Yiuu = -1L;
                }
                if (uj2Var.TSizfFm2Yiuu <= j) {
                    OPXfSBeufaJ8();
                    return;
                }
                return;
            }
            x3Var = x3Var2;
            i = 8;
        } else {
            x3Var = x3Var2;
            i = 8;
            j2 = 128;
        }
        j3 = 255;
        if (z) {
        }
        if (this.RAsUl2FVSrh6) {
        }
        if (uj2Var.TSizfFm2Yiuu <= currentTimeMillis) {
        }
        if (uj2Var.TSizfFm2Yiuu <= j) {
        }
    }

    public final void RAsUl2FVSrh6(vw0 vw0Var) {
        if (vw0Var.r3s1LDPKFs1S) {
            int i = vw0Var.OPXfSBeufaJ8 & 33554431;
            x3 x3Var = this.lS5Rgt96tfkO;
            long[] jArr = (long[]) x3Var.lS5Rgt96tfkO;
            int i2 = x3Var.PxuCJdSBwIXG;
            int i3 = 0;
            while (true) {
                if (i3 >= jArr.length - 2 || i3 >= i2) {
                    break;
                }
                int i4 = i3 + 2;
                if ((((int) jArr[i4]) & 33554431) == i) {
                    jArr[i3] = -1;
                    jArr[i3 + 1] = -1;
                    jArr[i4] = rt1.PxuCJdSBwIXG;
                    break;
                }
                i3 += 3;
            }
            vw0Var.r3s1LDPKFs1S = false;
            vw0Var.cpQdD2nAriOS = true;
            this.e9gEMXR7LXtO = true;
            this.RAsUl2FVSrh6 = true;
        }
    }

    public final void Y1f8riQaR6yg(vw0 vw0Var) {
        boolean z;
        boolean z2 = true;
        vw0Var.wdg6QnbFHrFF = true;
        kd1 kd1Var = vw0Var.nLZGh9p8gVSu;
        pd1 pd1Var = kd1Var.Y1f8riQaR6yg;
        i51 i51Var = vw0Var.ryVscX7ZL4Ux.gPXPFXrUH4XX;
        int JTxCbbCwomzt = i51Var.JTxCbbCwomzt();
        float D0aTLcX6Uhyo = i51Var.D0aTLcX6Uhyo();
        u81 u81Var = this.dgRBjINgWbAK;
        u81Var.PxuCJdSBwIXG = 0.0f;
        u81Var.lS5Rgt96tfkO = 0.0f;
        u81Var.TSizfFm2Yiuu = JTxCbbCwomzt;
        u81Var.Y1f8riQaR6yg = D0aTLcX6Uhyo;
        while (true) {
            if (pd1Var == null) {
                break;
            }
            vw0 vw0Var2 = pd1Var.VhhvGxCb8gfr;
            if (pd1Var == vw0Var2.nLZGh9p8gVSu.Y1f8riQaR6yg && !vw0Var2.wdg6QnbFHrFF) {
                long lS5Rgt96tfkO = lS5Rgt96tfkO(vw0Var2);
                wq0.Companion.getClass();
                if (!wq0.PxuCJdSBwIXG(lS5Rgt96tfkO, 9223372034707292159L)) {
                    u81Var.TSizfFm2Yiuu((Float.floatToRawIntBits((int) (lS5Rgt96tfkO >> 32)) << 32) | (Float.floatToRawIntBits((int) (lS5Rgt96tfkO & 4294967295L)) & 4294967295L));
                    break;
                }
            }
            ci1 ci1Var = pd1Var.zf8DYfih6EZu;
            if (ci1Var != null) {
                float[] lS5Rgt96tfkO2 = ((uh0) ci1Var).lS5Rgt96tfkO();
                if (!vi0.J54yh1s3n4Aq(lS5Rgt96tfkO2)) {
                    d51.TSizfFm2Yiuu(lS5Rgt96tfkO2, u81Var);
                }
            }
            long j = pd1Var.ozEBbv0hFTAB;
            u81Var.TSizfFm2Yiuu((4294967295L & Float.floatToRawIntBits((int) (j & 4294967295L))) | (Float.floatToRawIntBits((int) (j >> 32)) << 32));
            pd1Var = pd1Var.ZbWwgt3aGe7A;
        }
        int i = (int) u81Var.PxuCJdSBwIXG;
        int i2 = (int) u81Var.lS5Rgt96tfkO;
        int i3 = (int) u81Var.TSizfFm2Yiuu;
        int i4 = (int) u81Var.Y1f8riQaR6yg;
        int i5 = vw0Var.OPXfSBeufaJ8;
        boolean z3 = vw0Var.r3s1LDPKFs1S;
        vw0Var.r3s1LDPKFs1S = true;
        x3 x3Var = this.lS5Rgt96tfkO;
        if (z3) {
            int i6 = i5 & 33554431;
            long[] jArr = (long[]) x3Var.lS5Rgt96tfkO;
            int i7 = x3Var.PxuCJdSBwIXG;
            int i8 = 0;
            while (i8 < jArr.length - 2 && i8 < i7) {
                int i9 = i8 + 2;
                long j2 = jArr[i9];
                z = z2;
                if ((((int) j2) & 33554431) == i6) {
                    jArr[i8] = (i << 32) | (i2 & 4294967295L);
                    jArr[i8 + 1] = (i3 << 32) | (i4 & 4294967295L);
                    jArr[i9] = (((j2 >> 63) & 1) << 60) | j2;
                    break;
                }
                i8 += 3;
                z2 = z;
            }
        }
        z = z2;
        vw0 S9EYkSpbGuxq = vw0Var.S9EYkSpbGuxq();
        x3Var.TSizfFm2Yiuu(i5, i, i2, i3, i4, (r22 & 32) != 0 ? -1 : S9EYkSpbGuxq != null ? S9EYkSpbGuxq.OPXfSBeufaJ8 : -1, kd1Var.Y1f8riQaR6yg(1024), kd1Var.Y1f8riQaR6yg(16), this.TSizfFm2Yiuu.PxuCJdSBwIXG.PxuCJdSBwIXG(i5), -1);
        vw0Var.cpQdD2nAriOS = false;
        this.e9gEMXR7LXtO = z;
        f91 pnx5pC0XzaCw = vw0Var.pnx5pC0XzaCw();
        Object[] objArr = pnx5pC0XzaCw.rtx2ld2ELZv4;
        int i10 = pnx5pC0XzaCw.wdg6QnbFHrFF;
        for (int i11 = 0; i11 < i10; i11++) {
            vw0 vw0Var3 = (vw0) objArr[i11];
            if (vw0Var3.EpkonXwzFgDB()) {
                Y1f8riQaR6yg(vw0Var3);
            }
        }
    }

    public final void a92UlCVFR9N8(vw0 vw0Var) {
        long j;
        boolean EpkonXwzFgDB = vw0Var.EpkonXwzFgDB();
        kd1 kd1Var = vw0Var.nLZGh9p8gVSu;
        if (EpkonXwzFgDB && vw0Var.cpQdD2nAriOS) {
            vw0 S9EYkSpbGuxq = vw0Var.S9EYkSpbGuxq();
            if (S9EYkSpbGuxq != null && !S9EYkSpbGuxq.wdg6QnbFHrFF) {
                if (S9EYkSpbGuxq.x50lh2ztY7Y5) {
                    S9EYkSpbGuxq.x50lh2ztY7Y5 = false;
                    S9EYkSpbGuxq.dgRBjINgWbAK = e9gEMXR7LXtO(S9EYkSpbGuxq);
                }
                j = S9EYkSpbGuxq.dgRBjINgWbAK;
            } else if (S9EYkSpbGuxq == null) {
                wq0.Companion.getClass();
                j = 0;
            } else {
                wq0.Companion.getClass();
                j = 9223372034707292159L;
            }
            pd1 pd1Var = kd1Var.Y1f8riQaR6yg;
            wq0.Companion.getClass();
            if (wq0.PxuCJdSBwIXG(j, 9223372034707292159L) || TSizfFm2Yiuu(pd1Var)) {
                Y1f8riQaR6yg(vw0Var);
            } else if (vw0Var.wdg6QnbFHrFF) {
                Y1f8riQaR6yg(vw0Var);
                rtx2ld2ELZv4(vw0Var);
            } else {
                long TSizfFm2Yiuu = wq0.TSizfFm2Yiuu(j, pd1Var.ozEBbv0hFTAB);
                i51 i51Var = vw0Var.ryVscX7ZL4Ux.gPXPFXrUH4XX;
                int JTxCbbCwomzt = i51Var.JTxCbbCwomzt();
                int D0aTLcX6Uhyo = i51Var.D0aTLcX6Uhyo();
                int i = vw0Var.OPXfSBeufaJ8;
                boolean z = vw0Var.r3s1LDPKFs1S;
                x3 x3Var = this.lS5Rgt96tfkO;
                long j2 = 4294967295L;
                if (!z) {
                    vw0Var.r3s1LDPKFs1S = true;
                    boolean Y1f8riQaR6yg = kd1Var.Y1f8riQaR6yg(1024);
                    boolean Y1f8riQaR6yg2 = kd1Var.Y1f8riQaR6yg(16);
                    boolean PxuCJdSBwIXG = this.TSizfFm2Yiuu.PxuCJdSBwIXG.PxuCJdSBwIXG(i);
                    if (S9EYkSpbGuxq != null) {
                        int i2 = S9EYkSpbGuxq.OPXfSBeufaJ8;
                        int i3 = (int) (TSizfFm2Yiuu >> 32);
                        int i4 = (int) (TSizfFm2Yiuu & 4294967295L);
                        int i5 = i & 33554431;
                        long[] jArr = (long[]) x3Var.lS5Rgt96tfkO;
                        int i6 = x3Var.PxuCJdSBwIXG - 3;
                        while (true) {
                            if (i6 < 0) {
                                break;
                            }
                            if ((((int) jArr[i6 + 2]) & 33554431) == i2) {
                                long j3 = jArr[i6];
                                int i7 = ((int) (j3 >> 32)) + i3;
                                int i8 = ((int) j3) + i4;
                                x3Var.TSizfFm2Yiuu(i5, i7, i8, i7 + JTxCbbCwomzt, i8 + D0aTLcX6Uhyo, i2, Y1f8riQaR6yg, Y1f8riQaR6yg2, PxuCJdSBwIXG, i6);
                                break;
                            }
                            i6 -= 3;
                        }
                    } else {
                        int i9 = (int) (TSizfFm2Yiuu >> 32);
                        int i10 = (int) (TSizfFm2Yiuu & 4294967295L);
                        x3Var.TSizfFm2Yiuu(i, i9, i10, i9 + JTxCbbCwomzt, i10 + D0aTLcX6Uhyo, (r22 & 32) != 0 ? -1 : 0, Y1f8riQaR6yg, Y1f8riQaR6yg2, PxuCJdSBwIXG, -1);
                    }
                } else if (S9EYkSpbGuxq == null) {
                    int i11 = (int) (TSizfFm2Yiuu >> 32);
                    int i12 = (int) (TSizfFm2Yiuu & 4294967295L);
                    int i13 = JTxCbbCwomzt + i11;
                    int i14 = i12 + D0aTLcX6Uhyo;
                    int i15 = i & 33554431;
                    long[] jArr2 = (long[]) x3Var.lS5Rgt96tfkO;
                    int i16 = x3Var.PxuCJdSBwIXG;
                    int i17 = 0;
                    while (true) {
                        if (i17 >= jArr2.length - 2 || i17 >= i16) {
                            break;
                        }
                        int i18 = i17 + 2;
                        long j4 = jArr2[i18];
                        if ((((int) j4) & 33554431) == i15) {
                            long j5 = jArr2[i17];
                            int i19 = i17;
                            jArr2[i19] = (i11 << 32) | (i12 & 4294967295L);
                            jArr2[i19 + 1] = (i13 << 32) | (i14 & 4294967295L);
                            jArr2[i18] = (((j4 >> 63) & 1) << 60) | j4;
                            int i20 = i11 - ((int) (j5 >> 32));
                            int i21 = i12 - ((int) j5);
                            if ((i20 != 0) | (i21 != 0)) {
                                int i22 = rt1.lS5Rgt96tfkO;
                                x3Var.a92UlCVFR9N8(i20, i21, (j4 & (-1125899873288193L)) | (((i19 + 3) & 33554431) << 25));
                            }
                        } else {
                            i17 += 3;
                        }
                    }
                } else {
                    int i23 = S9EYkSpbGuxq.OPXfSBeufaJ8;
                    int i24 = (int) (TSizfFm2Yiuu >> 32);
                    int i25 = (int) (TSizfFm2Yiuu & 4294967295L);
                    int i26 = i & 33554431;
                    long[] jArr3 = (long[]) x3Var.lS5Rgt96tfkO;
                    int i27 = x3Var.PxuCJdSBwIXG;
                    int i28 = 0;
                    while (true) {
                        if (i28 >= jArr3.length - 2 || i28 >= i27) {
                            break;
                        }
                        long j6 = j2;
                        if ((((int) jArr3[i28 + 2]) & 33554431) == i23) {
                            long j7 = jArr3[i28];
                            int i29 = ((int) (j7 >> 32)) + i24;
                            int i30 = ((int) j7) + i25;
                            int i31 = i29 + JTxCbbCwomzt;
                            int i32 = i30 + D0aTLcX6Uhyo;
                            i28 += 3;
                            while (i28 < jArr3.length - 2 && i28 < i27) {
                                int i33 = i28 + 2;
                                int i34 = i23;
                                int i35 = i24;
                                long j8 = jArr3[i33];
                                int i36 = i25;
                                if ((((int) j8) & 33554431) == i26) {
                                    long j9 = jArr3[i28];
                                    long[] jArr4 = jArr3;
                                    int i37 = i29 - ((int) (j9 >> 32));
                                    int i38 = i30 - ((int) j9);
                                    jArr4[i28] = (i30 & j6) | (i29 << 32);
                                    jArr4[i28 + 1] = (i31 << 32) | (i32 & j6);
                                    jArr4[i33] = j8 | (((j8 >> 63) & 1) << 60);
                                    if (i37 != 0 || i38 != 0) {
                                        int i39 = rt1.lS5Rgt96tfkO;
                                        x3Var.a92UlCVFR9N8(i37, i38, (j8 & (-1125899873288193L)) | (((i28 + 3) & 33554431) << 25));
                                    }
                                } else {
                                    i28 += 3;
                                    i23 = i34;
                                    i24 = i35;
                                    i25 = i36;
                                }
                            }
                        }
                        i28 += 3;
                        jArr3 = jArr3;
                        j2 = j6;
                        i23 = i23;
                        i24 = i24;
                        i25 = i25;
                    }
                }
            }
            vw0Var.cpQdD2nAriOS = false;
            this.e9gEMXR7LXtO = true;
            OPXfSBeufaJ8();
        }
    }

    public final long lS5Rgt96tfkO(vw0 vw0Var) {
        long j;
        int i = vw0Var.OPXfSBeufaJ8 & 33554431;
        x3 x3Var = this.lS5Rgt96tfkO;
        long[] jArr = (long[]) x3Var.lS5Rgt96tfkO;
        int i2 = x3Var.PxuCJdSBwIXG;
        for (int i3 = 0; i3 < jArr.length - 2 && i3 < i2; i3 += 3) {
            if ((((int) jArr[i3 + 2]) & 33554431) == i) {
                j = jArr[i3];
                break;
            }
        }
        j = Long.MAX_VALUE;
        if (j == Long.MAX_VALUE) {
            wq0.Companion.getClass();
            return 9223372034707292159L;
        }
        return (((int) j) & 4294967295L) | (((int) (j >> 32)) << 32);
    }
}
