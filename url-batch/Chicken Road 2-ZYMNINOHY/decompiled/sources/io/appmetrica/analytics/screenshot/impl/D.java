package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class D implements Parcelable {
    public static final C CREATOR = new C();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f13409a;

    /* renamed from: b, reason: collision with root package name */
    public final F f13410b;

    public D(boolean z, F f4) {
        this.f13409a = z;
        this.f13410b = f4;
    }

    public final F a() {
        return this.f13410b;
    }

    public final boolean b() {
        return this.f13409a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "ParcelableRemoteScreenshotConfig(enabled=" + this.f13409a + ", config=" + this.f13410b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeByte(this.f13409a ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f13410b, i4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public D(j0 j0Var) {
        this(r0, r3 != null ? new F(r3) : null);
        boolean b4 = j0Var.b();
        k0 a3 = j0Var.a();
    }
}
