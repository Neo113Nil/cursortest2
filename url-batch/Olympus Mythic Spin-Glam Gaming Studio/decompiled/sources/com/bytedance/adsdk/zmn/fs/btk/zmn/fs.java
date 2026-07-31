package com.bytedance.adsdk.zmn.fs.btk.zmn;

/* loaded from: classes13.dex */
public class fs {
    private static boolean zmn(int i, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return i == number.intValue();
        }
        if (number instanceof Long) {
            return ((long) i) == number.longValue();
        }
        if (number instanceof Float) {
            return ((float) i) == number.floatValue();
        }
        if (number instanceof Double) {
            return ((double) i) == number.doubleValue();
        }
        throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
    }

    private static boolean zmn(long j, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return j == ((long) number.intValue());
        }
        if (number instanceof Long) {
            return j == number.longValue();
        }
        if (number instanceof Float) {
            return ((float) j) == number.floatValue();
        }
        if (number instanceof Double) {
            return ((double) j) == number.doubleValue();
        }
        throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
    }

    private static boolean zmn(float f, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return f == ((float) number.intValue());
        }
        if (number instanceof Long) {
            return f == ((float) number.longValue());
        }
        if (number instanceof Float) {
            return f == number.floatValue();
        }
        if (number instanceof Double) {
            return ((double) f) == number.doubleValue();
        }
        throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
    }

    private static boolean zmn(double d, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return d == ((double) number.intValue());
        }
        if (number instanceof Long) {
            return d == ((double) number.longValue());
        }
        if (number instanceof Float) {
            return d == ((double) number.floatValue());
        }
        if (number instanceof Double) {
            return d == number.doubleValue();
        }
        throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
    }

    public static boolean zmn(Number number, Number number2) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return zmn(number.intValue(), number2);
        }
        if (number instanceof Long) {
            return zmn(number.longValue(), number2);
        }
        if (number instanceof Float) {
            return zmn(number.floatValue(), number2);
        }
        if (number instanceof Double) {
            return zmn(number.doubleValue(), number2);
        }
        throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
    }
}
