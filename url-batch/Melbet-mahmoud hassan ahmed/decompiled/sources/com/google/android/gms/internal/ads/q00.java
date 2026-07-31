package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class q00 implements Parcelable.Creator<p00> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ p00 createFromParcel(Parcel parcel) {
        int u6 = s3.b.u(parcel);
        String str = null;
        while (parcel.dataPosition() < u6) {
            int o7 = s3.b.o(parcel);
            if (s3.b.l(o7) != 15) {
                s3.b.t(parcel, o7);
            } else {
                str = s3.b.f(parcel, o7);
            }
        }
        s3.b.k(parcel, u6);
        return new p00(str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ p00[] newArray(int i7) {
        return new p00[i7];
    }
}
