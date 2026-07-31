package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class ui0 implements Parcelable.Creator<ti0> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ti0 createFromParcel(Parcel parcel) {
        int u6 = s3.b.u(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < u6) {
            int o7 = s3.b.o(parcel);
            if (s3.b.l(o7) != 2) {
                s3.b.t(parcel, o7);
            } else {
                parcelFileDescriptor = (ParcelFileDescriptor) s3.b.e(parcel, o7, ParcelFileDescriptor.CREATOR);
            }
        }
        s3.b.k(parcel, u6);
        return new ti0(parcelFileDescriptor);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ti0[] newArray(int i7) {
        return new ti0[i7];
    }
}
