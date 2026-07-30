package kotlin.text;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;

/* loaded from: classes3.dex */
class r extends q {
    private static final <T> T screenFloatValue$StringsKt__StringNumberConversionsJVMKt(String str, f6.l lVar) {
        try {
            if (k.value.matches(str)) {
                return (T) lVar.invoke(str);
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static final BigDecimal toBigDecimal(String str) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        return new BigDecimal(str);
    }

    public static final BigDecimal toBigDecimalOrNull(String str) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        try {
            if (k.value.matches(str)) {
                return new BigDecimal(str);
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static final BigInteger toBigInteger(String str) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        return new BigInteger(str);
    }

    public static final BigInteger toBigIntegerOrNull(String str) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        return toBigIntegerOrNull(str, 10);
    }

    private static final boolean toBoolean(String str) {
        return Boolean.parseBoolean(str);
    }

    private static final byte toByte(String str) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        return Byte.parseByte(str);
    }

    private static final double toDouble(String str) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        return Double.parseDouble(str);
    }

    public static final Double toDoubleOrNull(String str) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        try {
            if (k.value.matches(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static final float toFloat(String str) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        return Float.parseFloat(str);
    }

    public static final Float toFloatOrNull(String str) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        try {
            if (k.value.matches(str)) {
                return Float.valueOf(Float.parseFloat(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static final int toInt(String str) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        return Integer.parseInt(str);
    }

    private static final long toLong(String str) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        return Long.parseLong(str);
    }

    private static final short toShort(String str) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        return Short.parseShort(str);
    }

    private static final String toString(byte b8, int i8) {
        int checkRadix;
        int checkRadix2;
        checkRadix = b.checkRadix(i8);
        checkRadix2 = b.checkRadix(checkRadix);
        String num = Integer.toString(b8, checkRadix2);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(num, "toString(this, checkRadix(radix))");
        return num;
    }

    private static final BigDecimal toBigDecimal(String str, MathContext mathContext) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(mathContext, "mathContext");
        return new BigDecimal(str, mathContext);
    }

    private static final BigInteger toBigInteger(String str, int i8) {
        int checkRadix;
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        checkRadix = b.checkRadix(i8);
        return new BigInteger(str, checkRadix);
    }

    public static final BigInteger toBigIntegerOrNull(String str, int i8) {
        int checkRadix;
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        b.checkRadix(i8);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        if (length != 1) {
            for (int i9 = str.charAt(0) == '-' ? 1 : 0; i9 < length; i9++) {
                if (b.digitOf(str.charAt(i9), i8) < 0) {
                    return null;
                }
            }
        } else if (b.digitOf(str.charAt(0), i8) < 0) {
            return null;
        }
        checkRadix = b.checkRadix(i8);
        return new BigInteger(str, checkRadix);
    }

    private static final byte toByte(String str, int i8) {
        int checkRadix;
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        checkRadix = b.checkRadix(i8);
        return Byte.parseByte(str, checkRadix);
    }

    private static final int toInt(String str, int i8) {
        int checkRadix;
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        checkRadix = b.checkRadix(i8);
        return Integer.parseInt(str, checkRadix);
    }

    private static final long toLong(String str, int i8) {
        int checkRadix;
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        checkRadix = b.checkRadix(i8);
        return Long.parseLong(str, checkRadix);
    }

    private static final short toShort(String str, int i8) {
        int checkRadix;
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        checkRadix = b.checkRadix(i8);
        return Short.parseShort(str, checkRadix);
    }

    private static final String toString(short s7, int i8) {
        int checkRadix;
        int checkRadix2;
        checkRadix = b.checkRadix(i8);
        checkRadix2 = b.checkRadix(checkRadix);
        String num = Integer.toString(s7, checkRadix2);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(num, "toString(this, checkRadix(radix))");
        return num;
    }

    private static final String toString(int i8, int i9) {
        int checkRadix;
        checkRadix = b.checkRadix(i9);
        String num = Integer.toString(i8, checkRadix);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(num, "toString(this, checkRadix(radix))");
        return num;
    }

    public static final BigDecimal toBigDecimalOrNull(String str, MathContext mathContext) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(mathContext, "mathContext");
        try {
            if (k.value.matches(str)) {
                return new BigDecimal(str, mathContext);
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static final String toString(long j8, int i8) {
        int checkRadix;
        checkRadix = b.checkRadix(i8);
        String l8 = Long.toString(j8, checkRadix);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(l8, "toString(this, checkRadix(radix))");
        return l8;
    }
}
