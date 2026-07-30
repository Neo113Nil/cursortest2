package com.github.mikephil.charting.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class DataSet extends e {
    protected List<Entry> mValues;
    protected float mXMax;
    protected float mXMin;
    protected float mYMax;
    protected float mYMin;

    public enum Rounding {
        UP,
        DOWN,
        CLOSEST
    }

    public DataSet(List<Entry> list, String str) {
        super(str);
        this.mYMax = -3.4028235E38f;
        this.mYMin = Float.MAX_VALUE;
        this.mXMax = -3.4028235E38f;
        this.mXMin = Float.MAX_VALUE;
        this.mValues = list;
        if (list == null) {
            this.mValues = new ArrayList();
        }
        calcMinMax();
    }

    @Override // com.github.mikephil.charting.data.e, v4.e
    public boolean addEntry(Entry entry) {
        if (entry == null) {
            return false;
        }
        List<Entry> values = getValues();
        if (values == null) {
            values = new ArrayList<>();
        }
        calcMinMax(entry);
        return values.add(entry);
    }

    @Override // com.github.mikephil.charting.data.e, v4.e
    public void addEntryOrdered(Entry entry) {
        if (entry == null) {
            return;
        }
        if (this.mValues == null) {
            this.mValues = new ArrayList();
        }
        calcMinMax(entry);
        if (this.mValues.size() > 0) {
            if (this.mValues.get(r0.size() - 1).getX() > entry.getX()) {
                this.mValues.add(getEntryIndex(entry.getX(), entry.getY(), Rounding.UP), entry);
                return;
            }
        }
        this.mValues.add(entry);
    }

    @Override // com.github.mikephil.charting.data.e, v4.e
    public void calcMinMax() {
        List<Entry> list = this.mValues;
        if (list == null || list.isEmpty()) {
            return;
        }
        this.mYMax = -3.4028235E38f;
        this.mYMin = Float.MAX_VALUE;
        this.mXMax = -3.4028235E38f;
        this.mXMin = Float.MAX_VALUE;
        Iterator<Entry> it = this.mValues.iterator();
        while (it.hasNext()) {
            calcMinMax(it.next());
        }
    }

    protected void calcMinMaxX(Entry entry) {
        if (entry.getX() < this.mXMin) {
            this.mXMin = entry.getX();
        }
        if (entry.getX() > this.mXMax) {
            this.mXMax = entry.getX();
        }
    }

    @Override // com.github.mikephil.charting.data.e, v4.e
    public void calcMinMaxY(float f8, float f9) {
        List<Entry> list = this.mValues;
        if (list == null || list.isEmpty()) {
            return;
        }
        this.mYMax = -3.4028235E38f;
        this.mYMin = Float.MAX_VALUE;
        int entryIndex = getEntryIndex(f9, Float.NaN, Rounding.UP);
        for (int entryIndex2 = getEntryIndex(f8, Float.NaN, Rounding.DOWN); entryIndex2 <= entryIndex; entryIndex2++) {
            calcMinMaxY(this.mValues.get(entryIndex2));
        }
    }

    @Override // com.github.mikephil.charting.data.e, v4.e
    public void clear() {
        this.mValues.clear();
        notifyDataSetChanged();
    }

    public abstract DataSet copy();

    protected void copy(DataSet dataSet) {
        super.copy((e) dataSet);
    }

    @Override // com.github.mikephil.charting.data.e, v4.e
    public List<Entry> getEntriesForXValue(float f8) {
        ArrayList arrayList = new ArrayList();
        int size = this.mValues.size() - 1;
        int i8 = 0;
        while (true) {
            if (i8 > size) {
                break;
            }
            int i9 = (size + i8) / 2;
            Entry entry = this.mValues.get(i9);
            if (f8 == entry.getX()) {
                while (i9 > 0 && this.mValues.get(i9 - 1).getX() == f8) {
                    i9--;
                }
                int size2 = this.mValues.size();
                while (i9 < size2) {
                    Entry entry2 = this.mValues.get(i9);
                    if (entry2.getX() != f8) {
                        break;
                    }
                    arrayList.add(entry2);
                    i9++;
                }
            } else if (f8 > entry.getX()) {
                i8 = i9 + 1;
            } else {
                size = i9 - 1;
            }
        }
        return arrayList;
    }

    @Override // com.github.mikephil.charting.data.e, v4.e
    public int getEntryCount() {
        return this.mValues.size();
    }

    @Override // com.github.mikephil.charting.data.e, v4.e
    public Entry getEntryForIndex(int i8) {
        return this.mValues.get(i8);
    }

    @Override // com.github.mikephil.charting.data.e, v4.e
    public Entry getEntryForXValue(float f8, float f9, Rounding rounding) {
        int entryIndex = getEntryIndex(f8, f9, rounding);
        if (entryIndex > -1) {
            return this.mValues.get(entryIndex);
        }
        return null;
    }

    @Override // com.github.mikephil.charting.data.e, v4.e
    public int getEntryIndex(Entry entry) {
        return this.mValues.indexOf(entry);
    }

    public List<Entry> getValues() {
        return this.mValues;
    }

    @Override // com.github.mikephil.charting.data.e, v4.e
    public float getXMax() {
        return this.mXMax;
    }

    @Override // com.github.mikephil.charting.data.e, v4.e
    public float getXMin() {
        return this.mXMin;
    }

    @Override // com.github.mikephil.charting.data.e, v4.e
    public float getYMax() {
        return this.mYMax;
    }

    @Override // com.github.mikephil.charting.data.e, v4.e
    public float getYMin() {
        return this.mYMin;
    }

    @Override // com.github.mikephil.charting.data.e, v4.e
    public boolean removeEntry(Entry entry) {
        List<Entry> list;
        if (entry == null || (list = this.mValues) == null) {
            return false;
        }
        boolean remove = list.remove(entry);
        if (remove) {
            calcMinMax();
        }
        return remove;
    }

    public void setValues(List<Entry> list) {
        this.mValues = list;
        notifyDataSetChanged();
    }

    public String toSimpleString() {
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder sb = new StringBuilder();
        sb.append("DataSet, label: ");
        sb.append(getLabel() == null ? "" : getLabel());
        sb.append(", entries: ");
        sb.append(this.mValues.size());
        sb.append("\n");
        stringBuffer.append(sb.toString());
        return stringBuffer.toString();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(toSimpleString());
        for (int i8 = 0; i8 < this.mValues.size(); i8++) {
            stringBuffer.append(this.mValues.get(i8).toString() + cn.hutool.core.text.l.SPACE);
        }
        return stringBuffer.toString();
    }

    @Override // com.github.mikephil.charting.data.e, v4.e
    public int getEntryIndex(float f8, float f9, Rounding rounding) {
        int i8;
        Entry entry;
        List<Entry> list = this.mValues;
        if (list == null || list.isEmpty()) {
            return -1;
        }
        int size = this.mValues.size() - 1;
        int i9 = 0;
        while (i9 < size) {
            int i10 = (i9 + size) / 2;
            float x7 = this.mValues.get(i10).getX() - f8;
            int i11 = i10 + 1;
            float x8 = this.mValues.get(i11).getX() - f8;
            float abs = Math.abs(x7);
            float abs2 = Math.abs(x8);
            if (abs2 >= abs) {
                if (abs >= abs2) {
                    double d8 = x7;
                    if (d8 < com.github.mikephil.charting.utils.i.DOUBLE_EPSILON) {
                        if (d8 < com.github.mikephil.charting.utils.i.DOUBLE_EPSILON) {
                        }
                    }
                }
                size = i10;
            }
            i9 = i11;
        }
        if (size == -1) {
            return size;
        }
        float x9 = this.mValues.get(size).getX();
        if (rounding == Rounding.UP) {
            if (x9 < f8 && size < this.mValues.size() - 1) {
                size++;
            }
        } else if (rounding == Rounding.DOWN && x9 > f8 && size > 0) {
            size--;
        }
        if (Float.isNaN(f9)) {
            return size;
        }
        while (size > 0 && this.mValues.get(size - 1).getX() == x9) {
            size--;
        }
        float y7 = this.mValues.get(size).getY();
        loop2: while (true) {
            i8 = size;
            do {
                size++;
                if (size >= this.mValues.size()) {
                    break loop2;
                }
                entry = this.mValues.get(size);
                if (entry.getX() != x9) {
                    break loop2;
                }
            } while (Math.abs(entry.getY() - f9) >= Math.abs(y7 - f9));
            y7 = f9;
        }
        return i8;
    }

    @Override // com.github.mikephil.charting.data.e, v4.e
    public Entry getEntryForXValue(float f8, float f9) {
        return getEntryForXValue(f8, f9, Rounding.CLOSEST);
    }

    protected void calcMinMax(Entry entry) {
        if (entry == null) {
            return;
        }
        calcMinMaxX(entry);
        calcMinMaxY(entry);
    }

    protected void calcMinMaxY(Entry entry) {
        if (entry.getY() < this.mYMin) {
            this.mYMin = entry.getY();
        }
        if (entry.getY() > this.mYMax) {
            this.mYMax = entry.getY();
        }
    }
}
