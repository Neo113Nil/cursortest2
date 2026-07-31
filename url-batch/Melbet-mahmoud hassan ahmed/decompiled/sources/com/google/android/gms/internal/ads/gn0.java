package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class gn0 implements Parcelable.Creator<fn0> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ fn0 createFromParcel(Parcel parcel) {
        int u6 = s3.b.u(parcel);
        String str = null;
        String str2 = null;
        pv pvVar = null;
        kv kvVar = null;
        while (parcel.dataPosition() < u6) {
            int o7 = s3.b.o(parcel);
            int l7 = s3.b.l(o7);
            if (l7 == 1) {
                str = s3.b.f(parcel, o7);
            } else if (l7 == 2) {
                str2 = s3.b.f(parcel, o7);
            } else if (l7 == 3) {
                pvVar = (pv) s3.b.e(parcel, o7, pv.CREATOR);
            } else if (l7 != 4) {
                s3.b.t(parcel, o7);
            } else {
                kvVar = (kv) s3.b.e(parcel, o7, kv.CREATOR);
            }
        }
        s3.b.k(parcel, u6);
        return new fn0(str, str2, pvVar, kvVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ fn0[] newArray(int i7) {
        return new fn0[i7];
    }
}
