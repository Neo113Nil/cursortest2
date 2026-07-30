package com.moyoung.dafit.module.common.widgets.chart;

import android.content.Context;
import android.util.AttributeSet;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.data.n;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public class CrpPieChart extends PieChart {
    private static final float DECELERATION_FRICTION_COEF = 0.0f;
    private static final float HOLE_RADIUS = 75.0f;
    private static final int SLICE_SPACE = 2;

    public CrpPieChart(Context context) {
        super(context);
    }

    public void setData(float[] fArr, int[] iArr) {
        ArrayList arrayList = new ArrayList();
        for (float f8 : fArr) {
            arrayList.add(new PieEntry(f8));
        }
        PieDataSet pieDataSet = new PieDataSet(arrayList, "");
        pieDataSet.setDrawIcons(false);
        pieDataSet.setDrawValues(false);
        pieDataSet.setSliceSpace(2.0f);
        pieDataSet.setColors(iArr);
        setData(new n(pieDataSet));
        invalidate();
    }

    public void setup() {
        setUsePercentValues(true);
        getDescription().setEnabled(false);
        getLegend().setEnabled(false);
        setTouchEnabled(false);
        setDragDecelerationEnabled(false);
        setDrawHoleEnabled(true);
        setHoleColor(-1);
        setHoleRadius(HOLE_RADIUS);
        setHighlightPerTapEnabled(false);
        setDrawEntryLabels(false);
    }

    public CrpPieChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CrpPieChart(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
    }
}
