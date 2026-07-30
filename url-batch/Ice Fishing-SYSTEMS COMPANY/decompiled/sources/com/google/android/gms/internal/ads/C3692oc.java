package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.oc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3692oc extends P2.a {
    public static final Parcelable.Creator<C3692oc> CREATOR = new S8(3);

    /* renamed from: n, reason: collision with root package name */
    public final String f33153n;

    /* renamed from: u, reason: collision with root package name */
    public final String[] f33154u;

    /* renamed from: v, reason: collision with root package name */
    public final String[] f33155v;

    public C3692oc(String str, String[] strArr, String[] strArr2) {
        this.f33153n = str;
        this.f33154u = strArr;
        this.f33155v = strArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int B8 = S0.f.B(parcel, 20293);
        S0.f.u(parcel, 1, this.f33153n);
        S0.f.v(parcel, 2, this.f33154u);
        S0.f.v(parcel, 3, this.f33155v);
        S0.f.C(parcel, B8);
    }
}
