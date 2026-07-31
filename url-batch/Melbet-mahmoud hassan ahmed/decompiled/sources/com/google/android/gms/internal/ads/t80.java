package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class t80 implements Parcelable.Creator<s80> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ s80 createFromParcel(Parcel parcel) {
        int u6 = s3.b.u(parcel);
        String str = null;
        String[] strArr = null;
        String[] strArr2 = null;
        while (parcel.dataPosition() < u6) {
            int o7 = s3.b.o(parcel);
            int l7 = s3.b.l(o7);
            if (l7 == 1) {
                str = s3.b.f(parcel, o7);
            } else if (l7 == 2) {
                strArr = s3.b.g(parcel, o7);
            } else if (l7 != 3) {
                s3.b.t(parcel, o7);
            } else {
                strArr2 = s3.b.g(parcel, o7);
            }
        }
        s3.b.k(parcel, u6);
        return new s80(str, strArr, strArr2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ s80[] newArray(int i7) {
        return new s80[i7];
    }
}
