package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class u9 extends d7.a {
    public static final Parcelable.Creator<u9> CREATOR = new o6(4);

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f2850d;

    public u9(byte[] bArr) {
        this.f2850d = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int Z = cf.c.Z(parcel, 20293);
        cf.c.Q(parcel, 2, this.f2850d);
        cf.c.a0(parcel, Z);
    }
}
