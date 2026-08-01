package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class n6 extends d7.a {
    public static final Parcelable.Creator<n6> CREATOR = new o6(0);

    /* renamed from: d, reason: collision with root package name */
    public final long f2570d;

    /* renamed from: e, reason: collision with root package name */
    public final long f2571e;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f2572i;

    /* renamed from: r, reason: collision with root package name */
    public final Bundle f2573r;

    /* renamed from: s, reason: collision with root package name */
    public final String f2574s;

    public n6(long j, long j3, boolean z10, Bundle bundle, String str) {
        this.f2570d = j;
        this.f2571e = j3;
        this.f2572i = z10;
        this.f2573r = bundle;
        this.f2574s = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int Z = cf.c.Z(parcel, 20293);
        cf.c.Y(parcel, 1, 8);
        parcel.writeLong(this.f2570d);
        cf.c.Y(parcel, 2, 8);
        parcel.writeLong(this.f2571e);
        cf.c.Y(parcel, 3, 4);
        parcel.writeInt(this.f2572i ? 1 : 0);
        cf.c.P(parcel, 7, this.f2573r);
        cf.c.V(parcel, 8, this.f2574s);
        cf.c.a0(parcel, Z);
    }
}
