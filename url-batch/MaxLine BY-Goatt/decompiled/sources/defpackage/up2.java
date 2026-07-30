package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.ranges.IntRange;
import kotlin.text.CharsKt;
import kotlin.text.a;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class up2 extends tp2 {
    public static String A(int i, String str) {
        CharSequence charSequence;
        str.getClass();
        if (i < 0) {
            lh.e(in1.l(i, "Desired length ", " is less than zero."));
            return null;
        }
        if (i <= str.length()) {
            charSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            int length = i - str.length();
            int i2 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append('0');
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            sb.append((CharSequence) str);
            charSequence = sb;
        }
        return charSequence.toString();
    }

    public static final boolean B(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        charSequence.getClass();
        charSequence2.getClass();
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!a.a(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static String C(String str, String str2) {
        return tp2.o(str, str2, false) ? str.substring(str2.length()) : str;
    }

    public static final void D(int i) {
        if (i >= 0) {
            return;
        }
        lh.c(in1.k(i, "Limit must be non-negative, but was "));
    }

    public static final List E(CharSequence charSequence, String str, int i) {
        D(i);
        int u = u(charSequence, str, 0, false);
        if (u == -1 || i == 1) {
            return pv.c(charSequence.toString());
        }
        boolean z = i > 0;
        int i2 = 10;
        if (z && i <= 10) {
            i2 = i;
        }
        ArrayList arrayList = new ArrayList(i2);
        int i3 = 0;
        do {
            arrayList.add(charSequence.subSequence(i3, u).toString());
            i3 = str.length() + u;
            if (z && arrayList.size() == i - 1) {
                break;
            }
            u = u(charSequence, str, i3, false);
        } while (u != -1);
        arrayList.add(charSequence.subSequence(i3, charSequence.length()).toString());
        return arrayList;
    }

    public static List F(int i, int i2, String str, String[] strArr) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        str.getClass();
        if (strArr.length == 1) {
            String str2 = strArr[0];
            if (str2.length() != 0) {
                return E(str, str2, i);
            }
        }
        D(i);
        List asList = Arrays.asList(strArr);
        asList.getClass();
        cj2 cj2Var = new cj2(new aa0(str, i, new pu0(3, asList)));
        ArrayList arrayList = new ArrayList(rv.l(cj2Var, 10));
        Iterator it = cj2Var.iterator();
        while (true) {
            z90 z90Var = (z90) it;
            if (!z90Var.hasNext()) {
                return arrayList;
            }
            IntRange intRange = (IntRange) z90Var.next();
            intRange.getClass();
            arrayList.add(str.subSequence(intRange.m, intRange.n + 1).toString());
        }
    }

    public static List G(String str, char[] cArr) {
        str.getClass();
        if (cArr.length == 1) {
            return E(str, String.valueOf(cArr[0]), 0);
        }
        D(0);
        cj2 cj2Var = new cj2(new aa0(str, 0, new ia(9, cArr)));
        ArrayList arrayList = new ArrayList(rv.l(cj2Var, 10));
        Iterator it = cj2Var.iterator();
        while (true) {
            z90 z90Var = (z90) it;
            if (!z90Var.hasNext()) {
                return arrayList;
            }
            IntRange intRange = (IntRange) z90Var.next();
            intRange.getClass();
            arrayList.add(str.subSequence(intRange.m, intRange.n + 1).toString());
        }
    }

    public static String H(String str, String str2) {
        int w = w(str, str2, 0, 6);
        return w == -1 ? str : str.substring(str2.length() + w, str.length());
    }

    public static String I(String str, char c, String str2) {
        str.getClass();
        int z = z(str, c, 0, 6);
        return z == -1 ? str2 : str.substring(z + 1, str.length());
    }

    public static String J(String str, char c) {
        str.getClass();
        str.getClass();
        int z = z(str, c, 0, 6);
        return z == -1 ? str : str.substring(0, z);
    }

    public static CharSequence K(String str) {
        str.getClass();
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean b = CharsKt.b(str.charAt(!z ? i : length));
            if (z) {
                if (!b) {
                    break;
                }
                length--;
            } else if (b) {
                i++;
            } else {
                z = true;
            }
        }
        return str.subSequence(i, length + 1);
    }

    public static boolean p(CharSequence charSequence, char c) {
        charSequence.getClass();
        return v(charSequence, c, 0, 2) >= 0;
    }

    public static boolean q(CharSequence charSequence, String str) {
        charSequence.getClass();
        str.getClass();
        return w(charSequence, str, 0, 2) >= 0;
    }

    public static boolean r(CharSequence charSequence, String str) {
        return charSequence instanceof String ? tp2.h((String) charSequence, str, false) : B(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    public static boolean s(String str, char c) {
        str.getClass();
        return str.length() > 0 && a.a(str.charAt(str.length() - 1), c, false);
    }

    public static final int t(CharSequence charSequence) {
        charSequence.getClass();
        return charSequence.length() - 1;
    }

    public static final int u(CharSequence charSequence, String str, int i, boolean z) {
        charSequence.getClass();
        str.getClass();
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        int length = charSequence.length();
        if (i < 0) {
            i = 0;
        }
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        IntRange intRange = new IntRange(i, length, 1);
        boolean z2 = charSequence instanceof String;
        int i2 = intRange.o;
        int i3 = intRange.n;
        int i4 = intRange.m;
        if (!z2 || !(str instanceof String)) {
            boolean z3 = z;
            if ((i2 > 0 && i4 <= i3) || (i2 < 0 && i3 <= i4)) {
                while (true) {
                    CharSequence charSequence2 = charSequence;
                    boolean z4 = z3;
                    int i5 = i4;
                    if (!B(str, 0, charSequence2, i5, str.length(), z4)) {
                        if (i5 == i3) {
                            break;
                        }
                        i4 = i5 + i2;
                        charSequence = charSequence2;
                        z3 = z4;
                    } else {
                        return i5;
                    }
                }
            }
        } else if ((i2 > 0 && i4 <= i3) || (i2 < 0 && i3 <= i4)) {
            int i6 = i4;
            while (true) {
                String str2 = str;
                boolean z5 = z;
                if (!tp2.j(0, i6, str.length(), str2, (String) charSequence, z5)) {
                    if (i6 == i3) {
                        break;
                    }
                    i6 += i2;
                    str = str2;
                    z = z5;
                } else {
                    return i6;
                }
            }
        }
        return -1;
    }

    public static int v(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        charSequence.getClass();
        return !(charSequence instanceof String) ? x(charSequence, new char[]{c}, i, false) : ((String) charSequence).indexOf(c, i);
    }

    public static /* synthetic */ int w(CharSequence charSequence, String str, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return u(charSequence, str, i, false);
    }

    public static final int x(CharSequence charSequence, char[] cArr, int i, boolean z) {
        charSequence.getClass();
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(oi.w(cArr), i);
        }
        if (i < 0) {
            i = 0;
        }
        int length = charSequence.length() - 1;
        if (i > length) {
            return -1;
        }
        while (true) {
            char charAt = charSequence.charAt(i);
            for (char c : cArr) {
                if (a.a(c, charAt, z)) {
                    return i;
                }
            }
            if (i == length) {
                return -1;
            }
            i++;
        }
    }

    public static boolean y(CharSequence charSequence) {
        charSequence.getClass();
        for (int i = 0; i < charSequence.length(); i++) {
            if (!CharsKt.b(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static int z(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = t(charSequence);
        }
        charSequence.getClass();
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c, i);
        }
        char[] cArr = {c};
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(oi.w(cArr), i);
        }
        int length = charSequence.length() - 1;
        if (i > length) {
            i = length;
        }
        while (-1 < i) {
            if (a.a(cArr[0], charSequence.charAt(i), false)) {
                return i;
            }
            i--;
        }
        return -1;
    }
}
