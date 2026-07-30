package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.Tf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2790Tf extends P2.a {
    public static final Parcelable.Creator<C2790Tf> CREATOR = new S8(18);

    /* renamed from: n, reason: collision with root package name */
    public final String f27793n;

    /* renamed from: u, reason: collision with root package name */
    public final String f27794u;

    /* renamed from: v, reason: collision with root package name */
    public final q2.g1 f27795v;

    /* renamed from: w, reason: collision with root package name */
    public final q2.d1 f27796w;

    public C2790Tf(String str, String str2, q2.g1 g1Var, q2.d1 d1Var) {
        this.f27793n = str;
        this.f27794u = str2;
        this.f27795v = g1Var;
        this.f27796w = d1Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int B8 = S0.f.B(parcel, 20293);
        S0.f.u(parcel, 1, this.f27793n);
        S0.f.u(parcel, 2, this.f27794u);
        S0.f.t(parcel, 3, this.f27795v, i);
        S0.f.t(parcel, 4, this.f27796w, i);
        S0.f.C(parcel, B8);
    }
}
