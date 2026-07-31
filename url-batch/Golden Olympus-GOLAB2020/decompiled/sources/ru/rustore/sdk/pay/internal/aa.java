package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.pay.model.InvoiceId;
import ru.rustore.sdk.pay.model.PurchaseId;

/* loaded from: classes3.dex */
public final class aa {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final k f43803a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final PurchaseId f43804b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final InvoiceId f43805c;

    public aa(@NotNull k productType, @NotNull InvoiceId invoiceId, @NotNull PurchaseId purchaseId) {
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
        this.f43803a = productType;
        this.f43804b = purchaseId;
        this.f43805c = invoiceId;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aa)) {
            return false;
        }
        aa aaVar = (aa) obj;
        return this.f43803a == aaVar.f43803a && Intrinsics.areEqual(this.f43804b, aaVar.f43804b) && Intrinsics.areEqual(this.f43805c, aaVar.f43805c);
    }

    public final int hashCode() {
        return this.f43805c.hashCode() + ((this.f43804b.hashCode() + (this.f43803a.hashCode() * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "PaymentMethodsAnalyticsParams(productType=" + this.f43803a + ", purchaseId=" + this.f43804b + ", invoiceId=" + this.f43805c + ')';
    }
}
