package b7;

/* loaded from: classes5.dex */
public abstract class a {
    public static int bitPermuteStep(int i8, int i9, int i10) {
        int i11 = i9 & ((i8 >>> i10) ^ i8);
        return i8 ^ (i11 ^ (i11 << i10));
    }

    public static int bitPermuteStepSimple(int i8, int i9, int i10) {
        return ((i8 >>> i10) & i9) | ((i8 & i9) << i10);
    }

    public static long bitPermuteStep(long j8, long j9, int i8) {
        long j10 = j9 & ((j8 >>> i8) ^ j8);
        return j8 ^ (j10 ^ (j10 << i8));
    }

    public static long bitPermuteStepSimple(long j8, long j9, int i8) {
        return ((j8 >>> i8) & j9) | ((j8 & j9) << i8);
    }
}
