package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
final class n implements Parcelable.Creator<p> {
    n() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ p createFromParcel(Parcel parcel) {
        return new p(parcel, (o) null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ p[] newArray(int i7) {
        return new p[i7];
    }
}
