package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes.dex */
public final class B implements Parcelable {
    public static final A CREATOR = new A();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f8977a;

    /* renamed from: b, reason: collision with root package name */
    public final List f8978b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8979c;

    public B(boolean z, List list, long j3) {
        this.f8977a = z;
        this.f8978b = list;
        this.f8979c = j3;
    }

    public final long a() {
        return this.f8979c;
    }

    public final boolean b() {
        return this.f8977a;
    }

    public final List c() {
        return this.f8978b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "ParcelableContentObserverCaptorConfig(enabled=" + this.f8977a + ", mediaStoreColumnNames=" + this.f8978b + ", detectWindowSeconds=" + this.f8979c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeByte(this.f8977a ? (byte) 1 : (byte) 0);
        parcel.writeStringList(this.f8978b);
        parcel.writeLong(this.f8979c);
    }

    public B(i0 i0Var) {
        this(i0Var.b(), i0Var.c(), i0Var.a());
    }
}
