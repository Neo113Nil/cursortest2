package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
final class nj implements Parcelable.Creator<oj> {
    nj() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ oj createFromParcel(Parcel parcel) {
        return new oj(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ oj[] newArray(int i7) {
        return new oj[i7];
    }
}
