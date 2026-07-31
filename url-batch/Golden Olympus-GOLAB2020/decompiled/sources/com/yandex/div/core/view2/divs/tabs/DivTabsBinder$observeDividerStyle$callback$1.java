package com.yandex.div.core.view2.divs.tabs;

import O1.C1013qd;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.divs.widgets.DivTabsLayout;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
final class DivTabsBinder$observeDividerStyle$callback$1 extends s implements Function1<Object, Unit> {
    final /* synthetic */ BindingContext $bindingContext;
    final /* synthetic */ ExpressionResolver $resolver;
    final /* synthetic */ C1013qd.d $style;
    final /* synthetic */ DivTabsLayout $this_observeDividerStyle;
    final /* synthetic */ DivTabsBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivTabsBinder$observeDividerStyle$callback$1(DivTabsBinder divTabsBinder, DivTabsLayout divTabsLayout, ExpressionResolver expressionResolver, C1013qd.d dVar, BindingContext bindingContext) {
        super(1);
        this.this$0 = divTabsBinder;
        this.$this_observeDividerStyle = divTabsLayout;
        this.$resolver = expressionResolver;
        this.$style = dVar;
        this.$bindingContext = bindingContext;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m155invoke(obj);
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m155invoke(@Nullable Object obj) {
        this.this$0.applyDelimiterStyle(this.$this_observeDividerStyle.getTitleLayout(), this.$resolver, this.$style, this.$bindingContext);
    }
}
