package com.github.mikephil.charting.highlight;

import com.github.mikephil.charting.data.BarEntry;

/* loaded from: classes3.dex */
public class a extends b {
    public a(u4.a aVar) {
        super(aVar);
    }

    protected int getClosestStackIndex(j[] jVarArr, float f8) {
        if (jVarArr == null || jVarArr.length == 0) {
            return 0;
        }
        int i8 = 0;
        for (j jVar : jVarArr) {
            if (jVar.contains(f8)) {
                return i8;
            }
            i8++;
        }
        int max = Math.max(jVarArr.length - 1, 0);
        if (f8 > jVarArr[max].to) {
            return max;
        }
        return 0;
    }

    @Override // com.github.mikephil.charting.highlight.b
    protected com.github.mikephil.charting.data.c getData() {
        return ((u4.a) this.mChart).getBarData();
    }

    @Override // com.github.mikephil.charting.highlight.b
    protected float getDistance(float f8, float f9, float f10, float f11) {
        return Math.abs(f8 - f10);
    }

    @Override // com.github.mikephil.charting.highlight.b, com.github.mikephil.charting.highlight.f
    public d getHighlight(float f8, float f9) {
        d highlight = super.getHighlight(f8, f9);
        if (highlight == null) {
            return null;
        }
        com.github.mikephil.charting.utils.d valsForTouch = getValsForTouch(f8, f9);
        v4.a aVar = (v4.a) ((u4.a) this.mChart).getBarData().getDataSetByIndex(highlight.getDataSetIndex());
        if (aVar.isStacked()) {
            return getStackedHighlight(highlight, aVar, (float) valsForTouch.f14112x, (float) valsForTouch.f14113y);
        }
        com.github.mikephil.charting.utils.d.recycleInstance(valsForTouch);
        return highlight;
    }

    public d getStackedHighlight(d dVar, v4.a aVar, float f8, float f9) {
        BarEntry barEntry = (BarEntry) aVar.getEntryForXValue(f8, f9);
        if (barEntry == null) {
            return null;
        }
        if (barEntry.getYVals() == null) {
            return dVar;
        }
        j[] ranges = barEntry.getRanges();
        if (ranges.length <= 0) {
            return null;
        }
        int closestStackIndex = getClosestStackIndex(ranges, f9);
        com.github.mikephil.charting.utils.d pixelForValues = ((u4.a) this.mChart).getTransformer(aVar.getAxisDependency()).getPixelForValues(dVar.getX(), ranges[closestStackIndex].to);
        d dVar2 = new d(barEntry.getX(), barEntry.getY(), (float) pixelForValues.f14112x, (float) pixelForValues.f14113y, dVar.getDataSetIndex(), closestStackIndex, dVar.getAxis());
        com.github.mikephil.charting.utils.d.recycleInstance(pixelForValues);
        return dVar2;
    }
}
