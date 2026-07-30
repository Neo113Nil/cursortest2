package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.rf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3856rf extends P2.a {
    public static final Parcelable.Creator<C3856rf> CREATOR = new S8(16);

    /* renamed from: n, reason: collision with root package name */
    public final String f34047n;

    /* renamed from: u, reason: collision with root package name */
    public final String f34048u;

    public C3856rf(String str, String str2) {
        this.f34047n = str;
        this.f34048u = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int B8 = S0.f.B(parcel, 20293);
        S0.f.u(parcel, 1, this.f34047n);
        S0.f.u(parcel, 2, this.f34048u);
        S0.f.C(parcel, B8);
    }
}
