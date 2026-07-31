package com.yandex.div.core.view2.divs.tabs;

import O1.EnumC0791e6;
import com.yandex.div.core.font.DivTypefaceType;
import com.yandex.div.internal.widget.tabs.TabView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class DivTabsBinderKt$observeStyle$1 extends s implements Function1<EnumC0791e6, Unit> {
    final /* synthetic */ TabView $this_observeStyle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivTabsBinderKt$observeStyle$1(TabView tabView) {
        super(1);
        this.$this_observeStyle = tabView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((EnumC0791e6) obj);
        return Unit.f41027a;
    }

    public final void invoke(@NotNull EnumC0791e6 divFontWeight) {
        DivTypefaceType typefaceType;
        Intrinsics.checkNotNullParameter(divFontWeight, "divFontWeight");
        TabView tabView = this.$this_observeStyle;
        typefaceType = DivTabsBinderKt.toTypefaceType(divFontWeight);
        tabView.setInactiveTypefaceType(typefaceType);
    }
}
