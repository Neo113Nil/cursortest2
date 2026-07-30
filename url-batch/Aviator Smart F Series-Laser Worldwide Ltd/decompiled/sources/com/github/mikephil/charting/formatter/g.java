package com.github.mikephil.charting.formatter;

import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.BubbleEntry;
import com.github.mikephil.charting.data.CandleEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.data.RadarEntry;
import com.github.mikephil.charting.utils.j;

/* loaded from: classes3.dex */
public abstract class g implements d, f {
    public String getAxisLabel(float f8, com.github.mikephil.charting.components.a aVar) {
        return getFormattedValue(f8);
    }

    public String getBarLabel(BarEntry barEntry) {
        return getFormattedValue(barEntry.getY());
    }

    public String getBarStackedLabel(float f8, BarEntry barEntry) {
        return getFormattedValue(f8);
    }

    public String getBubbleLabel(BubbleEntry bubbleEntry) {
        return getFormattedValue(bubbleEntry.getSize());
    }

    public String getCandleLabel(CandleEntry candleEntry) {
        return getFormattedValue(candleEntry.getHigh());
    }

    @Override // com.github.mikephil.charting.formatter.d
    @Deprecated
    public String getFormattedValue(float f8, com.github.mikephil.charting.components.a aVar) {
        return getFormattedValue(f8);
    }

    public String getPieLabel(float f8, PieEntry pieEntry) {
        return getFormattedValue(f8);
    }

    public String getPointLabel(Entry entry) {
        return getFormattedValue(entry.getY());
    }

    public String getRadarLabel(RadarEntry radarEntry) {
        return getFormattedValue(radarEntry.getY());
    }

    @Override // com.github.mikephil.charting.formatter.f
    @Deprecated
    public String getFormattedValue(float f8, Entry entry, int i8, j jVar) {
        return getFormattedValue(f8);
    }

    public String getFormattedValue(float f8) {
        return String.valueOf(f8);
    }
}
