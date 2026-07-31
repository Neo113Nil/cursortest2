package ru.rustore.sdk.pay.internal;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class b5 {

    /* renamed from: a, reason: collision with root package name */
    public final long f43853a;

    /* renamed from: b, reason: collision with root package name */
    public final long f43854b;

    /* renamed from: c, reason: collision with root package name */
    public final long f43855c;

    /* renamed from: d, reason: collision with root package name */
    public final long f43856d;

    public b5(long j4, long j5, long j6, long j7) {
        this.f43853a = j4;
        this.f43854b = j5;
        this.f43855c = j6;
        this.f43856d = j7;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b5)) {
            return false;
        }
        b5 b5Var = (b5) obj;
        return this.f43853a == b5Var.f43853a && this.f43854b == b5Var.f43854b && this.f43855c == b5Var.f43855c && this.f43856d == b5Var.f43856d;
    }

    public final int hashCode() {
        return Long.hashCode(0L) + ((Long.hashCode(this.f43856d) + ((Long.hashCode(this.f43855c) + ((Long.hashCode(this.f43854b) + (Long.hashCode(this.f43853a) * 31)) * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "DiscountInfo(originalPrice=" + this.f43853a + ", totalPrice=" + this.f43854b + ", totalDiscount=" + this.f43855c + ", couponDiscount=" + this.f43856d + ", bonusesDiscount=0)";
    }
}
