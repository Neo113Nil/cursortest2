package com.yandex.div.core.view2.divs;

import com.yandex.div.core.view2.divs.widgets.DivInputView;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class DivInputBinder$observeHighlightColor$callback$1 extends s implements Function1<Object, Unit> {
    final /* synthetic */ Expression<Integer> $highlightColorExpr;
    final /* synthetic */ ExpressionResolver $resolver;
    final /* synthetic */ DivInputView $this_observeHighlightColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivInputBinder$observeHighlightColor$callback$1(DivInputView divInputView, Expression<Integer> expression, ExpressionResolver expressionResolver) {
        super(1);
        this.$this_observeHighlightColor = divInputView;
        this.$highlightColorExpr = expression;
        this.$resolver = expressionResolver;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m105invoke(obj);
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m105invoke(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<anonymous parameter 0>");
        this.$this_observeHighlightColor.setHighlightColor(this.$highlightColorExpr.evaluate(this.$resolver).intValue());
    }
}
