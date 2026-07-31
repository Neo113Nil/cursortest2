package com.yandex.div.core.view2.divs;

import O1.C0886jc;
import com.yandex.div.core.view2.divs.widgets.DivSliderView;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

@Metadata
/* loaded from: classes2.dex */
final class DivSliderBinder$observeThumbTextStyle$1 extends s implements Function1<Integer, Unit> {
    final /* synthetic */ ExpressionResolver $resolver;
    final /* synthetic */ DivSliderView $this_observeThumbTextStyle;
    final /* synthetic */ C0886jc.d $thumbTextStyle;
    final /* synthetic */ DivSliderBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivSliderBinder$observeThumbTextStyle$1(DivSliderBinder divSliderBinder, DivSliderView divSliderView, ExpressionResolver expressionResolver, C0886jc.d dVar) {
        super(1);
        this.this$0 = divSliderBinder;
        this.$this_observeThumbTextStyle = divSliderView;
        this.$resolver = expressionResolver;
        this.$thumbTextStyle = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).intValue());
        return Unit.f41027a;
    }

    public final void invoke(int i4) {
        this.this$0.applyThumbTextStyle(this.$this_observeThumbTextStyle, this.$resolver, this.$thumbTextStyle);
    }
}
