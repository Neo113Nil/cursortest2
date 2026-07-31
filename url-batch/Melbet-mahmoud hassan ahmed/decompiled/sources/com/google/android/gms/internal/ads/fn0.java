package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class fn0 extends s3.a {
    public static final Parcelable.Creator<fn0> CREATOR = new gn0();

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    public final String f5159f;

    /* renamed from: g, reason: collision with root package name */
    public final String f5160g;

    /* renamed from: h, reason: collision with root package name */
    @Deprecated
    public final pv f5161h;

    /* renamed from: i, reason: collision with root package name */
    public final kv f5162i;

    public fn0(String str, String str2, pv pvVar, kv kvVar) {
        this.f5159f = str;
        this.f5160g = str2;
        this.f5161h = pvVar;
        this.f5162i = kvVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a7 = s3.c.a(parcel);
        s3.c.m(parcel, 1, this.f5159f, false);
        s3.c.m(parcel, 2, this.f5160g, false);
        s3.c.l(parcel, 3, this.f5161h, i7, false);
        s3.c.l(parcel, 4, this.f5162i, i7, false);
        s3.c.b(parcel, a7);
    }
}
