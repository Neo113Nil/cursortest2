package o2;

import android.net.Uri;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class k0 {
    private static int[] a(String str) {
        int i7;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int indexOf = str.indexOf(35);
        if (indexOf != -1) {
            length = indexOf;
        }
        int indexOf2 = str.indexOf(63);
        if (indexOf2 == -1 || indexOf2 > length) {
            indexOf2 = length;
        }
        int indexOf3 = str.indexOf(47);
        if (indexOf3 == -1 || indexOf3 > indexOf2) {
            indexOf3 = indexOf2;
        }
        int indexOf4 = str.indexOf(58);
        if (indexOf4 > indexOf3) {
            indexOf4 = -1;
        }
        int i8 = indexOf4 + 2;
        if (i8 < indexOf2 && str.charAt(indexOf4 + 1) == '/' && str.charAt(i8) == '/') {
            i7 = str.indexOf(47, indexOf4 + 3);
            if (i7 == -1 || i7 > indexOf2) {
                i7 = indexOf2;
            }
        } else {
            i7 = indexOf4 + 1;
        }
        iArr[0] = indexOf4;
        iArr[1] = i7;
        iArr[2] = indexOf2;
        iArr[3] = length;
        return iArr;
    }

    public static boolean b(String str) {
        return (str == null || a(str)[0] == -1) ? false : true;
    }

    private static String c(StringBuilder sb, int i7, int i8) {
        int i9;
        int i10;
        if (i7 >= i8) {
            return sb.toString();
        }
        if (sb.charAt(i7) == '/') {
            i7++;
        }
        int i11 = i7;
        int i12 = i11;
        while (i11 <= i8) {
            if (i11 == i8) {
                i9 = i11;
            } else if (sb.charAt(i11) == '/') {
                i9 = i11 + 1;
            } else {
                i11++;
            }
            int i13 = i12 + 1;
            if (i11 == i13 && sb.charAt(i12) == '.') {
                sb.delete(i12, i9);
                i8 -= i9 - i12;
            } else {
                if (i11 == i12 + 2 && sb.charAt(i12) == '.' && sb.charAt(i13) == '.') {
                    i10 = sb.lastIndexOf("/", i12 - 2) + 1;
                    int i14 = i10 > i7 ? i10 : i7;
                    sb.delete(i14, i9);
                    i8 -= i9 - i14;
                } else {
                    i10 = i11 + 1;
                }
                i12 = i10;
            }
            i11 = i12;
        }
        return sb.toString();
    }

    public static String d(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] a7 = a(str2);
        if (a7[0] != -1) {
            sb.append(str2);
            c(sb, a7[1], a7[2]);
            return sb.toString();
        }
        int[] a8 = a(str);
        if (a7[3] == 0) {
            sb.append((CharSequence) str, 0, a8[3]);
            sb.append(str2);
            return sb.toString();
        }
        if (a7[2] == 0) {
            sb.append((CharSequence) str, 0, a8[2]);
            sb.append(str2);
            return sb.toString();
        }
        if (a7[1] != 0) {
            int i7 = a8[0] + 1;
            sb.append((CharSequence) str, 0, i7);
            sb.append(str2);
            return c(sb, a7[1] + i7, i7 + a7[2]);
        }
        if (str2.charAt(a7[1]) == '/') {
            sb.append((CharSequence) str, 0, a8[1]);
            sb.append(str2);
            return c(sb, a8[1], a8[1] + a7[2]);
        }
        if (a8[0] + 2 < a8[1] && a8[1] == a8[2]) {
            sb.append((CharSequence) str, 0, a8[1]);
            sb.append('/');
            sb.append(str2);
            return c(sb, a8[1], a8[1] + a7[2] + 1);
        }
        int lastIndexOf = str.lastIndexOf(47, a8[2] - 1);
        int i8 = lastIndexOf == -1 ? a8[1] : lastIndexOf + 1;
        sb.append((CharSequence) str, 0, i8);
        sb.append(str2);
        return c(sb, a8[1], i8 + a7[2]);
    }

    public static Uri e(String str, String str2) {
        return Uri.parse(d(str, str2));
    }
}
