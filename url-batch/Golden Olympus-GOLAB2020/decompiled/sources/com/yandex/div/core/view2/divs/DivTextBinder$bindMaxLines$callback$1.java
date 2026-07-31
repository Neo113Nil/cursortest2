package com.yandex.div.core.view2.divs;

import O1.Kd;
import com.yandex.div.core.view2.divs.widgets.DivLineHeightTextView;
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
final class DivTextBinder$bindMaxLines$callback$1 extends s implements Function1<Object, Unit> {
    final /* synthetic */ Kd $newDiv;
    final /* synthetic */ ExpressionResolver $resolver;
    final /* synthetic */ DivLineHeightTextView $this_bindMaxLines;
    final /* synthetic */ DivTextBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivTextBinder$bindMaxLines$callback$1(DivTextBinder divTextBinder, DivLineHeightTextView divLineHeightTextView, Kd kd, ExpressionResolver expressionResolver) {
        super(1);
        this.this$0 = divTextBinder;
        this.$this_bindMaxLines = divLineHeightTextView;
        this.$newDiv = kd;
        this.$resolver = expressionResolver;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m135invoke(obj);
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m135invoke(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<anonymous parameter 0>");
        DivTextBinder divTextBinder = this.this$0;
        DivLineHeightTextView divLineHeightTextView = this.$this_bindMaxLines;
        Expression expression = this.$newDiv.f3461L;
        Long l4 = expression != null ? (Long) expression.evaluate(this.$resolver) : null;
        Expression expression2 = this.$newDiv.f3462M;
        divTextBinder.applyMaxLines(divLineHeightTextView, l4, expression2 != null ? (Long) expression2.evaluate(this.$resolver) : null);
    }
}
