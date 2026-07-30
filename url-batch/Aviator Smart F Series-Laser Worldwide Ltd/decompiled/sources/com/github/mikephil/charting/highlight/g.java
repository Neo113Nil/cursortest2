package com.github.mikephil.charting.highlight;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.n;

/* loaded from: classes3.dex */
public class g extends h {
    public g(PieChart pieChart) {
        super(pieChart);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.highlight.h
    protected d getClosestHighlight(int i8, float f8, float f9) {
        v4.i dataSet = ((n) ((PieChart) this.mChart).getData()).getDataSet();
        return new d(i8, dataSet.getEntryForIndex(i8).getY(), f8, f9, 0, dataSet.getAxisDependency());
    }
}
