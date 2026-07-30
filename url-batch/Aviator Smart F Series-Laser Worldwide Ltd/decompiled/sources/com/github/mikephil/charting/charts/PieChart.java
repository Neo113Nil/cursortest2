package com.github.mikephil.charting.charts;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.data.n;
import com.github.mikephil.charting.highlight.d;
import com.github.mikephil.charting.highlight.g;
import com.github.mikephil.charting.renderer.m;
import com.github.mikephil.charting.utils.e;
import java.util.List;
import v4.i;

/* loaded from: classes3.dex */
public class PieChart extends PieRadarChartBase<n> {
    private float[] mAbsoluteAngles;
    private CharSequence mCenterText;
    private e mCenterTextOffset;
    private float mCenterTextRadiusPercent;
    private RectF mCircleBox;
    private float[] mDrawAngles;
    private boolean mDrawCenterText;
    private boolean mDrawEntryLabels;
    private boolean mDrawHole;
    private boolean mDrawRoundedSlices;
    private boolean mDrawSlicesUnderHole;
    private float mHoleRadiusPercent;
    protected float mMaxAngle;
    private float mMinAngleForSlices;
    protected float mTransparentCircleRadiusPercent;
    private boolean mUsePercentValues;

    public PieChart(Context context) {
        super(context);
        this.mCircleBox = new RectF();
        this.mDrawEntryLabels = true;
        this.mDrawAngles = new float[1];
        this.mAbsoluteAngles = new float[1];
        this.mDrawHole = true;
        this.mDrawSlicesUnderHole = false;
        this.mUsePercentValues = false;
        this.mDrawRoundedSlices = false;
        this.mCenterText = "";
        this.mCenterTextOffset = e.getInstance(0.0f, 0.0f);
        this.mHoleRadiusPercent = 50.0f;
        this.mTransparentCircleRadiusPercent = 55.0f;
        this.mDrawCenterText = true;
        this.mCenterTextRadiusPercent = 100.0f;
        this.mMaxAngle = 360.0f;
        this.mMinAngleForSlices = 0.0f;
    }

    private float calcAngle(float f8, float f9) {
        return (f8 / f9) * this.mMaxAngle;
    }

    private void calcAngles() {
        int entryCount = ((n) this.mData).getEntryCount();
        if (this.mDrawAngles.length != entryCount) {
            this.mDrawAngles = new float[entryCount];
        } else {
            for (int i8 = 0; i8 < entryCount; i8++) {
                this.mDrawAngles[i8] = 0.0f;
            }
        }
        if (this.mAbsoluteAngles.length != entryCount) {
            this.mAbsoluteAngles = new float[entryCount];
        } else {
            for (int i9 = 0; i9 < entryCount; i9++) {
                this.mAbsoluteAngles[i9] = 0.0f;
            }
        }
        float yValueSum = ((n) this.mData).getYValueSum();
        List<v4.e> dataSets = ((n) this.mData).getDataSets();
        float f8 = this.mMinAngleForSlices;
        boolean z7 = f8 != 0.0f && ((float) entryCount) * f8 <= this.mMaxAngle;
        float[] fArr = new float[entryCount];
        float f9 = 0.0f;
        float f10 = 0.0f;
        int i10 = 0;
        for (int i11 = 0; i11 < ((n) this.mData).getDataSetCount(); i11++) {
            i iVar = (i) dataSets.get(i11);
            for (int i12 = 0; i12 < iVar.getEntryCount(); i12++) {
                float calcAngle = calcAngle(Math.abs(((PieEntry) iVar.getEntryForIndex(i12)).getY()), yValueSum);
                if (z7) {
                    float f11 = this.mMinAngleForSlices;
                    float f12 = calcAngle - f11;
                    if (f12 <= 0.0f) {
                        fArr[i10] = f11;
                        f9 += -f12;
                    } else {
                        fArr[i10] = calcAngle;
                        f10 += f12;
                    }
                }
                this.mDrawAngles[i10] = calcAngle;
                if (i10 == 0) {
                    this.mAbsoluteAngles[i10] = calcAngle;
                } else {
                    float[] fArr2 = this.mAbsoluteAngles;
                    fArr2[i10] = fArr2[i10 - 1] + calcAngle;
                }
                i10++;
            }
        }
        if (z7) {
            for (int i13 = 0; i13 < entryCount; i13++) {
                float f13 = fArr[i13];
                float f14 = f13 - (((f13 - this.mMinAngleForSlices) / f10) * f9);
                fArr[i13] = f14;
                if (i13 == 0) {
                    this.mAbsoluteAngles[0] = fArr[0];
                } else {
                    float[] fArr3 = this.mAbsoluteAngles;
                    fArr3[i13] = fArr3[i13 - 1] + f14;
                }
            }
            this.mDrawAngles = fArr;
        }
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, com.github.mikephil.charting.charts.Chart
    protected void calcMinMax() {
        calcAngles();
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, com.github.mikephil.charting.charts.Chart
    public void calculateOffsets() {
        super.calculateOffsets();
        if (this.mData == 0) {
            return;
        }
        float diameter = getDiameter() / 2.0f;
        e centerOffsets = getCenterOffsets();
        float selectionShift = ((n) this.mData).getDataSet().getSelectionShift();
        RectF rectF = this.mCircleBox;
        float f8 = centerOffsets.f14114x;
        float f9 = centerOffsets.f14115y;
        rectF.set((f8 - diameter) + selectionShift, (f9 - diameter) + selectionShift, (f8 + diameter) - selectionShift, (f9 + diameter) - selectionShift);
        e.recycleInstance(centerOffsets);
    }

    public float[] getAbsoluteAngles() {
        return this.mAbsoluteAngles;
    }

    public e getCenterCircleBox() {
        return e.getInstance(this.mCircleBox.centerX(), this.mCircleBox.centerY());
    }

    public CharSequence getCenterText() {
        return this.mCenterText;
    }

    public e getCenterTextOffset() {
        e eVar = this.mCenterTextOffset;
        return e.getInstance(eVar.f14114x, eVar.f14115y);
    }

    public float getCenterTextRadiusPercent() {
        return this.mCenterTextRadiusPercent;
    }

    public RectF getCircleBox() {
        return this.mCircleBox;
    }

    public int getDataSetIndexForIndex(int i8) {
        List<v4.e> dataSets = ((n) this.mData).getDataSets();
        for (int i9 = 0; i9 < dataSets.size(); i9++) {
            if (((i) dataSets.get(i9)).getEntryForXValue(i8, Float.NaN) != null) {
                return i9;
            }
        }
        return -1;
    }

    public float[] getDrawAngles() {
        return this.mDrawAngles;
    }

    public float getHoleRadius() {
        return this.mHoleRadiusPercent;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    public int getIndexForAngle(float f8) {
        float normalizedAngle = com.github.mikephil.charting.utils.i.getNormalizedAngle(f8 - getRotationAngle());
        int i8 = 0;
        while (true) {
            float[] fArr = this.mAbsoluteAngles;
            if (i8 >= fArr.length) {
                return -1;
            }
            if (fArr[i8] > normalizedAngle) {
                return i8;
            }
            i8++;
        }
    }

    @Override // com.github.mikephil.charting.charts.Chart
    protected float[] getMarkerPosition(d dVar) {
        e centerCircleBox = getCenterCircleBox();
        float radius = getRadius();
        float f8 = (radius / 10.0f) * 3.6f;
        if (isDrawHoleEnabled()) {
            f8 = (radius - ((radius / 100.0f) * getHoleRadius())) / 2.0f;
        }
        float f9 = radius - f8;
        float rotationAngle = getRotationAngle();
        float f10 = this.mDrawAngles[(int) dVar.getX()] / 2.0f;
        double d8 = f9;
        float cos = (float) ((Math.cos(Math.toRadians(((this.mAbsoluteAngles[r11] + rotationAngle) - f10) * this.mAnimator.getPhaseY())) * d8) + centerCircleBox.f14114x);
        float sin = (float) ((d8 * Math.sin(Math.toRadians(((rotationAngle + this.mAbsoluteAngles[r11]) - f10) * this.mAnimator.getPhaseY()))) + centerCircleBox.f14115y);
        e.recycleInstance(centerCircleBox);
        return new float[]{cos, sin};
    }

    public float getMaxAngle() {
        return this.mMaxAngle;
    }

    public float getMinAngleForSlices() {
        return this.mMinAngleForSlices;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    public float getRadius() {
        RectF rectF = this.mCircleBox;
        if (rectF == null) {
            return 0.0f;
        }
        return Math.min(rectF.width() / 2.0f, this.mCircleBox.height() / 2.0f);
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    protected float getRequiredBaseOffset() {
        return 0.0f;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    protected float getRequiredLegendOffset() {
        return this.mLegendRenderer.getLabelPaint().getTextSize() * 2.0f;
    }

    public float getTransparentCircleRadius() {
        return this.mTransparentCircleRadiusPercent;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    @Deprecated
    public XAxis getXAxis() {
        throw new RuntimeException("PieChart has no XAxis");
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, com.github.mikephil.charting.charts.Chart
    protected void init() {
        super.init();
        this.mRenderer = new m(this, this.mAnimator, this.mViewPortHandler);
        this.mXAxis = null;
        this.mHighlighter = new g(this);
    }

    public boolean isDrawCenterTextEnabled() {
        return this.mDrawCenterText;
    }

    public boolean isDrawEntryLabelsEnabled() {
        return this.mDrawEntryLabels;
    }

    public boolean isDrawHoleEnabled() {
        return this.mDrawHole;
    }

    public boolean isDrawRoundedSlicesEnabled() {
        return this.mDrawRoundedSlices;
    }

    public boolean isDrawSlicesUnderHoleEnabled() {
        return this.mDrawSlicesUnderHole;
    }

    public boolean isUsePercentValuesEnabled() {
        return this.mUsePercentValues;
    }

    public boolean needsHighlight(int i8) {
        if (!valuesToHighlight()) {
            return false;
        }
        int i9 = 0;
        while (true) {
            d[] dVarArr = this.mIndicesToHighlight;
            if (i9 >= dVarArr.length) {
                return false;
            }
            if (((int) dVarArr[i9].getX()) == i8) {
                return true;
            }
            i9++;
        }
    }

    @Override // com.github.mikephil.charting.charts.Chart, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        com.github.mikephil.charting.renderer.g gVar = this.mRenderer;
        if (gVar != null && (gVar instanceof m)) {
            ((m) gVar).releaseBitmap();
        }
        super.onDetachedFromWindow();
    }

    @Override // com.github.mikephil.charting.charts.Chart, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.mData == 0) {
            return;
        }
        this.mRenderer.drawData(canvas);
        if (valuesToHighlight()) {
            this.mRenderer.drawHighlighted(canvas, this.mIndicesToHighlight);
        }
        this.mRenderer.drawExtras(canvas);
        this.mRenderer.drawValues(canvas);
        this.mLegendRenderer.renderLegend(canvas);
        drawDescription(canvas);
        drawMarkers(canvas);
    }

    public void setCenterText(CharSequence charSequence) {
        if (charSequence == null) {
            this.mCenterText = "";
        } else {
            this.mCenterText = charSequence;
        }
    }

    public void setCenterTextColor(int i8) {
        ((m) this.mRenderer).getPaintCenterText().setColor(i8);
    }

    public void setCenterTextOffset(float f8, float f9) {
        this.mCenterTextOffset.f14114x = com.github.mikephil.charting.utils.i.convertDpToPixel(f8);
        this.mCenterTextOffset.f14115y = com.github.mikephil.charting.utils.i.convertDpToPixel(f9);
    }

    public void setCenterTextRadiusPercent(float f8) {
        this.mCenterTextRadiusPercent = f8;
    }

    public void setCenterTextSize(float f8) {
        ((m) this.mRenderer).getPaintCenterText().setTextSize(com.github.mikephil.charting.utils.i.convertDpToPixel(f8));
    }

    public void setCenterTextSizePixels(float f8) {
        ((m) this.mRenderer).getPaintCenterText().setTextSize(f8);
    }

    public void setCenterTextTypeface(Typeface typeface) {
        ((m) this.mRenderer).getPaintCenterText().setTypeface(typeface);
    }

    public void setDrawCenterText(boolean z7) {
        this.mDrawCenterText = z7;
    }

    public void setDrawEntryLabels(boolean z7) {
        this.mDrawEntryLabels = z7;
    }

    public void setDrawHoleEnabled(boolean z7) {
        this.mDrawHole = z7;
    }

    public void setDrawRoundedSlices(boolean z7) {
        this.mDrawRoundedSlices = z7;
    }

    @Deprecated
    public void setDrawSliceText(boolean z7) {
        this.mDrawEntryLabels = z7;
    }

    public void setDrawSlicesUnderHole(boolean z7) {
        this.mDrawSlicesUnderHole = z7;
    }

    public void setEntryLabelColor(int i8) {
        ((m) this.mRenderer).getPaintEntryLabels().setColor(i8);
    }

    public void setEntryLabelTextSize(float f8) {
        ((m) this.mRenderer).getPaintEntryLabels().setTextSize(com.github.mikephil.charting.utils.i.convertDpToPixel(f8));
    }

    public void setEntryLabelTypeface(Typeface typeface) {
        ((m) this.mRenderer).getPaintEntryLabels().setTypeface(typeface);
    }

    public void setHoleColor(int i8) {
        ((m) this.mRenderer).getPaintHole().setColor(i8);
    }

    public void setHoleRadius(float f8) {
        this.mHoleRadiusPercent = f8;
    }

    public void setMaxAngle(float f8) {
        if (f8 > 360.0f) {
            f8 = 360.0f;
        }
        if (f8 < 90.0f) {
            f8 = 90.0f;
        }
        this.mMaxAngle = f8;
    }

    public void setMinAngleForSlices(float f8) {
        float f9 = this.mMaxAngle;
        if (f8 > f9 / 2.0f) {
            f8 = f9 / 2.0f;
        } else if (f8 < 0.0f) {
            f8 = 0.0f;
        }
        this.mMinAngleForSlices = f8;
    }

    public void setTransparentCircleAlpha(int i8) {
        ((m) this.mRenderer).getPaintTransparentCircle().setAlpha(i8);
    }

    public void setTransparentCircleColor(int i8) {
        Paint paintTransparentCircle = ((m) this.mRenderer).getPaintTransparentCircle();
        int alpha = paintTransparentCircle.getAlpha();
        paintTransparentCircle.setColor(i8);
        paintTransparentCircle.setAlpha(alpha);
    }

    public void setTransparentCircleRadius(float f8) {
        this.mTransparentCircleRadiusPercent = f8;
    }

    public void setUsePercentValues(boolean z7) {
        this.mUsePercentValues = z7;
    }

    private float calcAngle(float f8) {
        return calcAngle(f8, ((n) this.mData).getYValueSum());
    }

    public PieChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mCircleBox = new RectF();
        this.mDrawEntryLabels = true;
        this.mDrawAngles = new float[1];
        this.mAbsoluteAngles = new float[1];
        this.mDrawHole = true;
        this.mDrawSlicesUnderHole = false;
        this.mUsePercentValues = false;
        this.mDrawRoundedSlices = false;
        this.mCenterText = "";
        this.mCenterTextOffset = e.getInstance(0.0f, 0.0f);
        this.mHoleRadiusPercent = 50.0f;
        this.mTransparentCircleRadiusPercent = 55.0f;
        this.mDrawCenterText = true;
        this.mCenterTextRadiusPercent = 100.0f;
        this.mMaxAngle = 360.0f;
        this.mMinAngleForSlices = 0.0f;
    }

    public PieChart(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.mCircleBox = new RectF();
        this.mDrawEntryLabels = true;
        this.mDrawAngles = new float[1];
        this.mAbsoluteAngles = new float[1];
        this.mDrawHole = true;
        this.mDrawSlicesUnderHole = false;
        this.mUsePercentValues = false;
        this.mDrawRoundedSlices = false;
        this.mCenterText = "";
        this.mCenterTextOffset = e.getInstance(0.0f, 0.0f);
        this.mHoleRadiusPercent = 50.0f;
        this.mTransparentCircleRadiusPercent = 55.0f;
        this.mDrawCenterText = true;
        this.mCenterTextRadiusPercent = 100.0f;
        this.mMaxAngle = 360.0f;
        this.mMinAngleForSlices = 0.0f;
    }
}
