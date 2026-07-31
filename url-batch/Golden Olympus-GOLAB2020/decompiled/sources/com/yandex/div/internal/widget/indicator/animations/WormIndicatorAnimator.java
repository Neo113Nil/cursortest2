package com.yandex.div.internal.widget.indicator.animations;

import W1.m;
import android.graphics.RectF;
import com.yandex.div.internal.widget.indicator.IndicatorParams$ItemSize;
import com.yandex.div.internal.widget.indicator.IndicatorParams$Shape;
import com.yandex.div.internal.widget.indicator.IndicatorParams$Style;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class WormIndicatorAnimator implements IndicatorAnimator {

    @NotNull
    private final IndicatorParams$ItemSize inactiveItemSizeWithBorders;

    @NotNull
    private final RectF itemRect;
    private float itemWidthOverride;
    private float selectedPositionOffset;
    private float spaceBetweenCenters;

    @NotNull
    private final IndicatorParams$Style styleParams;

    public WormIndicatorAnimator(@NotNull IndicatorParams$Style styleParams) {
        IndicatorParams$ItemSize copy$default;
        Intrinsics.checkNotNullParameter(styleParams, "styleParams");
        this.styleParams = styleParams;
        this.itemRect = new RectF();
        IndicatorParams$Shape inactiveShape = styleParams.getInactiveShape();
        if (inactiveShape instanceof IndicatorParams$Shape.Circle) {
            copy$default = ((IndicatorParams$Shape.Circle) inactiveShape).getItemSize();
        } else {
            if (!(inactiveShape instanceof IndicatorParams$Shape.RoundedRect)) {
                throw new m();
            }
            IndicatorParams$Shape.RoundedRect roundedRect = (IndicatorParams$Shape.RoundedRect) inactiveShape;
            copy$default = IndicatorParams$ItemSize.RoundedRect.copy$default(roundedRect.getItemSize(), roundedRect.getItemSize().getItemWidth() + roundedRect.getStrokeWidth(), roundedRect.getItemSize().getItemHeight() + roundedRect.getStrokeWidth(), 0.0f, 4, null);
        }
        this.inactiveItemSizeWithBorders = copy$default;
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    public int getBorderColorAt(int i4) {
        return this.styleParams.getInactiveShape().getBorderColor();
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    public float getBorderWidthAt(int i4) {
        return this.styleParams.getInactiveShape().getBorderWidth();
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    public int getColorAt(int i4) {
        return this.styleParams.getInactiveShape().getColor();
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    @NotNull
    public IndicatorParams$ItemSize getItemSizeAt(int i4) {
        return this.inactiveItemSizeWithBorders;
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    @NotNull
    public RectF getSelectedItemRect(float f4, float f5, float f6, boolean z4) {
        float f7 = this.itemWidthOverride;
        if (f7 == 0.0f) {
            f7 = this.styleParams.getActiveShape().getItemSize().getWidth();
        }
        this.itemRect.top = f5 - (this.styleParams.getActiveShape().getItemSize().getHeight() / 2.0f);
        if (z4) {
            float f8 = f7 / 2.0f;
            this.itemRect.right = (f4 - g.c((this.spaceBetweenCenters * (this.selectedPositionOffset - 0.5f)) * 2.0f, 0.0f)) + f8;
            RectF rectF = this.itemRect;
            float f9 = this.spaceBetweenCenters;
            rectF.left = (f4 - g.f((this.selectedPositionOffset * f9) * 2.0f, f9)) - f8;
        } else {
            RectF rectF2 = this.itemRect;
            float f10 = this.spaceBetweenCenters;
            float f11 = f7 / 2.0f;
            rectF2.right = g.f(this.selectedPositionOffset * f10 * 2.0f, f10) + f4 + f11;
            this.itemRect.left = (f4 + g.c((this.spaceBetweenCenters * (this.selectedPositionOffset - 0.5f)) * 2.0f, 0.0f)) - f11;
        }
        this.itemRect.bottom = f5 + (this.styleParams.getActiveShape().getItemSize().getHeight() / 2.0f);
        RectF rectF3 = this.itemRect;
        float f12 = rectF3.left;
        if (f12 < 0.0f) {
            rectF3.offset(-f12, 0.0f);
        }
        RectF rectF4 = this.itemRect;
        float f13 = rectF4.right;
        if (f13 > f6) {
            rectF4.offset(-(f13 - f6), 0.0f);
        }
        return this.itemRect;
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    public void onPageScrolled(int i4, float f4) {
        this.selectedPositionOffset = f4;
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    public void overrideItemWidth(float f4) {
        this.itemWidthOverride = f4;
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    public void updateSpaceBetweenCenters(float f4) {
        this.spaceBetweenCenters = f4;
    }
}
