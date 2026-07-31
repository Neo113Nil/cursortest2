package com.yandex.div.core.view2.divs;

import O1.R3;
import com.yandex.div.core.view2.divs.widgets.DivWrapLayout;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class DivContainerBinder$bindLineSeparator$$inlined$bindSeparatorShowMode$1 extends s implements Function1<Object, Unit> {
    final /* synthetic */ R3.e $newSeparator;
    final /* synthetic */ ExpressionResolver $resolver;
    final /* synthetic */ ExpressionResolver $resolver$inlined;
    final /* synthetic */ DivWrapLayout $this_bindLineSeparator$inlined;
    final /* synthetic */ DivContainerBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivContainerBinder$bindLineSeparator$$inlined$bindSeparatorShowMode$1(R3.e eVar, ExpressionResolver expressionResolver, DivWrapLayout divWrapLayout, DivContainerBinder divContainerBinder, ExpressionResolver expressionResolver2) {
        super(1);
        this.$newSeparator = eVar;
        this.$resolver = expressionResolver;
        this.$this_bindLineSeparator$inlined = divWrapLayout;
        this.this$0 = divContainerBinder;
        this.$resolver$inlined = expressionResolver2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m83invoke(obj);
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m83invoke(@NotNull Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.$this_bindLineSeparator$inlined.setShowLineSeparators(this.this$0.toSeparatorMode(this.$newSeparator, this.$resolver$inlined));
    }
}
