package ru.rustore.sdk.pay.internal;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class u8 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<s9> f45086a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    public final s9 f45087b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    public final z4 f45088c;

    /* JADX WARN: Multi-variable type inference failed */
    public u8(@NotNull List<? extends s9> paymentMethods, @Nullable s9 s9Var, @Nullable z4 z4Var) {
        Intrinsics.checkNotNullParameter(paymentMethods, "paymentMethods");
        this.f45086a = paymentMethods;
        this.f45087b = s9Var;
        this.f45088c = z4Var;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u8)) {
            return false;
        }
        u8 u8Var = (u8) obj;
        return Intrinsics.areEqual(this.f45086a, u8Var.f45086a) && Intrinsics.areEqual(this.f45087b, u8Var.f45087b) && Intrinsics.areEqual(this.f45088c, u8Var.f45088c);
    }

    public final int hashCode() {
        int hashCode = this.f45086a.hashCode() * 31;
        s9 s9Var = this.f45087b;
        int hashCode2 = (hashCode + (s9Var == null ? 0 : s9Var.hashCode())) * 31;
        z4 z4Var = this.f45088c;
        return hashCode2 + (z4Var != null ? z4Var.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "PaymentExtras(paymentMethods=" + this.f45086a + ", selectedPaymentMethod=" + this.f45087b + ", discount=" + this.f45088c + ')';
    }
}
