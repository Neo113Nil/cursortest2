package org.commonmark.internal.util;

import io.noties.markwon.LinkResolverDef;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes10.dex */
public abstract class Escaping {
    public static final Pattern BACKSLASH_OR_AMP = Pattern.compile("[\\\\&]");
    public static final Pattern ENTITY_OR_ESCAPED_CHAR = Pattern.compile("\\\\[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]|&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);
    public static final LinkResolverDef UNESCAPE_REPLACER;
    public static final Pattern WHITESPACE;

    static {
        Pattern.compile("(%[a-fA-F0-9]{0,2}|[^:/?#@!$&'()*+,;=a-zA-Z0-9\\-._~])");
        WHITESPACE = Pattern.compile("[ \t\r\n]+");
        UNESCAPE_REPLACER = new LinkResolverDef(23);
    }

    public static String unescapeString(String str) {
        if (!BACKSLASH_OR_AMP.matcher(str).find()) {
            return str;
        }
        Matcher matcher = ENTITY_OR_ESCAPED_CHAR.matcher(str);
        if (!matcher.find()) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length() + 16);
        int i = 0;
        do {
            sb.append((CharSequence) str, i, matcher.start());
            String group = matcher.group();
            UNESCAPE_REPLACER.getClass();
            if (group.charAt(0) == '\\') {
                sb.append((CharSequence) group, 1, group.length());
            } else {
                sb.append(Html5Entities.entityToString(group));
            }
            i = matcher.end();
        } while (matcher.find());
        if (i != str.length()) {
            sb.append((CharSequence) str, i, str.length());
        }
        return sb.toString();
    }
}
