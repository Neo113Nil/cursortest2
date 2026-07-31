package com.yandex.div.core.view2.divs;

import O1.Ib;
import O1.Kd;
import android.util.DisplayMetrics;
import com.yandex.div.core.view2.divs.widgets.DivLineHeightTextView;
import com.yandex.div.core.view2.spannable.ShadowData;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class DivTextBinder$bindTextShadow$callback$1 extends s implements Function1<Object, Unit> {
    final /* synthetic */ DisplayMetrics $displayMetrics;
    final /* synthetic */ Kd $newDiv;
    final /* synthetic */ ExpressionResolver $resolver;
    final /* synthetic */ Ib $shadow;
    final /* synthetic */ DivLineHeightTextView $this_bindTextShadow;
    final /* synthetic */ DivTextBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivTextBinder$bindTextShadow$callback$1(DivTextBinder divTextBinder, DivLineHeightTextView divLineHeightTextView, Ib ib, ExpressionResolver expressionResolver, DisplayMetrics displayMetrics, Kd kd) {
        super(1);
        this.this$0 = divTextBinder;
        this.$this_bindTextShadow = divLineHeightTextView;
        this.$shadow = ib;
        this.$resolver = expressionResolver;
        this.$displayMetrics = displayMetrics;
        this.$newDiv = kd;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m141invoke(obj);
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m141invoke(@NotNull Object obj) {
        ShadowData shadowData;
        Intrinsics.checkNotNullParameter(obj, "<anonymous parameter 0>");
        DivTextBinder divTextBinder = this.this$0;
        DivLineHeightTextView divLineHeightTextView = this.$this_bindTextShadow;
        Ib ib = this.$shadow;
        if (ib != null) {
            ExpressionResolver expressionResolver = this.$resolver;
            DisplayMetrics displayMetrics = this.$displayMetrics;
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "displayMetrics");
            shadowData = divTextBinder.getShadowData(ib, expressionResolver, displayMetrics, ((Number) this.$newDiv.f3475Z.evaluate(this.$resolver)).intValue());
        } else {
            shadowData = null;
        }
        divTextBinder.applyTextShadow(divLineHeightTextView, shadowData);
    }
}
