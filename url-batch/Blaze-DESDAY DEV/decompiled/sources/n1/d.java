package n1;

import Y.V;
import java.util.ArrayList;
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
        g1.d.e(charSequence, "<this>");
        boolean z2 = charSequence2 instanceof String;
        if (!z2) {
            int length = charSequence.length();
            int length2 = charSequence.length();
            if (length > length2) {
                length = length2;
            }
            k1.c cVar = new k1.c(0, length, 1);
            boolean z3 = charSequence instanceof String;
            int i2 = cVar.f2787c;
            int i3 = cVar.f2786b;
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
                    while (!I(charSequence2, 0, charSequence, i, charSequence2.length(), false)) {
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
        g1.d.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    /* JADX WARN: Incorrect condition in loop: B:20:0x004c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int C(CharSequence charSequence, String str, int i, boolean z2) {
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
        int i2 = cVar.f2787c;
        int i3 = cVar.f2786b;
        if (!z3) {
            if ((i2 > 0 && i <= i3) || (i2 < 0 && i3 <= i)) {
                while (!I(str, 0, charSequence, i, str.length(), z2)) {
                    if (i != i3) {
                        i += i2;
                    }
                }
                return i;
            }
            return -1;
        }
        if ((i2 > 0 && i <= i3) || (i2 < 0 && i3 <= i)) {
            while (!l.v(0, r4, str.length(), str, (String) charSequence, z2)) {
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
        g1.d.e(charSequence, "<this>");
        return (z2 || !(charSequence instanceof String)) ? F(charSequence, new char[]{c2}, i, z2) : ((String) charSequence).indexOf(c2, i);
    }

    public static /* synthetic */ int E(CharSequence charSequence, String str, int i, boolean z2, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        return C(charSequence, str, i, z2);
    }

    public static final int F(CharSequence charSequence, char[] cArr, int i, boolean z2) {
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
        int B2 = B(charSequence);
        if (i > B2) {
            return -1;
        }
        while (true) {
            char charAt = charSequence.charAt(i);
            for (char c2 : cArr) {
                if (i0.g.g(c2, charAt, z2)) {
                    return i;
                }
            }
            if (i == B2) {
                return -1;
            }
            i++;
        }
    }

    public static boolean G(String str) {
        g1.d.e(str, "<this>");
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
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
        g1.d.e(str, "<this>");
        return str.lastIndexOf(c2, i);
    }

    public static final boolean I(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z2) {
        g1.d.e(charSequence, "<this>");
        g1.d.e(charSequence2, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!i0.g.g(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z2)) {
                return false;
            }
        }
        return true;
    }

    public static String J(String str, String str2) {
        if (!l.y(str, str2, false)) {
            return str;
        }
        String substring = str.substring(str2.length());
        g1.d.d(substring, "substring(...)");
        return substring;
    }

    public static final void K(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(V.e("Limit must be non-negative, but was ", i).toString());
        }
    }

    public static List L(String str, char[] cArr) {
        g1.d.e(str, "<this>");
        boolean z2 = false;
        if (cArr.length == 1) {
            String valueOf = String.valueOf(cArr[0]);
            K(0);
            int C2 = C(str, valueOf, 0, false);
            if (C2 == -1) {
                return z1.d.Y(str.toString());
            }
            ArrayList arrayList = new ArrayList(10);
            int i = 0;
            do {
                arrayList.add(str.subSequence(i, C2).toString());
                i = valueOf.length() + C2;
                C2 = C(str, valueOf, i, false);
            } while (C2 != -1);
            arrayList.add(str.subSequence(i, str.length()).toString());
            return arrayList;
        }
        K(0);
        m1.g gVar = new m1.g(new c(str, 0, 0, new m(cArr, z2, 0)));
        ArrayList arrayList2 = new ArrayList(V0.i.x0(gVar));
        Iterator it = gVar.iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return arrayList2;
            }
            k1.c cVar = (k1.c) bVar.next();
            g1.d.e(cVar, "range");
            arrayList2.add(str.subSequence(cVar.f2785a, cVar.f2786b + 1).toString());
        }
    }

    public static String M(String str) {
        g1.d.e(str, "<this>");
        g1.d.e(str, "missingDelimiterValue");
        int H2 = H(str, '.', 0, 6);
        if (H2 == -1) {
            return str;
        }
        String substring = str.substring(H2 + 1, str.length());
        g1.d.d(substring, "substring(...)");
        return substring;
    }

    public static String N(String str, int i) {
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

    public static CharSequence O(String str) {
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

    public static boolean z(CharSequence charSequence, char c2) {
        g1.d.e(charSequence, "<this>");
        return D(charSequence, c2, 0, false, 2) >= 0;
    }
}
