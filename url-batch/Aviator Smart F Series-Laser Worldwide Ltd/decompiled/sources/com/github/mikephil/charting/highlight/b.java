package com.github.mikephil.charting.highlight;

import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.DataSet;
import com.github.mikephil.charting.data.Entry;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class b implements f {
    protected u4.b mChart;
    protected List<d> mHighlightBuffer = new ArrayList();

    public b(u4.b bVar) {
        this.mChart = bVar;
    }

    protected List<d> buildHighlights(v4.e eVar, int i8, float f8, DataSet.Rounding rounding) {
        Entry entryForXValue;
        ArrayList arrayList = new ArrayList();
        List<Entry> entriesForXValue = eVar.getEntriesForXValue(f8);
        if (entriesForXValue.size() == 0 && (entryForXValue = eVar.getEntryForXValue(f8, Float.NaN, rounding)) != null) {
            entriesForXValue = eVar.getEntriesForXValue(entryForXValue.getX());
        }
        if (entriesForXValue.size() == 0) {
            return arrayList;
        }
        for (Entry entry : entriesForXValue) {
            com.github.mikephil.charting.utils.d pixelForValues = this.mChart.getTransformer(eVar.getAxisDependency()).getPixelForValues(entry.getX(), entry.getY());
            arrayList.add(new d(entry.getX(), entry.getY(), (float) pixelForValues.f14112x, (float) pixelForValues.f14113y, i8, eVar.getAxisDependency()));
        }
        return arrayList;
    }

    public d getClosestHighlightByPixel(List<d> list, float f8, float f9, YAxis.AxisDependency axisDependency, float f10) {
        d dVar = null;
        for (int i8 = 0; i8 < list.size(); i8++) {
            d dVar2 = list.get(i8);
            if (axisDependency == null || dVar2.getAxis() == axisDependency) {
                float distance = getDistance(f8, f9, dVar2.getXPx(), dVar2.getYPx());
                if (distance < f10) {
                    dVar = dVar2;
                    f10 = distance;
                }
            }
        }
        return dVar;
    }

    protected com.github.mikephil.charting.data.c getData() {
        return this.mChart.getData();
    }

    protected float getDistance(float f8, float f9, float f10, float f11) {
        return (float) Math.hypot(f8 - f10, f9 - f11);
    }

    @Override // com.github.mikephil.charting.highlight.f
    public d getHighlight(float f8, float f9) {
        com.github.mikephil.charting.utils.d valsForTouch = getValsForTouch(f8, f9);
        float f10 = (float) valsForTouch.f14112x;
        com.github.mikephil.charting.utils.d.recycleInstance(valsForTouch);
        return getHighlightForX(f10, f8, f9);
    }

    protected d getHighlightForX(float f8, float f9, float f10) {
        List<d> highlightsAtXValue = getHighlightsAtXValue(f8, f9, f10);
        if (highlightsAtXValue.isEmpty()) {
            return null;
        }
        YAxis.AxisDependency axisDependency = YAxis.AxisDependency.LEFT;
        float minimumDistance = getMinimumDistance(highlightsAtXValue, f10, axisDependency);
        YAxis.AxisDependency axisDependency2 = YAxis.AxisDependency.RIGHT;
        return getClosestHighlightByPixel(highlightsAtXValue, f9, f10, minimumDistance < getMinimumDistance(highlightsAtXValue, f10, axisDependency2) ? axisDependency : axisDependency2, this.mChart.getMaxHighlightDistance());
    }

    protected float getHighlightPos(d dVar) {
        return dVar.getYPx();
    }

    protected List<d> getHighlightsAtXValue(float f8, float f9, float f10) {
        this.mHighlightBuffer.clear();
        com.github.mikephil.charting.data.c data = getData();
        if (data == null) {
            return this.mHighlightBuffer;
        }
        int dataSetCount = data.getDataSetCount();
        for (int i8 = 0; i8 < dataSetCount; i8++) {
            v4.e dataSetByIndex = data.getDataSetByIndex(i8);
            if (dataSetByIndex.isHighlightEnabled()) {
                this.mHighlightBuffer.addAll(buildHighlights(dataSetByIndex, i8, f8, DataSet.Rounding.CLOSEST));
            }
        }
        return this.mHighlightBuffer;
    }

    protected float getMinimumDistance(List<d> list, float f8, YAxis.AxisDependency axisDependency) {
        float f9 = Float.MAX_VALUE;
        for (int i8 = 0; i8 < list.size(); i8++) {
            d dVar = list.get(i8);
            if (dVar.getAxis() == axisDependency) {
                float abs = Math.abs(getHighlightPos(dVar) - f8);
                if (abs < f9) {
                    f9 = abs;
                }
            }
        }
        return f9;
    }

    protected com.github.mikephil.charting.utils.d getValsForTouch(float f8, float f9) {
        return this.mChart.getTransformer(YAxis.AxisDependency.LEFT).getValuesByTouchPoint(f8, f9);
    }
}
