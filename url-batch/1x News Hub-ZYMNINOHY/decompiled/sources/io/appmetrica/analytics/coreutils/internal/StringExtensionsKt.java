package io.appmetrica.analytics.coreutils.internal;

import java.util.Locale;
import kotlin.jvm.internal.j;

/* loaded from: classes.dex */
public final class StringExtensionsKt {
    public static final String replaceFirstCharWithTitleCase(String str) {
        return replaceFirstCharWithTitleCase(str, Locale.US);
    }

    public static final String replaceFirstCharWithTitleCase(String str, Locale locale) {
        String valueOf;
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char charAt = str.charAt(0);
        if (Character.isLowerCase(charAt)) {
            j.e(locale, "locale");
            String valueOf2 = String.valueOf(charAt);
            j.c(valueOf2, "null cannot be cast to non-null type java.lang.String");
            valueOf = valueOf2.toUpperCase(locale);
            j.d(valueOf, "toUpperCase(...)");
            if (valueOf.length() <= 1) {
                String valueOf3 = String.valueOf(charAt);
                j.c(valueOf3, "null cannot be cast to non-null type java.lang.String");
                String upperCase = valueOf3.toUpperCase(Locale.ROOT);
                j.d(upperCase, "toUpperCase(...)");
                if (valueOf.equals(upperCase)) {
                    valueOf = String.valueOf(Character.toTitleCase(charAt));
                }
            } else if (charAt != 329) {
                char charAt2 = valueOf.charAt(0);
                String substring = valueOf.substring(1);
                j.d(substring, "substring(...)");
                String lowerCase = substring.toLowerCase(Locale.ROOT);
                j.d(lowerCase, "toLowerCase(...)");
                valueOf = charAt2 + lowerCase;
            }
        } else {
            valueOf = String.valueOf(charAt);
        }
        sb.append((Object) valueOf);
        sb.append(str.substring(1));
        return sb.toString();
    }
}
