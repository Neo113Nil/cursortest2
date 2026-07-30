package cn.hutool.core.text;

/* loaded from: classes.dex */
public class m {
    public static String toCamelCase(CharSequence charSequence) {
        return toCamelCase(charSequence, '_');
    }

    public static String toKebabCase(CharSequence charSequence) {
        return toSymbolCase(charSequence, '-');
    }

    public static String toPascalCase(CharSequence charSequence) {
        return l.upperFirst(toCamelCase(charSequence));
    }

    public static String toSymbolCase(CharSequence charSequence, char c8) {
        if (charSequence == null) {
            return null;
        }
        int length = charSequence.length();
        StrBuilder strBuilder = new StrBuilder();
        int i8 = 0;
        while (i8 < length) {
            char charAt = charSequence.charAt(i8);
            if (Character.isUpperCase(charAt)) {
                Character valueOf = i8 > 0 ? Character.valueOf(charSequence.charAt(i8 - 1)) : null;
                Character valueOf2 = i8 < charSequence.length() + (-1) ? Character.valueOf(charSequence.charAt(i8 + 1)) : null;
                if (valueOf != null) {
                    if (c8 == valueOf.charValue()) {
                        if (valueOf2 == null || Character.isLowerCase(valueOf2.charValue())) {
                            charAt = Character.toLowerCase(charAt);
                        }
                    } else if (Character.isLowerCase(valueOf.charValue())) {
                        strBuilder.append(c8);
                        if (valueOf2 == null || Character.isLowerCase(valueOf2.charValue()) || cn.hutool.core.util.k.isNumber(valueOf2.charValue())) {
                            charAt = Character.toLowerCase(charAt);
                        }
                    } else if (valueOf2 != null && Character.isLowerCase(valueOf2.charValue())) {
                        strBuilder.append(c8);
                        charAt = Character.toLowerCase(charAt);
                    }
                } else if (valueOf2 == null || Character.isLowerCase(valueOf2.charValue())) {
                    charAt = Character.toLowerCase(charAt);
                }
            }
            strBuilder.append(charAt);
            i8++;
        }
        return strBuilder.toString();
    }

    public static String toUnderlineCase(CharSequence charSequence) {
        return toSymbolCase(charSequence, '_');
    }

    public static String toCamelCase(CharSequence charSequence, char c8) {
        return toCamelCase(charSequence, c8, true);
    }

    public static String toCamelCase(CharSequence charSequence, char c8, boolean z7) {
        if (charSequence == null) {
            return null;
        }
        String charSequence2 = charSequence.toString();
        if (!l.contains(charSequence2, c8)) {
            return charSequence2;
        }
        int length = charSequence2.length();
        StringBuilder sb = new StringBuilder(length);
        boolean z8 = false;
        for (int i8 = 0; i8 < length; i8++) {
            char charAt = charSequence2.charAt(i8);
            if (charAt == c8) {
                z8 = true;
            } else if (z8) {
                sb.append(Character.toUpperCase(charAt));
                z8 = false;
            } else {
                if (z7) {
                    charAt = Character.toLowerCase(charAt);
                }
                sb.append(charAt);
            }
        }
        return sb.toString();
    }
}
