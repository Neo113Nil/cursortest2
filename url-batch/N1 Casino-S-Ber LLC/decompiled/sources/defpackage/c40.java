package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class c40 extends k40 {
    public static boolean n0(CharSequence charSequence, char c) {
        charSequence.getClass();
        return r0(charSequence, c, 0, 2) >= 0;
    }

    public static boolean o0(CharSequence charSequence, CharSequence charSequence2) {
        charSequence.getClass();
        if (charSequence2 instanceof String) {
            if (p0(charSequence, (String) charSequence2, 0, false) >= 0) {
                return true;
            }
        } else if (q0(charSequence, charSequence2, 0, charSequence.length(), false) >= 0) {
            return true;
        }
        return false;
    }

    public static final int p0(CharSequence charSequence, String str, int i, boolean z) {
        charSequence.getClass();
        str.getClass();
        return (z || !(charSequence instanceof String)) ? q0(charSequence, str, i, charSequence.length(), z) : ((String) charSequence).indexOf(str, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0087 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int q0(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z) {
        boolean z2;
        boolean z3;
        boolean regionMatches;
        if (i < 0) {
            i = 0;
        }
        int length = charSequence.length();
        if (i2 > length) {
            i2 = length;
        }
        xo xoVar = new xo(i, i2, 1);
        boolean z4 = charSequence instanceof String;
        int i3 = xoVar.h;
        int i4 = xoVar.g;
        if (z4 && (charSequence2 instanceof String)) {
            if ((i3 <= 0 || i > i4) && (i3 >= 0 || i4 > i)) {
                return -1;
            }
            int i5 = i;
            while (true) {
                String str = (String) charSequence2;
                String str2 = (String) charSequence;
                int length2 = str.length();
                if (z) {
                    z3 = z;
                    regionMatches = str.regionMatches(z3, 0, str2, i5, length2);
                } else {
                    regionMatches = str.regionMatches(0, str2, i5, length2);
                    z3 = z;
                }
                if (regionMatches) {
                    return i5;
                }
                if (i5 == i4) {
                    return -1;
                }
                i5 += i3;
                z = z3;
            }
        } else {
            if ((i3 <= 0 || i > i4) && (i3 >= 0 || i4 > i)) {
                return -1;
            }
            while (true) {
                int length3 = charSequence2.length();
                charSequence2.getClass();
                charSequence.getClass();
                if (i >= 0 && charSequence2.length() - length3 >= 0 && i <= charSequence.length() - length3) {
                    for (int i6 = 0; i6 < length3; i6++) {
                        if (e70.s(charSequence2.charAt(0 + i6), charSequence.charAt(i + i6), z)) {
                        }
                    }
                    z2 = true;
                    if (!z2) {
                        return i;
                    }
                    if (i == i4) {
                        return -1;
                    }
                    i += i3;
                }
                z2 = false;
                if (!z2) {
                }
            }
        }
    }

    public static int r0(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        charSequence.getClass();
        return !(charSequence instanceof String) ? s0(charSequence, new char[]{c}, i, false) : ((String) charSequence).indexOf(c, i);
    }

    public static final int s0(CharSequence charSequence, char[] cArr, int i, boolean z) {
        charSequence.getClass();
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(q6.h0(cArr), i);
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
                if (e70.s(c, charAt, z)) {
                    return i;
                }
            }
            if (i == length) {
                return -1;
            }
            i++;
        }
    }

    public static boolean t0(CharSequence charSequence) {
        charSequence.getClass();
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            if (!Character.isWhitespace(charAt) && !Character.isSpaceChar(charAt)) {
                return false;
            }
        }
        return true;
    }

    public static int u0(String str, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = str.length() - 1;
        }
        return str.lastIndexOf(c, i);
    }

    public static String v0(String str, String str2) {
        return k40.m0(str, str2, false) ? str.substring(str2.length()) : str;
    }

    public static List w0(String str, char[] cArr) {
        int i = 0;
        if (cArr.length == 1) {
            String valueOf = String.valueOf(cArr[0]);
            int p0 = p0(str, valueOf, 0, false);
            if (p0 == -1) {
                return o8.U(str.toString());
            }
            ArrayList arrayList = new ArrayList(10);
            int i2 = 0;
            do {
                arrayList.add(str.subSequence(i2, p0).toString());
                i2 = valueOf.length() + p0;
                p0 = p0(str, valueOf, i2, false);
            } while (p0 != -1);
            arrayList.add(str.subSequence(i2, str.length()).toString());
            return arrayList;
        }
        z10 z10Var = new z10(new ef(str, new l40(i, cArr), 0));
        ArrayList arrayList2 = new ArrayList(db.G0(z10Var));
        Iterator it = z10Var.iterator();
        while (true) {
            df dfVar = (df) it;
            if (!dfVar.hasNext()) {
                return arrayList2;
            }
            xo xoVar = (xo) dfVar.next();
            xoVar.getClass();
            arrayList2.add(str.subSequence(xoVar.f, xoVar.g + 1).toString());
        }
    }

    public static String x0(String str, int i) {
        if (i < 0) {
            t8.q(i, " is less than zero.", "Requested character count ");
            return null;
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(0, i);
    }

    public static CharSequence y0(String str) {
        str.getClass();
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            char charAt = str.charAt(!z ? i : length);
            boolean z2 = Character.isWhitespace(charAt) || Character.isSpaceChar(charAt);
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        return str.subSequence(i, length + 1);
    }
}
