package com.moyoung.dafit.module.common.widgets.chart;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.formatter.g;
import com.github.mikephil.charting.highlight.d;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class CrpBarChart extends BarChart {
    public static final float DEFALUT_BAR_WIDTH = 0.4f;
    public static final int DEFAULT_ANIMATE_Y_TIME = 1000;
    public static final float DEFAULT_BAR_WIDTH = 0.4f;
    private static final int DEFAULT_HIGH_LIGHT_ALPHA = 255;
    public static final float HIGH_DENSITY_BAR_WIDTH = 0.6f;
    public static final int MAX_VISIBLE_VALUE_COUNT = 400;
    public static final int WEEK_VISIBLE_VALUE_COUNT = 7;
    private int highLightAlpha;

    class a implements com.github.mikephil.charting.listener.c {
        final /* synthetic */ int val$index;

        a(int i8) {
            this.val$index = i8;
        }

        @Override // com.github.mikephil.charting.listener.c
        public void onNothingSelected() {
            CrpBarChart.this.setHighLightValue(this.val$index);
        }

        @Override // com.github.mikephil.charting.listener.c
        public void onValueSelected(Entry entry, d dVar) {
            float x7 = dVar.getX();
            int i8 = this.val$index;
            if (x7 != i8) {
                CrpBarChart.this.setHighLightValue(i8);
            }
        }
    }

    public CrpBarChart(Context context) {
        super(context);
        this.highLightAlpha = 255;
    }

    @NonNull
    private ArrayList<BarEntry> getBarEntries(List<Float>[] listArr) {
        BarEntry barEntry;
        ArrayList<BarEntry> arrayList = new ArrayList<>();
        int i8 = 0;
        while (i8 < listArr[0].size()) {
            if (listArr.length <= 1) {
                List<Float> list = listArr[0];
                barEntry = new BarEntry(i8, (list == null || list.size() <= i8) ? 0.0f : list.get(i8).floatValue());
            } else {
                float[] fArr = new float[listArr.length];
                for (int i9 = 0; i9 < listArr.length; i9++) {
                    fArr[i9] = listArr[i9].get(i8).floatValue();
                }
                barEntry = new BarEntry(i8, fArr);
            }
            arrayList.add(barEntry);
            i8++;
        }
        return arrayList;
    }

    private void setDefaultChart() {
        setDrawBarShadow(false);
        setDrawValueAboveBar(false);
        getDescription().setEnabled(false);
        setPinchZoom(false);
        setScaleEnabled(false);
        setDrawGridBackground(false);
        setTouchEnabled(false);
        getLegend().setEnabled(false);
    }

    private void setXAxis(int i8) {
        XAxis xAxis = getXAxis();
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setDrawGridLines(false);
        xAxis.setLabelCount(i8);
        xAxis.setGranularity(1.0f);
    }

    private void setYAxis() {
        YAxis axisLeft = getAxisLeft();
        axisLeft.setEnabled(false);
        axisLeft.setAxisMinimum(0.0f);
        YAxis axisRight = getAxisRight();
        axisRight.setEnabled(false);
        axisRight.setAxisMinimum(0.0f);
    }

    public void addLimitLine(int i8, float... fArr) {
        getAxisLeft().removeAllLimitLines();
        for (float f8 : fArr) {
            LimitLine limitLine = new LimitLine(f8);
            limitLine.setLineColor(i8);
            limitLine.setLineWidth(1.0f);
            limitLine.enableDashedLine(20.0f, 12.0f, 2.0f);
            getAxisLeft().addLimitLine(limitLine);
        }
    }

    public int getHighLightAlpha() {
        return this.highLightAlpha;
    }

    public void hideXAxisValue() {
        getXAxis().setDrawLabels(false);
    }

    @Override // com.github.mikephil.charting.charts.BarChart, com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    protected void init() {
        super.init();
        this.mRenderer = new com.moyoung.dafit.module.common.widgets.chart.renderer.a(this, this.mAnimator, this.mViewPortHandler);
    }

    public void setAnimate() {
        animateY(1000);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setData(boolean z7, int[] iArr, int i8, float f8, List<Float>... listArr) {
        if (listArr == null || listArr[0] == null) {
            return;
        }
        ArrayList<BarEntry> barEntries = getBarEntries(listArr);
        if (getData() == 0 || ((com.github.mikephil.charting.data.a) getData()).getDataSetCount() <= 0) {
            com.github.mikephil.charting.data.b bVar = new com.github.mikephil.charting.data.b(barEntries, "");
            bVar.setDrawIcons(false);
            bVar.setColors(iArr);
            bVar.setHighLightColor(i8);
            bVar.setHighLightAlpha(getHighLightAlpha());
            bVar.setDrawValues(z7);
            ArrayList arrayList = new ArrayList();
            arrayList.add(bVar);
            com.github.mikephil.charting.data.a aVar = new com.github.mikephil.charting.data.a(arrayList);
            aVar.setDrawValues(false);
            aVar.setBarWidth(f8);
            setData(aVar);
        } else {
            com.github.mikephil.charting.data.b bVar2 = (com.github.mikephil.charting.data.b) ((com.github.mikephil.charting.data.a) getData()).getDataSetByIndex(0);
            bVar2.setColors(iArr);
            bVar2.setValues(barEntries);
            ((com.github.mikephil.charting.data.a) getData()).notifyDataChanged();
            notifyDataSetChanged();
        }
        invalidate();
    }

    public void setHighLightAlpha(int i8) {
        this.highLightAlpha = i8;
    }

    public void setHighLightValue(int i8) {
        highlightValue(i8, 0);
    }

    public void setLeftAxis() {
        YAxis axisLeft = getAxisLeft();
        axisLeft.setDrawAxisLine(false);
        axisLeft.setDrawGridLines(false);
        axisLeft.setDrawLabels(true);
        axisLeft.setLabelCount(5, true);
        axisLeft.setDrawZeroLine(false);
        axisLeft.setAxisLineColor(-1);
        axisLeft.setEnabled(true);
    }

    public void setMarkerView(MarkerView markerView) {
        setTouchEnabled(true);
        markerView.setChartView(this);
        setMarker(markerView);
    }

    public void setMaxValue(float f8) {
        getAxisLeft().setAxisMaximum(f8);
        getAxisRight().setAxisMaximum(f8);
    }

    public void setMinValue(float f8) {
        getAxisLeft().setAxisMinimum(f8);
        getAxisRight().setAxisMinimum(f8);
    }

    public void setXAxisLineColor(@ColorRes int i8) {
        getXAxis().setAxisLineColor(ContextCompat.getColor(getContext(), i8));
    }

    public void setXAxisLineWidth(int i8) {
        getXAxis().setAxisLineWidth(i8);
    }

    public void setXAxisTextColor(@ColorRes int i8) {
        getXAxis().setTextColor(ContextCompat.getColor(getContext(), i8));
    }

    public void setXAxisValueFormatter(g gVar) {
        XAxis xAxis = getXAxis();
        if (gVar == null) {
            xAxis.setDrawLabels(false);
        } else {
            xAxis.setValueFormatter(gVar);
        }
    }

    public void setup(int i8) {
        setDefaultChart();
        setXAxis(i8);
        setYAxis();
    }

    public void showMarkerViewOfBar(int i8) {
        setHighLightValue(i8);
        setOnChartValueSelectedListener(new a(i8));
    }

    public CrpBarChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.highLightAlpha = 255;
    }

    public void setXAxisLineWidth(float f8) {
        getXAxis().setAxisLineWidth(f8);
    }

    public CrpBarChart(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.highLightAlpha = 255;
    }
}
