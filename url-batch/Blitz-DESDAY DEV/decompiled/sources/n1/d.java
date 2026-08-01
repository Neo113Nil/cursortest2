package n1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import m.C0227a;

/* loaded from: classes.dex */
public abstract class d extends l {
    public static boolean C(CharSequence charSequence, char c2) {
        g1.d.e(charSequence, "<this>");
        return G(charSequence, c2, 0, false, 2) >= 0;
    }

    public static boolean D(CharSequence charSequence, String str) {
        g1.d.e(charSequence, "<this>");
        return H(charSequence, str, 0, false, 2) >= 0;
    }

    public static final int E(CharSequence charSequence) {
        g1.d.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    /* JADX WARN: Incorrect condition in loop: B:20:0x004c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int F(CharSequence charSequence, String str, int i, boolean z2) {
        g1.d.e(charSequence, "<this>");
        g1.d.e(str, "string");
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
        k1.c cVar = new k1.c(i, length, 1);
        boolean z3 = charSequence instanceof String;
        int i2 = cVar.f2840c;
        int i3 = cVar.f2839b;
        if (!z3) {
            if ((i2 > 0 && i <= i3) || (i2 < 0 && i3 <= i)) {
                while (!L(str, 0, charSequence, i, str.length(), z2)) {
                    if (i != i3) {
                        i += i2;
                    }
                }
                return i;
            }
            return -1;
        }
        if ((i2 > 0 && i <= i3) || (i2 < 0 && i3 <= i)) {
            while (!l.y(0, r4, str.length(), str, (String) charSequence, z2)) {
                if (i != i3) {
                    i += i2;
                }
            }
            return i;
        }
        return -1;
    }

    public static int G(CharSequence charSequence, char c2, int i, boolean z2, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        g1.d.e(charSequence, "<this>");
        return (z2 || !(charSequence instanceof String)) ? I(charSequence, new char[]{c2}, i, z2) : ((String) charSequence).indexOf(c2, i);
    }

    public static /* synthetic */ int H(CharSequence charSequence, String str, int i, boolean z2, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        return F(charSequence, str, i, z2);
    }

    public static final int I(CharSequence charSequence, char[] cArr, int i, boolean z2) {
        g1.d.e(charSequence, "<this>");
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
        int E2 = E(charSequence);
        if (i > E2) {
            return -1;
        }
        while (true) {
            char charAt = charSequence.charAt(i);
            for (char c2 : cArr) {
                if (C0227a.f(c2, charAt, z2)) {
                    return i;
                }
            }
            if (i == E2) {
                return -1;
            }
            i++;
        }
    }

    public static boolean J(String str) {
        g1.d.e(str, "<this>");
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (!Character.isWhitespace(charAt) && !Character.isSpaceChar(charAt)) {
                return false;
            }
        }
        return true;
    }

    public static int K(String str, char c2, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = E(str);
        }
        g1.d.e(str, "<this>");
        return str.lastIndexOf(c2, i);
    }

    public static final boolean L(String str, int i, CharSequence charSequence, int i2, int i3, boolean z2) {
        g1.d.e(str, "<this>");
        g1.d.e(charSequence, "other");
        if (i2 < 0 || i < 0 || i > str.length() - i3 || i2 > charSequence.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!C0227a.f(str.charAt(i + i4), charSequence.charAt(i2 + i4), z2)) {
                return false;
            }
        }
        return true;
    }

    public static String M(String str, String str2) {
        if (!l.B(str, str2, false)) {
            return str;
        }
        String substring = str.substring(str2.length());
        g1.d.d(substring, "substring(...)");
        return substring;
    }

    public static final void N(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(X0.a.e("Limit must be non-negative, but was ", i).toString());
        }
    }

    public static List O(String str, char[] cArr) {
        g1.d.e(str, "<this>");
        if (cArr.length == 1) {
            String valueOf = String.valueOf(cArr[0]);
            N(0);
            int F2 = F(str, valueOf, 0, false);
            if (F2 == -1) {
                return z1.l.a0(str.toString());
            }
            ArrayList arrayList = new ArrayList(10);
            int i = 0;
            do {
                arrayList.add(str.subSequence(i, F2).toString());
                i = valueOf.length() + F2;
                F2 = F(str, valueOf, i, false);
            } while (F2 != -1);
            arrayList.add(str.subSequence(i, str.length()).toString());
            return arrayList;
        }
        N(0);
        m1.f fVar = new m1.f(new c(str, 0, 0, new m(cArr, false, 0)));
        ArrayList arrayList2 = new ArrayList(X0.l.z0(fVar));
        Iterator it = fVar.iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return arrayList2;
            }
            k1.c cVar = (k1.c) bVar.next();
            g1.d.e(cVar, "range");
            arrayList2.add(str.subSequence(cVar.f2838a, cVar.f2839b + 1).toString());
        }
    }

    public static String P(String str) {
        g1.d.e(str, "<this>");
        g1.d.e(str, "missingDelimiterValue");
        int K2 = K(str, '.', 0, 6);
        if (K2 == -1) {
            return str;
        }
        String substring = str.substring(K2 + 1, str.length());
        g1.d.d(substring, "substring(...)");
        return substring;
    }

    public static String Q(String str, int i) {
        if (i < 0) {
            throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        String substring = str.substring(0, i);
        g1.d.d(substring, "substring(...)");
        return substring;
    }

    public static CharSequence R(String str) {
        g1.d.e(str, "<this>");
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
}
