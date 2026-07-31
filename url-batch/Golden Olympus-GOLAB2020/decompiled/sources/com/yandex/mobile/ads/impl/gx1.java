package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class gx1 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<gx1> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f26354b;

    public static final class a implements Parcelable.Creator<gx1> {
        @Override // android.os.Parcelable.Creator
        public final gx1 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new gx1(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final gx1[] newArray(int i4) {
            return new gx1[i4];
        }
    }

    public gx1(@NotNull String rewardUrl) {
        Intrinsics.checkNotNullParameter(rewardUrl, "rewardUrl");
        this.f26354b = rewardUrl;
    }

    @NotNull
    public final String c() {
        return this.f26354b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gx1) && Intrinsics.areEqual(this.f26354b, ((gx1) obj).f26354b);
    }

    public final int hashCode() {
        return this.f26354b.hashCode();
    }

    @NotNull
    public final String toString() {
        return "ServerSideReward(rewardUrl=" + this.f26354b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel out, int i4) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f26354b);
    }
}
