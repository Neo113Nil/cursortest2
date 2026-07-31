package com.bytedance.adsdk.ugeno.zg;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes10.dex */
public abstract class fs {
    private DataSetObserver fs;
    private final DataSetObservable zmn = new DataSetObservable();

    public Parcelable fs() {
        return null;
    }

    public float zmn(int i) {
        return 1.0f;
    }

    public abstract int zmn();

    public int zmn(Object obj) {
        return -1;
    }

    public abstract boolean zmn(View view, Object obj);

    public Object zmn(ViewGroup viewGroup, int i) {
        return zmn((View) viewGroup, i);
    }

    public void zmn(ViewGroup viewGroup, int i, Object obj) {
        zmn((View) viewGroup, i, obj);
    }

    @Deprecated
    public Object zmn(View view, int i) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    @Deprecated
    public void zmn(View view, int i, Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    public void zn() {
        synchronized (this) {
            try {
                DataSetObserver dataSetObserver = this.fs;
                if (dataSetObserver != null) {
                    dataSetObserver.onChanged();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.zmn.notifyChanged();
    }

    void zmn(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.fs = dataSetObserver;
        }
    }
}
