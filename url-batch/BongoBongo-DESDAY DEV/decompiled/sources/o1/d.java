package o1;

import Z.V;
import h.AbstractC0112a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class d extends l {
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean A(CharSequence charSequence, CharSequence charSequence2) {
        int i;
        h1.d.e(charSequence, "<this>");
        boolean z2 = charSequence2 instanceof String;
        if (!z2) {
            int length = charSequence.length();
            int length2 = charSequence.length();
            if (length > length2) {
                length = length2;
            }
            l1.c cVar = new l1.c(0, length, 1);
            boolean z3 = charSequence instanceof String;
            int i2 = cVar.f2889c;
            int i3 = cVar.f2888b;
            if (z3 && z2) {
                if ((i2 > 0 && i3 >= 0) || (i2 < 0 && i3 <= 0)) {
                    i = 0;
                    while (!l.v(0, i, ((String) charSequence2).length(), (String) charSequence2, (String) charSequence, false)) {
                        if (i != i3) {
                            i += i2;
                        }
                    }
                    if (i >= 0) {
                    }
                }
                i = -1;
                if (i >= 0) {
                }
            } else {
                if ((i2 > 0 && i3 >= 0) || (i2 < 0 && i3 <= 0)) {
                    i = 0;
                    while (!J(charSequence2, 0, charSequence, i, charSequence2.length(), false)) {
                        if (i != i3) {
                            i += i2;
                        }
                    }
                    if (i >= 0) {
                        return true;
                    }
                }
                i = -1;
                if (i >= 0) {
                }
            }
        } else if (E(charSequence, (String) charSequence2, 0, false, 2) >= 0) {
            return true;
        }
        return false;
    }

    public static final int B(CharSequence charSequence) {
        h1.d.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    /* JADX WARN: Incorrect condition in loop: B:20:0x004c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int C(int i, CharSequence charSequence, String str, boolean z2) {
        h1.d.e(charSequence, "<this>");
        h1.d.e(str, "string");
        if (!z2 && (charSequence instanceof String)) {
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
        l1.c cVar = new l1.c(i, length, 1);
        boolean z3 = charSequence instanceof String;
        int i2 = cVar.f2889c;
        int i3 = cVar.f2888b;
        if (z3) {
            if ((i2 > 0 && i <= i3) || (i2 < 0 && i3 <= i)) {
                while (!l.v(0, r4, str.length(), str, (String) charSequence, z2)) {
                    if (i != i3) {
                        i += i2;
                    }
                }
                return i;
            }
        } else if ((i2 > 0 && i <= i3) || (i2 < 0 && i3 <= i)) {
            while (!J(str, 0, charSequence, i, str.length(), z2)) {
                if (i != i3) {
                    i += i2;
                }
            }
            return i;
        }
        return -1;
    }

    public static int D(CharSequence charSequence, char c2, int i, boolean z2, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        h1.d.e(charSequence, "<this>");
        return (z2 || !(charSequence instanceof String)) ? F(charSequence, new char[]{c2}, i, z2) : ((String) charSequence).indexOf(c2, i);
    }

    public static /* synthetic */ int E(CharSequence charSequence, String str, int i, boolean z2, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        return C(i, charSequence, str, z2);
    }

    public static final int F(CharSequence charSequence, char[] cArr, int i, boolean z2) {
        h1.d.e(charSequence, "<this>");
        if (!z2 && cArr.length == 1 && (charSequence instanceof String)) {
            int length = cArr.length;
            if (length == 0) {
                throw new NoSuchElementException("Array is empty.");
            }
            if (length != 1) {
                throw new IllegalArgumentException("Array has more than one element.");
            }
            return ((String) charSequence).indexOf(cArr[0], i);
        }
        if (i < 0) {
            i = 0;
        }
        int B2 = B(charSequence);
        if (i > B2) {
            return -1;
        }
        while (true) {
            char charAt = charSequence.charAt(i);
            for (char c2 : cArr) {
                if (AbstractC0112a.g(c2, charAt, z2)) {
                    return i;
                }
            }
            if (i == B2) {
                return -1;
            }
            i++;
        }
    }

    public static boolean G(CharSequence charSequence) {
        h1.d.e(charSequence, "<this>");
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            if (!Character.isWhitespace(charAt) && !Character.isSpaceChar(charAt)) {
                return false;
            }
        }
        return true;
    }

    public static int H(String str, char c2, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = B(str);
        }
        h1.d.e(str, "<this>");
        return str.lastIndexOf(c2, i);
    }

    public static c I(CharSequence charSequence, String[] strArr, boolean z2, int i) {
        L(i);
        List asList = Arrays.asList(strArr);
        h1.d.d(asList, "asList(...)");
        return new c(charSequence, 0, i, new m(asList, z2, 1));
    }

    public static final boolean J(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z2) {
        h1.d.e(charSequence, "<this>");
        h1.d.e(charSequence2, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!AbstractC0112a.g(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z2)) {
                return false;
            }
        }
        return true;
    }

    public static String K(String str, String str2) {
        if (!l.y(str, str2, false)) {
            return str;
        }
        String substring = str.substring(str2.length());
        h1.d.d(substring, "substring(...)");
        return substring;
    }

    public static final void L(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(V.e("Limit must be non-negative, but was ", i).toString());
        }
    }

    public static final List M(int i, CharSequence charSequence, String str, boolean z2) {
        L(i);
        int i2 = 0;
        int C2 = C(0, charSequence, str, z2);
        if (C2 == -1 || i == 1) {
            return A1.d.T(charSequence.toString());
        }
        boolean z3 = i > 0;
        int i3 = 10;
        if (z3 && i <= 10) {
            i3 = i;
        }
        ArrayList arrayList = new ArrayList(i3);
        do {
            arrayList.add(charSequence.subSequence(i2, C2).toString());
            i2 = str.length() + C2;
            if (z3 && arrayList.size() == i - 1) {
                break;
            }
            C2 = C(i2, charSequence, str, z2);
        } while (C2 != -1);
        arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
        return arrayList;
    }

    public static List N(CharSequence charSequence, String[] strArr) {
        h1.d.e(charSequence, "<this>");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return M(0, charSequence, str, false);
            }
        }
        n1.g gVar = new n1.g(I(charSequence, strArr, false, 0));
        ArrayList arrayList = new ArrayList(W0.i.o0(gVar));
        Iterator it = gVar.iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return arrayList;
            }
            arrayList.add(P(charSequence, (l1.c) bVar.next()));
        }
    }

    public static List O(String str, char[] cArr) {
        h1.d.e(str, "<this>");
        boolean z2 = false;
        if (cArr.length == 1) {
            return M(0, str, String.valueOf(cArr[0]), false);
        }
        L(0);
        n1.g gVar = new n1.g(new c(str, 0, 0, new m(cArr, z2, 0)));
        ArrayList arrayList = new ArrayList(W0.i.o0(gVar));
        Iterator it = gVar.iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return arrayList;
            }
            arrayList.add(P(str, (l1.c) bVar.next()));
        }
    }

    public static final String P(CharSequence charSequence, l1.c cVar) {
        h1.d.e(charSequence, "<this>");
        h1.d.e(cVar, "range");
        return charSequence.subSequence(cVar.f2887a, cVar.f2888b + 1).toString();
    }

    public static String Q(String str) {
        h1.d.e(str, "<this>");
        h1.d.e(str, "missingDelimiterValue");
        int H2 = H(str, '.', 0, 6);
        if (H2 == -1) {
            return str;
        }
        String substring = str.substring(H2 + 1, str.length());
        h1.d.d(substring, "substring(...)");
        return substring;
    }

    public static String R(String str, int i) {
        if (i < 0) {
            throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        String substring = str.substring(0, i);
        h1.d.d(substring, "substring(...)");
        return substring;
    }

    public static CharSequence S(String str) {
        h1.d.e(str, "<this>");
        int length = str.length() - 1;
        int i = 0;
        boolean z2 = false;
        while (i <= length) {
            char charAt = str.charAt(!z2 ? i : length);
            boolean z3 = Character.isWhitespace(charAt) || Character.isSpaceChar(charAt);
            if (z2) {
                if (!z3) {
                    break;
                }
                length--;
            } else if (z3) {
                i++;
            } else {
                z2 = true;
            }
        }
        return str.subSequence(i, length + 1);
    }

    public static boolean z(CharSequence charSequence, char c2) {
        h1.d.e(charSequence, "<this>");
        return D(charSequence, c2, 0, false, 2) >= 0;
    }
}
