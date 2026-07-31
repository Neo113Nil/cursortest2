package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class qv implements Parcelable.Creator<pv> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ pv createFromParcel(Parcel parcel) {
        int u6 = s3.b.u(parcel);
        String str = null;
        pv[] pvVarArr = null;
        int i7 = 0;
        int i8 = 0;
        boolean z6 = false;
        int i9 = 0;
        int i10 = 0;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        while (parcel.dataPosition() < u6) {
            int o7 = s3.b.o(parcel);
            switch (s3.b.l(o7)) {
                case 2:
                    str = s3.b.f(parcel, o7);
                    break;
                case 3:
                    i7 = s3.b.q(parcel, o7);
                    break;
                case 4:
                    i8 = s3.b.q(parcel, o7);
                    break;
                case 5:
                    z6 = s3.b.m(parcel, o7);
                    break;
                case 6:
                    i9 = s3.b.q(parcel, o7);
                    break;
                case c4.w0.f2149o /* 7 */:
                    i10 = s3.b.q(parcel, o7);
                    break;
                case c4.w0.f2150p /* 8 */:
                    pvVarArr = (pv[]) s3.b.i(parcel, o7, pv.CREATOR);
                    break;
                case 9:
                    z7 = s3.b.m(parcel, o7);
                    break;
                case 10:
                    z8 = s3.b.m(parcel, o7);
                    break;
                case 11:
                    z9 = s3.b.m(parcel, o7);
                    break;
                case 12:
                    z10 = s3.b.m(parcel, o7);
                    break;
                case 13:
                    z11 = s3.b.m(parcel, o7);
                    break;
                case 14:
                    z12 = s3.b.m(parcel, o7);
                    break;
                case 15:
                    z13 = s3.b.m(parcel, o7);
                    break;
                case 16:
                    z14 = s3.b.m(parcel, o7);
                    break;
                default:
                    s3.b.t(parcel, o7);
                    break;
            }
        }
        s3.b.k(parcel, u6);
        return new pv(str, i7, i8, z6, i9, i10, pvVarArr, z7, z8, z9, z10, z11, z12, z13, z14);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ pv[] newArray(int i7) {
        return new pv[i7];
    }
}
