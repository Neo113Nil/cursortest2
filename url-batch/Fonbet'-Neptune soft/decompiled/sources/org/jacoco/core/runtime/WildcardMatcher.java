package org.jacoco.core.runtime;

import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public class WildcardMatcher {
    private final Pattern pattern;

    public WildcardMatcher(String str) {
        String[] split = str.split("\\:");
        StringBuilder sb = new StringBuilder(str.length() * 2);
        int length = split.length;
        int i = 0;
        boolean z = false;
        while (i < length) {
            String str2 = split[i];
            if (z) {
                sb.append('|');
            }
            sb.append('(');
            sb.append(toRegex(str2));
            sb.append(')');
            i++;
            z = true;
        }
        this.pattern = Pattern.compile(sb.toString());
    }

    private static CharSequence toRegex(String str) {
        StringBuilder sb = new StringBuilder(str.length() * 2);
        for (char c : str.toCharArray()) {
            if (c == '*') {
                sb.append(".*");
            } else if (c == '?') {
                sb.append(".");
            } else {
                sb.append(Pattern.quote(String.valueOf(c)));
            }
        }
        return sb;
    }

    public boolean matches(String str) {
        return this.pattern.matcher(str).matches();
    }
}
