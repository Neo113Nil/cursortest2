package com.google.android.material.carousel;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.core.math.MathUtils;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes4.dex */
public final class MultiBrowseCarouselStrategy extends CarouselStrategy {
    private int keylineCount = 0;
    private static final int[] SMALL_COUNTS = {1};
    private static final int[] MEDIUM_COUNTS = {1, 0};

    boolean ensureArrangementFitsItemCount(Arrangement arrangement, int i8) {
        int itemCount = arrangement.getItemCount() - i8;
        boolean z7 = itemCount > 0 && (arrangement.smallCount > 0 || arrangement.mediumCount > 1);
        while (itemCount > 0) {
            int i9 = arrangement.smallCount;
            if (i9 > 0) {
                arrangement.smallCount = i9 - 1;
            } else {
                int i10 = arrangement.mediumCount;
                if (i10 > 1) {
                    arrangement.mediumCount = i10 - 1;
                }
            }
            itemCount--;
        }
        return z7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00df, code lost:
    
        if (r6 != false) goto L25;
     */
    @Override // com.google.android.material.carousel.CarouselStrategy
    @NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public KeylineState onFirstChildMeasuredWithMargins(@NonNull Carousel carousel, @NonNull View view) {
        int containerHeight = carousel.getContainerHeight();
        if (carousel.isHorizontal()) {
            containerHeight = carousel.getContainerWidth();
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        float f8 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        float measuredHeight = view.getMeasuredHeight();
        if (carousel.isHorizontal()) {
            f8 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            measuredHeight = view.getMeasuredWidth();
        }
        float smallItemSizeMin = getSmallItemSizeMin() + f8;
        float max = Math.max(getSmallItemSizeMax() + f8, smallItemSizeMin);
        float f9 = containerHeight;
        float min = Math.min(measuredHeight + f8, f9);
        float clamp = MathUtils.clamp((measuredHeight / 3.0f) + f8, smallItemSizeMin + f8, max + f8);
        float f10 = (min + clamp) / 2.0f;
        int[] iArr = SMALL_COUNTS;
        float f11 = smallItemSizeMin * 2.0f;
        if (f9 <= f11) {
            iArr = new int[]{0};
        }
        int[] iArr2 = MEDIUM_COUNTS;
        if (carousel.getCarouselAlignment() == 1) {
            iArr = CarouselStrategy.doubleCounts(iArr);
            iArr2 = CarouselStrategy.doubleCounts(iArr2);
        }
        int[] iArr3 = iArr;
        int[] iArr4 = iArr2;
        int max2 = (int) Math.max(1.0d, Math.floor(((f9 - (CarouselStrategyHelper.maxValue(iArr4) * f10)) - (CarouselStrategyHelper.maxValue(iArr3) * max)) / min));
        int ceil = (int) Math.ceil(f9 / min);
        int i8 = (ceil - max2) + 1;
        int[] iArr5 = new int[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            iArr5[i9] = ceil - i9;
        }
        int i10 = containerHeight;
        Arrangement findLowestCostArrangement = Arrangement.findLowestCostArrangement(f9, clamp, smallItemSizeMin, max, iArr3, f10, iArr4, min, iArr5);
        this.keylineCount = findLowestCostArrangement.getItemCount();
        boolean ensureArrangementFitsItemCount = ensureArrangementFitsItemCount(findLowestCostArrangement, carousel.getItemCount());
        int i11 = findLowestCostArrangement.mediumCount;
        if (i11 == 0 && findLowestCostArrangement.smallCount == 0 && f9 > f11) {
            findLowestCostArrangement.smallCount = 1;
        }
        findLowestCostArrangement = Arrangement.findLowestCostArrangement(f9, clamp, smallItemSizeMin, max, new int[]{findLowestCostArrangement.smallCount}, f10, new int[]{i11}, min, new int[]{findLowestCostArrangement.largeCount});
        return CarouselStrategyHelper.createKeylineState(view.getContext(), f8, i10, findLowestCostArrangement, carousel.getCarouselAlignment());
    }

    @Override // com.google.android.material.carousel.CarouselStrategy
    public boolean shouldRefreshKeylineState(@NonNull Carousel carousel, int i8) {
        return (i8 < this.keylineCount && carousel.getItemCount() >= this.keylineCount) || (i8 >= this.keylineCount && carousel.getItemCount() < this.keylineCount);
    }
}
