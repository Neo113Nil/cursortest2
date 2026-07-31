package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class c80 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<c80> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f24090b;

    /* renamed from: c, reason: collision with root package name */
    private final long f24091c;

    public static final class a implements Parcelable.Creator<c80> {
        @Override // android.os.Parcelable.Creator
        public final c80 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new c80(parcel.readString(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final c80[] newArray(int i4) {
            return new c80[i4];
        }
    }

    public c80(@NotNull String url, long j4) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f24090b = url;
        this.f24091c = j4;
    }

    public final long c() {
        return this.f24091c;
    }

    @NotNull
    public final String d() {
        return this.f24090b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c80)) {
            return false;
        }
        c80 c80Var = (c80) obj;
        return Intrinsics.areEqual(this.f24090b, c80Var.f24090b) && this.f24091c == c80Var.f24091c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f24091c) + (this.f24090b.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "FalseClick(url=" + this.f24090b + ", interval=" + this.f24091c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel out, int i4) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f24090b);
        out.writeLong(this.f24091c);
    }
}
