package com.yandex.div.internal.widget.indicator.animations;

import W1.m;
import android.animation.ArgbEvaluator;
import android.graphics.RectF;
import android.util.SparseArray;
import com.yandex.div.internal.widget.indicator.IndicatorParams$ItemSize;
import com.yandex.div.internal.widget.indicator.IndicatorParams$Shape;
import com.yandex.div.internal.widget.indicator.IndicatorParams$Style;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class ScaleIndicatorAnimator implements IndicatorAnimator {

    @NotNull
    private final ArgbEvaluator colorEvaluator;
    private int itemsCount;

    @NotNull
    private final SparseArray<Float> itemsScale;

    @NotNull
    private final IndicatorParams$Style styleParams;

    public ScaleIndicatorAnimator(@NotNull IndicatorParams$Style styleParams) {
        Intrinsics.checkNotNullParameter(styleParams, "styleParams");
        this.styleParams = styleParams;
        this.colorEvaluator = new ArgbEvaluator();
        this.itemsScale = new SparseArray<>();
    }

    private final int calculateColor(float f4, int i4, int i5) {
        Object evaluate = this.colorEvaluator.evaluate(f4, Integer.valueOf(i4), Integer.valueOf(i5));
        Intrinsics.checkNotNull(evaluate, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) evaluate).intValue();
    }

    private final float getScaleAt(int i4) {
        Float f4 = this.itemsScale.get(i4, Float.valueOf(0.0f));
        Intrinsics.checkNotNullExpressionValue(f4, "itemsScale.get(position, 0f)");
        return f4.floatValue();
    }

    private final float interpolate(float f4, float f5, float f6) {
        return f4 + ((f5 - f4) * f6);
    }

    private final void scaleIndicatorByOffset(int i4, float f4) {
        if (f4 == 0.0f) {
            this.itemsScale.remove(i4);
        } else {
            this.itemsScale.put(i4, Float.valueOf(Math.abs(f4)));
        }
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    public int getBorderColorAt(int i4) {
        IndicatorParams$Shape activeShape = this.styleParams.getActiveShape();
        if (!(activeShape instanceof IndicatorParams$Shape.RoundedRect)) {
            return 0;
        }
        IndicatorParams$Shape inactiveShape = this.styleParams.getInactiveShape();
        Intrinsics.checkNotNull(inactiveShape, "null cannot be cast to non-null type com.yandex.div.internal.widget.indicator.IndicatorParams.Shape.RoundedRect");
        return calculateColor(getScaleAt(i4), ((IndicatorParams$Shape.RoundedRect) inactiveShape).getStrokeColor(), ((IndicatorParams$Shape.RoundedRect) activeShape).getStrokeColor());
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    public float getBorderWidthAt(int i4) {
        IndicatorParams$Shape activeShape = this.styleParams.getActiveShape();
        if (!(activeShape instanceof IndicatorParams$Shape.RoundedRect)) {
            return 0.0f;
        }
        IndicatorParams$Shape inactiveShape = this.styleParams.getInactiveShape();
        Intrinsics.checkNotNull(inactiveShape, "null cannot be cast to non-null type com.yandex.div.internal.widget.indicator.IndicatorParams.Shape.RoundedRect");
        IndicatorParams$Shape.RoundedRect roundedRect = (IndicatorParams$Shape.RoundedRect) inactiveShape;
        return roundedRect.getStrokeWidth() + ((((IndicatorParams$Shape.RoundedRect) activeShape).getStrokeWidth() - roundedRect.getStrokeWidth()) * getScaleAt(i4));
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    public int getColorAt(int i4) {
        return calculateColor(getScaleAt(i4), this.styleParams.getInactiveShape().getColor(), this.styleParams.getActiveShape().getColor());
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    @NotNull
    public IndicatorParams$ItemSize getItemSizeAt(int i4) {
        IndicatorParams$Shape activeShape = this.styleParams.getActiveShape();
        if (activeShape instanceof IndicatorParams$Shape.Circle) {
            IndicatorParams$Shape inactiveShape = this.styleParams.getInactiveShape();
            Intrinsics.checkNotNull(inactiveShape, "null cannot be cast to non-null type com.yandex.div.internal.widget.indicator.IndicatorParams.Shape.Circle");
            return new IndicatorParams$ItemSize.Circle(interpolate(((IndicatorParams$Shape.Circle) inactiveShape).getItemSize().getRadius(), ((IndicatorParams$Shape.Circle) activeShape).getItemSize().getRadius(), getScaleAt(i4)));
        }
        if (!(activeShape instanceof IndicatorParams$Shape.RoundedRect)) {
            throw new m();
        }
        IndicatorParams$Shape inactiveShape2 = this.styleParams.getInactiveShape();
        Intrinsics.checkNotNull(inactiveShape2, "null cannot be cast to non-null type com.yandex.div.internal.widget.indicator.IndicatorParams.Shape.RoundedRect");
        IndicatorParams$Shape.RoundedRect roundedRect = (IndicatorParams$Shape.RoundedRect) inactiveShape2;
        IndicatorParams$Shape.RoundedRect roundedRect2 = (IndicatorParams$Shape.RoundedRect) activeShape;
        return new IndicatorParams$ItemSize.RoundedRect(interpolate(roundedRect.getItemSize().getItemWidth() + roundedRect.getStrokeWidth(), roundedRect2.getItemSize().getItemWidth() + roundedRect2.getStrokeWidth(), getScaleAt(i4)), interpolate(roundedRect.getItemSize().getItemHeight() + roundedRect.getStrokeWidth(), roundedRect2.getItemSize().getItemHeight() + roundedRect2.getStrokeWidth(), getScaleAt(i4)), interpolate(roundedRect.getItemSize().getCornerRadius(), roundedRect2.getItemSize().getCornerRadius(), getScaleAt(i4)));
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    @Nullable
    public RectF getSelectedItemRect(float f4, float f5, float f6, boolean z4) {
        return null;
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    public void onPageScrolled(int i4, float f4) {
        scaleIndicatorByOffset(i4, 1.0f - f4);
        int i5 = this.itemsCount;
        if (i4 < i5 - 1) {
            scaleIndicatorByOffset(i4 + 1, f4);
        } else if (i5 > 1) {
            scaleIndicatorByOffset(0, f4);
        }
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    public void onPageSelected(int i4) {
        this.itemsScale.clear();
        this.itemsScale.put(i4, Float.valueOf(1.0f));
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    public void setItemsCount(int i4) {
        this.itemsCount = i4;
    }
}
