package com.yandex.div.internal.parser;

import android.net.Uri;
import com.yandex.div.evaluable.types.Url;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class ParsingConvertersKt$ANY_TO_URI$1 extends s implements Function1<Object, Uri> {
    public static final ParsingConvertersKt$ANY_TO_URI$1 INSTANCE = new ParsingConvertersKt$ANY_TO_URI$1();

    ParsingConvertersKt$ANY_TO_URI$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Uri invoke(@NotNull Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof String) {
            Uri parse = Uri.parse((String) value);
            Intrinsics.checkNotNullExpressionValue(parse, "parse(value)");
            return parse;
        }
        if (!(value instanceof Url)) {
            throw new ClassCastException("Received value of wrong type");
        }
        Uri parse2 = Uri.parse(((Url) value).m227unboximpl());
        Intrinsics.checkNotNullExpressionValue(parse2, "parse(value.value)");
        return parse2;
    }
}
