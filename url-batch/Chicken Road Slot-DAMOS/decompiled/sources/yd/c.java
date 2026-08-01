package yd;

import te.a1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class c extends b {
    public static int a(float f3) {
        if (!Float.isNaN(f3)) {
            return Math.round(f3);
        }
        a1.e("Cannot round NaN value.");
        return 0;
    }

    public static long b(double d10) {
        if (!Double.isNaN(d10)) {
            return Math.round(d10);
        }
        a1.e("Cannot round NaN value.");
        return 0L;
    }
}
