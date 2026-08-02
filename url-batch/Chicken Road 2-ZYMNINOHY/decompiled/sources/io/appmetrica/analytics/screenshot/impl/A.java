package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes.dex */
public final class A implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z = parcel.readByte() != 0;
        List createStringArrayList = parcel.createStringArrayList();
        if (createStringArrayList == null) {
            createStringArrayList = d3.q.f8333a;
        }
        return new B(z, createStringArrayList, parcel.readLong());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i4) {
        return new B[i4];
    }
}
