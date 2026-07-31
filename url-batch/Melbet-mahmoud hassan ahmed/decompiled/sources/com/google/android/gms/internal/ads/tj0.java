package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class tj0 extends s3.a {
    public static final Parcelable.Creator<tj0> CREATOR = new uj0();

    /* renamed from: f, reason: collision with root package name */
    public final kv f12234f;

    /* renamed from: g, reason: collision with root package name */
    public final String f12235g;

    public tj0(kv kvVar, String str) {
        this.f12234f = kvVar;
        this.f12235g = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a7 = s3.c.a(parcel);
        s3.c.l(parcel, 2, this.f12234f, i7, false);
        s3.c.m(parcel, 3, this.f12235g, false);
        s3.c.b(parcel, a7);
    }
}
