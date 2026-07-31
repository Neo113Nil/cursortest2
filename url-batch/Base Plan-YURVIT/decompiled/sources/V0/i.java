package V0;

/* loaded from: classes.dex */
public abstract class i extends h {
    public static final int O(CharSequence charSequence) {
        P0.h.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static boolean P(CharSequence charSequence) {
        P0.h.e(charSequence, "<this>");
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            char charAt = charSequence.charAt(i2);
            if (!Character.isWhitespace(charAt) && !Character.isSpaceChar(charAt)) {
                return false;
            }
        }
        return true;
    }

    public static String Q(String str, String str2) {
        P0.h.e(str2, "delimiter");
        int indexOf = str.indexOf(str2, 0);
        if (indexOf == -1) {
            return str;
        }
        String substring = str.substring(str2.length() + indexOf, str.length());
        P0.h.d(substring, "substring(...)");
        return substring;
    }
}
