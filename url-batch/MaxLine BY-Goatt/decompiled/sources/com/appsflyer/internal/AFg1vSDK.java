package com.appsflyer.internal;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AFg1vSDK {
    public static long[] AFInAppEventParameterName(int i, int i2) {
        long[] jArr = new long[4];
        jArr[0] = (i2 & 4294967295L) | ((i & 4294967295L) << 32);
        for (int i3 = 1; i3 < 4; i3++) {
            long j = jArr[i3 - 1];
            jArr[i3] = ((j ^ (j >> 30)) * 1812433253) + i3;
        }
        return jArr;
    }
}
