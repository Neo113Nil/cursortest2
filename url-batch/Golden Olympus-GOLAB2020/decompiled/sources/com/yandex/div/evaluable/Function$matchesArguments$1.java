package com.yandex.div.evaluable;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class Function$matchesArguments$1 extends s implements Function2<EvaluableType, EvaluableType, Boolean> {
    public static final Function$matchesArguments$1 INSTANCE = new Function$matchesArguments$1();

    Function$matchesArguments$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public final Boolean invoke(@NotNull EvaluableType type, @NotNull EvaluableType declaredType) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(declaredType, "declaredType");
        return Boolean.valueOf(type == declaredType);
    }
}
