package com.moyoung.dafit.module.common.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.github.mikephil.charting.utils.i;
import com.moyoung.dafit.module.common.R$styleable;

/* loaded from: classes4.dex */
public class CornerProgressBar extends View {
    private static final int DEFAULT_BACKGROUD_COLOR = -1052172;
    private static final int DEFAULT_END_COLOR = -14807;
    private static final int DEFAULT_MAX = 100;
    private static final int DEFAULT_PROGRESS = 0;
    private static final int DEFAULT_START_COLOR = -6643;
    private static final int DEFAULT_TEXT_COLOR = -13421773;
    private static final int DEFAULT_TEXT_SIZE = 14;
    private int backgroudColor;
    private Paint backgroudPaint;
    private int endColor;
    private double max;
    private PorterDuff.Mode mode;
    private Paint paint;
    private double progress;
    private int startColor;

    public CornerProgressBar(Context context) {
        super(context);
        this.max = 100.0d;
        this.progress = i.DOUBLE_EPSILON;
        this.startColor = DEFAULT_START_COLOR;
        this.endColor = DEFAULT_END_COLOR;
        this.backgroudColor = DEFAULT_BACKGROUD_COLOR;
        initStyle(null, 0, 0);
        initPaint();
    }

    private int calProgressWidth() {
        int width = getWidth();
        return Math.min((int) ((this.progress / this.max) * width), width);
    }

    private void initPaint() {
        Paint paint = new Paint(3);
        this.paint = paint;
        paint.setStrokeWidth(getHeight());
        Paint paint2 = this.paint;
        Paint.Cap cap = Paint.Cap.ROUND;
        paint2.setStrokeCap(cap);
        Paint paint3 = new Paint(3);
        this.backgroudPaint = paint3;
        paint3.setColor(this.backgroudColor);
        this.backgroudPaint.setStrokeCap(cap);
        this.mode = PorterDuff.Mode.SRC_IN;
    }

    private void initStyle(AttributeSet attributeSet, int i8, int i9) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.CornerProgressBar, i8, i9);
        this.max = obtainStyledAttributes.getInt(R$styleable.CornerProgressBar_barMax, 100);
        this.progress = obtainStyledAttributes.getInt(R$styleable.CornerProgressBar_barProgress, 0);
        int i10 = R$styleable.CornerProgressBar_barStartColor;
        this.startColor = obtainStyledAttributes.getColor(i10, DEFAULT_START_COLOR);
        this.endColor = obtainStyledAttributes.getColor(i10, DEFAULT_END_COLOR);
        this.backgroudColor = obtainStyledAttributes.getColor(R$styleable.CornerProgressBar_barBackColor, DEFAULT_BACKGROUD_COLOR);
        obtainStyledAttributes.recycle();
    }

    public double getMax() {
        return this.max;
    }

    public double getProgress() {
        return this.progress;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getWidth() == 0) {
            return;
        }
        float height = getHeight() / 2.0f;
        int calProgressWidth = calProgressWidth();
        float f8 = calProgressWidth;
        float f9 = f8 - height;
        canvas.drawLine(height, height, getWidth() - height, height, this.backgroudPaint);
        this.paint.setShader(new LinearGradient(0.0f, 0.0f, f8, 0.0f, this.startColor, this.endColor, Shader.TileMode.CLAMP));
        if (calProgressWidth > getHeight()) {
            canvas.drawLine(height, height, f9, height, this.paint);
            return;
        }
        Canvas canvas2 = new Canvas();
        int save = canvas.save();
        canvas2.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        int width = getWidth();
        int height2 = getHeight();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap createBitmap = Bitmap.createBitmap(width, height2, config);
        canvas2.setBitmap(createBitmap);
        canvas2.drawCircle(height, height, height, this.paint);
        Bitmap createBitmap2 = Bitmap.createBitmap(getWidth(), getHeight(), config);
        canvas2.setBitmap(createBitmap2);
        canvas2.drawCircle(f9, height, height, this.paint);
        canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), this.paint, 31);
        canvas.drawBitmap(createBitmap, 0.0f, 0.0f, this.paint);
        this.paint.setXfermode(new PorterDuffXfermode(this.mode));
        canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), this.paint, 31);
        this.paint.setXfermode(null);
        canvas.drawBitmap(createBitmap2, 0.0f, 0.0f, this.paint);
        canvas.restoreToCount(save);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i8, int i9, int i10, int i11) {
        super.onSizeChanged(i8, i9, i10, i11);
        this.paint.setStrokeWidth(getHeight());
        this.backgroudPaint.setStrokeWidth(getHeight());
        invalidate();
    }

    public void setMax(double d8) {
        if (d8 < i.DOUBLE_EPSILON) {
            d8 = 0.0d;
        }
        this.max = d8;
        invalidate();
    }

    public void setProgress(double d8) {
        if (d8 < i.DOUBLE_EPSILON) {
            d8 = 0.0d;
        }
        this.progress = d8;
        invalidate();
    }

    public CornerProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.max = 100.0d;
        this.progress = i.DOUBLE_EPSILON;
        this.startColor = DEFAULT_START_COLOR;
        this.endColor = DEFAULT_END_COLOR;
        this.backgroudColor = DEFAULT_BACKGROUD_COLOR;
        initStyle(attributeSet, 0, 0);
        initPaint();
    }

    public CornerProgressBar(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.max = 100.0d;
        this.progress = i.DOUBLE_EPSILON;
        this.startColor = DEFAULT_START_COLOR;
        this.endColor = DEFAULT_END_COLOR;
        this.backgroudColor = DEFAULT_BACKGROUD_COLOR;
        initStyle(attributeSet, i8, 0);
        initPaint();
    }
}
