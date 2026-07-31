package com.yandex.div.core.view2.divs;

import com.yandex.div.core.view2.divs.widgets.DivInputView;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
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
final class DivInputBinder$observeMaxVisibleLines$callback$1 extends s implements Function1<Object, Unit> {
    final /* synthetic */ Expression<Long> $maxLinesExpr;
    final /* synthetic */ ExpressionResolver $resolver;
    final /* synthetic */ DivInputView $this_observeMaxVisibleLines;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivInputBinder$observeMaxVisibleLines$callback$1(DivInputView divInputView, Expression<Long> expression, ExpressionResolver expressionResolver) {
        super(1);
        this.$this_observeMaxVisibleLines = divInputView;
        this.$maxLinesExpr = expression;
        this.$resolver = expressionResolver;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m114invoke(obj);
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m114invoke(@NotNull Object obj) {
        int i4;
        Intrinsics.checkNotNullParameter(obj, "<anonymous parameter 0>");
        DivInputView divInputView = this.$this_observeMaxVisibleLines;
        long longValue = this.$maxLinesExpr.evaluate(this.$resolver).longValue();
        long j4 = longValue >> 31;
        if (j4 == 0 || j4 == -1) {
            i4 = (int) longValue;
        } else {
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("Unable convert '" + longValue + "' to Int");
            }
            i4 = longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        divInputView.setMaxLines(i4);
    }
}
