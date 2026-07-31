package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ki0 implements Parcelable.Creator<ji0> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ji0 createFromParcel(Parcel parcel) {
        int u6 = s3.b.u(parcel);
        boolean z6 = false;
        ArrayList<String> arrayList = null;
        while (parcel.dataPosition() < u6) {
            int o7 = s3.b.o(parcel);
            int l7 = s3.b.l(o7);
            if (l7 == 2) {
                z6 = s3.b.m(parcel, o7);
            } else if (l7 != 3) {
                s3.b.t(parcel, o7);
            } else {
                arrayList = s3.b.h(parcel, o7);
            }
        }
        s3.b.k(parcel, u6);
        return new ji0(z6, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ji0[] newArray(int i7) {
        return new ji0[i7];
    }
}
