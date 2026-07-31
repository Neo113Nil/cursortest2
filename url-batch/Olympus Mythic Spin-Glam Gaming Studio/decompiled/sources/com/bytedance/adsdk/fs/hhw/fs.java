package com.bytedance.adsdk.fs.hhw;

/* loaded from: classes15.dex */
public class fs {
    private static float zmn(float f) {
        return f <= 0.0031308f ? f * 12.92f : (float) ((Math.pow(f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    private static float fs(float f) {
        return f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static int zmn(float f, int i, int i2) {
        if (i == i2) {
            return i;
        }
        float f2 = ((i >> 24) & 255) / 255.0f;
        float fs = fs(((i >> 16) & 255) / 255.0f);
        float fs2 = fs(((i >> 8) & 255) / 255.0f);
        float fs3 = fs((i & 255) / 255.0f);
        float fs4 = fs(((i2 >> 16) & 255) / 255.0f);
        float f3 = f2 + (((((i2 >> 24) & 255) / 255.0f) - f2) * f);
        float fs5 = fs2 + ((fs(((i2 >> 8) & 255) / 255.0f) - fs2) * f);
        float fs6 = fs3 + (f * (fs((i2 & 255) / 255.0f) - fs3));
        return (Math.round(zmn(fs + ((fs4 - fs) * f)) * 255.0f) << 16) | (Math.round(f3 * 255.0f) << 24) | (Math.round(zmn(fs5) * 255.0f) << 8) | Math.round(zmn(fs6) * 255.0f);
    }
}
