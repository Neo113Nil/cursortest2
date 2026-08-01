package com.bytedance.adsdk.ugeno.icD;

/* compiled from: NumberUtils.java */
/* loaded from: classes.dex */
public final class vG {
    public static float pvs(String str, float f) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException unused) {
            return f;
        }
    }

    public static int pvs(String str, int i) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static long pvs(String str, long j) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j;
        }
    }

    public static boolean pvs(String str, boolean z) {
        try {
            return Boolean.parseBoolean(str);
        } catch (NumberFormatException unused) {
            return z;
        }
    }
}
