package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;
import b2.AbstractC0279e;

/* loaded from: classes.dex */
public final class H implements Parcelable {
    public static final G CREATOR = new G();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f9965a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9966b;

    public H(boolean z, long j2) {
        this.f9965a = z;
        this.f9966b = j2;
    }

    public final long a() {
        return this.f9966b;
    }

    public final boolean b() {
        return this.f9965a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParcelableServiceCaptorConfig(enabled=");
        sb.append(this.f9965a);
        sb.append(", delaySeconds=");
        return AbstractC0279e.g(sb, this.f9966b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeByte(this.f9965a ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f9966b);
    }

    public H(l0 l0Var) {
        this(l0Var.b(), l0Var.a());
    }
}
