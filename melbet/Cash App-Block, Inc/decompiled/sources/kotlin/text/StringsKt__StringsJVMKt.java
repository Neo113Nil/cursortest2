package kotlin.text;

import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.collections.AbstractList;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public class StringsKt__StringsJVMKt extends StringsKt__StringNumberConversionsKt {
    public static boolean contentEquals(CharSequence charSequence, CharSequence charSequence2) {
        boolean z = charSequence instanceof String;
        if (z && charSequence2 != null) {
            return ((String) charSequence).contentEquals(charSequence2);
        }
        if (z && (charSequence2 instanceof String)) {
            return charSequence.equals(charSequence2);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence != null && charSequence2 != null && charSequence.length() == charSequence2.length()) {
            int length = charSequence.length();
            for (int i = 0; i < length; i++) {
                if (charSequence.charAt(i) == charSequence2.charAt(i)) {
                }
            }
            return true;
        }
        return false;
    }

    public static String decodeToString$default(int i, int i2, int i3, byte[] bArr) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        bArr.getClass();
        AbstractList.Companion companion = AbstractList.Companion;
        int length = bArr.length;
        companion.getClass();
        AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(i, i2, length);
        return new String(bArr, i, i2 - i, Charsets.UTF_8);
    }

    public static boolean endsWith(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        return !z ? str.endsWith(str2) : str.regionMatches(true, str.length() - str2.length(), str2, 0, str2.length());
    }

    public static boolean equals(String str, String str2, boolean z) {
        return str == null ? str2 == null : !z ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static boolean regionMatches(int i, int i2, int i3, String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        return !z ? str.regionMatches(i, str2, i2, i3) : str.regionMatches(z, i, str2, i2, i3);
    }

    public static String repeat(int i, String str) {
        str.getClass();
        if (i < 0) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Count 'n' must be non-negative, but was ", i, '.'));
            return null;
        }
        if (i == 0) {
            return "";
        }
        int i2 = 1;
        if (i == 1) {
            return str.toString();
        }
        int length = str.length();
        if (length == 0) {
            return "";
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

    public static String replace(String str, char c, char c2, boolean z) {
        str.getClass();
        if (!z) {
            String replace = str.replace(c, c2);
            replace.getClass();
            return replace;
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (CharsKt__CharKt.equals(charAt, c, z)) {
                charAt = c2;
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    public static String replace$default(String str, String str2, String str3) {
        re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
        int indexOf = StringsKt__StringsKt.indexOf(0, str, str2, false);
        if (indexOf < 0) {
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
            sb.append((CharSequence) str, i2, indexOf);
            sb.append(str3);
            i2 = indexOf + length;
            if (indexOf >= str.length()) {
                break;
            }
            indexOf = StringsKt__StringsKt.indexOf(indexOf + i, str, str2, false);
        } while (indexOf > 0);
        sb.append((CharSequence) str, i2, str.length());
        return sb.toString();
    }

    public static String replaceFirst(String str, String str2, String str3, boolean z) {
        str.getClass();
        int indexOf$default = StringsKt.indexOf$default(str, str2, 0, z, 2);
        return indexOf$default < 0 ? str : StringsKt.replaceRange(str, indexOf$default, str2.length() + indexOf$default, str3).toString();
    }

    public static boolean startsWith(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        return !z ? str.startsWith(str2) : regionMatches(0, 0, str2.length(), str, str2, z);
    }

    public static boolean startsWith(String str, String str2, int i, boolean z) {
        str.getClass();
        if (!z) {
            return str.startsWith(str2, i);
        }
        return regionMatches(i, 0, str2.length(), str, str2, z);
    }
}
