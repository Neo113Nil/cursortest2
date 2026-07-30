package com.moyoung.dafit.module.common.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.moyoung.dafit.module.common.R$styleable;

/* loaded from: classes4.dex */
public class CircleProgressView extends View {
    protected float mCenterX;
    protected float mCenterY;
    private int mColor1;
    private int mColor2;
    private int mInactiveColor;
    protected int mMaxProgress;
    protected int mMinProgress;
    private Paint mPaint;
    protected int mProgress;
    protected float mRadius;
    private float mRingBias;
    protected float mSectionHeight;
    private float mSectionRatio;
    private RectF mSectionRect;

    public CircleProgressView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.mRingBias = 0.15f;
        this.mSectionRatio = 5.0f;
        this.mSectionRect = new RectF();
        this.mMinProgress = 0;
        this.mMaxProgress = 100;
        this.mProgress = 0;
        this.mPaint = new Paint();
        this.mColor1 = Color.parseColor("#ff33b5e5");
        this.mColor2 = Color.parseColor("#ffff5900");
        this.mInactiveColor = Color.parseColor("#ffffffff");
        this.mPaint.setAntiAlias(true);
        this.mPaint.setStyle(Paint.Style.FILL);
        initAttributes(context, attributeSet);
    }

    private void initAttributes(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.CircleProgressView, 0, 0);
        try {
            this.mMinProgress = Math.max(obtainStyledAttributes.getInteger(R$styleable.CircleProgressView_min, 0), 0);
            this.mMaxProgress = Math.max(obtainStyledAttributes.getInteger(R$styleable.CircleProgressView_max, 100), 1);
            this.mProgress = Math.max(Math.min(obtainStyledAttributes.getInteger(R$styleable.CircleProgressView_progress, 0), this.mMaxProgress), 0);
            this.mColor1 = obtainStyledAttributes.getColor(R$styleable.CircleProgressView_startColor, Color.parseColor("#ffffffff"));
            this.mColor2 = obtainStyledAttributes.getColor(R$styleable.CircleProgressView_endColor, Color.parseColor("#ff1a84d4"));
            this.mInactiveColor = obtainStyledAttributes.getColor(R$styleable.CircleProgressView_inactiveColor, Color.parseColor("#00ffffff"));
            this.mRingBias = obtainStyledAttributes.getFloat(R$styleable.CircleProgressView_ringBias, 0.03f);
            this.mSectionRatio = obtainStyledAttributes.getFloat(R$styleable.CircleProgressView_sectionRatio, 0.5f);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private float interpolate(float f8, float f9, float f10) {
        return f8 + ((f9 - f8) * f10);
    }

    private int interpolateColor(int i8, int i9, float f8) {
        float[] fArr = new float[3];
        Color.colorToHSV(i8, fArr);
        float[] fArr2 = new float[3];
        Color.colorToHSV(i9, fArr2);
        fArr2[0] = interpolate(fArr[0], fArr2[0], f8);
        fArr2[1] = interpolate(fArr[1], fArr2[1], f8);
        fArr2[2] = interpolate(fArr[2], fArr2[2], f8);
        return isInEditMode() ? i8 : Color.HSVToColor(fArr2);
    }

    private void updateDimensions(int i8, int i9) {
        this.mCenterX = i8 / 2.0f;
        this.mCenterY = i9 / 2.0f;
        float min = Math.min(i8, i9) / 2;
        float f8 = this.mRingBias * min;
        float f9 = f8 / this.mSectionRatio;
        float f10 = f8 / 2.0f;
        this.mRadius = min - f10;
        this.mSectionRect.set((-f9) / 2.0f, (-f8) / 2.0f, f9 / 2.0f, f10);
        this.mSectionHeight = f8;
    }

    public float getMax() {
        return this.mMaxProgress;
    }

    public float getMin() {
        return this.mMinProgress;
    }

    public int getProgress() {
        return this.mProgress;
    }

    public float getRatio() {
        int i8 = this.mMaxProgress;
        int i9 = this.mMinProgress;
        return (this.mProgress - i9) / (i8 - i9);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        canvas.translate(this.mCenterX, this.mCenterY);
        int i8 = this.mProgress;
        int i9 = this.mMinProgress;
        int i10 = i8 - i9;
        int i11 = this.mMaxProgress - i9;
        float f8 = 360.0f / i11;
        for (int i12 = 0; i12 < i11; i12++) {
            canvas.save();
            float f9 = i12;
            canvas.rotate(f9 * f8);
            canvas.translate(0.0f, -this.mRadius);
            if (i12 < i10) {
                this.mPaint.setColor(interpolateColor(this.mColor1, this.mColor2, f9 / (i11 - 1)));
            } else {
                canvas.scale(0.7f, 0.7f);
                this.mPaint.setColor(this.mInactiveColor);
            }
            canvas.drawRect(this.mSectionRect, this.mPaint);
            canvas.restore();
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    protected synchronized void onMeasure(int i8, int i9) {
        try {
            if (View.MeasureSpec.getSize(i8) > View.MeasureSpec.getSize(i9)) {
                super.onMeasure(i9, i8);
            } else {
                super.onMeasure(i8, i8);
            }
            updateDimensions(getWidth(), getHeight());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i8, int i9, int i10, int i11) {
        super.onSizeChanged(i8, i9, i10, i11);
        updateDimensions(i8, i9);
    }

    public void setMax(int i8) {
        int max = Math.max(i8, 1);
        if (max != this.mMaxProgress) {
            this.mMaxProgress = max;
        }
        updateProgress(this.mProgress);
        invalidate();
    }

    public void setMin(int i8) {
        int max = Math.max(0, i8);
        if (max != this.mMinProgress) {
            this.mMinProgress = max;
        }
        updateProgress(this.mProgress);
        invalidate();
    }

    public void setProgress(int i8) {
        if (i8 > 100) {
            i8 = 100;
        }
        if (i8 < 0) {
            i8 = 0;
        }
        updateProgress(i8);
    }

    protected boolean updateProgress(int i8) {
        int max = Math.max(this.mMinProgress, Math.min(this.mMaxProgress, i8));
        if (max == this.mProgress) {
            return false;
        }
        this.mProgress = max;
        invalidate();
        return true;
    }

    public CircleProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mRingBias = 0.15f;
        this.mSectionRatio = 5.0f;
        this.mSectionRect = new RectF();
        this.mMinProgress = 0;
        this.mMaxProgress = 100;
        this.mProgress = 0;
        this.mPaint = new Paint();
        this.mColor1 = Color.parseColor("#ff33b5e5");
        this.mColor2 = Color.parseColor("#ffff5900");
        this.mInactiveColor = Color.parseColor("#ffffffff");
        this.mPaint.setAntiAlias(true);
        this.mPaint.setStyle(Paint.Style.FILL);
        initAttributes(context, attributeSet);
    }

    public CircleProgressView(Context context) {
        super(context);
        this.mRingBias = 0.15f;
        this.mSectionRatio = 5.0f;
        this.mSectionRect = new RectF();
        this.mMinProgress = 0;
        this.mMaxProgress = 100;
        this.mProgress = 0;
        this.mPaint = new Paint();
        this.mColor1 = Color.parseColor("#ff33b5e5");
        this.mColor2 = Color.parseColor("#ffff5900");
        this.mInactiveColor = Color.parseColor("#ffffffff");
        this.mPaint.setAntiAlias(true);
        this.mPaint.setStyle(Paint.Style.FILL);
    }
}
