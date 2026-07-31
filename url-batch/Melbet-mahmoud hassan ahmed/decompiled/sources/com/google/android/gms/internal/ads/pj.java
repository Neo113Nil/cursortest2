package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
final class pj implements Parcelable.Creator<qj> {
    pj() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ qj createFromParcel(Parcel parcel) {
        return new qj(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ qj[] newArray(int i7) {
        return new qj[i7];
    }
}
