package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class g23 implements Parcelable.Creator<f23> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ f23 createFromParcel(Parcel parcel) {
        int u6 = s3.b.u(parcel);
        int i7 = 0;
        byte[] bArr = null;
        while (parcel.dataPosition() < u6) {
            int o7 = s3.b.o(parcel);
            int l7 = s3.b.l(o7);
            if (l7 == 1) {
                i7 = s3.b.q(parcel, o7);
            } else if (l7 != 2) {
                s3.b.t(parcel, o7);
            } else {
                bArr = s3.b.b(parcel, o7);
            }
        }
        s3.b.k(parcel, u6);
        return new f23(i7, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ f23[] newArray(int i7) {
        return new f23[i7];
    }
}
