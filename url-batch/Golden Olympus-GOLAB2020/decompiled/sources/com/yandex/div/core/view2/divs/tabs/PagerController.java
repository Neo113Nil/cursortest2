package com.yandex.div.core.view2.divs.tabs;

import com.yandex.div.internal.widget.tabs.ScrollableViewPager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class PagerController {

    @NotNull
    private final ScrollableViewPager scrollableViewPager;

    public PagerController(@NotNull ScrollableViewPager scrollableViewPager) {
        Intrinsics.checkNotNullParameter(scrollableViewPager, "scrollableViewPager");
        this.scrollableViewPager = scrollableViewPager;
    }

    public final int getCurrentItemIndex() {
        return this.scrollableViewPager.getCurrentItem();
    }

    public final void smoothScrollTo(int i4) {
        this.scrollableViewPager.setCurrentItem(i4, true);
    }
}
