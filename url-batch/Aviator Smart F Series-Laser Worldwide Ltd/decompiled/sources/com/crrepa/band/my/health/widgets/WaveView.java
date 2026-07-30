package com.crrepa.band.my.health.widgets;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.R$styleable;

/* loaded from: classes2.dex */
public class WaveView extends View {
    private static final float DEFAULT_AMPLITUDE_RATIO = 0.03f;
    private static final float DEFAULT_WATER_LEVEL_RATIO = 0.5f;
    private static final float DEFAULT_WAVE_LENGTH_RATIO = 1.0f;
    private static final float DEFAULT_WAVE_SHIFT_RATIO = 0.0f;
    private float mAmplitudeRatio;
    private int mBehindWaveColor;
    private Paint mBorderPaint;
    private float mDefaultWaterLevel;
    private int mFrontWaveColor;
    private Matrix mShaderMatrix;
    private ShapeType mShapeType;
    private boolean mShowWave;
    private Paint mViewPaint;
    private float mWaterLevelRatio;
    private float mWaveLengthRatio;
    private BitmapShader mWaveShader;
    private float mWaveShiftRatio;

    public enum ShapeType {
        CIRCLE,
        SQUARE,
        CUSTOM
    }

    static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$crrepa$band$my$health$widgets$WaveView$ShapeType;

        static {
            int[] iArr = new int[ShapeType.values().length];
            $SwitchMap$com$crrepa$band$my$health$widgets$WaveView$ShapeType = iArr;
            try {
                iArr[ShapeType.CIRCLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$crrepa$band$my$health$widgets$WaveView$ShapeType[ShapeType.SQUARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$crrepa$band$my$health$widgets$WaveView$ShapeType[ShapeType.CUSTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public WaveView(Context context) {
        super(context);
        this.mAmplitudeRatio = DEFAULT_AMPLITUDE_RATIO;
        this.mWaveLengthRatio = 1.0f;
        this.mWaterLevelRatio = 0.5f;
        this.mWaveShiftRatio = 0.0f;
        this.mBehindWaveColor = 0;
        this.mFrontWaveColor = 0;
        init();
    }

    private void createShader() {
        double width = 6.283185307179586d / getWidth();
        float height = getHeight() * DEFAULT_AMPLITUDE_RATIO;
        this.mDefaultWaterLevel = getHeight() * 0.5f;
        Bitmap createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
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
            double d8 = width;
            float sin = (float) (this.mDefaultWaterLevel + (height * Math.sin(i8 * width)));
            float f8 = i8;
            int i9 = i8;
            canvas.drawLine(f8, sin, f8, height2, paint);
            fArr[i9] = sin;
            i8 = i9 + 1;
            width = d8;
        }
        paint.setColor(this.mFrontWaveColor);
        for (int i10 = 0; i10 < width2; i10++) {
            float f9 = i10;
            canvas.drawLine(f9, fArr[((getWidth() / 4) + i10) % width2], f9, height2, paint);
        }
        BitmapShader bitmapShader = new BitmapShader(createBitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP);
        this.mWaveShader = bitmapShader;
        this.mViewPaint.setShader(bitmapShader);
    }

    private ShapeType getShapeType(int i8) {
        return i8 != 0 ? i8 != 1 ? ShapeType.CUSTOM : ShapeType.SQUARE : ShapeType.CIRCLE;
    }

    @SuppressLint({"ResourceAsColor"})
    private void init(Context context, AttributeSet attributeSet) {
        init();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.WaveView);
        this.mAmplitudeRatio = obtainStyledAttributes.getFloat(0, DEFAULT_AMPLITUDE_RATIO);
        this.mWaterLevelRatio = obtainStyledAttributes.getFloat(7, 0.5f);
        this.mWaveLengthRatio = obtainStyledAttributes.getFloat(4, 1.0f);
        this.mWaveShiftRatio = obtainStyledAttributes.getFloat(6, 0.0f);
        this.mFrontWaveColor = obtainStyledAttributes.getColor(2, R.color.color_water_wave_front);
        this.mBehindWaveColor = obtainStyledAttributes.getColor(1, R.color.color_water_wave_behind);
        this.mShapeType = getShapeType(obtainStyledAttributes.getInt(5, 2));
        this.mShowWave = obtainStyledAttributes.getBoolean(3, true);
        obtainStyledAttributes.recycle();
    }

    public void drawWaterCup(Canvas canvas) {
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

    public float getAmplitudeRatio() {
        return this.mAmplitudeRatio;
    }

    public float getWaterLevelRatio() {
        return this.mWaterLevelRatio;
    }

    public float getWaveLengthRatio() {
        return this.mWaveLengthRatio;
    }

    public float getWaveShiftRatio() {
        return this.mWaveShiftRatio;
    }

    public boolean isShowWave() {
        return this.mShowWave;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (!this.mShowWave || this.mWaveShader == null) {
            this.mViewPaint.setShader(null);
            return;
        }
        if (this.mViewPaint.getShader() == null) {
            this.mViewPaint.setShader(this.mWaveShader);
        }
        this.mShaderMatrix.setScale(this.mWaveLengthRatio / 1.0f, this.mAmplitudeRatio / DEFAULT_AMPLITUDE_RATIO, 0.0f, this.mDefaultWaterLevel);
        this.mShaderMatrix.postTranslate(this.mWaveShiftRatio * getWidth(), (0.5f - this.mWaterLevelRatio) * getHeight());
        this.mWaveShader.setLocalMatrix(this.mShaderMatrix);
        Paint paint = this.mBorderPaint;
        float strokeWidth = paint == null ? 0.0f : paint.getStrokeWidth();
        int i8 = a.$SwitchMap$com$crrepa$band$my$health$widgets$WaveView$ShapeType[this.mShapeType.ordinal()];
        if (i8 == 1) {
            if (strokeWidth > 0.0f) {
                canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, ((getWidth() - strokeWidth) / 2.0f) - 1.0f, this.mBorderPaint);
            }
            canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, (getWidth() / 2.0f) - strokeWidth, this.mViewPaint);
        } else if (i8 != 2) {
            if (i8 != 3) {
                return;
            }
            drawWaterCup(canvas);
        } else {
            if (strokeWidth > 0.0f) {
                float f8 = strokeWidth / 2.0f;
                canvas.drawRect(f8, f8, (getWidth() - f8) - 0.5f, (getHeight() - f8) - 0.5f, this.mBorderPaint);
            }
            canvas.drawRect(strokeWidth, strokeWidth, getWidth() - strokeWidth, getHeight() - strokeWidth, this.mViewPaint);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i8, int i9, int i10, int i11) {
        super.onSizeChanged(i8, i9, i10, i11);
        createShader();
    }

    public void setAmplitudeRatio(float f8) {
        if (this.mAmplitudeRatio != f8) {
            this.mAmplitudeRatio = f8;
            invalidate();
        }
    }

    public void setBorder(int i8, int i9) {
        if (this.mBorderPaint == null) {
            Paint paint = new Paint();
            this.mBorderPaint = paint;
            paint.setAntiAlias(true);
            this.mBorderPaint.setStyle(Paint.Style.STROKE);
        }
        this.mBorderPaint.setColor(i9);
        this.mBorderPaint.setStrokeWidth(i8);
        invalidate();
    }

    public void setShapeType(ShapeType shapeType) {
        this.mShapeType = shapeType;
        invalidate();
    }

    public void setShowWave(boolean z7) {
        this.mShowWave = z7;
    }

    public void setWaterLevelRatio(float f8) {
        if (this.mWaterLevelRatio != f8) {
            this.mWaterLevelRatio = f8;
            invalidate();
        }
    }

    public void setWaveColor(int i8, int i9) {
        this.mBehindWaveColor = i8;
        this.mFrontWaveColor = i9;
        if (getWidth() <= 0 || getHeight() <= 0) {
            return;
        }
        this.mWaveShader = null;
        createShader();
        invalidate();
    }

    public void setWaveLengthRatio(float f8) {
        this.mWaveLengthRatio = f8;
    }

    public void setWaveShiftRatio(float f8) {
        if (this.mWaveShiftRatio != f8) {
            this.mWaveShiftRatio = f8;
            invalidate();
        }
    }

    public WaveView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mAmplitudeRatio = DEFAULT_AMPLITUDE_RATIO;
        this.mWaveLengthRatio = 1.0f;
        this.mWaterLevelRatio = 0.5f;
        this.mWaveShiftRatio = 0.0f;
        this.mBehindWaveColor = 0;
        this.mFrontWaveColor = 0;
        init(context, attributeSet);
    }

    public WaveView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.mAmplitudeRatio = DEFAULT_AMPLITUDE_RATIO;
        this.mWaveLengthRatio = 1.0f;
        this.mWaterLevelRatio = 0.5f;
        this.mWaveShiftRatio = 0.0f;
        this.mBehindWaveColor = 0;
        this.mFrontWaveColor = 0;
        init(context, attributeSet);
    }

    private void init() {
        this.mShaderMatrix = new Matrix();
        Paint paint = new Paint();
        this.mViewPaint = paint;
        paint.setAntiAlias(true);
    }
}
