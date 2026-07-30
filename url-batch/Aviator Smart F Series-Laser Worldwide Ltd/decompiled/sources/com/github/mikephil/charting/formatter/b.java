package com.github.mikephil.charting.formatter;

import com.github.mikephil.charting.data.k;

/* loaded from: classes3.dex */
public class b implements e {
    @Override // com.github.mikephil.charting.formatter.e
    public float getFillLinePosition(v4.f fVar, u4.g gVar) {
        float yChartMax = gVar.getYChartMax();
        float yChartMin = gVar.getYChartMin();
        k lineData = gVar.getLineData();
        if (fVar.getYMax() > 0.0f && fVar.getYMin() < 0.0f) {
            return 0.0f;
        }
        if (lineData.getYMax() > 0.0f) {
            yChartMax = 0.0f;
        }
        if (lineData.getYMin() < 0.0f) {
            yChartMin = 0.0f;
        }
        return fVar.getYMin() >= 0.0f ? yChartMin : yChartMax;
    }
}
