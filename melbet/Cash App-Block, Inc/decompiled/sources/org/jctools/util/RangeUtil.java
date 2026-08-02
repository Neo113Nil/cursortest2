package org.jctools.util;

/* loaded from: classes10.dex */
public abstract class RangeUtil {
    public static int checkGreaterThanOrEqual(int i, int i2, String str) {
        if (i >= i2) {
            return i;
        }
        throw new IllegalArgumentException(str + ": " + i + " (expected: >= " + i2 + ')');
    }
}
