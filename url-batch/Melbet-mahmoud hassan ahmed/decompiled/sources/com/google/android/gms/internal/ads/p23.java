package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class p23 extends s3.a {
    public static final Parcelable.Creator<p23> CREATOR = new q23();

    /* renamed from: f, reason: collision with root package name */
    public final int f10034f;

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f10035g;

    /* renamed from: h, reason: collision with root package name */
    public final int f10036h;

    p23(int i7, byte[] bArr, int i8) {
        this.f10034f = i7;
        this.f10035g = bArr == null ? null : Arrays.copyOf(bArr, bArr.length);
        this.f10036h = i8;
    }

    public p23(byte[] bArr, int i7) {
        this(1, null, 1);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a7 = s3.c.a(parcel);
        s3.c.h(parcel, 1, this.f10034f);
        s3.c.e(parcel, 2, this.f10035g, false);
        s3.c.h(parcel, 3, this.f10036h);
        s3.c.b(parcel, a7);
    }
}
