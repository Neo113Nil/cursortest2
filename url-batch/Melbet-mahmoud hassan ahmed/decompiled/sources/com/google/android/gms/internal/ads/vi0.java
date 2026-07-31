package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes.dex */
public final class vi0 extends s3.a {
    public static final Parcelable.Creator<vi0> CREATOR = new wi0();

    /* renamed from: f, reason: collision with root package name */
    public final Bundle f13401f;

    /* renamed from: g, reason: collision with root package name */
    public final po0 f13402g;

    /* renamed from: h, reason: collision with root package name */
    public final ApplicationInfo f13403h;

    /* renamed from: i, reason: collision with root package name */
    public final String f13404i;

    /* renamed from: j, reason: collision with root package name */
    public final List<String> f13405j;

    /* renamed from: k, reason: collision with root package name */
    public final PackageInfo f13406k;

    /* renamed from: l, reason: collision with root package name */
    public final String f13407l;

    /* renamed from: m, reason: collision with root package name */
    public final String f13408m;

    /* renamed from: n, reason: collision with root package name */
    public au2 f13409n;

    /* renamed from: o, reason: collision with root package name */
    public String f13410o;

    public vi0(Bundle bundle, po0 po0Var, ApplicationInfo applicationInfo, String str, List<String> list, PackageInfo packageInfo, String str2, String str3, au2 au2Var, String str4) {
        this.f13401f = bundle;
        this.f13402g = po0Var;
        this.f13404i = str;
        this.f13403h = applicationInfo;
        this.f13405j = list;
        this.f13406k = packageInfo;
        this.f13407l = str2;
        this.f13408m = str3;
        this.f13409n = au2Var;
        this.f13410o = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a7 = s3.c.a(parcel);
        s3.c.d(parcel, 1, this.f13401f, false);
        s3.c.l(parcel, 2, this.f13402g, i7, false);
        s3.c.l(parcel, 3, this.f13403h, i7, false);
        s3.c.m(parcel, 4, this.f13404i, false);
        s3.c.o(parcel, 5, this.f13405j, false);
        s3.c.l(parcel, 6, this.f13406k, i7, false);
        s3.c.m(parcel, 7, this.f13407l, false);
        s3.c.m(parcel, 9, this.f13408m, false);
        s3.c.l(parcel, 10, this.f13409n, i7, false);
        s3.c.m(parcel, 11, this.f13410o, false);
        s3.c.b(parcel, a7);
    }
}
