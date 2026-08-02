package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class H implements Parcelable {
    public static final G CREATOR = new G();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f8985a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8986b;

    public H(boolean z, long j3) {
        this.f8985a = z;
        this.f8986b = j3;
    }

    public final long a() {
        return this.f8986b;
    }

    public final boolean b() {
        return this.f8985a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "ParcelableServiceCaptorConfig(enabled=" + this.f8985a + ", delaySeconds=" + this.f8986b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeByte(this.f8985a ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f8986b);
    }

    public H(l0 l0Var) {
        this(l0Var.b(), l0Var.a());
    }
}
