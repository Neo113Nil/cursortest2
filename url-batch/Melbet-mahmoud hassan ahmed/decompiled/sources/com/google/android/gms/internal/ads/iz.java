package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class iz implements Parcelable.Creator<hz> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ hz createFromParcel(Parcel parcel) {
        int u6 = s3.b.u(parcel);
        int i7 = 0;
        while (parcel.dataPosition() < u6) {
            int o7 = s3.b.o(parcel);
            if (s3.b.l(o7) != 2) {
                s3.b.t(parcel, o7);
            } else {
                i7 = s3.b.q(parcel, o7);
            }
        }
        s3.b.k(parcel, u6);
        return new hz(i7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ hz[] newArray(int i7) {
        return new hz[i7];
    }
}
