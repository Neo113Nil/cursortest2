package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class dv implements Parcelable.Creator<cv> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ cv createFromParcel(Parcel parcel) {
        int u6 = s3.b.u(parcel);
        String str = null;
        String str2 = null;
        cv cvVar = null;
        IBinder iBinder = null;
        int i7 = 0;
        while (parcel.dataPosition() < u6) {
            int o7 = s3.b.o(parcel);
            int l7 = s3.b.l(o7);
            if (l7 == 1) {
                i7 = s3.b.q(parcel, o7);
            } else if (l7 == 2) {
                str = s3.b.f(parcel, o7);
            } else if (l7 == 3) {
                str2 = s3.b.f(parcel, o7);
            } else if (l7 == 4) {
                cvVar = (cv) s3.b.e(parcel, o7, cv.CREATOR);
            } else if (l7 != 5) {
                s3.b.t(parcel, o7);
            } else {
                iBinder = s3.b.p(parcel, o7);
            }
        }
        s3.b.k(parcel, u6);
        return new cv(i7, str, str2, cvVar, iBinder);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ cv[] newArray(int i7) {
        return new cv[i7];
    }
}
