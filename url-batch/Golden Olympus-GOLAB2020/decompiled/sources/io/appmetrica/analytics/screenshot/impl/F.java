package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class F implements Parcelable {

    @NotNull
    public static final E CREATOR = new E();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f40695a;

    /* renamed from: b, reason: collision with root package name */
    public final long f40696b;

    public F(boolean z4, long j4) {
        this.f40695a = z4;
        this.f40696b = j4;
    }

    public final long a() {
        return this.f40696b;
    }

    public final boolean b() {
        return this.f40695a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "ParcelableServiceCaptorConfig(enabled=" + this.f40695a + ", delaySeconds=" + this.f40696b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeByte(this.f40695a ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f40696b);
    }

    public F(i0 i0Var) {
        this(i0Var.b(), i0Var.a());
    }
}
