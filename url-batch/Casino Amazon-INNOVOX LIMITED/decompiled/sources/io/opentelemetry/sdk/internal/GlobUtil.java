package io.opentelemetry.sdk.internal;

import androidx.webkit.ProxyConfig;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public final class GlobUtil {
    private GlobUtil() {
    }

    public static Predicate<String> createGlobPatternPredicate(String str) {
        Pattern pattern;
        int i = 0;
        while (true) {
            if (i >= str.length()) {
                pattern = null;
                break;
            }
            char charAt = str.charAt(i);
            if (charAt == '*' || charAt == '?') {
                break;
            }
            i++;
        }
        pattern = toRegexPattern(str);
        return new GlobPatternPredicate(str, pattern);
    }

    private static Pattern toRegexPattern(String str) {
        StringBuilder sb = new StringBuilder();
        int i = -1;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (charAt == '*' || charAt == '?') {
                if (i != -1) {
                    sb.append(Pattern.quote(str.substring(i, i2)));
                    i = -1;
                }
                if (charAt == '*') {
                    sb.append(".*");
                } else {
                    sb.append(".");
                }
            } else if (i == -1) {
                i = i2;
            }
        }
        if (i != -1) {
            sb.append(Pattern.quote(str.substring(i)));
        }
        return Pattern.compile(sb.toString());
    }

    private static class GlobPatternPredicate implements Predicate<String> {
        private final String globPattern;

        @Nullable
        private final Pattern pattern;

        private GlobPatternPredicate(String str, @Nullable Pattern pattern) {
            this.globPattern = str;
            this.pattern = pattern;
        }

        @Override // java.util.function.Predicate
        public boolean test(String str) {
            if (this.globPattern.equals(ProxyConfig.MATCH_ALL_SCHEMES)) {
                return true;
            }
            Pattern pattern = this.pattern;
            if (pattern != null) {
                return pattern.matcher(str).matches();
            }
            return this.globPattern.equalsIgnoreCase(str);
        }

        public String toString() {
            return "GlobPatternPredicate{globPattern=" + this.globPattern + "}";
        }
    }
}
