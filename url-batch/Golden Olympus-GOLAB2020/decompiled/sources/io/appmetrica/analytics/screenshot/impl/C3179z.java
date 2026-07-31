package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.screenshot.impl.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3179z implements Parcelable {

    @NotNull
    public static final C3178y CREATOR = new C3178y();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f40788a;

    /* renamed from: b, reason: collision with root package name */
    public final List f40789b;

    /* renamed from: c, reason: collision with root package name */
    public final long f40790c;

    public C3179z(boolean z4, List list, long j4) {
        this.f40788a = z4;
        this.f40789b = list;
        this.f40790c = j4;
    }

    public final long a() {
        return this.f40790c;
    }

    public final boolean b() {
        return this.f40788a;
    }

    public final List c() {
        return this.f40789b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "ParcelableContentObserverCaptorConfig(enabled=" + this.f40788a + ", mediaStoreColumnNames=" + this.f40789b + ", detectWindowSeconds=" + this.f40790c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeByte(this.f40788a ? (byte) 1 : (byte) 0);
        parcel.writeStringList(this.f40789b);
        parcel.writeLong(this.f40790c);
    }

    public C3179z(f0 f0Var) {
        this(f0Var.b(), f0Var.c(), f0Var.a());
    }
}
