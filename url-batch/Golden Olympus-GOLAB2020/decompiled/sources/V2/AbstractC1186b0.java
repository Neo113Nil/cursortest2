package V2;

import java.math.BigInteger;

/* renamed from: V2.b0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1186b0 {

    /* renamed from: a, reason: collision with root package name */
    private static final long[] f9530a = {2791191049453778211L, 2791191049453778402L, 6};

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
        jArr3[4] = jArr2[4] ^ jArr[4];
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
        jArr[0] = j4 ^ (j5 << 44);
        jArr[1] = (j5 >>> 20) ^ (j6 << 24);
        jArr[2] = ((j6 >>> 40) ^ (j7 << 4)) ^ (j8 << 48);
        jArr[3] = ((j7 >>> 60) ^ (j9 << 28)) ^ (j8 >>> 16);
        jArr[4] = j9 >>> 36;
        jArr[5] = 0;
    }

    protected static void f(long[] jArr, long[] jArr2, long[] jArr3) {
        long j4 = jArr[0];
        long j5 = jArr[1];
        long j6 = ((jArr[2] << 40) ^ (j5 >>> 24)) & 17592186044415L;
        long j7 = ((j5 << 20) ^ (j4 >>> 44)) & 17592186044415L;
        long j8 = j4 & 17592186044415L;
        long j9 = jArr2[0];
        long j10 = jArr2[1];
        long j11 = ((j10 >>> 24) ^ (jArr2[2] << 40)) & 17592186044415L;
        long j12 = ((j9 >>> 44) ^ (j10 << 20)) & 17592186044415L;
        long j13 = j9 & 17592186044415L;
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
        long j31 = (((j26 ^ j23) ^ (j30 << 4)) ^ (j30 << 1)) ^ (j29 >>> 44);
        long j32 = (j27 ^ j21) ^ (j31 >>> 44);
        long j33 = ((j29 & 17592186044415L) >>> 1) ^ ((j31 & 1) << 43);
        long j34 = j33 ^ (j33 << 1);
        long j35 = j34 ^ (j34 << 2);
        long j36 = j35 ^ (j35 << 4);
        long j37 = j36 ^ (j36 << 8);
        long j38 = j37 ^ (j37 << 16);
        long j39 = (j38 ^ (j38 << 32)) & 17592186044415L;
        long j40 = (((j31 & 17592186044415L) >>> 1) ^ ((j32 & 1) << 43)) ^ (j39 >>> 43);
        long j41 = j40 ^ (j40 << 1);
        long j42 = j41 ^ (j41 << 2);
        long j43 = j42 ^ (j42 << 4);
        long j44 = j43 ^ (j43 << 8);
        long j45 = j44 ^ (j44 << 16);
        long j46 = (j45 ^ (j45 << 32)) & 17592186044415L;
        long j47 = (j46 >>> 43) ^ (j32 >>> 1);
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
        int i5 = (int) j4;
        long j10 = (jArr2[(i5 >>> 6) & 7] << 6) ^ (jArr2[i5 & 7] ^ (jArr2[(i5 >>> 3) & 7] << 3));
        long j11 = 0;
        int i6 = 33;
        do {
            int i7 = (int) (j4 >>> i6);
            long j12 = ((jArr2[i7 & 7] ^ (jArr2[(i7 >>> 3) & 7] << 3)) ^ (jArr2[(i7 >>> 6) & 7] << 6)) ^ (jArr2[(i7 >>> 9) & 7] << 9);
            j10 ^= j12 << i6;
            j11 ^= j12 >>> (-i6);
            i6 -= 12;
        } while (i6 > 0);
        jArr[i4] = 17592186044415L & j10;
        jArr[i4 + 1] = (j10 >>> 44) ^ (j11 << 20);
    }

    protected static void h(long[] jArr, long[] jArr2) {
        Y2.a.c(jArr[0], jArr2, 0);
        Y2.a.c(jArr[1], jArr2, 2);
        jArr2[4] = Y2.a.d((int) jArr[2]) & 4294967295L;
    }

    public static void i(long[] jArr, long[] jArr2) {
        if (Y2.e.t(jArr)) {
            throw new IllegalStateException();
        }
        long[] f4 = Y2.e.f();
        long[] f5 = Y2.e.f();
        o(jArr, f4);
        j(f4, jArr, f4);
        q(f4, 2, f5);
        j(f5, f4, f5);
        q(f5, 4, f4);
        j(f4, f5, f4);
        q(f4, 8, f5);
        j(f5, f4, f5);
        q(f5, 16, f4);
        j(f4, f5, f4);
        q(f4, 32, f5);
        j(f5, f4, f5);
        o(f5, f5);
        j(f5, jArr, f5);
        q(f5, 65, f4);
        j(f4, f5, f4);
        o(f4, jArr2);
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
        long j9 = j7 ^ (j8 >>> 59);
        long j10 = j4 ^ ((j9 << 61) ^ (j9 << 63));
        long j11 = (j5 ^ ((j8 << 61) ^ (j8 << 63))) ^ ((((j9 >>> 3) ^ (j9 >>> 1)) ^ j9) ^ (j9 << 5));
        long j12 = (j6 ^ ((((j8 >>> 3) ^ (j8 >>> 1)) ^ j8) ^ (j8 << 5))) ^ (j9 >>> 59);
        long j13 = j12 >>> 3;
        jArr2[0] = (((j10 ^ j13) ^ (j13 << 2)) ^ (j13 << 3)) ^ (j13 << 8);
        jArr2[1] = (j12 >>> 59) ^ j11;
        jArr2[2] = 7 & j12;
    }

    public static void m(long[] jArr, int i4) {
        int i5 = i4 + 2;
        long j4 = jArr[i5];
        long j5 = j4 >>> 3;
        jArr[i4] = ((j5 << 8) ^ (((j5 << 2) ^ j5) ^ (j5 << 3))) ^ jArr[i4];
        int i6 = i4 + 1;
        jArr[i6] = jArr[i6] ^ (j4 >>> 59);
        jArr[i5] = j4 & 7;
    }

    public static void n(long[] jArr, long[] jArr2) {
        long[] f4 = Y2.e.f();
        long e4 = Y2.a.e(jArr[0]);
        long e5 = Y2.a.e(jArr[1]);
        long j4 = (e4 & 4294967295L) | (e5 << 32);
        f4[0] = (e4 >>> 32) | (e5 & (-4294967296L));
        long e6 = Y2.a.e(jArr[2]);
        f4[1] = e6 >>> 32;
        j(f4, f9530a, jArr2);
        jArr2[0] = jArr2[0] ^ j4;
        jArr2[1] = jArr2[1] ^ (e6 & 4294967295L);
    }

    public static void o(long[] jArr, long[] jArr2) {
        long[] j4 = Y2.m.j(5);
        h(jArr, j4);
        l(j4, jArr2);
    }

    public static void p(long[] jArr, long[] jArr2) {
        long[] j4 = Y2.m.j(5);
        h(jArr, j4);
        b(jArr2, j4, jArr2);
    }

    public static void q(long[] jArr, int i4, long[] jArr2) {
        long[] j4 = Y2.m.j(5);
        h(jArr, j4);
        l(j4, jArr2);
        while (true) {
            i4--;
            if (i4 <= 0) {
                return;
            }
            h(jArr2, j4);
            l(j4, jArr2);
        }
    }
}
