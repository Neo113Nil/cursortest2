package com.yandex.div.core.view2.divs;

import O1.C0939mb;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class DivSelectBinder$observeVariable$subscription$1$onVariableChanged$matchingOptionsSequence$1 extends s implements Function1<C0939mb.c, Boolean> {
    final /* synthetic */ ExpressionResolver $resolver;
    final /* synthetic */ String $value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivSelectBinder$observeVariable$subscription$1$onVariableChanged$matchingOptionsSequence$1(ExpressionResolver expressionResolver, String str) {
        super(1);
        this.$resolver = expressionResolver;
        this.$value = str;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull C0939mb.c it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(Intrinsics.areEqual(it.f7091b.evaluate(this.$resolver), this.$value));
    }
}
