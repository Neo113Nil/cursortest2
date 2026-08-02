package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: io.appmetrica.analytics.screenshot.impl.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1167z implements Parcelable {
    public static final C1166y CREATOR = new C1166y();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f13510a;

    public C1167z(boolean z) {
        this.f13510a = z;
    }

    public final boolean a() {
        return this.f13510a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "ParcelableApiCaptorConfig(enabled=" + this.f13510a + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeByte(this.f13510a ? (byte) 1 : (byte) 0);
    }

    public C1167z(h0 h0Var) {
        this(h0Var.a());
    }
}
