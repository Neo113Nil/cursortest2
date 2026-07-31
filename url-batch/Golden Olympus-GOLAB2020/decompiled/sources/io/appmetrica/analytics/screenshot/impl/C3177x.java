package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.screenshot.impl.x, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3177x implements Parcelable {

    @NotNull
    public static final C3176w CREATOR = new C3176w();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f40787a;

    public C3177x(boolean z4) {
        this.f40787a = z4;
    }

    public final boolean a() {
        return this.f40787a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "ParcelableApiCaptorConfig(enabled=" + this.f40787a + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeByte(this.f40787a ? (byte) 1 : (byte) 0);
    }

    public C3177x(e0 e0Var) {
        this(e0Var.a());
    }
}
