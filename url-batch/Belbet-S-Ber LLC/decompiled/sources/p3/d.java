package p3;

import a.g0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class d extends l {
    public static String A0(String str, String str2) {
        if (!l.q0(str, str2, false)) {
            return str;
        }
        String substring = str.substring(str2.length());
        i3.d.d(substring, "substring(...)");
        return substring;
    }

    public static List B0(String str, char[] cArr) {
        i3.d.e(str, "<this>");
        if (cArr.length == 1) {
            String valueOf = String.valueOf(cArr[0]);
            int u02 = u0(str, valueOf, 0, false);
            if (u02 == -1) {
                return s.a.s(str.toString());
            }
            ArrayList arrayList = new ArrayList(10);
            int i = 0;
            do {
                arrayList.add(str.subSequence(i, u02).toString());
                i = valueOf.length() + u02;
                u02 = u0(str, valueOf, i, false);
            } while (u02 != -1);
            arrayList.add(str.subSequence(i, str.length()).toString());
            return arrayList;
        }
        o3.g gVar = new o3.g(new o3.d(str, new g0(4, cArr)));
        ArrayList arrayList2 = new ArrayList(x2.j.C(gVar));
        Iterator it = gVar.iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return arrayList2;
            }
            m3.c cVar = (m3.c) bVar.next();
            i3.d.e(cVar, "range");
            arrayList2.add(str.subSequence(cVar.f2735f, cVar.f2736g + 1).toString());
        }
    }

    public static String C0(String str) {
        int z02 = z0(str, '.', 0, 6);
        if (z02 == -1) {
            return str;
        }
        String substring = str.substring(z02 + 1, str.length());
        i3.d.d(substring, "substring(...)");
        return substring;
    }

    public static String D0(String str, int i) {
        if (i < 0) {
            throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        String substring = str.substring(0, i);
        i3.d.d(substring, "substring(...)");
        return substring;
    }

    public static CharSequence E0(String str) {
        i3.d.e(str, "<this>");
        int length = str.length() - 1;
        int i = 0;
        boolean z4 = false;
        while (i <= length) {
            char charAt = str.charAt(!z4 ? i : length);
            boolean z5 = Character.isWhitespace(charAt) || Character.isSpaceChar(charAt);
            if (z4) {
                if (!z5) {
                    break;
                }
                length--;
            } else if (z5) {
                i++;
            } else {
                z4 = true;
            }
        }
        return str.subSequence(i, length + 1);
    }

    public static boolean r0(CharSequence charSequence, char c5) {
        i3.d.e(charSequence, "<this>");
        return w0(charSequence, c5, 0, 2) >= 0;
    }

    public static boolean s0(CharSequence charSequence, CharSequence charSequence2) {
        i3.d.e(charSequence, "<this>");
        i3.d.e(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (u0(charSequence, (String) charSequence2, 0, false) >= 0) {
                return true;
            }
        } else if (v0(charSequence, charSequence2, 0, charSequence.length(), false) >= 0) {
            return true;
        }
        return false;
    }

    public static final int t0(CharSequence charSequence) {
        i3.d.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int u0(CharSequence charSequence, String str, int i, boolean z4) {
        i3.d.e(charSequence, "<this>");
        i3.d.e(str, "string");
        return (z4 || !(charSequence instanceof String)) ? v0(charSequence, str, i, charSequence.length(), z4) : ((String) charSequence).indexOf(str, i);
    }

    public static int v0(CharSequence charSequence, CharSequence charSequence2, int i, int i4, boolean z4) {
        if (i < 0) {
            i = 0;
        }
        int length = charSequence.length();
        if (i4 > length) {
            i4 = length;
        }
        m3.c cVar = new m3.c(i, i4, 1);
        boolean z5 = charSequence instanceof String;
        int i5 = cVar.h;
        int i6 = cVar.f2736g;
        if (z5 && (charSequence2 instanceof String)) {
            if ((i5 <= 0 || i > i6) && (i5 >= 0 || i6 > i)) {
                return -1;
            }
            int i7 = i;
            while (true) {
                String str = (String) charSequence2;
                boolean z6 = z4;
                if (l.n0(0, i7, str.length(), str, (String) charSequence, z6)) {
                    return i7;
                }
                if (i7 == i6) {
                    return -1;
                }
                i7 += i5;
                z4 = z6;
            }
        } else {
            if ((i5 <= 0 || i > i6) && (i5 >= 0 || i6 > i)) {
                return -1;
            }
            while (true) {
                int length2 = charSequence2.length();
                i3.d.e(charSequence2, "<this>");
                i3.d.e(charSequence, "other");
                boolean z7 = false;
                if (i >= 0 && charSequence2.length() - length2 >= 0 && i <= charSequence.length() - length2) {
                    int i8 = 0;
                    while (true) {
                        if (i8 >= length2) {
                            z7 = true;
                            break;
                        }
                        if (!b4.d.u(charSequence2.charAt(0 + i8), charSequence.charAt(i + i8), z4)) {
                            break;
                        }
                        i8++;
                    }
                }
                if (z7) {
                    return i;
                }
                if (i == i6) {
                    return -1;
                }
                i += i5;
            }
        }
    }

    public static int w0(CharSequence charSequence, char c5, int i, int i4) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        i3.d.e(charSequence, "<this>");
        return !(charSequence instanceof String) ? x0(charSequence, new char[]{c5}, i, false) : ((String) charSequence).indexOf(c5, i);
    }

    public static final int x0(CharSequence charSequence, char[] cArr, int i, boolean z4) {
        i3.d.e(charSequence, "<this>");
        if (!z4 && cArr.length == 1 && (charSequence instanceof String)) {
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
        int t02 = t0(charSequence);
        if (i > t02) {
            return -1;
        }
        while (true) {
            char charAt = charSequence.charAt(i);
            for (char c5 : cArr) {
                if (b4.d.u(c5, charAt, z4)) {
                    return i;
                }
            }
            if (i == t02) {
                return -1;
            }
            i++;
        }
    }

    public static boolean y0(String str) {
        i3.d.e(str, "<this>");
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (!Character.isWhitespace(charAt) && !Character.isSpaceChar(charAt)) {
                return false;
            }
        }
        return true;
    }

    public static int z0(String str, char c5, int i, int i4) {
        if ((i4 & 2) != 0) {
            i = t0(str);
        }
        return str.lastIndexOf(c5, i);
    }
}
