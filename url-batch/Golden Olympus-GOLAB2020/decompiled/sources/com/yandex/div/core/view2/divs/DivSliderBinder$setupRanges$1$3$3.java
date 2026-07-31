package com.yandex.div.core.view2.divs;

import O1.EnumC0779dc;
import android.util.DisplayMetrics;
import com.yandex.div.core.view2.divs.DivSliderBinder;
import com.yandex.div.core.view2.divs.widgets.DivSliderView;
import com.yandex.div.internal.widget.slider.SliderView;
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
final class DivSliderBinder$setupRanges$1$3$3 extends s implements Function1<EnumC0779dc, Unit> {
    final /* synthetic */ Expression<Long> $marginEnd;
    final /* synthetic */ Expression<Long> $marginStart;
    final /* synthetic */ DisplayMetrics $metrics;
    final /* synthetic */ SliderView.Range $range;
    final /* synthetic */ ExpressionResolver $resolver;
    final /* synthetic */ DivSliderView $this_setupRanges;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivSliderBinder$setupRanges$1$3$3(DivSliderView divSliderView, Expression<Long> expression, Expression<Long> expression2, SliderView.Range range, ExpressionResolver expressionResolver, DisplayMetrics displayMetrics) {
        super(1);
        this.$this_setupRanges = divSliderView;
        this.$marginStart = expression;
        this.$marginEnd = expression2;
        this.$range = range;
        this.$resolver = expressionResolver;
        this.$metrics = displayMetrics;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((EnumC0779dc) obj);
        return Unit.f41027a;
    }

    public final void invoke(@NotNull EnumC0779dc unit) {
        DivSliderBinder.Companion companion;
        DivSliderBinder.Companion companion2;
        DivSliderBinder.Companion unused;
        Intrinsics.checkNotNullParameter(unit, "unit");
        unused = DivSliderBinder.Companion;
        DivSliderView divSliderView = this.$this_setupRanges;
        Expression<Long> expression = this.$marginStart;
        Expression<Long> expression2 = this.$marginEnd;
        SliderView.Range range = this.$range;
        ExpressionResolver expressionResolver = this.$resolver;
        DisplayMetrics metrics = this.$metrics;
        if (expression != null) {
            companion2 = DivSliderBinder.Companion;
            long longValue = expression.evaluate(expressionResolver).longValue();
            Intrinsics.checkNotNullExpressionValue(metrics, "metrics");
            range.setMarginStart(companion2.castToUnit(longValue, unit, metrics));
        }
        if (expression2 != null) {
            companion = DivSliderBinder.Companion;
            long longValue2 = expression2.evaluate(expressionResolver).longValue();
            Intrinsics.checkNotNullExpressionValue(metrics, "metrics");
            range.setMarginEnd(companion.castToUnit(longValue2, unit, metrics));
        }
        divSliderView.requestLayout();
        divSliderView.invalidate();
    }
}
