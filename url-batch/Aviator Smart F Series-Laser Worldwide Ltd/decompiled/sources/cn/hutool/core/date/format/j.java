package cn.hutool.core.date.format;

/* loaded from: classes.dex */
public abstract /* synthetic */ class j {
    public static /* synthetic */ long a(long j8, long j9) {
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(j8) + Long.numberOfLeadingZeros(~j8) + Long.numberOfLeadingZeros(j9) + Long.numberOfLeadingZeros(~j9);
        if (numberOfLeadingZeros > 65) {
            return j8 * j9;
        }
        if (numberOfLeadingZeros >= 64) {
            if ((j8 >= 0) | (j9 != Long.MIN_VALUE)) {
                long j10 = j8 * j9;
                if (j8 == 0 || j10 / j8 == j9) {
                    return j10;
                }
            }
        }
        throw new ArithmeticException();
    }
}
