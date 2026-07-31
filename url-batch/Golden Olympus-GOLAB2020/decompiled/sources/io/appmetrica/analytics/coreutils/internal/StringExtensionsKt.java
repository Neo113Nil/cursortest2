package io.appmetrica.analytics.coreutils.internal;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.text.CharsKt;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public final class StringExtensionsKt {
    @NotNull
    public static final String replaceFirstCharWithTitleCase(@NotNull String str) {
        return replaceFirstCharWithTitleCase(str, Locale.US);
    }

    @NotNull
    public static final String replaceFirstCharWithTitleCase(@NotNull String str, @NotNull Locale locale) {
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char charAt = str.charAt(0);
        sb.append((Object) (Character.isLowerCase(charAt) ? CharsKt.c(charAt, locale) : String.valueOf(charAt)));
        sb.append(str.substring(1));
        return sb.toString();
    }
}
