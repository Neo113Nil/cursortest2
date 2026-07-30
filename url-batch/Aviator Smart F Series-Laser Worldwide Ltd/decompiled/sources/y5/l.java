package y5;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class l {
    public static /* synthetic */ long a(long j8, long j9) {
        if (j9 < 0) {
            return (j8 ^ Long.MIN_VALUE) < (Long.MIN_VALUE ^ j9) ? j8 : j8 - j9;
        }
        if (j8 >= 0) {
            return j8 % j9;
        }
        long j10 = j8 - ((((j8 >>> 1) / j9) << 1) * j9);
        if ((j10 ^ Long.MIN_VALUE) < (Long.MIN_VALUE ^ j9)) {
            j9 = 0;
        }
        return j10 - j9;
    }
}
