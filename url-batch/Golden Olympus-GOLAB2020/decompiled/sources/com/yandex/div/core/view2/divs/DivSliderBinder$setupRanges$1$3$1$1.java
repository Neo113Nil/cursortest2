package com.yandex.div.core.view2.divs;

import O1.C0754c5;
import android.util.DisplayMetrics;
import com.yandex.div.core.view2.divs.DivSliderBinder;
import com.yandex.div.core.view2.divs.widgets.DivSliderView;
import com.yandex.div.internal.widget.slider.SliderView;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

@Metadata
/* loaded from: classes2.dex */
final class DivSliderBinder$setupRanges$1$3$1$1 extends s implements Function1<Long, Unit> {
    final /* synthetic */ DisplayMetrics $metrics;
    final /* synthetic */ SliderView.Range $range;
    final /* synthetic */ ExpressionResolver $resolver;
    final /* synthetic */ DivSliderView $this_setupRanges;
    final /* synthetic */ C0754c5 $this_with;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivSliderBinder$setupRanges$1$3$1$1(DivSliderView divSliderView, SliderView.Range range, C0754c5 c0754c5, ExpressionResolver expressionResolver, DisplayMetrics displayMetrics) {
        super(1);
        this.$this_setupRanges = divSliderView;
        this.$range = range;
        this.$this_with = c0754c5;
        this.$resolver = expressionResolver;
        this.$metrics = displayMetrics;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).longValue());
        return Unit.f41027a;
    }

    public final void invoke(long j4) {
        DivSliderBinder.Companion companion;
        DivSliderBinder.Companion unused;
        unused = DivSliderBinder.Companion;
        DivSliderView divSliderView = this.$this_setupRanges;
        SliderView.Range range = this.$range;
        C0754c5 c0754c5 = this.$this_with;
        ExpressionResolver expressionResolver = this.$resolver;
        DisplayMetrics metrics = this.$metrics;
        companion = DivSliderBinder.Companion;
        Intrinsics.checkNotNullExpressionValue(metrics, "metrics");
        range.setMarginStart(companion.applyUnit(c0754c5, j4, expressionResolver, metrics));
        divSliderView.requestLayout();
        divSliderView.invalidate();
    }
}
