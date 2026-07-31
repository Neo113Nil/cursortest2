package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class uo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<uo> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    private final int f33218b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f33219c;

    public static final class a implements Parcelable.Creator<uo> {
        @Override // android.os.Parcelable.Creator
        public final uo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new uo(parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final uo[] newArray(int i4) {
            return new uo[i4];
        }
    }

    public uo(int i4, @NotNull String rewardType) {
        Intrinsics.checkNotNullParameter(rewardType, "rewardType");
        this.f33218b = i4;
        this.f33219c = rewardType;
    }

    public final int c() {
        return this.f33218b;
    }

    @NotNull
    public final String d() {
        return this.f33219c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uo)) {
            return false;
        }
        uo uoVar = (uo) obj;
        return this.f33218b == uoVar.f33218b && Intrinsics.areEqual(this.f33219c, uoVar.f33219c);
    }

    public final int hashCode() {
        return this.f33219c.hashCode() + (Integer.hashCode(this.f33218b) * 31);
    }

    @NotNull
    public final String toString() {
        return "ClientSideReward(rewardAmount=" + this.f33218b + ", rewardType=" + this.f33219c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel out, int i4) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeInt(this.f33218b);
        out.writeString(this.f33219c);
    }
}
