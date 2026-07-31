package com.yandex.div.core.view2.divs;

import com.yandex.div.core.view2.divs.widgets.DivSliderView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

@Metadata
/* loaded from: classes2.dex */
final class DivSliderBinder$bind$2 extends s implements Function1<Long, Unit> {
    final /* synthetic */ DivSliderView $this_bind;
    final /* synthetic */ DivSliderBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivSliderBinder$bind$2(DivSliderView divSliderView, DivSliderBinder divSliderBinder) {
        super(1);
        this.$this_bind = divSliderView;
        this.this$0 = divSliderBinder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).longValue());
        return Unit.f41027a;
    }

    public final void invoke(long j4) {
        this.$this_bind.setMaxValue(j4);
        this.this$0.checkSliderTicks(this.$this_bind);
    }
}
