package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class a implements Parcelable.Creator<Scope> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Scope createFromParcel(Parcel parcel) {
        int u6 = s3.b.u(parcel);
        int i7 = 0;
        String str = null;
        while (parcel.dataPosition() < u6) {
            int o7 = s3.b.o(parcel);
            int l7 = s3.b.l(o7);
            if (l7 == 1) {
                i7 = s3.b.q(parcel, o7);
            } else if (l7 != 2) {
                s3.b.t(parcel, o7);
            } else {
                str = s3.b.f(parcel, o7);
            }
        }
        s3.b.k(parcel, u6);
        return new Scope(i7, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Scope[] newArray(int i7) {
        return new Scope[i7];
    }
}
