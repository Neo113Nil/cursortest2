package j0;

import e0.h;

/* loaded from: classes.dex */
public abstract class g extends f {
    public static final int G(CharSequence charSequence) {
        h.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static String H(String str, String str2) {
        h.e(str2, "delimiter");
        int indexOf = str.indexOf(str2, 0);
        if (indexOf == -1) {
            return str;
        }
        String substring = str.substring(str2.length() + indexOf, str.length());
        h.d(substring, "substring(...)");
        return substring;
    }

    public static String I(String str) {
        int lastIndexOf = str.lastIndexOf(46, G(str));
        if (lastIndexOf == -1) {
            return str;
        }
        String substring = str.substring(lastIndexOf + 1, str.length());
        h.d(substring, "substring(...)");
        return substring;
    }
}
