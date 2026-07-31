package com.yandex.div.internal.widget.indicator.animations;

import android.graphics.RectF;
import com.yandex.div.internal.widget.indicator.IndicatorParams$ItemSize;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public interface IndicatorAnimator {
    int getBorderColorAt(int i4);

    float getBorderWidthAt(int i4);

    int getColorAt(int i4);

    @NotNull
    IndicatorParams$ItemSize getItemSizeAt(int i4);

    @Nullable
    RectF getSelectedItemRect(float f4, float f5, float f6, boolean z4);

    void onPageScrolled(int i4, float f4);

    default void onPageSelected(int i4) {
    }

    default void overrideItemWidth(float f4) {
    }

    default void setItemsCount(int i4) {
    }

    default void updateSpaceBetweenCenters(float f4) {
    }
}
