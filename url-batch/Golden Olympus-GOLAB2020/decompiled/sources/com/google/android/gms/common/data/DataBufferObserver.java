package com.google.android.gms.common.data;

/* loaded from: classes.dex */
public interface DataBufferObserver {

    public interface Observable {
        void addObserver(DataBufferObserver dataBufferObserver);

        void removeObserver(DataBufferObserver dataBufferObserver);
    }

    void onDataChanged();

    void onDataRangeChanged(int i4, int i5);

    void onDataRangeInserted(int i4, int i5);

    void onDataRangeMoved(int i4, int i5, int i6);

    void onDataRangeRemoved(int i4, int i5);
}
