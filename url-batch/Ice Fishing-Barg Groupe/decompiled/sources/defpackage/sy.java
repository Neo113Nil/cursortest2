package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class sy extends r92 {
    public static final ry Companion = new ry();
    public static final Object rtx2ld2ELZv4 = new Object();
    public int RAsUl2FVSrh6;
    public long TSizfFm2Yiuu;
    public int Y1f8riQaR6yg;
    public Object a92UlCVFR9N8;
    public l81 e9gEMXR7LXtO;

    public sy(long j) {
        super(j);
        l81 l81Var = oe1.PxuCJdSBwIXG;
        l81Var.getClass();
        this.e9gEMXR7LXtO = l81Var;
        this.a92UlCVFR9N8 = rtx2ld2ELZv4;
    }

    @Override // defpackage.r92
    public final void PxuCJdSBwIXG(r92 r92Var) {
        r92Var.getClass();
        sy syVar = (sy) r92Var;
        this.e9gEMXR7LXtO = syVar.e9gEMXR7LXtO;
        this.a92UlCVFR9N8 = syVar.a92UlCVFR9N8;
        this.RAsUl2FVSrh6 = syVar.RAsUl2FVSrh6;
    }

    public final boolean TSizfFm2Yiuu(ty tyVar, j72 j72Var) {
        boolean z;
        boolean z2;
        Object obj = s72.TSizfFm2Yiuu;
        synchronized (obj) {
            z = true;
            if (this.TSizfFm2Yiuu == j72Var.RAsUl2FVSrh6()) {
                if (this.Y1f8riQaR6yg == j72Var.rtx2ld2ELZv4()) {
                    z2 = false;
                }
            }
            z2 = true;
        }
        if (this.a92UlCVFR9N8 == rtx2ld2ELZv4 || (z2 && this.RAsUl2FVSrh6 != Y1f8riQaR6yg(tyVar, j72Var))) {
            z = false;
        }
        if (!z || !z2) {
            return z;
        }
        synchronized (obj) {
            this.TSizfFm2Yiuu = j72Var.RAsUl2FVSrh6();
            this.Y1f8riQaR6yg = j72Var.rtx2ld2ELZv4();
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10, types: [sy] */
    /* JADX WARN: Type inference failed for: r13v5, types: [r92] */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.Object, r92] */
    public final int Y1f8riQaR6yg(ty tyVar, j72 j72Var) {
        l81 l81Var;
        int i;
        long[] jArr;
        int i2;
        Object[] objArr;
        long[] jArr2;
        int i3;
        Object[] objArr2;
        long j;
        long j2;
        int i4;
        ?? rtx2ld2ELZv42;
        synchronized (s72.TSizfFm2Yiuu) {
            l81Var = this.e9gEMXR7LXtO;
        }
        int i5 = 7;
        if (l81Var.e9gEMXR7LXtO == 0) {
            return 7;
        }
        f91 XL4ISE6Oc65B = sj0.XL4ISE6Oc65B();
        Object[] objArr3 = XL4ISE6Oc65B.rtx2ld2ELZv4;
        int i6 = XL4ISE6Oc65B.wdg6QnbFHrFF;
        boolean z = false;
        for (int i7 = 0; i7 < i6; i7++) {
            ((sf0) objArr3[i7]).lS5Rgt96tfkO();
        }
        try {
            Object[] objArr4 = l81Var.lS5Rgt96tfkO;
            int[] iArr = l81Var.TSizfFm2Yiuu;
            long[] jArr3 = l81Var.PxuCJdSBwIXG;
            int length = jArr3.length - 2;
            if (length >= 0) {
                i = 7;
                int i8 = 0;
                while (true) {
                    long j3 = jArr3[i8];
                    long j4 = -9187201950435737472L;
                    if ((((~j3) << i5) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i9 = 8;
                        int i10 = 8 - ((~(i8 - length)) >>> 31);
                        i2 = i5;
                        int i11 = z ? 1 : 0;
                        while (i11 < i10) {
                            if ((j3 & 255) < 128) {
                                int i12 = (i8 << 3) + i11;
                                j2 = j4;
                                p92 p92Var = (p92) objArr4[i12];
                                int i13 = i9;
                                if (iArr[i12] != 1) {
                                    jArr2 = jArr3;
                                    i3 = i11;
                                    objArr2 = objArr4;
                                    j = j3;
                                } else {
                                    if (p92Var instanceof ty) {
                                        ty tyVar2 = (ty) p92Var;
                                        rtx2ld2ELZv42 = tyVar2.rtx2ld2ELZv4((sy) s72.rtx2ld2ELZv4(tyVar2.dgRBjINgWbAK, j72Var), j72Var, z, tyVar2.OPXfSBeufaJ8);
                                        l81 l81Var2 = rtx2ld2ELZv42.e9gEMXR7LXtO;
                                        Object[] objArr5 = l81Var2.lS5Rgt96tfkO;
                                        long[] jArr4 = l81Var2.PxuCJdSBwIXG;
                                        int length2 = jArr4.length - 2;
                                        jArr2 = jArr3;
                                        i3 = i11;
                                        objArr2 = objArr4;
                                        if (length2 >= 0) {
                                            int i14 = 0;
                                            while (true) {
                                                long j5 = jArr4[i14];
                                                j = j3;
                                                int i15 = i;
                                                if ((((~j5) << i2) & j5 & j2) != j2) {
                                                    int i16 = 8 - ((~(i14 - length2)) >>> 31);
                                                    for (int i17 = 0; i17 < i16; i17++) {
                                                        if ((j5 & 255) < 128) {
                                                            i15 = (i15 * 31) + System.identityHashCode((p92) objArr5[(i14 << 3) + i17]);
                                                        }
                                                        j5 >>= i13;
                                                    }
                                                    if (i16 != i13) {
                                                        i = i15;
                                                        break;
                                                    }
                                                }
                                                i = i15;
                                                if (i14 == length2) {
                                                    break;
                                                }
                                                i14++;
                                                j3 = j;
                                                i13 = 8;
                                            }
                                        } else {
                                            j = j3;
                                        }
                                    } else {
                                        jArr2 = jArr3;
                                        i3 = i11;
                                        objArr2 = objArr4;
                                        j = j3;
                                        rtx2ld2ELZv42 = s72.rtx2ld2ELZv4(p92Var.PxuCJdSBwIXG(), j72Var);
                                    }
                                    i = (((i * 31) + System.identityHashCode(rtx2ld2ELZv42)) * 31) + Long.hashCode(rtx2ld2ELZv42.PxuCJdSBwIXG);
                                }
                                i4 = 8;
                            } else {
                                jArr2 = jArr3;
                                i3 = i11;
                                objArr2 = objArr4;
                                j = j3;
                                j2 = j4;
                                i4 = i9;
                            }
                            j3 = j >> i4;
                            i9 = i4;
                            j4 = j2;
                            objArr4 = objArr2;
                            z = false;
                            i11 = i3 + 1;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        objArr = objArr4;
                        if (i10 != i9) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        i2 = i5;
                        objArr = objArr4;
                    }
                    if (i8 == length) {
                        i5 = i;
                        break;
                    }
                    i8++;
                    i5 = i2;
                    jArr3 = jArr;
                    objArr4 = objArr;
                    z = false;
                }
            }
            i = i5;
            Object[] objArr6 = XL4ISE6Oc65B.rtx2ld2ELZv4;
            int i18 = XL4ISE6Oc65B.wdg6QnbFHrFF;
            for (int i19 = 0; i19 < i18; i19++) {
                ((sf0) objArr6[i19]).PxuCJdSBwIXG();
            }
            return i;
        } catch (Throwable th) {
            Object[] objArr7 = XL4ISE6Oc65B.rtx2ld2ELZv4;
            int i20 = XL4ISE6Oc65B.wdg6QnbFHrFF;
            for (int i21 = 0; i21 < i20; i21++) {
                ((sf0) objArr7[i21]).PxuCJdSBwIXG();
            }
            throw th;
        }
    }

    @Override // defpackage.r92
    public final r92 lS5Rgt96tfkO(long j) {
        return new sy(j);
    }
}
