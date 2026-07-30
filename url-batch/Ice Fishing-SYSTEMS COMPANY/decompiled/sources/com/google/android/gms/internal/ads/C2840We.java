package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.We, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2840We extends P2.a {
    public static final Parcelable.Creator<C2840We> CREATOR = new S8(14);

    /* renamed from: n, reason: collision with root package name */
    public final q2.d1 f28417n;

    /* renamed from: u, reason: collision with root package name */
    public final String f28418u;

    public C2840We(String str, q2.d1 d1Var) {
        this.f28417n = d1Var;
        this.f28418u = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int B8 = S0.f.B(parcel, 20293);
        S0.f.t(parcel, 2, this.f28417n, i);
        S0.f.u(parcel, 3, this.f28418u);
        S0.f.C(parcel, B8);
    }
}
