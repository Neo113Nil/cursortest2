package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class u80 extends s3.a {
    public static final Parcelable.Creator<u80> CREATOR = new v80();

    /* renamed from: f, reason: collision with root package name */
    public final boolean f12681f;

    /* renamed from: g, reason: collision with root package name */
    public final String f12682g;

    /* renamed from: h, reason: collision with root package name */
    public final int f12683h;

    /* renamed from: i, reason: collision with root package name */
    public final byte[] f12684i;

    /* renamed from: j, reason: collision with root package name */
    public final String[] f12685j;

    /* renamed from: k, reason: collision with root package name */
    public final String[] f12686k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f12687l;

    /* renamed from: m, reason: collision with root package name */
    public final long f12688m;

    u80(boolean z6, String str, int i7, byte[] bArr, String[] strArr, String[] strArr2, boolean z7, long j7) {
        this.f12681f = z6;
        this.f12682g = str;
        this.f12683h = i7;
        this.f12684i = bArr;
        this.f12685j = strArr;
        this.f12686k = strArr2;
        this.f12687l = z7;
        this.f12688m = j7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a7 = s3.c.a(parcel);
        s3.c.c(parcel, 1, this.f12681f);
        s3.c.m(parcel, 2, this.f12682g, false);
        s3.c.h(parcel, 3, this.f12683h);
        s3.c.e(parcel, 4, this.f12684i, false);
        s3.c.n(parcel, 5, this.f12685j, false);
        s3.c.n(parcel, 6, this.f12686k, false);
        s3.c.c(parcel, 7, this.f12687l);
        s3.c.k(parcel, 8, this.f12688m);
        s3.c.b(parcel, a7);
    }
}
