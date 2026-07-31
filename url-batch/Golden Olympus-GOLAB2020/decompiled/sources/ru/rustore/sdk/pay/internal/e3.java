package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class e3 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f43993a;

    /* renamed from: b, reason: collision with root package name */
    public final long f43994b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f43995c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final j3 f43996d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f43997e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public final String f43998f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    public final String f43999g;

    public e3(@NotNull String id, long j4, @NotNull String shortDescription, @NotNull j3 couponInterval, @NotNull String status, @Nullable String str, @NotNull String segment) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(shortDescription, "shortDescription");
        Intrinsics.checkNotNullParameter(couponInterval, "couponInterval");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(segment, "segment");
        this.f43993a = id;
        this.f43994b = j4;
        this.f43995c = shortDescription;
        this.f43996d = couponInterval;
        this.f43997e = status;
        this.f43998f = str;
        this.f43999g = segment;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e3)) {
            return false;
        }
        e3 e3Var = (e3) obj;
        return Intrinsics.areEqual(this.f43993a, e3Var.f43993a) && this.f43994b == e3Var.f43994b && Intrinsics.areEqual(this.f43995c, e3Var.f43995c) && Intrinsics.areEqual(this.f43996d, e3Var.f43996d) && Intrinsics.areEqual(this.f43997e, e3Var.f43997e) && Intrinsics.areEqual(this.f43998f, e3Var.f43998f) && Intrinsics.areEqual(this.f43999g, e3Var.f43999g);
    }

    public final int hashCode() {
        int a4 = j1.a(this.f43997e, (this.f43996d.hashCode() + j1.a(this.f43995c, (Long.hashCode(this.f43994b) + (this.f43993a.hashCode() * 31)) * 31, 31)) * 31, 31);
        String str = this.f43998f;
        return this.f43999g.hashCode() + ((a4 + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("CouponDto(id=");
        sb.append(this.f43993a);
        sb.append(", nominal=");
        sb.append(this.f43994b);
        sb.append(", shortDescription=");
        sb.append(this.f43995c);
        sb.append(", couponInterval=");
        sb.append(this.f43996d);
        sb.append(", status=");
        sb.append(this.f43997e);
        sb.append(", resolution=");
        sb.append(this.f43998f);
        sb.append(", segment=");
        return i1.a(sb, this.f43999g, ')');
    }
}
