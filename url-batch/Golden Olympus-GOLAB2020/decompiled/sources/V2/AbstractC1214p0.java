package V2;

import java.math.BigInteger;

/* renamed from: V2.p0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1214p0 {
    public static void a(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr2[3] ^ jArr[3];
    }

    public static void b(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr2[6] ^ jArr[6];
    }

    public static void c(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
    }

    public static long[] d(BigInteger bigInteger) {
        long[] n4 = Y2.g.n(bigInteger);
        n(n4, 0);
        return n4;
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
        jArr[0] = j4 ^ (j5 << 49);
        jArr[1] = (j5 >>> 15) ^ (j6 << 34);
        jArr[2] = (j6 >>> 30) ^ (j7 << 19);
        jArr[3] = ((j7 >>> 45) ^ (j8 << 4)) ^ (j9 << 53);
        jArr[4] = ((j8 >>> 60) ^ (j10 << 38)) ^ (j9 >>> 11);
        jArr[5] = (j10 >>> 26) ^ (j11 << 23);
        jArr[6] = j11 >>> 41;
        jArr[7] = 0;
    }

    protected static void f(long[] jArr, long[] jArr2) {
        long j4 = jArr[0];
        long j5 = jArr[1];
        long j6 = jArr[2];
        long j7 = jArr[3];
        jArr2[0] = j4 & 562949953421311L;
        jArr2[1] = ((j4 >>> 49) ^ (j5 << 15)) & 562949953421311L;
        jArr2[2] = ((j5 >>> 34) ^ (j6 << 30)) & 562949953421311L;
        jArr2[3] = (j6 >>> 19) ^ (j7 << 45);
    }

    protected static void g(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[4];
        long[] jArr5 = new long[4];
        f(jArr, jArr4);
        f(jArr2, jArr5);
        h(jArr4[0], jArr5[0], jArr3, 0);
        h(jArr4[1], jArr5[1], jArr3, 1);
        h(jArr4[2], jArr5[2], jArr3, 2);
        h(jArr4[3], jArr5[3], jArr3, 3);
        for (int i4 = 5; i4 > 0; i4--) {
            jArr3[i4] = jArr3[i4] ^ jArr3[i4 - 1];
        }
        h(jArr4[1] ^ jArr4[0], jArr5[1] ^ jArr5[0], jArr3, 1);
        h(jArr4[3] ^ jArr4[2], jArr5[3] ^ jArr5[2], jArr3, 3);
        for (int i5 = 7; i5 > 1; i5--) {
            jArr3[i5] = jArr3[i5] ^ jArr3[i5 - 2];
        }
        long j4 = jArr4[0] ^ jArr4[2];
        long j5 = jArr4[1] ^ jArr4[3];
        long j6 = jArr5[0] ^ jArr5[2];
        long j7 = jArr5[3] ^ jArr5[1];
        h(j4 ^ j5, j6 ^ j7, jArr3, 3);
        long[] jArr6 = new long[3];
        h(j4, j6, jArr6, 0);
        h(j5, j7, jArr6, 1);
        long j8 = jArr6[0];
        long j9 = jArr6[1];
        long j10 = jArr6[2];
        jArr3[2] = jArr3[2] ^ j8;
        jArr3[3] = (j8 ^ j9) ^ jArr3[3];
        jArr3[4] = jArr3[4] ^ (j9 ^ j10);
        jArr3[5] = jArr3[5] ^ j10;
        e(jArr3);
    }

    protected static void h(long j4, long j5, long[] jArr, int i4) {
        long j6 = j5 << 1;
        long j7 = j6 ^ j5;
        long j8 = j5 << 2;
        long j9 = j7 << 1;
        long[] jArr2 = {0, j5, j6, j7, j8, j8 ^ j5, j9, j9 ^ j5};
        int i5 = (int) j4;
        long j10 = (jArr2[(i5 >>> 3) & 7] << 3) ^ jArr2[i5 & 7];
        long j11 = 0;
        int i6 = 36;
        do {
            int i7 = (int) (j4 >>> i6);
            long j12 = (((jArr2[i7 & 7] ^ (jArr2[(i7 >>> 3) & 7] << 3)) ^ (jArr2[(i7 >>> 6) & 7] << 6)) ^ (jArr2[(i7 >>> 9) & 7] << 9)) ^ (jArr2[(i7 >>> 12) & 7] << 12);
            j10 ^= j12 << i6;
            j11 ^= j12 >>> (-i6);
            i6 -= 15;
        } while (i6 > 0);
        jArr[i4] = jArr[i4] ^ (562949953421311L & j10);
        int i8 = i4 + 1;
        jArr[i8] = jArr[i8] ^ ((j10 >>> 49) ^ (j11 << 15));
    }

    protected static void i(long[] jArr, long[] jArr2) {
        Y2.a.c(jArr[0], jArr2, 0);
        Y2.a.c(jArr[1], jArr2, 2);
        Y2.a.c(jArr[2], jArr2, 4);
        jArr2[6] = jArr[3] & 1;
    }

    public static void j(long[] jArr, long[] jArr2) {
        if (Y2.g.u(jArr)) {
            throw new IllegalStateException();
        }
        long[] g4 = Y2.g.g();
        long[] g5 = Y2.g.g();
        p(jArr, g4);
        r(g4, 1, g5);
        k(g4, g5, g4);
        r(g5, 1, g5);
        k(g4, g5, g4);
        r(g4, 3, g5);
        k(g4, g5, g4);
        r(g4, 6, g5);
        k(g4, g5, g4);
        r(g4, 12, g5);
        k(g4, g5, g4);
        r(g4, 24, g5);
        k(g4, g5, g4);
        r(g4, 48, g5);
        k(g4, g5, g4);
        r(g4, 96, g5);
        k(g4, g5, jArr2);
    }

    public static void k(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] i4 = Y2.g.i();
        g(jArr, jArr2, i4);
        m(i4, jArr3);
    }

    public static void l(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] i4 = Y2.g.i();
        g(jArr, jArr2, i4);
        b(jArr3, i4, jArr3);
    }

    public static void m(long[] jArr, long[] jArr2) {
        long j4 = jArr[0];
        long j5 = jArr[1];
        long j6 = jArr[2];
        long j7 = jArr[3];
        long j8 = jArr[4];
        long j9 = jArr[5];
        long j10 = jArr[6];
        long j11 = j8 ^ (j10 >>> 50);
        long j12 = (j7 ^ ((j10 >>> 1) ^ (j10 << 14))) ^ (j9 >>> 50);
        long j13 = j4 ^ (j11 << 63);
        long j14 = (j5 ^ (j9 << 63)) ^ ((j11 >>> 1) ^ (j11 << 14));
        long j15 = ((j6 ^ (j10 << 63)) ^ ((j9 >>> 1) ^ (j9 << 14))) ^ (j11 >>> 50);
        long j16 = j12 >>> 1;
        jArr2[0] = (j13 ^ j16) ^ (j16 << 15);
        jArr2[1] = (j12 >>> 50) ^ j14;
        jArr2[2] = j15;
        jArr2[3] = 1 & j12;
    }

    public static void n(long[] jArr, int i4) {
        int i5 = i4 + 3;
        long j4 = jArr[i5];
        long j5 = j4 >>> 1;
        jArr[i4] = (j5 ^ (j5 << 15)) ^ jArr[i4];
        int i6 = i4 + 1;
        jArr[i6] = jArr[i6] ^ (j4 >>> 50);
        jArr[i5] = j4 & 1;
    }

    public static void o(long[] jArr, long[] jArr2) {
        long e4 = Y2.a.e(jArr[0]);
        long e5 = Y2.a.e(jArr[1]);
        long j4 = (e4 & 4294967295L) | (e5 << 32);
        long j5 = (e4 >>> 32) | (e5 & (-4294967296L));
        long e6 = Y2.a.e(jArr[2]);
        long j6 = (e6 & 4294967295L) ^ (jArr[3] << 32);
        long j7 = e6 >>> 32;
        jArr2[0] = j4 ^ (j5 << 8);
        jArr2[1] = ((j6 ^ (j7 << 8)) ^ (j5 >>> 56)) ^ (j5 << 33);
        jArr2[2] = (j5 >>> 31) ^ (j7 << 33);
        jArr2[3] = e6 >>> 63;
    }

    public static void p(long[] jArr, long[] jArr2) {
        long[] i4 = Y2.g.i();
        i(jArr, i4);
        m(i4, jArr2);
    }

    public static void q(long[] jArr, long[] jArr2) {
        long[] i4 = Y2.g.i();
        i(jArr, i4);
        b(jArr2, i4, jArr2);
    }

    public static void r(long[] jArr, int i4, long[] jArr2) {
        long[] i5 = Y2.g.i();
        i(jArr, i5);
        m(i5, jArr2);
        while (true) {
            i4--;
            if (i4 <= 0) {
                return;
            }
            i(jArr2, i5);
            m(i5, jArr2);
        }
    }
}
