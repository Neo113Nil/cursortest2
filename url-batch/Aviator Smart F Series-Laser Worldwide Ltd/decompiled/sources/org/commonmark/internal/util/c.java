package org.commonmark.internal.util;

/* loaded from: classes5.dex */
public class c {
    public static int scanLinkDestination(CharSequence charSequence, int i8) {
        char charAt;
        if (i8 >= charSequence.length()) {
            return -1;
        }
        if (charSequence.charAt(i8) != '<') {
            return scanLinkDestinationWithBalancedParens(charSequence, i8);
        }
        while (true) {
            i8++;
            if (i8 >= charSequence.length() || (charAt = charSequence.charAt(i8)) == '\n' || charAt == '<') {
                break;
            }
            if (charAt == '>') {
                return i8 + 1;
            }
            if (charAt == '\\') {
                int i9 = i8 + 1;
                if (d.isEscapable(charSequence, i9)) {
                    i8 = i9;
                }
            }
        }
        return -1;
    }

    private static int scanLinkDestinationWithBalancedParens(CharSequence charSequence, int i8) {
        int i9 = 0;
        int i10 = i8;
        while (i10 < charSequence.length()) {
            char charAt = charSequence.charAt(i10);
            if (charAt == 0 || charAt == ' ') {
                if (i10 != i8) {
                    return i10;
                }
                return -1;
            }
            if (charAt == '\\') {
                int i11 = i10 + 1;
                if (d.isEscapable(charSequence, i11)) {
                    i10 = i11;
                }
            } else if (charAt == '(') {
                i9++;
                if (i9 > 32) {
                    return -1;
                }
            } else if (charAt != ')') {
                if (Character.isISOControl(charAt)) {
                    if (i10 != i8) {
                        return i10;
                    }
                    return -1;
                }
            } else {
                if (i9 == 0) {
                    return i10;
                }
                i9--;
            }
            i10++;
        }
        return charSequence.length();
    }

    public static int scanLinkLabelContent(CharSequence charSequence, int i8) {
        while (i8 < charSequence.length()) {
            switch (charSequence.charAt(i8)) {
                case '[':
                    return -1;
                case '\\':
                    int i9 = i8 + 1;
                    if (!d.isEscapable(charSequence, i9)) {
                        break;
                    } else {
                        i8 = i9;
                        break;
                    }
                case ']':
                    return i8;
            }
            i8++;
        }
        return charSequence.length();
    }

    public static int scanLinkTitle(CharSequence charSequence, int i8) {
        if (i8 >= charSequence.length()) {
            return -1;
        }
        char charAt = charSequence.charAt(i8);
        char c8 = '\"';
        if (charAt != '\"') {
            c8 = '\'';
            if (charAt != '\'') {
                if (charAt != '(') {
                    return -1;
                }
                c8 = ')';
            }
        }
        int scanLinkTitleContent = scanLinkTitleContent(charSequence, i8 + 1, c8);
        if (scanLinkTitleContent != -1 && scanLinkTitleContent < charSequence.length() && charSequence.charAt(scanLinkTitleContent) == c8) {
            return scanLinkTitleContent + 1;
        }
        return -1;
    }

    public static int scanLinkTitleContent(CharSequence charSequence, int i8, char c8) {
        while (i8 < charSequence.length()) {
            char charAt = charSequence.charAt(i8);
            if (charAt == '\\') {
                int i9 = i8 + 1;
                if (d.isEscapable(charSequence, i9)) {
                    i8 = i9;
                    i8++;
                }
            }
            if (charAt == c8) {
                return i8;
            }
            if (c8 == ')' && charAt == '(') {
                return -1;
            }
            i8++;
        }
        return charSequence.length();
    }
}
