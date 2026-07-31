package com.yandex.div.internal.parser;

import com.yandex.div.internal.util.ConvertUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
final class ParsingConvertersKt$ANY_TO_BOOLEAN$1 extends s implements Function1<Object, Boolean> {
    public static final ParsingConvertersKt$ANY_TO_BOOLEAN$1 INSTANCE = new ParsingConvertersKt$ANY_TO_BOOLEAN$1();

    ParsingConvertersKt$ANY_TO_BOOLEAN$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final Boolean invoke(@NotNull Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof Boolean) {
            return (Boolean) value;
        }
        if (value instanceof Number) {
            return ConvertUtilsKt.toBoolean((Number) value);
        }
        throw new ClassCastException("Received value of wrong type");
    }
}
