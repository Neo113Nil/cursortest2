package com.yandex.div.core.view2.divs;

import O1.C1060t7;
import com.yandex.div.core.view2.divs.widgets.DivInputView;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class DivInputBinder$observeHintColor$callback$1 extends s implements Function1<Object, Unit> {
    final /* synthetic */ C1060t7 $div;
    final /* synthetic */ ExpressionResolver $resolver;
    final /* synthetic */ DivInputView $this_observeHintColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivInputBinder$observeHintColor$callback$1(DivInputView divInputView, C1060t7 c1060t7, ExpressionResolver expressionResolver) {
        super(1);
        this.$this_observeHintColor = divInputView;
        this.$div = c1060t7;
        this.$resolver = expressionResolver;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m106invoke(obj);
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m106invoke(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<anonymous parameter 0>");
        this.$this_observeHintColor.setHintTextColor(((Number) this.$div.f8057y.evaluate(this.$resolver)).intValue());
    }
}
