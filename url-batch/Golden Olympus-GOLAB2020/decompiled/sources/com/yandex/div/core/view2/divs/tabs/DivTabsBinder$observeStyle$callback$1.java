package com.yandex.div.core.view2.divs.tabs;

import O1.C1013qd;
import com.yandex.div.core.view2.divs.widgets.DivTabsLayout;
import com.yandex.div.internal.widget.tabs.TabTitlesLayoutView;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
final class DivTabsBinder$observeStyle$callback$1 extends s implements Function1<Object, Unit> {
    final /* synthetic */ ExpressionResolver $resolver;
    final /* synthetic */ C1013qd.e $style;
    final /* synthetic */ DivTabsLayout $this_observeStyle;
    final /* synthetic */ DivTabsBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivTabsBinder$observeStyle$callback$1(DivTabsBinder divTabsBinder, DivTabsLayout divTabsLayout, ExpressionResolver expressionResolver, C1013qd.e eVar) {
        super(1);
        this.this$0 = divTabsBinder;
        this.$this_observeStyle = divTabsLayout;
        this.$resolver = expressionResolver;
        this.$style = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m157invoke(obj);
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m157invoke(@Nullable Object obj) {
        DivTabsBinder divTabsBinder = this.this$0;
        TabTitlesLayoutView<?> titleLayout = this.$this_observeStyle.getTitleLayout();
        ExpressionResolver expressionResolver = this.$resolver;
        C1013qd.e eVar = this.$style;
        if (eVar == null) {
            eVar = DivTabsBinder.DEFAULT_TAB_TITLE_STYLE;
        }
        divTabsBinder.applyStyle(titleLayout, expressionResolver, eVar);
    }
}
