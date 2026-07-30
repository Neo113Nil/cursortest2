package com.github.mikephil.charting.data;

import android.content.Context;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class LineDataSet extends l implements v4.f {
    private List<Integer> mCircleColors;
    private int mCircleHoleColor;
    private float mCircleHoleRadius;
    private float mCircleRadius;
    private float mCubicIntensity;
    private DashPathEffect mDashPathEffect;
    private boolean mDrawCircleHole;
    private boolean mDrawCircles;
    private com.github.mikephil.charting.formatter.e mFillFormatter;
    private Mode mMode;

    public enum Mode {
        LINEAR,
        STEPPED,
        CUBIC_BEZIER,
        HORIZONTAL_BEZIER
    }

    public LineDataSet(List<Entry> list, String str) {
        super(list, str);
        this.mMode = Mode.LINEAR;
        this.mCircleColors = null;
        this.mCircleHoleColor = -1;
        this.mCircleRadius = 8.0f;
        this.mCircleHoleRadius = 4.0f;
        this.mCubicIntensity = 0.2f;
        this.mDashPathEffect = null;
        this.mFillFormatter = new com.github.mikephil.charting.formatter.b();
        this.mDrawCircles = true;
        this.mDrawCircleHole = true;
        if (this.mCircleColors == null) {
            this.mCircleColors = new ArrayList();
        }
        this.mCircleColors.clear();
        this.mCircleColors.add(Integer.valueOf(Color.rgb(140, 234, 255)));
    }

    @Override // com.github.mikephil.charting.data.DataSet
    public DataSet copy() {
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < this.mValues.size(); i8++) {
            arrayList.add(this.mValues.get(i8).copy());
        }
        LineDataSet lineDataSet = new LineDataSet(arrayList, getLabel());
        copy(lineDataSet);
        return lineDataSet;
    }

    public void disableDashedLine() {
        this.mDashPathEffect = null;
    }

    public void enableDashedLine(float f8, float f9, float f10) {
        this.mDashPathEffect = new DashPathEffect(new float[]{f8, f9}, f10);
    }

    @Override // v4.f
    public int getCircleColor(int i8) {
        return this.mCircleColors.get(i8).intValue();
    }

    @Override // v4.f
    public int getCircleColorCount() {
        return this.mCircleColors.size();
    }

    public List<Integer> getCircleColors() {
        return this.mCircleColors;
    }

    @Override // v4.f
    public int getCircleHoleColor() {
        return this.mCircleHoleColor;
    }

    @Override // v4.f
    public float getCircleHoleRadius() {
        return this.mCircleHoleRadius;
    }

    @Override // v4.f
    public float getCircleRadius() {
        return this.mCircleRadius;
    }

    @Deprecated
    public float getCircleSize() {
        return getCircleRadius();
    }

    @Override // v4.f
    public float getCubicIntensity() {
        return this.mCubicIntensity;
    }

    @Override // v4.f
    public DashPathEffect getDashPathEffect() {
        return this.mDashPathEffect;
    }

    @Override // v4.f
    public com.github.mikephil.charting.formatter.e getFillFormatter() {
        return this.mFillFormatter;
    }

    @Override // v4.f
    public Mode getMode() {
        return this.mMode;
    }

    @Override // v4.f
    public boolean isDashedLineEnabled() {
        return this.mDashPathEffect != null;
    }

    @Override // v4.f
    public boolean isDrawCircleHoleEnabled() {
        return this.mDrawCircleHole;
    }

    @Override // v4.f
    public boolean isDrawCirclesEnabled() {
        return this.mDrawCircles;
    }

    @Override // v4.f
    @Deprecated
    public boolean isDrawCubicEnabled() {
        return this.mMode == Mode.CUBIC_BEZIER;
    }

    @Override // v4.f
    @Deprecated
    public boolean isDrawSteppedEnabled() {
        return this.mMode == Mode.STEPPED;
    }

    public void resetCircleColors() {
        if (this.mCircleColors == null) {
            this.mCircleColors = new ArrayList();
        }
        this.mCircleColors.clear();
    }

    public void setCircleColor(int i8) {
        resetCircleColors();
        this.mCircleColors.add(Integer.valueOf(i8));
    }

    public void setCircleColors(List<Integer> list) {
        this.mCircleColors = list;
    }

    public void setCircleHoleColor(int i8) {
        this.mCircleHoleColor = i8;
    }

    public void setCircleHoleRadius(float f8) {
        if (f8 >= 0.5f) {
            this.mCircleHoleRadius = com.github.mikephil.charting.utils.i.convertDpToPixel(f8);
        } else {
            Log.e("LineDataSet", "Circle radius cannot be < 0.5");
        }
    }

    public void setCircleRadius(float f8) {
        if (f8 >= 1.0f) {
            this.mCircleRadius = com.github.mikephil.charting.utils.i.convertDpToPixel(f8);
        } else {
            Log.e("LineDataSet", "Circle radius cannot be < 1");
        }
    }

    @Deprecated
    public void setCircleSize(float f8) {
        setCircleRadius(f8);
    }

    public void setCubicIntensity(float f8) {
        if (f8 > 1.0f) {
            f8 = 1.0f;
        }
        if (f8 < 0.05f) {
            f8 = 0.05f;
        }
        this.mCubicIntensity = f8;
    }

    public void setDrawCircleHole(boolean z7) {
        this.mDrawCircleHole = z7;
    }

    public void setDrawCircles(boolean z7) {
        this.mDrawCircles = z7;
    }

    public void setFillFormatter(com.github.mikephil.charting.formatter.e eVar) {
        if (eVar == null) {
            this.mFillFormatter = new com.github.mikephil.charting.formatter.b();
        } else {
            this.mFillFormatter = eVar;
        }
    }

    public void setMode(Mode mode) {
        this.mMode = mode;
    }

    public void setCircleColors(int... iArr) {
        this.mCircleColors = com.github.mikephil.charting.utils.a.createColors(iArr);
    }

    public void setCircleColors(int[] iArr, Context context) {
        List<Integer> list = this.mCircleColors;
        if (list == null) {
            list = new ArrayList<>();
        }
        list.clear();
        for (int i8 : iArr) {
            list.add(Integer.valueOf(context.getResources().getColor(i8)));
        }
        this.mCircleColors = list;
    }

    protected void copy(LineDataSet lineDataSet) {
        super.copy((l) lineDataSet);
        lineDataSet.mCircleColors = this.mCircleColors;
        lineDataSet.mCircleHoleColor = this.mCircleHoleColor;
        lineDataSet.mCircleHoleRadius = this.mCircleHoleRadius;
        lineDataSet.mCircleRadius = this.mCircleRadius;
        lineDataSet.mCubicIntensity = this.mCubicIntensity;
        lineDataSet.mDashPathEffect = this.mDashPathEffect;
        lineDataSet.mDrawCircleHole = this.mDrawCircleHole;
        lineDataSet.mDrawCircles = this.mDrawCircleHole;
        lineDataSet.mFillFormatter = this.mFillFormatter;
        lineDataSet.mMode = this.mMode;
    }
}
