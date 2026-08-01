package b3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class e extends m {
    public static boolean c0(CharSequence charSequence, char c) {
        u2.c.e(charSequence, "<this>");
        return g0(charSequence, c, 0, 2) >= 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0071 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean d0(CharSequence charSequence, CharSequence charSequence2) {
        int i4;
        u2.c.e(charSequence, "<this>");
        boolean z3 = charSequence2 instanceof String;
        if (z3) {
            return h0(charSequence, (String) charSequence2, 0, 2) >= 0;
        }
        int length = charSequence.length();
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        y2.c cVar = new y2.c(0, length, 1);
        boolean z4 = charSequence instanceof String;
        int i5 = cVar.h;
        int i6 = cVar.g;
        if (z4 && z3) {
            if ((i5 > 0 && i6 >= 0) || (i5 < 0 && i6 <= 0)) {
                i4 = 0;
                while (true) {
                    String str = (String) charSequence2;
                    if (!m.Y(0, i4, str.length(), str, (String) charSequence, false)) {
                        if (i4 == i6) {
                            break;
                        }
                        i4 += i5;
                    } else {
                        break;
                    }
                }
            }
            i4 = -1;
            if (i4 < 0) {
            }
        } else {
            if ((i5 > 0 && i6 >= 0) || (i5 < 0 && i6 <= 0)) {
                int i7 = 0;
                while (true) {
                    CharSequence charSequence3 = charSequence;
                    CharSequence charSequence4 = charSequence2;
                    if (!l0(charSequence4, 0, charSequence3, i7, charSequence2.length(), false)) {
                        if (i7 == i6) {
                            break;
                        }
                        i7 += i5;
                        charSequence2 = charSequence4;
                        charSequence = charSequence3;
                    } else {
                        i4 = i7;
                        break;
                    }
                }
            }
            i4 = -1;
            if (i4 < 0) {
            }
        }
    }

    public static final int e0(CharSequence charSequence) {
        u2.c.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int f0(CharSequence charSequence, String str, int i4, boolean z3) {
        u2.c.e(charSequence, "<this>");
        u2.c.e(str, "string");
        if (!z3 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i4);
        }
        int length = charSequence.length();
        if (i4 < 0) {
            i4 = 0;
        }
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        y2.c cVar = new y2.c(i4, length, 1);
        boolean z4 = charSequence instanceof String;
        int i5 = cVar.h;
        int i6 = cVar.g;
        if (!z4) {
            boolean z5 = z3;
            if ((i5 <= 0 || i4 > i6) && (i5 >= 0 || i6 > i4)) {
                return -1;
            }
            while (true) {
                CharSequence charSequence2 = charSequence;
                boolean z6 = z5;
                z5 = z6;
                if (l0(str, 0, charSequence2, i4, str.length(), z6)) {
                    return i4;
                }
                if (i4 == i6) {
                    return -1;
                }
                i4 += i5;
                charSequence = charSequence2;
            }
        } else {
            if ((i5 <= 0 || i4 > i6) && (i5 >= 0 || i6 > i4)) {
                return -1;
            }
            int i7 = i4;
            while (true) {
                String str2 = str;
                boolean z7 = z3;
                if (m.Y(0, i7, str.length(), str2, (String) charSequence, z7)) {
                    return i7;
                }
                if (i7 == i6) {
                    return -1;
                }
                i7 += i5;
                str = str2;
                z3 = z7;
            }
        }
    }

    public static int g0(CharSequence charSequence, char c, int i4, int i5) {
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        u2.c.e(charSequence, "<this>");
        return !(charSequence instanceof String) ? i0(charSequence, new char[]{c}, i4, false) : ((String) charSequence).indexOf(c, i4);
    }

    public static /* synthetic */ int h0(CharSequence charSequence, String str, int i4, int i5) {
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        return f0(charSequence, str, i4, false);
    }

    public static final int i0(CharSequence charSequence, char[] cArr, int i4, boolean z3) {
        u2.c.e(charSequence, "<this>");
        if (!z3 && cArr.length == 1 && (charSequence instanceof String)) {
            int length = cArr.length;
            if (length == 0) {
                throw new NoSuchElementException("Array is empty.");
            }
            if (length != 1) {
                throw new IllegalArgumentException("Array has more than one element.");
            }
            return ((String) charSequence).indexOf(cArr[0], i4);
        }
        if (i4 < 0) {
            i4 = 0;
        }
        int e02 = e0(charSequence);
        if (i4 > e02) {
            return -1;
        }
        while (true) {
            char charAt = charSequence.charAt(i4);
            for (char c : cArr) {
                if (k3.d.y(c, charAt, z3)) {
                    return i4;
                }
            }
            if (i4 == e02) {
                return -1;
            }
            i4++;
        }
    }

    public static boolean j0(String str) {
        u2.c.e(str, "<this>");
        for (int i4 = 0; i4 < str.length(); i4++) {
            char charAt = str.charAt(i4);
            if (!Character.isWhitespace(charAt) && !Character.isSpaceChar(charAt)) {
                return false;
            }
        }
        return true;
    }

    public static int k0(String str, char c, int i4, int i5) {
        if ((i5 & 2) != 0) {
            i4 = e0(str);
        }
        u2.c.e(str, "<this>");
        return str.lastIndexOf(c, i4);
    }

    public static final boolean l0(CharSequence charSequence, int i4, CharSequence charSequence2, int i5, int i6, boolean z3) {
        u2.c.e(charSequence, "<this>");
        u2.c.e(charSequence2, "other");
        if (i5 < 0 || i4 < 0 || i4 > charSequence.length() - i6 || i5 > charSequence2.length() - i6) {
            return false;
        }
        for (int i7 = 0; i7 < i6; i7++) {
            if (!k3.d.y(charSequence.charAt(i4 + i7), charSequence2.charAt(i5 + i7), z3)) {
                return false;
            }
        }
        return true;
    }

    public static String m0(String str, String str2) {
        if (!m.b0(str, str2, false)) {
            return str;
        }
        String substring = str.substring(str2.length());
        u2.c.d(substring, "substring(...)");
        return substring;
    }

    public static List n0(String str, char[] cArr) {
        u2.c.e(str, "<this>");
        if (cArr.length == 1) {
            String valueOf = String.valueOf(cArr[0]);
            int f0 = f0(str, valueOf, 0, false);
            if (f0 == -1) {
                return m0.a.r(str.toString());
            }
            ArrayList arrayList = new ArrayList(10);
            int i4 = 0;
            do {
                arrayList.add(str.subSequence(i4, f0).toString());
                i4 = valueOf.length() + f0;
                f0 = f0(str, valueOf, i4, false);
            } while (f0 != -1);
            arrayList.add(str.subSequence(i4, str.length()).toString());
            return arrayList;
        }
        a3.h hVar = new a3.h(new c(str, new n(0, cArr)));
        ArrayList arrayList2 = new ArrayList(n2.i.E(hVar));
        Iterator it = hVar.iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return arrayList2;
            }
            y2.c cVar = (y2.c) bVar.next();
            u2.c.e(cVar, "range");
            arrayList2.add(str.subSequence(cVar.f3617f, cVar.g + 1).toString());
        }
    }

    public static String o0(String str) {
        u2.c.e(str, "<this>");
        u2.c.e(str, "missingDelimiterValue");
        int k02 = k0(str, '.', 0, 6);
        if (k02 == -1) {
            return str;
        }
        String substring = str.substring(k02 + 1, str.length());
        u2.c.d(substring, "substring(...)");
        return substring;
    }

    public static String p0(String str, int i4) {
        u2.c.e(str, "<this>");
        if (i4 < 0) {
            throw new IllegalArgumentException(("Requested character count " + i4 + " is less than zero.").toString());
        }
        int length = str.length();
        if (i4 > length) {
            i4 = length;
        }
        String substring = str.substring(0, i4);
        u2.c.d(substring, "substring(...)");
        return substring;
    }

    public static CharSequence q0(String str) {
        u2.c.e(str, "<this>");
        int length = str.length() - 1;
        int i4 = 0;
        boolean z3 = false;
        while (i4 <= length) {
            char charAt = str.charAt(!z3 ? i4 : length);
            boolean z4 = Character.isWhitespace(charAt) || Character.isSpaceChar(charAt);
            if (z3) {
                if (!z4) {
                    break;
                }
                length--;
            } else if (z4) {
                i4++;
            } else {
                z3 = true;
            }
        }
        return str.subSequence(i4, length + 1);
    }

    public static String r0(String str, char... cArr) {
        CharSequence charSequence;
        u2.c.e(str, "<this>");
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                char charAt = str.charAt(length);
                int length2 = cArr.length;
                int i5 = 0;
                while (true) {
                    if (i5 >= length2) {
                        i5 = -1;
                        break;
                    }
                    if (charAt == cArr[i5]) {
                        break;
                    }
                    i5++;
                }
                if (!(i5 >= 0)) {
                    charSequence = str.subSequence(0, length + 1);
                    break;
                }
                if (i4 < 0) {
                    break;
                }
                length = i4;
            }
        }
        charSequence = "";
        return charSequence.toString();
    }
}
