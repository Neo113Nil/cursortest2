package ru.rustore.sdk.pay.internal;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class a9 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<v9> f43799a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<e3> f43800b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    public final xj f43801c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    public final v9 f43802d;

    public a9(@NotNull List<v9> availablePaymentMethods, @NotNull List<e3> availableCoupons, @Nullable xj xjVar, @Nullable v9 v9Var) {
        Intrinsics.checkNotNullParameter(availablePaymentMethods, "availablePaymentMethods");
        Intrinsics.checkNotNullParameter(availableCoupons, "availableCoupons");
        this.f43799a = availablePaymentMethods;
        this.f43800b = availableCoupons;
        this.f43801c = xjVar;
        this.f43802d = v9Var;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a9)) {
            return false;
        }
        a9 a9Var = (a9) obj;
        return Intrinsics.areEqual(this.f43799a, a9Var.f43799a) && Intrinsics.areEqual(this.f43800b, a9Var.f43800b) && Intrinsics.areEqual(this.f43801c, a9Var.f43801c) && Intrinsics.areEqual(this.f43802d, a9Var.f43802d);
    }

    public final int hashCode() {
        int hashCode = (this.f43800b.hashCode() + (this.f43799a.hashCode() * 31)) * 31;
        xj xjVar = this.f43801c;
        int hashCode2 = (hashCode + (xjVar == null ? 0 : xjVar.hashCode())) * 31;
        v9 v9Var = this.f43802d;
        return hashCode2 + (v9Var != null ? v9Var.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "PaymentExtrasDtoDeprecated(availablePaymentMethods=" + this.f43799a + ", availableCoupons=" + this.f43800b + ", selectedCouponInfo=" + this.f43801c + ", selectedPaymentMethod=" + this.f43802d + ')';
    }
}
