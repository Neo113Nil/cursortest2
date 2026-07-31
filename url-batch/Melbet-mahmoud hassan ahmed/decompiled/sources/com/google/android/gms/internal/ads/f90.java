package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class f90 extends s3.a {
    public static final Parcelable.Creator<f90> CREATOR = new g90();

    /* renamed from: f, reason: collision with root package name */
    public final String f5045f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f5046g;

    /* renamed from: h, reason: collision with root package name */
    public final int f5047h;

    /* renamed from: i, reason: collision with root package name */
    public final String f5048i;

    public f90(String str, boolean z6, int i7, String str2) {
        this.f5045f = str;
        this.f5046g = z6;
        this.f5047h = i7;
        this.f5048i = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a7 = s3.c.a(parcel);
        s3.c.m(parcel, 1, this.f5045f, false);
        s3.c.c(parcel, 2, this.f5046g);
        s3.c.h(parcel, 3, this.f5047h);
        s3.c.m(parcel, 4, this.f5048i, false);
        s3.c.b(parcel, a7);
    }
}
