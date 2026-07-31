package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class m23 extends s3.a {
    public static final Parcelable.Creator<m23> CREATOR = new n23();

    /* renamed from: f, reason: collision with root package name */
    public final int f8381f;

    /* renamed from: g, reason: collision with root package name */
    public final int f8382g;

    /* renamed from: h, reason: collision with root package name */
    public final String f8383h;

    /* renamed from: i, reason: collision with root package name */
    public final String f8384i;

    /* renamed from: j, reason: collision with root package name */
    public final int f8385j;

    m23(int i7, int i8, int i9, String str, String str2) {
        this.f8381f = i7;
        this.f8382g = i8;
        this.f8383h = str;
        this.f8384i = str2;
        this.f8385j = i9;
    }

    public m23(int i7, int i8, String str, String str2) {
        this(1, 1, i8 - 1, str, str2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a7 = s3.c.a(parcel);
        s3.c.h(parcel, 1, this.f8381f);
        s3.c.h(parcel, 2, this.f8382g);
        s3.c.m(parcel, 3, this.f8383h, false);
        s3.c.m(parcel, 4, this.f8384i, false);
        s3.c.h(parcel, 5, this.f8385j);
        s3.c.b(parcel, a7);
    }
}
