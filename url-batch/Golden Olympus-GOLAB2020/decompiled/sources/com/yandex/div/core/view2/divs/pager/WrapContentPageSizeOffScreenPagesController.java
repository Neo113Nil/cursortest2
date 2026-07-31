package com.yandex.div.core.view2.divs.pager;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class WrapContentPageSizeOffScreenPagesController {

    @NotNull
    private final DivPagerAdapter adapter;
    private final float itemSpacing;

    @NotNull
    private final DivPagerPaddingsHolder paddings;

    @NotNull
    private final DivPagerPageSizeProvider pageSizeProvider;

    @NotNull
    private final DivPagerView parent;
    private int sidePagesCount;

    public WrapContentPageSizeOffScreenPagesController(@NotNull DivPagerView parent, float f4, @NotNull DivPagerPageSizeProvider pageSizeProvider, @NotNull DivPagerPaddingsHolder paddings, @NotNull DivPagerAdapter adapter) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(pageSizeProvider, "pageSizeProvider");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.parent = parent;
        this.itemSpacing = f4;
        this.pageSizeProvider = pageSizeProvider;
        this.paddings = paddings;
        this.adapter = adapter;
        this.sidePagesCount = 1;
        this.sidePagesCount = calcSidePagesCount();
        setOffScreenPages(parent);
        parent.setChangePageCallbackForOffScreenPages$div_release(new DivPagerView.OffScreenPagesUpdateCallback() { // from class: com.yandex.div.core.view2.divs.pager.WrapContentPageSizeOffScreenPagesController.1
            @Override // com.yandex.div.core.view2.divs.widgets.DivPagerView.OffScreenPagesUpdateCallback, android.view.View.OnLayoutChangeListener
            public void onLayoutChange(@Nullable View view, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
                WrapContentPageSizeOffScreenPagesController.this.updateOffScreenPages();
            }

            @Override // androidx.viewpager2.widget.ViewPager2.i
            public void onPageSelected(int i4) {
                WrapContentPageSizeOffScreenPagesController.this.updateOffScreenPages();
            }
        });
    }

    private final int calcSidePagesCount() {
        Float prevNeighbourSize = this.pageSizeProvider.getPrevNeighbourSize(this.parent.getCurrentItem$div_release());
        if (prevNeighbourSize == null) {
            return 1;
        }
        float floatValue = prevNeighbourSize.floatValue();
        int currentItem$div_release = this.parent.getCurrentItem$div_release() - 1;
        int i4 = 0;
        int i5 = 0;
        while (floatValue > 0.0f && currentItem$div_release > 0) {
            i5++;
            Float pageSize = pageSize(currentItem$div_release);
            if (pageSize == null) {
                break;
            }
            floatValue -= pageSize.floatValue();
            currentItem$div_release--;
        }
        if (floatValue > this.paddings.getStart() && currentItem$div_release == 0) {
            i5++;
            Float pageSize2 = pageSize(currentItem$div_release);
            floatValue -= pageSize2 != null ? pageSize2.floatValue() : 0.0f;
        }
        Float nextNeighbourSize = this.pageSizeProvider.getNextNeighbourSize(this.parent.getCurrentItem$div_release());
        if (nextNeighbourSize == null) {
            return g.d(i5, 1);
        }
        float floatValue2 = nextNeighbourSize.floatValue();
        if (floatValue > this.paddings.getStart()) {
            floatValue2 += floatValue;
        }
        int currentItem$div_release2 = this.parent.getCurrentItem$div_release() + 1;
        while (floatValue2 > 0.0f && currentItem$div_release2 < this.adapter.getItemCount() - 1) {
            i4++;
            Float pageSize3 = pageSize(currentItem$div_release2);
            if (pageSize3 == null) {
                break;
            }
            floatValue2 -= pageSize3.floatValue();
            currentItem$div_release2++;
        }
        if (floatValue2 > this.paddings.getEnd() && currentItem$div_release2 == this.adapter.getItemCount() - 1) {
            i4++;
            Float pageSize4 = pageSize(currentItem$div_release2);
            floatValue2 -= pageSize4 != null ? pageSize4.floatValue() : 0.0f;
        }
        while (floatValue2 > 0.0f && currentItem$div_release >= 0) {
            i5++;
            Float pageSize5 = pageSize(currentItem$div_release);
            if (pageSize5 == null) {
                break;
            }
            floatValue2 -= pageSize5.floatValue();
            currentItem$div_release--;
        }
        return g.d(Math.max(i5, i4), 1);
    }

    private final Float pageSize(int i4) {
        Float itemSize = this.pageSizeProvider.getItemSize(i4);
        if (itemSize != null) {
            return Float.valueOf(itemSize.floatValue() + this.itemSpacing);
        }
        return null;
    }

    private final void setOffScreenPages(DivPagerView divPagerView) {
        RecyclerView recyclerView = divPagerView.getRecyclerView();
        if (recyclerView != null) {
            recyclerView.setItemViewCacheSize((this.sidePagesCount * 2) + 3);
        }
        divPagerView.getViewPager().setOffscreenPageLimit(this.sidePagesCount);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateOffScreenPages() {
        int calcSidePagesCount = calcSidePagesCount();
        if (calcSidePagesCount <= this.sidePagesCount) {
            return;
        }
        this.sidePagesCount = calcSidePagesCount;
        setOffScreenPages(this.parent);
    }
}
