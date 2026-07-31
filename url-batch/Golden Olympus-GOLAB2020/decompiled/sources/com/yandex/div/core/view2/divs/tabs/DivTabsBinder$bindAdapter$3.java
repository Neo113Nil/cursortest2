package com.yandex.div.core.view2.divs.tabs;

import O1.C1013qd;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.divs.widgets.DivTabsLayout;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

@Metadata
/* loaded from: classes2.dex */
final class DivTabsBinder$bindAdapter$3 extends s implements Function1<Boolean, Unit> {
    final /* synthetic */ BindingContext $bindingContext;
    final /* synthetic */ C1013qd $div;
    final /* synthetic */ DivBinder $divBinder;
    final /* synthetic */ List<DivSimpleTab> $list;
    final /* synthetic */ DivStatePath $path;
    final /* synthetic */ ExpressionResolver $resolver;
    final /* synthetic */ DivTabsLayout $view;
    final /* synthetic */ DivTabsBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivTabsBinder$bindAdapter$3(DivTabsLayout divTabsLayout, C1013qd c1013qd, ExpressionResolver expressionResolver, DivTabsBinder divTabsBinder, BindingContext bindingContext, DivBinder divBinder, DivStatePath divStatePath, List<DivSimpleTab> list) {
        super(1);
        this.$view = divTabsLayout;
        this.$div = c1013qd;
        this.$resolver = expressionResolver;
        this.this$0 = divTabsBinder;
        this.$bindingContext = bindingContext;
        this.$divBinder = divBinder;
        this.$path = divStatePath;
        this.$list = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return Unit.f41027a;
    }

    public final void invoke(boolean z4) {
        int i4;
        PagerController pager;
        DivTabsAdapter divTabsAdapter = this.$view.getDivTabsAdapter();
        if (divTabsAdapter == null || divTabsAdapter.isDynamicHeight() != z4) {
            DivTabsBinder divTabsBinder = this.this$0;
            BindingContext bindingContext = this.$bindingContext;
            C1013qd c1013qd = this.$div;
            DivTabsLayout divTabsLayout = this.$view;
            DivBinder divBinder = this.$divBinder;
            DivStatePath divStatePath = this.$path;
            List<DivSimpleTab> list = this.$list;
            DivTabsAdapter divTabsAdapter2 = divTabsLayout.getDivTabsAdapter();
            if (divTabsAdapter2 == null || (pager = divTabsAdapter2.getPager()) == null) {
                long longValue = ((Number) this.$div.f7638y.evaluate(this.$resolver)).longValue();
                long j4 = longValue >> 31;
                if (j4 == 0 || j4 == -1) {
                    i4 = (int) longValue;
                } else {
                    KAssert kAssert = KAssert.INSTANCE;
                    if (Assert.isEnabled()) {
                        Assert.fail("Unable convert '" + longValue + "' to Int");
                    }
                    i4 = longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
            } else {
                i4 = pager.getCurrentItemIndex();
            }
            DivTabsBinder.bindAdapter$setupNewAdapter(divTabsBinder, bindingContext, c1013qd, divTabsLayout, divBinder, divStatePath, list, i4);
        }
    }
}
