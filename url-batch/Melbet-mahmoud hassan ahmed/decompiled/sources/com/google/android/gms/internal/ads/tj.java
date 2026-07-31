package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
final class tj implements Parcelable.Creator<uj> {
    tj() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ uj createFromParcel(Parcel parcel) {
        return new uj(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ uj[] newArray(int i7) {
        return new uj[i7];
    }
}
