package ru.rustore.sdk.pay.internal;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class g4 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<e3> f44155a;

    /* renamed from: b, reason: collision with root package name */
    public final long f44156b;

    /* renamed from: c, reason: collision with root package name */
    public final long f44157c;

    /* renamed from: d, reason: collision with root package name */
    public final long f44158d;

    public g4(@NotNull List<e3> coupons, long j4, long j5, long j6) {
        Intrinsics.checkNotNullParameter(coupons, "coupons");
        this.f44155a = coupons;
        this.f44156b = j4;
        this.f44157c = j5;
        this.f44158d = j6;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g4)) {
            return false;
        }
        g4 g4Var = (g4) obj;
        return Intrinsics.areEqual(this.f44155a, g4Var.f44155a) && this.f44156b == g4Var.f44156b && this.f44157c == g4Var.f44157c && this.f44158d == g4Var.f44158d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f44158d) + ((Long.hashCode(this.f44157c) + ((Long.hashCode(this.f44156b) + (this.f44155a.hashCode() * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "CouponSelectionResultDto(coupons=" + this.f44155a + ", oldPrice=" + this.f44156b + ", newPrice=" + this.f44157c + ", discount=" + this.f44158d + ')';
    }
}
