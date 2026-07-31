package V2;

import java.math.BigInteger;

/* loaded from: classes3.dex */
public abstract class B0 {
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
        jArr3[6] = jArr[6] ^ jArr2[6];
        jArr3[7] = jArr2[7] ^ jArr[7];
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
        jArr[0] = j4 ^ (j5 << 60);
        jArr[1] = (j5 >>> 4) ^ (j6 << 56);
        jArr[2] = (j6 >>> 8) ^ (j7 << 52);
        jArr[3] = (j7 >>> 12) ^ (j8 << 48);
        jArr[4] = (j8 >>> 16) ^ (j9 << 44);
        jArr[5] = (j9 >>> 20) ^ (j10 << 40);
        jArr[6] = (j10 >>> 24) ^ (j11 << 36);
        jArr[7] = j11 >>> 28;
    }

    protected static void f(long[] jArr, long[] jArr2) {
        long j4 = jArr[0];
        long j5 = jArr[1];
        long j6 = jArr[2];
        long j7 = jArr[3];
        jArr2[0] = j4 & 1152921504606846975L;
        jArr2[1] = ((j4 >>> 60) ^ (j5 << 4)) & 1152921504606846975L;
        jArr2[2] = ((j5 >>> 56) ^ (j6 << 8)) & 1152921504606846975L;
        jArr2[3] = (j6 >>> 52) ^ (j7 << 12);
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
        int i6 = 54;
        do {
            int i7 = (int) (j4 >>> i6);
            long j12 = jArr2[i7 & 7] ^ (jArr2[(i7 >>> 3) & 7] << 3);
            j10 ^= j12 << i6;
            j11 ^= j12 >>> (-i6);
            i6 -= 6;
        } while (i6 > 0);
        jArr[i4] = jArr[i4] ^ (1152921504606846975L & j10);
        int i8 = i4 + 1;
        jArr[i8] = ((((((j4 & 585610922974906400L) & ((j5 << 4) >> 63)) >>> 5) ^ j11) << 4) ^ (j10 >>> 60)) ^ jArr[i8];
    }

    protected static void i(long[] jArr, long[] jArr2) {
        Y2.a.c(jArr[0], jArr2, 0);
        Y2.a.c(jArr[1], jArr2, 2);
        Y2.a.c(jArr[2], jArr2, 4);
        jArr2[6] = Y2.a.b((int) jArr[3]);
        jArr2[7] = Y2.a.a((int) (r0 >>> 32)) & 4294967295L;
    }

    public static void j(long[] jArr, long[] jArr2) {
        if (Y2.g.u(jArr)) {
            throw new IllegalStateException();
        }
        long[] g4 = Y2.g.g();
        long[] g5 = Y2.g.g();
        p(jArr, g4);
        k(g4, jArr, g4);
        p(g4, g4);
        k(g4, jArr, g4);
        r(g4, 3, g5);
        k(g5, g4, g5);
        p(g5, g5);
        k(g5, jArr, g5);
        r(g5, 7, g4);
        k(g4, g5, g4);
        r(g4, 14, g5);
        k(g5, g4, g5);
        p(g5, g5);
        k(g5, jArr, g5);
        r(g5, 29, g4);
        k(g4, g5, g4);
        p(g4, g4);
        k(g4, jArr, g4);
        r(g4, 59, g5);
        k(g5, g4, g5);
        p(g5, g5);
        k(g5, jArr, g5);
        r(g5, 119, g4);
        k(g4, g5, g4);
        p(g4, jArr2);
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
        long j11 = jArr[7];
        long j12 = j10 ^ (j11 >>> 17);
        long j13 = (j9 ^ (j11 << 47)) ^ (j12 >>> 17);
        long j14 = ((j8 ^ (j11 >>> 47)) ^ (j12 << 47)) ^ (j13 >>> 17);
        long j15 = j4 ^ (j14 << 17);
        long j16 = (j5 ^ (j13 << 17)) ^ (j14 >>> 47);
        long j17 = ((j6 ^ (j12 << 17)) ^ (j13 >>> 47)) ^ (j14 << 47);
        long j18 = (((j7 ^ (j11 << 17)) ^ (j12 >>> 47)) ^ (j13 << 47)) ^ (j14 >>> 17);
        long j19 = j18 >>> 47;
        jArr2[0] = j15 ^ j19;
        jArr2[1] = j16;
        jArr2[2] = (j19 << 30) ^ j17;
        jArr2[3] = 140737488355327L & j18;
    }

    public static void n(long[] jArr, int i4) {
        int i5 = i4 + 3;
        long j4 = jArr[i5];
        long j5 = j4 >>> 47;
        jArr[i4] = jArr[i4] ^ j5;
        int i6 = i4 + 2;
        jArr[i6] = (j5 << 30) ^ jArr[i6];
        jArr[i5] = j4 & 140737488355327L;
    }

    public static void o(long[] jArr, long[] jArr2) {
        long e4 = Y2.a.e(jArr[0]);
        long e5 = Y2.a.e(jArr[1]);
        long j4 = (e4 & 4294967295L) | (e5 << 32);
        long j5 = (e4 >>> 32) | (e5 & (-4294967296L));
        int i4 = 2;
        long e6 = Y2.a.e(jArr[2]);
        long e7 = Y2.a.e(jArr[3]);
        long j6 = (e6 & 4294967295L) | (e7 << 32);
        long j7 = (e7 & (-4294967296L)) | (e6 >>> 32);
        long j8 = j7 >>> 49;
        long j9 = (j5 >>> 49) | (j7 << 15);
        long j10 = j7 ^ (j5 << 15);
        long[] i5 = Y2.g.i();
        int[] iArr = {39, 120};
        int i6 = 0;
        while (i6 < i4) {
            int i7 = iArr[i6];
            int i8 = i7 >>> 6;
            int i9 = i7 & 63;
            i5[i8] = i5[i8] ^ (j5 << i9);
            int i10 = i8 + 1;
            int[] iArr2 = iArr;
            int i11 = -i9;
            i5[i10] = i5[i10] ^ ((j10 << i9) | (j5 >>> i11));
            int i12 = i8 + 2;
            i5[i12] = i5[i12] ^ ((j9 << i9) | (j10 >>> i11));
            int i13 = i8 + 3;
            i5[i13] = i5[i13] ^ ((j8 << i9) | (j9 >>> i11));
            int i14 = i8 + 4;
            i5[i14] = i5[i14] ^ (j8 >>> i11);
            i6++;
            i4 = 2;
            iArr = iArr2;
        }
        m(i5, jArr2);
        jArr2[0] = jArr2[0] ^ j4;
        jArr2[1] = jArr2[1] ^ j6;
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
