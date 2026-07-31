package com.yandex.div.internal.parser;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class ParsingConvertersKt$NUMBER_TO_DOUBLE$1 extends s implements Function1<Number, Double> {
    public static final ParsingConvertersKt$NUMBER_TO_DOUBLE$1 INSTANCE = new ParsingConvertersKt$NUMBER_TO_DOUBLE$1();

    ParsingConvertersKt$NUMBER_TO_DOUBLE$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Double invoke(@NotNull Number n4) {
        Intrinsics.checkNotNullParameter(n4, "n");
        return Double.valueOf(n4.doubleValue());
    }
}
