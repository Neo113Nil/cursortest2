package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class s80 extends s3.a {
    public static final Parcelable.Creator<s80> CREATOR = new t80();

    /* renamed from: f, reason: collision with root package name */
    public final String f11719f;

    /* renamed from: g, reason: collision with root package name */
    public final String[] f11720g;

    /* renamed from: h, reason: collision with root package name */
    public final String[] f11721h;

    s80(String str, String[] strArr, String[] strArr2) {
        this.f11719f = str;
        this.f11720g = strArr;
        this.f11721h = strArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a7 = s3.c.a(parcel);
        s3.c.m(parcel, 1, this.f11719f, false);
        s3.c.n(parcel, 2, this.f11720g, false);
        s3.c.n(parcel, 3, this.f11721h, false);
        s3.c.b(parcel, a7);
    }
}
