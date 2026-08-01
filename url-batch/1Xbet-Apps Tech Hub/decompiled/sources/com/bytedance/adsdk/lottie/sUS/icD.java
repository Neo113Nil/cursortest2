package com.bytedance.adsdk.lottie.sUS;

/* compiled from: GammaEvaluator.java */
/* loaded from: classes.dex */
public class icD {
    private static float pvs(float f) {
        return f <= 0.0031308f ? f * 12.92f : (float) ((Math.pow(f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    private static float icD(float f) {
        return f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static int pvs(float f, int i, int i2) {
        if (i == i2) {
            return i;
        }
        float f2 = ((i >> 24) & 255) / 255.0f;
        float icD = icD(((i >> 16) & 255) / 255.0f);
        float icD2 = icD(((i >> 8) & 255) / 255.0f);
        float icD3 = icD((i & 255) / 255.0f);
        float icD4 = icD(((i2 >> 16) & 255) / 255.0f);
        float f3 = f2 + (((((i2 >> 24) & 255) / 255.0f) - f2) * f);
        float icD5 = icD2 + ((icD(((i2 >> 8) & 255) / 255.0f) - icD2) * f);
        float icD6 = icD3 + (f * (icD((i2 & 255) / 255.0f) - icD3));
        return (Math.round(pvs(icD + ((icD4 - icD) * f)) * 255.0f) << 16) | (Math.round(f3 * 255.0f) << 24) | (Math.round(pvs(icD5) * 255.0f) << 8) | Math.round(pvs(icD6) * 255.0f);
    }
}
