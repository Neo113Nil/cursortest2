package kotlin.math;

import bo.app.a$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public class MathKt__MathJVMKt extends MathKt__MathHKt {
    public static int roundToInt(double d) {
        if (Double.isNaN(d)) {
            a$$ExternalSyntheticBUOutline0.m$3("Cannot round NaN value.");
            return 0;
        }
        if (d > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        return d < -2.147483648E9d ? PKIFailureInfo.systemUnavail : (int) Math.round(d);
    }

    public static long roundToLong(double d) {
        if (!Double.isNaN(d)) {
            return Math.round(d);
        }
        a$$ExternalSyntheticBUOutline0.m$3("Cannot round NaN value.");
        return 0L;
    }

    public static int roundToInt(float f) {
        if (!Float.isNaN(f)) {
            return Math.round(f);
        }
        a$$ExternalSyntheticBUOutline0.m$3("Cannot round NaN value.");
        return 0;
    }
}
