package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class v80 implements Parcelable.Creator<u80> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ u80 createFromParcel(Parcel parcel) {
        int u6 = s3.b.u(parcel);
        String str = null;
        byte[] bArr = null;
        String[] strArr = null;
        String[] strArr2 = null;
        long j7 = 0;
        boolean z6 = false;
        int i7 = 0;
        boolean z7 = false;
        while (parcel.dataPosition() < u6) {
            int o7 = s3.b.o(parcel);
            switch (s3.b.l(o7)) {
                case 1:
                    z6 = s3.b.m(parcel, o7);
                    break;
                case 2:
                    str = s3.b.f(parcel, o7);
                    break;
                case 3:
                    i7 = s3.b.q(parcel, o7);
                    break;
                case 4:
                    bArr = s3.b.b(parcel, o7);
                    break;
                case 5:
                    strArr = s3.b.g(parcel, o7);
                    break;
                case 6:
                    strArr2 = s3.b.g(parcel, o7);
                    break;
                case c4.w0.f2149o /* 7 */:
                    z7 = s3.b.m(parcel, o7);
                    break;
                case c4.w0.f2150p /* 8 */:
                    j7 = s3.b.r(parcel, o7);
                    break;
                default:
                    s3.b.t(parcel, o7);
                    break;
            }
        }
        s3.b.k(parcel, u6);
        return new u80(z6, str, i7, bArr, strArr, strArr2, z7, j7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ u80[] newArray(int i7) {
        return new u80[i7];
    }
}
