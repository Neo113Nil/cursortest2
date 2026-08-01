package o1;

import h.AbstractC0112a;

/* loaded from: classes.dex */
public abstract class k extends j {
    public static Integer t(String str) {
        boolean z2;
        int i;
        int i2;
        h1.d.e(str, "<this>");
        AbstractC0112a.c(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i3 = 0;
        char charAt = str.charAt(0);
        int i4 = -2147483647;
        if (h1.d.f(charAt, 48) < 0) {
            i = 1;
            if (length == 1) {
                return null;
            }
            if (charAt == '+') {
                z2 = false;
            } else {
                if (charAt != '-') {
                    return null;
                }
                i4 = Integer.MIN_VALUE;
                z2 = true;
            }
        } else {
            z2 = false;
            i = 0;
        }
        int i5 = -59652323;
        while (i < length) {
            int digit = Character.digit((int) str.charAt(i), 10);
            if (digit < 0) {
                return null;
            }
            if ((i3 < i5 && (i5 != -59652323 || i3 < (i5 = i4 / 10))) || (i2 = i3 * 10) < i4 + digit) {
                return null;
            }
            i3 = i2 - digit;
            i++;
        }
        return z2 ? Integer.valueOf(i3) : Integer.valueOf(-i3);
    }
}
