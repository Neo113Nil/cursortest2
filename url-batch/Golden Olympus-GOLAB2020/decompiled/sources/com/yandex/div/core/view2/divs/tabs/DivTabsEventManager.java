package com.yandex.div.core.view2.divs.tabs;

import O1.C0892k0;
import O1.C1013qd;
import androidx.viewpager.widget.ViewPager;
import com.ironsource.c9;
import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.DivVisibilityActionTracker;
import com.yandex.div.core.view2.divs.DivActionBinder;
import com.yandex.div.core.view2.divs.widgets.DivTabsLayout;
import com.yandex.div.internal.KLog;
import com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi;
import com.yandex.div.logging.Severity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class DivTabsEventManager implements ViewPager.j, BaseDivTabbedCardUi.ActiveTabClickListener<C0892k0> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final DivActionBinder actionBinder;

    @NotNull
    private final BindingContext context;
    private int currentPagePosition;

    @NotNull
    private C1013qd div;

    @NotNull
    private final Div2Logger div2Logger;

    @NotNull
    private final DivTabsLayout tabLayout;

    @NotNull
    private final DivVisibilityActionTracker visibilityActionTracker;

    @Metadata
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public DivTabsEventManager(@NotNull BindingContext context, @NotNull DivActionBinder actionBinder, @NotNull Div2Logger div2Logger, @NotNull DivVisibilityActionTracker visibilityActionTracker, @NotNull DivTabsLayout tabLayout, @NotNull C1013qd div) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(actionBinder, "actionBinder");
        Intrinsics.checkNotNullParameter(div2Logger, "div2Logger");
        Intrinsics.checkNotNullParameter(visibilityActionTracker, "visibilityActionTracker");
        Intrinsics.checkNotNullParameter(tabLayout, "tabLayout");
        Intrinsics.checkNotNullParameter(div, "div");
        this.context = context;
        this.actionBinder = actionBinder;
        this.div2Logger = div2Logger;
        this.visibilityActionTracker = visibilityActionTracker;
        this.tabLayout = tabLayout;
        this.div = div;
        this.currentPagePosition = -1;
    }

    public final void onPageDisplayed(int i4) {
        int i5 = this.currentPagePosition;
        if (i4 == i5) {
            return;
        }
        if (i5 != -1) {
            this.visibilityActionTracker.cancelTrackingViewsHierarchy(this.context, this.tabLayout, ((C1013qd.c) this.div.f7630q.get(i5)).f7643a);
            this.context.getDivView().unbindViewFromDiv$div_release(this.tabLayout);
        }
        C1013qd.c cVar = (C1013qd.c) this.div.f7630q.get(i4);
        this.visibilityActionTracker.startTrackingViewsHierarchy(this.context, this.tabLayout, cVar.f7643a);
        this.context.getDivView().bindViewToDiv$div_release(this.tabLayout, cVar.f7643a);
        this.currentPagePosition = i4;
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
        onPageDisplayed(i4);
    }

    public final void setDiv(@NotNull C1013qd c1013qd) {
        Intrinsics.checkNotNullParameter(c1013qd, "<set-?>");
        this.div = c1013qd;
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.ActiveTabClickListener
    public void onActiveTabClicked(@NotNull C0892k0 action, int i4) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action.f6756e != null) {
            KLog kLog = KLog.INSTANCE;
            if (kLog.isAtLeast(Severity.WARNING)) {
                kLog.print(5, "DivTabsEventManager", "non-null menuItems ignored in title click action");
            }
        }
        this.div2Logger.logActiveTabTitleClick(this.context.getDivView(), this.context.getExpressionResolver(), i4, action);
        DivActionBinder.handleAction$div_release$default(this.actionBinder, this.context.getDivView(), this.context.getExpressionResolver(), action, c9.f15700d, null, null, 48, null);
    }
}
