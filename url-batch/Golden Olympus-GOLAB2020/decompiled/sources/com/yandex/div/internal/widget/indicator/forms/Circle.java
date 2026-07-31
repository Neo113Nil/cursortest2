package com.yandex.div.internal.widget.indicator.forms;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.yandex.div.internal.widget.indicator.IndicatorParams$ItemSize;
import com.yandex.div.internal.widget.indicator.IndicatorParams$Style;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class Circle implements SingleIndicatorDrawer {

    @NotNull
    private final Paint paint;

    @NotNull
    private final IndicatorParams$Style params;

    @NotNull
    private final RectF rect;

    public Circle(@NotNull IndicatorParams$Style params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.params = params;
        this.paint = new Paint();
        this.rect = new RectF();
    }

    @Override // com.yandex.div.internal.widget.indicator.forms.SingleIndicatorDrawer
    public void draw(@NotNull Canvas canvas, float f4, float f5, @NotNull IndicatorParams$ItemSize itemSize, int i4, float f6, int i5) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(itemSize, "itemSize");
        IndicatorParams$ItemSize.Circle circle = (IndicatorParams$ItemSize.Circle) itemSize;
        this.paint.setColor(i4);
        RectF rectF = this.rect;
        rectF.left = f4 - circle.getRadius();
        rectF.top = f5 - circle.getRadius();
        rectF.right = f4 + circle.getRadius();
        rectF.bottom = f5 + circle.getRadius();
        canvas.drawCircle(this.rect.centerX(), this.rect.centerY(), circle.getRadius(), this.paint);
    }

    @Override // com.yandex.div.internal.widget.indicator.forms.SingleIndicatorDrawer
    public void drawSelected(@NotNull Canvas canvas, @NotNull RectF rect) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(rect, "rect");
        this.paint.setColor(this.params.getActiveShape().getColor());
        canvas.drawCircle(rect.centerX(), rect.centerY(), rect.width() / 2, this.paint);
    }
}
