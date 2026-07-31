package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class mv implements Parcelable.Creator<kv> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ kv createFromParcel(Parcel parcel) {
        int u6 = s3.b.u(parcel);
        Bundle bundle = null;
        ArrayList<String> arrayList = null;
        String str = null;
        p00 p00Var = null;
        Location location = null;
        String str2 = null;
        Bundle bundle2 = null;
        Bundle bundle3 = null;
        ArrayList<String> arrayList2 = null;
        String str3 = null;
        String str4 = null;
        av avVar = null;
        String str5 = null;
        ArrayList<String> arrayList3 = null;
        String str6 = null;
        long j7 = 0;
        int i7 = 0;
        int i8 = 0;
        boolean z6 = false;
        int i9 = 0;
        boolean z7 = false;
        boolean z8 = false;
        int i10 = 0;
        int i11 = 0;
        while (parcel.dataPosition() < u6) {
            int o7 = s3.b.o(parcel);
            switch (s3.b.l(o7)) {
                case 1:
                    i7 = s3.b.q(parcel, o7);
                    break;
                case 2:
                    j7 = s3.b.r(parcel, o7);
                    break;
                case 3:
                    bundle = s3.b.a(parcel, o7);
                    break;
                case 4:
                    i8 = s3.b.q(parcel, o7);
                    break;
                case 5:
                    arrayList = s3.b.h(parcel, o7);
                    break;
                case 6:
                    z6 = s3.b.m(parcel, o7);
                    break;
                case c4.w0.f2149o /* 7 */:
                    i9 = s3.b.q(parcel, o7);
                    break;
                case c4.w0.f2150p /* 8 */:
                    z7 = s3.b.m(parcel, o7);
                    break;
                case 9:
                    str = s3.b.f(parcel, o7);
                    break;
                case 10:
                    p00Var = (p00) s3.b.e(parcel, o7, p00.CREATOR);
                    break;
                case 11:
                    location = (Location) s3.b.e(parcel, o7, Location.CREATOR);
                    break;
                case 12:
                    str2 = s3.b.f(parcel, o7);
                    break;
                case 13:
                    bundle2 = s3.b.a(parcel, o7);
                    break;
                case 14:
                    bundle3 = s3.b.a(parcel, o7);
                    break;
                case 15:
                    arrayList2 = s3.b.h(parcel, o7);
                    break;
                case 16:
                    str3 = s3.b.f(parcel, o7);
                    break;
                case 17:
                    str4 = s3.b.f(parcel, o7);
                    break;
                case 18:
                    z8 = s3.b.m(parcel, o7);
                    break;
                case 19:
                    avVar = (av) s3.b.e(parcel, o7, av.CREATOR);
                    break;
                case 20:
                    i10 = s3.b.q(parcel, o7);
                    break;
                case 21:
                    str5 = s3.b.f(parcel, o7);
                    break;
                case 22:
                    arrayList3 = s3.b.h(parcel, o7);
                    break;
                case 23:
                    i11 = s3.b.q(parcel, o7);
                    break;
                case 24:
                    str6 = s3.b.f(parcel, o7);
                    break;
                default:
                    s3.b.t(parcel, o7);
                    break;
            }
        }
        s3.b.k(parcel, u6);
        return new kv(i7, j7, bundle, i8, arrayList, z6, i9, z7, str, p00Var, location, str2, bundle2, bundle3, arrayList2, str3, str4, z8, avVar, i10, str5, arrayList3, i11, str6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ kv[] newArray(int i7) {
        return new kv[i7];
    }
}
