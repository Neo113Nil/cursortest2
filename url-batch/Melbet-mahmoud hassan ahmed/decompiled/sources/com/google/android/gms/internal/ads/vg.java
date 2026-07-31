package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
final class vg implements Parcelable.Creator<yg> {
    vg() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ yg createFromParcel(Parcel parcel) {
        return new yg(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ yg[] newArray(int i7) {
        return new yg[i7];
    }
}
