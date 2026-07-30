package com.crrepa.band.my.device.watchfacenew.video.widgets;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes2.dex */
public class VideoCropMaskView extends View {
    private Paint bgPaint;
    private Paint borderPaint;
    private float borderStrokeWidth;
    private float centerX;
    private float centerY;
    private float cornerRadius;
    private float frameHeight;
    private float frameWidth;
    private Paint holePaint;
    private Path holePath;
    private boolean isCircleFrame;

    public VideoCropMaskView(Context context) {
        super(context);
        this.borderStrokeWidth = 4.0f;
        init();
    }

    private void init() {
        Paint paint = new Paint(1);
        this.bgPaint = paint;
        paint.setColor(-16777216);
        this.bgPaint.setAlpha(178);
        this.bgPaint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint(1);
        this.holePaint = paint2;
        paint2.setColor(0);
        this.holePaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.holePath = new Path();
        Paint paint3 = new Paint(1);
        this.borderPaint = paint3;
        paint3.setColor(-1);
        this.borderPaint.setStyle(Paint.Style.STROKE);
        this.borderPaint.setStrokeWidth(this.borderStrokeWidth);
    }

    @Override // android.view.View
    @SuppressLint({"NewApi"})
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.bgPaint);
        if (this.isCircleFrame) {
            this.holePath.addCircle(this.centerX, this.centerY, (this.frameWidth / 2.0f) - this.borderStrokeWidth, Path.Direction.CCW);
        } else {
            float f8 = this.borderStrokeWidth / 2.0f;
            Path path = this.holePath;
            float f9 = this.centerX;
            float f10 = this.frameWidth;
            float f11 = (f9 - (f10 / 2.0f)) + f8;
            float f12 = this.centerY;
            float f13 = this.frameHeight;
            float f14 = (f12 - (f13 / 2.0f)) + f8;
            float f15 = (f9 + (f10 / 2.0f)) - f8;
            float f16 = (f12 + (f13 / 2.0f)) - f8;
            float f17 = this.cornerRadius;
            path.addRoundRect(f11, f14, f15, f16, f17, f17, Path.Direction.CCW);
        }
        canvas.drawPath(this.holePath, this.holePaint);
        canvas.drawPath(this.holePath, this.borderPaint);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i8, int i9, int i10, int i11) {
        super.onSizeChanged(i8, i9, i10, i11);
        this.centerX = i8 / 2.0f;
        this.centerY = i9 / 2.0f;
    }

    public void setBorderStrokeWidth(float f8) {
        this.borderStrokeWidth = f8;
        this.borderPaint.setStrokeWidth(f8);
    }

    public void setCircleFrame(int i8, int i9) {
        this.frameWidth = i8;
        this.frameHeight = i9;
        this.isCircleFrame = true;
        invalidate();
    }

    public void setCornerFrame(int i8, int i9, float f8) {
        this.frameWidth = i8;
        this.frameHeight = i9;
        this.cornerRadius = f8;
        invalidate();
    }

    public VideoCropMaskView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.borderStrokeWidth = 4.0f;
        init();
    }

    public VideoCropMaskView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.borderStrokeWidth = 4.0f;
        init();
    }
}
