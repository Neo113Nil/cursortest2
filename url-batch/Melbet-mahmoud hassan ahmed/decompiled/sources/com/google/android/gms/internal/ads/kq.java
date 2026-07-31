package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class kq implements Parcelable.Creator<jq> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ jq createFromParcel(Parcel parcel) {
        int u6 = s3.b.u(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        long j7 = 0;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        while (parcel.dataPosition() < u6) {
            int o7 = s3.b.o(parcel);
            int l7 = s3.b.l(o7);
            if (l7 == 2) {
                parcelFileDescriptor = (ParcelFileDescriptor) s3.b.e(parcel, o7, ParcelFileDescriptor.CREATOR);
            } else if (l7 == 3) {
                z6 = s3.b.m(parcel, o7);
            } else if (l7 == 4) {
                z7 = s3.b.m(parcel, o7);
            } else if (l7 == 5) {
                j7 = s3.b.r(parcel, o7);
            } else if (l7 != 6) {
                s3.b.t(parcel, o7);
            } else {
                z8 = s3.b.m(parcel, o7);
            }
        }
        s3.b.k(parcel, u6);
        return new jq(parcelFileDescriptor, z6, z7, j7, z8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ jq[] newArray(int i7) {
        return new jq[i7];
    }
}
