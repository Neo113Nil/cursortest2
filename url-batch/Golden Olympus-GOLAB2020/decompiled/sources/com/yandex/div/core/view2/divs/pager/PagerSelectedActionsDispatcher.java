package com.yandex.div.core.view2.divs.pager;

import androidx.viewpager2.widget.ViewPager2;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.DivActionBinder;
import com.yandex.div.internal.KLog;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.logging.Severity;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C3218h;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class PagerSelectedActionsDispatcher {

    @NotNull
    private final DivActionBinder divActionBinder;

    @NotNull
    private final Div2View divView;

    @NotNull
    private final List<DivItemBuilderResult> items;

    @Nullable
    private ViewPager2.i pageSelectionTracker;

    @Metadata
    private final class PageSelectionTracker extends ViewPager2.i {
        private int currentPage = -1;

        @NotNull
        private final C3218h selectedPages = new C3218h();

        public PageSelectionTracker() {
        }

        private final void trackSelectedPages() {
            while (!this.selectedPages.isEmpty()) {
                int intValue = ((Number) this.selectedPages.removeFirst()).intValue();
                KLog kLog = KLog.INSTANCE;
                if (kLog.isAtLeast(Severity.DEBUG)) {
                    kLog.print(3, "Ya:PagerSelectedActionsTracker", "dispatch selected actions for page " + intValue);
                }
                PagerSelectedActionsDispatcher pagerSelectedActionsDispatcher = PagerSelectedActionsDispatcher.this;
                pagerSelectedActionsDispatcher.dispatchSelectedActions((DivItemBuilderResult) pagerSelectedActionsDispatcher.items.get(intValue));
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void onPageScrollStateChanged(int i4) {
            if (i4 == 0) {
                trackSelectedPages();
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void onPageSelected(int i4) {
            KLog kLog = KLog.INSTANCE;
            if (kLog.isAtLeast(Severity.DEBUG)) {
                kLog.print(3, "Ya:PagerSelectedActionsTracker", "onPageSelected(" + i4 + ')');
            }
            if (this.currentPage == i4) {
                return;
            }
            if (i4 != -1) {
                this.selectedPages.add(Integer.valueOf(i4));
            }
            if (this.currentPage == -1) {
                trackSelectedPages();
            }
            this.currentPage = i4;
        }
    }

    public PagerSelectedActionsDispatcher(@NotNull Div2View divView, @NotNull List<DivItemBuilderResult> items, @NotNull DivActionBinder divActionBinder) {
        Intrinsics.checkNotNullParameter(divView, "divView");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(divActionBinder, "divActionBinder");
        this.divView = divView;
        this.items = items;
        this.divActionBinder = divActionBinder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dispatchSelectedActions(DivItemBuilderResult divItemBuilderResult) {
        List k4 = divItemBuilderResult.getDiv().b().k();
        if (k4 != null) {
            this.divView.bulkActions$div_release(new PagerSelectedActionsDispatcher$dispatchSelectedActions$1$1(this, divItemBuilderResult, k4));
        }
    }

    public final void attach(@NotNull ViewPager2 viewPager) {
        Intrinsics.checkNotNullParameter(viewPager, "viewPager");
        PageSelectionTracker pageSelectionTracker = new PageSelectionTracker();
        viewPager.h(pageSelectionTracker);
        this.pageSelectionTracker = pageSelectionTracker;
    }

    public final void detach(@NotNull ViewPager2 viewPager) {
        Intrinsics.checkNotNullParameter(viewPager, "viewPager");
        ViewPager2.i iVar = this.pageSelectionTracker;
        if (iVar != null) {
            viewPager.p(iVar);
        }
        this.pageSelectionTracker = null;
    }
}
