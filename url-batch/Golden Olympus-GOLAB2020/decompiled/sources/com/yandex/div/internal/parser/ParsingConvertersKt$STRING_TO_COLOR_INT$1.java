package com.yandex.div.internal.parser;

import com.yandex.div.evaluable.types.Color;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
final class ParsingConvertersKt$STRING_TO_COLOR_INT$1 extends s implements Function1<Object, Integer> {
    public static final ParsingConvertersKt$STRING_TO_COLOR_INT$1 INSTANCE = new ParsingConvertersKt$STRING_TO_COLOR_INT$1();

    ParsingConvertersKt$STRING_TO_COLOR_INT$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final Integer invoke(@Nullable Object obj) {
        if (obj instanceof String) {
            return Integer.valueOf(Color.Companion.m220parseC4zCDoM((String) obj));
        }
        if (obj instanceof Color) {
            return Integer.valueOf(((Color) obj).m218unboximpl());
        }
        if (obj == null) {
            return null;
        }
        throw new ClassCastException("Received value of wrong type");
    }
}
