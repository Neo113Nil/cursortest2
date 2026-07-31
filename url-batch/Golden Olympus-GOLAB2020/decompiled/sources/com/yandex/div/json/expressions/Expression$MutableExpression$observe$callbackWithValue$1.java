package com.yandex.div.json.expressions;

import com.yandex.div.json.expressions.Expression;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

@Metadata
/* loaded from: classes2.dex */
final class Expression$MutableExpression$observe$callbackWithValue$1 extends s implements Function0<Unit> {
    final /* synthetic */ Function1<T, Unit> $callback;
    final /* synthetic */ ExpressionResolver $resolver;
    final /* synthetic */ Expression.MutableExpression<R, T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    Expression$MutableExpression$observe$callbackWithValue$1(Function1<? super T, Unit> function1, Expression.MutableExpression<R, T> mutableExpression, ExpressionResolver expressionResolver) {
        super(0);
        this.$callback = function1;
        this.this$0 = mutableExpression;
        this.$resolver = expressionResolver;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m231invoke();
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m231invoke() {
        this.$callback.invoke(this.this$0.evaluate(this.$resolver));
    }
}
