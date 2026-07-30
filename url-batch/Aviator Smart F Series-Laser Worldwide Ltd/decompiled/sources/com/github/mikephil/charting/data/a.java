package com.github.mikephil.charting.data;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class a extends c {
    private float mBarWidth;

    public a() {
        this.mBarWidth = 0.85f;
    }

    public float getBarWidth() {
        return this.mBarWidth;
    }

    public float getGroupWidth(float f8, float f9) {
        return (this.mDataSets.size() * (this.mBarWidth + f9)) + f8;
    }

    public void groupBars(float f8, float f9, float f10) {
        BarEntry barEntry;
        if (this.mDataSets.size() <= 1) {
            throw new RuntimeException("BarData needs to hold at least 2 BarDataSets to allow grouping.");
        }
        int entryCount = ((v4.a) getMaxEntryCountSet()).getEntryCount();
        float f11 = f9 / 2.0f;
        float f12 = f10 / 2.0f;
        float f13 = this.mBarWidth / 2.0f;
        float groupWidth = getGroupWidth(f9, f10);
        for (int i8 = 0; i8 < entryCount; i8++) {
            float f14 = f8 + f11;
            Iterator<v4.e> it = this.mDataSets.iterator();
            while (it.hasNext()) {
                v4.a aVar = (v4.a) it.next();
                float f15 = f14 + f12 + f13;
                if (i8 < aVar.getEntryCount() && (barEntry = (BarEntry) aVar.getEntryForIndex(i8)) != null) {
                    barEntry.setX(f15);
                }
                f14 = f15 + f13 + f12;
            }
            float f16 = f14 + f11;
            float f17 = groupWidth - (f16 - f8);
            if (f17 > 0.0f || f17 < 0.0f) {
                f16 += f17;
            }
            f8 = f16;
        }
        notifyDataChanged();
    }

    public void setBarWidth(float f8) {
        this.mBarWidth = f8;
    }

    public a(v4.a... aVarArr) {
        super(aVarArr);
        this.mBarWidth = 0.85f;
    }

    public a(List<v4.a> list) {
        super(list);
        this.mBarWidth = 0.85f;
    }
}
