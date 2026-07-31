package V2;

import java.math.BigInteger;

/* renamed from: V2.h0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1198h0 {

    /* renamed from: a, reason: collision with root package name */
    private static final long[] f9543a = {-5270498306774157648L, 5270498306774195053L, 19634136210L};

    public static void a(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr2[2] ^ jArr[2];
    }

    public static void b(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr2[5] ^ jArr[5];
    }

    public static void c(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
    }

    public static long[] d(BigInteger bigInteger) {
        long[] m4 = Y2.e.m(bigInteger);
        m(m4, 0);
        return m4;
    }

    protected static void e(long[] jArr) {
        long j4 = jArr[0];
        long j5 = jArr[1];
        long j6 = jArr[2];
        long j7 = jArr[3];
        long j8 = jArr[4];
        long j9 = jArr[5];
        jArr[0] = j4 ^ (j5 << 55);
        jArr[1] = (j5 >>> 9) ^ (j6 << 46);
        jArr[2] = (j6 >>> 18) ^ (j7 << 37);
        jArr[3] = (j7 >>> 27) ^ (j8 << 28);
        jArr[4] = (j8 >>> 36) ^ (j9 << 19);
        jArr[5] = j9 >>> 45;
    }

    protected static void f(long[] jArr, long[] jArr2, long[] jArr3) {
        long j4 = jArr[0];
        long j5 = jArr[1];
        long j6 = (j5 >>> 46) ^ (jArr[2] << 18);
        long j7 = ((j5 << 9) ^ (j4 >>> 55)) & 36028797018963967L;
        long j8 = j4 & 36028797018963967L;
        long j9 = jArr2[0];
        long j10 = jArr2[1];
        long j11 = (j10 >>> 46) ^ (jArr2[2] << 18);
        long j12 = ((j9 >>> 55) ^ (j10 << 9)) & 36028797018963967L;
        long j13 = j9 & 36028797018963967L;
        long[] jArr4 = new long[10];
        g(j8, j13, jArr4, 0);
        g(j6, j11, jArr4, 2);
        long j14 = (j8 ^ j7) ^ j6;
        long j15 = (j13 ^ j12) ^ j11;
        g(j14, j15, jArr4, 4);
        long j16 = (j7 << 1) ^ (j6 << 2);
        long j17 = (j12 << 1) ^ (j11 << 2);
        g(j8 ^ j16, j13 ^ j17, jArr4, 6);
        g(j14 ^ j16, j15 ^ j17, jArr4, 8);
        long j18 = jArr4[6];
        long j19 = jArr4[8] ^ j18;
        long j20 = jArr4[7];
        long j21 = jArr4[9] ^ j20;
        long j22 = (j19 << 1) ^ j18;
        long j23 = (j19 ^ (j21 << 1)) ^ j20;
        long j24 = jArr4[0];
        long j25 = jArr4[1];
        long j26 = (j25 ^ j24) ^ jArr4[4];
        long j27 = j25 ^ jArr4[5];
        long j28 = jArr4[2];
        long j29 = ((j22 ^ j24) ^ (j28 << 4)) ^ (j28 << 1);
        long j30 = jArr4[3];
        long j31 = (((j26 ^ j23) ^ (j30 << 4)) ^ (j30 << 1)) ^ (j29 >>> 55);
        long j32 = (j27 ^ j21) ^ (j31 >>> 55);
        long j33 = ((j29 & 36028797018963967L) >>> 1) ^ ((j31 & 1) << 54);
        long j34 = j33 ^ (j33 << 1);
        long j35 = j34 ^ (j34 << 2);
        long j36 = j35 ^ (j35 << 4);
        long j37 = j36 ^ (j36 << 8);
        long j38 = j37 ^ (j37 << 16);
        long j39 = (j38 ^ (j38 << 32)) & 36028797018963967L;
        long j40 = (((j31 & 36028797018963967L) >>> 1) ^ ((j32 & 1) << 54)) ^ (j39 >>> 54);
        long j41 = j40 ^ (j40 << 1);
        long j42 = j41 ^ (j41 << 2);
        long j43 = j42 ^ (j42 << 4);
        long j44 = j43 ^ (j43 << 8);
        long j45 = j44 ^ (j44 << 16);
        long j46 = 36028797018963967L & (j45 ^ (j45 << 32));
        long j47 = (j32 >>> 1) ^ (j46 >>> 54);
        long j48 = j47 ^ (j47 << 1);
        long j49 = j48 ^ (j48 << 2);
        long j50 = j49 ^ (j49 << 4);
        long j51 = j50 ^ (j50 << 8);
        long j52 = j51 ^ (j51 << 16);
        long j53 = j52 ^ (j52 << 32);
        jArr3[0] = j24;
        jArr3[1] = (j26 ^ j39) ^ j28;
        jArr3[2] = ((j27 ^ j46) ^ j39) ^ j30;
        jArr3[3] = j53 ^ j46;
        jArr3[4] = jArr4[2] ^ j53;
        jArr3[5] = jArr4[3];
        e(jArr3);
    }

    protected static void g(long j4, long j5, long[] jArr, int i4) {
        long j6 = j5 << 1;
        long j7 = j6 ^ j5;
        long j8 = j5 << 2;
        long j9 = j7 << 1;
        long[] jArr2 = {0, j5, j6, j7, j8, j8 ^ j5, j9, j9 ^ j5};
        long j10 = jArr2[((int) j4) & 3];
        long j11 = 0;
        int i5 = 47;
        do {
            int i6 = (int) (j4 >>> i5);
            long j12 = (jArr2[i6 & 7] ^ (jArr2[(i6 >>> 3) & 7] << 3)) ^ (jArr2[(i6 >>> 6) & 7] << 6);
            j10 ^= j12 << i5;
            j11 ^= j12 >>> (-i5);
            i5 -= 9;
        } while (i5 > 0);
        jArr[i4] = 36028797018963967L & j10;
        jArr[i4 + 1] = (j10 >>> 55) ^ (j11 << 9);
    }

    protected static void h(long[] jArr, long[] jArr2) {
        Y2.a.c(jArr[0], jArr2, 0);
        Y2.a.c(jArr[1], jArr2, 2);
        jArr2[4] = Y2.a.b((int) jArr[2]);
        jArr2[5] = Y2.a.d((int) (r0 >>> 32)) & 4294967295L;
    }

    public static void i(long[] jArr, long[] jArr2) {
        if (Y2.e.t(jArr)) {
            throw new IllegalStateException();
        }
        long[] f4 = Y2.e.f();
        long[] f5 = Y2.e.f();
        o(jArr, f4);
        q(f4, 1, f5);
        j(f4, f5, f4);
        q(f5, 1, f5);
        j(f4, f5, f4);
        q(f4, 3, f5);
        j(f4, f5, f4);
        q(f5, 3, f5);
        j(f4, f5, f4);
        q(f4, 9, f5);
        j(f4, f5, f4);
        q(f5, 9, f5);
        j(f4, f5, f4);
        q(f4, 27, f5);
        j(f4, f5, f4);
        q(f5, 27, f5);
        j(f4, f5, f4);
        q(f4, 81, f5);
        j(f4, f5, jArr2);
    }

    public static void j(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] h4 = Y2.e.h();
        f(jArr, jArr2, h4);
        l(h4, jArr3);
    }

    public static void k(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] h4 = Y2.e.h();
        f(jArr, jArr2, h4);
        b(jArr3, h4, jArr3);
    }

    public static void l(long[] jArr, long[] jArr2) {
        long j4 = jArr[0];
        long j5 = jArr[1];
        long j6 = jArr[2];
        long j7 = jArr[3];
        long j8 = jArr[4];
        long j9 = jArr[5];
        long j10 = j7 ^ ((((j9 >>> 35) ^ (j9 >>> 32)) ^ (j9 >>> 29)) ^ (j9 >>> 28));
        long j11 = (j6 ^ ((((j9 << 29) ^ (j9 << 32)) ^ (j9 << 35)) ^ (j9 << 36))) ^ ((j8 >>> 28) ^ (((j8 >>> 35) ^ (j8 >>> 32)) ^ (j8 >>> 29)));
        long j12 = j4 ^ ((((j10 << 29) ^ (j10 << 32)) ^ (j10 << 35)) ^ (j10 << 36));
        long j13 = (j5 ^ ((((j8 << 29) ^ (j8 << 32)) ^ (j8 << 35)) ^ (j8 << 36))) ^ ((j10 >>> 28) ^ (((j10 >>> 35) ^ (j10 >>> 32)) ^ (j10 >>> 29)));
        long j14 = j11 >>> 35;
        jArr2[0] = (((j12 ^ j14) ^ (j14 << 3)) ^ (j14 << 6)) ^ (j14 << 7);
        jArr2[1] = j13;
        jArr2[2] = 34359738367L & j11;
    }

    public static void m(long[] jArr, int i4) {
        int i5 = i4 + 2;
        long j4 = jArr[i5];
        long j5 = j4 >>> 35;
        jArr[i4] = ((j5 << 7) ^ (((j5 << 3) ^ j5) ^ (j5 << 6))) ^ jArr[i4];
        jArr[i5] = j4 & 34359738367L;
    }

    public static void n(long[] jArr, long[] jArr2) {
        long[] f4 = Y2.e.f();
        long e4 = Y2.a.e(jArr[0]);
        long e5 = Y2.a.e(jArr[1]);
        long j4 = (e4 & 4294967295L) | (e5 << 32);
        f4[0] = (e4 >>> 32) | (e5 & (-4294967296L));
        long e6 = Y2.a.e(jArr[2]);
        f4[1] = e6 >>> 32;
        j(f4, f9543a, jArr2);
        jArr2[0] = jArr2[0] ^ j4;
        jArr2[1] = jArr2[1] ^ (e6 & 4294967295L);
    }

    public static void o(long[] jArr, long[] jArr2) {
        long[] h4 = Y2.e.h();
        h(jArr, h4);
        l(h4, jArr2);
    }

    public static void p(long[] jArr, long[] jArr2) {
        long[] h4 = Y2.e.h();
        h(jArr, h4);
        b(jArr2, h4, jArr2);
    }

    public static void q(long[] jArr, int i4, long[] jArr2) {
        long[] h4 = Y2.e.h();
        h(jArr, h4);
        l(h4, jArr2);
        while (true) {
            i4--;
            if (i4 <= 0) {
                return;
            }
            h(jArr2, h4);
            l(h4, jArr2);
        }
    }
}
