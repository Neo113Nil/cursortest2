package com.google.android.material.carousel;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselStrategy;
import com.google.android.material.carousel.KeylineState;

/* loaded from: classes4.dex */
public final class UncontainedCarouselStrategy extends CarouselStrategy {
    private static final float MEDIUM_LARGE_ITEM_PERCENTAGE_THRESHOLD = 0.85f;

    private float calculateMediumChildSize(float f8, float f9, float f10) {
        float max = Math.max(1.5f * f10, f8);
        float f11 = MEDIUM_LARGE_ITEM_PERCENTAGE_THRESHOLD * f9;
        if (max > f11) {
            max = Math.max(f11, f10 * 1.2f);
        }
        return Math.min(f9, max);
    }

    private KeylineState createCenterAlignedKeylineState(int i8, float f8, float f9, int i9, float f10, float f11, float f12) {
        float min = Math.min(f11, f9);
        float childMaskPercentage = CarouselStrategy.getChildMaskPercentage(min, f9, f8);
        float childMaskPercentage2 = CarouselStrategy.getChildMaskPercentage(f10, f9, f8);
        float f13 = f10 / 2.0f;
        float f14 = (f12 + 0.0f) - f13;
        float f15 = f14 + f13;
        float f16 = min / 2.0f;
        float f17 = (i9 * f9) + f15;
        KeylineState.Builder addKeylineRange = new KeylineState.Builder(f9, i8).addAnchorKeyline((f14 - f13) - f16, childMaskPercentage, min).addKeyline(f14, childMaskPercentage2, f10, false).addKeylineRange((f9 / 2.0f) + f15, 0.0f, f9, i9, true);
        addKeylineRange.addKeyline(f13 + f17, childMaskPercentage2, f10, false);
        addKeylineRange.addAnchorKeyline(f17 + f10 + f16, childMaskPercentage, min);
        return addKeylineRange.build();
    }

    private KeylineState createLeftAlignedKeylineState(Context context, float f8, int i8, float f9, int i9, float f10, int i10, float f11) {
        float min = Math.min(f11, f9);
        float max = Math.max(min, 0.5f * f10);
        float childMaskPercentage = CarouselStrategy.getChildMaskPercentage(max, f9, f8);
        float childMaskPercentage2 = CarouselStrategy.getChildMaskPercentage(min, f9, f8);
        float childMaskPercentage3 = CarouselStrategy.getChildMaskPercentage(f10, f9, f8);
        float f12 = (i9 * f9) + 0.0f;
        KeylineState.Builder addKeylineRange = new KeylineState.Builder(f9, i8).addAnchorKeyline(0.0f - (max / 2.0f), childMaskPercentage, max).addKeylineRange(f9 / 2.0f, 0.0f, f9, i9, true);
        if (i10 > 0) {
            float f13 = (f10 / 2.0f) + f12;
            f12 += f10;
            addKeylineRange.addKeyline(f13, childMaskPercentage3, f10, false);
        }
        addKeylineRange.addAnchorKeyline(f12 + (CarouselStrategyHelper.getExtraSmallSize(context) / 2.0f), childMaskPercentage2, min);
        return addKeylineRange.build();
    }

    @Override // com.google.android.material.carousel.CarouselStrategy
    CarouselStrategy.StrategyType getStrategyType() {
        return CarouselStrategy.StrategyType.UNCONTAINED;
    }

    @Override // com.google.android.material.carousel.CarouselStrategy
    @NonNull
    public KeylineState onFirstChildMeasuredWithMargins(@NonNull Carousel carousel, @NonNull View view) {
        float f8;
        int containerWidth = carousel.isHorizontal() ? carousel.getContainerWidth() : carousel.getContainerHeight();
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        float f9 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        float measuredHeight = view.getMeasuredHeight();
        if (carousel.isHorizontal()) {
            float f10 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            measuredHeight = view.getMeasuredWidth();
            f8 = f10;
        } else {
            f8 = f9;
        }
        float f11 = measuredHeight + f8;
        float extraSmallSize = CarouselStrategyHelper.getExtraSmallSize(view.getContext()) + f8;
        float extraSmallSize2 = CarouselStrategyHelper.getExtraSmallSize(view.getContext()) + f8;
        int max = Math.max(1, (int) Math.floor(r1 / f11));
        float f12 = containerWidth - (max * f11);
        if (carousel.getCarouselAlignment() == 1) {
            float f13 = f12 / 2.0f;
            return createCenterAlignedKeylineState(containerWidth, f8, f11, max, Math.max(Math.min(3.0f * f13, f11), getSmallItemSizeMin() + f8), extraSmallSize2, f13);
        }
        return createLeftAlignedKeylineState(view.getContext(), f8, containerWidth, f11, max, calculateMediumChildSize(extraSmallSize, f11, f12), f12 > 0.0f ? 1 : 0, extraSmallSize2);
    }
}
