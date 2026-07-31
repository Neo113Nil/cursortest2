package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class th0 implements Parcelable.Creator<sh0> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ sh0 createFromParcel(Parcel parcel) {
        int u6 = s3.b.u(parcel);
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        while (parcel.dataPosition() < u6) {
            int o7 = s3.b.o(parcel);
            int l7 = s3.b.l(o7);
            if (l7 == 1) {
                iBinder = s3.b.p(parcel, o7);
            } else if (l7 != 2) {
                s3.b.t(parcel, o7);
            } else {
                iBinder2 = s3.b.p(parcel, o7);
            }
        }
        s3.b.k(parcel, u6);
        return new sh0(iBinder, iBinder2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ sh0[] newArray(int i7) {
        return new sh0[i7];
    }
}
