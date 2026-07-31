package com.yandex.div.internal.widget.tabs;

import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.widget.tabs.HeightCalculatorFactory;

/* loaded from: classes2.dex */
public class MaxCardHeightCalculator extends BaseCardHeightCalculator {
    public MaxCardHeightCalculator(@NonNull ViewGroup viewGroup, @NonNull HeightCalculatorFactory.MeasureTabHeightFn measureTabHeightFn, @NonNull HeightCalculatorFactory.GetTabCountFn getTabCountFn) {
        super(viewGroup, measureTabHeightFn, getTabCountFn);
    }

    private boolean firstTabDiffers() {
        Assert.assertTrue(this.mTabsHeightCache.size() > 0);
        SparseArray<TabMeasurement> sparseArray = this.mTabsHeightCache;
        TabMeasurement valueAt = sparseArray.valueAt(sparseArray.size() - 1);
        return valueAt.getFirstTabHeight() != valueAt.getMaxTabHeight();
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseCardHeightCalculator
    protected int getOptimalHeight(@NonNull TabMeasurement tabMeasurement, int i4, float f4) {
        if (i4 > 0) {
            return tabMeasurement.getMaxTabHeight();
        }
        if (f4 < 0.01f) {
            return tabMeasurement.getFirstTabHeight();
        }
        return Math.round(tabMeasurement.getFirstTabHeight() + ((tabMeasurement.getMaxTabHeight() - r3) * f4));
    }

    @Override // com.yandex.div.internal.widget.tabs.ViewPagerFixedSizeLayout.HeightCalculator
    public boolean shouldRequestLayoutOnScroll(int i4, float f4) {
        return isTabsHeightsIsUnknown() || ((i4 == 0 || (i4 == 1 && f4 <= 0.0f)) && firstTabDiffers());
    }
}
