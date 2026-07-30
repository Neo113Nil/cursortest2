package com.github.mikephil.charting.highlight;

import com.github.mikephil.charting.data.DataSet;
import com.github.mikephil.charting.data.Entry;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class e extends a {
    public e(u4.a aVar) {
        super(aVar);
    }

    @Override // com.github.mikephil.charting.highlight.b
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
            com.github.mikephil.charting.utils.d pixelForValues = ((u4.a) this.mChart).getTransformer(eVar.getAxisDependency()).getPixelForValues(entry.getY(), entry.getX());
            arrayList.add(new d(entry.getX(), entry.getY(), (float) pixelForValues.f14112x, (float) pixelForValues.f14113y, i8, eVar.getAxisDependency()));
        }
        return arrayList;
    }

    @Override // com.github.mikephil.charting.highlight.a, com.github.mikephil.charting.highlight.b
    protected float getDistance(float f8, float f9, float f10, float f11) {
        return Math.abs(f9 - f11);
    }

    @Override // com.github.mikephil.charting.highlight.a, com.github.mikephil.charting.highlight.b, com.github.mikephil.charting.highlight.f
    public d getHighlight(float f8, float f9) {
        com.github.mikephil.charting.data.a barData = ((u4.a) this.mChart).getBarData();
        com.github.mikephil.charting.utils.d valsForTouch = getValsForTouch(f9, f8);
        d highlightForX = getHighlightForX((float) valsForTouch.f14113y, f9, f8);
        if (highlightForX == null) {
            return null;
        }
        v4.a aVar = (v4.a) barData.getDataSetByIndex(highlightForX.getDataSetIndex());
        if (aVar.isStacked()) {
            return getStackedHighlight(highlightForX, aVar, (float) valsForTouch.f14113y, (float) valsForTouch.f14112x);
        }
        com.github.mikephil.charting.utils.d.recycleInstance(valsForTouch);
        return highlightForX;
    }
}
