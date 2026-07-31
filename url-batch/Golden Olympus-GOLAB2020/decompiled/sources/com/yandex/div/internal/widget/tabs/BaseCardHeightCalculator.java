package com.yandex.div.internal.widget.tabs;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.yandex.div.internal.Log;
import com.yandex.div.internal.widget.tabs.HeightCalculatorFactory;
import com.yandex.div.internal.widget.tabs.TabMeasurement;
import com.yandex.div.internal.widget.tabs.ViewPagerFixedSizeLayout;

/* loaded from: classes2.dex */
public abstract class BaseCardHeightCalculator implements ViewPagerFixedSizeLayout.HeightCalculator {

    @NonNull
    private final ViewGroup mChannelGroup;

    @NonNull
    private final HeightCalculatorFactory.GetTabCountFn mGetTabCountFn;

    @NonNull
    private final HeightCalculatorFactory.MeasureTabHeightFn mMeasureTabHeightFn;
    private Bundle mPendingState;

    @NonNull
    protected final SparseArray<TabMeasurement> mTabsHeightCache = new SparseArray<>();
    private int mPosition = 0;
    private float mPositionOffset = 0.0f;

    protected BaseCardHeightCalculator(@NonNull ViewGroup viewGroup, @NonNull HeightCalculatorFactory.MeasureTabHeightFn measureTabHeightFn, @NonNull HeightCalculatorFactory.GetTabCountFn getTabCountFn) {
        this.mChannelGroup = viewGroup;
        this.mMeasureTabHeightFn = measureTabHeightFn;
        this.mGetTabCountFn = getTabCountFn;
    }

    private static int logAndReturnHeight(int i4, int i5, float f4) {
        Log.d("[Y:BaseCardHeightCalculator]", "New optimal height for tab " + i5 + " with position offset " + f4 + " is " + i4);
        return i4;
    }

    @Override // com.yandex.div.internal.widget.tabs.ViewPagerFixedSizeLayout.HeightCalculator
    public void dropMeasureCache() {
        Log.d("[Y:BaseCardHeightCalculator]", "reseting layout...");
        this.mPendingState = null;
        this.mTabsHeightCache.clear();
    }

    protected abstract int getOptimalHeight(@NonNull TabMeasurement tabMeasurement, int i4, float f4);

    protected boolean isTabsHeightsIsUnknown() {
        return this.mTabsHeightCache.size() == 0;
    }

    @Override // com.yandex.div.internal.widget.tabs.ViewPagerFixedSizeLayout.HeightCalculator
    public int measureHeight(int i4, final int i5) {
        TabMeasurement tabMeasurement = this.mTabsHeightCache.get(i4);
        if (tabMeasurement == null) {
            int apply = this.mGetTabCountFn.apply();
            if (apply == 0) {
                return 0;
            }
            final int size = View.MeasureSpec.getSize(i4);
            TabMeasurement tabMeasurement2 = new TabMeasurement(apply, new TabMeasurement.TabMeasurementFunction() { // from class: com.yandex.div.internal.widget.tabs.a
                @Override // com.yandex.div.internal.widget.tabs.TabMeasurement.TabMeasurementFunction
                public final int getTabHeight(int i6) {
                    int apply2;
                    apply2 = r0.mMeasureTabHeightFn.apply(BaseCardHeightCalculator.this.mChannelGroup, size, i5, i6);
                    return apply2;
                }
            });
            Bundle bundle = this.mPendingState;
            if (bundle != null) {
                tabMeasurement2.restoreState(bundle, i4);
                tabMeasurement2.removeState(this.mPendingState, i4);
                if (this.mPendingState.isEmpty()) {
                    this.mPendingState = null;
                }
            }
            this.mTabsHeightCache.put(i4, tabMeasurement2);
            tabMeasurement = tabMeasurement2;
        }
        return logAndReturnHeight(getOptimalHeight(tabMeasurement, this.mPosition, this.mPositionOffset), this.mPosition, this.mPositionOffset);
    }

    @Override // com.yandex.div.internal.widget.tabs.ViewPagerFixedSizeLayout.HeightCalculator
    public void setPositionAndOffsetForMeasure(int i4, float f4) {
        Log.d("[Y:BaseCardHeightCalculator]", "request layout for tab " + i4 + " with position offset " + f4);
        this.mPosition = i4;
        this.mPositionOffset = f4;
    }
}
