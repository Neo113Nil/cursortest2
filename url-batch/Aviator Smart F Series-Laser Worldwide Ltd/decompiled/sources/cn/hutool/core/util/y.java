package cn.hutool.core.util;

import cn.hutool.core.text.escape.Html4Escape;
import cn.hutool.core.text.escape.Html4Unescape;
import cn.hutool.core.text.escape.XmlEscape;
import cn.hutool.core.text.escape.XmlUnescape;

/* loaded from: classes.dex */
public class y {
    private static final cn.hutool.core.lang.a0 JS_ESCAPE_FILTER = new cn.hutool.core.lang.a0() { // from class: cn.hutool.core.util.w
        @Override // cn.hutool.core.lang.a0
        public final boolean accept(Object obj) {
            boolean lambda$static$0;
            lambda$static$0 = y.lambda$static$0((Character) obj);
            return lambda$static$0;
        }
    };
    private static final String NOT_ESCAPE_CHARS = "*@-_+./";

    public static String escape(CharSequence charSequence) {
        return escape(charSequence, JS_ESCAPE_FILTER);
    }

    public static String escapeAll(CharSequence charSequence) {
        return escape(charSequence, new cn.hutool.core.lang.a0() { // from class: cn.hutool.core.util.x
            @Override // cn.hutool.core.lang.a0
            public final boolean accept(Object obj) {
                boolean lambda$escapeAll$1;
                lambda$escapeAll$1 = y.lambda$escapeAll$1((Character) obj);
                return lambda$escapeAll$1;
            }
        });
    }

    public static String escapeHtml4(CharSequence charSequence) {
        return new Html4Escape().replace(charSequence).toString();
    }

    public static String escapeXml(CharSequence charSequence) {
        return new XmlEscape().replace(charSequence).toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$escapeAll$1(Character ch) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$static$0(Character ch) {
        return !(Character.isDigit(ch.charValue()) || Character.isLowerCase(ch.charValue()) || Character.isUpperCase(ch.charValue()) || cn.hutool.core.text.l.contains(NOT_ESCAPE_CHARS, ch.charValue()));
    }

    public static String safeUnescape(String str) {
        try {
            return unescape(str);
        } catch (Exception unused) {
            return str;
        }
    }

    public static String unescape(String str) {
        if (cn.hutool.core.text.l.isBlank(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length());
        int i8 = 0;
        while (i8 < str.length()) {
            int indexOf = str.indexOf("%", i8);
            if (indexOf == i8) {
                int i9 = indexOf + 1;
                if (str.charAt(i9) == 'u') {
                    int i10 = indexOf + 2;
                    indexOf += 6;
                    sb.append((char) Integer.parseInt(str.substring(i10, indexOf), 16));
                } else {
                    indexOf += 3;
                    sb.append((char) Integer.parseInt(str.substring(i9, indexOf), 16));
                }
            } else if (indexOf == -1) {
                sb.append(str.substring(i8));
                i8 = str.length();
            } else {
                sb.append((CharSequence) str, i8, indexOf);
            }
            i8 = indexOf;
        }
        return sb.toString();
    }

    public static String unescapeHtml4(CharSequence charSequence) {
        return new Html4Unescape().replace(charSequence).toString();
    }

    public static String unescapeXml(CharSequence charSequence) {
        return new XmlUnescape().replace(charSequence).toString();
    }

    public static String escape(CharSequence charSequence, cn.hutool.core.lang.a0 a0Var) {
        if (cn.hutool.core.text.l.isEmpty(charSequence)) {
            return cn.hutool.core.text.l.str(charSequence);
        }
        StringBuilder sb = new StringBuilder(charSequence.length() * 6);
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            char charAt = charSequence.charAt(i8);
            if (!a0Var.accept(Character.valueOf(charAt))) {
                sb.append(charAt);
            } else if (charAt < 256) {
                sb.append("%");
                if (charAt < 16) {
                    sb.append("0");
                }
                sb.append(Integer.toString(charAt, 16));
            } else {
                sb.append("%u");
                if (charAt <= 4095) {
                    sb.append("0");
                }
                sb.append(Integer.toString(charAt, 16));
            }
        }
        return sb.toString();
    }
}
