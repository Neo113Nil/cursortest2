package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class q90 implements Parcelable.Creator<p90> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ p90 createFromParcel(Parcel parcel) {
        int u6 = s3.b.u(parcel);
        String str = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < u6) {
            int o7 = s3.b.o(parcel);
            int l7 = s3.b.l(o7);
            if (l7 == 1) {
                str = s3.b.f(parcel, o7);
            } else if (l7 != 2) {
                s3.b.t(parcel, o7);
            } else {
                bundle = s3.b.a(parcel, o7);
            }
        }
        s3.b.k(parcel, u6);
        return new p90(str, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ p90[] newArray(int i7) {
        return new p90[i7];
    }
}
