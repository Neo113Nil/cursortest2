package com.yandex.div.json.expressions;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Add missing generic type declarations: [T] */
@Metadata
/* loaded from: classes2.dex */
final class MutableExpressionList$observe$itemCallback$1<T> extends s implements Function1<T, Unit> {
    final /* synthetic */ Function1<List<? extends T>, Unit> $callback;
    final /* synthetic */ ExpressionResolver $resolver;
    final /* synthetic */ MutableExpressionList<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    MutableExpressionList$observe$itemCallback$1(Function1<? super List<? extends T>, Unit> function1, MutableExpressionList<T> mutableExpressionList, ExpressionResolver expressionResolver) {
        super(1);
        this.$callback = function1;
        this.this$0 = mutableExpressionList;
        this.$resolver = expressionResolver;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m232invoke((MutableExpressionList$observe$itemCallback$1<T>) obj);
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m232invoke(@NotNull T t4) {
        Intrinsics.checkNotNullParameter(t4, "<anonymous parameter 0>");
        this.$callback.invoke(this.this$0.evaluate(this.$resolver));
    }
}
