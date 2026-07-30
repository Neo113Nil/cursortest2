package com.crrepa.band.my.training.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.InputDeviceCompat;

/* loaded from: classes3.dex */
public class TrainingEffectProgressView extends View {
    private int backgroundColor;
    private Paint backgroundPaint;
    private int max;
    private int progress;
    private int progressColor;
    private Paint progressPaint;
    private int strokeWidth;

    public TrainingEffectProgressView(Context context) {
        super(context);
        this.progress = 0;
        this.max = 100;
        this.strokeWidth = 12;
        this.backgroundColor = -7829368;
        this.progressColor = InputDeviceCompat.SOURCE_ANY;
        init();
    }

    private void init() {
        Paint paint = new Paint();
        this.backgroundPaint = paint;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.backgroundPaint.setStrokeWidth(this.strokeWidth);
        this.backgroundPaint.setColor(this.backgroundColor);
        this.backgroundPaint.setAntiAlias(true);
        Paint paint2 = this.backgroundPaint;
        Paint.Cap cap = Paint.Cap.ROUND;
        paint2.setStrokeCap(cap);
        Paint paint3 = new Paint();
        this.progressPaint = paint3;
        paint3.setStyle(style);
        this.progressPaint.setStrokeWidth(this.strokeWidth);
        this.progressPaint.setColor(this.progressColor);
        this.progressPaint.setAntiAlias(true);
        this.progressPaint.setStrokeCap(cap);
    }

    public int getMax() {
        return this.max;
    }

    public int getProgress() {
        return this.progress;
    }

    @Override // android.view.View
    protected void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        int min = Math.min(getWidth() / 2, getHeight() / 2) - (this.strokeWidth / 2);
        RectF rectF = new RectF(r0 - min, r1 - min, r0 + min, r1 + min);
        canvas.drawArc(rectF, 130.0f, 280.0f, false, this.backgroundPaint);
        canvas.drawArc(rectF, 130.0f, (this.progress / this.max) * 280.0f, false, this.progressPaint);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i8) {
        this.backgroundColor = i8;
        this.backgroundPaint.setColor(i8);
        invalidate();
    }

    public void setMax(int i8) {
        if (i8 <= 0) {
            throw new IllegalArgumentException("Maximum value must be greater than 0");
        }
        this.max = i8;
        if (this.progress > i8) {
            this.progress = i8;
        }
        invalidate();
    }

    public void setProgress(int i8) {
        this.progress = Math.max(0, Math.min(this.max, i8));
        invalidate();
    }

    public void setProgressColor(int i8) {
        this.progressColor = i8;
        this.progressPaint.setColor(i8);
        invalidate();
    }

    public void setStrokeWidth(int i8) {
        this.strokeWidth = i8;
        float f8 = i8;
        this.backgroundPaint.setStrokeWidth(f8);
        this.progressPaint.setStrokeWidth(f8);
        invalidate();
    }

    public TrainingEffectProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.progress = 0;
        this.max = 100;
        this.strokeWidth = 12;
        this.backgroundColor = -7829368;
        this.progressColor = InputDeviceCompat.SOURCE_ANY;
        init();
    }

    public TrainingEffectProgressView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.progress = 0;
        this.max = 100;
        this.strokeWidth = 12;
        this.backgroundColor = -7829368;
        this.progressColor = InputDeviceCompat.SOURCE_ANY;
        init();
    }
}
