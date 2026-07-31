package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class sv implements Parcelable.Creator<rv> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ rv createFromParcel(Parcel parcel) {
        int u6 = s3.b.u(parcel);
        String str = null;
        long j7 = 0;
        int i7 = 0;
        int i8 = 0;
        while (parcel.dataPosition() < u6) {
            int o7 = s3.b.o(parcel);
            int l7 = s3.b.l(o7);
            if (l7 == 1) {
                i7 = s3.b.q(parcel, o7);
            } else if (l7 == 2) {
                i8 = s3.b.q(parcel, o7);
            } else if (l7 == 3) {
                str = s3.b.f(parcel, o7);
            } else if (l7 != 4) {
                s3.b.t(parcel, o7);
            } else {
                j7 = s3.b.r(parcel, o7);
            }
        }
        s3.b.k(parcel, u6);
        return new rv(i7, i8, str, j7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ rv[] newArray(int i7) {
        return new rv[i7];
    }
}
