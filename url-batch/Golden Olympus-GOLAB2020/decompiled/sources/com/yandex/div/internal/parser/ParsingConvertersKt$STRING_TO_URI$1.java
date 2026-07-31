package com.yandex.div.internal.parser;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class ParsingConvertersKt$STRING_TO_URI$1 extends s implements Function1<String, Uri> {
    public static final ParsingConvertersKt$STRING_TO_URI$1 INSTANCE = new ParsingConvertersKt$STRING_TO_URI$1();

    ParsingConvertersKt$STRING_TO_URI$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Uri invoke(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        Uri parse = Uri.parse(value);
        Intrinsics.checkNotNullExpressionValue(parse, "parse(value)");
        return parse;
    }
}
