package n2;

import S1.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import k2.C0572d;

/* renamed from: n2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0730j extends AbstractC0737q {
    public static boolean B(CharSequence charSequence, char c2) {
        f2.j.f(charSequence, "<this>");
        return H(charSequence, c2, 0, false, 2) >= 0;
    }

    public static boolean C(CharSequence charSequence, String str) {
        f2.j.f(charSequence, "<this>");
        f2.j.f(str, "other");
        return I(charSequence, str, 0, false, 2) >= 0;
    }

    public static String D(String str, int i3) {
        f2.j.f(str, "<this>");
        if (i3 < 0) {
            throw new IllegalArgumentException(A.k.g(i3, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i3 > length) {
            i3 = length;
        }
        String substring = str.substring(i3);
        f2.j.e(substring, "substring(...)");
        return substring;
    }

    public static boolean E(CharSequence charSequence, String str) {
        return charSequence instanceof String ? AbstractC0737q.r((String) charSequence, str, false) : P(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    public static int F(CharSequence charSequence) {
        f2.j.f(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int G(CharSequence charSequence, String str, int i3, boolean z3) {
        f2.j.f(charSequence, "<this>");
        f2.j.f(str, "string");
        if (!z3 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i3);
        }
        int length = charSequence.length();
        if (i3 < 0) {
            i3 = 0;
        }
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        C0572d c0572d = new C0572d(i3, length, 1);
        boolean z4 = charSequence instanceof String;
        int i4 = c0572d.f6421f;
        int i5 = c0572d.f6420e;
        int i6 = c0572d.f6419d;
        if (!z4 || str == null) {
            if ((i4 > 0 && i6 <= i5) || (i4 < 0 && i5 <= i6)) {
                while (!P(str, 0, charSequence, i6, str.length(), z3)) {
                    if (i6 != i5) {
                        i6 += i4;
                    }
                }
                return i6;
            }
            return -1;
        }
        if ((i4 > 0 && i6 <= i5) || (i4 < 0 && i5 <= i6)) {
            while (!AbstractC0737q.u(str, 0, (String) charSequence, i6, str.length(), z3)) {
                if (i6 != i5) {
                    i6 += i4;
                }
            }
            return i6;
        }
        return -1;
    }

    public static int H(CharSequence charSequence, char c2, int i3, boolean z3, int i4) {
        if ((i4 & 2) != 0) {
            i3 = 0;
        }
        if ((i4 & 4) != 0) {
            z3 = false;
        }
        f2.j.f(charSequence, "<this>");
        return (z3 || !(charSequence instanceof String)) ? J(charSequence, new char[]{c2}, i3, z3) : ((String) charSequence).indexOf(c2, i3);
    }

    public static /* synthetic */ int I(CharSequence charSequence, String str, int i3, boolean z3, int i4) {
        if ((i4 & 2) != 0) {
            i3 = 0;
        }
        if ((i4 & 4) != 0) {
            z3 = false;
        }
        return G(charSequence, str, i3, z3);
    }

    public static final int J(CharSequence charSequence, char[] cArr, int i3, boolean z3) {
        f2.j.f(charSequence, "<this>");
        if (!z3 && cArr.length == 1 && (charSequence instanceof String)) {
            int length = cArr.length;
            if (length == 0) {
                throw new NoSuchElementException("Array is empty.");
            }
            if (length != 1) {
                throw new IllegalArgumentException("Array has more than one element.");
            }
            return ((String) charSequence).indexOf(cArr[0], i3);
        }
        if (i3 < 0) {
            i3 = 0;
        }
        int F3 = F(charSequence);
        if (i3 > F3) {
            return -1;
        }
        while (true) {
            char charAt = charSequence.charAt(i3);
            for (char c2 : cArr) {
                if (n.r.j(c2, charAt, z3)) {
                    return i3;
                }
            }
            if (i3 == F3) {
                return -1;
            }
            i3++;
        }
    }

    public static boolean K(CharSequence charSequence) {
        f2.j.f(charSequence, "<this>");
        for (int i3 = 0; i3 < charSequence.length(); i3++) {
            if (!n.r.n(charSequence.charAt(i3))) {
                return false;
            }
        }
        return true;
    }

    public static char L(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            return charSequence.charAt(F(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static int M(int i3, String str, String str2) {
        int F3 = (i3 & 2) != 0 ? F(str) : 0;
        f2.j.f(str, "<this>");
        f2.j.f(str2, "string");
        return str.lastIndexOf(str2, F3);
    }

    public static int N(String str, char c2, int i3, int i4) {
        if ((i4 & 2) != 0) {
            i3 = F(str);
        }
        f2.j.f(str, "<this>");
        return str.lastIndexOf(c2, i3);
    }

    public static final List O(String str) {
        f2.j.f(str, "<this>");
        S(0);
        return m2.h.V(new m2.k(new C0723c(str, 0, 0, new C0738r(1, S1.k.h0(new String[]{"\r\n", "\n", "\r"}), false)), new A0.m(str, 4), 1));
    }

    public static final boolean P(CharSequence charSequence, int i3, CharSequence charSequence2, int i4, int i5, boolean z3) {
        f2.j.f(charSequence, "<this>");
        f2.j.f(charSequence2, "other");
        if (i4 < 0 || i3 < 0 || i3 > charSequence.length() - i5 || i4 > charSequence2.length() - i5) {
            return false;
        }
        for (int i6 = 0; i6 < i5; i6++) {
            if (!n.r.j(charSequence.charAt(i3 + i6), charSequence2.charAt(i4 + i6), z3)) {
                return false;
            }
        }
        return true;
    }

    public static String Q(String str, String str2) {
        f2.j.f(str, "<this>");
        if (!AbstractC0737q.z(str, str2)) {
            return str;
        }
        String substring = str.substring(str2.length());
        f2.j.e(substring, "substring(...)");
        return substring;
    }

    public static String R(String str, String str2) {
        if (!E(str, str2)) {
            return str;
        }
        String substring = str.substring(0, str.length() - str2.length());
        f2.j.e(substring, "substring(...)");
        return substring;
    }

    public static final void S(int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException(A.k.h("Limit must be non-negative, but was ", i3).toString());
        }
    }

    public static List T(String str, char[] cArr) {
        f2.j.f(str, "<this>");
        boolean z3 = false;
        if (cArr.length == 1) {
            String valueOf = String.valueOf(cArr[0]);
            S(0);
            int G3 = G(str, valueOf, 0, false);
            if (G3 == -1) {
                return O2.l.l0(str.toString());
            }
            ArrayList arrayList = new ArrayList(10);
            int i3 = 0;
            do {
                arrayList.add(str.subSequence(i3, G3).toString());
                i3 = valueOf.length() + G3;
                G3 = G(str, valueOf, i3, false);
            } while (G3 != -1);
            arrayList.add(str.subSequence(i3, str.length()).toString());
            return arrayList;
        }
        S(0);
        y yVar = new y(1, new C0723c(str, 0, 0, new C0738r(0, cArr, z3)));
        ArrayList arrayList2 = new ArrayList(S1.n.E0(yVar, 10));
        Iterator it = yVar.iterator();
        while (true) {
            C0722b c0722b = (C0722b) it;
            if (!c0722b.hasNext()) {
                return arrayList2;
            }
            C0572d c0572d = (C0572d) c0722b.next();
            f2.j.f(c0572d, "range");
            arrayList2.add(str.subSequence(c0572d.f6419d, c0572d.f6420e + 1).toString());
        }
    }

    public static String U(String str, char c2, String str2) {
        f2.j.f(str2, "missingDelimiterValue");
        int H3 = H(str, c2, 0, false, 6);
        if (H3 == -1) {
            return str2;
        }
        String substring = str.substring(H3 + 1, str.length());
        f2.j.e(substring, "substring(...)");
        return substring;
    }

    public static String V(String str, String str2) {
        f2.j.f(str2, "delimiter");
        int I3 = I(str, str2, 0, false, 6);
        if (I3 == -1) {
            return str;
        }
        String substring = str.substring(str2.length() + I3, str.length());
        f2.j.e(substring, "substring(...)");
        return substring;
    }

    public static String W(String str, String str2) {
        f2.j.f(str, "<this>");
        f2.j.f(str2, "missingDelimiterValue");
        int N3 = N(str, '.', 0, 6);
        if (N3 == -1) {
            return str2;
        }
        String substring = str.substring(N3 + 1, str.length());
        f2.j.e(substring, "substring(...)");
        return substring;
    }

    public static String X(String str, int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException(A.k.g(i3, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i3 > length) {
            i3 = length;
        }
        String substring = str.substring(0, i3);
        f2.j.e(substring, "substring(...)");
        return substring;
    }

    public static CharSequence Y(CharSequence charSequence) {
        f2.j.f(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i3 = 0;
        boolean z3 = false;
        while (i3 <= length) {
            boolean n3 = n.r.n(charSequence.charAt(!z3 ? i3 : length));
            if (z3) {
                if (!n3) {
                    break;
                }
                length--;
            } else if (n3) {
                i3++;
            } else {
                z3 = true;
            }
        }
        return charSequence.subSequence(i3, length + 1);
    }
}
