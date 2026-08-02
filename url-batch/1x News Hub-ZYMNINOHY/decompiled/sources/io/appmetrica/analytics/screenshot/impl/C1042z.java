package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: io.appmetrica.analytics.screenshot.impl.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1042z implements Parcelable {
    public static final C1041y CREATOR = new C1041y();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f9080a;

    public C1042z(boolean z) {
        this.f9080a = z;
    }

    public final boolean a() {
        return this.f9080a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "ParcelableApiCaptorConfig(enabled=" + this.f9080a + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeByte(this.f9080a ? (byte) 1 : (byte) 0);
    }

    public C1042z(h0 h0Var) {
        this(h0Var.a());
    }
}
