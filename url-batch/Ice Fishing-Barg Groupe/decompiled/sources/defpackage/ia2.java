package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class ia2 extends pa2 {
    public static boolean D0aTLcX6Uhyo(CharSequence charSequence, char c) {
        charSequence.getClass();
        return rxipThha848g(charSequence, c, 0, 2) >= 0;
    }

    public static CharSequence GlTbNTgfSMqy(String str) {
        str.getClass();
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean J54yh1s3n4Aq = ov2.J54yh1s3n4Aq(str.charAt(!z ? i : length));
            if (z) {
                if (!J54yh1s3n4Aq) {
                    break;
                }
                length--;
            } else if (J54yh1s3n4Aq) {
                i++;
            } else {
                z = true;
            }
        }
        return str.subSequence(i, length + 1);
    }

    public static String JLGWdXyAxbxj(String str, int i) {
        str.getClass();
        if (i < 0) {
            u9.e9gEMXR7LXtO(o0.OPXfSBeufaJ8(i, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(0, i);
    }

    public static final int JTxCbbCwomzt(CharSequence charSequence, String str, int i, boolean z) {
        charSequence.getClass();
        str.getClass();
        return (z || !(charSequence instanceof String)) ? VzNxmvWisHL1(charSequence, str, i, charSequence.length(), z, false) : ((String) charSequence).indexOf(str, i);
    }

    public static List Nlhe969cAGO8(String str) {
        s11 s11Var = new s11(str);
        if (!s11Var.hasNext()) {
            return p50.rtx2ld2ELZv4;
        }
        Object next = s11Var.next();
        if (!s11Var.hasNext()) {
            return fx1.jJwa0q7P5wHq(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (s11Var.hasNext()) {
            arrayList.add(s11Var.next());
        }
        return arrayList;
    }

    public static boolean PsecLrZVVK61(CharSequence charSequence, String str) {
        return charSequence instanceof String ? ((String) charSequence).endsWith(str) : uURZJOrwXbxn(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    public static final int VzNxmvWisHL1(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        yq0 yq0Var;
        if (z2) {
            charSequence.getClass();
            int length = charSequence.length() - 1;
            if (i > length) {
                i = length;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            yq0.Companion.getClass();
            yq0Var = new yq0(i, i2, -1);
        } else {
            if (i < 0) {
                i = 0;
            }
            int length2 = charSequence.length();
            if (i2 > length2) {
                i2 = length2;
            }
            yq0Var = new br0(i, i2, 1);
        }
        boolean z3 = charSequence instanceof String;
        int i3 = yq0Var.wdg6QnbFHrFF;
        int i4 = yq0Var.OPXfSBeufaJ8;
        int i5 = yq0Var.rtx2ld2ELZv4;
        if (!z3 || !(charSequence2 instanceof String)) {
            boolean z4 = z;
            if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
                while (true) {
                    CharSequence charSequence3 = charSequence;
                    CharSequence charSequence4 = charSequence2;
                    boolean z5 = z4;
                    z4 = z5;
                    if (!uURZJOrwXbxn(charSequence4, 0, charSequence3, i5, charSequence2.length(), z5)) {
                        if (i5 == i4) {
                            break;
                        }
                        i5 += i3;
                        charSequence2 = charSequence4;
                        charSequence = charSequence3;
                    } else {
                        return i5;
                    }
                }
            }
        } else if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
            int i6 = i5;
            while (true) {
                String str = (String) charSequence2;
                boolean z6 = z;
                if (!pa2.IXK6ba3ucyzm(0, i6, str.length(), str, (String) charSequence, z6)) {
                    if (i6 == i4) {
                        break;
                    }
                    i6 += i3;
                    z = z6;
                } else {
                    return i6;
                }
            }
        }
        return -1;
    }

    public static String cJeY36nTk9tz(String str, String str2, String str3) {
        int hVNtCUZb4tYH = hVNtCUZb4tYH(str, str2, 0, false, 6);
        return hVNtCUZb4tYH == -1 ? str3 : str.substring(str2.length() + hVNtCUZb4tYH, str.length());
    }

    public static String e4HgwifUDUCA(String str, int i) {
        CharSequence charSequence;
        str.getClass();
        if (i < 0) {
            u9.XL4ISE6Oc65B(o0.OPXfSBeufaJ8(i, "Desired length ", " is less than zero."));
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

    public static boolean fRTaYY6FBZcX(CharSequence charSequence) {
        charSequence.getClass();
        for (int i = 0; i < charSequence.length(); i++) {
            if (!ov2.J54yh1s3n4Aq(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ int hVNtCUZb4tYH(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return JTxCbbCwomzt(charSequence, str, i, z);
    }

    public static String hnJvRxDXo0hm(String str) {
        str.getClass();
        str.getClass();
        int v6yxfmkxNKhL = v6yxfmkxNKhL(str, '/', 0, 6);
        return v6yxfmkxNKhL == -1 ? str : str.substring(v6yxfmkxNKhL + 1, str.length());
    }

    public static final List iSxsmagYqzHM(CharSequence charSequence, String str) {
        int JTxCbbCwomzt = JTxCbbCwomzt(charSequence, str, 0, false);
        if (JTxCbbCwomzt == -1) {
            return fx1.jJwa0q7P5wHq(charSequence.toString());
        }
        ArrayList arrayList = new ArrayList(10);
        int i = 0;
        do {
            arrayList.add(charSequence.subSequence(i, JTxCbbCwomzt).toString());
            i = str.length() + JTxCbbCwomzt;
            JTxCbbCwomzt = JTxCbbCwomzt(charSequence, str, i, false);
        } while (JTxCbbCwomzt != -1);
        arrayList.add(charSequence.subSequence(i, charSequence.length()).toString());
        return arrayList;
    }

    public static boolean jJwa0q7P5wHq(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        charSequence.getClass();
        charSequence2.getClass();
        if (charSequence2 instanceof String) {
            if (hVNtCUZb4tYH(charSequence, (String) charSequence2, 0, z, 2) >= 0) {
                return true;
            }
        } else if (VzNxmvWisHL1(charSequence, charSequence2, 0, charSequence.length(), z, false) >= 0) {
            return true;
        }
        return false;
    }

    public static int rxipThha848g(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        charSequence.getClass();
        return !(charSequence instanceof String) ? uVlwi32qvXeJ(charSequence, new char[]{c}, i, false) : ((String) charSequence).indexOf(c, i);
    }

    public static final boolean uURZJOrwXbxn(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        charSequence.getClass();
        charSequence2.getClass();
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!ov2.jyegZNwi31qc(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static final int uVlwi32qvXeJ(CharSequence charSequence, char[] cArr, int i, boolean z) {
        charSequence.getClass();
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(na.GlTbNTgfSMqy(cArr), i);
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
                if (ov2.jyegZNwi31qc(c, charAt, z)) {
                    return i;
                }
            }
            if (i == length) {
                return -1;
            }
            i++;
        }
    }

    public static List uy1Qfkdvj4xZ(String str, char[] cArr) {
        int i = 1;
        if (cArr.length == 1) {
            return iSxsmagYqzHM(str, String.valueOf(cArr[0]));
        }
        un0 un0Var = new un0(i, new fy(str, new l4(18, cArr)));
        ArrayList arrayList = new ArrayList(al.KZw9XyiywG4x(un0Var, 10));
        Iterator it = un0Var.iterator();
        while (true) {
            ey eyVar = (ey) it;
            if (!eyVar.hasNext()) {
                return arrayList;
            }
            br0 br0Var = (br0) eyVar.next();
            br0Var.getClass();
            arrayList.add(str.subSequence(br0Var.rtx2ld2ELZv4, br0Var.OPXfSBeufaJ8 + 1).toString());
        }
    }

    public static int v6yxfmkxNKhL(String str, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            str.getClass();
            i = str.length() - 1;
        }
        str.getClass();
        return str.lastIndexOf(c, i);
    }
}
