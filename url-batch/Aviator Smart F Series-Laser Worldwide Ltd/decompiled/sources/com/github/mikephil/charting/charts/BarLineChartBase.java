package com.github.mikephil.charting.charts;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.c;
import com.github.mikephil.charting.jobs.f;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.github.mikephil.charting.listener.d;
import com.github.mikephil.charting.renderer.q;
import com.github.mikephil.charting.renderer.t;
import com.github.mikephil.charting.utils.e;
import com.github.mikephil.charting.utils.g;
import com.github.mikephil.charting.utils.i;
import com.github.mikephil.charting.utils.j;

@SuppressLint({"RtlHardcoded"})
/* loaded from: classes3.dex */
public abstract class BarLineChartBase<T extends c> extends Chart<T> implements u4.b {
    private long drawCycles;
    protected boolean mAutoScaleMinMaxEnabled;
    protected YAxis mAxisLeft;
    protected t mAxisRendererLeft;
    protected t mAxisRendererRight;
    protected YAxis mAxisRight;
    protected Paint mBorderPaint;
    protected boolean mClipValuesToContent;
    private boolean mCustomViewPortEnabled;
    protected boolean mDoubleTapToZoomEnabled;
    private boolean mDragXEnabled;
    private boolean mDragYEnabled;
    protected boolean mDrawBorders;
    protected boolean mDrawGridBackground;
    protected d mDrawListener;
    protected Matrix mFitScreenMatrixBuffer;
    protected float[] mGetPositionBuffer;
    protected Paint mGridBackgroundPaint;
    protected boolean mHighlightPerDragEnabled;
    protected boolean mKeepPositionOnRotation;
    protected g mLeftAxisTransformer;
    protected int mMaxVisibleCount;
    protected float mMinOffset;
    private RectF mOffsetsBuffer;
    protected float[] mOnSizeChangedBuffer;
    protected boolean mPinchZoomEnabled;
    protected g mRightAxisTransformer;
    private boolean mScaleXEnabled;
    private boolean mScaleYEnabled;
    protected q mXAxisRenderer;
    protected Matrix mZoomMatrixBuffer;
    protected com.github.mikephil.charting.utils.d posForGetHighestVisibleX;
    protected com.github.mikephil.charting.utils.d posForGetLowestVisibleX;
    private long totalTime;

    class a implements Runnable {
        final /* synthetic */ float val$bottom;
        final /* synthetic */ float val$left;
        final /* synthetic */ float val$right;
        final /* synthetic */ float val$top;

        a(float f8, float f9, float f10, float f11) {
            this.val$left = f8;
            this.val$top = f9;
            this.val$right = f10;
            this.val$bottom = f11;
        }

        @Override // java.lang.Runnable
        public void run() {
            BarLineChartBase.this.mViewPortHandler.restrainViewPort(this.val$left, this.val$top, this.val$right, this.val$bottom);
            BarLineChartBase.this.prepareOffsetMatrix();
            BarLineChartBase.this.prepareValuePxMatrix();
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

    public BarLineChartBase(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.mMaxVisibleCount = 100;
        this.mAutoScaleMinMaxEnabled = false;
        this.mPinchZoomEnabled = false;
        this.mDoubleTapToZoomEnabled = true;
        this.mHighlightPerDragEnabled = true;
        this.mDragXEnabled = true;
        this.mDragYEnabled = true;
        this.mScaleXEnabled = true;
        this.mScaleYEnabled = true;
        this.mDrawGridBackground = false;
        this.mDrawBorders = false;
        this.mClipValuesToContent = false;
        this.mMinOffset = 15.0f;
        this.mKeepPositionOnRotation = false;
        this.totalTime = 0L;
        this.drawCycles = 0L;
        this.mOffsetsBuffer = new RectF();
        this.mZoomMatrixBuffer = new Matrix();
        this.mFitScreenMatrixBuffer = new Matrix();
        this.mCustomViewPortEnabled = false;
        this.mGetPositionBuffer = new float[2];
        this.posForGetLowestVisibleX = com.github.mikephil.charting.utils.d.getInstance(i.DOUBLE_EPSILON, i.DOUBLE_EPSILON);
        this.posForGetHighestVisibleX = com.github.mikephil.charting.utils.d.getInstance(i.DOUBLE_EPSILON, i.DOUBLE_EPSILON);
        this.mOnSizeChangedBuffer = new float[2];
    }

    protected void autoScale() {
        ((c) this.mData).calcMinMaxY(getLowestVisibleX(), getHighestVisibleX());
        this.mXAxis.calculate(((c) this.mData).getXMin(), ((c) this.mData).getXMax());
        if (this.mAxisLeft.isEnabled()) {
            YAxis yAxis = this.mAxisLeft;
            c cVar = (c) this.mData;
            YAxis.AxisDependency axisDependency = YAxis.AxisDependency.LEFT;
            yAxis.calculate(cVar.getYMin(axisDependency), ((c) this.mData).getYMax(axisDependency));
        }
        if (this.mAxisRight.isEnabled()) {
            YAxis yAxis2 = this.mAxisRight;
            c cVar2 = (c) this.mData;
            YAxis.AxisDependency axisDependency2 = YAxis.AxisDependency.RIGHT;
            yAxis2.calculate(cVar2.getYMin(axisDependency2), ((c) this.mData).getYMax(axisDependency2));
        }
        calculateOffsets();
    }

    @Override // com.github.mikephil.charting.charts.Chart
    protected void calcMinMax() {
        this.mXAxis.calculate(((c) this.mData).getXMin(), ((c) this.mData).getXMax());
        YAxis yAxis = this.mAxisLeft;
        c cVar = (c) this.mData;
        YAxis.AxisDependency axisDependency = YAxis.AxisDependency.LEFT;
        yAxis.calculate(cVar.getYMin(axisDependency), ((c) this.mData).getYMax(axisDependency));
        YAxis yAxis2 = this.mAxisRight;
        c cVar2 = (c) this.mData;
        YAxis.AxisDependency axisDependency2 = YAxis.AxisDependency.RIGHT;
        yAxis2.calculate(cVar2.getYMin(axisDependency2), ((c) this.mData).getYMax(axisDependency2));
    }

    protected void calculateLegendOffsets(RectF rectF) {
        rectF.left = 0.0f;
        rectF.right = 0.0f;
        rectF.top = 0.0f;
        rectF.bottom = 0.0f;
        Legend legend = this.mLegend;
        if (legend == null || !legend.isEnabled() || this.mLegend.isDrawInsideEnabled()) {
            return;
        }
        int i8 = b.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendOrientation[this.mLegend.getOrientation().ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                return;
            }
            int i9 = b.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendVerticalAlignment[this.mLegend.getVerticalAlignment().ordinal()];
            if (i9 == 1) {
                rectF.top += Math.min(this.mLegend.mNeededHeight, this.mViewPortHandler.getChartHeight() * this.mLegend.getMaxSizePercent()) + this.mLegend.getYOffset();
                return;
            } else {
                if (i9 != 2) {
                    return;
                }
                rectF.bottom += Math.min(this.mLegend.mNeededHeight, this.mViewPortHandler.getChartHeight() * this.mLegend.getMaxSizePercent()) + this.mLegend.getYOffset();
                return;
            }
        }
        int i10 = b.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendHorizontalAlignment[this.mLegend.getHorizontalAlignment().ordinal()];
        if (i10 == 1) {
            rectF.left += Math.min(this.mLegend.mNeededWidth, this.mViewPortHandler.getChartWidth() * this.mLegend.getMaxSizePercent()) + this.mLegend.getXOffset();
            return;
        }
        if (i10 == 2) {
            rectF.right += Math.min(this.mLegend.mNeededWidth, this.mViewPortHandler.getChartWidth() * this.mLegend.getMaxSizePercent()) + this.mLegend.getXOffset();
            return;
        }
        if (i10 != 3) {
            return;
        }
        int i11 = b.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendVerticalAlignment[this.mLegend.getVerticalAlignment().ordinal()];
        if (i11 == 1) {
            rectF.top += Math.min(this.mLegend.mNeededHeight, this.mViewPortHandler.getChartHeight() * this.mLegend.getMaxSizePercent()) + this.mLegend.getYOffset();
        } else {
            if (i11 != 2) {
                return;
            }
            rectF.bottom += Math.min(this.mLegend.mNeededHeight, this.mViewPortHandler.getChartHeight() * this.mLegend.getMaxSizePercent()) + this.mLegend.getYOffset();
        }
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public void calculateOffsets() {
        if (!this.mCustomViewPortEnabled) {
            calculateLegendOffsets(this.mOffsetsBuffer);
            RectF rectF = this.mOffsetsBuffer;
            float f8 = rectF.left + 0.0f;
            float f9 = rectF.top + 0.0f;
            float f10 = rectF.right + 0.0f;
            float f11 = rectF.bottom + 0.0f;
            if (this.mAxisLeft.needsOffset()) {
                f8 += this.mAxisLeft.getRequiredWidthSpace(this.mAxisRendererLeft.getPaintAxisLabels());
            }
            if (this.mAxisRight.needsOffset()) {
                f10 += this.mAxisRight.getRequiredWidthSpace(this.mAxisRendererRight.getPaintAxisLabels());
            }
            if (this.mXAxis.isEnabled() && this.mXAxis.isDrawLabelsEnabled()) {
                float yOffset = r2.mLabelRotatedHeight + this.mXAxis.getYOffset();
                if (this.mXAxis.getPosition() == XAxis.XAxisPosition.BOTTOM) {
                    f11 += yOffset;
                } else {
                    if (this.mXAxis.getPosition() != XAxis.XAxisPosition.TOP) {
                        if (this.mXAxis.getPosition() == XAxis.XAxisPosition.BOTH_SIDED) {
                            f11 += yOffset;
                        }
                    }
                    f9 += yOffset;
                }
            }
            float extraTopOffset = f9 + getExtraTopOffset();
            float extraRightOffset = f10 + getExtraRightOffset();
            float extraBottomOffset = f11 + getExtraBottomOffset();
            float extraLeftOffset = f8 + getExtraLeftOffset();
            float convertDpToPixel = i.convertDpToPixel(this.mMinOffset);
            this.mViewPortHandler.restrainViewPort(Math.max(convertDpToPixel, extraLeftOffset), Math.max(convertDpToPixel, extraTopOffset), Math.max(convertDpToPixel, extraRightOffset), Math.max(convertDpToPixel, extraBottomOffset));
            if (this.mLogEnabled) {
                Log.i(Chart.LOG_TAG, "offsetLeft: " + extraLeftOffset + ", offsetTop: " + extraTopOffset + ", offsetRight: " + extraRightOffset + ", offsetBottom: " + extraBottomOffset);
                StringBuilder sb = new StringBuilder();
                sb.append("Content: ");
                sb.append(this.mViewPortHandler.getContentRect().toString());
                Log.i(Chart.LOG_TAG, sb.toString());
            }
        }
        prepareOffsetMatrix();
        prepareValuePxMatrix();
    }

    public void centerViewTo(float f8, float f9, YAxis.AxisDependency axisDependency) {
        float axisRange = getAxisRange(axisDependency) / this.mViewPortHandler.getScaleY();
        addViewportJob(com.github.mikephil.charting.jobs.d.getInstance(this.mViewPortHandler, f8 - ((getXAxis().mAxisRange / this.mViewPortHandler.getScaleX()) / 2.0f), f9 + (axisRange / 2.0f), getTransformer(axisDependency), this));
    }

    @TargetApi(11)
    public void centerViewToAnimated(float f8, float f9, YAxis.AxisDependency axisDependency, long j8) {
        com.github.mikephil.charting.utils.d valuesByTouchPoint = getValuesByTouchPoint(this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentTop(), axisDependency);
        float axisRange = getAxisRange(axisDependency) / this.mViewPortHandler.getScaleY();
        addViewportJob(com.github.mikephil.charting.jobs.a.getInstance(this.mViewPortHandler, f8 - ((getXAxis().mAxisRange / this.mViewPortHandler.getScaleX()) / 2.0f), f9 + (axisRange / 2.0f), getTransformer(axisDependency), this, (float) valuesByTouchPoint.f14112x, (float) valuesByTouchPoint.f14113y, j8));
        com.github.mikephil.charting.utils.d.recycleInstance(valuesByTouchPoint);
    }

    public void centerViewToY(float f8, YAxis.AxisDependency axisDependency) {
        addViewportJob(com.github.mikephil.charting.jobs.d.getInstance(this.mViewPortHandler, 0.0f, f8 + ((getAxisRange(axisDependency) / this.mViewPortHandler.getScaleY()) / 2.0f), getTransformer(axisDependency), this));
    }

    @Override // android.view.View
    public void computeScroll() {
        ChartTouchListener chartTouchListener = this.mChartTouchListener;
        if (chartTouchListener instanceof com.github.mikephil.charting.listener.a) {
            ((com.github.mikephil.charting.listener.a) chartTouchListener).computeScroll();
        }
    }

    protected void drawGridBackground(Canvas canvas) {
        if (this.mDrawGridBackground) {
            canvas.drawRect(this.mViewPortHandler.getContentRect(), this.mGridBackgroundPaint);
        }
        if (this.mDrawBorders) {
            canvas.drawRect(this.mViewPortHandler.getContentRect(), this.mBorderPaint);
        }
    }

    public void fitScreen() {
        Matrix matrix = this.mFitScreenMatrixBuffer;
        this.mViewPortHandler.fitScreen(matrix);
        this.mViewPortHandler.refresh(matrix, this, false);
        calculateOffsets();
        postInvalidate();
    }

    public YAxis getAxis(YAxis.AxisDependency axisDependency) {
        return axisDependency == YAxis.AxisDependency.LEFT ? this.mAxisLeft : this.mAxisRight;
    }

    public YAxis getAxisLeft() {
        return this.mAxisLeft;
    }

    protected float getAxisRange(YAxis.AxisDependency axisDependency) {
        return axisDependency == YAxis.AxisDependency.LEFT ? this.mAxisLeft.mAxisRange : this.mAxisRight.mAxisRange;
    }

    public YAxis getAxisRight() {
        return this.mAxisRight;
    }

    @Override // com.github.mikephil.charting.charts.Chart, u4.e, u4.b
    public /* bridge */ /* synthetic */ c getData() {
        return (c) super.getData();
    }

    public v4.b getDataSetByTouchPoint(float f8, float f9) {
        com.github.mikephil.charting.highlight.d highlightByTouchPoint = getHighlightByTouchPoint(f8, f9);
        if (highlightByTouchPoint != null) {
            return (v4.b) ((c) this.mData).getDataSetByIndex(highlightByTouchPoint.getDataSetIndex());
        }
        return null;
    }

    public d getDrawListener() {
        return null;
    }

    public Entry getEntryByTouchPoint(float f8, float f9) {
        com.github.mikephil.charting.highlight.d highlightByTouchPoint = getHighlightByTouchPoint(f8, f9);
        if (highlightByTouchPoint != null) {
            return ((c) this.mData).getEntryForHighlight(highlightByTouchPoint);
        }
        return null;
    }

    @Override // u4.b
    public float getHighestVisibleX() {
        getTransformer(YAxis.AxisDependency.LEFT).getValuesByTouchPoint(this.mViewPortHandler.contentRight(), this.mViewPortHandler.contentBottom(), this.posForGetHighestVisibleX);
        return (float) Math.min(this.mXAxis.mAxisMaximum, this.posForGetHighestVisibleX.f14112x);
    }

    @Override // u4.b
    public float getLowestVisibleX() {
        getTransformer(YAxis.AxisDependency.LEFT).getValuesByTouchPoint(this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentBottom(), this.posForGetLowestVisibleX);
        return (float) Math.max(this.mXAxis.mAxisMinimum, this.posForGetLowestVisibleX.f14112x);
    }

    @Override // com.github.mikephil.charting.charts.Chart, u4.e, u4.b
    public int getMaxVisibleCount() {
        return this.mMaxVisibleCount;
    }

    public float getMinOffset() {
        return this.mMinOffset;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public Paint getPaint(int i8) {
        Paint paint = super.getPaint(i8);
        if (paint != null) {
            return paint;
        }
        if (i8 != 4) {
            return null;
        }
        return this.mGridBackgroundPaint;
    }

    public com.github.mikephil.charting.utils.d getPixelForValues(float f8, float f9, YAxis.AxisDependency axisDependency) {
        return getTransformer(axisDependency).getPixelForValues(f8, f9);
    }

    public e getPosition(Entry entry, YAxis.AxisDependency axisDependency) {
        if (entry == null) {
            return null;
        }
        this.mGetPositionBuffer[0] = entry.getX();
        this.mGetPositionBuffer[1] = entry.getY();
        getTransformer(axisDependency).pointValuesToPixel(this.mGetPositionBuffer);
        float[] fArr = this.mGetPositionBuffer;
        return e.getInstance(fArr[0], fArr[1]);
    }

    public t getRendererLeftYAxis() {
        return this.mAxisRendererLeft;
    }

    public t getRendererRightYAxis() {
        return this.mAxisRendererRight;
    }

    public q getRendererXAxis() {
        return this.mXAxisRenderer;
    }

    @Override // android.view.View
    public float getScaleX() {
        j jVar = this.mViewPortHandler;
        if (jVar == null) {
            return 1.0f;
        }
        return jVar.getScaleX();
    }

    @Override // android.view.View
    public float getScaleY() {
        j jVar = this.mViewPortHandler;
        if (jVar == null) {
            return 1.0f;
        }
        return jVar.getScaleY();
    }

    @Override // u4.b
    public g getTransformer(YAxis.AxisDependency axisDependency) {
        return axisDependency == YAxis.AxisDependency.LEFT ? this.mLeftAxisTransformer : this.mRightAxisTransformer;
    }

    public com.github.mikephil.charting.utils.d getValuesByTouchPoint(float f8, float f9, YAxis.AxisDependency axisDependency) {
        com.github.mikephil.charting.utils.d dVar = com.github.mikephil.charting.utils.d.getInstance(i.DOUBLE_EPSILON, i.DOUBLE_EPSILON);
        getValuesByTouchPoint(f8, f9, axisDependency, dVar);
        return dVar;
    }

    public float getVisibleXRange() {
        return Math.abs(getHighestVisibleX() - getLowestVisibleX());
    }

    @Override // com.github.mikephil.charting.charts.Chart, u4.e, u4.b
    public float getYChartMax() {
        return Math.max(this.mAxisLeft.mAxisMaximum, this.mAxisRight.mAxisMaximum);
    }

    @Override // com.github.mikephil.charting.charts.Chart, u4.e, u4.b
    public float getYChartMin() {
        return Math.min(this.mAxisLeft.mAxisMinimum, this.mAxisRight.mAxisMinimum);
    }

    public boolean hasNoDragOffset() {
        return this.mViewPortHandler.hasNoDragOffset();
    }

    @Override // com.github.mikephil.charting.charts.Chart
    protected void init() {
        super.init();
        this.mAxisLeft = new YAxis(YAxis.AxisDependency.LEFT);
        this.mAxisRight = new YAxis(YAxis.AxisDependency.RIGHT);
        this.mLeftAxisTransformer = new g(this.mViewPortHandler);
        this.mRightAxisTransformer = new g(this.mViewPortHandler);
        this.mAxisRendererLeft = new t(this.mViewPortHandler, this.mAxisLeft, this.mLeftAxisTransformer);
        this.mAxisRendererRight = new t(this.mViewPortHandler, this.mAxisRight, this.mRightAxisTransformer);
        this.mXAxisRenderer = new q(this.mViewPortHandler, this.mXAxis, this.mLeftAxisTransformer);
        setHighlighter(new com.github.mikephil.charting.highlight.b(this));
        this.mChartTouchListener = new com.github.mikephil.charting.listener.a(this, this.mViewPortHandler.getMatrixTouch(), 3.0f);
        Paint paint = new Paint();
        this.mGridBackgroundPaint = paint;
        paint.setStyle(Paint.Style.FILL);
        this.mGridBackgroundPaint.setColor(Color.rgb(240, 240, 240));
        Paint paint2 = new Paint();
        this.mBorderPaint = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.mBorderPaint.setColor(-16777216);
        this.mBorderPaint.setStrokeWidth(i.convertDpToPixel(1.0f));
    }

    public boolean isAnyAxisInverted() {
        return this.mAxisLeft.isInverted() || this.mAxisRight.isInverted();
    }

    public boolean isAutoScaleMinMaxEnabled() {
        return this.mAutoScaleMinMaxEnabled;
    }

    public boolean isClipValuesToContentEnabled() {
        return this.mClipValuesToContent;
    }

    public boolean isDoubleTapToZoomEnabled() {
        return this.mDoubleTapToZoomEnabled;
    }

    public boolean isDragEnabled() {
        return this.mDragXEnabled || this.mDragYEnabled;
    }

    public boolean isDragXEnabled() {
        return this.mDragXEnabled;
    }

    public boolean isDragYEnabled() {
        return this.mDragYEnabled;
    }

    public boolean isDrawBordersEnabled() {
        return this.mDrawBorders;
    }

    public boolean isFullyZoomedOut() {
        return this.mViewPortHandler.isFullyZoomedOut();
    }

    public boolean isHighlightPerDragEnabled() {
        return this.mHighlightPerDragEnabled;
    }

    @Override // u4.b
    public boolean isInverted(YAxis.AxisDependency axisDependency) {
        return getAxis(axisDependency).isInverted();
    }

    public boolean isKeepPositionOnRotation() {
        return this.mKeepPositionOnRotation;
    }

    public boolean isPinchZoomEnabled() {
        return this.mPinchZoomEnabled;
    }

    public boolean isScaleXEnabled() {
        return this.mScaleXEnabled;
    }

    public boolean isScaleYEnabled() {
        return this.mScaleYEnabled;
    }

    public void moveViewTo(float f8, float f9, YAxis.AxisDependency axisDependency) {
        addViewportJob(com.github.mikephil.charting.jobs.d.getInstance(this.mViewPortHandler, f8, f9 + ((getAxisRange(axisDependency) / this.mViewPortHandler.getScaleY()) / 2.0f), getTransformer(axisDependency), this));
    }

    @TargetApi(11)
    public void moveViewToAnimated(float f8, float f9, YAxis.AxisDependency axisDependency, long j8) {
        com.github.mikephil.charting.utils.d valuesByTouchPoint = getValuesByTouchPoint(this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentTop(), axisDependency);
        addViewportJob(com.github.mikephil.charting.jobs.a.getInstance(this.mViewPortHandler, f8, f9 + ((getAxisRange(axisDependency) / this.mViewPortHandler.getScaleY()) / 2.0f), getTransformer(axisDependency), this, (float) valuesByTouchPoint.f14112x, (float) valuesByTouchPoint.f14113y, j8));
        com.github.mikephil.charting.utils.d.recycleInstance(valuesByTouchPoint);
    }

    public void moveViewToX(float f8) {
        addViewportJob(com.github.mikephil.charting.jobs.d.getInstance(this.mViewPortHandler, f8, 0.0f, getTransformer(YAxis.AxisDependency.LEFT), this));
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public void notifyDataSetChanged() {
        if (this.mData == 0) {
            if (this.mLogEnabled) {
                Log.i(Chart.LOG_TAG, "Preparing... DATA NOT SET.");
                return;
            }
            return;
        }
        if (this.mLogEnabled) {
            Log.i(Chart.LOG_TAG, "Preparing...");
        }
        com.github.mikephil.charting.renderer.g gVar = this.mRenderer;
        if (gVar != null) {
            gVar.initBuffers();
        }
        calcMinMax();
        t tVar = this.mAxisRendererLeft;
        YAxis yAxis = this.mAxisLeft;
        tVar.computeAxis(yAxis.mAxisMinimum, yAxis.mAxisMaximum, yAxis.isInverted());
        t tVar2 = this.mAxisRendererRight;
        YAxis yAxis2 = this.mAxisRight;
        tVar2.computeAxis(yAxis2.mAxisMinimum, yAxis2.mAxisMaximum, yAxis2.isInverted());
        q qVar = this.mXAxisRenderer;
        XAxis xAxis = this.mXAxis;
        qVar.computeAxis(xAxis.mAxisMinimum, xAxis.mAxisMaximum, false);
        if (this.mLegend != null) {
            this.mLegendRenderer.computeLegend(this.mData);
        }
        calculateOffsets();
    }

    @Override // com.github.mikephil.charting.charts.Chart, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.mData == 0) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        drawGridBackground(canvas);
        if (this.mAutoScaleMinMaxEnabled) {
            autoScale();
        }
        if (this.mAxisLeft.isEnabled()) {
            t tVar = this.mAxisRendererLeft;
            YAxis yAxis = this.mAxisLeft;
            tVar.computeAxis(yAxis.mAxisMinimum, yAxis.mAxisMaximum, yAxis.isInverted());
        }
        if (this.mAxisRight.isEnabled()) {
            t tVar2 = this.mAxisRendererRight;
            YAxis yAxis2 = this.mAxisRight;
            tVar2.computeAxis(yAxis2.mAxisMinimum, yAxis2.mAxisMaximum, yAxis2.isInverted());
        }
        if (this.mXAxis.isEnabled()) {
            q qVar = this.mXAxisRenderer;
            XAxis xAxis = this.mXAxis;
            qVar.computeAxis(xAxis.mAxisMinimum, xAxis.mAxisMaximum, false);
        }
        this.mXAxisRenderer.renderAxisLine(canvas);
        this.mAxisRendererLeft.renderAxisLine(canvas);
        this.mAxisRendererRight.renderAxisLine(canvas);
        if (this.mXAxis.isDrawGridLinesBehindDataEnabled()) {
            this.mXAxisRenderer.renderGridLines(canvas);
        }
        if (this.mAxisLeft.isDrawGridLinesBehindDataEnabled()) {
            this.mAxisRendererLeft.renderGridLines(canvas);
        }
        if (this.mAxisRight.isDrawGridLinesBehindDataEnabled()) {
            this.mAxisRendererRight.renderGridLines(canvas);
        }
        if (this.mXAxis.isEnabled() && this.mXAxis.isDrawLimitLinesBehindDataEnabled()) {
            this.mXAxisRenderer.renderLimitLines(canvas);
        }
        if (this.mAxisLeft.isEnabled() && this.mAxisLeft.isDrawLimitLinesBehindDataEnabled()) {
            this.mAxisRendererLeft.renderLimitLines(canvas);
        }
        if (this.mAxisRight.isEnabled() && this.mAxisRight.isDrawLimitLinesBehindDataEnabled()) {
            this.mAxisRendererRight.renderLimitLines(canvas);
        }
        int save = canvas.save();
        canvas.clipRect(this.mViewPortHandler.getContentRect());
        this.mRenderer.drawData(canvas);
        if (!this.mXAxis.isDrawGridLinesBehindDataEnabled()) {
            this.mXAxisRenderer.renderGridLines(canvas);
        }
        if (!this.mAxisLeft.isDrawGridLinesBehindDataEnabled()) {
            this.mAxisRendererLeft.renderGridLines(canvas);
        }
        if (!this.mAxisRight.isDrawGridLinesBehindDataEnabled()) {
            this.mAxisRendererRight.renderGridLines(canvas);
        }
        if (valuesToHighlight()) {
            this.mRenderer.drawHighlighted(canvas, this.mIndicesToHighlight);
        }
        canvas.restoreToCount(save);
        this.mRenderer.drawExtras(canvas);
        if (this.mXAxis.isEnabled() && !this.mXAxis.isDrawLimitLinesBehindDataEnabled()) {
            this.mXAxisRenderer.renderLimitLines(canvas);
        }
        if (this.mAxisLeft.isEnabled() && !this.mAxisLeft.isDrawLimitLinesBehindDataEnabled()) {
            this.mAxisRendererLeft.renderLimitLines(canvas);
        }
        if (this.mAxisRight.isEnabled() && !this.mAxisRight.isDrawLimitLinesBehindDataEnabled()) {
            this.mAxisRendererRight.renderLimitLines(canvas);
        }
        this.mXAxisRenderer.renderAxisLabels(canvas);
        this.mAxisRendererLeft.renderAxisLabels(canvas);
        this.mAxisRendererRight.renderAxisLabels(canvas);
        if (isClipValuesToContentEnabled()) {
            int save2 = canvas.save();
            canvas.clipRect(this.mViewPortHandler.getContentRect());
            this.mRenderer.drawValues(canvas);
            canvas.restoreToCount(save2);
        } else {
            this.mRenderer.drawValues(canvas);
        }
        this.mLegendRenderer.renderLegend(canvas);
        drawDescription(canvas);
        drawMarkers(canvas);
        if (this.mLogEnabled) {
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            long j8 = this.totalTime + currentTimeMillis2;
            this.totalTime = j8;
            long j9 = this.drawCycles + 1;
            this.drawCycles = j9;
            Log.i(Chart.LOG_TAG, "Drawtime: " + currentTimeMillis2 + " ms, average: " + (j8 / j9) + " ms, cycles: " + this.drawCycles);
        }
    }

    @Override // com.github.mikephil.charting.charts.Chart, android.view.View
    protected void onSizeChanged(int i8, int i9, int i10, int i11) {
        float[] fArr = this.mOnSizeChangedBuffer;
        fArr[1] = 0.0f;
        fArr[0] = 0.0f;
        if (this.mKeepPositionOnRotation) {
            fArr[0] = this.mViewPortHandler.contentLeft();
            this.mOnSizeChangedBuffer[1] = this.mViewPortHandler.contentTop();
            getTransformer(YAxis.AxisDependency.LEFT).pixelsToValue(this.mOnSizeChangedBuffer);
        }
        super.onSizeChanged(i8, i9, i10, i11);
        if (this.mKeepPositionOnRotation) {
            getTransformer(YAxis.AxisDependency.LEFT).pointValuesToPixel(this.mOnSizeChangedBuffer);
            this.mViewPortHandler.centerViewPort(this.mOnSizeChangedBuffer, this);
        } else {
            j jVar = this.mViewPortHandler;
            jVar.refresh(jVar.getMatrixTouch(), this, true);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        ChartTouchListener chartTouchListener = this.mChartTouchListener;
        if (chartTouchListener == null || this.mData == 0 || !this.mTouchEnabled) {
            return false;
        }
        return chartTouchListener.onTouch(this, motionEvent);
    }

    protected void prepareOffsetMatrix() {
        this.mRightAxisTransformer.prepareMatrixOffset(this.mAxisRight.isInverted());
        this.mLeftAxisTransformer.prepareMatrixOffset(this.mAxisLeft.isInverted());
    }

    protected void prepareValuePxMatrix() {
        if (this.mLogEnabled) {
            Log.i(Chart.LOG_TAG, "Preparing Value-Px Matrix, xmin: " + this.mXAxis.mAxisMinimum + ", xmax: " + this.mXAxis.mAxisMaximum + ", xdelta: " + this.mXAxis.mAxisRange);
        }
        g gVar = this.mRightAxisTransformer;
        XAxis xAxis = this.mXAxis;
        float f8 = xAxis.mAxisMinimum;
        float f9 = xAxis.mAxisRange;
        YAxis yAxis = this.mAxisRight;
        gVar.prepareMatrixValuePx(f8, f9, yAxis.mAxisRange, yAxis.mAxisMinimum);
        g gVar2 = this.mLeftAxisTransformer;
        XAxis xAxis2 = this.mXAxis;
        float f10 = xAxis2.mAxisMinimum;
        float f11 = xAxis2.mAxisRange;
        YAxis yAxis2 = this.mAxisLeft;
        gVar2.prepareMatrixValuePx(f10, f11, yAxis2.mAxisRange, yAxis2.mAxisMinimum);
    }

    public void resetTracking() {
        this.totalTime = 0L;
        this.drawCycles = 0L;
    }

    public void resetViewPortOffsets() {
        this.mCustomViewPortEnabled = false;
        calculateOffsets();
    }

    public void resetZoom() {
        this.mViewPortHandler.resetZoom(this.mZoomMatrixBuffer);
        this.mViewPortHandler.refresh(this.mZoomMatrixBuffer, this, false);
        calculateOffsets();
        postInvalidate();
    }

    public void setAutoScaleMinMaxEnabled(boolean z7) {
        this.mAutoScaleMinMaxEnabled = z7;
    }

    public void setBorderColor(int i8) {
        this.mBorderPaint.setColor(i8);
    }

    public void setBorderWidth(float f8) {
        this.mBorderPaint.setStrokeWidth(i.convertDpToPixel(f8));
    }

    public void setClipValuesToContent(boolean z7) {
        this.mClipValuesToContent = z7;
    }

    public void setDoubleTapToZoomEnabled(boolean z7) {
        this.mDoubleTapToZoomEnabled = z7;
    }

    public void setDragEnabled(boolean z7) {
        this.mDragXEnabled = z7;
        this.mDragYEnabled = z7;
    }

    public void setDragOffsetX(float f8) {
        this.mViewPortHandler.setDragOffsetX(f8);
    }

    public void setDragOffsetY(float f8) {
        this.mViewPortHandler.setDragOffsetY(f8);
    }

    public void setDragXEnabled(boolean z7) {
        this.mDragXEnabled = z7;
    }

    public void setDragYEnabled(boolean z7) {
        this.mDragYEnabled = z7;
    }

    public void setDrawBorders(boolean z7) {
        this.mDrawBorders = z7;
    }

    public void setDrawGridBackground(boolean z7) {
        this.mDrawGridBackground = z7;
    }

    public void setGridBackgroundColor(int i8) {
        this.mGridBackgroundPaint.setColor(i8);
    }

    public void setHighlightPerDragEnabled(boolean z7) {
        this.mHighlightPerDragEnabled = z7;
    }

    public void setKeepPositionOnRotation(boolean z7) {
        this.mKeepPositionOnRotation = z7;
    }

    public void setMaxVisibleValueCount(int i8) {
        this.mMaxVisibleCount = i8;
    }

    public void setMinOffset(float f8) {
        this.mMinOffset = f8;
    }

    public void setOnDrawListener(d dVar) {
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public void setPaint(Paint paint, int i8) {
        super.setPaint(paint, i8);
        if (i8 != 4) {
            return;
        }
        this.mGridBackgroundPaint = paint;
    }

    public void setPinchZoom(boolean z7) {
        this.mPinchZoomEnabled = z7;
    }

    public void setRendererLeftYAxis(t tVar) {
        this.mAxisRendererLeft = tVar;
    }

    public void setRendererRightYAxis(t tVar) {
        this.mAxisRendererRight = tVar;
    }

    public void setScaleEnabled(boolean z7) {
        this.mScaleXEnabled = z7;
        this.mScaleYEnabled = z7;
    }

    public void setScaleMinima(float f8, float f9) {
        this.mViewPortHandler.setMinimumScaleX(f8);
        this.mViewPortHandler.setMinimumScaleY(f9);
    }

    public void setScaleXEnabled(boolean z7) {
        this.mScaleXEnabled = z7;
    }

    public void setScaleYEnabled(boolean z7) {
        this.mScaleYEnabled = z7;
    }

    public void setViewPortOffsets(float f8, float f9, float f10, float f11) {
        this.mCustomViewPortEnabled = true;
        post(new a(f8, f9, f10, f11));
    }

    public void setVisibleXRange(float f8, float f9) {
        float f10 = this.mXAxis.mAxisRange;
        this.mViewPortHandler.setMinMaxScaleX(f10 / f8, f10 / f9);
    }

    public void setVisibleXRangeMaximum(float f8) {
        this.mViewPortHandler.setMinimumScaleX(this.mXAxis.mAxisRange / f8);
    }

    public void setVisibleXRangeMinimum(float f8) {
        this.mViewPortHandler.setMaximumScaleX(this.mXAxis.mAxisRange / f8);
    }

    public void setVisibleYRange(float f8, float f9, YAxis.AxisDependency axisDependency) {
        this.mViewPortHandler.setMinMaxScaleY(getAxisRange(axisDependency) / f8, getAxisRange(axisDependency) / f9);
    }

    public void setVisibleYRangeMaximum(float f8, YAxis.AxisDependency axisDependency) {
        this.mViewPortHandler.setMinimumScaleY(getAxisRange(axisDependency) / f8);
    }

    public void setVisibleYRangeMinimum(float f8, YAxis.AxisDependency axisDependency) {
        this.mViewPortHandler.setMaximumScaleY(getAxisRange(axisDependency) / f8);
    }

    public void setXAxisRenderer(q qVar) {
        this.mXAxisRenderer = qVar;
    }

    public void zoom(float f8, float f9, float f10, float f11) {
        this.mViewPortHandler.zoom(f8, f9, f10, -f11, this.mZoomMatrixBuffer);
        this.mViewPortHandler.refresh(this.mZoomMatrixBuffer, this, false);
        calculateOffsets();
        postInvalidate();
    }

    @TargetApi(11)
    public void zoomAndCenterAnimated(float f8, float f9, float f10, float f11, YAxis.AxisDependency axisDependency, long j8) {
        com.github.mikephil.charting.utils.d valuesByTouchPoint = getValuesByTouchPoint(this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentTop(), axisDependency);
        addViewportJob(com.github.mikephil.charting.jobs.c.getInstance(this.mViewPortHandler, this, getTransformer(axisDependency), getAxis(axisDependency), this.mXAxis.mAxisRange, f8, f9, this.mViewPortHandler.getScaleX(), this.mViewPortHandler.getScaleY(), f10, f11, (float) valuesByTouchPoint.f14112x, (float) valuesByTouchPoint.f14113y, j8));
        com.github.mikephil.charting.utils.d.recycleInstance(valuesByTouchPoint);
    }

    public void zoomIn() {
        e contentCenter = this.mViewPortHandler.getContentCenter();
        this.mViewPortHandler.zoomIn(contentCenter.f14114x, -contentCenter.f14115y, this.mZoomMatrixBuffer);
        this.mViewPortHandler.refresh(this.mZoomMatrixBuffer, this, false);
        e.recycleInstance(contentCenter);
        calculateOffsets();
        postInvalidate();
    }

    public void zoomOut() {
        e contentCenter = this.mViewPortHandler.getContentCenter();
        this.mViewPortHandler.zoomOut(contentCenter.f14114x, -contentCenter.f14115y, this.mZoomMatrixBuffer);
        this.mViewPortHandler.refresh(this.mZoomMatrixBuffer, this, false);
        e.recycleInstance(contentCenter);
        calculateOffsets();
        postInvalidate();
    }

    public void zoomToCenter(float f8, float f9) {
        e centerOffsets = getCenterOffsets();
        Matrix matrix = this.mZoomMatrixBuffer;
        this.mViewPortHandler.zoom(f8, f9, centerOffsets.f14114x, -centerOffsets.f14115y, matrix);
        this.mViewPortHandler.refresh(matrix, this, false);
    }

    public void getValuesByTouchPoint(float f8, float f9, YAxis.AxisDependency axisDependency, com.github.mikephil.charting.utils.d dVar) {
        getTransformer(axisDependency).getValuesByTouchPoint(f8, f9, dVar);
    }

    public void zoom(float f8, float f9, float f10, float f11, YAxis.AxisDependency axisDependency) {
        addViewportJob(f.getInstance(this.mViewPortHandler, f8, f9, f10, f11, getTransformer(axisDependency), axisDependency, this));
    }

    public BarLineChartBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mMaxVisibleCount = 100;
        this.mAutoScaleMinMaxEnabled = false;
        this.mPinchZoomEnabled = false;
        this.mDoubleTapToZoomEnabled = true;
        this.mHighlightPerDragEnabled = true;
        this.mDragXEnabled = true;
        this.mDragYEnabled = true;
        this.mScaleXEnabled = true;
        this.mScaleYEnabled = true;
        this.mDrawGridBackground = false;
        this.mDrawBorders = false;
        this.mClipValuesToContent = false;
        this.mMinOffset = 15.0f;
        this.mKeepPositionOnRotation = false;
        this.totalTime = 0L;
        this.drawCycles = 0L;
        this.mOffsetsBuffer = new RectF();
        this.mZoomMatrixBuffer = new Matrix();
        this.mFitScreenMatrixBuffer = new Matrix();
        this.mCustomViewPortEnabled = false;
        this.mGetPositionBuffer = new float[2];
        this.posForGetLowestVisibleX = com.github.mikephil.charting.utils.d.getInstance(i.DOUBLE_EPSILON, i.DOUBLE_EPSILON);
        this.posForGetHighestVisibleX = com.github.mikephil.charting.utils.d.getInstance(i.DOUBLE_EPSILON, i.DOUBLE_EPSILON);
        this.mOnSizeChangedBuffer = new float[2];
    }

    public BarLineChartBase(Context context) {
        super(context);
        this.mMaxVisibleCount = 100;
        this.mAutoScaleMinMaxEnabled = false;
        this.mPinchZoomEnabled = false;
        this.mDoubleTapToZoomEnabled = true;
        this.mHighlightPerDragEnabled = true;
        this.mDragXEnabled = true;
        this.mDragYEnabled = true;
        this.mScaleXEnabled = true;
        this.mScaleYEnabled = true;
        this.mDrawGridBackground = false;
        this.mDrawBorders = false;
        this.mClipValuesToContent = false;
        this.mMinOffset = 15.0f;
        this.mKeepPositionOnRotation = false;
        this.totalTime = 0L;
        this.drawCycles = 0L;
        this.mOffsetsBuffer = new RectF();
        this.mZoomMatrixBuffer = new Matrix();
        this.mFitScreenMatrixBuffer = new Matrix();
        this.mCustomViewPortEnabled = false;
        this.mGetPositionBuffer = new float[2];
        this.posForGetLowestVisibleX = com.github.mikephil.charting.utils.d.getInstance(i.DOUBLE_EPSILON, i.DOUBLE_EPSILON);
        this.posForGetHighestVisibleX = com.github.mikephil.charting.utils.d.getInstance(i.DOUBLE_EPSILON, i.DOUBLE_EPSILON);
        this.mOnSizeChangedBuffer = new float[2];
    }
}
