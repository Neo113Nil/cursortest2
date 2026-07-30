package com.moyoung.dafit.module.common.widgets.chart;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.data.k;
import com.github.mikephil.charting.formatter.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import u4.g;
import v4.f;

/* loaded from: classes4.dex */
public class CrpLineChart extends LineChart {
    private static int MAX_X_LABEL_COUNT = 8;
    private int maxValue;

    class a implements e {
        a() {
        }

        @Override // com.github.mikephil.charting.formatter.e
        public float getFillLinePosition(f fVar, g gVar) {
            return CrpLineChart.this.getAxisLeft().getAxisMinimum();
        }
    }

    class b implements e {
        b() {
        }

        @Override // com.github.mikephil.charting.formatter.e
        public float getFillLinePosition(f fVar, g gVar) {
            return CrpLineChart.this.getAxisLeft().getAxisMinimum();
        }
    }

    public CrpLineChart(Context context) {
        super(context);
        this.maxValue = 210;
    }

    @NonNull
    private ArrayList<Entry> getLineEntries(List<Float> list) {
        ArrayList<Entry> arrayList = new ArrayList<>();
        for (int i8 = 0; i8 < list.size(); i8++) {
            float floatValue = list.get(i8).floatValue();
            int i9 = this.maxValue;
            if (i9 < floatValue) {
                floatValue = i9;
            }
            arrayList.add(new BarEntry(i8, floatValue));
        }
        return arrayList;
    }

    private ArrayList<Entry> getValueEntries(List<Float> list) {
        ArrayList<Entry> arrayList = new ArrayList<>();
        for (int i8 = 0; i8 < list.size(); i8++) {
            arrayList.add(new BarEntry(i8, list.get(i8).floatValue()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ float lambda$setData$0(f fVar, g gVar) {
        return getAxisLeft().getAxisMinimum();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ float lambda$setData$1(f fVar, g gVar) {
        return getAxisLeft().getAxisMinimum();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ float lambda$setWeightData$2(f fVar, g gVar) {
        return getAxisLeft().getAxisMinimum();
    }

    private void setDefaultChart() {
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
        int i9 = MAX_X_LABEL_COUNT;
        boolean z7 = i9 < i8;
        if (z7) {
            i8 = i9;
        }
        xAxis.setLabelCount(i8, z7);
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
            limitLine.enableDashedLine(4.0f, 2.0f, 2.0f);
            getAxisLeft().addLimitLine(limitLine);
        }
    }

    public void hideXAxisLabels() {
        getXAxis().setDrawLabels(false);
    }

    public void init(int i8) {
        setDefaultChart();
        setXAxis(i8);
        setYAxis();
    }

    public void setAnimate() {
        animateY(1000);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setData(List<Float> list, Drawable drawable, @ColorInt int i8, float f8) {
        ArrayList<Entry> lineEntries = getLineEntries(list);
        if (getData() == 0 || ((k) getData()).getDataSetCount() <= 0) {
            LineDataSet lineDataSet = new LineDataSet(lineEntries, "");
            lineDataSet.setMode(LineDataSet.Mode.HORIZONTAL_BEZIER);
            lineDataSet.setCubicIntensity(0.2f);
            lineDataSet.setDrawFilled(true);
            lineDataSet.setDrawCircles(list.size() <= 1);
            lineDataSet.setCircleColor(i8);
            lineDataSet.setDrawCircleHole(true);
            lineDataSet.setCircleRadius(f8 / 2.0f);
            lineDataSet.setLineWidth(f8);
            lineDataSet.setColor(i8);
            if (drawable != null) {
                lineDataSet.setFillDrawable(drawable);
                lineDataSet.setFillAlpha(255);
            }
            lineDataSet.setDrawHorizontalHighlightIndicator(false);
            lineDataSet.setFillFormatter(new a());
            k kVar = new k(lineDataSet);
            kVar.setDrawValues(false);
            setData(kVar);
        } else {
            ((LineDataSet) ((k) getData()).getDataSetByIndex(0)).setValues(lineEntries);
            ((k) getData()).notifyDataChanged();
            notifyDataSetChanged();
        }
        invalidate();
    }

    public void setLeftAxis() {
        setLeftAxis(5);
    }

    public void setMaxValue(float f8) {
        this.maxValue = (int) f8;
        getAxisLeft().setAxisMaximum(f8);
        getAxisRight().setAxisMaximum(f8);
    }

    public void setMaxXLabelCount(int i8) {
        MAX_X_LABEL_COUNT = i8;
    }

    public void setMinValue(float f8) {
        getAxisLeft().setAxisMinimum(f8);
        getAxisRight().setAxisMinimum(f8);
    }

    public void setRightAxis() {
        setRightAxis(5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setWeightData(List<Float> list, @ColorInt int i8, float f8, Drawable drawable, @ColorInt int i9) {
        ArrayList<Entry> valueEntries = getValueEntries(list);
        if (getData() == 0 || ((k) getData()).getDataSetCount() <= 0) {
            LineDataSet lineDataSet = new LineDataSet(valueEntries, "");
            lineDataSet.setMode(LineDataSet.Mode.HORIZONTAL_BEZIER);
            lineDataSet.setCubicIntensity(0.2f);
            lineDataSet.setDrawFilled(true);
            lineDataSet.setDrawCircleHole(true);
            lineDataSet.setCircleHoleRadius(f8);
            lineDataSet.setCircleHoleColor(i9);
            lineDataSet.setDrawCircles(true);
            lineDataSet.setCircleRadius(2.0f * f8);
            lineDataSet.setCircleColor(i8);
            lineDataSet.setLineWidth(f8);
            lineDataSet.setColor(i8);
            if (drawable != null) {
                lineDataSet.setFillDrawable(drawable);
                lineDataSet.setFillAlpha(255);
            }
            lineDataSet.setDrawHorizontalHighlightIndicator(false);
            lineDataSet.setFillFormatter(new e() { // from class: com.moyoung.dafit.module.common.widgets.chart.c
                @Override // com.github.mikephil.charting.formatter.e
                public final float getFillLinePosition(f fVar, g gVar) {
                    float lambda$setWeightData$2;
                    lambda$setWeightData$2 = CrpLineChart.this.lambda$setWeightData$2(fVar, gVar);
                    return lambda$setWeightData$2;
                }
            });
            k kVar = new k(lineDataSet);
            kVar.setDrawValues(false);
            setData(kVar);
        } else {
            ((LineDataSet) ((k) getData()).getDataSetByIndex(0)).setValues(valueEntries);
            ((k) getData()).notifyDataChanged();
            notifyDataSetChanged();
        }
        invalidate();
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

    public void setXAxisValueFormatter(com.github.mikephil.charting.formatter.g gVar) {
        if (gVar != null) {
            getXAxis().setValueFormatter(gVar);
        }
    }

    public void setYAxisGrid(boolean z7, int i8, int i9) {
        YAxis axisLeft = z7 ? getAxisLeft() : getAxisRight();
        axisLeft.setDrawGridLines(true);
        axisLeft.setGridColor(i8);
        axisLeft.setTextColor(i9);
    }

    public void showHideYAxis(boolean z7) {
        YAxis axisLeft = getAxisLeft();
        if (axisLeft.isEnabled()) {
            axisLeft.setEnabled(z7);
        }
        YAxis axisLeft2 = getAxisLeft();
        if (axisLeft2.isEnabled()) {
            axisLeft2.setEnabled(z7);
        }
    }

    public CrpLineChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.maxValue = 210;
    }

    public void setLeftAxis(int i8) {
        YAxis axisLeft = getAxisLeft();
        axisLeft.setDrawAxisLine(false);
        axisLeft.setDrawGridLines(false);
        axisLeft.setDrawLabels(true);
        axisLeft.setLabelCount(i8, true);
        axisLeft.setDrawZeroLine(false);
        axisLeft.setAxisLineColor(-1);
        axisLeft.setEnabled(true);
    }

    public void setRightAxis(int i8) {
        YAxis axisRight = getAxisRight();
        axisRight.setDrawAxisLine(false);
        axisRight.setDrawGridLines(false);
        axisRight.setDrawLabels(true);
        axisRight.setLabelCount(i8, true);
        axisRight.setDrawZeroLine(false);
        axisRight.setAxisLineColor(-1);
        axisRight.setEnabled(true);
    }

    public CrpLineChart(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.maxValue = 210;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setData(List<Float> list, @ColorInt int i8, float f8) {
        ArrayList<Entry> lineEntries = getLineEntries(list);
        if (getData() != 0 && ((k) getData()).getDataSetCount() > 0) {
            ((LineDataSet) ((k) getData()).getDataSetByIndex(0)).setValues(lineEntries);
            ((k) getData()).notifyDataChanged();
            notifyDataSetChanged();
        } else {
            LineDataSet lineDataSet = new LineDataSet(lineEntries, "");
            lineDataSet.setMode(LineDataSet.Mode.LINEAR);
            lineDataSet.setDrawCircles(true);
            lineDataSet.setCircleColor(i8);
            lineDataSet.setDrawCircleHole(false);
            lineDataSet.setCircleRadius((float) (f8 + 0.5d));
            lineDataSet.setLineWidth(f8);
            lineDataSet.setColor(i8);
            lineDataSet.setDrawHorizontalHighlightIndicator(false);
            lineDataSet.setFillFormatter(new b());
            k kVar = new k(lineDataSet);
            kVar.setDrawValues(false);
            setData(kVar);
        }
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setData(List<Float> list, List<Float> list2, @ColorInt int i8, @ColorInt int i9, float f8) {
        ArrayList<Entry> lineEntries = getLineEntries(list);
        ArrayList<Entry> lineEntries2 = getLineEntries(list2);
        if (getData() != 0 && ((k) getData()).getDataSetCount() > 0) {
            LineDataSet lineDataSet = (LineDataSet) ((k) getData()).getDataSetByIndex(0);
            LineDataSet lineDataSet2 = (LineDataSet) ((k) getData()).getDataSetByIndex(1);
            lineDataSet.setValues(lineEntries);
            lineDataSet2.setValues(lineEntries2);
            lineDataSet.setAxisDependency(YAxis.AxisDependency.LEFT);
            lineDataSet2.setAxisDependency(YAxis.AxisDependency.RIGHT);
            ((k) getData()).notifyDataChanged();
            notifyDataSetChanged();
        } else {
            LineDataSet lineDataSet3 = new LineDataSet(Collections.unmodifiableList(lineEntries), "");
            LineDataSet.Mode mode = LineDataSet.Mode.HORIZONTAL_BEZIER;
            lineDataSet3.setMode(mode);
            lineDataSet3.setDrawCircles(false);
            lineDataSet3.setCircleColor(i8);
            lineDataSet3.setDrawCircleHole(false);
            float f9 = (float) (f8 + 0.5d);
            lineDataSet3.setCircleRadius(f9);
            lineDataSet3.setLineWidth(f8);
            lineDataSet3.setColor(i8);
            lineDataSet3.setAxisDependency(YAxis.AxisDependency.LEFT);
            lineDataSet3.setDrawHorizontalHighlightIndicator(false);
            lineDataSet3.setFillFormatter(new e() { // from class: com.moyoung.dafit.module.common.widgets.chart.a
                @Override // com.github.mikephil.charting.formatter.e
                public final float getFillLinePosition(f fVar, g gVar) {
                    float lambda$setData$0;
                    lambda$setData$0 = CrpLineChart.this.lambda$setData$0(fVar, gVar);
                    return lambda$setData$0;
                }
            });
            LineDataSet lineDataSet4 = new LineDataSet(Collections.unmodifiableList(lineEntries2), "");
            lineDataSet4.setMode(mode);
            lineDataSet4.setDrawCircles(false);
            lineDataSet4.setCircleColor(i9);
            lineDataSet4.setDrawCircleHole(false);
            lineDataSet4.setCircleRadius(f9);
            lineDataSet4.setLineWidth(f8);
            lineDataSet4.setColor(i9);
            lineDataSet4.setAxisDependency(YAxis.AxisDependency.RIGHT);
            lineDataSet4.setDrawHorizontalHighlightIndicator(false);
            lineDataSet4.setFillFormatter(new e() { // from class: com.moyoung.dafit.module.common.widgets.chart.b
                @Override // com.github.mikephil.charting.formatter.e
                public final float getFillLinePosition(f fVar, g gVar) {
                    float lambda$setData$1;
                    lambda$setData$1 = CrpLineChart.this.lambda$setData$1(fVar, gVar);
                    return lambda$setData$1;
                }
            });
            k kVar = new k(lineDataSet3, lineDataSet4);
            kVar.setDrawValues(false);
            setData(kVar);
        }
        invalidate();
    }
}
