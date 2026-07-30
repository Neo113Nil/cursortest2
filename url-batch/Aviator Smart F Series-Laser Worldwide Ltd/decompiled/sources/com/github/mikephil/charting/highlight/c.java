package com.github.mikephil.charting.highlight;

import com.github.mikephil.charting.data.DataSet;
import java.util.List;

/* loaded from: classes3.dex */
public class c extends b {
    protected a barHighlighter;

    public c(u4.f fVar, u4.a aVar) {
        super(fVar);
        this.barHighlighter = aVar.getBarData() == null ? null : new a(aVar);
    }

    @Override // com.github.mikephil.charting.highlight.b
    protected List<d> getHighlightsAtXValue(float f8, float f9, float f10) {
        this.mHighlightBuffer.clear();
        List<com.github.mikephil.charting.data.c> allData = ((u4.f) this.mChart).getCombinedData().getAllData();
        for (int i8 = 0; i8 < allData.size(); i8++) {
            com.github.mikephil.charting.data.c cVar = allData.get(i8);
            a aVar = this.barHighlighter;
            if (aVar == null || !(cVar instanceof com.github.mikephil.charting.data.a)) {
                int dataSetCount = cVar.getDataSetCount();
                for (int i9 = 0; i9 < dataSetCount; i9++) {
                    v4.e dataSetByIndex = allData.get(i8).getDataSetByIndex(i9);
                    if (dataSetByIndex.isHighlightEnabled()) {
                        for (d dVar : buildHighlights(dataSetByIndex, i9, f8, DataSet.Rounding.CLOSEST)) {
                            dVar.setDataIndex(i8);
                            this.mHighlightBuffer.add(dVar);
                        }
                    }
                }
            } else {
                d highlight = aVar.getHighlight(f9, f10);
                if (highlight != null) {
                    highlight.setDataIndex(i8);
                    this.mHighlightBuffer.add(highlight);
                }
            }
        }
        return this.mHighlightBuffer;
    }
}
