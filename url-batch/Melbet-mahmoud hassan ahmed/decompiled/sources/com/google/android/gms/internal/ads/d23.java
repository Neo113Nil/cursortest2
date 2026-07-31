package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class d23 extends s3.a {
    public static final Parcelable.Creator<d23> CREATOR = new e23();

    /* renamed from: f, reason: collision with root package name */
    public final int f4052f;

    /* renamed from: g, reason: collision with root package name */
    public final String f4053g;

    /* renamed from: h, reason: collision with root package name */
    public final String f4054h;

    d23(int i7, String str, String str2) {
        this.f4052f = i7;
        this.f4053g = str;
        this.f4054h = str2;
    }

    public d23(String str, String str2) {
        this(1, str, str2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a7 = s3.c.a(parcel);
        s3.c.h(parcel, 1, this.f4052f);
        s3.c.m(parcel, 2, this.f4053g, false);
        s3.c.m(parcel, 3, this.f4054h, false);
        s3.c.b(parcel, a7);
    }
}
