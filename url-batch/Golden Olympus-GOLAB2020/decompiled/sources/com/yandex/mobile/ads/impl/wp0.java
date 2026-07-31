package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class wp0 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<wp0> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f34157b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f34158c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f34159d;

    public static final class a implements Parcelable.Creator<wp0> {
        @Override // android.os.Parcelable.Creator
        public final wp0 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new wp0(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final wp0[] newArray(int i4) {
            return new wp0[i4];
        }
    }

    public wp0(@NotNull String apiFramework, @NotNull String url, boolean z4) {
        Intrinsics.checkNotNullParameter(apiFramework, "apiFramework");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f34157b = apiFramework;
        this.f34158c = url;
        this.f34159d = z4;
    }

    @NotNull
    public final String c() {
        return this.f34157b;
    }

    @NotNull
    public final String d() {
        return this.f34158c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wp0)) {
            return false;
        }
        wp0 wp0Var = (wp0) obj;
        return Intrinsics.areEqual(this.f34157b, wp0Var.f34157b) && Intrinsics.areEqual(this.f34158c, wp0Var.f34158c) && this.f34159d == wp0Var.f34159d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f34159d) + C1842c3.a(this.f34158c, this.f34157b.hashCode() * 31, 31);
    }

    @NotNull
    public final String toString() {
        return "JavaScriptResource(apiFramework=" + this.f34157b + ", url=" + this.f34158c + ", browserOptional=" + this.f34159d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel out, int i4) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f34157b);
        out.writeString(this.f34158c);
        out.writeInt(this.f34159d ? 1 : 0);
    }
}
