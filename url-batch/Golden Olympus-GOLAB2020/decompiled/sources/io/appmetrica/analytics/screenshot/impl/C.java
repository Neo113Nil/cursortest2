package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class C implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new D((C3177x) parcel.readParcelable(C3177x.class.getClassLoader()), (F) parcel.readParcelable(F.class.getClassLoader()), (C3179z) parcel.readParcelable(C3179z.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i4) {
        return new D[i4];
    }
}
