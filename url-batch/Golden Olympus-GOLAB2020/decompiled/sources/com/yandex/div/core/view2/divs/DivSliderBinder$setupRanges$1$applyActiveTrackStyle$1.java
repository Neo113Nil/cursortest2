package com.yandex.div.core.view2.divs;

import O1.X4;
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
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class DivSliderBinder$setupRanges$1$applyActiveTrackStyle$1 extends s implements Function1<Object, Unit> {
    final /* synthetic */ DisplayMetrics $metrics;
    final /* synthetic */ SliderView.Range $range;
    final /* synthetic */ ExpressionResolver $resolver;
    final /* synthetic */ DivSliderView $this_setupRanges;
    final /* synthetic */ X4 $trackActiveStyle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivSliderBinder$setupRanges$1$applyActiveTrackStyle$1(DivSliderView divSliderView, SliderView.Range range, X4 x4, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver) {
        super(1);
        this.$this_setupRanges = divSliderView;
        this.$range = range;
        this.$trackActiveStyle = x4;
        this.$metrics = displayMetrics;
        this.$resolver = expressionResolver;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m125invoke(obj);
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m125invoke(@NotNull Object obj) {
        DivSliderBinder.Companion unused;
        Intrinsics.checkNotNullParameter(obj, "<anonymous parameter 0>");
        unused = DivSliderBinder.Companion;
        DivSliderView divSliderView = this.$this_setupRanges;
        SliderView.Range range = this.$range;
        X4 x4 = this.$trackActiveStyle;
        DisplayMetrics metrics = this.$metrics;
        ExpressionResolver expressionResolver = this.$resolver;
        Intrinsics.checkNotNullExpressionValue(metrics, "metrics");
        range.setActiveTrackDrawable(BaseDivViewExtensionsKt.toDrawable(x4, metrics, expressionResolver));
        divSliderView.requestLayout();
        divSliderView.invalidate();
    }
}
