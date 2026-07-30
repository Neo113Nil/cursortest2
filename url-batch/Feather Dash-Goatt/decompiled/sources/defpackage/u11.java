package defpackage;

import android.os.Handler;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class u11 {
    public final u5 a;
    public final ii1 b;
    public final mn0 c;
    public boolean d;
    public boolean e;
    public boolean f;
    public q2 g;
    public long h;
    public final ce i;
    public final un0 j;

    public u11() {
        u5 u5Var = new u5();
        u5Var.b = new long[192];
        u5Var.c = new long[192];
        this.a = u5Var;
        this.b = new ii1();
        this.c = new mn0();
        this.h = -1L;
        this.i = new ce(10, this);
        this.j = new un0();
    }

    public static boolean c(qp0 qp0Var) {
        du0 du0Var = qp0Var.P;
        return (du0Var == null || ca0.q(((n50) du0Var).b())) ? false : true;
    }

    public static long g(jd0 jd0Var) {
        l7 l7Var = jd0Var.J;
        qp0 qp0Var = (qp0) l7Var.e;
        long j = 0;
        for (qp0 qp0Var2 = (v80) l7Var.d; qp0Var2 != null && qp0Var2 != qp0Var; qp0Var2 = qp0Var2.u) {
            if (c(qp0Var2)) {
                return 9223372034707292159L;
            }
            j = s90.c(j, qp0Var2.D);
        }
        return j;
    }

    public static void i(jd0 jd0Var) {
        if (!jd0Var.g || c((qp0) jd0Var.J.e)) {
            return;
        }
        jd0Var.g = false;
        if (jd0Var.k) {
            jd0Var.j = g(jd0Var);
            jd0Var.k = false;
        }
        if (s90.a(jd0Var.j, 9223372034707292159L)) {
            return;
        }
        eo0 x = jd0Var.x();
        Object[] objArr = x.d;
        int i = x.g;
        for (int i2 = 0; i2 < i; i2++) {
            i((jd0) objArr[i2]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x021f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        boolean z;
        long j;
        u5 u5Var;
        int i;
        long j2;
        long j3;
        int i2;
        long[] jArr;
        long j4;
        long j5;
        q2 q2Var = this.g;
        if (q2Var != null) {
            r2.a.removeCallbacks(q2Var);
            this.g = null;
        }
        Handler handler = r2.a;
        long currentTimeMillis = System.currentTimeMillis();
        boolean z2 = this.d;
        boolean z3 = z2 || this.e;
        u5 u5Var2 = this.a;
        boolean z4 = true;
        ii1 ii1Var = this.b;
        if (z2) {
            this.d = false;
            mn0 mn0Var = this.c;
            Object[] objArr = mn0Var.a;
            int i3 = mn0Var.b;
            for (int i4 = 0; i4 < i3; i4++) {
                ((Function0) objArr[i4]).invoke();
            }
            long[] jArr2 = (long[]) u5Var2.b;
            int i5 = u5Var2.a;
            int i6 = 0;
            while (i6 < jArr2.length - 2 && i6 < i5) {
                long j6 = jArr2[i6 + 2];
                boolean z5 = z4;
                int i7 = i5;
                if ((((int) (j6 >> 60)) & 1) != 0) {
                    long j7 = jArr2[i6];
                    long j8 = jArr2[i6 + 1];
                    hi1 hi1Var = (hi1) ii1Var.a.b(((int) j6) & 33554431);
                    while (hi1Var != null) {
                        hi1 hi1Var2 = hi1Var.d;
                        boolean z6 = z3;
                        long j9 = hi1Var.g;
                        boolean z7 = (currentTimeMillis - j9 >= 0 || j9 == Long.MIN_VALUE) ? z5 : false;
                        hi1Var.e = j7;
                        hi1Var.f = j8;
                        if (z7) {
                            hi1Var.g = currentTimeMillis;
                            j4 = j7;
                            j5 = j8;
                            hi1Var.a(j4, j5, ii1Var.d, ii1Var.e, ii1Var.g);
                        } else {
                            j4 = j7;
                            j5 = j8;
                        }
                        hi1Var = hi1Var2;
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
            long[] jArr3 = (long[]) u5Var2.b;
            int i8 = u5Var2.a;
            for (int i9 = 0; i9 < jArr3.length - 2 && i9 < i8; i9 += 3) {
                int i10 = i9 + 2;
                jArr3[i10] = jArr3[i10] & (-1152921504606846977L);
            }
        } else {
            z = z3;
            j = 0;
        }
        if (this.e) {
            this.e = false;
            long j10 = ii1Var.d;
            long j11 = ii1Var.e;
            float[] fArr = ii1Var.g;
            en0 en0Var = ii1Var.a;
            j2 = 128;
            Object[] objArr2 = en0Var.c;
            long[] jArr4 = en0Var.a;
            int length = jArr4.length - 2;
            if (length >= 0) {
                int i11 = 0;
                int i12 = 8;
                j3 = 255;
                while (true) {
                    long j12 = j10;
                    long j13 = jArr4[i11];
                    int i13 = i12;
                    u5Var = u5Var2;
                    if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i14 = 8 - ((~(i11 - length)) >>> 31);
                        long j14 = j13;
                        int i15 = 0;
                        while (i15 < i14) {
                            if ((j14 & 255) < 128) {
                                hi1 hi1Var3 = (hi1) objArr2[(i11 << 3) + i15];
                                while (hi1Var3 != null) {
                                    ii1Var.a(hi1Var3, j12, j11, fArr, currentTimeMillis);
                                    hi1Var3 = hi1Var3.d;
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
                    u5Var2 = u5Var;
                    jArr4 = jArr;
                }
                if (z) {
                    long j15 = ii1Var.d;
                    long j16 = ii1Var.e;
                    float[] fArr2 = ii1Var.g;
                    hi1 hi1Var4 = ii1Var.b;
                    if (hi1Var4 != null) {
                        while (hi1Var4 != null) {
                            jd0 I = op.I(hi1Var4.b);
                            long b = ((d4) md0.a(I)).getRectManager().b(I);
                            long j17 = I.i;
                            hi1Var4.e = b;
                            hi1Var4.f = ((((int) (b & 4294967295L)) + ((int) (j17 & 4294967295L))) & 4294967295L) | ((((int) (b >> 32)) + ((int) (j17 >> 32))) << 32);
                            ii1Var.a(hi1Var4, j15, j16, fArr2, currentTimeMillis);
                            hi1Var4 = hi1Var4.d;
                        }
                    }
                }
                if (this.f) {
                    i2 = 0;
                } else {
                    i2 = 0;
                    this.f = false;
                    u5 u5Var3 = u5Var;
                    long[] jArr6 = (long[]) u5Var3.b;
                    int i17 = u5Var3.a;
                    long[] jArr7 = (long[]) u5Var3.c;
                    int i18 = 0;
                    for (int i19 = 0; i19 < jArr6.length - 2 && i18 < jArr7.length - 2 && i19 < i17; i19 += 3) {
                        int i20 = i19 + 2;
                        if (jArr6[i20] != t11.c) {
                            jArr7[i18] = jArr6[i19];
                            jArr7[i18 + 1] = jArr6[i19 + 1];
                            jArr7[i18 + 2] = jArr6[i20];
                            i18 += 3;
                        }
                    }
                    u5Var3.a = i18;
                    u5Var3.b = jArr7;
                    u5Var3.c = jArr6;
                }
                if (ii1Var.c <= currentTimeMillis) {
                    en0 en0Var2 = ii1Var.a;
                    Object[] objArr3 = en0Var2.c;
                    long[] jArr8 = en0Var2.a;
                    int length2 = jArr8.length - 2;
                    if (length2 >= 0) {
                        int i21 = i2;
                        while (true) {
                            long j18 = jArr8[i21];
                            if ((((~j18) << 7) & j18 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i22 = 8 - ((~(i21 - length2)) >>> 31);
                                long j19 = j18;
                                for (int i23 = i2; i23 < i22; i23++) {
                                    if ((j19 & j3) < j2) {
                                        for (hi1 hi1Var5 = (hi1) objArr3[(i21 << 3) + i23]; hi1Var5 != null; hi1Var5 = hi1Var5.d) {
                                        }
                                    }
                                    j19 >>= i;
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
                    hi1 hi1Var6 = ii1Var.b;
                    if (hi1Var6 != null) {
                        while (hi1Var6 != null) {
                            hi1Var6 = hi1Var6.d;
                        }
                    }
                    ii1Var.c = -1L;
                }
                if (ii1Var.c <= j) {
                    j();
                    return;
                }
                return;
            }
            u5Var = u5Var2;
            i = 8;
        } else {
            u5Var = u5Var2;
            i = 8;
            j2 = 128;
        }
        j3 = 255;
        if (z) {
        }
        if (this.f) {
        }
        if (ii1Var.c <= currentTimeMillis) {
        }
        if (ii1Var.c <= j) {
        }
    }

    public final long b(jd0 jd0Var) {
        long j;
        int i = jd0Var.e & 33554431;
        u5 u5Var = this.a;
        long[] jArr = (long[]) u5Var.b;
        int i2 = u5Var.a;
        for (int i3 = 0; i3 < jArr.length - 2 && i3 < i2; i3 += 3) {
            if ((((int) jArr[i3 + 2]) & 33554431) == i) {
                j = jArr[i3];
                break;
            }
        }
        j = Long.MAX_VALUE;
        if (j == Long.MAX_VALUE) {
            return 9223372034707292159L;
        }
        return (((int) j) & 4294967295L) | (((int) (j >> 32)) << 32);
    }

    public final void d(jd0 jd0Var) {
        char c;
        boolean z;
        boolean z2 = true;
        jd0Var.g = true;
        jd0Var.h = 9223372034707292159L;
        l7 l7Var = jd0Var.J;
        qp0 qp0Var = (qp0) l7Var.e;
        uk0 uk0Var = jd0Var.K.p;
        int W = uk0Var.W();
        float S = uk0Var.S();
        un0 un0Var = this.j;
        un0Var.a = 0.0f;
        un0Var.b = 0.0f;
        un0Var.c = W;
        un0Var.d = S;
        while (true) {
            c = ' ';
            if (qp0Var == null) {
                break;
            }
            jd0 jd0Var2 = qp0Var.s;
            if (qp0Var == ((qp0) jd0Var2.J.e) && !jd0Var2.g) {
                if (!s90.a(b(jd0Var2), 9223372034707292159L)) {
                    un0Var.c((Float.floatToRawIntBits((int) (r11 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (r11 >> 32)) << 32));
                    break;
                }
            }
            du0 du0Var = qp0Var.P;
            if (du0Var != null) {
                float[] b = ((n50) du0Var).b();
                if (!ca0.q(b)) {
                    y90.v(b, un0Var);
                }
            }
            long j = qp0Var.D;
            un0Var.c((4294967295L & Float.floatToRawIntBits((int) (j & 4294967295L))) | (Float.floatToRawIntBits((int) (j >> 32)) << 32));
            qp0Var = qp0Var.u;
        }
        int i = (int) un0Var.a;
        int i2 = (int) un0Var.b;
        int i3 = (int) un0Var.c;
        int i4 = (int) un0Var.d;
        int i5 = jd0Var.e;
        boolean z3 = jd0Var.l;
        jd0Var.l = true;
        u5 u5Var = this.a;
        if (z3) {
            int i6 = i5 & 33554431;
            long[] jArr = (long[]) u5Var.b;
            int i7 = u5Var.a;
            int i8 = 0;
            while (i8 < jArr.length - 2 && i8 < i7) {
                int i9 = i8 + 2;
                char c2 = c;
                u5 u5Var2 = u5Var;
                long j2 = jArr[i9];
                z = z2;
                if ((((int) j2) & 33554431) == i6) {
                    jArr[i8] = (i << c2) | (i2 & 4294967295L);
                    jArr[i8 + 1] = (i4 & 4294967295L) | (i3 << c2);
                    jArr[i9] = (((j2 >> 63) & 1) << 60) | j2;
                    break;
                } else {
                    i8 += 3;
                    c = c2;
                    u5Var = u5Var2;
                    z2 = z;
                }
            }
        }
        z = z2;
        u5 u5Var3 = u5Var;
        jd0 s = jd0Var.s();
        u5Var3.c(i5, i, i2, i3, i4, (r22 & 32) != 0 ? -1 : s != null ? s.e : -1, l7Var.g(1024), l7Var.g(16), this.b.a.a(i5), -1);
        this.d = z;
        eo0 x = jd0Var.x();
        Object[] objArr = x.d;
        int i10 = x.g;
        for (int i11 = 0; i11 < i10; i11++) {
            jd0 jd0Var3 = (jd0) objArr[i11];
            if (jd0Var3.G()) {
                d(jd0Var3);
            }
        }
    }

    public final void e(jd0 jd0Var) {
        if (jd0Var.l) {
            this.d = true;
            int i = jd0Var.e & 33554431;
            u5 u5Var = this.a;
            long[] jArr = (long[]) u5Var.b;
            int i2 = u5Var.a;
            int i3 = 0;
            while (true) {
                if (i3 >= jArr.length - 2 || i3 >= i2) {
                    break;
                }
                int i4 = i3 + 2;
                long j = jArr[i4];
                if ((((int) j) & 33554431) == i) {
                    jArr[i4] = (((j >> 63) & 1) << 60) | j;
                    break;
                }
                i3 += 3;
            }
        }
        j();
    }

    public final void f(jd0 jd0Var, boolean z) {
        long j;
        int i;
        int i2;
        int i3;
        int i4;
        boolean G = jd0Var.G();
        l7 l7Var = jd0Var.J;
        if (G) {
            jd0 s = jd0Var.s();
            if (s == null || s.g) {
                j = s == null ? 0L : 9223372034707292159L;
            } else {
                if (s.k) {
                    s.k = false;
                    s.j = g(s);
                }
                j = s.j;
            }
            qp0 qp0Var = (qp0) l7Var.e;
            if (s90.a(j, 9223372034707292159L) || c(qp0Var)) {
                d(jd0Var);
                return;
            }
            if (jd0Var.g) {
                d(jd0Var);
                i(jd0Var);
                return;
            }
            long c = s90.c(j, qp0Var.D);
            uk0 uk0Var = jd0Var.K.p;
            int W = uk0Var.W();
            int S = uk0Var.S();
            long j2 = (W << 32) | (S & 4294967295L);
            int i5 = jd0Var.e;
            boolean z2 = jd0Var.l;
            u5 u5Var = this.a;
            if (!z2) {
                jd0Var.l = true;
                boolean g = l7Var.g(1024);
                boolean g2 = l7Var.g(16);
                boolean a = this.b.a.a(i5);
                if (s != null) {
                    int i6 = s.e;
                    int i7 = (int) (c >> 32);
                    int i8 = (int) (c & 4294967295L);
                    int i9 = 33554431;
                    int i10 = i5 & 33554431;
                    long[] jArr = (long[]) u5Var.b;
                    int i11 = u5Var.a;
                    int i12 = 0;
                    while (true) {
                        if (i12 >= jArr.length - 2 || i12 >= i11) {
                            break;
                        }
                        int i13 = i9;
                        long[] jArr2 = jArr;
                        if ((((int) jArr2[i12 + 2]) & i13) == i6) {
                            long j3 = jArr2[i12];
                            int i14 = ((int) (j3 >> 32)) + i7;
                            int i15 = ((int) j3) + i8;
                            u5Var.c(i10, i14, i15, i14 + W, i15 + S, i6, g, g2, a, i12);
                            break;
                        }
                        jArr = jArr2;
                        i12 += 3;
                        i9 = i13;
                        i6 = i6;
                    }
                } else {
                    int i16 = (int) (c >> 32);
                    int i17 = (int) (c & 4294967295L);
                    u5Var.c(i5, i16, i17, i16 + W, i17 + S, (r22 & 32) != 0 ? -1 : 0, g, g2, a, -1);
                }
                this.d = true;
            } else if (z || !s90.a(c, jd0Var.h) || !ba0.a(j2, jd0Var.i)) {
                if (s == null) {
                    int i18 = (int) (c >> 32);
                    int i19 = (int) (c & 4294967295L);
                    int i20 = i18 + W;
                    int i21 = i19 + S;
                    int i22 = i5 & 33554431;
                    long[] jArr3 = (long[]) u5Var.b;
                    int i23 = u5Var.a;
                    int i24 = 0;
                    while (true) {
                        if (i24 >= jArr3.length - 2 || i24 >= i23) {
                            break;
                        }
                        int i25 = i24 + 2;
                        long[] jArr4 = jArr3;
                        int i26 = i23;
                        long j4 = jArr4[i25];
                        int i27 = i24;
                        if ((((int) j4) & 33554431) == i22) {
                            long j5 = jArr4[i27];
                            jArr4[i27] = (i18 << 32) | (i19 & 4294967295L);
                            jArr4[i27 + 1] = (i20 << 32) | (i21 & 4294967295L);
                            jArr4[i25] = j4 | (((j4 >> 63) & 1) << 60);
                            int i28 = i18 - ((int) (j5 >> 32));
                            int i29 = i19 - ((int) j5);
                            if ((i28 != 0) | (i29 != 0)) {
                                u5Var.f((j4 & t11.b) | (((i27 + 3) & 33554431) << 25), i28, i29);
                            }
                        } else {
                            i24 = i27 + 3;
                            jArr3 = jArr4;
                            i23 = i26;
                        }
                    }
                } else {
                    int i30 = s.e;
                    int i31 = (int) (c >> 32);
                    int i32 = (int) (c & 4294967295L);
                    int i33 = i5 & 33554431;
                    long[] jArr5 = (long[]) u5Var.b;
                    int i34 = u5Var.a;
                    int i35 = 0;
                    while (true) {
                        if (i35 >= jArr5.length - 2 || i35 >= i34) {
                            break;
                        }
                        int i36 = W;
                        if ((((int) jArr5[i35 + 2]) & 33554431) == i30) {
                            long j6 = jArr5[i35];
                            i3 = i31;
                            i4 = i32;
                            int i37 = ((int) (j6 >> 32)) + i3;
                            int i38 = ((int) j6) + i4;
                            int i39 = i37 + i36;
                            int i40 = i38 + S;
                            int i41 = i35 + 3;
                            i = i30;
                            while (i41 < jArr5.length - 2 && i41 < i34) {
                                int i42 = i41 + 2;
                                int i43 = i34;
                                long j7 = jArr5[i42];
                                int i44 = i41;
                                if ((((int) j7) & 33554431) == i33) {
                                    long j8 = jArr5[i44];
                                    int i45 = i37 - ((int) (j8 >> 32));
                                    int i46 = i38 - ((int) j8);
                                    jArr5[i44] = (i37 << 32) | (i38 & 4294967295L);
                                    jArr5[i44 + 1] = (i39 << 32) | (i40 & 4294967295L);
                                    jArr5[i42] = j7 | (((j7 >> 63) & 1) << 60);
                                    if (i45 != 0 || i46 != 0) {
                                        u5Var.f((j7 & t11.b) | (((i44 + 3) & 33554431) << 25), i45, i46);
                                    }
                                } else {
                                    i41 = i44 + 3;
                                    i34 = i43;
                                }
                            }
                            i2 = i34;
                            i35 = i41;
                        } else {
                            i = i30;
                            i2 = i34;
                            i3 = i31;
                            i4 = i32;
                        }
                        i35 += 3;
                        W = i36;
                        i31 = i3;
                        i32 = i4;
                        i30 = i;
                        i34 = i2;
                    }
                }
                this.d = true;
            }
            jd0Var.i = j2;
            jd0Var.h = c;
        }
    }

    public final void h(jd0 jd0Var) {
        if (jd0Var.l) {
            int i = jd0Var.e & 33554431;
            u5 u5Var = this.a;
            long[] jArr = (long[]) u5Var.b;
            int i2 = u5Var.a;
            int i3 = 0;
            while (true) {
                if (i3 >= jArr.length - 2 || i3 >= i2) {
                    break;
                }
                int i4 = i3 + 2;
                if ((((int) jArr[i4]) & 33554431) == i) {
                    jArr[i3] = -1;
                    jArr[i3 + 1] = -1;
                    jArr[i4] = t11.c;
                    break;
                }
                i3 += 3;
            }
            jd0Var.l = false;
            this.d = true;
            this.f = true;
        }
    }

    public final void j() {
        q2 q2Var = this.g;
        boolean z = q2Var != null;
        long j = this.b.c;
        if (j >= 0 || !z) {
            if (this.h == j && z) {
                return;
            }
            if (q2Var != null) {
                Handler handler = r2.a;
                r2.a.removeCallbacks(q2Var);
            }
            Handler handler2 = r2.a;
            long currentTimeMillis = System.currentTimeMillis();
            long max = Math.max(j, 16 + currentTimeMillis);
            this.h = max;
            q2 q2Var2 = new q2(this.i, 0);
            r2.a.postDelayed(q2Var2, max - currentTimeMillis);
            this.g = q2Var2;
        }
    }
}
