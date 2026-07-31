package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class D implements Parcelable {

    @NotNull
    public static final C CREATOR = new C();

    /* renamed from: a, reason: collision with root package name */
    public final C3177x f40692a;

    /* renamed from: b, reason: collision with root package name */
    public final F f40693b;

    /* renamed from: c, reason: collision with root package name */
    public final C3179z f40694c;

    public D(C3177x c3177x, F f4, C3179z c3179z) {
        this.f40692a = c3177x;
        this.f40693b = f4;
        this.f40694c = c3179z;
    }

    public final C3177x a() {
        return this.f40692a;
    }

    public final C3179z b() {
        return this.f40694c;
    }

    public final F c() {
        return this.f40693b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "ParcelableScreenshotConfig(apiCaptorConfig=" + this.f40692a + ", serviceCaptorConfig=" + this.f40693b + ", contentObserverCaptorConfig=" + this.f40694c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeParcelable(this.f40692a, i4);
        parcel.writeParcelable(this.f40693b, i4);
        parcel.writeParcelable(this.f40694c, i4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public D(h0 h0Var) {
        this(r2, r3, r5 != null ? new C3179z(r5) : null);
        e0 a4 = h0Var.a();
        C3177x c3177x = a4 != null ? new C3177x(a4) : null;
        i0 c4 = h0Var.c();
        F f4 = c4 != null ? new F(c4) : null;
        f0 b4 = h0Var.b();
    }
}
