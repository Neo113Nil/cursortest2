package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes.dex */
public final class B implements Parcelable {
    public static final A CREATOR = new A();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f13406a;

    /* renamed from: b, reason: collision with root package name */
    public final List f13407b;

    /* renamed from: c, reason: collision with root package name */
    public final long f13408c;

    public B(boolean z, List list, long j4) {
        this.f13406a = z;
        this.f13407b = list;
        this.f13408c = j4;
    }

    public final long a() {
        return this.f13408c;
    }

    public final boolean b() {
        return this.f13406a;
    }

    public final List c() {
        return this.f13407b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "ParcelableContentObserverCaptorConfig(enabled=" + this.f13406a + ", mediaStoreColumnNames=" + this.f13407b + ", detectWindowSeconds=" + this.f13408c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeByte(this.f13406a ? (byte) 1 : (byte) 0);
        parcel.writeStringList(this.f13407b);
        parcel.writeLong(this.f13408c);
    }

    public B(i0 i0Var) {
        this(i0Var.b(), i0Var.c(), i0Var.a());
    }
}
