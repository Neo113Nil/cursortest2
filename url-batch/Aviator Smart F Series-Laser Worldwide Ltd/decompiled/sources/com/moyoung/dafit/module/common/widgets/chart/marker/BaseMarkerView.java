package com.moyoung.dafit.module.common.widgets.chart.marker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.RectF;
import androidx.annotation.ColorInt;
import androidx.core.content.ContextCompat;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.utils.e;
import com.moyoung.dafit.module.common.R$color;
import com.moyoung.dafit.module.common.utils.o;

/* loaded from: classes4.dex */
public class BaseMarkerView extends MarkerView {
    private static final int DEFAULT_ARROW_SIZE = 5;
    private int arrowSize;
    private int bgColor;

    public BaseMarkerView(Context context, int i8) {
        super(context, i8);
        this.arrowSize = o.dp2px(context, 5.0f);
        this.bgColor = ContextCompat.getColor(getContext(), R$color.color_heart_rate_text);
    }

    private void drawTriangle(Canvas canvas, Point point, Point point2, Point point3, Paint paint) {
        Path path = new Path();
        path.setFillType(Path.FillType.EVEN_ODD);
        path.moveTo(point.x, point.y);
        path.lineTo(point2.x, point2.y);
        path.lineTo(point3.x, point3.y);
        path.lineTo(point.x, point.y);
        path.close();
        canvas.drawPath(path, paint);
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.d
    public void draw(Canvas canvas, float f8, float f9) {
        Chart chartView = getChartView();
        e offsetForDrawingAtPoint = getOffsetForDrawingAtPoint(f8, f9);
        float f10 = offsetForDrawingAtPoint.f14114x;
        float f11 = offsetForDrawingAtPoint.f14115y;
        int height = getHeight();
        int width = getWidth();
        if (width == 0) {
            return;
        }
        float f12 = f10 + f8;
        int i8 = this.arrowSize;
        float f13 = f12 - i8;
        float f14 = f11 + f9;
        float f15 = width + f12;
        float f16 = i8 + f15;
        float f17 = height + f14;
        RectF rectF = new RectF(f13, f14, f16, f17);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(this.bgColor);
        canvas.drawRoundRect(rectF, 10.0f, 10.0f, paint);
        Point point = new Point();
        Point point2 = new Point();
        Point point3 = new Point();
        int i9 = (int) ((f13 + f16) / 2.0f);
        if (f8 > chartView.getWidth() - width) {
            i9 = (int) f15;
        } else if (f8 < width / 2) {
            i9 = (int) f12;
        }
        int i10 = (int) f17;
        point.set(i9 - (this.arrowSize / 2), i10);
        point2.set((this.arrowSize / 2) + i9, i10);
        point3.set(i9, (int) (f17 + this.arrowSize));
        drawTriangle(canvas, point, point2, point3, paint);
        super.draw(canvas, f8, f9);
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.d
    public e getOffset() {
        return new e(-(getWidth() / 2), -getHeight());
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.d
    public e getOffsetForDrawingAtPoint(float f8, float f9) {
        e offset = getOffset();
        Chart chartView = getChartView();
        float width = getWidth();
        float height = getHeight();
        int i8 = this.arrowSize;
        if (f9 <= i8 + height) {
            offset.f14115y = i8;
        } else {
            offset.f14115y = (-height) - i8;
        }
        if (f8 > chartView.getWidth() - width) {
            offset.f14114x = -width;
        } else {
            offset.f14114x = 0.0f;
            float f10 = width / 2.0f;
            if (f8 > f10) {
                offset.f14114x = -f10;
            }
        }
        return offset;
    }

    public void setBgColor(@ColorInt int i8) {
        this.bgColor = i8;
    }
}
