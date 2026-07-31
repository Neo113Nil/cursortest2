package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class zj0 implements Parcelable.Creator<yj0> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ yj0 createFromParcel(Parcel parcel) {
        int u6 = s3.b.u(parcel);
        String str = null;
        int i7 = 0;
        while (parcel.dataPosition() < u6) {
            int o7 = s3.b.o(parcel);
            int l7 = s3.b.l(o7);
            if (l7 == 2) {
                str = s3.b.f(parcel, o7);
            } else if (l7 != 3) {
                s3.b.t(parcel, o7);
            } else {
                i7 = s3.b.q(parcel, o7);
            }
        }
        s3.b.k(parcel, u6);
        return new yj0(str, i7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ yj0[] newArray(int i7) {
        return new yj0[i7];
    }
}
