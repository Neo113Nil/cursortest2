package com.yandex.div.core.view2;

import O1.Z;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import kotlin.collections.C3218h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class Div2View$itemSequenceForTransition$1 extends s implements Function1<Z, Boolean> {
    final /* synthetic */ ExpressionResolver $resolver;
    final /* synthetic */ C3218h $selectors;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Div2View$itemSequenceForTransition$1(C3218h c3218h, ExpressionResolver expressionResolver) {
        super(1);
        this.$selectors = c3218h;
        this.$resolver = expressionResolver;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull Z div) {
        Intrinsics.checkNotNullParameter(div, "div");
        if (div instanceof Z.o) {
            this.$selectors.addLast(((Z.o) div).c().f1492B.evaluate(this.$resolver));
        }
        return Boolean.TRUE;
    }
}
