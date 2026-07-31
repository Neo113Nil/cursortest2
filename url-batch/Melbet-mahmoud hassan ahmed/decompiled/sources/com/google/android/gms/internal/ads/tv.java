package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class tv extends s3.a {
    public static final Parcelable.Creator<tv> CREATOR = new uv();

    /* renamed from: f, reason: collision with root package name */
    public final String f12383f;

    /* renamed from: g, reason: collision with root package name */
    public long f12384g;

    /* renamed from: h, reason: collision with root package name */
    public cv f12385h;

    /* renamed from: i, reason: collision with root package name */
    public final Bundle f12386i;

    public tv(String str, long j7, cv cvVar, Bundle bundle) {
        this.f12383f = str;
        this.f12384g = j7;
        this.f12385h = cvVar;
        this.f12386i = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a7 = s3.c.a(parcel);
        s3.c.m(parcel, 1, this.f12383f, false);
        s3.c.k(parcel, 2, this.f12384g);
        s3.c.l(parcel, 3, this.f12385h, i7, false);
        s3.c.d(parcel, 4, this.f12386i, false);
        s3.c.b(parcel, a7);
    }
}
