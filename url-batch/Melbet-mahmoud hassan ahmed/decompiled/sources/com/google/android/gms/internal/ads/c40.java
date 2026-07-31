package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class c40 implements Parcelable.Creator<b40> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ b40 createFromParcel(Parcel parcel) {
        int u6 = s3.b.u(parcel);
        s00 s00Var = null;
        int i7 = 0;
        boolean z6 = false;
        int i8 = 0;
        boolean z7 = false;
        int i9 = 0;
        boolean z8 = false;
        int i10 = 0;
        while (parcel.dataPosition() < u6) {
            int o7 = s3.b.o(parcel);
            switch (s3.b.l(o7)) {
                case 1:
                    i7 = s3.b.q(parcel, o7);
                    break;
                case 2:
                    z6 = s3.b.m(parcel, o7);
                    break;
                case 3:
                    i8 = s3.b.q(parcel, o7);
                    break;
                case 4:
                    z7 = s3.b.m(parcel, o7);
                    break;
                case 5:
                    i9 = s3.b.q(parcel, o7);
                    break;
                case 6:
                    s00Var = (s00) s3.b.e(parcel, o7, s00.CREATOR);
                    break;
                case c4.w0.f2149o /* 7 */:
                    z8 = s3.b.m(parcel, o7);
                    break;
                case c4.w0.f2150p /* 8 */:
                    i10 = s3.b.q(parcel, o7);
                    break;
                default:
                    s3.b.t(parcel, o7);
                    break;
            }
        }
        s3.b.k(parcel, u6);
        return new b40(i7, z6, i8, z7, i9, s00Var, z8, i10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ b40[] newArray(int i7) {
        return new b40[i7];
    }
}
