package com.yandex.div.internal.parser;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class ParsingConvertersKt$URI_TO_STRING$1 extends s implements Function1<Uri, String> {
    public static final ParsingConvertersKt$URI_TO_STRING$1 INSTANCE = new ParsingConvertersKt$URI_TO_STRING$1();

    ParsingConvertersKt$URI_TO_STRING$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final String invoke(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        String uri2 = uri.toString();
        Intrinsics.checkNotNullExpressionValue(uri2, "uri.toString()");
        return uri2;
    }
}
