package com.google.android.material.carousel;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.material.R;
import com.google.android.material.carousel.KeylineState;

/* loaded from: classes4.dex */
final class CarouselStrategyHelper {
    private CarouselStrategyHelper() {
    }

    static float addEnd(float f8, float f9, int i8) {
        return f8 + (Math.max(0, i8 - 1) * f9);
    }

    static float addStart(float f8, float f9, int i8) {
        return i8 > 0 ? f8 + (f9 / 2.0f) : f8;
    }

    static KeylineState createCenterAlignedKeylineState(@NonNull Context context, float f8, int i8, @NonNull Arrangement arrangement) {
        float f9;
        float f10;
        float min = Math.min(getExtraSmallSize(context) + f8, arrangement.largeSize);
        float f11 = min / 2.0f;
        float f12 = 0.0f - f11;
        float addStart = addStart(0.0f, arrangement.smallSize, arrangement.smallCount);
        float updateCurPosition = updateCurPosition(0.0f, addEnd(addStart, arrangement.smallSize, (int) Math.floor(arrangement.smallCount / 2.0f)), arrangement.smallSize, arrangement.smallCount);
        float addStart2 = addStart(updateCurPosition, arrangement.mediumSize, arrangement.mediumCount);
        float updateCurPosition2 = updateCurPosition(updateCurPosition, addEnd(addStart2, arrangement.mediumSize, (int) Math.floor(arrangement.mediumCount / 2.0f)), arrangement.mediumSize, arrangement.mediumCount);
        float addStart3 = addStart(updateCurPosition2, arrangement.largeSize, arrangement.largeCount);
        float updateCurPosition3 = updateCurPosition(updateCurPosition2, addEnd(addStart3, arrangement.largeSize, arrangement.largeCount), arrangement.largeSize, arrangement.largeCount);
        float addStart4 = addStart(updateCurPosition3, arrangement.mediumSize, arrangement.mediumCount);
        float addStart5 = addStart(updateCurPosition(updateCurPosition3, addEnd(addStart4, arrangement.mediumSize, (int) Math.ceil(arrangement.mediumCount / 2.0f)), arrangement.mediumSize, arrangement.mediumCount), arrangement.smallSize, arrangement.smallCount);
        float f13 = i8 + f11;
        float childMaskPercentage = CarouselStrategy.getChildMaskPercentage(min, arrangement.largeSize, f8);
        float childMaskPercentage2 = CarouselStrategy.getChildMaskPercentage(arrangement.smallSize, arrangement.largeSize, f8);
        float childMaskPercentage3 = CarouselStrategy.getChildMaskPercentage(arrangement.mediumSize, arrangement.largeSize, f8);
        KeylineState.Builder addAnchorKeyline = new KeylineState.Builder(arrangement.largeSize, i8).addAnchorKeyline(f12, childMaskPercentage, min);
        if (arrangement.smallCount > 0) {
            f9 = childMaskPercentage;
            addAnchorKeyline.addKeylineRange(addStart, childMaskPercentage2, arrangement.smallSize, (int) Math.floor(r7 / 2.0f));
        } else {
            f9 = childMaskPercentage;
        }
        if (arrangement.mediumCount > 0) {
            addAnchorKeyline.addKeylineRange(addStart2, childMaskPercentage3, arrangement.mediumSize, (int) Math.floor(r4 / 2.0f));
        }
        addAnchorKeyline.addKeylineRange(addStart3, 0.0f, arrangement.largeSize, arrangement.largeCount, true);
        if (arrangement.mediumCount > 0) {
            f10 = 2.0f;
            addAnchorKeyline.addKeylineRange(addStart4, childMaskPercentage3, arrangement.mediumSize, (int) Math.ceil(r4 / 2.0f));
        } else {
            f10 = 2.0f;
        }
        if (arrangement.smallCount > 0) {
            addAnchorKeyline.addKeylineRange(addStart5, childMaskPercentage2, arrangement.smallSize, (int) Math.ceil(r0 / f10));
        }
        addAnchorKeyline.addAnchorKeyline(f13, f9, min);
        return addAnchorKeyline.build();
    }

    static KeylineState createKeylineState(@NonNull Context context, float f8, int i8, @NonNull Arrangement arrangement, int i9) {
        return i9 == 1 ? createCenterAlignedKeylineState(context, f8, i8, arrangement) : createLeftAlignedKeylineState(context, f8, i8, arrangement);
    }

    static KeylineState createLeftAlignedKeylineState(@NonNull Context context, float f8, int i8, @NonNull Arrangement arrangement) {
        float min = Math.min(getExtraSmallSize(context) + f8, arrangement.largeSize);
        float f9 = min / 2.0f;
        float f10 = 0.0f - f9;
        float addStart = addStart(0.0f, arrangement.largeSize, arrangement.largeCount);
        float updateCurPosition = updateCurPosition(0.0f, addEnd(addStart, arrangement.largeSize, arrangement.largeCount), arrangement.largeSize, arrangement.largeCount);
        float addStart2 = addStart(updateCurPosition, arrangement.mediumSize, arrangement.mediumCount);
        float addStart3 = addStart(updateCurPosition(updateCurPosition, addStart2, arrangement.mediumSize, arrangement.mediumCount), arrangement.smallSize, arrangement.smallCount);
        float f11 = i8 + f9;
        float childMaskPercentage = CarouselStrategy.getChildMaskPercentage(min, arrangement.largeSize, f8);
        float childMaskPercentage2 = CarouselStrategy.getChildMaskPercentage(arrangement.smallSize, arrangement.largeSize, f8);
        float childMaskPercentage3 = CarouselStrategy.getChildMaskPercentage(arrangement.mediumSize, arrangement.largeSize, f8);
        KeylineState.Builder addKeylineRange = new KeylineState.Builder(arrangement.largeSize, i8).addAnchorKeyline(f10, childMaskPercentage, min).addKeylineRange(addStart, 0.0f, arrangement.largeSize, arrangement.largeCount, true);
        if (arrangement.mediumCount > 0) {
            addKeylineRange.addKeyline(addStart2, childMaskPercentage3, arrangement.mediumSize);
        }
        int i9 = arrangement.smallCount;
        if (i9 > 0) {
            addKeylineRange.addKeylineRange(addStart3, childMaskPercentage2, arrangement.smallSize, i9);
        }
        addKeylineRange.addAnchorKeyline(f11, childMaskPercentage, min);
        return addKeylineRange.build();
    }

    static float getExtraSmallSize(@NonNull Context context) {
        return context.getResources().getDimension(R.dimen.m3_carousel_gone_size);
    }

    static float getSmallSizeMax(@NonNull Context context) {
        return context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
    }

    static float getSmallSizeMin(@NonNull Context context) {
        return context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
    }

    static int maxValue(int[] iArr) {
        int i8 = Integer.MIN_VALUE;
        for (int i9 : iArr) {
            if (i9 > i8) {
                i8 = i9;
            }
        }
        return i8;
    }

    static float updateCurPosition(float f8, float f9, float f10, int i8) {
        return i8 > 0 ? f9 + (f10 / 2.0f) : f8;
    }
}
