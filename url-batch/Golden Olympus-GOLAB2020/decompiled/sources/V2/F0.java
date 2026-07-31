package V2;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.math.BigInteger;

/* loaded from: classes3.dex */
public abstract class F0 {

    /* renamed from: a, reason: collision with root package name */
    private static final long[] f9489a = {878416384462358536L, 3513665537849438403L, -9076969306111048948L, 585610922974906400L, 34087042};

    public static void a(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr2[4] ^ jArr[4];
    }

    public static void b(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr[6] ^ jArr2[6];
        jArr3[7] = jArr[7] ^ jArr2[7];
        jArr3[8] = jArr2[8] ^ jArr[8];
    }

    public static void c(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
        jArr2[4] = jArr[4];
    }

    public static long[] d(BigInteger bigInteger) {
        long[] d4 = Y2.h.d(bigInteger);
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
        jArr[0] = j4 ^ (j5 << 57);
        jArr[1] = (j5 >>> 7) ^ (j6 << 50);
        jArr[2] = (j6 >>> 14) ^ (j7 << 43);
        jArr[3] = (j7 >>> 21) ^ (j8 << 36);
        jArr[4] = (j8 >>> 28) ^ (j9 << 29);
        jArr[5] = (j9 >>> 35) ^ (j10 << 22);
        jArr[6] = (j10 >>> 42) ^ (j11 << 15);
        jArr[7] = (j11 >>> 49) ^ (j12 << 8);
        jArr[8] = (j12 >>> 56) ^ (j13 << 1);
        jArr[9] = j13 >>> 63;
    }

    protected static void f(long[] jArr, long[] jArr2) {
        long j4 = jArr[0];
        long j5 = jArr[1];
        long j6 = jArr[2];
        long j7 = jArr[3];
        long j8 = jArr[4];
        jArr2[0] = j4 & 144115188075855871L;
        jArr2[1] = ((j4 >>> 57) ^ (j5 << 7)) & 144115188075855871L;
        jArr2[2] = ((j5 >>> 50) ^ (j6 << 14)) & 144115188075855871L;
        jArr2[3] = ((j6 >>> 43) ^ (j7 << 21)) & 144115188075855871L;
        jArr2[4] = (j7 >>> 36) ^ (j8 << 28);
    }

    protected static void g(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[5];
        long[] jArr5 = new long[5];
        f(jArr, jArr4);
        f(jArr2, jArr5);
        long[] jArr6 = new long[26];
        h(jArr4[0], jArr5[0], jArr6, 0);
        h(jArr4[1], jArr5[1], jArr6, 2);
        h(jArr4[2], jArr5[2], jArr6, 4);
        h(jArr4[3], jArr5[3], jArr6, 6);
        h(jArr4[4], jArr5[4], jArr6, 8);
        long j4 = jArr4[0];
        long j5 = j4 ^ jArr4[1];
        long j6 = jArr5[0];
        long j7 = j6 ^ jArr5[1];
        long j8 = jArr4[2];
        long j9 = j4 ^ j8;
        long j10 = jArr5[2];
        long j11 = j6 ^ j10;
        long j12 = jArr4[4];
        long j13 = j8 ^ j12;
        long j14 = jArr5[4];
        long j15 = j10 ^ j14;
        long j16 = jArr4[3];
        long j17 = j16 ^ j12;
        long j18 = jArr5[3];
        long j19 = j18 ^ j14;
        h(j9 ^ j16, j11 ^ j18, jArr6, 18);
        h(j13 ^ jArr4[1], j15 ^ jArr5[1], jArr6, 20);
        long j20 = j5 ^ j17;
        long j21 = j7 ^ j19;
        long j22 = j20 ^ jArr4[2];
        long j23 = jArr5[2] ^ j21;
        h(j20, j21, jArr6, 22);
        h(j22, j23, jArr6, 24);
        h(j5, j7, jArr6, 10);
        h(j9, j11, jArr6, 12);
        h(j13, j15, jArr6, 14);
        h(j17, j19, jArr6, 16);
        jArr3[0] = jArr6[0];
        jArr3[9] = jArr6[9];
        long j24 = jArr6[0];
        long j25 = jArr6[1] ^ j24;
        long j26 = jArr6[2] ^ j25;
        long j27 = jArr6[10] ^ j26;
        jArr3[1] = j27;
        long j28 = jArr6[3] ^ jArr6[4];
        long j29 = j26 ^ (j28 ^ (jArr6[11] ^ jArr6[12]));
        jArr3[2] = j29;
        long j30 = j25 ^ j28;
        long j31 = jArr6[5] ^ jArr6[6];
        long j32 = jArr6[8];
        long j33 = (j30 ^ j31) ^ j32;
        long j34 = jArr6[13] ^ jArr6[14];
        long j35 = jArr6[18];
        long j36 = jArr6[22];
        long j37 = jArr6[24];
        jArr3[3] = (j33 ^ j34) ^ ((j35 ^ j36) ^ j37);
        long j38 = jArr6[7] ^ j32;
        long j39 = jArr6[9];
        long j40 = j38 ^ j39;
        long j41 = j40 ^ jArr6[17];
        jArr3[8] = j41;
        long j42 = (j40 ^ j31) ^ (jArr6[15] ^ jArr6[16]);
        jArr3[7] = j42;
        long j43 = j42 ^ j27;
        long j44 = jArr6[19] ^ jArr6[20];
        long j45 = jArr6[25];
        long j46 = jArr6[23];
        long j47 = j44 ^ (j45 ^ j37);
        jArr3[4] = (j47 ^ (j35 ^ j46)) ^ j43;
        long j48 = jArr6[21];
        jArr3[5] = ((j29 ^ j41) ^ j47) ^ (j48 ^ j36);
        jArr3[6] = (((((j33 ^ j24) ^ j39) ^ j34) ^ j48) ^ j46) ^ j45;
        e(jArr3);
    }

    protected static void h(long j4, long j5, long[] jArr, int i4) {
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

    protected static void i(long[] jArr, long[] jArr2) {
        for (int i4 = 0; i4 < 4; i4++) {
            Y2.a.c(jArr[i4], jArr2, i4 << 1);
        }
        jArr2[8] = Y2.a.b((int) jArr[4]);
    }

    public static void j(long[] jArr, long[] jArr2) {
        if (Y2.h.f(jArr)) {
            throw new IllegalStateException();
        }
        long[] a4 = Y2.h.a();
        long[] a5 = Y2.h.a();
        p(jArr, a4);
        k(a4, jArr, a4);
        r(a4, 2, a5);
        k(a5, a4, a5);
        r(a5, 4, a4);
        k(a4, a5, a4);
        r(a4, 8, a5);
        k(a5, a4, a5);
        p(a5, a5);
        k(a5, jArr, a5);
        r(a5, 17, a4);
        k(a4, a5, a4);
        p(a4, a4);
        k(a4, jArr, a4);
        r(a4, 35, a5);
        k(a5, a4, a5);
        r(a5, 70, a4);
        k(a4, a5, a4);
        p(a4, a4);
        k(a4, jArr, a4);
        r(a4, ModuleDescriptor.MODULE_VERSION, a5);
        k(a5, a4, a5);
        p(a5, jArr2);
    }

    public static void k(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] b4 = Y2.h.b();
        g(jArr, jArr2, b4);
        m(b4, jArr3);
    }

    public static void l(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] b4 = Y2.h.b();
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
        long j12 = jArr[8];
        long j13 = j8 ^ ((((j12 >>> 27) ^ (j12 >>> 22)) ^ (j12 >>> 20)) ^ (j12 >>> 15));
        long j14 = j4 ^ ((((j9 << 37) ^ (j9 << 42)) ^ (j9 << 44)) ^ (j9 << 49));
        long j15 = (j5 ^ ((((j10 << 37) ^ (j10 << 42)) ^ (j10 << 44)) ^ (j10 << 49))) ^ ((((j9 >>> 27) ^ (j9 >>> 22)) ^ (j9 >>> 20)) ^ (j9 >>> 15));
        long j16 = j13 >>> 27;
        jArr2[0] = (((j14 ^ j16) ^ (j16 << 5)) ^ (j16 << 7)) ^ (j16 << 12);
        jArr2[1] = j15;
        jArr2[2] = (j6 ^ ((((j11 << 37) ^ (j11 << 42)) ^ (j11 << 44)) ^ (j11 << 49))) ^ ((((j10 >>> 27) ^ (j10 >>> 22)) ^ (j10 >>> 20)) ^ (j10 >>> 15));
        jArr2[3] = (j7 ^ ((((j12 << 37) ^ (j12 << 42)) ^ (j12 << 44)) ^ (j12 << 49))) ^ ((((j11 >>> 27) ^ (j11 >>> 22)) ^ (j11 >>> 20)) ^ (j11 >>> 15));
        jArr2[4] = 134217727 & j13;
    }

    public static void n(long[] jArr, int i4) {
        int i5 = i4 + 4;
        long j4 = jArr[i5];
        long j5 = j4 >>> 27;
        jArr[i4] = ((j5 << 12) ^ (((j5 << 5) ^ j5) ^ (j5 << 7))) ^ jArr[i4];
        jArr[i5] = j4 & 134217727;
    }

    public static void o(long[] jArr, long[] jArr2) {
        long[] a4 = Y2.h.a();
        long e4 = Y2.a.e(jArr[0]);
        long e5 = Y2.a.e(jArr[1]);
        long j4 = (e4 & 4294967295L) | (e5 << 32);
        a4[0] = (e4 >>> 32) | (e5 & (-4294967296L));
        long e6 = Y2.a.e(jArr[2]);
        long e7 = Y2.a.e(jArr[3]);
        long j5 = (e6 & 4294967295L) | (e7 << 32);
        a4[1] = (e6 >>> 32) | ((-4294967296L) & e7);
        long e8 = Y2.a.e(jArr[4]);
        a4[2] = e8 >>> 32;
        k(a4, f9489a, jArr2);
        jArr2[0] = jArr2[0] ^ j4;
        jArr2[1] = jArr2[1] ^ j5;
        jArr2[2] = jArr2[2] ^ (4294967295L & e8);
    }

    public static void p(long[] jArr, long[] jArr2) {
        long[] j4 = Y2.m.j(9);
        i(jArr, j4);
        m(j4, jArr2);
    }

    public static void q(long[] jArr, long[] jArr2) {
        long[] j4 = Y2.m.j(9);
        i(jArr, j4);
        b(jArr2, j4, jArr2);
    }

    public static void r(long[] jArr, int i4, long[] jArr2) {
        long[] j4 = Y2.m.j(9);
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
