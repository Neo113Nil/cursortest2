package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class wi0 implements Parcelable.Creator<vi0> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ vi0 createFromParcel(Parcel parcel) {
        int u6 = s3.b.u(parcel);
        Bundle bundle = null;
        po0 po0Var = null;
        ApplicationInfo applicationInfo = null;
        String str = null;
        ArrayList<String> arrayList = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        au2 au2Var = null;
        String str4 = null;
        while (parcel.dataPosition() < u6) {
            int o7 = s3.b.o(parcel);
            switch (s3.b.l(o7)) {
                case 1:
                    bundle = s3.b.a(parcel, o7);
                    break;
                case 2:
                    po0Var = (po0) s3.b.e(parcel, o7, po0.CREATOR);
                    break;
                case 3:
                    applicationInfo = (ApplicationInfo) s3.b.e(parcel, o7, ApplicationInfo.CREATOR);
                    break;
                case 4:
                    str = s3.b.f(parcel, o7);
                    break;
                case 5:
                    arrayList = s3.b.h(parcel, o7);
                    break;
                case 6:
                    packageInfo = (PackageInfo) s3.b.e(parcel, o7, PackageInfo.CREATOR);
                    break;
                case c4.w0.f2149o /* 7 */:
                    str2 = s3.b.f(parcel, o7);
                    break;
                case c4.w0.f2150p /* 8 */:
                default:
                    s3.b.t(parcel, o7);
                    break;
                case 9:
                    str3 = s3.b.f(parcel, o7);
                    break;
                case 10:
                    au2Var = (au2) s3.b.e(parcel, o7, au2.CREATOR);
                    break;
                case 11:
                    str4 = s3.b.f(parcel, o7);
                    break;
            }
        }
        s3.b.k(parcel, u6);
        return new vi0(bundle, po0Var, applicationInfo, str, arrayList, packageInfo, str2, str3, au2Var, str4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ vi0[] newArray(int i7) {
        return new vi0[i7];
    }
}
