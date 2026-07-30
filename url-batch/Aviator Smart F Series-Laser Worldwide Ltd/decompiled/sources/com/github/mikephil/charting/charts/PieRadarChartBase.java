package com.github.mikephil.charting.charts;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import com.github.mikephil.charting.animation.b;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.i;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.github.mikephil.charting.utils.e;

/* loaded from: classes3.dex */
public abstract class PieRadarChartBase<T extends i> extends Chart<T> {
    protected float mMinOffset;
    private float mRawRotationAngle;
    protected boolean mRotateEnabled;
    private float mRotationAngle;

    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            PieRadarChartBase.this.postInvalidate();
        }
    }

    static /* synthetic */ class b {
        static final /* synthetic */ int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendHorizontalAlignment;
        static final /* synthetic */ int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendOrientation;
        static final /* synthetic */ int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendVerticalAlignment;

        static {
            int[] iArr = new int[Legend.LegendOrientation.values().length];
            $SwitchMap$com$github$mikephil$charting$components$Legend$LegendOrientation = iArr;
            try {
                iArr[Legend.LegendOrientation.VERTICAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$components$Legend$LegendOrientation[Legend.LegendOrientation.HORIZONTAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[Legend.LegendHorizontalAlignment.values().length];
            $SwitchMap$com$github$mikephil$charting$components$Legend$LegendHorizontalAlignment = iArr2;
            try {
                iArr2[Legend.LegendHorizontalAlignment.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$components$Legend$LegendHorizontalAlignment[Legend.LegendHorizontalAlignment.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$components$Legend$LegendHorizontalAlignment[Legend.LegendHorizontalAlignment.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr3 = new int[Legend.LegendVerticalAlignment.values().length];
            $SwitchMap$com$github$mikephil$charting$components$Legend$LegendVerticalAlignment = iArr3;
            try {
                iArr3[Legend.LegendVerticalAlignment.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$components$Legend$LegendVerticalAlignment[Legend.LegendVerticalAlignment.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public PieRadarChartBase(Context context) {
        super(context);
        this.mRotationAngle = 270.0f;
        this.mRawRotationAngle = 270.0f;
        this.mRotateEnabled = true;
        this.mMinOffset = 0.0f;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    protected void calcMinMax() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007d, code lost:
    
        if (r2 != 2) goto L19;
     */
    @Override // com.github.mikephil.charting.charts.Chart
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void calculateOffsets() {
        float f8;
        float f9;
        float f10;
        float convertDpToPixel;
        float min;
        float f11;
        float f12;
        Legend legend = this.mLegend;
        float f13 = 0.0f;
        if (legend == null || !legend.isEnabled() || this.mLegend.isDrawInsideEnabled()) {
            f8 = 0.0f;
            f9 = 0.0f;
            f10 = 0.0f;
        } else {
            float min2 = Math.min(this.mLegend.mNeededWidth, this.mViewPortHandler.getChartWidth() * this.mLegend.getMaxSizePercent());
            int i8 = b.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendOrientation[this.mLegend.getOrientation().ordinal()];
            if (i8 != 1) {
                if (i8 == 2 && (this.mLegend.getVerticalAlignment() == Legend.LegendVerticalAlignment.TOP || this.mLegend.getVerticalAlignment() == Legend.LegendVerticalAlignment.BOTTOM)) {
                    min = Math.min(this.mLegend.mNeededHeight + getRequiredLegendOffset(), this.mViewPortHandler.getChartHeight() * this.mLegend.getMaxSizePercent());
                    int i9 = b.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendVerticalAlignment[this.mLegend.getVerticalAlignment().ordinal()];
                    if (i9 != 1) {
                    }
                    f12 = min;
                    convertDpToPixel = 0.0f;
                    f11 = 0.0f;
                }
                convertDpToPixel = 0.0f;
                f11 = 0.0f;
                f12 = 0.0f;
            } else {
                if (this.mLegend.getHorizontalAlignment() != Legend.LegendHorizontalAlignment.LEFT && this.mLegend.getHorizontalAlignment() != Legend.LegendHorizontalAlignment.RIGHT) {
                    convertDpToPixel = 0.0f;
                } else if (this.mLegend.getVerticalAlignment() == Legend.LegendVerticalAlignment.CENTER) {
                    convertDpToPixel = min2 + com.github.mikephil.charting.utils.i.convertDpToPixel(13.0f);
                } else {
                    convertDpToPixel = min2 + com.github.mikephil.charting.utils.i.convertDpToPixel(8.0f);
                    Legend legend2 = this.mLegend;
                    float f14 = legend2.mNeededHeight + legend2.mTextHeightMax;
                    e center = getCenter();
                    float width = this.mLegend.getHorizontalAlignment() == Legend.LegendHorizontalAlignment.RIGHT ? (getWidth() - convertDpToPixel) + 15.0f : convertDpToPixel - 15.0f;
                    float f15 = f14 + 15.0f;
                    float distanceToCenter = distanceToCenter(width, f15);
                    e position = getPosition(center, getRadius(), getAngleForPoint(width, f15));
                    float distanceToCenter2 = distanceToCenter(position.f14114x, position.f14115y);
                    float convertDpToPixel2 = com.github.mikephil.charting.utils.i.convertDpToPixel(5.0f);
                    if (f15 < center.f14115y || getHeight() - convertDpToPixel <= getWidth()) {
                        convertDpToPixel = distanceToCenter < distanceToCenter2 ? convertDpToPixel2 + (distanceToCenter2 - distanceToCenter) : 0.0f;
                    }
                    e.recycleInstance(center);
                    e.recycleInstance(position);
                }
                int i10 = b.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendHorizontalAlignment[this.mLegend.getHorizontalAlignment().ordinal()];
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            int i11 = b.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendVerticalAlignment[this.mLegend.getVerticalAlignment().ordinal()];
                            if (i11 == 1) {
                                min = Math.min(this.mLegend.mNeededHeight, this.mViewPortHandler.getChartHeight() * this.mLegend.getMaxSizePercent());
                                f12 = min;
                                convertDpToPixel = 0.0f;
                                f11 = 0.0f;
                            } else if (i11 == 2) {
                                min = Math.min(this.mLegend.mNeededHeight, this.mViewPortHandler.getChartHeight() * this.mLegend.getMaxSizePercent());
                                f11 = min;
                                convertDpToPixel = 0.0f;
                                f12 = 0.0f;
                            }
                        }
                    }
                    f11 = 0.0f;
                    f12 = 0.0f;
                } else {
                    f13 = convertDpToPixel;
                }
                convertDpToPixel = 0.0f;
                f11 = 0.0f;
                f12 = 0.0f;
            }
            f13 += getRequiredBaseOffset();
            f8 = convertDpToPixel + getRequiredBaseOffset();
            f10 = f12 + getRequiredBaseOffset();
            f9 = f11 + getRequiredBaseOffset();
        }
        float convertDpToPixel3 = com.github.mikephil.charting.utils.i.convertDpToPixel(this.mMinOffset);
        if (this instanceof RadarChart) {
            XAxis xAxis = getXAxis();
            if (xAxis.isEnabled() && xAxis.isDrawLabelsEnabled()) {
                convertDpToPixel3 = Math.max(convertDpToPixel3, xAxis.mLabelRotatedWidth);
            }
        }
        float extraTopOffset = f10 + getExtraTopOffset();
        float extraRightOffset = f8 + getExtraRightOffset();
        float extraBottomOffset = f9 + getExtraBottomOffset();
        float max = Math.max(convertDpToPixel3, f13 + getExtraLeftOffset());
        float max2 = Math.max(convertDpToPixel3, extraTopOffset);
        float max3 = Math.max(convertDpToPixel3, extraRightOffset);
        float max4 = Math.max(convertDpToPixel3, Math.max(getRequiredBaseOffset(), extraBottomOffset));
        this.mViewPortHandler.restrainViewPort(max, max2, max3, max4);
        if (this.mLogEnabled) {
            Log.i(Chart.LOG_TAG, "offsetLeft: " + max + ", offsetTop: " + max2 + ", offsetRight: " + max3 + ", offsetBottom: " + max4);
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        ChartTouchListener chartTouchListener = this.mChartTouchListener;
        if (chartTouchListener instanceof com.github.mikephil.charting.listener.e) {
            ((com.github.mikephil.charting.listener.e) chartTouchListener).computeScroll();
        }
    }

    public float distanceToCenter(float f8, float f9) {
        e centerOffsets = getCenterOffsets();
        float f10 = centerOffsets.f14114x;
        float sqrt = (float) Math.sqrt(Math.pow(f8 > f10 ? f8 - f10 : f10 - f8, 2.0d) + Math.pow(f9 > centerOffsets.f14115y ? f9 - r1 : r1 - f9, 2.0d));
        e.recycleInstance(centerOffsets);
        return sqrt;
    }

    public float getAngleForPoint(float f8, float f9) {
        e centerOffsets = getCenterOffsets();
        double d8 = f8 - centerOffsets.f14114x;
        double d9 = f9 - centerOffsets.f14115y;
        float degrees = (float) Math.toDegrees(Math.acos(d9 / Math.sqrt((d8 * d8) + (d9 * d9))));
        if (f8 > centerOffsets.f14114x) {
            degrees = 360.0f - degrees;
        }
        float f10 = degrees + 90.0f;
        if (f10 > 360.0f) {
            f10 -= 360.0f;
        }
        e.recycleInstance(centerOffsets);
        return f10;
    }

    public float getDiameter() {
        RectF contentRect = this.mViewPortHandler.getContentRect();
        contentRect.left += getExtraLeftOffset();
        contentRect.top += getExtraTopOffset();
        contentRect.right -= getExtraRightOffset();
        contentRect.bottom -= getExtraBottomOffset();
        return Math.min(contentRect.width(), contentRect.height());
    }

    public abstract int getIndexForAngle(float f8);

    @Override // com.github.mikephil.charting.charts.Chart, u4.e, u4.b
    public int getMaxVisibleCount() {
        return this.mData.getEntryCount();
    }

    public float getMinOffset() {
        return this.mMinOffset;
    }

    public e getPosition(e eVar, float f8, float f9) {
        e eVar2 = e.getInstance(0.0f, 0.0f);
        getPosition(eVar, f8, f9, eVar2);
        return eVar2;
    }

    public abstract float getRadius();

    public float getRawRotationAngle() {
        return this.mRawRotationAngle;
    }

    protected abstract float getRequiredBaseOffset();

    protected abstract float getRequiredLegendOffset();

    public float getRotationAngle() {
        return this.mRotationAngle;
    }

    @Override // com.github.mikephil.charting.charts.Chart, u4.e, u4.b
    public float getYChartMax() {
        return 0.0f;
    }

    @Override // com.github.mikephil.charting.charts.Chart, u4.e, u4.b
    public float getYChartMin() {
        return 0.0f;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    protected void init() {
        super.init();
        this.mChartTouchListener = new com.github.mikephil.charting.listener.e(this);
    }

    public boolean isRotationEnabled() {
        return this.mRotateEnabled;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public void notifyDataSetChanged() {
        if (this.mData == null) {
            return;
        }
        calcMinMax();
        if (this.mLegend != null) {
            this.mLegendRenderer.computeLegend(this.mData);
        }
        calculateOffsets();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ChartTouchListener chartTouchListener;
        return (!this.mTouchEnabled || (chartTouchListener = this.mChartTouchListener) == null) ? super.onTouchEvent(motionEvent) : chartTouchListener.onTouch(this, motionEvent);
    }

    public void setMinOffset(float f8) {
        this.mMinOffset = f8;
    }

    public void setRotationAngle(float f8) {
        this.mRawRotationAngle = f8;
        this.mRotationAngle = com.github.mikephil.charting.utils.i.getNormalizedAngle(f8);
    }

    public void setRotationEnabled(boolean z7) {
        this.mRotateEnabled = z7;
    }

    @SuppressLint({"NewApi"})
    public void spin(int i8, float f8, float f9, b.c0 c0Var) {
        setRotationAngle(f8);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "rotationAngle", f8, f9);
        ofFloat.setDuration(i8);
        ofFloat.setInterpolator(c0Var);
        ofFloat.addUpdateListener(new a());
        ofFloat.start();
    }

    public PieRadarChartBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mRotationAngle = 270.0f;
        this.mRawRotationAngle = 270.0f;
        this.mRotateEnabled = true;
        this.mMinOffset = 0.0f;
    }

    public PieRadarChartBase(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.mRotationAngle = 270.0f;
        this.mRawRotationAngle = 270.0f;
        this.mRotateEnabled = true;
        this.mMinOffset = 0.0f;
    }

    public void getPosition(e eVar, float f8, float f9, e eVar2) {
        double d8 = f8;
        double d9 = f9;
        eVar2.f14114x = (float) (eVar.f14114x + (Math.cos(Math.toRadians(d9)) * d8));
        eVar2.f14115y = (float) (eVar.f14115y + (d8 * Math.sin(Math.toRadians(d9))));
    }
}
