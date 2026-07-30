package L0;

import F0.i;

/* loaded from: classes.dex */
public abstract class h extends g {
    public static final int P(CharSequence charSequence) {
        i.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static boolean Q(CharSequence charSequence) {
        i.e(charSequence, "<this>");
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            char charAt = charSequence.charAt(i2);
            if (!Character.isWhitespace(charAt) && !Character.isSpaceChar(charAt)) {
                return false;
            }
        }
        return true;
    }

    public static String R(String str, String str2) {
        i.e(str2, "delimiter");
        int indexOf = str.indexOf(str2, 0);
        if (indexOf == -1) {
            return str;
        }
        String substring = str.substring(str2.length() + indexOf, str.length());
        i.d(substring, "substring(...)");
        return substring;
    }

    public static String S(String str, String str2) {
        i.e(str2, "missingDelimiterValue");
        int lastIndexOf = str.lastIndexOf(46, P(str));
        if (lastIndexOf == -1) {
            return str2;
        }
        String substring = str.substring(lastIndexOf + 1, str.length());
        i.d(substring, "substring(...)");
        return substring;
    }
}
