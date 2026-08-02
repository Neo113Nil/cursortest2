package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class H implements Parcelable {
    public static final G CREATOR = new G();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f13414a;

    /* renamed from: b, reason: collision with root package name */
    public final long f13415b;

    public H(boolean z, long j4) {
        this.f13414a = z;
        this.f13415b = j4;
    }

    public final long a() {
        return this.f13415b;
    }

    public final boolean b() {
        return this.f13414a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "ParcelableServiceCaptorConfig(enabled=" + this.f13414a + ", delaySeconds=" + this.f13415b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeByte(this.f13414a ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f13415b);
    }

    public H(l0 l0Var) {
        this(l0Var.b(), l0Var.a());
    }
}
