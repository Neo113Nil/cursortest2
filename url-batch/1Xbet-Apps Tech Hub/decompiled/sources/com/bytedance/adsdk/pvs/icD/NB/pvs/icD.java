package com.bytedance.adsdk.pvs.icD.NB.pvs;

/* compiled from: EqUtil.java */
/* loaded from: classes.dex */
public class icD {
    private static boolean pvs(int i, Number number) {
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

    private static boolean pvs(long j, Number number) {
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

    private static boolean pvs(float f, Number number) {
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

    private static boolean pvs(double d, Number number) {
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

    public static boolean pvs(Number number, Number number2) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return pvs(number.intValue(), number2);
        }
        if (number instanceof Long) {
            return pvs(number.longValue(), number2);
        }
        if (number instanceof Float) {
            return pvs(number.floatValue(), number2);
        }
        if (number instanceof Double) {
            return pvs(number.doubleValue(), number2);
        }
        throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
    }
}
