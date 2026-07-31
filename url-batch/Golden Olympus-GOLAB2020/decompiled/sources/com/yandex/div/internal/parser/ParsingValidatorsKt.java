package com.yandex.div.internal.parser;

import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public abstract class ParsingValidatorsKt {
    public static final boolean doesMatch(@NotNull String str, @NotNull String regex) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(regex, "regex");
        return Pattern.matches(regex, str);
    }
}
