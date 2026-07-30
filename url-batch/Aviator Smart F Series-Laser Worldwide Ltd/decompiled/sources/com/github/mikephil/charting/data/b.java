package com.github.mikephil.charting.data;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class b extends d implements v4.a {
    private int mBarBorderColor;
    private float mBarBorderWidth;
    private int mBarShadowColor;
    private int mEntryCountStacks;
    private int mHighLightAlpha;
    private String[] mStackLabels;
    private int mStackSize;

    public b(List<BarEntry> list, String str) {
        super(list, str);
        this.mStackSize = 1;
        this.mBarShadowColor = Color.rgb(215, 215, 215);
        this.mBarBorderWidth = 0.0f;
        this.mBarBorderColor = -16777216;
        this.mHighLightAlpha = 120;
        this.mEntryCountStacks = 0;
        this.mStackLabels = new String[]{"Stack"};
        this.mHighLightColor = Color.rgb(0, 0, 0);
        calcStackSize(list);
        calcEntryCountIncludingStacks(list);
    }

    private void calcEntryCountIncludingStacks(List<BarEntry> list) {
        this.mEntryCountStacks = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            float[] yVals = list.get(i8).getYVals();
            if (yVals == null) {
                this.mEntryCountStacks++;
            } else {
                this.mEntryCountStacks += yVals.length;
            }
        }
    }

    private void calcStackSize(List<BarEntry> list) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            float[] yVals = list.get(i8).getYVals();
            if (yVals != null && yVals.length > this.mStackSize) {
                this.mStackSize = yVals.length;
            }
        }
    }

    @Override // com.github.mikephil.charting.data.DataSet
    public DataSet copy() {
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < this.mValues.size(); i8++) {
            arrayList.add(((BarEntry) this.mValues.get(i8)).copy());
        }
        b bVar = new b(arrayList, getLabel());
        copy(bVar);
        return bVar;
    }

    @Override // v4.a
    public int getBarBorderColor() {
        return this.mBarBorderColor;
    }

    @Override // v4.a
    public float getBarBorderWidth() {
        return this.mBarBorderWidth;
    }

    @Override // v4.a
    public int getBarShadowColor() {
        return this.mBarShadowColor;
    }

    public int getEntryCountStacks() {
        return this.mEntryCountStacks;
    }

    @Override // v4.a
    public int getHighLightAlpha() {
        return this.mHighLightAlpha;
    }

    @Override // v4.a
    public String[] getStackLabels() {
        return this.mStackLabels;
    }

    @Override // v4.a
    public int getStackSize() {
        return this.mStackSize;
    }

    @Override // v4.a
    public boolean isStacked() {
        return this.mStackSize > 1;
    }

    public void setBarBorderColor(int i8) {
        this.mBarBorderColor = i8;
    }

    public void setBarBorderWidth(float f8) {
        this.mBarBorderWidth = f8;
    }

    public void setBarShadowColor(int i8) {
        this.mBarShadowColor = i8;
    }

    public void setHighLightAlpha(int i8) {
        this.mHighLightAlpha = i8;
    }

    public void setStackLabels(String[] strArr) {
        this.mStackLabels = strArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.mikephil.charting.data.DataSet
    public void calcMinMax(BarEntry barEntry) {
        if (barEntry == null || Float.isNaN(barEntry.getY())) {
            return;
        }
        if (barEntry.getYVals() == null) {
            if (barEntry.getY() < this.mYMin) {
                this.mYMin = barEntry.getY();
            }
            if (barEntry.getY() > this.mYMax) {
                this.mYMax = barEntry.getY();
            }
        } else {
            if ((-barEntry.getNegativeSum()) < this.mYMin) {
                this.mYMin = -barEntry.getNegativeSum();
            }
            if (barEntry.getPositiveSum() > this.mYMax) {
                this.mYMax = barEntry.getPositiveSum();
            }
        }
        calcMinMaxX(barEntry);
    }

    protected void copy(b bVar) {
        super.copy((d) bVar);
        bVar.mStackSize = this.mStackSize;
        bVar.mBarShadowColor = this.mBarShadowColor;
        bVar.mBarBorderWidth = this.mBarBorderWidth;
        bVar.mStackLabels = this.mStackLabels;
        bVar.mHighLightAlpha = this.mHighLightAlpha;
    }
}
