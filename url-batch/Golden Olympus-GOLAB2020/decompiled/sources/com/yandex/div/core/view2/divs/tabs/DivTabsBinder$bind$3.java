package com.yandex.div.core.view2.divs.tabs;

import com.yandex.div.core.view2.divs.widgets.DivTabsLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

@Metadata
/* loaded from: classes2.dex */
final class DivTabsBinder$bind$3 extends s implements Function1<Boolean, Unit> {
    final /* synthetic */ DivTabsLayout $this_bind;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivTabsBinder$bind$3(DivTabsLayout divTabsLayout) {
        super(1);
        this.$this_bind = divTabsLayout;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return Unit.f41027a;
    }

    public final void invoke(boolean z4) {
        this.$this_bind.getDivider().setVisibility(z4 ? 0 : 8);
    }
}
