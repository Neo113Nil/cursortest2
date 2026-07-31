package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class bu2 implements Parcelable.Creator<au2> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ au2 createFromParcel(Parcel parcel) {
        int u6 = s3.b.u(parcel);
        String str = null;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (parcel.dataPosition() < u6) {
            int o7 = s3.b.o(parcel);
            switch (s3.b.l(o7)) {
                case 1:
                    i7 = s3.b.q(parcel, o7);
                    break;
                case 2:
                    i8 = s3.b.q(parcel, o7);
                    break;
                case 3:
                    i9 = s3.b.q(parcel, o7);
                    break;
                case 4:
                    i10 = s3.b.q(parcel, o7);
                    break;
                case 5:
                    str = s3.b.f(parcel, o7);
                    break;
                case 6:
                    i11 = s3.b.q(parcel, o7);
                    break;
                case c4.w0.f2149o /* 7 */:
                    i12 = s3.b.q(parcel, o7);
                    break;
                default:
                    s3.b.t(parcel, o7);
                    break;
            }
        }
        s3.b.k(parcel, u6);
        return new au2(i7, i8, i9, i10, str, i11, i12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ au2[] newArray(int i7) {
        return new au2[i7];
    }
}
