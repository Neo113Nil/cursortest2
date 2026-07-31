package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class e23 implements Parcelable.Creator<d23> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ d23 createFromParcel(Parcel parcel) {
        int u6 = s3.b.u(parcel);
        String str = null;
        String str2 = null;
        int i7 = 0;
        while (parcel.dataPosition() < u6) {
            int o7 = s3.b.o(parcel);
            int l7 = s3.b.l(o7);
            if (l7 == 1) {
                i7 = s3.b.q(parcel, o7);
            } else if (l7 == 2) {
                str = s3.b.f(parcel, o7);
            } else if (l7 != 3) {
                s3.b.t(parcel, o7);
            } else {
                str2 = s3.b.f(parcel, o7);
            }
        }
        s3.b.k(parcel, u6);
        return new d23(i7, str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ d23[] newArray(int i7) {
        return new d23[i7];
    }
}
