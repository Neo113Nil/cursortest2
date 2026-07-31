package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class t90 implements Parcelable.Creator<r90> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ r90 createFromParcel(Parcel parcel) {
        int u6 = s3.b.u(parcel);
        int i7 = 0;
        String str = null;
        int i8 = 0;
        int i9 = 0;
        while (parcel.dataPosition() < u6) {
            int o7 = s3.b.o(parcel);
            int l7 = s3.b.l(o7);
            if (l7 == 1) {
                i8 = s3.b.q(parcel, o7);
            } else if (l7 == 2) {
                str = s3.b.f(parcel, o7);
            } else if (l7 == 3) {
                i9 = s3.b.q(parcel, o7);
            } else if (l7 != 1000) {
                s3.b.t(parcel, o7);
            } else {
                i7 = s3.b.q(parcel, o7);
            }
        }
        s3.b.k(parcel, u6);
        return new r90(i7, i8, str, i9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ r90[] newArray(int i7) {
        return new r90[i7];
    }
}
