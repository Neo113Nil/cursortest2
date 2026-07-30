package com.github.mikephil.charting.highlight;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.charts.PieRadarChartBase;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class h implements f {
    protected PieRadarChartBase mChart;
    protected List<d> mHighlightBuffer = new ArrayList();

    public h(PieRadarChartBase pieRadarChartBase) {
        this.mChart = pieRadarChartBase;
    }

    protected abstract d getClosestHighlight(int i8, float f8, float f9);

    /* JADX WARN: Type inference failed for: r1v5, types: [com.github.mikephil.charting.data.i] */
    @Override // com.github.mikephil.charting.highlight.f
    public d getHighlight(float f8, float f9) {
        if (this.mChart.distanceToCenter(f8, f9) > this.mChart.getRadius()) {
            return null;
        }
        float angleForPoint = this.mChart.getAngleForPoint(f8, f9);
        PieRadarChartBase pieRadarChartBase = this.mChart;
        if (pieRadarChartBase instanceof PieChart) {
            angleForPoint /= pieRadarChartBase.getAnimator().getPhaseY();
        }
        int indexForAngle = this.mChart.getIndexForAngle(angleForPoint);
        if (indexForAngle < 0 || indexForAngle >= this.mChart.getData().getMaxEntryCountSet().getEntryCount()) {
            return null;
        }
        return getClosestHighlight(indexForAngle, f8, f9);
    }
}
