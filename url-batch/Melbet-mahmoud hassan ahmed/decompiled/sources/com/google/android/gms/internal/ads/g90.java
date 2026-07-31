package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class g90 implements Parcelable.Creator<f90> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ f90 createFromParcel(Parcel parcel) {
        int u6 = s3.b.u(parcel);
        boolean z6 = false;
        String str = null;
        String str2 = null;
        int i7 = 0;
        while (parcel.dataPosition() < u6) {
            int o7 = s3.b.o(parcel);
            int l7 = s3.b.l(o7);
            if (l7 == 1) {
                str = s3.b.f(parcel, o7);
            } else if (l7 == 2) {
                z6 = s3.b.m(parcel, o7);
            } else if (l7 == 3) {
                i7 = s3.b.q(parcel, o7);
            } else if (l7 != 4) {
                s3.b.t(parcel, o7);
            } else {
                str2 = s3.b.f(parcel, o7);
            }
        }
        s3.b.k(parcel, u6);
        return new f90(str, z6, i7, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ f90[] newArray(int i7) {
        return new f90[i7];
    }
}
