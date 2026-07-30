package v4;

import android.graphics.DashPathEffect;
import android.graphics.Typeface;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.DataSet;
import com.github.mikephil.charting.data.Entry;
import java.util.List;

/* loaded from: classes3.dex */
public interface e {
    boolean addEntry(Entry entry);

    void addEntryOrdered(Entry entry);

    void calcMinMax();

    void calcMinMaxY(float f8, float f9);

    void clear();

    boolean contains(Entry entry);

    YAxis.AxisDependency getAxisDependency();

    int getColor();

    int getColor(int i8);

    List<Integer> getColors();

    List<Entry> getEntriesForXValue(float f8);

    int getEntryCount();

    Entry getEntryForIndex(int i8);

    Entry getEntryForXValue(float f8, float f9);

    Entry getEntryForXValue(float f8, float f9, DataSet.Rounding rounding);

    int getEntryIndex(float f8, float f9, DataSet.Rounding rounding);

    int getEntryIndex(Entry entry);

    Legend.LegendForm getForm();

    DashPathEffect getFormLineDashEffect();

    float getFormLineWidth();

    float getFormSize();

    w4.a getGradientColor();

    w4.a getGradientColor(int i8);

    List<w4.a> getGradientColors();

    com.github.mikephil.charting.utils.e getIconsOffset();

    int getIndexInEntries(int i8);

    String getLabel();

    com.github.mikephil.charting.formatter.g getValueFormatter();

    int getValueTextColor();

    int getValueTextColor(int i8);

    float getValueTextSize();

    Typeface getValueTypeface();

    float getXMax();

    float getXMin();

    float getYMax();

    float getYMin();

    boolean isDrawIconsEnabled();

    boolean isDrawValuesEnabled();

    boolean isHighlightEnabled();

    boolean isVisible();

    boolean needsFormatter();

    boolean removeEntry(int i8);

    boolean removeEntry(Entry entry);

    boolean removeEntryByXValue(float f8);

    boolean removeFirst();

    boolean removeLast();

    void setAxisDependency(YAxis.AxisDependency axisDependency);

    void setDrawIcons(boolean z7);

    void setDrawValues(boolean z7);

    void setHighlightEnabled(boolean z7);

    void setIconsOffset(com.github.mikephil.charting.utils.e eVar);

    void setLabel(String str);

    void setValueFormatter(com.github.mikephil.charting.formatter.g gVar);

    void setValueTextColor(int i8);

    void setValueTextColors(List<Integer> list);

    void setValueTextSize(float f8);

    void setValueTypeface(Typeface typeface);

    void setVisible(boolean z7);
}
