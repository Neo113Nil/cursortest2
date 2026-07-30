package com.crrepa.band.my.health.widgets;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public class WaveCalendarView extends View {
    private static final float DEFAULT_AMPLITUDE_RATIO = 0.035f;
    private static final float DEFAULT_MAX_LEVEL_RATIO = 1.0f;
    private static final float DEFAULT_MIN_LEVEL_RATIO = 0.0f;
    private static final float DEFAULT_WATER_LEVEL_RATIO = 0.5f;
    private static final float DEFAULT_WAVE_LENGTH_RATIO = 1.0f;
    private static final float DEFAULT_WAVE_SHIFT_RATIO = 0.0f;
    private int mBehindWaveColor;
    private float mDefaultWaterLevel;
    private int mFrontHighWaveColor;
    private int mFrontLowWaveColor;
    private Matrix mShaderMatrix;
    private Paint mViewPaint;
    private float mWaterLevelRatio;
    private BitmapShader mWaveShader;

    public WaveCalendarView(Context context) {
        super(context);
        this.mWaterLevelRatio = 0.5f;
        this.mBehindWaveColor = 0;
        this.mFrontHighWaveColor = 0;
        this.mFrontLowWaveColor = 0;
        init(context);
    }

    private void createShader() {
        int width = getWidth();
        int height = getHeight();
        double d8 = 6.283185307179586d / width;
        float f8 = height;
        float f9 = DEFAULT_AMPLITUDE_RATIO * f8;
        this.mDefaultWaterLevel = f8 * 0.5f;
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setStrokeWidth(2.0f);
        paint.setAntiAlias(true);
        int width2 = getWidth() + 1;
        int height2 = getHeight() + 1;
        float[] fArr = new float[width2];
        paint.setColor(this.mBehindWaveColor);
        int i8 = 0;
        while (i8 < width2) {
            double d9 = d8;
            Paint paint2 = paint;
            int i9 = width2;
            float cos = (float) (this.mDefaultWaterLevel + (f9 * Math.cos(i8 * d8)));
            float f10 = i8;
            int i10 = i8;
            float[] fArr2 = fArr;
            canvas.drawLine(f10 + ((width * 1.0f) / 4.0f), cos, f10, height2, paint2);
            fArr2[i10] = cos;
            i8 = i10 + 1;
            fArr = fArr2;
            height2 = height2;
            d8 = d9;
            paint = paint2;
            width2 = i9;
        }
        float[] fArr3 = fArr;
        Paint paint3 = paint;
        int i11 = width2;
        int i12 = height2;
        paint3.setColor(this.mWaterLevelRatio > 0.5f ? this.mFrontHighWaveColor : this.mFrontLowWaveColor);
        for (int i13 = 0; i13 < i11; i13++) {
            float f11 = i13;
            canvas.drawLine(f11, fArr3[((width / 4) + i13) % i11], f11, i12, paint3);
        }
        BitmapShader bitmapShader = new BitmapShader(createBitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP);
        this.mWaveShader = bitmapShader;
        if (this.mWaterLevelRatio < 1.0f) {
            this.mViewPaint.setShader(bitmapShader);
        } else {
            this.mViewPaint.setShader(null);
            this.mViewPaint.setColor(this.mFrontHighWaveColor);
        }
    }

    private void drawWaterCup(Canvas canvas) {
        float width = (getWidth() * 6.0f) / 45.0f;
        int width2 = getWidth();
        int height = getHeight();
        Path path = new Path();
        path.moveTo(width, 0.0f);
        float f8 = width2;
        float f9 = f8 - width;
        path.lineTo(f9, 0.0f);
        path.quadTo(f8, 0.0f, f8, width);
        float f10 = height;
        float f11 = f10 - width;
        path.lineTo(f9, f11);
        float f12 = 2.0f * width;
        path.quadTo(f9, f10, f8 - f12, f10);
        path.lineTo(f12, f10);
        path.quadTo(width, f10, width, f11);
        path.lineTo(0.0f, width);
        path.quadTo(0.0f, 0.0f, width, 0.0f);
        canvas.drawPath(path, this.mViewPaint);
    }

    private void init(Context context) {
        this.mShaderMatrix = new Matrix();
        Paint paint = new Paint();
        this.mViewPaint = paint;
        paint.setAntiAlias(true);
        this.mFrontHighWaveColor = ContextCompat.getColor(context, R.color.color_water_record_wave_front);
        this.mFrontLowWaveColor = ContextCompat.getColor(context, R.color.color_water_less_half);
        this.mBehindWaveColor = ContextCompat.getColor(context, R.color.color_water_record_wave_behind);
    }

    public float getWaterLevelRatio() {
        return this.mWaterLevelRatio;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.mWaterLevelRatio <= 0.0f || this.mWaveShader == null) {
            this.mViewPaint.setShader(null);
            this.mViewPaint.setColor(this.mFrontHighWaveColor);
            return;
        }
        if (this.mViewPaint.getShader() == null && this.mWaterLevelRatio < 1.0f) {
            this.mViewPaint.setShader(this.mWaveShader);
        }
        this.mShaderMatrix.setScale(1.0f, 1.0f, 0.0f, this.mDefaultWaterLevel);
        this.mShaderMatrix.postTranslate(getWidth() * 0.0f, (0.5f - this.mWaterLevelRatio) * getHeight());
        this.mWaveShader.setLocalMatrix(this.mShaderMatrix);
        drawWaterCup(canvas);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i8, int i9, int i10, int i11) {
        super.onSizeChanged(i8, i9, i10, i11);
        createShader();
    }

    public void setWaterLevelRatio(float f8) {
        if (f8 > 0.5f && f8 < 1.0f) {
            double d8 = f8;
            f8 = (float) (d8 - (0.05d * d8));
        }
        float min = Math.min(f8, 1.0f);
        if (this.mWaterLevelRatio != min) {
            this.mWaterLevelRatio = min;
            invalidate();
        }
    }

    public WaveCalendarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mWaterLevelRatio = 0.5f;
        this.mBehindWaveColor = 0;
        this.mFrontHighWaveColor = 0;
        this.mFrontLowWaveColor = 0;
        init(context);
    }

    public WaveCalendarView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.mWaterLevelRatio = 0.5f;
        this.mBehindWaveColor = 0;
        this.mFrontHighWaveColor = 0;
        this.mFrontLowWaveColor = 0;
        init(context);
    }
}
