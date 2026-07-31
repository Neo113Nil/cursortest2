package com.yandex.div.core.view2.divs;

import O1.X4;
import com.yandex.div.core.view2.divs.widgets.DivSliderView;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class DivSliderBinder$observeTrackActiveStyle$1 extends s implements Function1<Object, Unit> {
    final /* synthetic */ ExpressionResolver $resolver;
    final /* synthetic */ DivSliderView $this_observeTrackActiveStyle;
    final /* synthetic */ X4 $trackStyle;
    final /* synthetic */ DivSliderBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivSliderBinder$observeTrackActiveStyle$1(DivSliderBinder divSliderBinder, DivSliderView divSliderView, ExpressionResolver expressionResolver, X4 x4) {
        super(1);
        this.this$0 = divSliderBinder;
        this.$this_observeTrackActiveStyle = divSliderView;
        this.$resolver = expressionResolver;
        this.$trackStyle = x4;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m123invoke(obj);
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m123invoke(@NotNull Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.this$0.applyTrackActiveStyle(this.$this_observeTrackActiveStyle, this.$resolver, this.$trackStyle);
    }
}
