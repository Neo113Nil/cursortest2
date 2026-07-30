package cn.hutool.core.date.format;

/* loaded from: classes.dex */
public abstract /* synthetic */ class i {
    public static /* synthetic */ long a(long j8, long j9) {
        long j10 = j8 / j9;
        return (j8 - (j9 * j10) != 0 && (((j8 ^ j9) >> 63) | 1) < 0) ? j10 - 1 : j10;
    }
}
