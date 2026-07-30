package b6;

/* loaded from: classes4.dex */
public abstract class c {
    private static final int differenceModulo(int i8, int i9, int i10) {
        return mod(mod(i8, i10) - mod(i9, i10), i10);
    }

    public static final int getProgressionLastElement(int i8, int i9, int i10) {
        if (i10 > 0) {
            return i8 >= i9 ? i9 : i9 - differenceModulo(i9, i8, i10);
        }
        if (i10 < 0) {
            return i8 <= i9 ? i9 : i9 + differenceModulo(i8, i9, -i10);
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    private static final int mod(int i8, int i9) {
        int i10 = i8 % i9;
        return i10 >= 0 ? i10 : i10 + i9;
    }

    private static final long differenceModulo(long j8, long j9, long j10) {
        return mod(mod(j8, j10) - mod(j9, j10), j10);
    }

    private static final long mod(long j8, long j9) {
        long j10 = j8 % j9;
        return j10 >= 0 ? j10 : j10 + j9;
    }

    public static final long getProgressionLastElement(long j8, long j9, long j10) {
        if (j10 > 0) {
            return j8 >= j9 ? j9 : j9 - differenceModulo(j9, j8, j10);
        }
        if (j10 < 0) {
            return j8 <= j9 ? j9 : j9 + differenceModulo(j8, j9, -j10);
        }
        throw new IllegalArgumentException("Step is zero.");
    }
}
