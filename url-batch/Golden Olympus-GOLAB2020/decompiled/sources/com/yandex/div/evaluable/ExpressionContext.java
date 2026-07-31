package com.yandex.div.evaluable;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public abstract class ExpressionContext {
    @NotNull
    /* renamed from: constructor-impl, reason: not valid java name */
    public static Evaluable m170constructorimpl(@NotNull Evaluable evaluable) {
        Intrinsics.checkNotNullParameter(evaluable, "evaluable");
        return evaluable;
    }
}
