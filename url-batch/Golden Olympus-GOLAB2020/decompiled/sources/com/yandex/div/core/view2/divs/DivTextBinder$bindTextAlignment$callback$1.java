package com.yandex.div.core.view2.divs;

import O1.EnumC1091v2;
import O1.EnumC1109w2;
import O1.Kd;
import com.yandex.div.core.view2.divs.widgets.DivLineHeightTextView;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class DivTextBinder$bindTextAlignment$callback$1 extends s implements Function1<Object, Unit> {
    final /* synthetic */ Kd $newDiv;
    final /* synthetic */ ExpressionResolver $resolver;
    final /* synthetic */ DivLineHeightTextView $this_bindTextAlignment;
    final /* synthetic */ DivTextBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivTextBinder$bindTextAlignment$callback$1(DivTextBinder divTextBinder, DivLineHeightTextView divLineHeightTextView, Kd kd, ExpressionResolver expressionResolver) {
        super(1);
        this.this$0 = divTextBinder;
        this.$this_bindTextAlignment = divLineHeightTextView;
        this.$newDiv = kd;
        this.$resolver = expressionResolver;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m139invoke(obj);
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m139invoke(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<anonymous parameter 0>");
        this.this$0.applyTextAlignment(this.$this_bindTextAlignment, (EnumC1091v2) this.$newDiv.f3473X.evaluate(this.$resolver), (EnumC1109w2) this.$newDiv.f3474Y.evaluate(this.$resolver));
    }
}
