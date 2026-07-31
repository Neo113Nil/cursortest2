package com.bytedance.sdk.openadsdk.kgc.fb;

/* loaded from: classes15.dex */
public class zmn {
    public static long zmn() {
        long currentTimeMillis = System.currentTimeMillis();
        return currentTimeMillis - (currentTimeMillis % 86400000);
    }

    public static boolean zmn(long j) {
        return j - (j % 86400000) == zmn();
    }
}
