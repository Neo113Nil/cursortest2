package com.bytedance.adsdk.ugeno.yoga;

/* loaded from: classes6.dex */
public class bvs {
    public static long zmn(float f, float f2) {
        return Float.floatToRawIntBits(f2) | (Float.floatToRawIntBits(f) << 32);
    }

    public static long zmn(int i, int i2) {
        return zmn(i, i2);
    }
}
