package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class z4 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final o4 f45311a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final b5 f45312b;

    public z4(@NotNull o4 coupons, @NotNull b5 info) {
        k2 bonuses = k2.f44412a;
        Intrinsics.checkNotNullParameter(coupons, "coupons");
        Intrinsics.checkNotNullParameter(bonuses, "bonuses");
        Intrinsics.checkNotNullParameter(info, "info");
        this.f45311a = coupons;
        this.f45312b = info;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z4)) {
            return false;
        }
        z4 z4Var = (z4) obj;
        if (!Intrinsics.areEqual(this.f45311a, z4Var.f45311a)) {
            return false;
        }
        k2 k2Var = k2.f44412a;
        return Intrinsics.areEqual(k2Var, k2Var) && Intrinsics.areEqual(this.f45312b, z4Var.f45312b);
    }

    public final int hashCode() {
        return this.f45312b.hashCode() + ((k2.f44412a.hashCode() + (this.f45311a.hashCode() * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "Discount(coupons=" + this.f45311a + ", bonuses=" + k2.f44412a + ", info=" + this.f45312b + ')';
    }
}
