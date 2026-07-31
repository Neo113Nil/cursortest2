package com.yandex.div.internal.parser;

import com.yandex.div.evaluable.types.Color;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class ParsingConvertersKt$COLOR_INT_TO_STRING$1 extends s implements Function1<Integer, String> {
    public static final ParsingConvertersKt$COLOR_INT_TO_STRING$1 INSTANCE = new ParsingConvertersKt$COLOR_INT_TO_STRING$1();

    ParsingConvertersKt$COLOR_INT_TO_STRING$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }

    @NotNull
    public final String invoke(int i4) {
        return Color.m217toStringimpl(Color.m211constructorimpl(i4));
    }
}
