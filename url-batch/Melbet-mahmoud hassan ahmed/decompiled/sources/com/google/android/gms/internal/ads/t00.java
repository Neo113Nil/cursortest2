package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class t00 implements Parcelable.Creator<s00> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ s00 createFromParcel(Parcel parcel) {
        int u6 = s3.b.u(parcel);
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        while (parcel.dataPosition() < u6) {
            int o7 = s3.b.o(parcel);
            int l7 = s3.b.l(o7);
            if (l7 == 2) {
                z6 = s3.b.m(parcel, o7);
            } else if (l7 == 3) {
                z7 = s3.b.m(parcel, o7);
            } else if (l7 != 4) {
                s3.b.t(parcel, o7);
            } else {
                z8 = s3.b.m(parcel, o7);
            }
        }
        s3.b.k(parcel, u6);
        return new s00(z6, z7, z8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ s00[] newArray(int i7) {
        return new s00[i7];
    }
}
