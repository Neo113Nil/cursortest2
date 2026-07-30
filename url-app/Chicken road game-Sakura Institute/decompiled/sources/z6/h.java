package z6;

import e6.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import s1.l0;

/* loaded from: classes.dex */
public abstract class h extends o {
    public static boolean A(CharSequence charSequence, String str) {
        return charSequence instanceof String ? o.o(false, (String) charSequence, str) : M(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    public static int B(CharSequence charSequence) {
        r6.k.f(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int C(CharSequence charSequence, String str, int i7, boolean z8) {
        r6.k.f(charSequence, "<this>");
        r6.k.f(str, "string");
        if (!z8 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i7);
        }
        int length = charSequence.length();
        int i8 = i7 < 0 ? 0 : i7;
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        w6.d dVar = new w6.d(i8, length, 1);
        boolean z9 = charSequence instanceof String;
        int i9 = dVar.f9523h;
        int i10 = dVar.f9522g;
        int i11 = dVar.f9521f;
        if (!z9 || !(str instanceof String)) {
            if ((i9 <= 0 || i11 > i10) && (i9 >= 0 || i10 > i11)) {
                return -1;
            }
            while (!M(str, 0, charSequence, i11, str.length(), z8)) {
                if (i11 == i10) {
                    return -1;
                }
                i11 += i9;
            }
            return i11;
        }
        if ((i9 <= 0 || i11 > i10) && (i9 >= 0 || i10 > i11)) {
            return -1;
        }
        int i12 = i11;
        while (!o.r(str, 0, (String) charSequence, i12, str.length(), z8)) {
            if (i12 == i10) {
                return -1;
            }
            i12 += i9;
        }
        return i12;
    }

    public static int D(CharSequence charSequence, char c4, int i7, int i8) {
        if ((i8 & 2) != 0) {
            i7 = 0;
        }
        r6.k.f(charSequence, "<this>");
        return !(charSequence instanceof String) ? F(charSequence, new char[]{c4}, i7, false) : ((String) charSequence).indexOf(c4, i7);
    }

    public static /* synthetic */ int E(CharSequence charSequence, String str, int i7, int i8) {
        if ((i8 & 2) != 0) {
            i7 = 0;
        }
        return C(charSequence, str, i7, false);
    }

    public static final int F(CharSequence charSequence, char[] cArr, int i7, boolean z8) {
        r6.k.f(charSequence, "<this>");
        if (!z8 && cArr.length == 1 && (charSequence instanceof String)) {
            int length = cArr.length;
            if (length == 0) {
                throw new NoSuchElementException("Array is empty.");
            }
            if (length != 1) {
                throw new IllegalArgumentException("Array has more than one element.");
            }
            return ((String) charSequence).indexOf(cArr[0], i7);
        }
        if (i7 < 0) {
            i7 = 0;
        }
        int B = B(charSequence);
        if (i7 > B) {
            return -1;
        }
        while (true) {
            char charAt = charSequence.charAt(i7);
            for (char c4 : cArr) {
                if (v1.g.h(c4, charAt, z8)) {
                    return i7;
                }
            }
            if (i7 == B) {
                return -1;
            }
            i7++;
        }
    }

    public static boolean G(CharSequence charSequence) {
        r6.k.f(charSequence, "<this>");
        for (int i7 = 0; i7 < charSequence.length(); i7++) {
            if (!v1.g.l(charSequence.charAt(i7))) {
                return false;
            }
        }
        return true;
    }

    public static char H(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            return charSequence.charAt(B(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static int I(int i7, String str, String str2) {
        int B = (i7 & 2) != 0 ? B(str) : 0;
        r6.k.f(str, "<this>");
        r6.k.f(str2, "string");
        return str.lastIndexOf(str2, B);
    }

    public static int J(String str, char c4, int i7, int i8) {
        if ((i8 & 2) != 0) {
            i7 = B(str);
        }
        r6.k.f(str, "<this>");
        return str.lastIndexOf(c4, i7);
    }

    public static final List K(String str) {
        r6.k.f(str, "<this>");
        return y6.h.q(new y6.k(L(str, new String[]{"\r\n", "\n", "\r"}), new l0(17, str), 1));
    }

    public static y6.e L(CharSequence charSequence, String[] strArr) {
        return new y6.e(charSequence, new a2.a(22, e6.k.T(strArr)));
    }

    public static final boolean M(CharSequence charSequence, int i7, CharSequence charSequence2, int i8, int i9, boolean z8) {
        r6.k.f(charSequence, "<this>");
        r6.k.f(charSequence2, "other");
        if (i8 < 0 || i7 < 0 || i7 > charSequence.length() - i9 || i8 > charSequence2.length() - i9) {
            return false;
        }
        for (int i10 = 0; i10 < i9; i10++) {
            if (!v1.g.h(charSequence.charAt(i7 + i10), charSequence2.charAt(i8 + i10), z8)) {
                return false;
            }
        }
        return true;
    }

    public static String N(String str, String str2) {
        if (!o.v(str, str2)) {
            return str;
        }
        String substring = str.substring(str2.length());
        r6.k.e(substring, "substring(...)");
        return substring;
    }

    public static String O(String str, String str2) {
        if (!A(str, str2)) {
            return str;
        }
        String substring = str.substring(0, str.length() - str2.length());
        r6.k.e(substring, "substring(...)");
        return substring;
    }

    public static final List P(CharSequence charSequence, String str) {
        int C = C(charSequence, str, 0, false);
        if (C == -1) {
            return t6.a.F(charSequence.toString());
        }
        ArrayList arrayList = new ArrayList(10);
        int i7 = 0;
        do {
            arrayList.add(charSequence.subSequence(i7, C).toString());
            i7 = str.length() + C;
            C = C(charSequence, str, i7, false);
        } while (C != -1);
        arrayList.add(charSequence.subSequence(i7, charSequence.length()).toString());
        return arrayList;
    }

    public static List Q(String str, char[] cArr) {
        r6.k.f(str, "<this>");
        if (cArr.length == 1) {
            return P(str, String.valueOf(cArr[0]));
        }
        z zVar = new z(1, new y6.e(str, new a2.a(21, cArr)));
        ArrayList arrayList = new ArrayList(e6.n.a0(zVar, 10));
        Iterator it = zVar.iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return arrayList;
            }
            arrayList.add(R(str, (w6.d) bVar.next()));
        }
    }

    public static final String R(CharSequence charSequence, w6.d dVar) {
        r6.k.f(charSequence, "<this>");
        r6.k.f(dVar, "range");
        return charSequence.subSequence(dVar.f9521f, dVar.f9522g + 1).toString();
    }

    public static String S(String str, char c4, String str2) {
        int D = D(str, c4, 0, 6);
        if (D == -1) {
            return str2;
        }
        String substring = str.substring(D + 1, str.length());
        r6.k.e(substring, "substring(...)");
        return substring;
    }

    public static String T(String str, String str2) {
        r6.k.f(str2, "delimiter");
        int E = E(str, str2, 0, 6);
        if (E == -1) {
            return str;
        }
        String substring = str.substring(str2.length() + E, str.length());
        r6.k.e(substring, "substring(...)");
        return substring;
    }

    public static String U(String str, String str2) {
        r6.k.f(str, "<this>");
        r6.k.f(str2, "missingDelimiterValue");
        int J = J(str, '.', 0, 6);
        if (J == -1) {
            return str2;
        }
        String substring = str.substring(J + 1, str.length());
        r6.k.e(substring, "substring(...)");
        return substring;
    }

    public static String V(String str, int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException(a0.m.g(i7, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i7 > length) {
            i7 = length;
        }
        String substring = str.substring(0, i7);
        r6.k.e(substring, "substring(...)");
        return substring;
    }

    public static CharSequence W(String str) {
        r6.k.f(str, "<this>");
        int length = str.length() - 1;
        int i7 = 0;
        boolean z8 = false;
        while (i7 <= length) {
            boolean l8 = v1.g.l(str.charAt(!z8 ? i7 : length));
            if (z8) {
                if (!l8) {
                    break;
                }
                length--;
            } else if (l8) {
                i7++;
            } else {
                z8 = true;
            }
        }
        return str.subSequence(i7, length + 1);
    }

    public static boolean x(CharSequence charSequence, char c4) {
        r6.k.f(charSequence, "<this>");
        return D(charSequence, c4, 0, 2) >= 0;
    }

    public static boolean y(CharSequence charSequence, String str) {
        r6.k.f(charSequence, "<this>");
        r6.k.f(str, "other");
        return E(charSequence, str, 0, 2) >= 0;
    }

    public static String z(String str, int i7) {
        r6.k.f(str, "<this>");
        if (i7 < 0) {
            throw new IllegalArgumentException(a0.m.g(i7, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i7 > length) {
            i7 = length;
        }
        String substring = str.substring(i7);
        r6.k.e(substring, "substring(...)");
        return substring;
    }
}
