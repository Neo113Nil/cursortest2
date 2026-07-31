package ru.rustore.sdk.pay.internal;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class d3 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<e3> f43953a;

    /* renamed from: b, reason: collision with root package name */
    public final long f43954b;

    public d3(@NotNull List<e3> coupons, long j4) {
        Intrinsics.checkNotNullParameter(coupons, "coupons");
        this.f43953a = coupons;
        this.f43954b = j4;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d3)) {
            return false;
        }
        d3 d3Var = (d3) obj;
        return Intrinsics.areEqual(this.f43953a, d3Var.f43953a) && this.f43954b == d3Var.f43954b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f43954b) + (this.f43953a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "CouponCancelSelectionResultDto(coupons=" + this.f43953a + ", originalPrice=" + this.f43954b + ')';
    }
}
