package X0;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class j extends h {
    public static boolean O(String str, String str2) {
        return Q(0, 2, str, str2, false) >= 0;
    }

    public static final int P(CharSequence charSequence) {
        Q0.h.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static int Q(int i2, int i3, CharSequence charSequence, String str, boolean z2) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            z2 = false;
        }
        Q0.h.e(charSequence, "<this>");
        Q0.h.e(str, "string");
        if (!z2 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i2);
        }
        int length = charSequence.length();
        if (i2 < 0) {
            i2 = 0;
        }
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        U0.c cVar = new U0.c(i2, length, 1);
        boolean z3 = charSequence instanceof String;
        int i4 = cVar.f1089g;
        int i5 = cVar.f1088f;
        int i6 = cVar.f1087e;
        if (z3 && (str instanceof String)) {
            if ((i4 > 0 && i6 <= i5) || (i4 < 0 && i5 <= i6)) {
                while (!S(str, (String) charSequence, i6, str.length(), z2)) {
                    if (i6 != i5) {
                        i6 += i4;
                    }
                }
                return i6;
            }
            return -1;
        }
        if ((i4 > 0 && i6 <= i5) || (i4 < 0 && i5 <= i6)) {
            while (!T(i6, str.length(), charSequence, str, z2)) {
                if (i6 != i5) {
                    i6 += i4;
                }
            }
            return i6;
        }
        return -1;
    }

    public static boolean R(CharSequence charSequence) {
        Q0.h.e(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return true;
        }
        Iterable cVar = new U0.c(0, charSequence.length() - 1, 1);
        if ((cVar instanceof Collection) && ((Collection) cVar).isEmpty()) {
            return true;
        }
        Iterator it = cVar.iterator();
        while (((U0.b) it).f1092g) {
            char charAt = charSequence.charAt(((U0.b) it).a());
            if (!Character.isWhitespace(charAt) && !Character.isSpaceChar(charAt)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean S(String str, String str2, int i2, int i3, boolean z2) {
        Q0.h.e(str, "<this>");
        Q0.h.e(str2, "other");
        return !z2 ? str.regionMatches(0, str2, i2, i3) : str.regionMatches(z2, 0, str2, i2, i3);
    }

    public static final boolean T(int i2, int i3, CharSequence charSequence, String str, boolean z2) {
        char upperCase;
        char upperCase2;
        Q0.h.e(str, "<this>");
        Q0.h.e(charSequence, "other");
        if (i2 < 0 || str.length() - i3 < 0 || i2 > charSequence.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            char charAt = str.charAt(i4);
            char charAt2 = charSequence.charAt(i2 + i4);
            if (charAt != charAt2 && (!z2 || ((upperCase = Character.toUpperCase(charAt)) != (upperCase2 = Character.toUpperCase(charAt2)) && Character.toLowerCase(upperCase) != Character.toLowerCase(upperCase2)))) {
                return false;
            }
        }
        return true;
    }

    public static String U(String str, String str2) {
        Q0.h.e(str2, "delimiter");
        int Q2 = Q(0, 6, str, str2, false);
        if (Q2 == -1) {
            return str;
        }
        String substring = str.substring(str2.length() + Q2, str.length());
        Q0.h.d(substring, "substring(...)");
        return substring;
    }

    public static String V(String str, String str2) {
        Q0.h.e(str, "<this>");
        Q0.h.e(str2, "missingDelimiterValue");
        int lastIndexOf = str.lastIndexOf(46, P(str));
        if (lastIndexOf == -1) {
            return str2;
        }
        String substring = str.substring(lastIndexOf + 1, str.length());
        Q0.h.d(substring, "substring(...)");
        return substring;
    }
}
