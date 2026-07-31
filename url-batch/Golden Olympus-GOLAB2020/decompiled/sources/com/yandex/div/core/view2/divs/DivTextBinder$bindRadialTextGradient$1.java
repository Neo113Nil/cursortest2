package com.yandex.div.core.view2.divs;

import O1.Aa;
import O1.C1171za;
import O1.Na;
import android.util.DisplayMetrics;
import com.yandex.div.core.view2.divs.widgets.DivLineHeightTextView;
import com.yandex.div.internal.drawable.RadialGradientDrawable;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class DivTextBinder$bindRadialTextGradient$1 extends s implements Function1<List<? extends Integer>, Unit> {
    final /* synthetic */ DisplayMetrics $displayMetrics;
    final /* synthetic */ C1171za $newTextGradient;
    final /* synthetic */ ExpressionResolver $resolver;
    final /* synthetic */ DivLineHeightTextView $this_bindRadialTextGradient;
    final /* synthetic */ DivTextBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivTextBinder$bindRadialTextGradient$1(DivTextBinder divTextBinder, DivLineHeightTextView divLineHeightTextView, C1171za c1171za, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver) {
        super(1);
        this.this$0 = divTextBinder;
        this.$this_bindRadialTextGradient = divLineHeightTextView;
        this.$newTextGradient = c1171za;
        this.$displayMetrics = displayMetrics;
        this.$resolver = expressionResolver;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<Integer>) obj);
        return Unit.f41027a;
    }

    public final void invoke(@NotNull List<Integer> colors) {
        RadialGradientDrawable.Radius radialGradientDrawableRadius;
        RadialGradientDrawable.Center radialGradientDrawableCenter;
        RadialGradientDrawable.Center radialGradientDrawableCenter2;
        Intrinsics.checkNotNullParameter(colors, "colors");
        DivTextBinder divTextBinder = this.this$0;
        DivLineHeightTextView divLineHeightTextView = this.$this_bindRadialTextGradient;
        Na na = this.$newTextGradient.f8813e;
        DisplayMetrics displayMetrics = this.$displayMetrics;
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "displayMetrics");
        radialGradientDrawableRadius = divTextBinder.toRadialGradientDrawableRadius(na, displayMetrics, this.$resolver);
        DivTextBinder divTextBinder2 = this.this$0;
        Aa aa = this.$newTextGradient.f8809a;
        DisplayMetrics displayMetrics2 = this.$displayMetrics;
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "displayMetrics");
        radialGradientDrawableCenter = divTextBinder2.toRadialGradientDrawableCenter(aa, displayMetrics2, this.$resolver);
        DivTextBinder divTextBinder3 = this.this$0;
        Aa aa2 = this.$newTextGradient.f8810b;
        DisplayMetrics displayMetrics3 = this.$displayMetrics;
        Intrinsics.checkNotNullExpressionValue(displayMetrics3, "displayMetrics");
        radialGradientDrawableCenter2 = divTextBinder3.toRadialGradientDrawableCenter(aa2, displayMetrics3, this.$resolver);
        divTextBinder.applyRadialTextGradientColor(divLineHeightTextView, radialGradientDrawableRadius, radialGradientDrawableCenter, radialGradientDrawableCenter2, colors);
    }
}
