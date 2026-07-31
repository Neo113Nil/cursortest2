package com.yandex.div.json.expressions;

import com.yandex.div.core.CompositeDisposable;
import com.yandex.div.core.CompositeDisposableKt;
import com.yandex.div.core.Disposable;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.json.expressions.Expression;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

@Metadata
/* loaded from: classes2.dex */
final class Expression$MutableExpression$observe$1$dynamicVarCallback$1 extends s implements Function0<Unit> {
    final /* synthetic */ Function0<Unit> $callbackWithValue;
    final /* synthetic */ CompositeDisposable $disposable;
    final /* synthetic */ Evaluable $dynamicVar;
    final /* synthetic */ ExpressionResolver $resolver;
    final /* synthetic */ Expression.MutableExpression<R, T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Expression$MutableExpression$observe$1$dynamicVarCallback$1(CompositeDisposable compositeDisposable, Expression.MutableExpression<R, T> mutableExpression, Evaluable evaluable, ExpressionResolver expressionResolver, Function0<Unit> function0) {
        super(0);
        this.$disposable = compositeDisposable;
        this.this$0 = mutableExpression;
        this.$dynamicVar = evaluable;
        this.$resolver = expressionResolver;
        this.$callbackWithValue = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m230invoke();
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m230invoke() {
        Disposable observe;
        CompositeDisposable compositeDisposable = this.$disposable;
        observe = this.this$0.observe(this.$dynamicVar, this.$resolver, (Function0<Unit>) this.$callbackWithValue);
        CompositeDisposableKt.plusAssign(compositeDisposable, observe);
    }
}
