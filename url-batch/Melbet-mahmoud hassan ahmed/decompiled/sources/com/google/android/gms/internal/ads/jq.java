package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class jq extends s3.a {
    public static final Parcelable.Creator<jq> CREATOR = new kq();

    /* renamed from: f, reason: collision with root package name */
    private ParcelFileDescriptor f7210f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f7211g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f7212h;

    /* renamed from: i, reason: collision with root package name */
    private final long f7213i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f7214j;

    public jq() {
        this(null, false, false, 0L, false);
    }

    public jq(ParcelFileDescriptor parcelFileDescriptor, boolean z6, boolean z7, long j7, boolean z8) {
        this.f7210f = parcelFileDescriptor;
        this.f7211g = z6;
        this.f7212h = z7;
        this.f7213i = j7;
        this.f7214j = z8;
    }

    public final synchronized long c() {
        return this.f7213i;
    }

    final synchronized ParcelFileDescriptor g() {
        return this.f7210f;
    }

    public final synchronized InputStream h() {
        ParcelFileDescriptor parcelFileDescriptor = this.f7210f;
        if (parcelFileDescriptor == null) {
            return null;
        }
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        this.f7210f = null;
        return autoCloseInputStream;
    }

    public final synchronized boolean i() {
        return this.f7211g;
    }

    public final synchronized boolean j() {
        return this.f7210f != null;
    }

    public final synchronized boolean k() {
        return this.f7212h;
    }

    public final synchronized boolean l() {
        return this.f7214j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a7 = s3.c.a(parcel);
        s3.c.l(parcel, 2, g(), i7, false);
        s3.c.c(parcel, 3, i());
        s3.c.c(parcel, 4, k());
        s3.c.k(parcel, 5, c());
        s3.c.c(parcel, 6, l());
        s3.c.b(parcel, a7);
    }
}
