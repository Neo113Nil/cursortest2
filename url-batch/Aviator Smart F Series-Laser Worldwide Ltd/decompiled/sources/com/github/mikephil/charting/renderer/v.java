package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Path;
import com.github.mikephil.charting.charts.RadarChart;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.YAxis;
import java.util.List;

/* loaded from: classes3.dex */
public class v extends t {
    private RadarChart mChart;
    private Path mRenderLimitLinesPathBuffer;

    public v(com.github.mikephil.charting.utils.j jVar, YAxis yAxis, RadarChart radarChart) {
        super(jVar, yAxis, null);
        this.mRenderLimitLinesPathBuffer = new Path();
        this.mChart = radarChart;
    }

    @Override // com.github.mikephil.charting.renderer.a
    protected void computeAxisValues(float f8, float f9) {
        int i8;
        float f10 = f8;
        int labelCount = this.mAxis.getLabelCount();
        double abs = Math.abs(f9 - f10);
        if (labelCount == 0 || abs <= com.github.mikephil.charting.utils.i.DOUBLE_EPSILON || Double.isInfinite(abs)) {
            com.github.mikephil.charting.components.a aVar = this.mAxis;
            aVar.mEntries = new float[0];
            aVar.mCenteredEntries = new float[0];
            aVar.mEntryCount = 0;
            return;
        }
        double roundToNextSignificant = com.github.mikephil.charting.utils.i.roundToNextSignificant(abs / labelCount);
        if (this.mAxis.isGranularityEnabled() && roundToNextSignificant < this.mAxis.getGranularity()) {
            roundToNextSignificant = this.mAxis.getGranularity();
        }
        double roundToNextSignificant2 = com.github.mikephil.charting.utils.i.roundToNextSignificant(Math.pow(10.0d, (int) Math.log10(roundToNextSignificant)));
        if (((int) (roundToNextSignificant / roundToNextSignificant2)) > 5) {
            roundToNextSignificant = Math.floor(roundToNextSignificant2 * 10.0d);
        }
        boolean isCenterAxisLabelsEnabled = this.mAxis.isCenterAxisLabelsEnabled();
        if (this.mAxis.isForceLabelsEnabled()) {
            float f11 = ((float) abs) / (labelCount - 1);
            com.github.mikephil.charting.components.a aVar2 = this.mAxis;
            aVar2.mEntryCount = labelCount;
            if (aVar2.mEntries.length < labelCount) {
                aVar2.mEntries = new float[labelCount];
            }
            for (int i9 = 0; i9 < labelCount; i9++) {
                this.mAxis.mEntries[i9] = f10;
                f10 += f11;
            }
        } else {
            double ceil = roundToNextSignificant == com.github.mikephil.charting.utils.i.DOUBLE_EPSILON ? com.github.mikephil.charting.utils.i.DOUBLE_EPSILON : Math.ceil(f10 / roundToNextSignificant) * roundToNextSignificant;
            if (isCenterAxisLabelsEnabled) {
                ceil -= roundToNextSignificant;
            }
            double nextUp = roundToNextSignificant == com.github.mikephil.charting.utils.i.DOUBLE_EPSILON ? com.github.mikephil.charting.utils.i.DOUBLE_EPSILON : com.github.mikephil.charting.utils.i.nextUp(Math.floor(f9 / roundToNextSignificant) * roundToNextSignificant);
            if (roundToNextSignificant != com.github.mikephil.charting.utils.i.DOUBLE_EPSILON) {
                i8 = isCenterAxisLabelsEnabled ? 1 : 0;
                for (double d8 = ceil; d8 <= nextUp; d8 += roundToNextSignificant) {
                    i8++;
                }
            } else {
                i8 = isCenterAxisLabelsEnabled ? 1 : 0;
            }
            int i10 = i8 + 1;
            com.github.mikephil.charting.components.a aVar3 = this.mAxis;
            aVar3.mEntryCount = i10;
            if (aVar3.mEntries.length < i10) {
                aVar3.mEntries = new float[i10];
            }
            for (int i11 = 0; i11 < i10; i11++) {
                if (ceil == com.github.mikephil.charting.utils.i.DOUBLE_EPSILON) {
                    ceil = 0.0d;
                }
                this.mAxis.mEntries[i11] = (float) ceil;
                ceil += roundToNextSignificant;
            }
            labelCount = i10;
        }
        if (roundToNextSignificant < 1.0d) {
            this.mAxis.mDecimals = (int) Math.ceil(-Math.log10(roundToNextSignificant));
        } else {
            this.mAxis.mDecimals = 0;
        }
        if (isCenterAxisLabelsEnabled) {
            com.github.mikephil.charting.components.a aVar4 = this.mAxis;
            if (aVar4.mCenteredEntries.length < labelCount) {
                aVar4.mCenteredEntries = new float[labelCount];
            }
            float[] fArr = aVar4.mEntries;
            float f12 = (fArr[1] - fArr[0]) / 2.0f;
            for (int i12 = 0; i12 < labelCount; i12++) {
                com.github.mikephil.charting.components.a aVar5 = this.mAxis;
                aVar5.mCenteredEntries[i12] = aVar5.mEntries[i12] + f12;
            }
        }
        com.github.mikephil.charting.components.a aVar6 = this.mAxis;
        float[] fArr2 = aVar6.mEntries;
        float f13 = fArr2[0];
        aVar6.mAxisMinimum = f13;
        float f14 = fArr2[labelCount - 1];
        aVar6.mAxisMaximum = f14;
        aVar6.mAxisRange = Math.abs(f14 - f13);
    }

    @Override // com.github.mikephil.charting.renderer.t, com.github.mikephil.charting.renderer.a
    public void renderAxisLabels(Canvas canvas) {
        if (this.mYAxis.isEnabled() && this.mYAxis.isDrawLabelsEnabled()) {
            this.mAxisLabelPaint.setTypeface(this.mYAxis.getTypeface());
            this.mAxisLabelPaint.setTextSize(this.mYAxis.getTextSize());
            this.mAxisLabelPaint.setColor(this.mYAxis.getTextColor());
            com.github.mikephil.charting.utils.e centerOffsets = this.mChart.getCenterOffsets();
            com.github.mikephil.charting.utils.e eVar = com.github.mikephil.charting.utils.e.getInstance(0.0f, 0.0f);
            float factor = this.mChart.getFactor();
            int i8 = this.mYAxis.isDrawTopYLabelEntryEnabled() ? this.mYAxis.mEntryCount : this.mYAxis.mEntryCount - 1;
            for (int i9 = !this.mYAxis.isDrawBottomYLabelEntryEnabled() ? 1 : 0; i9 < i8; i9++) {
                YAxis yAxis = this.mYAxis;
                com.github.mikephil.charting.utils.i.getPosition(centerOffsets, (yAxis.mEntries[i9] - yAxis.mAxisMinimum) * factor, this.mChart.getRotationAngle(), eVar);
                canvas.drawText(this.mYAxis.getFormattedLabel(i9), eVar.f14114x + 10.0f, eVar.f14115y, this.mAxisLabelPaint);
            }
            com.github.mikephil.charting.utils.e.recycleInstance(centerOffsets);
            com.github.mikephil.charting.utils.e.recycleInstance(eVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.t, com.github.mikephil.charting.renderer.a
    public void renderLimitLines(Canvas canvas) {
        List<LimitLine> limitLines = this.mYAxis.getLimitLines();
        if (limitLines == null) {
            return;
        }
        this.mChart.getSliceAngle();
        this.mChart.getFactor();
        com.github.mikephil.charting.utils.e centerOffsets = this.mChart.getCenterOffsets();
        com.github.mikephil.charting.utils.e eVar = com.github.mikephil.charting.utils.e.getInstance(0.0f, 0.0f);
        for (int i8 = 0; i8 < limitLines.size(); i8++) {
            LimitLine limitLine = limitLines.get(i8);
            if (limitLine.isEnabled()) {
                this.mLimitLinePaint.setColor(limitLine.getLineColor());
                this.mLimitLinePaint.setPathEffect(limitLine.getDashPathEffect());
                this.mLimitLinePaint.setStrokeWidth(limitLine.getLineWidth());
                limitLine.getLimit();
                this.mChart.getYChartMin();
                this.mRenderLimitLinesPathBuffer.reset();
                cn.hutool.core.convert.impl.s.a(((com.github.mikephil.charting.data.o) this.mChart.getData()).getMaxEntryCountSet());
                throw null;
            }
        }
        com.github.mikephil.charting.utils.e.recycleInstance(centerOffsets);
        com.github.mikephil.charting.utils.e.recycleInstance(eVar);
    }
}
