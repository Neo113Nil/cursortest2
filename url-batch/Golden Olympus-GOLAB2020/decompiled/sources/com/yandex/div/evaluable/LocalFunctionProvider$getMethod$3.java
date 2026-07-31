package com.yandex.div.evaluable;

import com.yandex.div.evaluable.Function;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class LocalFunctionProvider$getMethod$3 extends s implements Function1<Function, Function.MatchResult> {
    final /* synthetic */ List<EvaluableType> $args;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    LocalFunctionProvider$getMethod$3(List<? extends EvaluableType> list) {
        super(1);
        this.$args = list;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Function.MatchResult invoke(@NotNull Function findFunction) {
        Intrinsics.checkNotNullParameter(findFunction, "$this$findFunction");
        return findFunction.matchesArgumentsWithCast$div_evaluable(this.$args);
    }
}
