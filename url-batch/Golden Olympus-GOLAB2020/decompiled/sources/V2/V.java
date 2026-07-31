package V2;

import java.math.BigInteger;

/* loaded from: classes3.dex */
public abstract class V {
    public static void a(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr2[1] ^ jArr[1];
    }

    public static void b(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr2[3] ^ jArr[3];
    }

    public static void c(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
    }

    public static long[] d(BigInteger bigInteger) {
        long[] j4 = Y2.c.j(bigInteger);
        l(j4, 0);
        return j4;
    }

    protected static void e(long[] jArr, long[] jArr2, long[] jArr3) {
        long j4 = jArr[0];
        long j5 = ((jArr[1] << 7) ^ (j4 >>> 57)) & 144115188075855871L;
        long j6 = j4 & 144115188075855871L;
        long j7 = jArr2[0];
        long j8 = ((jArr2[1] << 7) ^ (j7 >>> 57)) & 144115188075855871L;
        long j9 = j7 & 144115188075855871L;
        long[] jArr4 = new long[6];
        f(j6, j9, jArr4, 0);
        f(j5, j8, jArr4, 2);
        f(j6 ^ j5, j9 ^ j8, jArr4, 4);
        long j10 = jArr4[1] ^ jArr4[2];
        long j11 = jArr4[0];
        long j12 = jArr4[3];
        long j13 = (jArr4[4] ^ j11) ^ j10;
        long j14 = j10 ^ (jArr4[5] ^ j12);
        jArr3[0] = j11 ^ (j13 << 57);
        jArr3[1] = (j13 >>> 7) ^ (j14 << 50);
        jArr3[2] = (j14 >>> 14) ^ (j12 << 43);
        jArr3[3] = j12 >>> 21;
    }

    protected static void f(long j4, long j5, long[] jArr, int i4) {
        long j6 = j5 << 1;
        long j7 = j6 ^ j5;
        long j8 = j5 << 2;
        long j9 = j7 << 1;
        long[] jArr2 = {0, j5, j6, j7, j8, j8 ^ j5, j9, j9 ^ j5};
        long j10 = jArr2[((int) j4) & 7];
        long j11 = 0;
        int i5 = 48;
        do {
            int i6 = (int) (j4 >>> i5);
            long j12 = (jArr2[i6 & 7] ^ (jArr2[(i6 >>> 3) & 7] << 3)) ^ (jArr2[(i6 >>> 6) & 7] << 6);
            j10 ^= j12 << i5;
            j11 ^= j12 >>> (-i5);
            i5 -= 9;
        } while (i5 > 0);
        jArr[i4] = 144115188075855871L & j10;
        jArr[i4 + 1] = (((((j4 & 72198606942111744L) & ((j5 << 7) >> 63)) >>> 8) ^ j11) << 7) ^ (j10 >>> 57);
    }

    protected static void g(long[] jArr, long[] jArr2) {
        Y2.a.c(jArr[0], jArr2, 0);
        Y2.a.c(jArr[1], jArr2, 2);
    }

    public static void h(long[] jArr, long[] jArr2) {
        if (Y2.c.p(jArr)) {
            throw new IllegalStateException();
        }
        long[] d4 = Y2.c.d();
        long[] d5 = Y2.c.d();
        n(jArr, d4);
        i(d4, jArr, d4);
        n(d4, d4);
        i(d4, jArr, d4);
        p(d4, 3, d5);
        i(d5, d4, d5);
        n(d5, d5);
        i(d5, jArr, d5);
        p(d5, 7, d4);
        i(d4, d5, d4);
        p(d4, 14, d5);
        i(d5, d4, d5);
        p(d5, 28, d4);
        i(d4, d5, d4);
        p(d4, 56, d5);
        i(d5, d4, d5);
        n(d5, jArr2);
    }

    public static void i(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] f4 = Y2.c.f();
        e(jArr, jArr2, f4);
        k(f4, jArr3);
    }

    public static void j(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] f4 = Y2.c.f();
        e(jArr, jArr2, f4);
        b(jArr3, f4, jArr3);
    }

    public static void k(long[] jArr, long[] jArr2) {
        long j4 = jArr[0];
        long j5 = jArr[1];
        long j6 = jArr[2];
        long j7 = jArr[3];
        long j8 = j6 ^ ((j7 >>> 40) ^ (j7 >>> 49));
        long j9 = j4 ^ ((j8 << 15) ^ (j8 << 24));
        long j10 = (j5 ^ ((j7 << 15) ^ (j7 << 24))) ^ ((j8 >>> 40) ^ (j8 >>> 49));
        long j11 = j10 >>> 49;
        jArr2[0] = (j9 ^ j11) ^ (j11 << 9);
        jArr2[1] = 562949953421311L & j10;
    }

    public static void l(long[] jArr, int i4) {
        int i5 = i4 + 1;
        long j4 = jArr[i5];
        long j5 = j4 >>> 49;
        jArr[i4] = (j5 ^ (j5 << 9)) ^ jArr[i4];
        jArr[i5] = j4 & 562949953421311L;
    }

    public static void m(long[] jArr, long[] jArr2) {
        long e4 = Y2.a.e(jArr[0]);
        long e5 = Y2.a.e(jArr[1]);
        long j4 = (4294967295L & e4) | (e5 << 32);
        long j5 = (e4 >>> 32) | (e5 & (-4294967296L));
        jArr2[0] = ((j5 << 57) ^ j4) ^ (j5 << 5);
        jArr2[1] = (j5 >>> 59) ^ (j5 >>> 7);
    }

    public static void n(long[] jArr, long[] jArr2) {
        long[] f4 = Y2.c.f();
        g(jArr, f4);
        k(f4, jArr2);
    }

    public static void o(long[] jArr, long[] jArr2) {
        long[] f4 = Y2.c.f();
        g(jArr, f4);
        b(jArr2, f4, jArr2);
    }

    public static void p(long[] jArr, int i4, long[] jArr2) {
        long[] f4 = Y2.c.f();
        g(jArr, f4);
        k(f4, jArr2);
        while (true) {
            i4--;
            if (i4 <= 0) {
                return;
            }
            g(jArr2, f4);
            k(f4, jArr2);
        }
    }
}
