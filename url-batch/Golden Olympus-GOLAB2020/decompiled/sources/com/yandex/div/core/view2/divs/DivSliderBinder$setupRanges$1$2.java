package com.yandex.div.core.view2.divs;

import com.yandex.div.core.view2.divs.DivSliderBinder;
import com.yandex.div.core.view2.divs.widgets.DivSliderView;
import com.yandex.div.internal.widget.slider.SliderView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

@Metadata
/* loaded from: classes2.dex */
final class DivSliderBinder$setupRanges$1$2 extends s implements Function1<Long, Unit> {
    final /* synthetic */ SliderView.Range $range;
    final /* synthetic */ DivSliderView $this_setupRanges;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivSliderBinder$setupRanges$1$2(DivSliderView divSliderView, SliderView.Range range) {
        super(1);
        this.$this_setupRanges = divSliderView;
        this.$range = range;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).longValue());
        return Unit.f41027a;
    }

    public final void invoke(long j4) {
        DivSliderBinder.Companion unused;
        unused = DivSliderBinder.Companion;
        DivSliderView divSliderView = this.$this_setupRanges;
        this.$range.setEndValue(j4);
        divSliderView.requestLayout();
        divSliderView.invalidate();
    }
}
