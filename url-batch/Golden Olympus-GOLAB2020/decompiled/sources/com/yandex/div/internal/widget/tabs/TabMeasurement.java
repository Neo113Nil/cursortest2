package com.yandex.div.internal.widget.tabs;

import android.os.Bundle;
import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
class TabMeasurement {
    private int mFirstTabHeight = -1;
    private int mMaxTabHeight = -1;
    private final int mTabCount;
    private int[] mTabHeight;

    @NonNull
    private final TabMeasurementFunction mTabMeasurementFunction;

    interface TabMeasurementFunction {
        int getTabHeight(int i4);
    }

    TabMeasurement(int i4, @NonNull TabMeasurementFunction tabMeasurementFunction) {
        this.mTabCount = i4;
        this.mTabMeasurementFunction = tabMeasurementFunction;
        this.mTabHeight = new int[i4];
    }

    int getFirstTabHeight() {
        if (this.mFirstTabHeight < 0) {
            this.mFirstTabHeight = this.mTabMeasurementFunction.getTabHeight(0);
        }
        return this.mFirstTabHeight;
    }

    int getMaxTabHeight() {
        if (this.mMaxTabHeight < 0) {
            int firstTabHeight = getFirstTabHeight();
            for (int i4 = 1; i4 < this.mTabCount; i4++) {
                firstTabHeight = Math.max(firstTabHeight, this.mTabMeasurementFunction.getTabHeight(i4));
            }
            this.mMaxTabHeight = firstTabHeight;
        }
        return this.mMaxTabHeight;
    }

    int getTabHeight(int i4) {
        int i5 = this.mTabCount;
        if (i5 == 0) {
            return 0;
        }
        if (i4 < 0) {
            return getTabHeight(0);
        }
        if (i4 >= i5) {
            return getTabHeight(i5);
        }
        int[] iArr = this.mTabHeight;
        if (iArr[i4] <= 0) {
            iArr[i4] = this.mTabMeasurementFunction.getTabHeight(i4);
        }
        return this.mTabHeight[i4];
    }

    void removeState(@NonNull Bundle bundle, int i4) {
        bundle.remove("FIRST_TAB_HEIGHT_PREFIX" + i4);
        bundle.remove("MAX_TAB_HEIGHT_PREFIX" + i4);
    }

    void restoreState(@NonNull Bundle bundle, int i4) {
        this.mFirstTabHeight = bundle.getInt("FIRST_TAB_HEIGHT_PREFIX" + i4, -1);
        this.mMaxTabHeight = bundle.getInt("MAX_TAB_HEIGHT_PREFIX" + i4, -1);
    }
}
