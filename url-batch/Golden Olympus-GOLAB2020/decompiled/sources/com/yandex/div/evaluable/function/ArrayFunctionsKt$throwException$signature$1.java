package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableExceptionKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class ArrayFunctionsKt$throwException$signature$1 extends s implements Function1<Object, CharSequence> {
    public static final ArrayFunctionsKt$throwException$signature$1 INSTANCE = new ArrayFunctionsKt$throwException$signature$1();

    ArrayFunctionsKt$throwException$signature$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final CharSequence invoke(@NotNull Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return EvaluableExceptionKt.toMessageFormat(it);
    }
}
