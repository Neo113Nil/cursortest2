package com.yandex.div.internal.parser;

import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionReason;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public abstract class JsonTemplateParserKt {
    public static final void suppressMissingValueOrThrow(@NotNull ParsingException e4) {
        Intrinsics.checkNotNullParameter(e4, "e");
        if (e4.getReason() != ParsingExceptionReason.MISSING_VALUE) {
            throw e4;
        }
    }
}
