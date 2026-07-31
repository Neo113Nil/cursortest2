package com.yandex.div.internal.widget.indicator.forms;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.yandex.div.internal.widget.indicator.IndicatorParams$ItemSize;
import com.yandex.div.internal.widget.indicator.IndicatorParams$Shape;
import com.yandex.div.internal.widget.indicator.IndicatorParams$Style;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class RoundedRect implements SingleIndicatorDrawer {

    @NotNull
    private final Paint paint;

    @NotNull
    private final IndicatorParams$Style params;

    @NotNull
    private final RectF rect;

    @NotNull
    private final Paint strokePaint;

    public RoundedRect(@NotNull IndicatorParams$Style params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.params = params;
        this.paint = new Paint();
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        this.strokePaint = paint;
        this.rect = new RectF();
    }

    @Override // com.yandex.div.internal.widget.indicator.forms.SingleIndicatorDrawer
    public void draw(@NotNull Canvas canvas, float f4, float f5, @NotNull IndicatorParams$ItemSize itemSize, int i4, float f6, int i5) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(itemSize, "itemSize");
        IndicatorParams$ItemSize.RoundedRect roundedRect = (IndicatorParams$ItemSize.RoundedRect) itemSize;
        this.paint.setColor(i4);
        RectF rectF = this.rect;
        rectF.left = (float) Math.ceil(f4 - (roundedRect.getItemWidth() / 2.0f));
        rectF.top = (float) Math.ceil(f5 - (roundedRect.getItemHeight() / 2.0f));
        rectF.right = (float) Math.ceil(f4 + (roundedRect.getItemWidth() / 2.0f));
        float ceil = (float) Math.ceil(f5 + (roundedRect.getItemHeight() / 2.0f));
        rectF.bottom = ceil;
        if (f6 > 0.0f) {
            float f7 = f6 / 2.0f;
            rectF.left += f7;
            rectF.top += f7;
            rectF.right -= f7;
            rectF.bottom = ceil - f7;
        }
        canvas.drawRoundRect(this.rect, roundedRect.getCornerRadius(), roundedRect.getCornerRadius(), this.paint);
        if (i5 == 0 || f6 == 0.0f) {
            return;
        }
        Paint paint = this.strokePaint;
        paint.setColor(i5);
        paint.setStrokeWidth(f6);
        canvas.drawRoundRect(this.rect, roundedRect.getCornerRadius(), roundedRect.getCornerRadius(), this.strokePaint);
    }

    @Override // com.yandex.div.internal.widget.indicator.forms.SingleIndicatorDrawer
    public void drawSelected(@NotNull Canvas canvas, @NotNull RectF rect) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(rect, "rect");
        IndicatorParams$Shape activeShape = this.params.getActiveShape();
        Intrinsics.checkNotNull(activeShape, "null cannot be cast to non-null type com.yandex.div.internal.widget.indicator.IndicatorParams.Shape.RoundedRect");
        IndicatorParams$Shape.RoundedRect roundedRect = (IndicatorParams$Shape.RoundedRect) activeShape;
        IndicatorParams$ItemSize.RoundedRect itemSize = roundedRect.getItemSize();
        this.paint.setColor(this.params.getActiveShape().getColor());
        canvas.drawRoundRect(rect, itemSize.getCornerRadius(), itemSize.getCornerRadius(), this.paint);
        if (roundedRect.getStrokeColor() == 0 || roundedRect.getStrokeWidth() == 0.0f) {
            return;
        }
        Paint paint = this.strokePaint;
        paint.setColor(roundedRect.getStrokeColor());
        paint.setStrokeWidth(roundedRect.getStrokeWidth());
        canvas.drawRoundRect(rect, itemSize.getCornerRadius(), itemSize.getCornerRadius(), this.strokePaint);
    }
}
