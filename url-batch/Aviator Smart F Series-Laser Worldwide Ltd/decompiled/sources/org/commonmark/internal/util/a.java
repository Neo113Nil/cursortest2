package org.commonmark.internal.util;

import cn.hutool.core.util.i1;
import cn.hutool.core.util.l;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public class a {
    public static final String ENTITY = "&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});";
    public static final String ESCAPABLE = "[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]";
    private static final Pattern BACKSLASH_OR_AMP = Pattern.compile("[\\\\&]");
    private static final Pattern ENTITY_OR_ESCAPED_CHAR = Pattern.compile("\\\\[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]|&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);
    private static final Pattern ESCAPE_IN_URI = Pattern.compile("(%[a-fA-F0-9]{0,2}|[^:/?#@!$&'()*+,;=a-zA-Z0-9\\-._~])");
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static final Pattern WHITESPACE = Pattern.compile("[ \t\r\n]+");
    private static final c UNESCAPE_REPLACER = new C0397a();
    private static final c URI_REPLACER = new b();

    /* renamed from: org.commonmark.internal.util.a$a, reason: collision with other inner class name */
    static class C0397a implements c {
        C0397a() {
        }

        @Override // org.commonmark.internal.util.a.c
        public void replace(String str, StringBuilder sb) {
            if (str.charAt(0) == '\\') {
                sb.append((CharSequence) str, 1, str.length());
            } else {
                sb.append(org.commonmark.internal.util.b.entityToString(str));
            }
        }
    }

    static class b implements c {
        b() {
        }

        @Override // org.commonmark.internal.util.a.c
        public void replace(String str, StringBuilder sb) {
            if (str.startsWith("%")) {
                if (str.length() == 3) {
                    sb.append(str);
                    return;
                } else {
                    sb.append("%25");
                    sb.append((CharSequence) str, 1, str.length());
                    return;
                }
            }
            for (byte b8 : str.getBytes(Charset.forName(l.UTF_8))) {
                sb.append('%');
                sb.append(a.HEX_DIGITS[(b8 >> 4) & 15]);
                sb.append(a.HEX_DIGITS[b8 & 15]);
            }
        }
    }

    private interface c {
        void replace(String str, StringBuilder sb);
    }

    public static String escapeHtml(String str) {
        String str2;
        StringBuilder sb = null;
        for (int i8 = 0; i8 < str.length(); i8++) {
            char charAt = str.charAt(i8);
            if (charAt == '\"') {
                str2 = i1.QUOTE;
            } else if (charAt == '&') {
                str2 = i1.AMP;
            } else if (charAt == '<') {
                str2 = i1.LT;
            } else if (charAt != '>') {
                if (sb != null) {
                    sb.append(charAt);
                }
            } else {
                str2 = i1.GT;
            }
            if (sb == null) {
                sb = new StringBuilder();
                sb.append((CharSequence) str, 0, i8);
            }
            sb.append(str2);
        }
        return sb != null ? sb.toString() : str;
    }

    public static String normalizeLabelContent(String str) {
        return WHITESPACE.matcher(str.trim().toLowerCase(Locale.ROOT)).replaceAll(cn.hutool.core.text.l.SPACE);
    }

    public static String normalizeReference(String str) {
        return normalizeLabelContent(str.substring(1, str.length() - 1));
    }

    public static String percentEncodeUrl(String str) {
        return replaceAll(ESCAPE_IN_URI, str, URI_REPLACER);
    }

    private static String replaceAll(Pattern pattern, String str, c cVar) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length() + 16);
        int i8 = 0;
        do {
            sb.append((CharSequence) str, i8, matcher.start());
            cVar.replace(matcher.group(), sb);
            i8 = matcher.end();
        } while (matcher.find());
        if (i8 != str.length()) {
            sb.append((CharSequence) str, i8, str.length());
        }
        return sb.toString();
    }

    public static String unescapeString(String str) {
        return BACKSLASH_OR_AMP.matcher(str).find() ? replaceAll(ENTITY_OR_ESCAPED_CHAR, str, UNESCAPE_REPLACER) : str;
    }
}
