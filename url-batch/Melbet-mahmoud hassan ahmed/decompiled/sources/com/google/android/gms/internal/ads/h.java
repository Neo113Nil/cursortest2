package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
final class h implements Parcelable.Creator<j> {
    h() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ j createFromParcel(Parcel parcel) {
        return new j(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ j[] newArray(int i7) {
        return new j[i7];
    }
}
