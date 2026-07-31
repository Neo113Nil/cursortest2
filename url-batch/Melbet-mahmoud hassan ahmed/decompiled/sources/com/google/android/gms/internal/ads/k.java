package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
final class k implements Parcelable.Creator<m> {
    k() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ m createFromParcel(Parcel parcel) {
        return new m(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ m[] newArray(int i7) {
        return new m[i7];
    }
}
