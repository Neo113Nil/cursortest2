package com.yandex.div.core.view2.divs;

import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

@Metadata
/* loaded from: classes2.dex */
final class DivLayoutProviderVariablesHolder$observe$1 extends s implements Function1<Long, Unit> {
    final /* synthetic */ ExpressionResolver $resolver;
    final /* synthetic */ Expression.MutableExpression<?, Long> $sizeExpr;
    final /* synthetic */ DivLayoutProviderVariablesHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivLayoutProviderVariablesHolder$observe$1(DivLayoutProviderVariablesHolder divLayoutProviderVariablesHolder, Expression.MutableExpression<?, Long> mutableExpression, ExpressionResolver expressionResolver) {
        super(1);
        this.this$0 = divLayoutProviderVariablesHolder;
        this.$sizeExpr = mutableExpression;
        this.$resolver = expressionResolver;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).longValue());
        return Unit.f41027a;
    }

    public final void invoke(long j4) {
        List list;
        list = this.this$0.changedVariables;
        list.addAll(this.$sizeExpr.getVariablesName(this.$resolver));
    }
}
