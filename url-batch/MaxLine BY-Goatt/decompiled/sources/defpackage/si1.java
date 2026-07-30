package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class si1 extends ri1 {
    public static int a(double d) {
        if (Double.isNaN(d)) {
            lh.e("Cannot round NaN value.");
            return 0;
        }
        if (d > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d);
    }

    public static int b(float f) {
        if (!Float.isNaN(f)) {
            return Math.round(f);
        }
        lh.e("Cannot round NaN value.");
        return 0;
    }

    public static long c(double d) {
        if (!Double.isNaN(d)) {
            return Math.round(d);
        }
        lh.e("Cannot round NaN value.");
        return 0L;
    }
}
