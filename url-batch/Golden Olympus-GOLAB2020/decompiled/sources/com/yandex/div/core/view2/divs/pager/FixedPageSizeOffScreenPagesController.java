package com.yandex.div.core.view2.divs.pager;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class FixedPageSizeOffScreenPagesController {

    @NotNull
    private final DivPagerAdapter adapter;
    private final boolean infiniteScroll;
    private final float itemSpacing;

    @NotNull
    private final DivPagerPaddingsHolder paddings;

    @NotNull
    private final FixedPageSizeProvider pageSizeProvider;

    @NotNull
    private final DivPagerView parent;
    private final int parentSize;

    public FixedPageSizeOffScreenPagesController(@NotNull DivPagerView parent, int i4, float f4, @NotNull FixedPageSizeProvider pageSizeProvider, @NotNull DivPagerPaddingsHolder paddings, boolean z4, @NotNull DivPagerAdapter adapter) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(pageSizeProvider, "pageSizeProvider");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.parent = parent;
        this.parentSize = i4;
        this.itemSpacing = f4;
        this.pageSizeProvider = pageSizeProvider;
        this.paddings = paddings;
        this.infiniteScroll = z4;
        this.adapter = adapter;
        setOffScreenPages();
    }

    private final void setOffScreenPages() {
        if (this.pageSizeProvider.getItemSize() == 0.0f) {
            return;
        }
        ViewPager2 viewPager = this.parent.getViewPager();
        float itemSize = this.parentSize / (this.pageSizeProvider.getItemSize() + this.itemSpacing);
        RecyclerView recyclerView = this.parent.getRecyclerView();
        if (recyclerView != null) {
            recyclerView.setItemViewCacheSize(((int) Math.ceil(itemSize)) + 2);
        }
        if (this.pageSizeProvider.getHasOffScreenPages()) {
            viewPager.setOffscreenPageLimit(Math.max((int) Math.ceil(itemSize - 1), 1));
            return;
        }
        float neighbourSize = this.pageSizeProvider.getNeighbourSize();
        if (neighbourSize > this.itemSpacing) {
            viewPager.setOffscreenPageLimit(1);
            return;
        }
        if (this.infiniteScroll || (this.paddings.getStart() >= neighbourSize && this.paddings.getEnd() >= neighbourSize)) {
            viewPager.setOffscreenPageLimit(-1);
            return;
        }
        final FixedPageSizeOffScreenPagesController$setOffScreenPages$setOffScreenPages$1 fixedPageSizeOffScreenPagesController$setOffScreenPages$setOffScreenPages$1 = new FixedPageSizeOffScreenPagesController$setOffScreenPages$setOffScreenPages$1(this);
        fixedPageSizeOffScreenPagesController$setOffScreenPages$setOffScreenPages$1.invoke(Integer.valueOf(viewPager.getCurrentItem()));
        this.parent.setChangePageCallbackForOffScreenPages$div_release(new DivPagerView.OffScreenPagesUpdateCallback() { // from class: com.yandex.div.core.view2.divs.pager.FixedPageSizeOffScreenPagesController$setOffScreenPages$1
            @Override // androidx.viewpager2.widget.ViewPager2.i
            public void onPageSelected(int i4) {
                fixedPageSizeOffScreenPagesController$setOffScreenPages$setOffScreenPages$1.invoke(Integer.valueOf(i4));
            }
        });
    }
}
