package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
final class f implements Parcelable.Creator<g> {
    f() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ g createFromParcel(Parcel parcel) {
        return new g(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ g[] newArray(int i7) {
        return new g[i7];
    }
}
