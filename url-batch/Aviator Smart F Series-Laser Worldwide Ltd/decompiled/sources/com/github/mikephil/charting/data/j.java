package com.github.mikephil.charting.data;

import android.util.Log;
import com.github.mikephil.charting.charts.Chart;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class j extends c {
    private a mBarData;
    private g mBubbleData;
    private h mCandleData;
    private k mLineData;
    private p mScatterData;

    @Override // com.github.mikephil.charting.data.i
    public void calcMinMax() {
        if (this.mDataSets == null) {
            this.mDataSets = new ArrayList();
        }
        this.mDataSets.clear();
        this.mYMax = -3.4028235E38f;
        this.mYMin = Float.MAX_VALUE;
        this.mXMax = -3.4028235E38f;
        this.mXMin = Float.MAX_VALUE;
        this.mLeftAxisMax = -3.4028235E38f;
        this.mLeftAxisMin = Float.MAX_VALUE;
        this.mRightAxisMax = -3.4028235E38f;
        this.mRightAxisMin = Float.MAX_VALUE;
        for (c cVar : getAllData()) {
            cVar.calcMinMax();
            this.mDataSets.addAll(cVar.getDataSets());
            if (cVar.getYMax() > this.mYMax) {
                this.mYMax = cVar.getYMax();
            }
            if (cVar.getYMin() < this.mYMin) {
                this.mYMin = cVar.getYMin();
            }
            if (cVar.getXMax() > this.mXMax) {
                this.mXMax = cVar.getXMax();
            }
            if (cVar.getXMin() < this.mXMin) {
                this.mXMin = cVar.getXMin();
            }
            float f8 = cVar.mLeftAxisMax;
            if (f8 > this.mLeftAxisMax) {
                this.mLeftAxisMax = f8;
            }
            float f9 = cVar.mLeftAxisMin;
            if (f9 < this.mLeftAxisMin) {
                this.mLeftAxisMin = f9;
            }
            float f10 = cVar.mRightAxisMax;
            if (f10 > this.mRightAxisMax) {
                this.mRightAxisMax = f10;
            }
            float f11 = cVar.mRightAxisMin;
            if (f11 < this.mRightAxisMin) {
                this.mRightAxisMin = f11;
            }
        }
    }

    public List<c> getAllData() {
        ArrayList arrayList = new ArrayList();
        k kVar = this.mLineData;
        if (kVar != null) {
            arrayList.add(kVar);
        }
        a aVar = this.mBarData;
        if (aVar != null) {
            arrayList.add(aVar);
        }
        p pVar = this.mScatterData;
        if (pVar != null) {
            arrayList.add(pVar);
        }
        h hVar = this.mCandleData;
        if (hVar != null) {
            arrayList.add(hVar);
        }
        g gVar = this.mBubbleData;
        if (gVar != null) {
            arrayList.add(gVar);
        }
        return arrayList;
    }

    public a getBarData() {
        return this.mBarData;
    }

    public g getBubbleData() {
        return this.mBubbleData;
    }

    public h getCandleData() {
        return this.mCandleData;
    }

    public c getDataByIndex(int i8) {
        return getAllData().get(i8);
    }

    public int getDataIndex(i iVar) {
        return getAllData().indexOf(iVar);
    }

    public v4.b getDataSetByHighlight(com.github.mikephil.charting.highlight.d dVar) {
        if (dVar.getDataIndex() >= getAllData().size()) {
            return null;
        }
        c dataByIndex = getDataByIndex(dVar.getDataIndex());
        if (dVar.getDataSetIndex() >= dataByIndex.getDataSetCount()) {
            return null;
        }
        return (v4.b) dataByIndex.getDataSets().get(dVar.getDataSetIndex());
    }

    @Override // com.github.mikephil.charting.data.i
    public Entry getEntryForHighlight(com.github.mikephil.charting.highlight.d dVar) {
        if (dVar.getDataIndex() >= getAllData().size()) {
            return null;
        }
        c dataByIndex = getDataByIndex(dVar.getDataIndex());
        if (dVar.getDataSetIndex() >= dataByIndex.getDataSetCount()) {
            return null;
        }
        for (Entry entry : dataByIndex.getDataSetByIndex(dVar.getDataSetIndex()).getEntriesForXValue(dVar.getX())) {
            if (entry.getY() == dVar.getY() || Float.isNaN(dVar.getY())) {
                return entry;
            }
        }
        return null;
    }

    public k getLineData() {
        return this.mLineData;
    }

    public p getScatterData() {
        return this.mScatterData;
    }

    @Override // com.github.mikephil.charting.data.i
    public void notifyDataChanged() {
        k kVar = this.mLineData;
        if (kVar != null) {
            kVar.notifyDataChanged();
        }
        a aVar = this.mBarData;
        if (aVar != null) {
            aVar.notifyDataChanged();
        }
        h hVar = this.mCandleData;
        if (hVar != null) {
            hVar.notifyDataChanged();
        }
        p pVar = this.mScatterData;
        if (pVar != null) {
            pVar.notifyDataChanged();
        }
        g gVar = this.mBubbleData;
        if (gVar != null) {
            gVar.notifyDataChanged();
        }
        calcMinMax();
    }

    @Override // com.github.mikephil.charting.data.i
    @Deprecated
    public boolean removeEntry(Entry entry, int i8) {
        Log.e(Chart.LOG_TAG, "removeEntry(...) not supported for CombinedData");
        return false;
    }

    public void setData(k kVar) {
        this.mLineData = kVar;
        notifyDataChanged();
    }

    @Override // com.github.mikephil.charting.data.i
    public boolean removeDataSet(v4.b bVar) {
        Iterator<c> it = getAllData().iterator();
        boolean z7 = false;
        while (it.hasNext() && !(z7 = it.next().removeDataSet(bVar))) {
        }
        return z7;
    }

    @Override // com.github.mikephil.charting.data.i
    @Deprecated
    public boolean removeEntry(float f8, int i8) {
        Log.e(Chart.LOG_TAG, "removeEntry(...) not supported for CombinedData");
        return false;
    }

    public void setData(a aVar) {
        this.mBarData = aVar;
        notifyDataChanged();
    }

    public void setData(p pVar) {
        this.mScatterData = pVar;
        notifyDataChanged();
    }

    public void setData(h hVar) {
        this.mCandleData = hVar;
        notifyDataChanged();
    }

    @Override // com.github.mikephil.charting.data.i
    @Deprecated
    public boolean removeDataSet(int i8) {
        Log.e(Chart.LOG_TAG, "removeDataSet(int index) not supported for CombinedData");
        return false;
    }

    public void setData(g gVar) {
        this.mBubbleData = gVar;
        notifyDataChanged();
    }
}
