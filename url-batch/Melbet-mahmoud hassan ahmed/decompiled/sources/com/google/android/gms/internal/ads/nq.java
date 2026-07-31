package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class nq implements Parcelable.Creator<mq> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ mq createFromParcel(Parcel parcel) {
        int u6 = s3.b.u(parcel);
        long j7 = 0;
        long j8 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Bundle bundle = null;
        String str5 = null;
        boolean z6 = false;
        int i7 = 0;
        while (parcel.dataPosition() < u6) {
            int o7 = s3.b.o(parcel);
            switch (s3.b.l(o7)) {
                case 2:
                    str = s3.b.f(parcel, o7);
                    break;
                case 3:
                    j7 = s3.b.r(parcel, o7);
                    break;
                case 4:
                    str2 = s3.b.f(parcel, o7);
                    break;
                case 5:
                    str3 = s3.b.f(parcel, o7);
                    break;
                case 6:
                    str4 = s3.b.f(parcel, o7);
                    break;
                case c4.w0.f2149o /* 7 */:
                    bundle = s3.b.a(parcel, o7);
                    break;
                case c4.w0.f2150p /* 8 */:
                    z6 = s3.b.m(parcel, o7);
                    break;
                case 9:
                    j8 = s3.b.r(parcel, o7);
                    break;
                case 10:
                    str5 = s3.b.f(parcel, o7);
                    break;
                case 11:
                    i7 = s3.b.q(parcel, o7);
                    break;
                default:
                    s3.b.t(parcel, o7);
                    break;
            }
        }
        s3.b.k(parcel, u6);
        return new mq(str, j7, str2, str3, str4, bundle, z6, j8, str5, i7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ mq[] newArray(int i7) {
        return new mq[i7];
    }
}
