package x2;

import a.AbstractC0124a;
import i2.AbstractC0457a;
import java.math.RoundingMode;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f15984a = 0;

    static {
        Math.log(2.0d);
    }

    public static boolean a(double d4) {
        if (V3.b.s(d4)) {
            return d4 == 0.0d || 52 - Long.numberOfTrailingZeros(V3.b.r(d4)) <= Math.getExponent(d4);
        }
        return false;
    }

    public static boolean b(double d4) {
        if (d4 > 0.0d && V3.b.s(d4)) {
            long r4 = V3.b.r(d4);
            if ((r4 & (r4 - 1)) == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int c(double d4) {
        boolean b4;
        RoundingMode roundingMode = RoundingMode.CEILING;
        AbstractC0124a.g("x must be positive and finite", d4 > 0.0d && V3.b.s(d4));
        int exponent = Math.getExponent(d4);
        if (Math.getExponent(d4) < -1022) {
            return c(d4 * 4.503599627370496E15d) - 52;
        }
        switch (b.f15983a[roundingMode.ordinal()]) {
            case 1:
                AbstractC0457a.e(b(d4));
                return !r2 ? exponent + 1 : exponent;
            case 2:
                if (!r2) {
                }
                break;
            case 3:
                r2 = !b(d4);
                if (!r2) {
                }
                break;
            case 4:
                r2 = exponent < 0;
                b4 = b(d4);
                r2 &= !b4;
                if (!r2) {
                }
                break;
            case 5:
                r2 = exponent >= 0;
                b4 = b(d4);
                r2 &= !b4;
                if (!r2) {
                }
                break;
            case 6:
            case 7:
            case 8:
                double longBitsToDouble = Double.longBitsToDouble((Double.doubleToRawLongBits(d4) & 4503599627370495L) | 4607182418800017408L);
                if (longBitsToDouble * longBitsToDouble > 2.0d) {
                    r2 = true;
                }
                if (!r2) {
                }
                break;
            default:
                throw new AssertionError();
        }
    }
}
