package com.airbnb.lottie.utils;

/* loaded from: classes.dex */
public class d {
    private static float EOCF_sRGB(float f8) {
        return f8 <= 0.04045f ? f8 / 12.92f : (float) Math.pow((f8 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    private static float OECF_sRGB(float f8) {
        return f8 <= 0.0031308f ? f8 * 12.92f : (float) ((Math.pow(f8, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    public static int evaluate(float f8, int i8, int i9) {
        if (i8 == i9) {
            return i8;
        }
        float f9 = ((i8 >> 24) & 255) / 255.0f;
        float EOCF_sRGB = EOCF_sRGB(((i8 >> 16) & 255) / 255.0f);
        float EOCF_sRGB2 = EOCF_sRGB(((i8 >> 8) & 255) / 255.0f);
        float EOCF_sRGB3 = EOCF_sRGB((i8 & 255) / 255.0f);
        float EOCF_sRGB4 = EOCF_sRGB(((i9 >> 16) & 255) / 255.0f);
        float f10 = f9 + (((((i9 >> 24) & 255) / 255.0f) - f9) * f8);
        float EOCF_sRGB5 = EOCF_sRGB2 + ((EOCF_sRGB(((i9 >> 8) & 255) / 255.0f) - EOCF_sRGB2) * f8);
        float EOCF_sRGB6 = EOCF_sRGB3 + (f8 * (EOCF_sRGB((i9 & 255) / 255.0f) - EOCF_sRGB3));
        return (Math.round(OECF_sRGB(EOCF_sRGB + ((EOCF_sRGB4 - EOCF_sRGB) * f8)) * 255.0f) << 16) | (Math.round(f10 * 255.0f) << 24) | (Math.round(OECF_sRGB(EOCF_sRGB5) * 255.0f) << 8) | Math.round(OECF_sRGB(EOCF_sRGB6) * 255.0f);
    }
}
