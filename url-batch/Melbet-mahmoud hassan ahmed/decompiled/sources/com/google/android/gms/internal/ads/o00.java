package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class o00 implements Parcelable.Creator<n00> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ n00 createFromParcel(Parcel parcel) {
        int u6 = s3.b.u(parcel);
        int i7 = 0;
        int i8 = 0;
        while (parcel.dataPosition() < u6) {
            int o7 = s3.b.o(parcel);
            int l7 = s3.b.l(o7);
            if (l7 == 1) {
                i7 = s3.b.q(parcel, o7);
            } else if (l7 != 2) {
                s3.b.t(parcel, o7);
            } else {
                i8 = s3.b.q(parcel, o7);
            }
        }
        s3.b.k(parcel, u6);
        return new n00(i7, i8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ n00[] newArray(int i7) {
        return new n00[i7];
    }
}
