package defpackage;

import android.os.Handler;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class x72 {
    public final yf a;
    public final jx2 b;
    public final jn1 c;
    public boolean d;
    public boolean e;
    public boolean f;
    public n4 g;
    public long h;
    public final u i;
    public final sn1 j;

    public x72() {
        yf yfVar = new yf(5, (byte) 0);
        yfVar.o = new long[192];
        yfVar.p = new long[192];
        this.a = yfVar;
        this.b = new jx2();
        this.c = new jn1();
        this.h = -1L;
        this.i = new u(28, this);
        this.j = new sn1();
    }

    public static long a(ks1 ks1Var, long j) {
        float[] b;
        int k;
        qx1 qx1Var = ks1Var.U;
        if (qx1Var == null || (k = yk3.k((b = ((fw0) qx1Var).b()))) == 3) {
            return j;
        }
        if ((k & 2) == 0) {
            return 9223372034707292159L;
        }
        return yk3.R(ti1.b((Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32), b));
    }

    public static long h(i91 i91Var) {
        fs1 fs1Var = i91Var.P;
        ks1 ks1Var = fs1Var.d;
        long j = 0;
        for (ks1 ks1Var2 = fs1Var.c; ks1Var2 != null && ks1Var2 != ks1Var; ks1Var2 = ks1Var2.C) {
            long a = a(ks1Var2, j);
            if (s31.a(a, 9223372034707292159L)) {
                return 9223372034707292159L;
            }
            j = s31.c(a, ks1Var2.L);
        }
        return j;
    }

    public static void i(i91 i91Var) {
        long j;
        ks1 ks1Var = i91Var.P.d;
        long a = a(ks1Var, 0L);
        long j2 = 9223372034707292159L;
        if (!yk3.l(a)) {
            i91Var.o = 9223372034707292159L;
            return;
        }
        long c = s31.c(a, ks1Var.L);
        i91 u = i91Var.u();
        if (u != null) {
            if (!yk3.l(u.o)) {
                i(u);
            }
            long j3 = u.o;
            if (yk3.l(j3)) {
                if (u.r) {
                    j = h(u);
                    u.q = j;
                    u.r = false;
                } else {
                    j = u.q;
                }
                if (yk3.l(j)) {
                    j2 = s31.c(s31.c(j3, j), c);
                }
            }
        } else {
            j2 = c;
        }
        i91Var.o = j2;
    }

    public final void b() {
        boolean z;
        long j;
        long j2;
        long j3;
        Handler handler = o4.a;
        long currentTimeMillis = System.currentTimeMillis();
        boolean z2 = this.d;
        boolean z3 = z2 || this.e;
        yf yfVar = this.a;
        jx2 jx2Var = this.b;
        if (z2) {
            this.d = false;
            jn1 jn1Var = this.c;
            j = 128;
            Object[] objArr = jn1Var.a;
            int i = jn1Var.b;
            for (int i2 = 0; i2 < i; i2++) {
                ((Function0) objArr[i2]).invoke();
            }
            long[] jArr = (long[]) yfVar.o;
            int i3 = yfVar.n;
            j2 = 255;
            for (int i4 = 0; i4 < jArr.length - 2 && i4 < i3; i4 += 3) {
                long j4 = jArr[i4 + 2];
                if ((((int) (j4 >> 61)) & 1) != 0) {
                    long j5 = jArr[i4];
                    long j6 = jArr[i4 + 1];
                    if (jx2Var.a.b(((int) j4) & 67108863) != null) {
                        b71.o();
                        return;
                    }
                }
            }
            j3 = -9187201950435737472L;
            zm1 zm1Var = jx2Var.a;
            Object[] objArr2 = zm1Var.c;
            long[] jArr2 = zm1Var.a;
            int length = jArr2.length - 2;
            if (length >= 0) {
                int i5 = 0;
                while (true) {
                    long j7 = jArr2[i5];
                    z = z3;
                    if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8 - ((~(i5 - length)) >>> 31);
                        for (int i7 = 0; i7 < i6; i7++) {
                            if ((j7 & 255) < 128 && objArr2[(i5 << 3) + i7] != null) {
                                b71.o();
                                return;
                            }
                            j7 >>= 8;
                        }
                        if (i6 != 8) {
                            break;
                        }
                    }
                    if (i5 == length) {
                        break;
                    }
                    i5++;
                    z3 = z;
                }
            } else {
                z = z3;
            }
            long[] jArr3 = (long[]) yfVar.o;
            int i8 = yfVar.n;
            for (int i9 = 0; i9 < jArr3.length - 2 && i9 < i8; i9 += 3) {
                int i10 = i9 + 2;
                jArr3[i10] = jArr3[i10] & (-2305843009213693953L);
            }
        } else {
            z = z3;
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
        }
        if (this.e) {
            this.e = false;
            zm1 zm1Var2 = jx2Var.a;
            Object[] objArr3 = zm1Var2.c;
            long[] jArr4 = zm1Var2.a;
            int length2 = jArr4.length - 2;
            if (length2 >= 0) {
                int i11 = 0;
                while (true) {
                    long j8 = jArr4[i11];
                    if ((((~j8) << 7) & j8 & j3) != j3) {
                        int i12 = 8 - ((~(i11 - length2)) >>> 31);
                        for (int i13 = 0; i13 < i12; i13++) {
                            if ((j8 & j2) < j && objArr3[(i11 << 3) + i13] != null) {
                                b71.o();
                                return;
                            }
                            j8 >>= 8;
                        }
                        if (i12 != 8) {
                            break;
                        }
                    }
                    if (i11 == length2) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
        }
        if (z) {
            jx2Var.getClass();
        }
        if (this.f) {
            this.f = false;
            long[] jArr5 = (long[]) yfVar.o;
            int i14 = yfVar.n;
            long[] jArr6 = (long[]) yfVar.p;
            int i15 = 0;
            for (int i16 = 0; i16 < jArr5.length - 2 && i15 < jArr6.length - 2 && i16 < i14; i16 += 3) {
                int i17 = i16 + 2;
                if (jArr5[i17] != 2305843009213693951L) {
                    jArr6[i15] = jArr5[i16];
                    jArr6[i15 + 1] = jArr5[i16 + 1];
                    jArr6[i15 + 2] = jArr5[i17];
                    i15 += 3;
                }
            }
            yfVar.n = i15;
            yfVar.o = jArr6;
            yfVar.p = jArr5;
        }
        if (jx2Var.b > currentTimeMillis) {
            return;
        }
        zm1 zm1Var3 = jx2Var.a;
        Object[] objArr4 = zm1Var3.c;
        long[] jArr7 = zm1Var3.a;
        int length3 = jArr7.length - 2;
        if (length3 >= 0) {
            int i18 = 0;
            while (true) {
                long j9 = jArr7[i18];
                if ((((~j9) << 7) & j9 & j3) != j3) {
                    int i19 = 8 - ((~(i18 - length3)) >>> 31);
                    for (int i20 = 0; i20 < i19; i20++) {
                        if ((j9 & j2) < j && objArr4[(i18 << 3) + i20] != null) {
                            b71.o();
                            return;
                        }
                        j9 >>= 8;
                    }
                    if (i19 != 8) {
                        break;
                    }
                }
                if (i18 == length3) {
                    break;
                } else {
                    i18++;
                }
            }
        }
        jx2Var.b = -1L;
    }

    public final void c(i91 i91Var, boolean z) {
        char c;
        boolean z2;
        fs1 fs1Var = i91Var.P;
        ks1 ks1Var = fs1Var.d;
        nj1 nj1Var = i91Var.Q.p;
        int e0 = nj1Var.e0();
        float d0 = nj1Var.d0();
        sn1 sn1Var = this.j;
        sn1Var.a = 0.0f;
        sn1Var.b = 0.0f;
        sn1Var.c = e0;
        sn1Var.d = d0;
        while (true) {
            c = ' ';
            if (ks1Var == null) {
                break;
            }
            qx1 qx1Var = ks1Var.U;
            if (qx1Var != null) {
                float[] b = ((fw0) qx1Var).b();
                if (!ll3.M(b)) {
                    ti1.c(b, sn1Var);
                }
            }
            long j = ks1Var.L;
            long floatToRawIntBits = (Float.floatToRawIntBits((int) (j >> 32)) << 32) | (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L);
            float intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & floatToRawIntBits));
            sn1Var.a += intBitsToFloat;
            sn1Var.b += intBitsToFloat2;
            sn1Var.c += intBitsToFloat;
            sn1Var.d += intBitsToFloat2;
            ks1Var = ks1Var.C;
        }
        int i = (int) sn1Var.a;
        int i2 = (int) sn1Var.b;
        int i3 = (int) sn1Var.c;
        int i4 = (int) sn1Var.d;
        int i5 = i91Var.n;
        yf yfVar = this.a;
        if (!z) {
            int i6 = i5 & 67108863;
            long[] jArr = (long[]) yfVar.o;
            int i7 = yfVar.n;
            int i8 = 0;
            while (i8 < jArr.length - 2 && i8 < i7) {
                int i9 = i8 + 2;
                char c2 = c;
                yf yfVar2 = yfVar;
                long j2 = jArr[i9];
                z2 = true;
                if ((((int) j2) & 67108863) == i6) {
                    jArr[i8] = (i << c2) | (i2 & 4294967295L);
                    jArr[i8 + 1] = (i3 << c2) | (i4 & 4294967295L);
                    jArr[i9] = 2305843009213693952L | j2;
                    break;
                } else {
                    i8 += 3;
                    c = c2;
                    yfVar = yfVar2;
                }
            }
        }
        yf yfVar3 = yfVar;
        z2 = true;
        i91 u = i91Var.u();
        yfVar3.h(i5, i, i2, i3, i4, u != null ? u.n : -1, fs1Var.d(1024), fs1Var.d(16));
        this.d = z2;
    }

    public final void d(i91 i91Var) {
        eo1 y = i91Var.y();
        Object[] objArr = y.m;
        int i = y.o;
        for (int i2 = 0; i2 < i; i2++) {
            i91 i91Var2 = (i91) objArr[i2];
            c(i91Var2, false);
            d(i91Var2);
        }
    }

    public final void e(i91 i91Var) {
        this.d = true;
        int i = i91Var.n & 67108863;
        yf yfVar = this.a;
        long[] jArr = (long[]) yfVar.o;
        int i2 = yfVar.n;
        int i3 = 0;
        while (true) {
            if (i3 >= jArr.length - 2 || i3 >= i2) {
                break;
            }
            int i4 = i3 + 2;
            long j = jArr[i4];
            if ((((int) j) & 67108863) == i) {
                jArr[i4] = 2305843009213693952L | j;
                break;
            }
            i3 += 3;
        }
        n4 n4Var = this.g;
        boolean z = n4Var != null;
        long j2 = this.b.b;
        if (j2 >= 0 || !z) {
            if (this.h == j2 && z) {
                return;
            }
            if (n4Var != null) {
                Handler handler = o4.a;
                o4.a.removeCallbacks(n4Var);
            }
            Handler handler2 = o4.a;
            long currentTimeMillis = System.currentTimeMillis();
            long max = Math.max(j2, 16 + currentTimeMillis);
            this.h = max;
            n4 n4Var2 = new n4(0, this.i);
            o4.a.postDelayed(n4Var2, max - currentTimeMillis);
            this.g = n4Var2;
        }
    }

    public final void f(i91 i91Var) {
        long h = h(i91Var);
        if (!yk3.l(h)) {
            d(i91Var);
            return;
        }
        i91Var.q = h;
        i91Var.r = false;
        eo1 y = i91Var.y();
        Object[] objArr = y.m;
        int i = y.o;
        for (int i2 = 0; i2 < i; i2++) {
            g((i91) objArr[i2], false);
        }
        e(i91Var);
    }

    public final void g(i91 i91Var, boolean z) {
        long j;
        char c;
        nj1 nj1Var = i91Var.Q.p;
        int e0 = nj1Var.e0();
        int d0 = nj1Var.d0();
        long j2 = i91Var.o;
        long j3 = i91Var.p;
        int i = (int) (j3 >> 32);
        int i2 = (int) (j3 & 4294967295L);
        i(i91Var);
        long j4 = i91Var.o;
        if (!yk3.l(j4)) {
            c(i91Var, z);
            return;
        }
        i91Var.p = (d0 & 4294967295L) | (e0 << 32);
        int i3 = (int) (j4 >> 32);
        int i4 = (int) (j4 & 4294967295L);
        int i5 = i3 + e0;
        int i6 = i4 + d0;
        if (!z && s31.a(j4, j2) && i == e0 && i2 == d0) {
            return;
        }
        int i7 = i91Var.n;
        fs1 fs1Var = i91Var.P;
        yf yfVar = this.a;
        if (!z) {
            int i8 = i7 & 67108863;
            long[] jArr = (long[]) yfVar.o;
            int i9 = yfVar.n;
            int i10 = 0;
            while (i10 < jArr.length - 2 && i10 < i9) {
                int i11 = i10 + 2;
                int i12 = i10;
                long j5 = jArr[i11];
                if ((((int) j5) & 67108863) == i8) {
                    long j6 = jArr[i12];
                    jArr[i12] = (i3 << 32) | (i4 & 4294967295L);
                    jArr[i12 + 1] = (i5 << 32) | (i6 & 4294967295L);
                    long j7 = 2305843009213693952L;
                    jArr[i11] = j5 | 2305843009213693952L;
                    if ((i3 - ((int) (j6 >> 32)) != 0) | (i4 - ((int) j6) != 0)) {
                        long j8 = -4503599560261633L;
                        char c2 = 26;
                        long[] jArr2 = (long[]) yfVar.o;
                        long[] jArr3 = (long[]) yfVar.p;
                        int i13 = yfVar.n / 3;
                        jArr3[0] = (j5 & (-4503599560261633L)) | (((i12 + 3) & 67108863) << 26);
                        int i14 = 1;
                        while (i14 > 0) {
                            i14--;
                            long j9 = jArr3[i14];
                            int i15 = ((int) j9) & 67108863;
                            char c3 = c2;
                            long j10 = j8;
                            int i16 = ((int) (j9 >> c3)) & 67108863;
                            char c4 = '4';
                            int i17 = (int) (j9 >> 52);
                            char c5 = 511;
                            int i18 = i17 & 511;
                            int i19 = i18 == 511 ? i13 : i18 + i16;
                            if (i16 < 0) {
                                break;
                            }
                            while (i16 < jArr2.length - 2 && i16 < i19) {
                                int i20 = i16 + 2;
                                long j11 = jArr2[i20];
                                char c6 = c4;
                                int i21 = i19;
                                if ((((int) (j11 >> c3)) & 67108863) == i15) {
                                    long j12 = jArr2[i16];
                                    int i22 = i16 + 1;
                                    j = j7;
                                    long j13 = jArr2[i22];
                                    jArr2[i16] = ((((int) j12) + r10) & 4294967295L) | ((((int) (j12 >> 32)) + r7) << 32);
                                    jArr2[i22] = ((((int) j13) + r10) & 4294967295L) | ((((int) (j13 >> 32)) + r7) << 32);
                                    jArr2[i20] = j11 | j;
                                    c = 511;
                                    if ((((int) (j11 >> c6)) & 511) > 0) {
                                        jArr3[i14] = (((i16 + 3) & 67108863) << c3) | (j11 & j10);
                                        i14++;
                                    }
                                } else {
                                    j = j7;
                                    c = c5;
                                }
                                i16 += 3;
                                c5 = c;
                                c4 = c6;
                                i19 = i21;
                                j7 = j;
                            }
                            c2 = c3;
                            j8 = j10;
                            j7 = j7;
                        }
                    }
                    this.d = true;
                }
                i10 = i12 + 3;
            }
        }
        i91 u = i91Var.u();
        yfVar.h(i7, i3, i4, i5, i6, u != null ? u.n : -1, fs1Var.d(1024), fs1Var.d(16));
        this.d = true;
    }

    public final void j(i91 i91Var) {
        int i = i91Var.n & 67108863;
        yf yfVar = this.a;
        long[] jArr = (long[]) yfVar.o;
        int i2 = yfVar.n;
        int i3 = 0;
        while (true) {
            if (i3 >= jArr.length - 2 || i3 >= i2) {
                break;
            }
            int i4 = i3 + 2;
            if ((((int) jArr[i4]) & 67108863) == i) {
                jArr[i3] = -1;
                jArr[i3 + 1] = -1;
                jArr[i4] = 2305843009213693951L;
                break;
            }
            i3 += 3;
        }
        this.d = true;
        this.f = true;
    }
}
