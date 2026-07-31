package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class r90 extends s3.a {
    public static final Parcelable.Creator<r90> CREATOR = new t90();

    /* renamed from: f, reason: collision with root package name */
    public final int f11068f;

    /* renamed from: g, reason: collision with root package name */
    public final int f11069g;

    /* renamed from: h, reason: collision with root package name */
    public final String f11070h;

    /* renamed from: i, reason: collision with root package name */
    public final int f11071i;

    public r90(int i7, int i8, String str, int i9) {
        this.f11068f = i7;
        this.f11069g = i8;
        this.f11070h = str;
        this.f11071i = i9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a7 = s3.c.a(parcel);
        s3.c.h(parcel, 1, this.f11069g);
        s3.c.m(parcel, 2, this.f11070h, false);
        s3.c.h(parcel, 3, this.f11071i);
        s3.c.h(parcel, 1000, this.f11068f);
        s3.c.b(parcel, a7);
    }
}
