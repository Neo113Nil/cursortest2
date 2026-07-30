package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.uc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4015uc extends P2.a {
    public static final Parcelable.Creator<C4015uc> CREATOR = new S8(5);

    /* renamed from: n, reason: collision with root package name */
    public final String f34620n;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f34621u;

    /* renamed from: v, reason: collision with root package name */
    public final int f34622v;

    /* renamed from: w, reason: collision with root package name */
    public final String f34623w;

    public C4015uc(String str, int i, String str2, boolean z8) {
        this.f34620n = str;
        this.f34621u = z8;
        this.f34622v = i;
        this.f34623w = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int B8 = S0.f.B(parcel, 20293);
        S0.f.u(parcel, 1, this.f34620n);
        S0.f.A(parcel, 2, 4);
        parcel.writeInt(this.f34621u ? 1 : 0);
        S0.f.A(parcel, 3, 4);
        parcel.writeInt(this.f34622v);
        S0.f.u(parcel, 4, this.f34623w);
        S0.f.C(parcel, B8);
    }
}
