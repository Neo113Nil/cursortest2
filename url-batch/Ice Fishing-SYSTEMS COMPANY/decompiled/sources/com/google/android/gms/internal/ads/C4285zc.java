package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.zc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4285zc extends P2.a {
    public static final Parcelable.Creator<C4285zc> CREATOR = new S8(6);

    /* renamed from: n, reason: collision with root package name */
    public final String f35554n;

    /* renamed from: u, reason: collision with root package name */
    public final Bundle f35555u;

    public C4285zc(String str, Bundle bundle) {
        this.f35554n = str;
        this.f35555u = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int B8 = S0.f.B(parcel, 20293);
        S0.f.u(parcel, 1, this.f35554n);
        S0.f.q(parcel, 2, this.f35555u);
        S0.f.C(parcel, B8);
    }
}
