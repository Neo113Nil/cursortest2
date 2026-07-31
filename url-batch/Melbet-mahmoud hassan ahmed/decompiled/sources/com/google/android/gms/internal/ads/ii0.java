package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ii0 implements Parcelable.Creator<hi0> {
    public static final hi0 a(Parcel parcel) {
        int u6 = s3.b.u(parcel);
        long j7 = 0;
        long j8 = 0;
        Bundle bundle = null;
        kv kvVar = null;
        pv pvVar = null;
        String str = null;
        ApplicationInfo applicationInfo = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        po0 po0Var = null;
        Bundle bundle2 = null;
        ArrayList<String> arrayList = null;
        Bundle bundle3 = null;
        String str5 = null;
        String str6 = null;
        ArrayList<String> arrayList2 = null;
        String str7 = null;
        b40 b40Var = null;
        ArrayList<String> arrayList3 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        Bundle bundle4 = null;
        String str11 = null;
        hz hzVar = null;
        Bundle bundle5 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        ArrayList<Integer> arrayList4 = null;
        String str15 = null;
        ArrayList<String> arrayList5 = null;
        ArrayList<String> arrayList6 = null;
        String str16 = null;
        r90 r90Var = null;
        String str17 = null;
        Bundle bundle6 = null;
        int i7 = 0;
        int i8 = 0;
        boolean z6 = false;
        int i9 = 0;
        int i10 = 0;
        float f7 = 0.0f;
        float f8 = 0.0f;
        boolean z7 = false;
        int i11 = 0;
        int i12 = 0;
        boolean z8 = false;
        boolean z9 = false;
        int i13 = 0;
        boolean z10 = false;
        boolean z11 = false;
        int i14 = 0;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        while (parcel.dataPosition() < u6) {
            int o7 = s3.b.o(parcel);
            switch (s3.b.l(o7)) {
                case 1:
                    i7 = s3.b.q(parcel, o7);
                    break;
                case 2:
                    bundle = s3.b.a(parcel, o7);
                    break;
                case 3:
                    kvVar = (kv) s3.b.e(parcel, o7, kv.CREATOR);
                    break;
                case 4:
                    pvVar = (pv) s3.b.e(parcel, o7, pv.CREATOR);
                    break;
                case 5:
                    str = s3.b.f(parcel, o7);
                    break;
                case 6:
                    applicationInfo = (ApplicationInfo) s3.b.e(parcel, o7, ApplicationInfo.CREATOR);
                    break;
                case c4.w0.f2149o /* 7 */:
                    packageInfo = (PackageInfo) s3.b.e(parcel, o7, PackageInfo.CREATOR);
                    break;
                case c4.w0.f2150p /* 8 */:
                    str2 = s3.b.f(parcel, o7);
                    break;
                case 9:
                    str3 = s3.b.f(parcel, o7);
                    break;
                case 10:
                    str4 = s3.b.f(parcel, o7);
                    break;
                case 11:
                    po0Var = (po0) s3.b.e(parcel, o7, po0.CREATOR);
                    break;
                case 12:
                    bundle2 = s3.b.a(parcel, o7);
                    break;
                case 13:
                    i8 = s3.b.q(parcel, o7);
                    break;
                case 14:
                    arrayList = s3.b.h(parcel, o7);
                    break;
                case 15:
                    bundle3 = s3.b.a(parcel, o7);
                    break;
                case 16:
                    z6 = s3.b.m(parcel, o7);
                    break;
                case 17:
                case 22:
                case 23:
                case 24:
                case 32:
                case 38:
                case 62:
                default:
                    s3.b.t(parcel, o7);
                    break;
                case 18:
                    i9 = s3.b.q(parcel, o7);
                    break;
                case 19:
                    i10 = s3.b.q(parcel, o7);
                    break;
                case 20:
                    f7 = s3.b.n(parcel, o7);
                    break;
                case 21:
                    str5 = s3.b.f(parcel, o7);
                    break;
                case 25:
                    j7 = s3.b.r(parcel, o7);
                    break;
                case 26:
                    str6 = s3.b.f(parcel, o7);
                    break;
                case 27:
                    arrayList2 = s3.b.h(parcel, o7);
                    break;
                case 28:
                    str7 = s3.b.f(parcel, o7);
                    break;
                case 29:
                    b40Var = (b40) s3.b.e(parcel, o7, b40.CREATOR);
                    break;
                case 30:
                    arrayList3 = s3.b.h(parcel, o7);
                    break;
                case 31:
                    j8 = s3.b.r(parcel, o7);
                    break;
                case 33:
                    str8 = s3.b.f(parcel, o7);
                    break;
                case 34:
                    f8 = s3.b.n(parcel, o7);
                    break;
                case 35:
                    i11 = s3.b.q(parcel, o7);
                    break;
                case 36:
                    i12 = s3.b.q(parcel, o7);
                    break;
                case 37:
                    z8 = s3.b.m(parcel, o7);
                    break;
                case 39:
                    str9 = s3.b.f(parcel, o7);
                    break;
                case 40:
                    z7 = s3.b.m(parcel, o7);
                    break;
                case 41:
                    str10 = s3.b.f(parcel, o7);
                    break;
                case 42:
                    z9 = s3.b.m(parcel, o7);
                    break;
                case 43:
                    i13 = s3.b.q(parcel, o7);
                    break;
                case 44:
                    bundle4 = s3.b.a(parcel, o7);
                    break;
                case 45:
                    str11 = s3.b.f(parcel, o7);
                    break;
                case 46:
                    hzVar = (hz) s3.b.e(parcel, o7, hz.CREATOR);
                    break;
                case 47:
                    z10 = s3.b.m(parcel, o7);
                    break;
                case 48:
                    bundle5 = s3.b.a(parcel, o7);
                    break;
                case 49:
                    str12 = s3.b.f(parcel, o7);
                    break;
                case 50:
                    str13 = s3.b.f(parcel, o7);
                    break;
                case 51:
                    str14 = s3.b.f(parcel, o7);
                    break;
                case 52:
                    z11 = s3.b.m(parcel, o7);
                    break;
                case 53:
                    arrayList4 = s3.b.d(parcel, o7);
                    break;
                case 54:
                    str15 = s3.b.f(parcel, o7);
                    break;
                case 55:
                    arrayList5 = s3.b.h(parcel, o7);
                    break;
                case 56:
                    i14 = s3.b.q(parcel, o7);
                    break;
                case 57:
                    z12 = s3.b.m(parcel, o7);
                    break;
                case 58:
                    z13 = s3.b.m(parcel, o7);
                    break;
                case 59:
                    z14 = s3.b.m(parcel, o7);
                    break;
                case 60:
                    arrayList6 = s3.b.h(parcel, o7);
                    break;
                case 61:
                    str16 = s3.b.f(parcel, o7);
                    break;
                case 63:
                    r90Var = (r90) s3.b.e(parcel, o7, r90.CREATOR);
                    break;
                case 64:
                    str17 = s3.b.f(parcel, o7);
                    break;
                case 65:
                    bundle6 = s3.b.a(parcel, o7);
                    break;
            }
        }
        s3.b.k(parcel, u6);
        return new hi0(i7, bundle, kvVar, pvVar, str, applicationInfo, packageInfo, str2, str3, str4, po0Var, bundle2, i8, arrayList, bundle3, z6, i9, i10, f7, str5, j7, str6, arrayList2, str7, b40Var, arrayList3, j8, str8, f8, z7, i11, i12, z8, str9, str10, z9, i13, bundle4, str11, hzVar, z10, bundle5, str12, str13, str14, z11, arrayList4, str15, arrayList5, i14, z12, z13, z14, arrayList6, str16, r90Var, str17, bundle6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ hi0 createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ hi0[] newArray(int i7) {
        return new hi0[i7];
    }
}
