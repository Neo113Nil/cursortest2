package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class xj {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f45233a;

    /* renamed from: b, reason: collision with root package name */
    public final long f45234b;

    /* renamed from: c, reason: collision with root package name */
    public final long f45235c;

    /* renamed from: d, reason: collision with root package name */
    public final long f45236d;

    public xj(@NotNull String couponId, long j4, long j5, long j6) {
        Intrinsics.checkNotNullParameter(couponId, "couponId");
        this.f45233a = couponId;
        this.f45234b = j4;
        this.f45235c = j5;
        this.f45236d = j6;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xj)) {
            return false;
        }
        xj xjVar = (xj) obj;
        return Intrinsics.areEqual(this.f45233a, xjVar.f45233a) && this.f45234b == xjVar.f45234b && this.f45235c == xjVar.f45235c && this.f45236d == xjVar.f45236d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f45236d) + ((Long.hashCode(this.f45235c) + ((Long.hashCode(this.f45234b) + (this.f45233a.hashCode() * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "SelectedCouponInfoDto(couponId=" + this.f45233a + ", oldPrice=" + this.f45234b + ", newPrice=" + this.f45235c + ", discount=" + this.f45236d + ')';
    }
}
