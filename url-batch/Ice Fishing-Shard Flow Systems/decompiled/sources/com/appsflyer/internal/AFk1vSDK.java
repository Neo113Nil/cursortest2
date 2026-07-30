package com.appsflyer.internal;

/* loaded from: classes.dex */
public final class AFk1vSDK {
    public static long[] getMediationNetwork(int i2, int i5) {
        long[] jArr = new long[4];
        jArr[0] = (i5 & 4294967295L) | ((i2 & 4294967295L) << 32);
        for (int i7 = 1; i7 < 4; i7++) {
            long j = jArr[i7 - 1];
            jArr[i7] = ((j ^ (j >> 30)) * 1812433253) + i7;
        }
        return jArr;
    }
}
