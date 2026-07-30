package org.commonmark.internal.util;

import okio.z0;

/* loaded from: classes5.dex */
public class d {
    private static final String ATTRIBUTE = "(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)";
    private static final String ATTRIBUTENAME = "[a-zA-Z_:][a-zA-Z0-9:._-]*";
    private static final String ATTRIBUTEVALUE = "(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\")";
    private static final String ATTRIBUTEVALUESPEC = "(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))";
    public static final String CLOSETAG = "</[A-Za-z][A-Za-z0-9-]*\\s*[>]";
    public static int CODE_BLOCK_INDENT = 4;
    private static final String DOUBLEQUOTEDVALUE = "\"[^\"]*\"";
    public static final String OPENTAG = "<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>";
    private static final String SINGLEQUOTEDVALUE = "'[^']*'";
    private static final String TAGNAME = "[A-Za-z][A-Za-z0-9-]*";
    private static final String UNQUOTEDVALUE = "[^\"'=<>`\\x00-\\x20]+";

    public static int columnsToNextTabStop(int i8) {
        return 4 - (i8 % 4);
    }

    public static int find(char c8, CharSequence charSequence, int i8) {
        int length = charSequence.length();
        while (i8 < length) {
            if (charSequence.charAt(i8) == c8) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    public static int findLineBreak(CharSequence charSequence, int i8) {
        int length = charSequence.length();
        while (i8 < length) {
            char charAt = charSequence.charAt(i8);
            if (charAt == '\n' || charAt == '\r') {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    private static int findNonSpace(CharSequence charSequence, int i8) {
        int length = charSequence.length();
        while (i8 < length) {
            char charAt = charSequence.charAt(i8);
            if (charAt != ' ') {
                switch (charAt) {
                    case '\t':
                    case '\n':
                    case 11:
                    case '\f':
                    case '\r':
                        break;
                    default:
                        return i8;
                }
            }
            i8++;
        }
        return -1;
    }

    public static boolean hasNonSpace(CharSequence charSequence) {
        int length = charSequence.length();
        return skip(' ', charSequence, 0, length) != length;
    }

    public static boolean isBlank(CharSequence charSequence) {
        return findNonSpace(charSequence, 0) == -1;
    }

    public static boolean isEscapable(CharSequence charSequence, int i8) {
        if (i8 >= charSequence.length()) {
            return false;
        }
        char charAt = charSequence.charAt(i8);
        switch (charAt) {
            case '!':
            case '\"':
            case '#':
            case '$':
            case '%':
            case '&':
            case '\'':
            case '(':
            case ')':
            case '*':
            case '+':
            case ',':
            case '-':
            case '.':
            case '/':
                return true;
            default:
                switch (charAt) {
                    case ':':
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                    case '?':
                    case '@':
                        return true;
                    default:
                        switch (charAt) {
                            case '[':
                            case '\\':
                            case ']':
                            case '^':
                            case '_':
                            case '`':
                                return true;
                            default:
                                switch (charAt) {
                                    case '{':
                                    case '|':
                                    case '}':
                                    case '~':
                                        return true;
                                    default:
                                        return false;
                                }
                        }
                }
        }
    }

    public static boolean isLetter(CharSequence charSequence, int i8) {
        return Character.isLetter(Character.codePointAt(charSequence, i8));
    }

    public static boolean isSpaceOrTab(CharSequence charSequence, int i8) {
        if (i8 >= charSequence.length()) {
            return false;
        }
        char charAt = charSequence.charAt(i8);
        return charAt == '\t' || charAt == ' ';
    }

    public static CharSequence prepareLine(CharSequence charSequence) {
        int length = charSequence.length();
        StringBuilder sb = null;
        for (int i8 = 0; i8 < length; i8++) {
            char charAt = charSequence.charAt(i8);
            if (charAt == 0) {
                if (sb == null) {
                    sb = new StringBuilder(length);
                    sb.append(charSequence, 0, i8);
                }
                sb.append(z0.REPLACEMENT_CHARACTER);
            } else if (sb != null) {
                sb.append(charAt);
            }
        }
        return sb != null ? sb.toString() : charSequence;
    }

    public static int skip(char c8, CharSequence charSequence, int i8, int i9) {
        while (i8 < i9) {
            if (charSequence.charAt(i8) != c8) {
                return i8;
            }
            i8++;
        }
        return i9;
    }

    public static int skipBackwards(char c8, CharSequence charSequence, int i8, int i9) {
        while (i8 >= i9) {
            if (charSequence.charAt(i8) != c8) {
                return i8;
            }
            i8--;
        }
        return i9 - 1;
    }

    public static int skipSpaceTab(CharSequence charSequence, int i8, int i9) {
        while (i8 < i9) {
            char charAt = charSequence.charAt(i8);
            if (charAt != '\t' && charAt != ' ') {
                return i8;
            }
            i8++;
        }
        return i9;
    }

    public static int skipSpaceTabBackwards(CharSequence charSequence, int i8, int i9) {
        while (i8 >= i9) {
            char charAt = charSequence.charAt(i8);
            if (charAt != '\t' && charAt != ' ') {
                return i8;
            }
            i8--;
        }
        return i9 - 1;
    }
}
