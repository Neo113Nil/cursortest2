package com.yandex.div.core.util.validator;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class RegexValidator extends BaseValidator {

    @NotNull
    private final Regex regex;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegexValidator(@NotNull Regex regex, boolean z4) {
        super(z4);
        Intrinsics.checkNotNullParameter(regex, "regex");
        this.regex = regex;
    }

    @Override // com.yandex.div.core.util.validator.BaseValidator
    public boolean validate(@NotNull String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        return (getAllowEmpty() && input.length() == 0) || this.regex.d(input);
    }
}
