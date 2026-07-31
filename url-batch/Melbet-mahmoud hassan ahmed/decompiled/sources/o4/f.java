package o4;

import l4.j;

/* loaded from: classes.dex */
public final class f {
    public static int a(long j7, long j8) {
        if (j7 < j8) {
            return -1;
        }
        return j7 > j8 ? 1 : 0;
    }

    public static int b(long j7) {
        return (int) (j7 ^ (j7 >>> 32));
    }

    public static long c(long... jArr) {
        j.d(jArr.length > 0);
        long j7 = jArr[0];
        for (int i7 = 1; i7 < jArr.length; i7++) {
            if (jArr[i7] > j7) {
                j7 = jArr[i7];
            }
        }
        return j7;
    }
}
