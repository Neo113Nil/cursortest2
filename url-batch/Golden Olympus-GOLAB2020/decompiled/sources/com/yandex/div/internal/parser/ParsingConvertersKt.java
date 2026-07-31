package com.yandex.div.internal.parser;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public abstract class ParsingConvertersKt {

    @NotNull
    public static final Function1<Integer, String> COLOR_INT_TO_STRING = ParsingConvertersKt$COLOR_INT_TO_STRING$1.INSTANCE;

    @NotNull
    public static final Function1<Object, Integer> STRING_TO_COLOR_INT = ParsingConvertersKt$STRING_TO_COLOR_INT$1.INSTANCE;

    @NotNull
    public static final Function1<Uri, String> URI_TO_STRING = ParsingConvertersKt$URI_TO_STRING$1.INSTANCE;

    @NotNull
    public static final Function1<String, Uri> STRING_TO_URI = ParsingConvertersKt$STRING_TO_URI$1.INSTANCE;

    @NotNull
    public static final Function1<Object, Uri> ANY_TO_URI = ParsingConvertersKt$ANY_TO_URI$1.INSTANCE;

    @NotNull
    public static final Function1<Object, Boolean> ANY_TO_BOOLEAN = ParsingConvertersKt$ANY_TO_BOOLEAN$1.INSTANCE;

    @NotNull
    public static final Function1<Number, Double> NUMBER_TO_DOUBLE = ParsingConvertersKt$NUMBER_TO_DOUBLE$1.INSTANCE;

    @NotNull
    public static final Function1<Number, Long> NUMBER_TO_INT = ParsingConvertersKt$NUMBER_TO_INT$1.INSTANCE;
}
