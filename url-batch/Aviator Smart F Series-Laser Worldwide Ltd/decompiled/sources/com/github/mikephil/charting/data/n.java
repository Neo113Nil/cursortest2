package com.github.mikephil.charting.data;

/* loaded from: classes3.dex */
public class n extends i {
    public n() {
    }

    public v4.i getDataSet() {
        return (v4.i) this.mDataSets.get(0);
    }

    @Override // com.github.mikephil.charting.data.i
    public Entry getEntryForHighlight(com.github.mikephil.charting.highlight.d dVar) {
        return getDataSet().getEntryForIndex((int) dVar.getX());
    }

    public float getYValueSum() {
        float f8 = 0.0f;
        for (int i8 = 0; i8 < getDataSet().getEntryCount(); i8++) {
            f8 += ((PieEntry) getDataSet().getEntryForIndex(i8)).getY();
        }
        return f8;
    }

    public void setDataSet(v4.i iVar) {
        this.mDataSets.clear();
        this.mDataSets.add(iVar);
        notifyDataChanged();
    }

    public n(v4.i iVar) {
        super(iVar);
    }

    @Override // com.github.mikephil.charting.data.i
    public v4.i getDataSetByIndex(int i8) {
        if (i8 == 0) {
            return getDataSet();
        }
        return null;
    }

    @Override // com.github.mikephil.charting.data.i
    public v4.i getDataSetByLabel(String str, boolean z7) {
        if (z7) {
            if (str.equalsIgnoreCase(((v4.i) this.mDataSets.get(0)).getLabel())) {
                return (v4.i) this.mDataSets.get(0);
            }
            return null;
        }
        if (str.equals(((v4.i) this.mDataSets.get(0)).getLabel())) {
            return (v4.i) this.mDataSets.get(0);
        }
        return null;
    }
}
