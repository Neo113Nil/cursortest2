package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
final class kj implements Parcelable.Creator<mj> {
    kj() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ mj createFromParcel(Parcel parcel) {
        return new mj(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ mj[] newArray(int i7) {
        return new mj[0];
    }
}
