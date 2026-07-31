package V2;

import java.math.BigInteger;

/* renamed from: V2.v0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1225v0 {
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
        jArr[0] = j4 ^ (j5 << 59);
        jArr[1] = (j5 >>> 5) ^ (j6 << 54);
        jArr[2] = (j6 >>> 10) ^ (j7 << 49);
        jArr[3] = (j7 >>> 15) ^ (j8 << 44);
        jArr[4] = (j8 >>> 20) ^ (j9 << 39);
        jArr[5] = (j9 >>> 25) ^ (j10 << 34);
        jArr[6] = (j10 >>> 30) ^ (j11 << 29);
        jArr[7] = j11 >>> 35;
    }

    protected static void f(long[] jArr, long[] jArr2) {
        long j4 = jArr[0];
        long j5 = jArr[1];
        long j6 = jArr[2];
        long j7 = jArr[3];
        jArr2[0] = j4 & 576460752303423487L;
        jArr2[1] = ((j4 >>> 59) ^ (j5 << 5)) & 576460752303423487L;
        jArr2[2] = ((j5 >>> 54) ^ (j6 << 10)) & 576460752303423487L;
        jArr2[3] = (j6 >>> 49) ^ (j7 << 15);
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
        jArr[i4] = jArr[i4] ^ (576460752303423487L & j10);
        int i8 = i4 + 1;
        jArr[i8] = jArr[i8] ^ ((j10 >>> 59) ^ (j11 << 5));
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
        r(g4, 58, g5);
        k(g5, g4, g5);
        r(g5, 116, g4);
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
        long j12 = j9 ^ (j11 >>> 31);
        long j13 = (j8 ^ ((j11 >>> 41) ^ (j11 << 33))) ^ (j10 >>> 31);
        long j14 = ((j7 ^ (j11 << 23)) ^ ((j10 >>> 41) ^ (j10 << 33))) ^ (j12 >>> 31);
        long j15 = j4 ^ (j13 << 23);
        long j16 = (j5 ^ (j12 << 23)) ^ ((j13 >>> 41) ^ (j13 << 33));
        long j17 = ((j6 ^ (j10 << 23)) ^ ((j12 >>> 41) ^ (j12 << 33))) ^ (j13 >>> 31);
        long j18 = j14 >>> 41;
        jArr2[0] = j15 ^ j18;
        jArr2[1] = (j18 << 10) ^ j16;
        jArr2[2] = j17;
        jArr2[3] = 2199023255551L & j14;
    }

    public static void n(long[] jArr, int i4) {
        int i5 = i4 + 3;
        long j4 = jArr[i5];
        long j5 = j4 >>> 41;
        jArr[i4] = jArr[i4] ^ j5;
        int i6 = i4 + 1;
        jArr[i6] = (j5 << 10) ^ jArr[i6];
        jArr[i5] = j4 & 2199023255551L;
    }

    public static void o(long[] jArr, long[] jArr2) {
        long e4 = Y2.a.e(jArr[0]);
        boolean z4 = true;
        long e5 = Y2.a.e(jArr[1]);
        long j4 = (e4 & 4294967295L) | (e5 << 32);
        long j5 = (e4 >>> 32) | (e5 & (-4294967296L));
        long e6 = Y2.a.e(jArr[2]);
        long e7 = Y2.a.e(jArr[3]);
        long j6 = (4294967295L & e6) | (e7 << 32);
        long j7 = (e6 >>> 32) | ((-4294967296L) & e7);
        long j8 = j7 >>> 27;
        long j9 = j7 ^ ((j5 >>> 27) | (j7 << 37));
        long j10 = j5 ^ (j5 << 37);
        long[] i4 = Y2.g.i();
        int[] iArr = {32, 117, 191};
        int i5 = 0;
        while (i5 < 3) {
            int i6 = iArr[i5];
            int i7 = i6 >>> 6;
            int i8 = i6 & 63;
            i4[i7] = i4[i7] ^ (j10 << i8);
            int i9 = i7 + 1;
            boolean z5 = z4;
            int i10 = -i8;
            i4[i9] = i4[i9] ^ ((j9 << i8) | (j10 >>> i10));
            int i11 = i7 + 2;
            i4[i11] = i4[i11] ^ ((j8 << i8) | (j9 >>> i10));
            int i12 = i7 + 3;
            i4[i12] = i4[i12] ^ (j8 >>> i10);
            i5++;
            z4 = z5;
        }
        boolean z6 = z4;
        m(i4, jArr2);
        jArr2[0] = jArr2[0] ^ j4;
        jArr2[z6 ? 1 : 0] = jArr2[z6 ? 1 : 0] ^ j6;
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
