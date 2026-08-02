package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class F implements Parcelable {
    public static final E CREATOR = new E();

    /* renamed from: a, reason: collision with root package name */
    public final C1167z f13411a;

    /* renamed from: b, reason: collision with root package name */
    public final H f13412b;

    /* renamed from: c, reason: collision with root package name */
    public final B f13413c;

    public F(C1167z c1167z, H h2, B b4) {
        this.f13411a = c1167z;
        this.f13412b = h2;
        this.f13413c = b4;
    }

    public final C1167z a() {
        return this.f13411a;
    }

    public final B b() {
        return this.f13413c;
    }

    public final H c() {
        return this.f13412b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "ParcelableScreenshotConfig(apiCaptorConfig=" + this.f13411a + ", serviceCaptorConfig=" + this.f13412b + ", contentObserverCaptorConfig=" + this.f13413c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeParcelable(this.f13411a, i4);
        parcel.writeParcelable(this.f13412b, i4);
        parcel.writeParcelable(this.f13413c, i4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public F(k0 k0Var) {
        this(r2, r3, r5 != null ? new B(r5) : null);
        h0 a3 = k0Var.a();
        C1167z c1167z = a3 != null ? new C1167z(a3) : null;
        l0 c4 = k0Var.c();
        H h2 = c4 != null ? new H(c4) : null;
        i0 b4 = k0Var.b();
    }
}
