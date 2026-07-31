package com.yandex.div.core.view2.divs;

import O1.A8;
import com.yandex.div.core.util.DivDataExtensionsKt;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.widgets.DivLineHeightTextView;
import com.yandex.div.internal.graphics.ColormapKt;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class DivTextBinder$bindLinearTextGradient$callback$1 extends s implements Function1<Object, Unit> {
    final /* synthetic */ Div2View $divView;
    final /* synthetic */ A8 $newTextGradient;
    final /* synthetic */ ExpressionResolver $resolver;
    final /* synthetic */ DivLineHeightTextView $this_bindLinearTextGradient;
    final /* synthetic */ DivTextBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivTextBinder$bindLinearTextGradient$callback$1(DivTextBinder divTextBinder, DivLineHeightTextView divLineHeightTextView, A8 a8, ExpressionResolver expressionResolver, Div2View div2View) {
        super(1);
        this.this$0 = divTextBinder;
        this.$this_bindLinearTextGradient = divLineHeightTextView;
        this.$newTextGradient = a8;
        this.$resolver = expressionResolver;
        this.$divView = div2View;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m134invoke(obj);
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m134invoke(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<anonymous parameter 0>");
        this.this$0.applyLinearTextGradientColor(this.$this_bindLinearTextGradient, ((Number) this.$newTextGradient.f1312a.evaluate(this.$resolver)).longValue(), ColormapKt.checkIsNotEmpty(DivDataExtensionsKt.toColormap(this.$newTextGradient, this.$resolver), this.$divView));
    }
}
