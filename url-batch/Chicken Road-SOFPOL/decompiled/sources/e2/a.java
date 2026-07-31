package e2;

import a0.b1;
import android.os.Handler;
import d1.o;
import f1.p;
import o.e0;
import o.x;
import o0.e;
import r2.i;
import w1.d1;
import w1.f0;
import w1.j1;
import w1.w0;
import x1.s;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final b1 f2470a;

    /* renamed from: b, reason: collision with root package name */
    public final b f2471b;

    /* renamed from: c, reason: collision with root package name */
    public final e0 f2472c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2473d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2474e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2475f;

    /* renamed from: g, reason: collision with root package name */
    public s f2476g;

    /* renamed from: h, reason: collision with root package name */
    public long f2477h;
    public final o i;

    /* renamed from: j, reason: collision with root package name */
    public final e1.a f2478j;

    public a() {
        b1 b1Var = new b1();
        b1Var.f23b = new long[192];
        b1Var.f24c = new long[192];
        this.f2470a = b1Var;
        this.f2471b = new b();
        this.f2472c = new e0();
        this.f2477h = -1L;
        this.i = new o(1, this);
        this.f2478j = new e1.a();
    }

    public static long a(d1 d1Var, long j7) {
        float[] b8;
        int c8;
        j1 j1Var = d1Var.L;
        if (j1Var == null || (c8 = s6.a.c((b8 = ((x1.j1) j1Var).b()))) == 3) {
            return j7;
        }
        if ((c8 & 2) == 0) {
            return 9223372034707292159L;
        }
        return m.a.K(p.m(b8, (Float.floatToRawIntBits((int) (j7 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j7 >> 32)) << 32)));
    }

    public static long h(f0 f0Var) {
        w1.b1 b1Var = f0Var.F;
        d1 d1Var = b1Var.f7598d;
        long j7 = 0;
        for (d1 d1Var2 = b1Var.f7597c; d1Var2 != null && d1Var2 != d1Var; d1Var2 = d1Var2.f7616t) {
            long a8 = a(d1Var2, j7);
            if (i.a(a8, 9223372034707292159L)) {
                return 9223372034707292159L;
            }
            j7 = i.c(a8, d1Var2.C);
        }
        return j7;
    }

    public static void i(f0 f0Var) {
        long j7;
        d1 d1Var = f0Var.F.f7598d;
        long a8 = a(d1Var, 0L);
        long j8 = 9223372034707292159L;
        if (!s6.a.d(a8)) {
            f0Var.f7641f = 9223372034707292159L;
            return;
        }
        long c8 = i.c(a8, d1Var.C);
        f0 s5 = f0Var.s();
        if (s5 != null) {
            if (!s6.a.d(s5.f7641f)) {
                i(s5);
            }
            long j9 = s5.f7641f;
            if (s6.a.d(j9)) {
                if (s5.i) {
                    j7 = h(s5);
                    s5.f7643h = j7;
                    s5.i = false;
                } else {
                    j7 = s5.f7643h;
                }
                if (s6.a.d(j7)) {
                    j8 = i.c(i.c(j9, j7), c8);
                }
            }
        } else {
            j8 = c8;
        }
        f0Var.f7641f = j8;
    }

    public final void b() {
        boolean z3;
        long j7;
        long j8;
        long j9;
        Handler handler = y0.a.f8680a;
        long currentTimeMillis = System.currentTimeMillis();
        boolean z7 = this.f2473d;
        boolean z8 = z7 || this.f2474e;
        b1 b1Var = this.f2470a;
        b bVar = this.f2471b;
        if (z7) {
            this.f2473d = false;
            e0 e0Var = this.f2472c;
            j7 = 128;
            Object[] objArr = e0Var.f5442a;
            int i = e0Var.f5443b;
            for (int i8 = 0; i8 < i; i8++) {
                ((p6.a) objArr[i8]).b();
            }
            long[] jArr = (long[]) b1Var.f23b;
            int i9 = b1Var.f22a;
            j8 = 255;
            for (int i10 = 0; i10 < jArr.length - 2 && i10 < i9; i10 += 3) {
                long j10 = jArr[i10 + 2];
                if ((((int) (j10 >> 61)) & 1) != 0) {
                    long j11 = jArr[i10];
                    long j12 = jArr[i10 + 1];
                    if (bVar.f2479a.b(((int) j10) & 67108863) != null) {
                        throw new ClassCastException();
                    }
                }
            }
            j9 = -9187201950435737472L;
            x xVar = bVar.f2479a;
            Object[] objArr2 = xVar.f5496c;
            long[] jArr2 = xVar.f5494a;
            int length = jArr2.length - 2;
            if (length >= 0) {
                int i11 = 0;
                while (true) {
                    long j13 = jArr2[i11];
                    z3 = z8;
                    if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i12 = 8 - ((~(i11 - length)) >>> 31);
                        for (int i13 = 0; i13 < i12; i13++) {
                            if ((j13 & 255) < 128 && objArr2[(i11 << 3) + i13] != null) {
                                throw new ClassCastException();
                            }
                            j13 >>= 8;
                        }
                        if (i12 != 8) {
                            break;
                        }
                    }
                    if (i11 == length) {
                        break;
                    }
                    i11++;
                    z8 = z3;
                }
            } else {
                z3 = z8;
            }
            long[] jArr3 = (long[]) b1Var.f23b;
            int i14 = b1Var.f22a;
            for (int i15 = 0; i15 < jArr3.length - 2 && i15 < i14; i15 += 3) {
                int i16 = i15 + 2;
                jArr3[i16] = jArr3[i16] & (-2305843009213693953L);
            }
        } else {
            z3 = z8;
            j7 = 128;
            j8 = 255;
            j9 = -9187201950435737472L;
        }
        if (this.f2474e) {
            this.f2474e = false;
            x xVar2 = bVar.f2479a;
            Object[] objArr3 = xVar2.f5496c;
            long[] jArr4 = xVar2.f5494a;
            int length2 = jArr4.length - 2;
            if (length2 >= 0) {
                int i17 = 0;
                while (true) {
                    long j14 = jArr4[i17];
                    if ((((~j14) << 7) & j14 & j9) != j9) {
                        int i18 = 8 - ((~(i17 - length2)) >>> 31);
                        for (int i19 = 0; i19 < i18; i19++) {
                            if ((j14 & j8) < j7 && objArr3[(i17 << 3) + i19] != null) {
                                throw new ClassCastException();
                            }
                            j14 >>= 8;
                        }
                        if (i18 != 8) {
                            break;
                        }
                    }
                    if (i17 == length2) {
                        break;
                    } else {
                        i17++;
                    }
                }
            }
        }
        if (z3) {
            bVar.getClass();
        }
        if (this.f2475f) {
            this.f2475f = false;
            long[] jArr5 = (long[]) b1Var.f23b;
            int i20 = b1Var.f22a;
            long[] jArr6 = (long[]) b1Var.f24c;
            int i21 = 0;
            for (int i22 = 0; i22 < jArr5.length - 2 && i21 < jArr6.length - 2 && i22 < i20; i22 += 3) {
                int i23 = i22 + 2;
                if (jArr5[i23] != 2305843009213693951L) {
                    jArr6[i21] = jArr5[i22];
                    jArr6[i21 + 1] = jArr5[i22 + 1];
                    jArr6[i21 + 2] = jArr5[i23];
                    i21 += 3;
                }
            }
            b1Var.f22a = i21;
            b1Var.f23b = jArr6;
            b1Var.f24c = jArr5;
        }
        if (bVar.f2480b <= currentTimeMillis) {
            x xVar3 = bVar.f2479a;
            Object[] objArr4 = xVar3.f5496c;
            long[] jArr7 = xVar3.f5494a;
            int length3 = jArr7.length - 2;
            if (length3 >= 0) {
                int i24 = 0;
                while (true) {
                    long j15 = jArr7[i24];
                    if ((((~j15) << 7) & j15 & j9) != j9) {
                        int i25 = 8 - ((~(i24 - length3)) >>> 31);
                        for (int i26 = 0; i26 < i25; i26++) {
                            if ((j15 & j8) < j7 && objArr4[(i24 << 3) + i26] != null) {
                                throw new ClassCastException();
                            }
                            j15 >>= 8;
                        }
                        if (i25 != 8) {
                            break;
                        }
                    }
                    if (i24 == length3) {
                        break;
                    } else {
                        i24++;
                    }
                }
            }
            bVar.f2480b = -1L;
        }
        if (bVar.f2480b > 0) {
            k();
        }
    }

    public final void c(f0 f0Var, boolean z3) {
        char c8;
        boolean z7;
        w1.b1 b1Var = f0Var.F;
        d1 d1Var = b1Var.f7598d;
        w0 w0Var = f0Var.G.f7700p;
        int S = w0Var.S();
        float Q = w0Var.Q();
        e1.a aVar = this.f2478j;
        aVar.f2451a = 0.0f;
        aVar.f2452b = 0.0f;
        aVar.f2453c = S;
        aVar.f2454d = Q;
        while (true) {
            c8 = ' ';
            if (d1Var == null) {
                break;
            }
            j1 j1Var = d1Var.L;
            if (j1Var != null) {
                float[] b8 = ((x1.j1) j1Var).b();
                if (!p.l(b8)) {
                    p.n(b8, aVar);
                }
            }
            long j7 = d1Var.C;
            long floatToRawIntBits = (Float.floatToRawIntBits((int) (j7 >> 32)) << 32) | (Float.floatToRawIntBits((int) (j7 & 4294967295L)) & 4294967295L);
            float intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & floatToRawIntBits));
            aVar.f2451a += intBitsToFloat;
            aVar.f2452b += intBitsToFloat2;
            aVar.f2453c += intBitsToFloat;
            aVar.f2454d += intBitsToFloat2;
            d1Var = d1Var.f7616t;
        }
        int i = (int) aVar.f2451a;
        int i8 = (int) aVar.f2452b;
        int i9 = (int) aVar.f2453c;
        int i10 = (int) aVar.f2454d;
        int i11 = f0Var.f7640e;
        b1 b1Var2 = this.f2470a;
        if (!z3) {
            int i12 = i11 & 67108863;
            long[] jArr = (long[]) b1Var2.f23b;
            int i13 = b1Var2.f22a;
            int i14 = 0;
            while (i14 < jArr.length - 2 && i14 < i13) {
                int i15 = i14 + 2;
                char c9 = c8;
                b1 b1Var3 = b1Var2;
                long j8 = jArr[i15];
                z7 = true;
                if ((((int) j8) & 67108863) == i12) {
                    jArr[i14] = (i << c9) | (i8 & 4294967295L);
                    jArr[i14 + 1] = (i9 << c9) | (i10 & 4294967295L);
                    jArr[i15] = 2305843009213693952L | j8;
                    break;
                } else {
                    i14 += 3;
                    c8 = c9;
                    b1Var2 = b1Var3;
                }
            }
        }
        b1 b1Var4 = b1Var2;
        z7 = true;
        f0 s5 = f0Var.s();
        b1Var4.d(i11, i, i8, i9, i10, s5 != null ? s5.f7640e : -1, b1Var.d(1024), b1Var.d(16));
        this.f2473d = z7;
    }

    public final void d(f0 f0Var) {
        e x7 = f0Var.x();
        Object[] objArr = x7.f5578d;
        int i = x7.f5580f;
        for (int i8 = 0; i8 < i; i8++) {
            f0 f0Var2 = (f0) objArr[i8];
            c(f0Var2, false);
            d(f0Var2);
        }
    }

    public final void e(f0 f0Var) {
        this.f2473d = true;
        int i = f0Var.f7640e & 67108863;
        b1 b1Var = this.f2470a;
        long[] jArr = (long[]) b1Var.f23b;
        int i8 = b1Var.f22a;
        int i9 = 0;
        while (true) {
            if (i9 >= jArr.length - 2 || i9 >= i8) {
                break;
            }
            int i10 = i9 + 2;
            long j7 = jArr[i10];
            if ((((int) j7) & 67108863) == i) {
                jArr[i10] = 2305843009213693952L | j7;
                break;
            }
            i9 += 3;
        }
        k();
    }

    public final void f(f0 f0Var) {
        long h8 = h(f0Var);
        if (!s6.a.d(h8)) {
            d(f0Var);
            return;
        }
        f0Var.f7643h = h8;
        f0Var.i = false;
        e x7 = f0Var.x();
        Object[] objArr = x7.f5578d;
        int i = x7.f5580f;
        for (int i8 = 0; i8 < i; i8++) {
            g((f0) objArr[i8], false);
        }
        e(f0Var);
    }

    public final void g(f0 f0Var, boolean z3) {
        long j7;
        char c8;
        int i;
        w0 w0Var = f0Var.G.f7700p;
        int S = w0Var.S();
        int Q = w0Var.Q();
        long j8 = f0Var.f7641f;
        long j9 = f0Var.f7642g;
        int i8 = (int) (j9 >> 32);
        int i9 = (int) (j9 & 4294967295L);
        i(f0Var);
        long j10 = f0Var.f7641f;
        if (!s6.a.d(j10)) {
            c(f0Var, z3);
            return;
        }
        f0Var.f7642g = (Q & 4294967295L) | (S << 32);
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & 4294967295L);
        int i12 = i10 + S;
        int i13 = i11 + Q;
        if (!z3 && i.a(j10, j8) && i8 == S && i9 == Q) {
            return;
        }
        int i14 = f0Var.f7640e;
        w1.b1 b1Var = f0Var.F;
        b1 b1Var2 = this.f2470a;
        if (!z3) {
            int i15 = i14 & 67108863;
            long[] jArr = (long[]) b1Var2.f23b;
            int i16 = b1Var2.f22a;
            int i17 = 0;
            while (i17 < jArr.length - 2 && i17 < i16) {
                int i18 = i17 + 2;
                int i19 = i17;
                long j11 = jArr[i18];
                if ((((int) j11) & 67108863) == i15) {
                    long j12 = jArr[i19];
                    jArr[i19] = (i10 << 32) | (i11 & 4294967295L);
                    jArr[i19 + 1] = (i12 << 32) | (i13 & 4294967295L);
                    long j13 = 2305843009213693952L;
                    jArr[i18] = j11 | 2305843009213693952L;
                    if ((i10 - ((int) (j12 >> 32)) != 0) | (i11 - ((int) j12) != 0)) {
                        long j14 = -4503599560261633L;
                        char c9 = 26;
                        long[] jArr2 = (long[]) b1Var2.f23b;
                        long[] jArr3 = (long[]) b1Var2.f24c;
                        jArr3[0] = (j11 & (-4503599560261633L)) | (((i19 + 3) & 67108863) << 26);
                        int i20 = 1;
                        while (i20 > 0) {
                            i20--;
                            long j15 = jArr3[i20];
                            int i21 = ((int) j15) & 67108863;
                            int i22 = ((int) (j15 >> c9)) & 67108863;
                            char c10 = 511;
                            int i23 = ((int) (j15 >> 52)) & 511;
                            int length = i23 == 511 ? jArr2.length : i23 + i22;
                            if (i22 < 0) {
                                break;
                            }
                            char c11 = c9;
                            while (i22 < jArr2.length - 2 && i22 < length) {
                                int i24 = i22 + 2;
                                long j16 = jArr2[i24];
                                long j17 = j14;
                                if ((((int) (j16 >> c11)) & 67108863) == i21) {
                                    long j18 = jArr2[i22];
                                    int i25 = i22 + 1;
                                    j7 = j13;
                                    long j19 = jArr2[i25];
                                    i = i22;
                                    jArr2[i] = ((((int) j18) + r10) & 4294967295L) | ((((int) (j18 >> 32)) + r7) << 32);
                                    jArr2[i25] = ((((int) j19) + r10) & 4294967295L) | ((((int) (j19 >> 32)) + r7) << 32);
                                    jArr2[i24] = j16 | j7;
                                    c8 = 511;
                                    if ((((int) (j16 >> 52)) & 511) > 0) {
                                        jArr3[i20] = (j16 & j17) | (((i + 3) & 67108863) << c11);
                                        i20++;
                                    }
                                } else {
                                    j7 = j13;
                                    c8 = c10;
                                    i = i22;
                                }
                                i22 = i + 3;
                                c10 = c8;
                                j14 = j17;
                                j13 = j7;
                            }
                            c9 = c11;
                            j14 = j14;
                            j13 = j13;
                        }
                    }
                    this.f2473d = true;
                }
                i17 = i19 + 3;
            }
        }
        f0 s5 = f0Var.s();
        b1Var2.d(i14, i10, i11, i12, i13, s5 != null ? s5.f7640e : -1, b1Var.d(1024), b1Var.d(16));
        this.f2473d = true;
    }

    public final void j(f0 f0Var) {
        int i = f0Var.f7640e & 67108863;
        b1 b1Var = this.f2470a;
        long[] jArr = (long[]) b1Var.f23b;
        int i8 = b1Var.f22a;
        int i9 = 0;
        while (true) {
            if (i9 >= jArr.length - 2 || i9 >= i8) {
                break;
            }
            int i10 = i9 + 2;
            if ((((int) jArr[i10]) & 67108863) == i) {
                jArr[i9] = -1;
                jArr[i9 + 1] = -1;
                jArr[i10] = 2305843009213693951L;
                break;
            }
            i9 += 3;
        }
        this.f2473d = true;
        this.f2475f = true;
    }

    public final void k() {
        s sVar = this.f2476g;
        boolean z3 = sVar != null;
        long j7 = this.f2471b.f2480b;
        if (j7 >= 0 || !z3) {
            if (this.f2477h == j7 && z3) {
                return;
            }
            if (sVar != null) {
                Handler handler = y0.a.f8680a;
                y0.a.f8680a.removeCallbacks(sVar);
            }
            Handler handler2 = y0.a.f8680a;
            long currentTimeMillis = System.currentTimeMillis();
            long max = Math.max(j7, 16 + currentTimeMillis);
            this.f2477h = max;
            s sVar2 = new s(this.i, 1);
            y0.a.f8680a.postDelayed(sVar2, max - currentTimeMillis);
            this.f2476g = sVar2;
        }
    }
}
