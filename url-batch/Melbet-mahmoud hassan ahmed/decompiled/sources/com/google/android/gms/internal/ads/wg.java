package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
final class wg implements Parcelable.Creator<xg> {
    wg() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ xg createFromParcel(Parcel parcel) {
        return new xg(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ xg[] newArray(int i7) {
        return new xg[i7];
    }
}
