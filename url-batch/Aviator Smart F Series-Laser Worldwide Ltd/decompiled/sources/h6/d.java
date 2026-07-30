package h6;

import com.github.mikephil.charting.utils.i;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class d extends c {
    private static final double IEEErem(double d8, double d9) {
        return Math.IEEEremainder(d8, d9);
    }

    private static final double abs(double d8) {
        return Math.abs(d8);
    }

    private static final double acos(double d8) {
        return Math.acos(d8);
    }

    public static final double acosh(double d8) {
        if (d8 < 1.0d) {
            return Double.NaN;
        }
        if (d8 > a.upper_taylor_2_bound) {
            return Math.log(d8) + a.LN2;
        }
        double d9 = 1;
        double d10 = d8 - d9;
        if (d10 >= a.taylor_n_bound) {
            return Math.log(d8 + Math.sqrt((d8 * d8) - d9));
        }
        double sqrt = Math.sqrt(d10);
        if (sqrt >= a.taylor_2_bound) {
            sqrt -= ((sqrt * sqrt) * sqrt) / 12;
        }
        return sqrt * Math.sqrt(2.0d);
    }

    private static final double asin(double d8) {
        return Math.asin(d8);
    }

    public static final double asinh(double d8) {
        double d9 = a.taylor_n_bound;
        if (d8 < d9) {
            return d8 <= (-d9) ? -asinh(-d8) : Math.abs(d8) >= a.taylor_2_bound ? d8 - (((d8 * d8) * d8) / 6) : d8;
        }
        if (d8 <= a.upper_taylor_n_bound) {
            return Math.log(d8 + Math.sqrt((d8 * d8) + 1));
        }
        if (d8 > a.upper_taylor_2_bound) {
            return Math.log(d8) + a.LN2;
        }
        double d10 = d8 * 2;
        return Math.log(d10 + (1 / d10));
    }

    private static final double atan(double d8) {
        return Math.atan(d8);
    }

    private static final double atan2(double d8, double d9) {
        return Math.atan2(d8, d9);
    }

    public static final double atanh(double d8) {
        if (Math.abs(d8) < a.taylor_n_bound) {
            return Math.abs(d8) > a.taylor_2_bound ? d8 + (((d8 * d8) * d8) / 3) : d8;
        }
        double d9 = 1;
        return Math.log((d9 + d8) / (d9 - d8)) / 2;
    }

    private static final double cbrt(double d8) {
        return Math.cbrt(d8);
    }

    private static final double ceil(double d8) {
        return Math.ceil(d8);
    }

    private static final double cos(double d8) {
        return Math.cos(d8);
    }

    private static final double cosh(double d8) {
        return Math.cosh(d8);
    }

    private static final double exp(double d8) {
        return Math.exp(d8);
    }

    private static final double expm1(double d8) {
        return Math.expm1(d8);
    }

    private static final double floor(double d8) {
        return Math.floor(d8);
    }

    private static final double getAbsoluteValue(double d8) {
        return Math.abs(d8);
    }

    public static /* synthetic */ void getAbsoluteValue$annotations(double d8) {
    }

    public static int getSign(int i8) {
        if (i8 < 0) {
            return -1;
        }
        return i8 > 0 ? 1 : 0;
    }

    public static /* synthetic */ void getSign$annotations(double d8) {
    }

    private static final double getUlp(double d8) {
        return Math.ulp(d8);
    }

    public static /* synthetic */ void getUlp$annotations(double d8) {
    }

    private static final double hypot(double d8, double d9) {
        return Math.hypot(d8, d9);
    }

    private static final double ln(double d8) {
        return Math.log(d8);
    }

    private static final double ln1p(double d8) {
        return Math.log1p(d8);
    }

    public static final double log(double d8, double d9) {
        if (d9 <= i.DOUBLE_EPSILON || d9 == 1.0d) {
            return Double.NaN;
        }
        return Math.log(d8) / Math.log(d9);
    }

    private static final double log10(double d8) {
        return Math.log10(d8);
    }

    public static final double log2(double d8) {
        return Math.log(d8) / a.LN2;
    }

    private static final double max(double d8, double d9) {
        return Math.max(d8, d9);
    }

    private static final double min(double d8, double d9) {
        return Math.min(d8, d9);
    }

    private static final double nextDown(double d8) {
        return Math.nextAfter(d8, Double.NEGATIVE_INFINITY);
    }

    private static final double nextTowards(double d8, double d9) {
        return Math.nextAfter(d8, d9);
    }

    private static final double nextUp(double d8) {
        return Math.nextUp(d8);
    }

    private static final double pow(double d8, double d9) {
        return Math.pow(d8, d9);
    }

    private static final double round(double d8) {
        return Math.rint(d8);
    }

    public static int roundToInt(double d8) {
        if (Double.isNaN(d8)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        if (d8 > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d8 < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d8);
    }

    public static long roundToLong(double d8) {
        if (Double.isNaN(d8)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(d8);
    }

    private static final double sign(double d8) {
        return Math.signum(d8);
    }

    private static final double sin(double d8) {
        return Math.sin(d8);
    }

    private static final double sinh(double d8) {
        return Math.sinh(d8);
    }

    private static final double sqrt(double d8) {
        return Math.sqrt(d8);
    }

    private static final double tan(double d8) {
        return Math.tan(d8);
    }

    private static final double tanh(double d8) {
        return Math.tanh(d8);
    }

    public static final double truncate(double d8) {
        return (Double.isNaN(d8) || Double.isInfinite(d8)) ? d8 : d8 > i.DOUBLE_EPSILON ? Math.floor(d8) : Math.ceil(d8);
    }

    private static final double withSign(double d8, double d9) {
        return Math.copySign(d8, d9);
    }

    private static final float IEEErem(float f8, float f9) {
        return (float) Math.IEEEremainder(f8, f9);
    }

    private static final float abs(float f8) {
        return Math.abs(f8);
    }

    private static final float acos(float f8) {
        return (float) Math.acos(f8);
    }

    private static final float asin(float f8) {
        return (float) Math.asin(f8);
    }

    private static final float atan(float f8) {
        return (float) Math.atan(f8);
    }

    private static final float atan2(float f8, float f9) {
        return (float) Math.atan2(f8, f9);
    }

    private static final float cbrt(float f8) {
        return (float) Math.cbrt(f8);
    }

    private static final float ceil(float f8) {
        return (float) Math.ceil(f8);
    }

    private static final float cos(float f8) {
        return (float) Math.cos(f8);
    }

    private static final float cosh(float f8) {
        return (float) Math.cosh(f8);
    }

    private static final float exp(float f8) {
        return (float) Math.exp(f8);
    }

    private static final float expm1(float f8) {
        return (float) Math.expm1(f8);
    }

    private static final float floor(float f8) {
        return (float) Math.floor(f8);
    }

    private static final float getAbsoluteValue(float f8) {
        return Math.abs(f8);
    }

    public static /* synthetic */ void getAbsoluteValue$annotations(float f8) {
    }

    public static int getSign(long j8) {
        if (j8 < 0) {
            return -1;
        }
        return j8 > 0 ? 1 : 0;
    }

    public static /* synthetic */ void getSign$annotations(float f8) {
    }

    private static final float getUlp(float f8) {
        return Math.ulp(f8);
    }

    public static /* synthetic */ void getUlp$annotations(float f8) {
    }

    private static final float hypot(float f8, float f9) {
        return (float) Math.hypot(f8, f9);
    }

    private static final float ln(float f8) {
        return (float) Math.log(f8);
    }

    private static final float ln1p(float f8) {
        return (float) Math.log1p(f8);
    }

    public static final float log(float f8, float f9) {
        if (f9 <= 0.0f || f9 == 1.0f) {
            return Float.NaN;
        }
        return (float) (Math.log(f8) / Math.log(f9));
    }

    private static final float log10(float f8) {
        return (float) Math.log10(f8);
    }

    public static final float log2(float f8) {
        return (float) (Math.log(f8) / a.LN2);
    }

    private static final float max(float f8, float f9) {
        return Math.max(f8, f9);
    }

    private static final float min(float f8, float f9) {
        return Math.min(f8, f9);
    }

    private static final float nextDown(float f8) {
        return Math.nextAfter(f8, Double.NEGATIVE_INFINITY);
    }

    private static final float nextTowards(float f8, float f9) {
        return Math.nextAfter(f8, f9);
    }

    private static final float nextUp(float f8) {
        return Math.nextUp(f8);
    }

    private static final double pow(double d8, int i8) {
        return Math.pow(d8, i8);
    }

    private static final float round(float f8) {
        return (float) Math.rint(f8);
    }

    public static final long roundToLong(float f8) {
        long roundToLong;
        roundToLong = roundToLong(f8);
        return roundToLong;
    }

    private static final float sign(float f8) {
        return Math.signum(f8);
    }

    private static final float sin(float f8) {
        return (float) Math.sin(f8);
    }

    private static final float sinh(float f8) {
        return (float) Math.sinh(f8);
    }

    private static final float sqrt(float f8) {
        return (float) Math.sqrt(f8);
    }

    private static final float tan(float f8) {
        return (float) Math.tan(f8);
    }

    private static final float tanh(float f8) {
        return (float) Math.tanh(f8);
    }

    private static final double withSign(double d8, int i8) {
        return Math.copySign(d8, i8);
    }

    private static final int abs(int i8) {
        return Math.abs(i8);
    }

    private static final int getAbsoluteValue(int i8) {
        return Math.abs(i8);
    }

    public static /* synthetic */ void getAbsoluteValue$annotations(int i8) {
    }

    private static final double getSign(double d8) {
        return Math.signum(d8);
    }

    public static /* synthetic */ void getSign$annotations(int i8) {
    }

    private static final int max(int i8, int i9) {
        return Math.max(i8, i9);
    }

    private static final int min(int i8, int i9) {
        return Math.min(i8, i9);
    }

    private static final float pow(float f8, float f9) {
        return (float) Math.pow(f8, f9);
    }

    private static final float withSign(float f8, float f9) {
        return Math.copySign(f8, f9);
    }

    private static final long abs(long j8) {
        return Math.abs(j8);
    }

    private static final float atanh(float f8) {
        return (float) atanh(f8);
    }

    private static final long getAbsoluteValue(long j8) {
        return Math.abs(j8);
    }

    public static /* synthetic */ void getAbsoluteValue$annotations(long j8) {
    }

    private static final float getSign(float f8) {
        return Math.signum(f8);
    }

    public static /* synthetic */ void getSign$annotations(long j8) {
    }

    private static final long max(long j8, long j9) {
        return Math.max(j8, j9);
    }

    private static final long min(long j8, long j9) {
        return Math.min(j8, j9);
    }

    private static final float pow(float f8, int i8) {
        return (float) Math.pow(f8, i8);
    }

    public static final int roundToInt(float f8) {
        if (Float.isNaN(f8)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f8);
    }

    public static final float truncate(float f8) {
        double ceil;
        if (Float.isNaN(f8) || Float.isInfinite(f8)) {
            return f8;
        }
        if (f8 > 0.0f) {
            ceil = Math.floor(f8);
        } else {
            ceil = Math.ceil(f8);
        }
        return (float) ceil;
    }

    private static final float withSign(float f8, int i8) {
        return Math.copySign(f8, i8);
    }

    private static final float acosh(float f8) {
        return (float) acosh(f8);
    }

    private static final float asinh(float f8) {
        return (float) asinh(f8);
    }
}
