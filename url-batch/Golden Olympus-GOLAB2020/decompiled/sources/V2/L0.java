package V2;

import java.math.BigInteger;

/* loaded from: classes3.dex */
public abstract class L0 {
    public static void a(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr2[6] ^ jArr[6];
    }

    public static void b(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i4 = 0; i4 < 13; i4++) {
            jArr3[i4] = jArr[i4] ^ jArr2[i4];
        }
    }

    public static void c(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
        jArr2[4] = jArr[4];
        jArr2[5] = jArr[5];
        jArr2[6] = jArr[6];
    }

    public static long[] d(BigInteger bigInteger) {
        long[] d4 = Y2.j.d(bigInteger);
        n(d4, 0);
        return d4;
    }

    protected static void e(long[] jArr) {
        long j4 = jArr[0];
        long j5 = jArr[1];
        long j6 = jArr[2];
        long j7 = jArr[3];
        long j8 = jArr[4];
        long j9 = jArr[5];
        long j10 = jArr[6];
        long j11 = jArr[7];
        long j12 = jArr[8];
        long j13 = jArr[9];
        long j14 = jArr[10];
        long j15 = jArr[11];
        long j16 = jArr[12];
        long j17 = jArr[13];
        jArr[0] = j4 ^ (j5 << 59);
        jArr[1] = (j5 >>> 5) ^ (j6 << 54);
        jArr[2] = (j6 >>> 10) ^ (j7 << 49);
        jArr[3] = (j7 >>> 15) ^ (j8 << 44);
        jArr[4] = (j8 >>> 20) ^ (j9 << 39);
        jArr[5] = (j9 >>> 25) ^ (j10 << 34);
        jArr[6] = (j10 >>> 30) ^ (j11 << 29);
        jArr[7] = (j11 >>> 35) ^ (j12 << 24);
        jArr[8] = (j12 >>> 40) ^ (j13 << 19);
        jArr[9] = (j13 >>> 45) ^ (j14 << 14);
        jArr[10] = (j14 >>> 50) ^ (j15 << 9);
        jArr[11] = ((j15 >>> 55) ^ (j16 << 4)) ^ (j17 << 63);
        jArr[12] = (j16 >>> 60) ^ (j17 >>> 1);
        jArr[13] = 0;
    }

    protected static void f(long[] jArr, long[] jArr2) {
        long j4 = jArr[0];
        long j5 = jArr[1];
        long j6 = jArr[2];
        long j7 = jArr[3];
        long j8 = jArr[4];
        long j9 = jArr[5];
        long j10 = jArr[6];
        jArr2[0] = j4 & 576460752303423487L;
        jArr2[1] = ((j4 >>> 59) ^ (j5 << 5)) & 576460752303423487L;
        jArr2[2] = ((j5 >>> 54) ^ (j6 << 10)) & 576460752303423487L;
        jArr2[3] = ((j6 >>> 49) ^ (j7 << 15)) & 576460752303423487L;
        jArr2[4] = ((j7 >>> 44) ^ (j8 << 20)) & 576460752303423487L;
        jArr2[5] = ((j8 >>> 39) ^ (j9 << 25)) & 576460752303423487L;
        jArr2[6] = (j9 >>> 34) ^ (j10 << 30);
    }

    protected static void g(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[7];
        long[] jArr5 = new long[7];
        f(jArr, jArr4);
        f(jArr2, jArr5);
        for (int i4 = 0; i4 < 7; i4++) {
            h(jArr4, jArr5[i4], jArr3, i4);
        }
        e(jArr3);
    }

    protected static void h(long[] jArr, long j4, long[] jArr2, int i4) {
        long j5 = j4 << 1;
        long j6 = j5 ^ j4;
        long j7 = j4 << 2;
        long j8 = j6 << 1;
        long[] jArr3 = {0, j4, j5, j6, j7, j7 ^ j4, j8, j8 ^ j4};
        for (int i5 = 0; i5 < 7; i5++) {
            long j9 = jArr[i5];
            int i6 = (int) j9;
            long j10 = jArr3[i6 & 7] ^ (jArr3[(i6 >>> 3) & 7] << 3);
            long j11 = 0;
            int i7 = 54;
            do {
                int i8 = (int) (j9 >>> i7);
                long j12 = jArr3[i8 & 7] ^ (jArr3[(i8 >>> 3) & 7] << 3);
                j10 ^= j12 << i7;
                j11 ^= j12 >>> (-i7);
                i7 -= 6;
            } while (i7 > 0);
            int i9 = i4 + i5;
            jArr2[i9] = jArr2[i9] ^ (576460752303423487L & j10);
            int i10 = i9 + 1;
            jArr2[i10] = jArr2[i10] ^ ((j10 >>> 59) ^ (j11 << 5));
        }
    }

    protected static void i(long[] jArr, long[] jArr2) {
        for (int i4 = 0; i4 < 6; i4++) {
            Y2.a.c(jArr[i4], jArr2, i4 << 1);
        }
        jArr2[12] = Y2.a.b((int) jArr[6]);
    }

    public static void j(long[] jArr, long[] jArr2) {
        if (Y2.j.f(jArr)) {
            throw new IllegalStateException();
        }
        long[] a4 = Y2.j.a();
        long[] a5 = Y2.j.a();
        long[] a6 = Y2.j.a();
        p(jArr, a4);
        r(a4, 1, a5);
        k(a4, a5, a4);
        r(a5, 1, a5);
        k(a4, a5, a4);
        r(a4, 3, a5);
        k(a4, a5, a4);
        r(a4, 6, a5);
        k(a4, a5, a4);
        r(a4, 12, a5);
        k(a4, a5, a6);
        r(a6, 24, a4);
        r(a4, 24, a5);
        k(a4, a5, a4);
        r(a4, 48, a5);
        k(a4, a5, a4);
        r(a4, 96, a5);
        k(a4, a5, a4);
        r(a4, 192, a5);
        k(a4, a5, a4);
        k(a4, a6, jArr2);
    }

    public static void k(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] b4 = Y2.j.b();
        g(jArr, jArr2, b4);
        m(b4, jArr3);
    }

    public static void l(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] b4 = Y2.j.b();
        g(jArr, jArr2, b4);
        b(jArr3, b4, jArr3);
    }

    public static void m(long[] jArr, long[] jArr2) {
        long j4 = jArr[0];
        long j5 = jArr[1];
        long j6 = jArr[2];
        long j7 = jArr[3];
        long j8 = jArr[4];
        long j9 = jArr[5];
        long j10 = jArr[6];
        long j11 = jArr[7];
        long j12 = jArr[12];
        long j13 = j9 ^ (j12 << 39);
        long j14 = j10 ^ ((j12 >>> 25) ^ (j12 << 62));
        long j15 = j11 ^ (j12 >>> 2);
        long j16 = jArr[11];
        long j17 = j8 ^ (j16 << 39);
        long j18 = j13 ^ ((j16 >>> 25) ^ (j16 << 62));
        long j19 = j14 ^ (j16 >>> 2);
        long j20 = jArr[10];
        long j21 = j7 ^ (j20 << 39);
        long j22 = j17 ^ ((j20 >>> 25) ^ (j20 << 62));
        long j23 = j18 ^ (j20 >>> 2);
        long j24 = jArr[9];
        long j25 = j6 ^ (j24 << 39);
        long j26 = j21 ^ ((j24 >>> 25) ^ (j24 << 62));
        long j27 = j22 ^ (j24 >>> 2);
        long j28 = jArr[8];
        long j29 = j4 ^ (j15 << 39);
        long j30 = (j5 ^ (j28 << 39)) ^ ((j15 >>> 25) ^ (j15 << 62));
        long j31 = (j25 ^ ((j28 >>> 25) ^ (j28 << 62))) ^ (j15 >>> 2);
        long j32 = j19 >>> 25;
        jArr2[0] = j29 ^ j32;
        jArr2[1] = (j32 << 23) ^ j30;
        jArr2[2] = j31;
        jArr2[3] = j26 ^ (j28 >>> 2);
        jArr2[4] = j27;
        jArr2[5] = j23;
        jArr2[6] = j19 & 33554431;
    }

    public static void n(long[] jArr, int i4) {
        int i5 = i4 + 6;
        long j4 = jArr[i5];
        long j5 = j4 >>> 25;
        jArr[i4] = jArr[i4] ^ j5;
        int i6 = i4 + 1;
        jArr[i6] = (j5 << 23) ^ jArr[i6];
        jArr[i5] = j4 & 33554431;
    }

    public static void o(long[] jArr, long[] jArr2) {
        long e4 = Y2.a.e(jArr[0]);
        long e5 = Y2.a.e(jArr[1]);
        long j4 = (e4 & 4294967295L) | (e5 << 32);
        long j5 = (e4 >>> 32) | (e5 & (-4294967296L));
        long e6 = Y2.a.e(jArr[2]);
        long e7 = Y2.a.e(jArr[3]);
        long j6 = (e6 & 4294967295L) | (e7 << 32);
        long j7 = (e6 >>> 32) | (e7 & (-4294967296L));
        long e8 = Y2.a.e(jArr[4]);
        long e9 = Y2.a.e(jArr[5]);
        long j8 = (e8 >>> 32) | (e9 & (-4294967296L));
        long e10 = Y2.a.e(jArr[6]);
        long j9 = e10 >>> 32;
        jArr2[0] = j4 ^ (j5 << 44);
        jArr2[1] = (j6 ^ (j7 << 44)) ^ (j5 >>> 20);
        jArr2[2] = (((e8 & 4294967295L) | (e9 << 32)) ^ (j8 << 44)) ^ (j7 >>> 20);
        jArr2[3] = (((j9 << 44) ^ (e10 & 4294967295L)) ^ (j8 >>> 20)) ^ (j5 << 13);
        jArr2[4] = (j5 >>> 51) ^ ((e10 >>> 52) ^ (j7 << 13));
        jArr2[5] = (j8 << 13) ^ (j7 >>> 51);
        jArr2[6] = (j9 << 13) ^ (j8 >>> 51);
    }

    public static void p(long[] jArr, long[] jArr2) {
        long[] j4 = Y2.m.j(13);
        i(jArr, j4);
        m(j4, jArr2);
    }

    public static void q(long[] jArr, long[] jArr2) {
        long[] j4 = Y2.m.j(13);
        i(jArr, j4);
        b(jArr2, j4, jArr2);
    }

    public static void r(long[] jArr, int i4, long[] jArr2) {
        long[] j4 = Y2.m.j(13);
        i(jArr, j4);
        m(j4, jArr2);
        while (true) {
            i4--;
            if (i4 <= 0) {
                return;
            }
            i(jArr2, j4);
            m(j4, jArr2);
        }
    }
}
