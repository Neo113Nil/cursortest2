package com.google.android.material.carousel;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.core.math.MathUtils;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes4.dex */
public class HeroCarouselStrategy extends CarouselStrategy {
    private int keylineCount = 0;
    private static final int[] SMALL_COUNTS = {1};
    private static final int[] MEDIUM_COUNTS = {0, 1};

    @Override // com.google.android.material.carousel.CarouselStrategy
    @NonNull
    public KeylineState onFirstChildMeasuredWithMargins(@NonNull Carousel carousel, @NonNull View view) {
        int i8;
        int containerHeight = carousel.getContainerHeight();
        if (carousel.isHorizontal()) {
            containerHeight = carousel.getContainerWidth();
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        float f8 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        float measuredWidth = view.getMeasuredWidth() * 2;
        if (carousel.isHorizontal()) {
            f8 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            measuredWidth = view.getMeasuredHeight() * 2;
        }
        float smallItemSizeMin = getSmallItemSizeMin() + f8;
        float max = Math.max(getSmallItemSizeMax() + f8, smallItemSizeMin);
        float f9 = containerHeight;
        float min = Math.min(measuredWidth + f8, f9);
        float clamp = MathUtils.clamp((measuredWidth / 3.0f) + f8, smallItemSizeMin + f8, max + f8);
        float f10 = (min + clamp) / 2.0f;
        int[] iArr = f9 < 2.0f * smallItemSizeMin ? new int[]{0} : SMALL_COUNTS;
        int max2 = (int) Math.max(1.0d, Math.floor((f9 - (CarouselStrategyHelper.maxValue(r4) * max)) / min));
        int ceil = (((int) Math.ceil(f9 / min)) - max2) + 1;
        int[] iArr2 = new int[ceil];
        for (int i9 = 0; i9 < ceil; i9++) {
            iArr2[i9] = max2 + i9;
        }
        int i10 = carousel.getCarouselAlignment() == 1 ? 1 : 0;
        Arrangement findLowestCostArrangement = Arrangement.findLowestCostArrangement(f9, clamp, smallItemSizeMin, max, i10 != 0 ? CarouselStrategy.doubleCounts(iArr) : iArr, f10, i10 != 0 ? CarouselStrategy.doubleCounts(MEDIUM_COUNTS) : MEDIUM_COUNTS, min, iArr2);
        this.keylineCount = findLowestCostArrangement.getItemCount();
        if (findLowestCostArrangement.getItemCount() > carousel.getItemCount()) {
            findLowestCostArrangement = Arrangement.findLowestCostArrangement(f9, clamp, smallItemSizeMin, max, iArr, f10, MEDIUM_COUNTS, min, iArr2);
            i8 = 0;
        } else {
            i8 = i10;
        }
        return CarouselStrategyHelper.createKeylineState(view.getContext(), f8, containerHeight, findLowestCostArrangement, i8);
    }

    @Override // com.google.android.material.carousel.CarouselStrategy
    public boolean shouldRefreshKeylineState(@NonNull Carousel carousel, int i8) {
        if (carousel.getCarouselAlignment() == 1) {
            if (i8 < this.keylineCount && carousel.getItemCount() >= this.keylineCount) {
                return true;
            }
            if (i8 >= this.keylineCount && carousel.getItemCount() < this.keylineCount) {
                return true;
            }
        }
        return false;
    }
}
