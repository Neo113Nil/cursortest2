package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class a23 extends s3.a {
    public static final Parcelable.Creator<a23> CREATOR = new b23();

    /* renamed from: f, reason: collision with root package name */
    public final int f2566f;

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f2567g;

    a23(int i7, byte[] bArr) {
        this.f2566f = i7;
        this.f2567g = bArr;
    }

    public a23(byte[] bArr) {
        this(1, bArr);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a7 = s3.c.a(parcel);
        s3.c.h(parcel, 1, this.f2566f);
        s3.c.e(parcel, 2, this.f2567g, false);
        s3.c.b(parcel, a7);
    }
}
