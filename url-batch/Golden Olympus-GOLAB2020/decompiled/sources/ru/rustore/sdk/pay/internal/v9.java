package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class v9 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f45122a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    public final v2 f45123b;

    public v9(@NotNull String paymentMethod, @Nullable v2 v2Var) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        this.f45122a = paymentMethod;
        this.f45123b = v2Var;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v9)) {
            return false;
        }
        v9 v9Var = (v9) obj;
        return Intrinsics.areEqual(this.f45122a, v9Var.f45122a) && Intrinsics.areEqual(this.f45123b, v9Var.f45123b);
    }

    public final int hashCode() {
        int hashCode = this.f45122a.hashCode() * 31;
        v2 v2Var = this.f45123b;
        return hashCode + (v2Var == null ? 0 : v2Var.hashCode());
    }

    @NotNull
    public final String toString() {
        return "PaymentMethodDto(paymentMethod=" + this.f45122a + ", cardInfo=" + this.f45123b + ')';
    }
}
