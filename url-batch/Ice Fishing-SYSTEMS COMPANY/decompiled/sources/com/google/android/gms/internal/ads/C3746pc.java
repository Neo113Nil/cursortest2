package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.pc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3746pc extends P2.a {
    public static final Parcelable.Creator<C3746pc> CREATOR = new S8(4);

    /* renamed from: A, reason: collision with root package name */
    public final long f33410A;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f33411n;

    /* renamed from: u, reason: collision with root package name */
    public final String f33412u;

    /* renamed from: v, reason: collision with root package name */
    public final int f33413v;

    /* renamed from: w, reason: collision with root package name */
    public final byte[] f33414w;

    /* renamed from: x, reason: collision with root package name */
    public final String[] f33415x;

    /* renamed from: y, reason: collision with root package name */
    public final String[] f33416y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f33417z;

    public C3746pc(boolean z8, String str, int i, byte[] bArr, String[] strArr, String[] strArr2, boolean z9, long j9) {
        this.f33411n = z8;
        this.f33412u = str;
        this.f33413v = i;
        this.f33414w = bArr;
        this.f33415x = strArr;
        this.f33416y = strArr2;
        this.f33417z = z9;
        this.f33410A = j9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int B8 = S0.f.B(parcel, 20293);
        S0.f.A(parcel, 1, 4);
        parcel.writeInt(this.f33411n ? 1 : 0);
        S0.f.u(parcel, 2, this.f33412u);
        S0.f.A(parcel, 3, 4);
        parcel.writeInt(this.f33413v);
        S0.f.r(parcel, 4, this.f33414w);
        S0.f.v(parcel, 5, this.f33415x);
        S0.f.v(parcel, 6, this.f33416y);
        S0.f.A(parcel, 7, 4);
        parcel.writeInt(this.f33417z ? 1 : 0);
        S0.f.A(parcel, 8, 8);
        parcel.writeLong(this.f33410A);
        S0.f.C(parcel, B8);
    }
}
