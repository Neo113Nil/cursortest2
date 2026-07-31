package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class qo0 implements Parcelable.Creator<po0> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ po0 createFromParcel(Parcel parcel) {
        int u6 = s3.b.u(parcel);
        String str = null;
        int i7 = 0;
        int i8 = 0;
        boolean z6 = false;
        boolean z7 = false;
        while (parcel.dataPosition() < u6) {
            int o7 = s3.b.o(parcel);
            int l7 = s3.b.l(o7);
            if (l7 == 2) {
                str = s3.b.f(parcel, o7);
            } else if (l7 == 3) {
                i7 = s3.b.q(parcel, o7);
            } else if (l7 == 4) {
                i8 = s3.b.q(parcel, o7);
            } else if (l7 == 5) {
                z6 = s3.b.m(parcel, o7);
            } else if (l7 != 6) {
                s3.b.t(parcel, o7);
            } else {
                z7 = s3.b.m(parcel, o7);
            }
        }
        s3.b.k(parcel, u6);
        return new po0(str, i7, i8, z6, z7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ po0[] newArray(int i7) {
        return new po0[i7];
    }
}
