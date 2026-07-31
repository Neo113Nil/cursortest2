package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class uj0 implements Parcelable.Creator<tj0> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ tj0 createFromParcel(Parcel parcel) {
        int u6 = s3.b.u(parcel);
        kv kvVar = null;
        String str = null;
        while (parcel.dataPosition() < u6) {
            int o7 = s3.b.o(parcel);
            int l7 = s3.b.l(o7);
            if (l7 == 2) {
                kvVar = (kv) s3.b.e(parcel, o7, kv.CREATOR);
            } else if (l7 != 3) {
                s3.b.t(parcel, o7);
            } else {
                str = s3.b.f(parcel, o7);
            }
        }
        s3.b.k(parcel, u6);
        return new tj0(kvVar, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ tj0[] newArray(int i7) {
        return new tj0[i7];
    }
}
