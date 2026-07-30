package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class R8 extends P2.a {
    public static final Parcelable.Creator<R8> CREATOR = new S8(0);

    /* renamed from: n, reason: collision with root package name */
    public ParcelFileDescriptor f27313n;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f27314u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f27315v;

    /* renamed from: w, reason: collision with root package name */
    public final long f27316w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f27317x;

    public R8(ParcelFileDescriptor parcelFileDescriptor, boolean z8, boolean z9, long j9, boolean z10) {
        this.f27313n = parcelFileDescriptor;
        this.f27314u = z8;
        this.f27315v = z9;
        this.f27316w = j9;
        this.f27317x = z10;
    }

    public final synchronized boolean a() {
        return this.f27313n != null;
    }

    public final synchronized ParcelFileDescriptor.AutoCloseInputStream b() {
        if (this.f27313n == null) {
            return null;
        }
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.f27313n);
        this.f27313n = null;
        return autoCloseInputStream;
    }

    public final synchronized boolean c() {
        return this.f27315v;
    }

    public final synchronized boolean d() {
        return this.f27317x;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ParcelFileDescriptor parcelFileDescriptor;
        boolean z8;
        long j9;
        int B8 = S0.f.B(parcel, 20293);
        synchronized (this) {
            parcelFileDescriptor = this.f27313n;
        }
        S0.f.t(parcel, 2, parcelFileDescriptor, i);
        synchronized (this) {
            z8 = this.f27314u;
        }
        S0.f.A(parcel, 3, 4);
        parcel.writeInt(z8 ? 1 : 0);
        boolean c4 = c();
        S0.f.A(parcel, 4, 4);
        parcel.writeInt(c4 ? 1 : 0);
        synchronized (this) {
            j9 = this.f27316w;
        }
        S0.f.A(parcel, 5, 8);
        parcel.writeLong(j9);
        boolean d2 = d();
        S0.f.A(parcel, 6, 4);
        parcel.writeInt(d2 ? 1 : 0);
        S0.f.C(parcel, B8);
    }

    public R8() {
        this(null, false, false, 0L, false);
    }
}
