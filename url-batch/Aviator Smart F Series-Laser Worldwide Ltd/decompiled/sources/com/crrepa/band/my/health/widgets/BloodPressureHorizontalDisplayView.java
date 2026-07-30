package com.crrepa.band.my.health.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import com.crrepa.band.my.R$styleable;
import com.moyoung.dafit.module.common.utils.o;

/* loaded from: classes2.dex */
public class BloodPressureHorizontalDisplayView extends View {
    private int color;
    private int dbp;
    private float lineWidth;
    private int max;
    private int min;
    private Paint paint;
    private int sbp;

    public BloodPressureHorizontalDisplayView(Context context) {
        this(context, null);
    }

    private void drawProgressBar(Canvas canvas) {
        float f8;
        float f9;
        float width = getWidth();
        float height = getHeight();
        Path roundPath = getRoundPath(0.0f, 0.0f, width, height);
        this.paint.setStyle(Paint.Style.STROKE);
        canvas.drawPath(roundPath, this.paint);
        int layoutDirection = getLayoutDirection();
        com.orhanobut.logger.f.d("layoutDirection: " + layoutDirection);
        float width2 = ((float) getWidth()) / ((float) (this.max - this.min));
        if (layoutDirection == 1) {
            f8 = getWidth() - (this.dbp * width2);
            f9 = getWidth() - (this.sbp * width2);
        } else {
            f8 = this.dbp * width2;
            f9 = this.sbp * width2;
        }
        Path roundPath2 = getRoundPath(f8, 0.0f, f9, height);
        this.paint.setStyle(Paint.Style.FILL);
        canvas.drawPath(roundPath2, this.paint);
    }

    @NonNull
    private Path getRoundPath(float f8, float f9, float f10, float f11) {
        Path path = new Path();
        int dp2px = o.dp2px(getContext(), 6.0f);
        RectF rectF = new RectF(f8, f9, f10, f11);
        float f12 = dp2px;
        path.addRoundRect(rectF, f12, f12, Path.Direction.CW);
        return path;
    }

    private void initAttributes(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.bloodPressureDisplayView, 0, 0);
        this.min = obtainStyledAttributes.getInteger(5, 0);
        this.max = obtainStyledAttributes.getInteger(4, 0);
        this.dbp = obtainStyledAttributes.getInteger(1, 0);
        this.sbp = obtainStyledAttributes.getInteger(6, 0);
        this.color = obtainStyledAttributes.getColor(0, -1);
        this.lineWidth = obtainStyledAttributes.getDimension(3, o.dp2px(context, 1.0f));
    }

    private void initPaint() {
        this.paint.setColor(this.color);
        this.paint.setStrokeWidth(this.lineWidth);
        this.paint.setAntiAlias(true);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawProgressBar(canvas);
    }

    public void setBp(int i8, int i9) {
        this.sbp = i8;
        this.dbp = i9;
        invalidate();
    }

    public BloodPressureHorizontalDisplayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BloodPressureHorizontalDisplayView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.paint = new Paint();
        initAttributes(context, attributeSet);
        initPaint();
    }
}
