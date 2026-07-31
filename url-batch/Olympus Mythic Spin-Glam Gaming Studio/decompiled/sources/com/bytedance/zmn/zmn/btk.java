package com.bytedance.zmn.zmn;

/* loaded from: classes3.dex */
public class btk {
    public static int zmn() {
        long maxMemory = Runtime.getRuntime().maxMemory();
        long freeMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        if (maxMemory == 0) {
            return -1;
        }
        return 100 - ((int) ((freeMemory * 100.0f) / maxMemory));
    }

    public static float zmn(boolean z) {
        int zmn = zmn();
        if (zmn < 0) {
            return 1.0f;
        }
        if (zmn < 30) {
            return z ? 0.1f : 2.0f;
        }
        if (zmn < 60) {
            return z ? 0.5f : 1.5f;
        }
        return 1.0f;
    }
}
