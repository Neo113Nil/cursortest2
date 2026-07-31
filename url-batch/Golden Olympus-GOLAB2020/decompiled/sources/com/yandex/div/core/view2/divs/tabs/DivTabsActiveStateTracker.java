package com.yandex.div.core.view2.divs.tabs;

import O1.C0892k0;
import O1.C1013qd;
import androidx.viewpager.widget.ViewPager;
import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.expression.local.DivRuntimeVisitor;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.state.TabsStateCache;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class DivTabsActiveStateTracker implements ViewPager.j, BaseDivTabbedCardUi.ActiveTabClickListener<C0892k0> {

    @NotNull
    private final BindingContext context;

    @NotNull
    private C1013qd div;

    @NotNull
    private final Div2Logger div2Logger;

    @NotNull
    private final DivStatePath path;

    @NotNull
    private final DivRuntimeVisitor runtimeVisitor;

    @NotNull
    private final TabsStateCache tabsStateCache;

    public DivTabsActiveStateTracker(@NotNull BindingContext context, @NotNull DivStatePath path, @NotNull Div2Logger div2Logger, @NotNull TabsStateCache tabsStateCache, @NotNull DivRuntimeVisitor runtimeVisitor, @NotNull C1013qd div) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(div2Logger, "div2Logger");
        Intrinsics.checkNotNullParameter(tabsStateCache, "tabsStateCache");
        Intrinsics.checkNotNullParameter(runtimeVisitor, "runtimeVisitor");
        Intrinsics.checkNotNullParameter(div, "div");
        this.context = context;
        this.path = path;
        this.div2Logger = div2Logger;
        this.tabsStateCache = tabsStateCache;
        this.runtimeVisitor = runtimeVisitor;
        this.div = div;
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.ActiveTabClickListener
    public void onActiveTabClicked(@NotNull C0892k0 action, int i4) {
        Intrinsics.checkNotNullParameter(action, "action");
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public void onPageScrollStateChanged(int i4) {
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public void onPageScrolled(int i4, float f4, int i5) {
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public void onPageSelected(int i4) {
        this.div2Logger.logTabPageChanged(this.context.getDivView(), i4);
        TabsStateCache tabsStateCache = this.tabsStateCache;
        String id = this.context.getDivView().getDataTag().getId();
        Intrinsics.checkNotNullExpressionValue(id, "context.divView.dataTag.id");
        tabsStateCache.putSelectedTab(id, this.path.getFullPath$div_release(), i4);
        this.runtimeVisitor.createAndAttachRuntimesToTabs(this.context.getDivView(), this.div, this.path, this.context.getExpressionResolver());
    }

    public final void setDiv(@NotNull C1013qd c1013qd) {
        Intrinsics.checkNotNullParameter(c1013qd, "<set-?>");
        this.div = c1013qd;
    }
}
