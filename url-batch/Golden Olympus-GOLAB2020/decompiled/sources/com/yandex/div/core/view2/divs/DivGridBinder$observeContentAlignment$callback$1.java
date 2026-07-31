package com.yandex.div.core.view2.divs;

import O1.EnumC1091v2;
import O1.EnumC1109w2;
import com.yandex.div.core.view2.divs.widgets.DivGridLayout;
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
final class DivGridBinder$observeContentAlignment$callback$1 extends s implements Function1<Object, Unit> {
    final /* synthetic */ Expression<EnumC1091v2> $horizontalAlignment;
    final /* synthetic */ ExpressionResolver $resolver;
    final /* synthetic */ DivGridLayout $this_observeContentAlignment;
    final /* synthetic */ Expression<EnumC1109w2> $verticalAlignment;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivGridBinder$observeContentAlignment$callback$1(DivGridLayout divGridLayout, Expression<EnumC1091v2> expression, ExpressionResolver expressionResolver, Expression<EnumC1109w2> expression2) {
        super(1);
        this.$this_observeContentAlignment = divGridLayout;
        this.$horizontalAlignment = expression;
        this.$resolver = expressionResolver;
        this.$verticalAlignment = expression2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m97invoke(obj);
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m97invoke(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<anonymous parameter 0>");
        this.$this_observeContentAlignment.setGravity(BaseDivViewExtensionsKt.evaluateGravity(this.$horizontalAlignment.evaluate(this.$resolver), this.$verticalAlignment.evaluate(this.$resolver)));
    }
}
