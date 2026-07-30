package com.github.mikephil.charting.highlight;

import com.github.mikephil.charting.charts.RadarChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.o;
import java.util.List;

/* loaded from: classes3.dex */
public class i extends h {
    public i(RadarChart radarChart) {
        super(radarChart);
    }

    @Override // com.github.mikephil.charting.highlight.h
    protected d getClosestHighlight(int i8, float f8, float f9) {
        List<d> highlightsAtIndex = getHighlightsAtIndex(i8);
        float distanceToCenter = ((RadarChart) this.mChart).distanceToCenter(f8, f9) / ((RadarChart) this.mChart).getFactor();
        d dVar = null;
        float f10 = Float.MAX_VALUE;
        for (int i9 = 0; i9 < highlightsAtIndex.size(); i9++) {
            d dVar2 = highlightsAtIndex.get(i9);
            float abs = Math.abs(dVar2.getY() - distanceToCenter);
            if (abs < f10) {
                dVar = dVar2;
                f10 = abs;
            }
        }
        return dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected List<d> getHighlightsAtIndex(int i8) {
        int i9 = i8;
        this.mHighlightBuffer.clear();
        float phaseX = ((RadarChart) this.mChart).getAnimator().getPhaseX();
        float phaseY = ((RadarChart) this.mChart).getAnimator().getPhaseY();
        float sliceAngle = ((RadarChart) this.mChart).getSliceAngle();
        float factor = ((RadarChart) this.mChart).getFactor();
        com.github.mikephil.charting.utils.e eVar = com.github.mikephil.charting.utils.e.getInstance(0.0f, 0.0f);
        int i10 = 0;
        while (i10 < ((o) ((RadarChart) this.mChart).getData()).getDataSetCount()) {
            v4.e dataSetByIndex = ((o) ((RadarChart) this.mChart).getData()).getDataSetByIndex(i10);
            Entry entryForIndex = dataSetByIndex.getEntryForIndex(i9);
            float f8 = i9;
            com.github.mikephil.charting.utils.i.getPosition(((RadarChart) this.mChart).getCenterOffsets(), (entryForIndex.getY() - ((RadarChart) this.mChart).getYChartMin()) * factor * phaseY, (sliceAngle * f8 * phaseX) + ((RadarChart) this.mChart).getRotationAngle(), eVar);
            this.mHighlightBuffer.add(new d(f8, entryForIndex.getY(), eVar.f14114x, eVar.f14115y, i10, dataSetByIndex.getAxisDependency()));
            i10++;
            i9 = i8;
        }
        return this.mHighlightBuffer;
    }
}
