package com.yandex.div.core.view2.divs.tabs;

import com.yandex.div.core.view2.divs.widgets.DivTabsLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
final class DivTabsBinder$bindAdapter$2 extends s implements Function1<Object, Unit> {
    final /* synthetic */ DivTabsLayout $view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivTabsBinder$bindAdapter$2(DivTabsLayout divTabsLayout) {
        super(1);
        this.$view = divTabsLayout;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m153invoke(obj);
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m153invoke(@Nullable Object obj) {
        DivTabsAdapter divTabsAdapter = this.$view.getDivTabsAdapter();
        if (divTabsAdapter != null) {
            divTabsAdapter.notifyStateChanged();
        }
    }
}
