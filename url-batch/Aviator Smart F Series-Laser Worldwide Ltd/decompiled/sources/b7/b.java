package b7;

/* loaded from: classes5.dex */
public class b {
    private static final long M32 = 1431655765;
    private static final long M64 = 6148914691236517205L;
    private static final long M64R = -6148914691236517206L;

    public static int expand16to32(int i8) {
        int i9 = i8 & 65535;
        int i10 = (i9 | (i9 << 8)) & 16711935;
        int i11 = (i10 | (i10 << 4)) & 252645135;
        int i12 = (i11 | (i11 << 2)) & 858993459;
        return (i12 | (i12 << 1)) & 1431655765;
    }

    public static long expand32to64(int i8) {
        return (((r6 >>> 1) & M32) << 32) | (M32 & a.bitPermuteStep(a.bitPermuteStep(a.bitPermuteStep(a.bitPermuteStep(i8, 65280, 8), 15728880, 4), 202116108, 2), 572662306, 1));
    }

    public static void expand64To128(long j8, long[] jArr, int i8) {
        long bitPermuteStep = a.bitPermuteStep(a.bitPermuteStep(a.bitPermuteStep(a.bitPermuteStep(a.bitPermuteStep(j8, 4294901760L, 16), 280375465148160L, 8), 67555025218437360L, 4), 868082074056920076L, 2), 2459565876494606882L, 1);
        jArr[i8] = bitPermuteStep & M64;
        jArr[i8 + 1] = (bitPermuteStep >>> 1) & M64;
    }

    public static void expand64To128Rev(long j8, long[] jArr, int i8) {
        long bitPermuteStep = a.bitPermuteStep(a.bitPermuteStep(a.bitPermuteStep(a.bitPermuteStep(a.bitPermuteStep(j8, 4294901760L, 16), 280375465148160L, 8), 67555025218437360L, 4), 868082074056920076L, 2), 2459565876494606882L, 1);
        jArr[i8] = bitPermuteStep & M64R;
        jArr[i8 + 1] = (bitPermuteStep << 1) & M64R;
    }

    public static int expand8to16(int i8) {
        int i9 = i8 & 255;
        int i10 = (i9 | (i9 << 4)) & 3855;
        int i11 = (i10 | (i10 << 2)) & 13107;
        return (i11 | (i11 << 1)) & 21845;
    }

    public static int shuffle(int i8) {
        return a.bitPermuteStep(a.bitPermuteStep(a.bitPermuteStep(a.bitPermuteStep(i8, 65280, 8), 15728880, 4), 202116108, 2), 572662306, 1);
    }

    public static int shuffle2(int i8) {
        return a.bitPermuteStep(a.bitPermuteStep(a.bitPermuteStep(a.bitPermuteStep(i8, 11141290, 7), 52428, 14), 15728880, 4), 65280, 8);
    }

    public static long shuffle3(long j8) {
        return a.bitPermuteStep(a.bitPermuteStep(a.bitPermuteStep(j8, 47851476196393130L, 7), 225176545447116L, 14), 4042322160L, 28);
    }

    public static int unshuffle(int i8) {
        return a.bitPermuteStep(a.bitPermuteStep(a.bitPermuteStep(a.bitPermuteStep(i8, 572662306, 1), 202116108, 2), 15728880, 4), 65280, 8);
    }

    public static int unshuffle2(int i8) {
        return a.bitPermuteStep(a.bitPermuteStep(a.bitPermuteStep(a.bitPermuteStep(i8, 65280, 8), 15728880, 4), 52428, 14), 11141290, 7);
    }

    public static long unshuffle3(long j8) {
        return shuffle3(j8);
    }

    public static void expand64To128(long[] jArr, int i8, int i9, long[] jArr2, int i10) {
        for (int i11 = 0; i11 < i9; i11++) {
            expand64To128(jArr[i8 + i11], jArr2, i10);
            i10 += 2;
        }
    }

    public static long shuffle(long j8) {
        return a.bitPermuteStep(a.bitPermuteStep(a.bitPermuteStep(a.bitPermuteStep(a.bitPermuteStep(j8, 4294901760L, 16), 280375465148160L, 8), 67555025218437360L, 4), 868082074056920076L, 2), 2459565876494606882L, 1);
    }

    public static long shuffle2(long j8) {
        return a.bitPermuteStep(a.bitPermuteStep(a.bitPermuteStep(a.bitPermuteStep(j8, 4278255360L, 24), 57421771435671756L, 6), 264913582878960L, 12), 723401728380766730L, 3);
    }

    public static long unshuffle(long j8) {
        return a.bitPermuteStep(a.bitPermuteStep(a.bitPermuteStep(a.bitPermuteStep(a.bitPermuteStep(j8, 2459565876494606882L, 1), 868082074056920076L, 2), 67555025218437360L, 4), 280375465148160L, 8), 4294901760L, 16);
    }

    public static long unshuffle2(long j8) {
        return a.bitPermuteStep(a.bitPermuteStep(a.bitPermuteStep(a.bitPermuteStep(j8, 723401728380766730L, 3), 264913582878960L, 12), 57421771435671756L, 6), 4278255360L, 24);
    }
}
