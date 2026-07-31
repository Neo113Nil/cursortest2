package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class nr1 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<nr1> CREATOR = new b();

    /* renamed from: b, reason: collision with root package name */
    private final boolean f29746b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final uo f29747c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private final gx1 f29748d;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f29749a;

        /* renamed from: b, reason: collision with root package name */
        @Nullable
        private uo f29750b;

        /* renamed from: c, reason: collision with root package name */
        @Nullable
        private gx1 f29751c;

        @NotNull
        public final a a(@Nullable uo uoVar) {
            this.f29750b = uoVar;
            return this;
        }

        @NotNull
        public final a a(@Nullable gx1 gx1Var) {
            this.f29751c = gx1Var;
            return this;
        }

        @NotNull
        public final a a(boolean z4) {
            this.f29749a = z4;
            return this;
        }

        @NotNull
        public final nr1 a() {
            return new nr1(this.f29749a, this.f29750b, this.f29751c);
        }
    }

    public static final class b implements Parcelable.Creator<nr1> {
        @Override // android.os.Parcelable.Creator
        public final nr1 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new nr1(parcel.readInt() != 0, parcel.readInt() == 0 ? null : uo.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? gx1.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final nr1[] newArray(int i4) {
            return new nr1[i4];
        }
    }

    public nr1(boolean z4, @Nullable uo uoVar, @Nullable gx1 gx1Var) {
        this.f29746b = z4;
        this.f29747c = uoVar;
        this.f29748d = gx1Var;
    }

    @Nullable
    public final uo c() {
        return this.f29747c;
    }

    @Nullable
    public final gx1 d() {
        return this.f29748d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.f29746b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nr1)) {
            return false;
        }
        nr1 nr1Var = (nr1) obj;
        return this.f29746b == nr1Var.f29746b && Intrinsics.areEqual(this.f29747c, nr1Var.f29747c) && Intrinsics.areEqual(this.f29748d, nr1Var.f29748d);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.f29746b) * 31;
        uo uoVar = this.f29747c;
        int hashCode2 = (hashCode + (uoVar == null ? 0 : uoVar.hashCode())) * 31;
        gx1 gx1Var = this.f29748d;
        return hashCode2 + (gx1Var != null ? gx1Var.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "RewardData(serverSideRewardType=" + this.f29746b + ", clientSideReward=" + this.f29747c + ", serverSideReward=" + this.f29748d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel out, int i4) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeInt(this.f29746b ? 1 : 0);
        uo uoVar = this.f29747c;
        if (uoVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            uoVar.writeToParcel(out, i4);
        }
        gx1 gx1Var = this.f29748d;
        if (gx1Var == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            gx1Var.writeToParcel(out, i4);
        }
    }
}
