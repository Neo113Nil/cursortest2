package Y2;

import kotlin.KotlinVersion;

/* loaded from: classes3.dex */
public abstract class a {
    public static int a(int i4) {
        int i5 = i4 & 65535;
        int i6 = (i5 | (i5 << 8)) & 16711935;
        int i7 = (i6 | (i6 << 4)) & 252645135;
        int i8 = (i7 | (i7 << 2)) & 858993459;
        return (i8 | (i8 << 1)) & 1431655765;
    }

    public static long b(int i4) {
        int i5 = ((i4 >>> 8) ^ i4) & 65280;
        int i6 = i4 ^ (i5 ^ (i5 << 8));
        int i7 = ((i6 >>> 4) ^ i6) & 15728880;
        int i8 = i6 ^ (i7 ^ (i7 << 4));
        int i9 = ((i8 >>> 2) ^ i8) & 202116108;
        int i10 = i8 ^ (i9 ^ (i9 << 2));
        int i11 = ((i10 >>> 1) ^ i10) & 572662306;
        return (((r6 >>> 1) & 1431655765) << 32) | (1431655765 & (i10 ^ (i11 ^ (i11 << 1))));
    }

    public static void c(long j4, long[] jArr, int i4) {
        long j5 = ((j4 >>> 16) ^ j4) & 4294901760L;
        long j6 = j4 ^ (j5 ^ (j5 << 16));
        long j7 = ((j6 >>> 8) ^ j6) & 280375465148160L;
        long j8 = j6 ^ (j7 ^ (j7 << 8));
        long j9 = ((j8 >>> 4) ^ j8) & 67555025218437360L;
        long j10 = j8 ^ (j9 ^ (j9 << 4));
        long j11 = ((j10 >>> 2) ^ j10) & 868082074056920076L;
        long j12 = j10 ^ (j11 ^ (j11 << 2));
        long j13 = ((j12 >>> 1) ^ j12) & 2459565876494606882L;
        long j14 = j12 ^ (j13 ^ (j13 << 1));
        jArr[i4] = j14 & 6148914691236517205L;
        jArr[i4 + 1] = (j14 >>> 1) & 6148914691236517205L;
    }

    public static int d(int i4) {
        int i5 = i4 & KotlinVersion.MAX_COMPONENT_VALUE;
        int i6 = (i5 | (i5 << 4)) & 3855;
        int i7 = (i6 | (i6 << 2)) & 13107;
        return (i7 | (i7 << 1)) & 21845;
    }

    public static long e(long j4) {
        long j5 = ((j4 >>> 1) ^ j4) & 2459565876494606882L;
        long j6 = j4 ^ (j5 ^ (j5 << 1));
        long j7 = ((j6 >>> 2) ^ j6) & 868082074056920076L;
        long j8 = j6 ^ (j7 ^ (j7 << 2));
        long j9 = ((j8 >>> 4) ^ j8) & 67555025218437360L;
        long j10 = j8 ^ (j9 ^ (j9 << 4));
        long j11 = ((j10 >>> 8) ^ j10) & 280375465148160L;
        long j12 = j10 ^ (j11 ^ (j11 << 8));
        long j13 = ((j12 >>> 16) ^ j12) & 4294901760L;
        return j12 ^ (j13 ^ (j13 << 16));
    }
}
