package r1;

import G1.AbstractC0001b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class d extends l {
    public static boolean D(CharSequence charSequence, char c2) {
        k1.e.e(charSequence, "<this>");
        return I(charSequence, c2, 0, false, 2) >= 0;
    }

    public static boolean E(CharSequence charSequence, CharSequence charSequence2) {
        k1.e.e(charSequence, "<this>");
        if (charSequence2 instanceof String) {
            if (J(charSequence, (String) charSequence2, 0, false, 2) < 0) {
                return false;
            }
        } else if (H(charSequence, charSequence2, 0, charSequence.length(), false, false) < 0) {
            return false;
        }
        return true;
    }

    public static final int F(CharSequence charSequence) {
        k1.e.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int G(CharSequence charSequence, String str, int i, boolean z2) {
        k1.e.e(charSequence, "<this>");
        k1.e.e(str, "string");
        return (z2 || !(charSequence instanceof String)) ? H(charSequence, str, i, charSequence.length(), z2, false) : ((String) charSequence).indexOf(str, i);
    }

    public static final int H(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z2, boolean z3) {
        o1.a aVar;
        if (z3) {
            int F = F(charSequence);
            if (i > F) {
                i = F;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            aVar = new o1.a(i, i2, -1);
        } else {
            if (i < 0) {
                i = 0;
            }
            int length = charSequence.length();
            if (i2 > length) {
                i2 = length;
            }
            aVar = new o1.c(i, i2, 1);
        }
        boolean z4 = charSequence instanceof String;
        int i3 = aVar.f3597c;
        int i4 = aVar.f3596b;
        int i5 = aVar.f3595a;
        if (z4 && (charSequence2 instanceof String)) {
            if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
                while (!l.z(0, i5, ((String) charSequence2).length(), (String) charSequence2, (String) charSequence, z2)) {
                    if (i5 != i4) {
                        i5 += i3;
                    }
                }
                return i5;
            }
        } else if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
            while (!N(charSequence2, 0, charSequence, i5, charSequence2.length(), z2)) {
                if (i5 != i4) {
                    i5 += i3;
                }
            }
            return i5;
        }
        return -1;
    }

    public static int I(CharSequence charSequence, char c2, int i, boolean z2, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        k1.e.e(charSequence, "<this>");
        return (z2 || !(charSequence instanceof String)) ? K(charSequence, new char[]{c2}, i, z2) : ((String) charSequence).indexOf(c2, i);
    }

    public static /* synthetic */ int J(CharSequence charSequence, String str, int i, boolean z2, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        return G(charSequence, str, i, z2);
    }

    public static final int K(CharSequence charSequence, char[] cArr, int i, boolean z2) {
        k1.e.e(charSequence, "<this>");
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
        int F = F(charSequence);
        if (i > F) {
            return -1;
        }
        while (true) {
            char charAt = charSequence.charAt(i);
            for (char c2 : cArr) {
                if (b1.g.k(c2, charAt, z2)) {
                    return i;
                }
            }
            if (i == F) {
                return -1;
            }
            i++;
        }
    }

    public static boolean L(String str) {
        k1.e.e(str, "<this>");
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (!Character.isWhitespace(charAt) && !Character.isSpaceChar(charAt)) {
                return false;
            }
        }
        return true;
    }

    public static int M(String str, char c2, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = F(str);
        }
        k1.e.e(str, "<this>");
        return str.lastIndexOf(c2, i);
    }

    public static final boolean N(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z2) {
        k1.e.e(charSequence, "<this>");
        k1.e.e(charSequence2, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!b1.g.k(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z2)) {
                return false;
            }
        }
        return true;
    }

    public static String O(String str, String str2) {
        if (!l.C(str, str2, false)) {
            return str;
        }
        String substring = str.substring(str2.length());
        k1.e.d(substring, "substring(...)");
        return substring;
    }

    public static final void P(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC0001b.f("Limit must be non-negative, but was ", i).toString());
        }
    }

    public static List Q(String str, char[] cArr) {
        k1.e.e(str, "<this>");
        boolean z2 = false;
        if (cArr.length == 1) {
            String valueOf = String.valueOf(cArr[0]);
            P(0);
            int G2 = G(str, valueOf, 0, false);
            if (G2 == -1) {
                return H1.d.R(str.toString());
            }
            ArrayList arrayList = new ArrayList(10);
            int i = 0;
            do {
                arrayList.add(str.subSequence(i, G2).toString());
                i = valueOf.length() + G2;
                G2 = G(str, valueOf, i, false);
            } while (G2 != -1);
            arrayList.add(str.subSequence(i, str.length()).toString());
            return arrayList;
        }
        P(0);
        q1.i iVar = new q1.i(new c(str, 0, 0, new m(cArr, z2, 0)));
        ArrayList arrayList2 = new ArrayList(Y0.l.z0(iVar));
        Iterator it = iVar.iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return arrayList2;
            }
            o1.c cVar = (o1.c) bVar.next();
            k1.e.e(cVar, "range");
            arrayList2.add(str.subSequence(cVar.f3595a, cVar.f3596b + 1).toString());
        }
    }

    public static String R(String str) {
        k1.e.e(str, "<this>");
        k1.e.e(str, "missingDelimiterValue");
        int M2 = M(str, '.', 0, 6);
        if (M2 == -1) {
            return str;
        }
        String substring = str.substring(M2 + 1, str.length());
        k1.e.d(substring, "substring(...)");
        return substring;
    }

    public static String S(String str, int i) {
        if (i < 0) {
            throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        String substring = str.substring(0, i);
        k1.e.d(substring, "substring(...)");
        return substring;
    }

    public static CharSequence T(CharSequence charSequence) {
        k1.e.e(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z2 = false;
        while (i <= length) {
            char charAt = charSequence.charAt(!z2 ? i : length);
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
        return charSequence.subSequence(i, length + 1);
    }
}
