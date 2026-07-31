package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class B implements Parcelable {

    @NotNull
    public static final A CREATOR = new A();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f40690a;

    /* renamed from: b, reason: collision with root package name */
    public final D f40691b;

    public B(boolean z4, D d4) {
        this.f40690a = z4;
        this.f40691b = d4;
    }

    public final D a() {
        return this.f40691b;
    }

    public final boolean b() {
        return this.f40690a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "ParcelableRemoteScreenshotConfig(enabled=" + this.f40690a + ", config=" + this.f40691b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeByte(this.f40690a ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f40691b, i4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public B(g0 g0Var) {
        this(r0, r3 != null ? new D(r3) : null);
        boolean b4 = g0Var.b();
        h0 a4 = g0Var.a();
    }
}
