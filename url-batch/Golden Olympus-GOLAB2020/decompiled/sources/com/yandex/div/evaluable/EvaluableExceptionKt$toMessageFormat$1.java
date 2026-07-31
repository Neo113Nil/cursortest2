package com.yandex.div.evaluable;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class EvaluableExceptionKt$toMessageFormat$1 extends s implements Function1<Object, CharSequence> {
    public static final EvaluableExceptionKt$toMessageFormat$1 INSTANCE = new EvaluableExceptionKt$toMessageFormat$1();

    EvaluableExceptionKt$toMessageFormat$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final CharSequence invoke(@NotNull Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return EvaluableExceptionKt.toMessageFormat(it);
    }
}
