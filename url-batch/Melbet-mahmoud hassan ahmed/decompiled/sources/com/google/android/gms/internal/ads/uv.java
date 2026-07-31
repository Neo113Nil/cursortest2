package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class uv implements Parcelable.Creator<tv> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ tv createFromParcel(Parcel parcel) {
        int u6 = s3.b.u(parcel);
        String str = null;
        cv cvVar = null;
        Bundle bundle = null;
        long j7 = 0;
        while (parcel.dataPosition() < u6) {
            int o7 = s3.b.o(parcel);
            int l7 = s3.b.l(o7);
            if (l7 == 1) {
                str = s3.b.f(parcel, o7);
            } else if (l7 == 2) {
                j7 = s3.b.r(parcel, o7);
            } else if (l7 == 3) {
                cvVar = (cv) s3.b.e(parcel, o7, cv.CREATOR);
            } else if (l7 != 4) {
                s3.b.t(parcel, o7);
            } else {
                bundle = s3.b.a(parcel, o7);
            }
        }
        s3.b.k(parcel, u6);
        return new tv(str, j7, cvVar, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ tv[] newArray(int i7) {
        return new tv[i7];
    }
}
