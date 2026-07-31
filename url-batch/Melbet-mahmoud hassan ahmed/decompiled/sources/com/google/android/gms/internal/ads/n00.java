package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class n00 extends s3.a {
    public static final Parcelable.Creator<n00> CREATOR = new o00();

    /* renamed from: f, reason: collision with root package name */
    public final int f8845f;

    /* renamed from: g, reason: collision with root package name */
    public final int f8846g;

    public n00(int i7, int i8) {
        this.f8845f = i7;
        this.f8846g = i8;
    }

    public n00(r2.u uVar) {
        this.f8845f = uVar.b();
        this.f8846g = uVar.c();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a7 = s3.c.a(parcel);
        s3.c.h(parcel, 1, this.f8845f);
        s3.c.h(parcel, 2, this.f8846g);
        s3.c.b(parcel, a7);
    }
}
