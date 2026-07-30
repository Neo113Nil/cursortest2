package defpackage;

import com.google.firebase.encoders.json.BuildConfig;
import kotlin.text.b;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class tp2 extends b {
    public static boolean h(String str, String str2, boolean z) {
        str.getClass();
        return !z ? str.endsWith(str2) : str.regionMatches(true, str.length() - str2.length(), str2, 0, str2.length());
    }

    public static boolean i(String str, String str2, boolean z) {
        return str == null ? str2 == null : !z ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static final boolean j(int i, int i2, int i3, String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        return !z ? str.regionMatches(i, str2, i2, i3) : str.regionMatches(z, i, str2, i2, i3);
    }

    public static String k(int i, String str) {
        if (i < 0) {
            ey.j("Count 'n' must be non-negative, but was ", i, 46);
            return null;
        }
        if (i == 0) {
            return BuildConfig.FLAVOR;
        }
        int i2 = 1;
        if (i == 1) {
            return str.toString();
        }
        int length = str.length();
        if (length == 0) {
            return BuildConfig.FLAVOR;
        }
        if (length != 1) {
            StringBuilder sb = new StringBuilder(str.length() * i);
            if (1 <= i) {
                while (true) {
                    sb.append((CharSequence) str);
                    if (i2 == i) {
                        break;
                    }
                    i2++;
                }
            }
            return sb.toString();
        }
        char charAt = str.charAt(0);
        char[] cArr = new char[i];
        for (int i3 = 0; i3 < i; i3++) {
            cArr[i3] = charAt;
        }
        return new String(cArr);
    }

    public static String l(String str, char c, char c2) {
        str.getClass();
        String replace = str.replace(c, c2);
        replace.getClass();
        return replace;
    }

    public static String m(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        int u = up2.u(str, str2, 0, false);
        if (u < 0) {
            return str;
        }
        int length = str2.length();
        int i = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i2 = 0;
        do {
            sb.append((CharSequence) str, i2, u);
            sb.append(str3);
            i2 = u + length;
            if (u >= str.length()) {
                break;
            }
            u = up2.u(str, str2, u + i, false);
        } while (u > 0);
        sb.append((CharSequence) str, i2, str.length());
        return sb.toString();
    }

    public static boolean n(String str, String str2, int i, boolean z) {
        str.getClass();
        return !z ? str.startsWith(str2, i) : j(i, 0, str2.length(), str, str2, z);
    }

    public static boolean o(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        return !z ? str.startsWith(str2) : j(0, 0, str2.length(), str, str2, z);
    }
}
