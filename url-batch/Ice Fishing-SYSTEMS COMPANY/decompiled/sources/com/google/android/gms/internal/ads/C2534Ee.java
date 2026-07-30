package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.Ee, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2534Ee extends P2.a {
    public static final Parcelable.Creator<C2534Ee> CREATOR = new S8(12);

    /* renamed from: n, reason: collision with root package name */
    public final String f24776n;

    public C2534Ee(String str) {
        this.f24776n = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int B8 = S0.f.B(parcel, 20293);
        S0.f.u(parcel, 1, this.f24776n);
        S0.f.C(parcel, B8);
    }
}
