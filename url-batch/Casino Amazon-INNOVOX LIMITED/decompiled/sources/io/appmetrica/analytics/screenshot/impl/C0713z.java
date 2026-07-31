package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: io.appmetrica.analytics.screenshot.impl.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0713z implements Parcelable {
    public static final C0712y CREATOR = new C0712y();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1749a;

    public C0713z(boolean z) {
        this.f1749a = z;
    }

    public final boolean a() {
        return this.f1749a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "ParcelableApiCaptorConfig(enabled=" + this.f1749a + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.f1749a ? (byte) 1 : (byte) 0);
    }

    public C0713z(h0 h0Var) {
        this(h0Var.a());
    }
}
