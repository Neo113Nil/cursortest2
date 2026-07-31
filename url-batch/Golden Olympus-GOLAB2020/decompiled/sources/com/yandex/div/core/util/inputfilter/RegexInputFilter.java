package com.yandex.div.core.util.inputfilter;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class RegexInputFilter implements BaseInputFilter {

    @NotNull
    private final Regex regex;

    public RegexInputFilter(@NotNull String pattern) {
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        this.regex = new Regex(pattern);
    }

    @Override // com.yandex.div.core.util.inputfilter.BaseInputFilter
    public boolean checkValue(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return this.regex.d(value);
    }
}
