package com.github.mikephil.charting.data;

import android.graphics.Typeface;
import android.util.Log;
import com.github.mikephil.charting.components.YAxis;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class i {
    protected List<v4.e> mDataSets;
    protected float mLeftAxisMax;
    protected float mLeftAxisMin;
    protected float mRightAxisMax;
    protected float mRightAxisMin;
    protected float mXMax;
    protected float mXMin;
    protected float mYMax;
    protected float mYMin;

    public i() {
        this.mYMax = -3.4028235E38f;
        this.mYMin = Float.MAX_VALUE;
        this.mXMax = -3.4028235E38f;
        this.mXMin = Float.MAX_VALUE;
        this.mLeftAxisMax = -3.4028235E38f;
        this.mLeftAxisMin = Float.MAX_VALUE;
        this.mRightAxisMax = -3.4028235E38f;
        this.mRightAxisMin = Float.MAX_VALUE;
        this.mDataSets = new ArrayList();
    }

    private List<v4.e> arrayToList(v4.e[] eVarArr) {
        ArrayList arrayList = new ArrayList();
        for (v4.e eVar : eVarArr) {
            arrayList.add(eVar);
        }
        return arrayList;
    }

    public void addDataSet(v4.e eVar) {
        if (eVar == null) {
            return;
        }
        calcMinMax(eVar);
        this.mDataSets.add(eVar);
    }

    public void addEntry(Entry entry, int i8) {
        if (this.mDataSets.size() <= i8 || i8 < 0) {
            Log.e("addEntry", "Cannot add Entry because dataSetIndex too high or too low.");
            return;
        }
        v4.e eVar = this.mDataSets.get(i8);
        if (eVar.addEntry(entry)) {
            calcMinMax(entry, eVar.getAxisDependency());
        }
    }

    protected void calcMinMax() {
        List<v4.e> list = this.mDataSets;
        if (list == null) {
            return;
        }
        this.mYMax = -3.4028235E38f;
        this.mYMin = Float.MAX_VALUE;
        this.mXMax = -3.4028235E38f;
        this.mXMin = Float.MAX_VALUE;
        Iterator<v4.e> it = list.iterator();
        while (it.hasNext()) {
            calcMinMax(it.next());
        }
        this.mLeftAxisMax = -3.4028235E38f;
        this.mLeftAxisMin = Float.MAX_VALUE;
        this.mRightAxisMax = -3.4028235E38f;
        this.mRightAxisMin = Float.MAX_VALUE;
        v4.e firstLeft = getFirstLeft(this.mDataSets);
        if (firstLeft != null) {
            this.mLeftAxisMax = firstLeft.getYMax();
            this.mLeftAxisMin = firstLeft.getYMin();
            for (v4.e eVar : this.mDataSets) {
                if (eVar.getAxisDependency() == YAxis.AxisDependency.LEFT) {
                    if (eVar.getYMin() < this.mLeftAxisMin) {
                        this.mLeftAxisMin = eVar.getYMin();
                    }
                    if (eVar.getYMax() > this.mLeftAxisMax) {
                        this.mLeftAxisMax = eVar.getYMax();
                    }
                }
            }
        }
        v4.e firstRight = getFirstRight(this.mDataSets);
        if (firstRight != null) {
            this.mRightAxisMax = firstRight.getYMax();
            this.mRightAxisMin = firstRight.getYMin();
            for (v4.e eVar2 : this.mDataSets) {
                if (eVar2.getAxisDependency() == YAxis.AxisDependency.RIGHT) {
                    if (eVar2.getYMin() < this.mRightAxisMin) {
                        this.mRightAxisMin = eVar2.getYMin();
                    }
                    if (eVar2.getYMax() > this.mRightAxisMax) {
                        this.mRightAxisMax = eVar2.getYMax();
                    }
                }
            }
        }
    }

    public void calcMinMaxY(float f8, float f9) {
        Iterator<v4.e> it = this.mDataSets.iterator();
        while (it.hasNext()) {
            it.next().calcMinMaxY(f8, f9);
        }
        calcMinMax();
    }

    public void clearValues() {
        List<v4.e> list = this.mDataSets;
        if (list != null) {
            list.clear();
        }
        notifyDataChanged();
    }

    public boolean contains(v4.e eVar) {
        Iterator<v4.e> it = this.mDataSets.iterator();
        while (it.hasNext()) {
            if (it.next().equals(eVar)) {
                return true;
            }
        }
        return false;
    }

    public int[] getColors() {
        if (this.mDataSets == null) {
            return null;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.mDataSets.size(); i9++) {
            i8 += this.mDataSets.get(i9).getColors().size();
        }
        int[] iArr = new int[i8];
        int i10 = 0;
        for (int i11 = 0; i11 < this.mDataSets.size(); i11++) {
            Iterator<Integer> it = this.mDataSets.get(i11).getColors().iterator();
            while (it.hasNext()) {
                iArr[i10] = it.next().intValue();
                i10++;
            }
        }
        return iArr;
    }

    public v4.e getDataSetByIndex(int i8) {
        List<v4.e> list = this.mDataSets;
        if (list == null || i8 < 0 || i8 >= list.size()) {
            return null;
        }
        return this.mDataSets.get(i8);
    }

    public v4.e getDataSetByLabel(String str, boolean z7) {
        int dataSetIndexByLabel = getDataSetIndexByLabel(this.mDataSets, str, z7);
        if (dataSetIndexByLabel < 0 || dataSetIndexByLabel >= this.mDataSets.size()) {
            return null;
        }
        return this.mDataSets.get(dataSetIndexByLabel);
    }

    public int getDataSetCount() {
        List<v4.e> list = this.mDataSets;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public v4.e getDataSetForEntry(Entry entry) {
        if (entry == null) {
            return null;
        }
        for (int i8 = 0; i8 < this.mDataSets.size(); i8++) {
            v4.e eVar = this.mDataSets.get(i8);
            for (int i9 = 0; i9 < eVar.getEntryCount(); i9++) {
                if (entry.equalTo(eVar.getEntryForXValue(entry.getX(), entry.getY()))) {
                    return eVar;
                }
            }
        }
        return null;
    }

    protected int getDataSetIndexByLabel(List<v4.e> list, String str, boolean z7) {
        int i8 = 0;
        if (z7) {
            while (i8 < list.size()) {
                if (str.equalsIgnoreCase(list.get(i8).getLabel())) {
                    return i8;
                }
                i8++;
            }
            return -1;
        }
        while (i8 < list.size()) {
            if (str.equals(list.get(i8).getLabel())) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    public String[] getDataSetLabels() {
        String[] strArr = new String[this.mDataSets.size()];
        for (int i8 = 0; i8 < this.mDataSets.size(); i8++) {
            strArr[i8] = this.mDataSets.get(i8).getLabel();
        }
        return strArr;
    }

    public List<v4.e> getDataSets() {
        return this.mDataSets;
    }

    public int getEntryCount() {
        Iterator<v4.e> it = this.mDataSets.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            i8 += it.next().getEntryCount();
        }
        return i8;
    }

    public Entry getEntryForHighlight(com.github.mikephil.charting.highlight.d dVar) {
        if (dVar.getDataSetIndex() >= this.mDataSets.size()) {
            return null;
        }
        return this.mDataSets.get(dVar.getDataSetIndex()).getEntryForXValue(dVar.getX(), dVar.getY());
    }

    protected v4.e getFirstLeft(List<v4.e> list) {
        for (v4.e eVar : list) {
            if (eVar.getAxisDependency() == YAxis.AxisDependency.LEFT) {
                return eVar;
            }
        }
        return null;
    }

    public v4.e getFirstRight(List<v4.e> list) {
        for (v4.e eVar : list) {
            if (eVar.getAxisDependency() == YAxis.AxisDependency.RIGHT) {
                return eVar;
            }
        }
        return null;
    }

    public int getIndexOfDataSet(v4.e eVar) {
        return this.mDataSets.indexOf(eVar);
    }

    public v4.e getMaxEntryCountSet() {
        List<v4.e> list = this.mDataSets;
        if (list == null || list.isEmpty()) {
            return null;
        }
        v4.e eVar = this.mDataSets.get(0);
        for (v4.e eVar2 : this.mDataSets) {
            if (eVar2.getEntryCount() > eVar.getEntryCount()) {
                eVar = eVar2;
            }
        }
        return eVar;
    }

    public float getXMax() {
        return this.mXMax;
    }

    public float getXMin() {
        return this.mXMin;
    }

    public float getYMax() {
        return this.mYMax;
    }

    public float getYMin() {
        return this.mYMin;
    }

    public boolean isHighlightEnabled() {
        Iterator<v4.e> it = this.mDataSets.iterator();
        while (it.hasNext()) {
            if (!it.next().isHighlightEnabled()) {
                return false;
            }
        }
        return true;
    }

    public void notifyDataChanged() {
        calcMinMax();
    }

    public boolean removeDataSet(v4.e eVar) {
        if (eVar == null) {
            return false;
        }
        boolean remove = this.mDataSets.remove(eVar);
        if (remove) {
            calcMinMax();
        }
        return remove;
    }

    public boolean removeEntry(Entry entry, int i8) {
        v4.e eVar;
        if (entry == null || i8 >= this.mDataSets.size() || (eVar = this.mDataSets.get(i8)) == null) {
            return false;
        }
        boolean removeEntry = eVar.removeEntry(entry);
        if (removeEntry) {
            calcMinMax();
        }
        return removeEntry;
    }

    public void setDrawValues(boolean z7) {
        Iterator<v4.e> it = this.mDataSets.iterator();
        while (it.hasNext()) {
            it.next().setDrawValues(z7);
        }
    }

    public void setHighlightEnabled(boolean z7) {
        Iterator<v4.e> it = this.mDataSets.iterator();
        while (it.hasNext()) {
            it.next().setHighlightEnabled(z7);
        }
    }

    public void setValueFormatter(com.github.mikephil.charting.formatter.g gVar) {
        if (gVar == null) {
            return;
        }
        Iterator<v4.e> it = this.mDataSets.iterator();
        while (it.hasNext()) {
            it.next().setValueFormatter(gVar);
        }
    }

    public void setValueTextColor(int i8) {
        Iterator<v4.e> it = this.mDataSets.iterator();
        while (it.hasNext()) {
            it.next().setValueTextColor(i8);
        }
    }

    public void setValueTextColors(List<Integer> list) {
        Iterator<v4.e> it = this.mDataSets.iterator();
        while (it.hasNext()) {
            it.next().setValueTextColors(list);
        }
    }

    public void setValueTextSize(float f8) {
        Iterator<v4.e> it = this.mDataSets.iterator();
        while (it.hasNext()) {
            it.next().setValueTextSize(f8);
        }
    }

    public void setValueTypeface(Typeface typeface) {
        Iterator<v4.e> it = this.mDataSets.iterator();
        while (it.hasNext()) {
            it.next().setValueTypeface(typeface);
        }
    }

    public float getYMax(YAxis.AxisDependency axisDependency) {
        if (axisDependency == YAxis.AxisDependency.LEFT) {
            float f8 = this.mLeftAxisMax;
            return f8 == -3.4028235E38f ? this.mRightAxisMax : f8;
        }
        float f9 = this.mRightAxisMax;
        return f9 == -3.4028235E38f ? this.mLeftAxisMax : f9;
    }

    public float getYMin(YAxis.AxisDependency axisDependency) {
        if (axisDependency == YAxis.AxisDependency.LEFT) {
            float f8 = this.mLeftAxisMin;
            return f8 == Float.MAX_VALUE ? this.mRightAxisMin : f8;
        }
        float f9 = this.mRightAxisMin;
        return f9 == Float.MAX_VALUE ? this.mLeftAxisMin : f9;
    }

    public i(v4.e... eVarArr) {
        this.mYMax = -3.4028235E38f;
        this.mYMin = Float.MAX_VALUE;
        this.mXMax = -3.4028235E38f;
        this.mXMin = Float.MAX_VALUE;
        this.mLeftAxisMax = -3.4028235E38f;
        this.mLeftAxisMin = Float.MAX_VALUE;
        this.mRightAxisMax = -3.4028235E38f;
        this.mRightAxisMin = Float.MAX_VALUE;
        this.mDataSets = arrayToList(eVarArr);
        notifyDataChanged();
    }

    public boolean removeDataSet(int i8) {
        if (i8 >= this.mDataSets.size() || i8 < 0) {
            return false;
        }
        return removeDataSet(this.mDataSets.get(i8));
    }

    public boolean removeEntry(float f8, int i8) {
        Entry entryForXValue;
        if (i8 < this.mDataSets.size() && (entryForXValue = this.mDataSets.get(i8).getEntryForXValue(f8, Float.NaN)) != null) {
            return removeEntry(entryForXValue, i8);
        }
        return false;
    }

    public i(List<v4.e> list) {
        this.mYMax = -3.4028235E38f;
        this.mYMin = Float.MAX_VALUE;
        this.mXMax = -3.4028235E38f;
        this.mXMin = Float.MAX_VALUE;
        this.mLeftAxisMax = -3.4028235E38f;
        this.mLeftAxisMin = Float.MAX_VALUE;
        this.mRightAxisMax = -3.4028235E38f;
        this.mRightAxisMin = Float.MAX_VALUE;
        this.mDataSets = list;
        notifyDataChanged();
    }

    protected void calcMinMax(Entry entry, YAxis.AxisDependency axisDependency) {
        if (this.mYMax < entry.getY()) {
            this.mYMax = entry.getY();
        }
        if (this.mYMin > entry.getY()) {
            this.mYMin = entry.getY();
        }
        if (this.mXMax < entry.getX()) {
            this.mXMax = entry.getX();
        }
        if (this.mXMin > entry.getX()) {
            this.mXMin = entry.getX();
        }
        if (axisDependency == YAxis.AxisDependency.LEFT) {
            if (this.mLeftAxisMax < entry.getY()) {
                this.mLeftAxisMax = entry.getY();
            }
            if (this.mLeftAxisMin > entry.getY()) {
                this.mLeftAxisMin = entry.getY();
                return;
            }
            return;
        }
        if (this.mRightAxisMax < entry.getY()) {
            this.mRightAxisMax = entry.getY();
        }
        if (this.mRightAxisMin > entry.getY()) {
            this.mRightAxisMin = entry.getY();
        }
    }

    protected void calcMinMax(v4.e eVar) {
        if (this.mYMax < eVar.getYMax()) {
            this.mYMax = eVar.getYMax();
        }
        if (this.mYMin > eVar.getYMin()) {
            this.mYMin = eVar.getYMin();
        }
        if (this.mXMax < eVar.getXMax()) {
            this.mXMax = eVar.getXMax();
        }
        if (this.mXMin > eVar.getXMin()) {
            this.mXMin = eVar.getXMin();
        }
        if (eVar.getAxisDependency() == YAxis.AxisDependency.LEFT) {
            if (this.mLeftAxisMax < eVar.getYMax()) {
                this.mLeftAxisMax = eVar.getYMax();
            }
            if (this.mLeftAxisMin > eVar.getYMin()) {
                this.mLeftAxisMin = eVar.getYMin();
                return;
            }
            return;
        }
        if (this.mRightAxisMax < eVar.getYMax()) {
            this.mRightAxisMax = eVar.getYMax();
        }
        if (this.mRightAxisMin > eVar.getYMin()) {
            this.mRightAxisMin = eVar.getYMin();
        }
    }
}
