package com.bytedance.adsdk.zmn.fs.btk.zmn;

/* loaded from: classes15.dex */
public class nps {
    private static Object zmn(int i, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Integer.valueOf(i * number.intValue());
        }
        if (number instanceof Long) {
            return Long.valueOf(i * number.longValue());
        }
        if (number instanceof Float) {
            return Float.valueOf(i * number.floatValue());
        }
        if (number instanceof Double) {
            return Double.valueOf(i * number.doubleValue());
        }
        throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
    }

    private static Object zmn(long j, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Long.valueOf(j * number.intValue());
        }
        if (number instanceof Long) {
            return Long.valueOf(j * number.longValue());
        }
        if (number instanceof Float) {
            return Float.valueOf(j * number.floatValue());
        }
        if (number instanceof Double) {
            return Double.valueOf(j * number.doubleValue());
        }
        throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
    }

    private static Object zmn(float f, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Float.valueOf(f * number.intValue());
        }
        if (number instanceof Long) {
            return Float.valueOf(f * number.longValue());
        }
        if (number instanceof Float) {
            return Float.valueOf(f * number.floatValue());
        }
        if (number instanceof Double) {
            return Double.valueOf(f * number.doubleValue());
        }
        throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
    }

    private static Object zmn(double d, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Double.valueOf(d * number.intValue());
        }
        if (number instanceof Long) {
            return Double.valueOf(d * number.longValue());
        }
        if (number instanceof Float) {
            return Double.valueOf(d * number.floatValue());
        }
        if (number instanceof Double) {
            return Double.valueOf(d * number.doubleValue());
        }
        throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
    }

    public static Object zmn(Number number, Number number2) {
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
