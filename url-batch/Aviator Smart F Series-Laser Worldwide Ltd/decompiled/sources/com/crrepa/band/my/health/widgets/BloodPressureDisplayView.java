package com.crrepa.band.my.health.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.R$styleable;
import com.moyoung.dafit.module.common.utils.o;

/* loaded from: classes2.dex */
public class BloodPressureDisplayView extends View {
    private static final int KPA_INTERVAL = 2;
    private static final int KPA_UNIT = 1;
    private static final int MAX_KPA = 26;
    private static final int MAX_MMHG = 200;
    private static final int MIN_KPA = 0;
    private static final int MIN_MMHG = 0;
    private static final int MMHG_INTERVAL = 20;
    private static final int MMHG_UNIT = 10;
    private int color;
    private int dbp;
    private float lineWidth;
    private int max;
    private int min;
    private Paint paint;
    private float progressWidth;
    private int sbp;
    private int scaleMargin;
    private float scaleWidth;
    private float textSize;

    public BloodPressureDisplayView(Context context) {
        this(context, null);
    }

    private void drawProgressBar(Canvas canvas, float f8, float f9) {
        float f10 = f8 - f9;
        float contenTop = getContenTop();
        float f11 = f8 + f9;
        float contentBottom = getContentBottom();
        Path roundPath = getRoundPath(f10, contenTop, f11, contentBottom);
        this.paint.setStyle(Paint.Style.STROKE);
        canvas.drawPath(roundPath, this.paint);
        float contentHeight = getContentHeight() / (this.max - this.min);
        Path roundPath2 = getRoundPath(f10, contentBottom - (this.sbp * contentHeight), f11, contentBottom - (this.dbp * contentHeight));
        this.paint.setStyle(Paint.Style.FILL);
        canvas.drawPath(roundPath2, this.paint);
    }

    private void drawScale(Canvas canvas, float f8, float f9) {
        float contentHeight = getContentHeight();
        float f10 = contentHeight / 26;
        float f11 = f8 + f9 + this.scaleMargin;
        this.paint.setStyle(Paint.Style.FILL);
        int i8 = 0;
        for (int i9 = 26; i8 <= i9; i9 = 26) {
            float paddingTop = (contentHeight - (i8 * f10)) + getPaddingTop();
            float textSize = (this.paint.getTextSize() / 3.0f) + paddingTop;
            if (i8 == 0) {
                paddingTop -= this.lineWidth / 2.0f;
                textSize -= this.paint.getTextSize() / 3.0f;
            } else if (i8 == i9) {
                paddingTop += this.lineWidth / 2.0f;
                textSize += this.paint.getTextSize() / 3.0f;
            }
            float f12 = paddingTop;
            float f13 = textSize;
            if (i8 % 2 == 0) {
                canvas.drawLine(f11, f12, f11 + (this.scaleWidth * 2.0f), f12, this.paint);
                canvas.drawText(String.valueOf(i8), (this.scaleWidth * 3.0f) + f11, f13, this.paint);
            } else {
                canvas.drawLine(f11, f12, f11 + this.scaleWidth, f12, this.paint);
            }
            i8++;
        }
        float f14 = contentHeight / 200;
        float f15 = (f8 - f9) - this.scaleMargin;
        for (int i10 = 0; i10 <= 200; i10 += 10) {
            float paddingTop2 = (contentHeight - (i10 * f14)) + getPaddingTop();
            float textSize2 = (this.paint.getTextSize() / 3.0f) + paddingTop2;
            if (i10 == 0) {
                paddingTop2 -= this.lineWidth / 2.0f;
                textSize2 -= this.paint.getTextSize() / 3.0f;
            } else if (i10 == 200) {
                paddingTop2 += this.lineWidth / 2.0f;
                textSize2 += this.paint.getTextSize() / 3.0f;
            }
            float f16 = paddingTop2;
            float f17 = textSize2;
            if (i10 % 20 == 0) {
                canvas.drawLine(f15, f16, f15 - (this.scaleWidth * 2.0f), f16, this.paint);
                canvas.drawText(String.valueOf(i10), (f15 - (this.scaleWidth * 3.0f)) - getTextLength(r1), f17, this.paint);
            } else {
                canvas.drawLine(f15, f16, f15 - this.scaleWidth, f16, this.paint);
            }
        }
    }

    private void drawText(Canvas canvas, float f8, float f9) {
        float height = getHeight() - getPaddingBottom();
        float f10 = f8 - f9;
        canvas.drawText(getContext().getString(R.string.blood_pressure_unit), ((f10 - (this.scaleWidth * 4.0f)) - getTextLength(r1)) + o.dp2px(getContext(), 2.0f), height, this.paint);
        float f11 = this.scaleWidth;
        float f12 = f8 + f9;
        float textSize = height - (this.paint.getTextSize() / 3.0f);
        canvas.drawLine(f10 - (f11 * 3.0f), textSize, f12 + (f11 * 3.0f), textSize, this.paint);
        canvas.drawText(getContext().getString(R.string.kpa_unit), f12 + (this.scaleWidth * 4.0f), height, this.paint);
    }

    private float getContenTop() {
        return getPaddingTop();
    }

    private float getContentBottom() {
        return ((getHeight() - getPaddingBottom()) - this.paint.getTextSize()) - this.scaleMargin;
    }

    private float getContentHeight() {
        return (((getHeight() - getPaddingTop()) - getPaddingBottom()) - this.paint.getTextSize()) - this.scaleMargin;
    }

    private float getContentWidth() {
        return getWidth();
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

    private int getTextLength(String str) {
        new Paint().getTextBounds(str, 0, str.length(), new Rect());
        return o.dp2px(getContext(), r1.width());
    }

    private void initAttributes(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.bloodPressureDisplayView, 0, 0);
        this.min = obtainStyledAttributes.getInteger(5, 0);
        this.max = obtainStyledAttributes.getInteger(4, 0);
        this.dbp = obtainStyledAttributes.getInteger(1, 0);
        this.sbp = obtainStyledAttributes.getInteger(6, 0);
        this.color = obtainStyledAttributes.getColor(0, -1);
        this.lineWidth = obtainStyledAttributes.getDimension(3, o.dp2px(context, 1.0f));
        this.textSize = obtainStyledAttributes.getDimension(8, o.dp2px(context, 11.0f));
        this.progressWidth = obtainStyledAttributes.getDimension(2, o.dp2px(context, 24.0f));
        this.scaleWidth = obtainStyledAttributes.getDimension(7, o.dp2px(context, 4.0f));
        this.scaleMargin = o.dp2px(getContext(), 4.0f);
    }

    private void initPaint() {
        this.paint.setColor(this.color);
        this.paint.setStrokeWidth(this.lineWidth);
        this.paint.setAntiAlias(true);
        this.paint.setTextSize(this.textSize);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float contentWidth = getContentWidth() / 2.0f;
        float f8 = this.progressWidth / 2.0f;
        com.orhanobut.logger.f.d("onDraw: " + f8);
        drawProgressBar(canvas, contentWidth, f8);
        drawScale(canvas, contentWidth, f8);
        drawText(canvas, contentWidth, f8);
    }

    public void setBp(int i8, int i9) {
        this.sbp = i8;
        this.dbp = i9;
        invalidate();
    }

    public BloodPressureDisplayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BloodPressureDisplayView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.paint = new Paint();
        initAttributes(context, attributeSet);
        initPaint();
        setLayerType(1, null);
    }
}
