package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class F implements Parcelable {
    public static final E CREATOR = new E();

    /* renamed from: a, reason: collision with root package name */
    public final C1042z f8982a;

    /* renamed from: b, reason: collision with root package name */
    public final H f8983b;

    /* renamed from: c, reason: collision with root package name */
    public final B f8984c;

    public F(C1042z c1042z, H h3, B b3) {
        this.f8982a = c1042z;
        this.f8983b = h3;
        this.f8984c = b3;
    }

    public final C1042z a() {
        return this.f8982a;
    }

    public final B b() {
        return this.f8984c;
    }

    public final H c() {
        return this.f8983b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "ParcelableScreenshotConfig(apiCaptorConfig=" + this.f8982a + ", serviceCaptorConfig=" + this.f8983b + ", contentObserverCaptorConfig=" + this.f8984c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeParcelable(this.f8982a, i3);
        parcel.writeParcelable(this.f8983b, i3);
        parcel.writeParcelable(this.f8984c, i3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public F(k0 k0Var) {
        this(r2, r3, r5 != null ? new B(r5) : null);
        h0 a3 = k0Var.a();
        C1042z c1042z = a3 != null ? new C1042z(a3) : null;
        l0 c3 = k0Var.c();
        H h3 = c3 != null ? new H(c3) : null;
        i0 b3 = k0Var.b();
    }
}
