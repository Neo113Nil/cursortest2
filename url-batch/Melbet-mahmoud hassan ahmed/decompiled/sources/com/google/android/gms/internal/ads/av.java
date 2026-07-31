package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class av extends s3.a {
    public static final Parcelable.Creator<av> CREATOR = new bv();

    /* renamed from: f, reason: collision with root package name */
    public final String f2980f;

    /* renamed from: g, reason: collision with root package name */
    public final String f2981g;

    public av(String str, String str2) {
        this.f2980f = str;
        this.f2981g = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a7 = s3.c.a(parcel);
        s3.c.m(parcel, 1, this.f2980f, false);
        s3.c.m(parcel, 2, this.f2981g, false);
        s3.c.b(parcel, a7);
    }
}
