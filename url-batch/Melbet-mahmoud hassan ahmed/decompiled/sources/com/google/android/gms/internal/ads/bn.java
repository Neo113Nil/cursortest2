package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
final class bn implements Parcelable.Creator<cn> {
    bn() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ cn createFromParcel(Parcel parcel) {
        return new cn(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ cn[] newArray(int i7) {
        return new cn[0];
    }
}
