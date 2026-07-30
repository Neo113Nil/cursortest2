package com.moyoung.dafit.module.common.widgets;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorInt;

/* loaded from: classes4.dex */
public class CircleDisplayView extends View {
    public static final int PAINT_ARC = 2;
    public static final int PAINT_INNER = 3;
    public static final int PAINT_TEXT = 1;
    private boolean anticlockwise;
    private float mAngle;
    private Paint mArcPaint;
    private boolean mBoxSetup;
    private RectF mCircleBox;
    private String mCustomText;
    private int mDimAlpha;
    private boolean mDrawInner;
    private boolean mDrawText;
    private Paint mInnerCirclePaint;
    private float mMaxValue;
    private float mStartAngle;
    private float mStepSize;
    private Paint mTextPaint;
    private float mValue;
    private float mValueWidthPercent;
    private int progressBgColor;
    private int progressColor;

    public static abstract class a {
        public static float convertDpToPixel(Resources resources, float f8) {
            return f8 * (resources.getDisplayMetrics().densityDpi / 160.0f);
        }
    }

    public CircleDisplayView(Context context) {
        super(context);
        this.mStartAngle = 270.0f;
        this.mStepSize = 1.0f;
        this.mAngle = 0.0f;
        this.mValue = 0.0f;
        this.mMaxValue = 0.0f;
        this.mValueWidthPercent = 50.0f;
        this.mDrawInner = true;
        this.mDrawText = true;
        this.anticlockwise = false;
        this.mDimAlpha = 50;
        this.progressBgColor = -1;
        this.progressColor = -1;
        this.mCustomText = null;
        this.mCircleBox = new RectF();
        this.mBoxSetup = false;
        init();
    }

    private float calcAngle(float f8) {
        return (f8 / 100.0f) * 360.0f;
    }

    private void drawCustomText(Canvas canvas) {
        canvas.drawText(this.mCustomText, getWidth() / 2, (getHeight() / 2) + this.mTextPaint.descent(), this.mTextPaint);
    }

    private void drawInnerCircle(Canvas canvas) {
        canvas.drawCircle(getWidth() / 2, getHeight() / 2, (getRadius() / 100.0f) * (100.0f - this.mValueWidthPercent), this.mInnerCirclePaint);
    }

    private void drawText(Canvas canvas) {
        canvas.drawText(String.valueOf(this.mValue), getWidth() / 2, (getHeight() / 2) + this.mTextPaint.descent(), this.mTextPaint);
    }

    private void drawValue(Canvas canvas) {
        int i8 = this.progressColor;
        if (i8 == -1) {
            this.mArcPaint.setAlpha(255);
        } else {
            this.mArcPaint.setColor(i8);
        }
        canvas.drawArc(this.mCircleBox, this.mStartAngle, this.anticlockwise ? -this.mAngle : this.mAngle, true, this.mArcPaint);
    }

    private void drawWholeCircle(Canvas canvas) {
        int i8 = this.progressBgColor;
        if (i8 == -1) {
            this.mArcPaint.setAlpha(this.mDimAlpha);
        } else {
            this.mArcPaint.setColor(i8);
        }
        canvas.drawCircle(getWidth() / 2, getHeight() / 2, getRadius(), this.mArcPaint);
    }

    private void init() {
        this.mBoxSetup = false;
        Paint paint = new Paint(1);
        this.mArcPaint = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        Paint paint2 = new Paint(1);
        this.mInnerCirclePaint = paint2;
        paint2.setStyle(style);
        this.mInnerCirclePaint.setColor(-1);
        Paint paint3 = new Paint(1);
        this.mTextPaint = paint3;
        paint3.setStyle(style);
        this.mTextPaint.setTextAlign(Paint.Align.CENTER);
        this.mTextPaint.setColor(-16777216);
        this.mTextPaint.setTextSize(a.convertDpToPixel(getResources(), 16.0f));
    }

    private void setupBox() {
        int width = getWidth();
        int height = getHeight();
        float f8 = width / 2;
        float diameter = getDiameter() / 2.0f;
        float f9 = height / 2;
        this.mCircleBox = new RectF(f8 - diameter, f9 - diameter, f8 + diameter, f9 + diameter);
    }

    public float distanceToCenter(float f8, float f9) {
        PointF center = getCenter();
        float f10 = center.x;
        return (float) Math.sqrt(Math.pow(f8 > f10 ? f8 - f10 : f10 - f8, 2.0d) + Math.pow(f9 > center.y ? f9 - r0 : r0 - f9, 2.0d));
    }

    public float getAngleForPoint(float f8, float f9) {
        PointF center = getCenter();
        double d8 = f8 - center.x;
        double d9 = f9 - center.y;
        float degrees = (float) Math.toDegrees(Math.acos(d9 / Math.sqrt((d8 * d8) + (d9 * d9))));
        if (f8 > center.x) {
            degrees = 360.0f - degrees;
        }
        float f10 = degrees + 180.0f;
        return f10 > 360.0f ? f10 - 360.0f : f10;
    }

    public float getAngleForValue(float f8) {
        return (f8 / this.mMaxValue) * 360.0f;
    }

    public PointF getCenter() {
        return new PointF(getWidth() / 2, getHeight() / 2);
    }

    public float getDiameter() {
        return Math.min(getWidth(), getHeight());
    }

    public float getMaxValue() {
        return this.mMaxValue;
    }

    public float getRadius() {
        return getDiameter() / 2.0f;
    }

    public float getStepSize() {
        return this.mStepSize;
    }

    public float getValue() {
        return this.mValue;
    }

    public float getValueForAngle(float f8) {
        return (f8 / 360.0f) * this.mMaxValue;
    }

    public boolean isDrawInnerCircleEnabled() {
        return this.mDrawInner;
    }

    public boolean isDrawTextEnabled() {
        return this.mDrawText;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.mBoxSetup) {
            this.mBoxSetup = true;
            setupBox();
        }
        drawWholeCircle(canvas);
        drawValue(canvas);
        if (this.mDrawInner) {
            drawInnerCircle(canvas);
        }
        if (this.mDrawText) {
            if (TextUtils.isEmpty(this.mCustomText)) {
                drawText(canvas);
            } else {
                drawCustomText(canvas);
            }
        }
    }

    public void setAnticlockwise(boolean z7) {
        this.anticlockwise = z7;
    }

    public void setColor(int i8) {
        this.mArcPaint.setColor(i8);
        this.progressColor = i8;
    }

    public void setCustomText(String str) {
        this.mCustomText = str;
    }

    public void setDimAlpha(int i8) {
        this.mDimAlpha = i8;
    }

    public void setDrawInnerCircle(boolean z7) {
        this.mDrawInner = z7;
    }

    public void setDrawText(boolean z7) {
        this.mDrawText = z7;
    }

    public void setInnerCircleColor(int i8) {
        this.mInnerCirclePaint.setColor(i8);
    }

    public void setPaint(int i8, Paint paint) {
        if (i8 == 1) {
            this.mTextPaint = paint;
        } else if (i8 == 2) {
            this.mArcPaint = paint;
        } else {
            if (i8 != 3) {
                return;
            }
            this.mInnerCirclePaint = paint;
        }
    }

    public void setProgressBgColor(int i8) {
        this.progressBgColor = i8;
    }

    public void setStartAngle(float f8) {
        this.mStartAngle = f8;
    }

    public void setStepSize(float f8) {
        this.mStepSize = f8;
    }

    public void setTextBold(boolean z7) {
        this.mTextPaint.setFakeBoldText(true);
    }

    public void setTextColor(@ColorInt int i8) {
        this.mTextPaint.setColor(i8);
    }

    public void setTextSize(float f8) {
        this.mTextPaint.setTextSize(a.convertDpToPixel(getResources(), f8));
    }

    public void setValueWidthPercent(float f8) {
        this.mValueWidthPercent = f8;
    }

    public void showValue(float f8, float f9) {
        this.mAngle = calcAngle((f8 / f9) * 100.0f);
        this.mValue = f8;
        this.mMaxValue = f9;
        invalidate();
    }

    public CircleDisplayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mStartAngle = 270.0f;
        this.mStepSize = 1.0f;
        this.mAngle = 0.0f;
        this.mValue = 0.0f;
        this.mMaxValue = 0.0f;
        this.mValueWidthPercent = 50.0f;
        this.mDrawInner = true;
        this.mDrawText = true;
        this.anticlockwise = false;
        this.mDimAlpha = 50;
        this.progressBgColor = -1;
        this.progressColor = -1;
        this.mCustomText = null;
        this.mCircleBox = new RectF();
        this.mBoxSetup = false;
        init();
    }

    public CircleDisplayView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.mStartAngle = 270.0f;
        this.mStepSize = 1.0f;
        this.mAngle = 0.0f;
        this.mValue = 0.0f;
        this.mMaxValue = 0.0f;
        this.mValueWidthPercent = 50.0f;
        this.mDrawInner = true;
        this.mDrawText = true;
        this.anticlockwise = false;
        this.mDimAlpha = 50;
        this.progressBgColor = -1;
        this.progressColor = -1;
        this.mCustomText = null;
        this.mCircleBox = new RectF();
        this.mBoxSetup = false;
        init();
    }
}
