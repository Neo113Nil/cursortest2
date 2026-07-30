package com.github.mikephil.charting.data;

import android.content.Context;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Typeface;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.DataSet;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class e implements v4.e {
    protected YAxis.AxisDependency mAxisDependency;
    protected List<Integer> mColors;
    protected boolean mDrawIcons;
    protected boolean mDrawValues;
    private Legend.LegendForm mForm;
    private DashPathEffect mFormLineDashEffect;
    private float mFormLineWidth;
    private float mFormSize;
    protected w4.a mGradientColor;
    protected List<w4.a> mGradientColors;
    protected boolean mHighlightEnabled;
    protected com.github.mikephil.charting.utils.e mIconsOffset;
    private String mLabel;
    protected List<Integer> mValueColors;
    protected transient com.github.mikephil.charting.formatter.g mValueFormatter;
    protected float mValueTextSize;
    protected Typeface mValueTypeface;
    protected boolean mVisible;

    public e() {
        this.mColors = null;
        this.mGradientColor = null;
        this.mGradientColors = null;
        this.mValueColors = null;
        this.mLabel = "DataSet";
        this.mAxisDependency = YAxis.AxisDependency.LEFT;
        this.mHighlightEnabled = true;
        this.mForm = Legend.LegendForm.DEFAULT;
        this.mFormSize = Float.NaN;
        this.mFormLineWidth = Float.NaN;
        this.mFormLineDashEffect = null;
        this.mDrawValues = true;
        this.mDrawIcons = true;
        this.mIconsOffset = new com.github.mikephil.charting.utils.e();
        this.mValueTextSize = 17.0f;
        this.mVisible = true;
        this.mColors = new ArrayList();
        this.mValueColors = new ArrayList();
        this.mColors.add(Integer.valueOf(Color.rgb(140, 234, 255)));
        this.mValueColors.add(-16777216);
    }

    public void addColor(int i8) {
        if (this.mColors == null) {
            this.mColors = new ArrayList();
        }
        this.mColors.add(Integer.valueOf(i8));
    }

    @Override // v4.e
    public abstract /* synthetic */ boolean addEntry(Entry entry);

    @Override // v4.e
    public abstract /* synthetic */ void addEntryOrdered(Entry entry);

    @Override // v4.e
    public abstract /* synthetic */ void calcMinMax();

    @Override // v4.e
    public abstract /* synthetic */ void calcMinMaxY(float f8, float f9);

    @Override // v4.e
    public abstract /* synthetic */ void clear();

    @Override // v4.e
    public boolean contains(Entry entry) {
        for (int i8 = 0; i8 < getEntryCount(); i8++) {
            if (getEntryForIndex(i8).equals(entry)) {
                return true;
            }
        }
        return false;
    }

    protected void copy(e eVar) {
        eVar.mAxisDependency = this.mAxisDependency;
        eVar.mColors = this.mColors;
        eVar.mDrawIcons = this.mDrawIcons;
        eVar.mDrawValues = this.mDrawValues;
        eVar.mForm = this.mForm;
        eVar.mFormLineDashEffect = this.mFormLineDashEffect;
        eVar.mFormLineWidth = this.mFormLineWidth;
        eVar.mFormSize = this.mFormSize;
        eVar.mGradientColor = this.mGradientColor;
        eVar.mGradientColors = this.mGradientColors;
        eVar.mHighlightEnabled = this.mHighlightEnabled;
        eVar.mIconsOffset = this.mIconsOffset;
        eVar.mValueColors = this.mValueColors;
        eVar.mValueFormatter = this.mValueFormatter;
        eVar.mValueColors = this.mValueColors;
        eVar.mValueTextSize = this.mValueTextSize;
        eVar.mVisible = this.mVisible;
    }

    @Override // v4.e
    public YAxis.AxisDependency getAxisDependency() {
        return this.mAxisDependency;
    }

    @Override // v4.e
    public int getColor() {
        return this.mColors.get(0).intValue();
    }

    @Override // v4.e
    public List<Integer> getColors() {
        return this.mColors;
    }

    @Override // v4.e
    public abstract /* synthetic */ List getEntriesForXValue(float f8);

    @Override // v4.e
    public abstract /* synthetic */ int getEntryCount();

    @Override // v4.e
    public abstract /* synthetic */ Entry getEntryForIndex(int i8);

    @Override // v4.e
    public abstract /* synthetic */ Entry getEntryForXValue(float f8, float f9);

    @Override // v4.e
    public abstract /* synthetic */ Entry getEntryForXValue(float f8, float f9, DataSet.Rounding rounding);

    @Override // v4.e
    public abstract /* synthetic */ int getEntryIndex(float f8, float f9, DataSet.Rounding rounding);

    @Override // v4.e
    public abstract /* synthetic */ int getEntryIndex(Entry entry);

    @Override // v4.e
    public Legend.LegendForm getForm() {
        return this.mForm;
    }

    @Override // v4.e
    public DashPathEffect getFormLineDashEffect() {
        return this.mFormLineDashEffect;
    }

    @Override // v4.e
    public float getFormLineWidth() {
        return this.mFormLineWidth;
    }

    @Override // v4.e
    public float getFormSize() {
        return this.mFormSize;
    }

    @Override // v4.e
    public w4.a getGradientColor() {
        return this.mGradientColor;
    }

    @Override // v4.e
    public List<w4.a> getGradientColors() {
        return this.mGradientColors;
    }

    @Override // v4.e
    public com.github.mikephil.charting.utils.e getIconsOffset() {
        return this.mIconsOffset;
    }

    @Override // v4.e
    public int getIndexInEntries(int i8) {
        for (int i9 = 0; i9 < getEntryCount(); i9++) {
            if (i8 == getEntryForIndex(i9).getX()) {
                return i9;
            }
        }
        return -1;
    }

    @Override // v4.e
    public String getLabel() {
        return this.mLabel;
    }

    public List<Integer> getValueColors() {
        return this.mValueColors;
    }

    @Override // v4.e
    public com.github.mikephil.charting.formatter.g getValueFormatter() {
        return needsFormatter() ? com.github.mikephil.charting.utils.i.getDefaultValueFormatter() : this.mValueFormatter;
    }

    @Override // v4.e
    public int getValueTextColor() {
        return this.mValueColors.get(0).intValue();
    }

    @Override // v4.e
    public float getValueTextSize() {
        return this.mValueTextSize;
    }

    @Override // v4.e
    public Typeface getValueTypeface() {
        return this.mValueTypeface;
    }

    @Override // v4.e
    public abstract /* synthetic */ float getXMax();

    @Override // v4.e
    public abstract /* synthetic */ float getXMin();

    @Override // v4.e
    public abstract /* synthetic */ float getYMax();

    @Override // v4.e
    public abstract /* synthetic */ float getYMin();

    @Override // v4.e
    public boolean isDrawIconsEnabled() {
        return this.mDrawIcons;
    }

    @Override // v4.e
    public boolean isDrawValuesEnabled() {
        return this.mDrawValues;
    }

    @Override // v4.e
    public boolean isHighlightEnabled() {
        return this.mHighlightEnabled;
    }

    @Override // v4.e
    public boolean isVisible() {
        return this.mVisible;
    }

    @Override // v4.e
    public boolean needsFormatter() {
        return this.mValueFormatter == null;
    }

    public void notifyDataSetChanged() {
        calcMinMax();
    }

    @Override // v4.e
    public boolean removeEntry(int i8) {
        return removeEntry(getEntryForIndex(i8));
    }

    @Override // v4.e
    public abstract /* synthetic */ boolean removeEntry(Entry entry);

    @Override // v4.e
    public boolean removeEntryByXValue(float f8) {
        return removeEntry(getEntryForXValue(f8, Float.NaN));
    }

    @Override // v4.e
    public boolean removeFirst() {
        if (getEntryCount() > 0) {
            return removeEntry(getEntryForIndex(0));
        }
        return false;
    }

    @Override // v4.e
    public boolean removeLast() {
        if (getEntryCount() > 0) {
            return removeEntry(getEntryForIndex(getEntryCount() - 1));
        }
        return false;
    }

    public void resetColors() {
        if (this.mColors == null) {
            this.mColors = new ArrayList();
        }
        this.mColors.clear();
    }

    @Override // v4.e
    public void setAxisDependency(YAxis.AxisDependency axisDependency) {
        this.mAxisDependency = axisDependency;
    }

    public void setColor(int i8) {
        resetColors();
        this.mColors.add(Integer.valueOf(i8));
    }

    public void setColors(List<Integer> list) {
        this.mColors = list;
    }

    @Override // v4.e
    public void setDrawIcons(boolean z7) {
        this.mDrawIcons = z7;
    }

    @Override // v4.e
    public void setDrawValues(boolean z7) {
        this.mDrawValues = z7;
    }

    public void setForm(Legend.LegendForm legendForm) {
        this.mForm = legendForm;
    }

    public void setFormLineDashEffect(DashPathEffect dashPathEffect) {
        this.mFormLineDashEffect = dashPathEffect;
    }

    public void setFormLineWidth(float f8) {
        this.mFormLineWidth = f8;
    }

    public void setFormSize(float f8) {
        this.mFormSize = f8;
    }

    public void setGradientColor(int i8, int i9) {
        this.mGradientColor = new w4.a(i8, i9);
    }

    public void setGradientColors(List<w4.a> list) {
        this.mGradientColors = list;
    }

    @Override // v4.e
    public void setHighlightEnabled(boolean z7) {
        this.mHighlightEnabled = z7;
    }

    @Override // v4.e
    public void setIconsOffset(com.github.mikephil.charting.utils.e eVar) {
        com.github.mikephil.charting.utils.e eVar2 = this.mIconsOffset;
        eVar2.f14114x = eVar.f14114x;
        eVar2.f14115y = eVar.f14115y;
    }

    @Override // v4.e
    public void setLabel(String str) {
        this.mLabel = str;
    }

    @Override // v4.e
    public void setValueFormatter(com.github.mikephil.charting.formatter.g gVar) {
        if (gVar == null) {
            return;
        }
        this.mValueFormatter = gVar;
    }

    @Override // v4.e
    public void setValueTextColor(int i8) {
        this.mValueColors.clear();
        this.mValueColors.add(Integer.valueOf(i8));
    }

    @Override // v4.e
    public void setValueTextColors(List<Integer> list) {
        this.mValueColors = list;
    }

    @Override // v4.e
    public void setValueTextSize(float f8) {
        this.mValueTextSize = com.github.mikephil.charting.utils.i.convertDpToPixel(f8);
    }

    @Override // v4.e
    public void setValueTypeface(Typeface typeface) {
        this.mValueTypeface = typeface;
    }

    @Override // v4.e
    public void setVisible(boolean z7) {
        this.mVisible = z7;
    }

    @Override // v4.e
    public int getColor(int i8) {
        List<Integer> list = this.mColors;
        return list.get(i8 % list.size()).intValue();
    }

    @Override // v4.e
    public w4.a getGradientColor(int i8) {
        List<w4.a> list = this.mGradientColors;
        return list.get(i8 % list.size());
    }

    @Override // v4.e
    public int getValueTextColor(int i8) {
        List<Integer> list = this.mValueColors;
        return list.get(i8 % list.size()).intValue();
    }

    public void setColors(int... iArr) {
        this.mColors = com.github.mikephil.charting.utils.a.createColors(iArr);
    }

    public void setColor(int i8, int i9) {
        setColor(Color.argb(i9, Color.red(i8), Color.green(i8), Color.blue(i8)));
    }

    public void setColors(int[] iArr, Context context) {
        if (this.mColors == null) {
            this.mColors = new ArrayList();
        }
        this.mColors.clear();
        for (int i8 : iArr) {
            this.mColors.add(Integer.valueOf(context.getResources().getColor(i8)));
        }
    }

    public void setColors(int[] iArr, int i8) {
        resetColors();
        for (int i9 : iArr) {
            addColor(Color.argb(i8, Color.red(i9), Color.green(i9), Color.blue(i9)));
        }
    }

    public e(String str) {
        this();
        this.mLabel = str;
    }
}
