package V2;

import java.math.BigInteger;

/* loaded from: classes3.dex */
public abstract class R0 {

    /* renamed from: a, reason: collision with root package name */
    private static final long[] f9513a = {3161836309350906777L, -7642453882179322845L, -3821226941089661423L, 7312758566309945096L, -556661012383879292L, 8945041530681231562L, -4750851271514160027L, 6847946401097695794L, 541669439031730457L};

    private static void a(long[] jArr, int i4, long[] jArr2, int i5, long[] jArr3, int i6) {
        for (int i7 = 0; i7 < 9; i7++) {
            jArr3[i6 + i7] = jArr[i4 + i7] ^ jArr2[i5 + i7];
        }
    }

    public static void b(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i4 = 0; i4 < 9; i4++) {
            jArr3[i4] = jArr[i4] ^ jArr2[i4];
        }
    }

    private static void c(long[] jArr, int i4, long[] jArr2, int i5, long[] jArr3, int i6) {
        for (int i7 = 0; i7 < 9; i7++) {
            int i8 = i6 + i7;
            jArr3[i8] = jArr3[i8] ^ (jArr[i4 + i7] ^ jArr2[i5 + i7]);
        }
    }

    public static void d(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i4 = 0; i4 < 9; i4++) {
            jArr3[i4] = jArr3[i4] ^ (jArr[i4] ^ jArr2[i4]);
        }
    }

    public static void e(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i4 = 0; i4 < 18; i4++) {
            jArr3[i4] = jArr[i4] ^ jArr2[i4];
        }
    }

    public static void f(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        for (int i4 = 1; i4 < 9; i4++) {
            jArr2[i4] = jArr[i4];
        }
    }

    public static long[] g(BigInteger bigInteger) {
        long[] d4 = Y2.l.d(bigInteger);
        q(d4, 0);
        return d4;
    }

    protected static void h(long[] jArr, long[] jArr2, long[] jArr3) {
        i(jArr, o(jArr2), jArr3);
    }

    protected static void i(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i4 = 56; i4 >= 0; i4 -= 8) {
            for (int i5 = 1; i5 < 9; i5 += 2) {
                int i6 = (int) (jArr[i5] >>> i4);
                c(jArr2, (i6 & 15) * 9, jArr2, (((i6 >>> 4) & 15) + 16) * 9, jArr3, i5 - 1);
            }
            Y2.m.H(16, jArr3, 0, 8, 0L);
        }
        for (int i7 = 56; i7 >= 0; i7 -= 8) {
            int i8 = 0;
            while (i8 < 9) {
                int i9 = (int) (jArr[i8] >>> i7);
                int i10 = i8;
                c(jArr2, (i9 & 15) * 9, jArr2, (((i9 >>> 4) & 15) + 16) * 9, jArr3, i10);
                i8 = i10 + 2;
            }
            if (i7 > 0) {
                Y2.m.H(18, jArr3, 0, 8, 0L);
            }
        }
    }

    protected static void j(long[] jArr, long[] jArr2) {
        for (int i4 = 0; i4 < 9; i4++) {
            Y2.a.c(jArr[i4], jArr2, i4 << 1);
        }
    }

    public static void k(long[] jArr, long[] jArr2) {
        if (Y2.l.f(jArr)) {
            throw new IllegalStateException();
        }
        long[] a4 = Y2.l.a();
        long[] a5 = Y2.l.a();
        long[] a6 = Y2.l.a();
        s(jArr, a6);
        s(a6, a4);
        s(a4, a5);
        l(a4, a5, a4);
        u(a4, 2, a5);
        l(a4, a5, a4);
        l(a4, a6, a4);
        u(a4, 5, a5);
        l(a4, a5, a4);
        u(a5, 5, a5);
        l(a4, a5, a4);
        u(a4, 15, a5);
        l(a4, a5, a6);
        u(a6, 30, a4);
        u(a4, 30, a5);
        l(a4, a5, a4);
        u(a4, 60, a5);
        l(a4, a5, a4);
        u(a5, 60, a5);
        l(a4, a5, a4);
        u(a4, 180, a5);
        l(a4, a5, a4);
        u(a5, 180, a5);
        l(a4, a5, a4);
        l(a4, a6, jArr2);
    }

    public static void l(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] b4 = Y2.l.b();
        h(jArr, jArr2, b4);
        p(b4, jArr3);
    }

    public static void m(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] b4 = Y2.l.b();
        h(jArr, jArr2, b4);
        e(jArr3, b4, jArr3);
    }

    public static void n(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] b4 = Y2.l.b();
        i(jArr, jArr2, b4);
        p(b4, jArr3);
    }

    public static long[] o(long[] jArr) {
        long[] jArr2 = new long[288];
        System.arraycopy(jArr, 0, jArr2, 9, 9);
        int i4 = 7;
        int i5 = 0;
        while (i4 > 0) {
            int i6 = i5 + 18;
            Y2.m.E(9, jArr2, i6 >>> 1, 0L, jArr2, i6);
            q(jArr2, i6);
            long[] jArr3 = jArr2;
            a(jArr3, 9, jArr3, i6, jArr3, i5 + 27);
            jArr2 = jArr3;
            i4--;
            i5 = i6;
        }
        Y2.m.I(144, jArr2, 0, 4, 0L, jArr2, 144);
        return jArr2;
    }

    public static void p(long[] jArr, long[] jArr2) {
        long j4 = jArr[9];
        long j5 = jArr[17];
        long j6 = (((j4 ^ (j5 >>> 59)) ^ (j5 >>> 57)) ^ (j5 >>> 54)) ^ (j5 >>> 49);
        long j7 = (j5 << 15) ^ (((jArr[8] ^ (j5 << 5)) ^ (j5 << 7)) ^ (j5 << 10));
        for (int i4 = 16; i4 >= 10; i4--) {
            long j8 = jArr[i4];
            jArr2[i4 - 8] = (((j7 ^ (j8 >>> 59)) ^ (j8 >>> 57)) ^ (j8 >>> 54)) ^ (j8 >>> 49);
            j7 = (((jArr[i4 - 9] ^ (j8 << 5)) ^ (j8 << 7)) ^ (j8 << 10)) ^ (j8 << 15);
        }
        jArr2[1] = (((j7 ^ (j6 >>> 59)) ^ (j6 >>> 57)) ^ (j6 >>> 54)) ^ (j6 >>> 49);
        long j9 = (j6 << 15) ^ (((jArr[0] ^ (j6 << 5)) ^ (j6 << 7)) ^ (j6 << 10));
        long j10 = jArr2[8];
        long j11 = j10 >>> 59;
        jArr2[0] = (((j9 ^ j11) ^ (j11 << 2)) ^ (j11 << 5)) ^ (j11 << 10);
        jArr2[8] = 576460752303423487L & j10;
    }

    public static void q(long[] jArr, int i4) {
        int i5 = i4 + 8;
        long j4 = jArr[i5];
        long j5 = j4 >>> 59;
        jArr[i4] = ((j5 << 10) ^ (((j5 << 2) ^ j5) ^ (j5 << 5))) ^ jArr[i4];
        jArr[i5] = j4 & 576460752303423487L;
    }

    public static void r(long[] jArr, long[] jArr2) {
        long[] a4 = Y2.l.a();
        long[] a5 = Y2.l.a();
        int i4 = 0;
        for (int i5 = 0; i5 < 4; i5++) {
            int i6 = i4 + 1;
            long e4 = Y2.a.e(jArr[i4]);
            i4 += 2;
            long e5 = Y2.a.e(jArr[i6]);
            a4[i5] = (4294967295L & e4) | (e5 << 32);
            a5[i5] = (e4 >>> 32) | ((-4294967296L) & e5);
        }
        long e6 = Y2.a.e(jArr[i4]);
        a4[4] = 4294967295L & e6;
        a5[4] = e6 >>> 32;
        l(a5, f9513a, jArr2);
        b(jArr2, a4, jArr2);
    }

    public static void s(long[] jArr, long[] jArr2) {
        long[] b4 = Y2.l.b();
        j(jArr, b4);
        p(b4, jArr2);
    }

    public static void t(long[] jArr, long[] jArr2) {
        long[] b4 = Y2.l.b();
        j(jArr, b4);
        e(jArr2, b4, jArr2);
    }

    public static void u(long[] jArr, int i4, long[] jArr2) {
        long[] b4 = Y2.l.b();
        j(jArr, b4);
        p(b4, jArr2);
        while (true) {
            i4--;
            if (i4 <= 0) {
                return;
            }
            j(jArr2, b4);
            p(b4, jArr2);
        }
    }
}
