package com.appsflyer.internal;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class AFk1sSDK {
    public static long[] getCurrencyIso4217Code(int i3, int i10) {
        long[] jArr = new long[4];
        jArr[0] = (i10 & 4294967295L) | ((i3 & 4294967295L) << 32);
        for (int i11 = 1; i11 < 4; i11++) {
            long j = jArr[i11 - 1];
            jArr[i11] = ((j ^ (j >> 30)) * 1812433253) + i11;
        }
        return jArr;
    }
}
