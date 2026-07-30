package v4;

import android.graphics.DashPathEffect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.DataSet;
import com.github.mikephil.charting.data.Entry;
import java.util.List;

/* loaded from: classes3.dex */
public interface g extends h {
    @Override // v4.h, v4.b, v4.e
    /* synthetic */ boolean addEntry(Entry entry);

    @Override // v4.h, v4.b, v4.e
    /* synthetic */ void addEntryOrdered(Entry entry);

    @Override // v4.h, v4.b, v4.e
    /* synthetic */ void calcMinMax();

    @Override // v4.h, v4.b, v4.e
    /* synthetic */ void calcMinMaxY(float f8, float f9);

    @Override // v4.h, v4.b, v4.e
    /* synthetic */ void clear();

    @Override // v4.h, v4.b, v4.e
    /* synthetic */ boolean contains(Entry entry);

    @Override // v4.h, v4.b, v4.e
    /* synthetic */ YAxis.AxisDependency getAxisDependency();

    @Override // v4.h, v4.b, v4.e
    /* synthetic */ int getColor();

    @Override // v4.h, v4.b, v4.e
    /* synthetic */ int getColor(int i8);

    @Override // v4.h, v4.b, v4.e
    /* synthetic */ List getColors();

    @Override // v4.h
    /* synthetic */ DashPathEffect getDashPathEffectHighlight();

    @Override // v4.h, v4.b, v4.e
    /* synthetic */ List getEntriesForXValue(float f8);

    @Override // v4.h, v4.b, v4.e
    /* synthetic */ int getEntryCount();

    @Override // v4.h, v4.b, v4.e
    /* synthetic */ Entry getEntryForIndex(int i8);

    @Override // v4.h, v4.b, v4.e
    /* synthetic */ Entry getEntryForXValue(float f8, float f9);

    @Override // v4.h, v4.b, v4.e
    /* synthetic */ Entry getEntryForXValue(float f8, float f9, DataSet.Rounding rounding);

    @Override // v4.h, v4.b, v4.e
    /* synthetic */ int getEntryIndex(float f8, float f9, DataSet.Rounding rounding);

    @Override // v4.h, v4.b, v4.e
    /* synthetic */ int getEntryIndex(Entry entry);

    int getFillAlpha();

    int getFillColor();

    Drawable getFillDrawable();

    @Override // v4.h, v4.b, v4.e
    /* synthetic */ Legend.LegendForm getForm();

    @Override // v4.h, v4.b, v4.e
    /* synthetic */ DashPathEffect getFormLineDashEffect();

    @Override // v4.h, v4.b, v4.e
    /* synthetic */ float getFormLineWidth();

    @Override // v4.h, v4.b, v4.e
    /* synthetic */ float getFormSize();

    @Override // v4.h, v4.b, v4.e
    /* synthetic */ w4.a getGradientColor();

    @Override // v4.h, v4.b, v4.e
    /* synthetic */ w4.a getGradientColor(int i8);

    @Override // v4.h, v4.b, v4.e
    /* synthetic */ List getGradientColors();

    @Override // v4.h, v4.b
    /* synthetic */ int getHighLightColor();

    @Override // v4.h
    /* synthetic */ float getHighlightLineWidth();

    @Override // v4.h, v4.b, v4.e
    /* synthetic */ com.github.mikephil.charting.utils.e getIconsOffset();

    @Override // v4.h, v4.b, v4.e
    /* synthetic */ int getIndexInEntries(int i8);

    @Override // v4.h, v4.b, v4.e
    /* synthetic */ String getLabel();

    float getLineWidth();

    @Override // v4.h, v4.b, v4.e
    /* synthetic */ com.github.mikephil.charting.formatter.g getValueFormatter();

    @Override // v4.h, v4.b, v4.e
    /* synthetic */ int getValueTextColor();

    @Override // v4.h, v4.b, v4.e
    /* synthetic */ int getValueTextColor(int i8);

    @Override // v4.h, v4.b, v4.e
    /* synthetic */ float getValueTextSize();

    @Override // v4.h, v4.b, v4.e
    /* synthetic */ Typeface getValueTypeface();

    @Override // v4.h, v4.b, v4.e
    /* synthetic */ float getXMax();

    @Override // v4.h, v4.b, v4.e
    /* synthetic */ float getXMin();

    @Override // v4.h, v4.b, v4.e
    /* synthetic */ float getYMax();

    @Override // v4.h, v4.b, v4.e
    /* synthetic */ float getYMin();

    boolean isDrawFilledEnabled();

    @Override // v4.h, v4.b, v4.e
    /* synthetic */ boolean isDrawIconsEnabled();

    @Override // v4.h, v4.b, v4.e
    /* synthetic */ boolean isDrawValuesEnabled();

    @Override // v4.h, v4.b, v4.e
    /* synthetic */ boolean isHighlightEnabled();

    @Override // v4.h
    /* synthetic */ boolean isHorizontalHighlightIndicatorEnabled();

    @Override // v4.h
    /* synthetic */ boolean isVerticalHighlightIndicatorEnabled();

    @Override // v4.h, v4.b, v4.e
    /* synthetic */ boolean isVisible();

    @Override // v4.h, v4.b, v4.e
    /* synthetic */ boolean needsFormatter();

    @Override // v4.h, v4.b, v4.e
    /* synthetic */ boolean removeEntry(int i8);

    @Override // v4.h, v4.b, v4.e
    /* synthetic */ boolean removeEntry(Entry entry);

    @Override // v4.h, v4.b, v4.e
    /* synthetic */ boolean removeEntryByXValue(float f8);

    @Override // v4.h, v4.b, v4.e
    /* synthetic */ boolean removeFirst();

    @Override // v4.h, v4.b, v4.e
    /* synthetic */ boolean removeLast();

    @Override // v4.h, v4.b, v4.e
    /* synthetic */ void setAxisDependency(YAxis.AxisDependency axisDependency);

    void setDrawFilled(boolean z7);

    @Override // v4.h, v4.b, v4.e
    /* synthetic */ void setDrawIcons(boolean z7);

    @Override // v4.h, v4.b, v4.e
    /* synthetic */ void setDrawValues(boolean z7);

    @Override // v4.h, v4.b, v4.e
    /* synthetic */ void setHighlightEnabled(boolean z7);

    @Override // v4.h, v4.b, v4.e
    /* synthetic */ void setIconsOffset(com.github.mikephil.charting.utils.e eVar);

    @Override // v4.h, v4.b, v4.e
    /* synthetic */ void setLabel(String str);

    @Override // v4.h, v4.b, v4.e
    /* synthetic */ void setValueFormatter(com.github.mikephil.charting.formatter.g gVar);

    @Override // v4.h, v4.b, v4.e
    /* synthetic */ void setValueTextColor(int i8);

    @Override // v4.h, v4.b, v4.e
    /* synthetic */ void setValueTextColors(List list);

    @Override // v4.h, v4.b, v4.e
    /* synthetic */ void setValueTextSize(float f8);

    @Override // v4.h, v4.b, v4.e
    /* synthetic */ void setValueTypeface(Typeface typeface);

    @Override // v4.h, v4.b, v4.e
    /* synthetic */ void setVisible(boolean z7);
}
