package com.yandex.div.core.view2.divs.tabs;

import O1.C1013qd;
import com.yandex.div.core.view2.divs.widgets.DivTabsLayout;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

@Metadata
/* loaded from: classes2.dex */
final class DivTabsBinder$bindAdapter$4 extends s implements Function1<Boolean, Unit> {
    final /* synthetic */ C1013qd $div;
    final /* synthetic */ DivTabsLayout $view;
    final /* synthetic */ DivTabsBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivTabsBinder$bindAdapter$4(DivTabsLayout divTabsLayout, DivTabsBinder divTabsBinder, C1013qd c1013qd) {
        super(1);
        this.$view = divTabsLayout;
        this.this$0 = divTabsBinder;
        this.$div = c1013qd;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return Unit.f41027a;
    }

    public final void invoke(boolean z4) {
        Set<Integer> disabledScrollPages;
        DivTabsAdapter divTabsAdapter = this.$view.getDivTabsAdapter();
        if (divTabsAdapter != null) {
            disabledScrollPages = this.this$0.getDisabledScrollPages(this.$div.f7630q.size() - 1, z4);
            divTabsAdapter.setDisabledScrollPages(disabledScrollPages);
        }
    }
}
