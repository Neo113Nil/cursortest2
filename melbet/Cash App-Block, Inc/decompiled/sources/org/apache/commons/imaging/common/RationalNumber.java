package org.apache.commons.imaging.common;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.text.NumberFormat;

/* loaded from: classes9.dex */
public class RationalNumber extends Number {
    private static final double TOLERANCE = 1.0E-8d;
    private static final long serialVersionUID = -8412262656468158691L;
    public final int divisor;
    public final int numerator;

    public static final class Option {
        public final double error;
        public final RationalNumber rationalNumber;

        private Option(RationalNumber rationalNumber, double d) {
            this.rationalNumber = rationalNumber;
            this.error = d;
        }

        public static Option factory(RationalNumber rationalNumber, double d) {
            return new Option(rationalNumber, Math.abs(rationalNumber.doubleValue() - d));
        }

        public String toString() {
            return this.rationalNumber.toString();
        }
    }

    public RationalNumber(int i, int i2) {
        this.numerator = i;
        this.divisor = i2;
    }

    public static RationalNumber factoryMethod(long j, long j2) {
        if (j > 2147483647L || j < -2147483648L || j2 > 2147483647L || j2 < -2147483648L) {
            while (true) {
                if ((j > 2147483647L || j < -2147483648L || j2 > 2147483647L || j2 < -2147483648L) && Math.abs(j) > 1 && Math.abs(j2) > 1) {
                    j >>= 1;
                    j2 >>= 1;
                }
            }
            if (j2 == 0) {
                StringBuilder m1149m = Boxes$$ExternalSyntheticOutline1.m1149m(j, "Invalid value, numerator: ", ", divisor: ");
                m1149m.append(j2);
                throw new NumberFormatException(m1149m.toString());
            }
        }
        long gcd = gcd(j, j2);
        return new RationalNumber((int) (j / gcd), (int) (j2 / gcd));
    }

    private static long gcd(long j, long j2) {
        return j2 == 0 ? j : gcd(j2, j % j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static RationalNumber valueOf(double d) {
        boolean z;
        RationalNumber rationalNumber;
        RationalNumber rationalNumber2;
        RationalNumber rationalNumber3;
        if (d >= 2.147483647E9d) {
            return new RationalNumber(Integer.MAX_VALUE, 1);
        }
        if (d <= -2.147483647E9d) {
            return new RationalNumber(-2147483647, 1);
        }
        if (d < 0.0d) {
            d = Math.abs(d);
            z = true;
        } else {
            z = false;
        }
        if (d == 0.0d) {
            return new RationalNumber(0, 1);
        }
        if (d >= 1.0d) {
            int i = (int) d;
            if (i < d) {
                rationalNumber = new RationalNumber(i, 1);
                rationalNumber3 = new RationalNumber(i + 1, 1);
            } else {
                rationalNumber = new RationalNumber(i - 1, 1);
                rationalNumber3 = new RationalNumber(i, 1);
            }
        } else {
            int i2 = (int) (1.0d / d);
            if (1.0d / i2 < d) {
                rationalNumber = new RationalNumber(1, i2);
                rationalNumber2 = new RationalNumber(1, i2 - 1);
            } else {
                rationalNumber = new RationalNumber(1, i2 + 1);
                rationalNumber2 = new RationalNumber(1, i2);
            }
            rationalNumber3 = rationalNumber2;
        }
        Option factory = Option.factory(rationalNumber, d);
        Option factory2 = Option.factory(rationalNumber3, d);
        Option option = factory.error < factory2.error ? factory : factory2;
        for (int i3 = 0; option.error > TOLERANCE && i3 < 100; i3++) {
            long j = factory.rationalNumber.numerator;
            RationalNumber rationalNumber4 = factory2.rationalNumber;
            RationalNumber factoryMethod = factoryMethod(j + rationalNumber4.numerator, r5.divisor + rationalNumber4.divisor);
            Option factory3 = Option.factory(factoryMethod, d);
            if (d < factoryMethod.doubleValue()) {
                if (factory2.error <= factory3.error) {
                    break;
                }
                factory2 = factory3;
                if (factory3.error >= option.error) {
                    option = factory3;
                }
            } else {
                if (factory.error <= factory3.error) {
                    break;
                }
                factory = factory3;
                if (factory3.error >= option.error) {
                }
            }
        }
        RationalNumber rationalNumber5 = option.rationalNumber;
        return z ? rationalNumber5.negate() : rationalNumber5;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return this.numerator / this.divisor;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return this.numerator / this.divisor;
    }

    @Override // java.lang.Number
    public int intValue() {
        return this.numerator / this.divisor;
    }

    @Override // java.lang.Number
    public long longValue() {
        return this.numerator / this.divisor;
    }

    public RationalNumber negate() {
        return new RationalNumber(-this.numerator, this.divisor);
    }

    public String toDisplayString() {
        int i = this.numerator;
        int i2 = this.divisor;
        if (i % i2 == 0) {
            return Integer.toString(i / i2);
        }
        NumberFormat numberFormat = NumberFormat.getInstance();
        numberFormat.setMaximumFractionDigits(3);
        return numberFormat.format(this.numerator / this.divisor);
    }

    public String toString() {
        if (this.divisor == 0) {
            StringBuilder sb = new StringBuilder("Invalid rational (");
            sb.append(this.numerator);
            sb.append("/");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.divisor, ")", sb);
        }
        NumberFormat numberFormat = NumberFormat.getInstance();
        if (this.numerator % this.divisor == 0) {
            return numberFormat.format(r3 / r4);
        }
        return this.numerator + "/" + this.divisor + " (" + numberFormat.format(this.numerator / this.divisor) + ")";
    }
}
