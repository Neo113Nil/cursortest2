package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.pay.model.InvoiceId;

/* loaded from: classes3.dex */
public final class l3 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final k f44501a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final InvoiceId f44502b;

    public l3(@NotNull k productType, @NotNull InvoiceId invoiceId) {
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
        this.f44501a = productType;
        this.f44502b = invoiceId;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l3)) {
            return false;
        }
        l3 l3Var = (l3) obj;
        return this.f44501a == l3Var.f44501a && Intrinsics.areEqual(this.f44502b, l3Var.f44502b);
    }

    public final int hashCode() {
        return this.f44502b.hashCode() + (this.f44501a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "CouponListAnalyticsParams(productType=" + this.f44501a + ", invoiceId=" + this.f44502b + ')';
    }
}
