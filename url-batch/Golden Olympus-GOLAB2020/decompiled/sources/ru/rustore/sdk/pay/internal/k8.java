package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.pay.model.InvoiceId;
import ru.rustore.sdk.pay.model.PurchaseId;
import ru.rustore.sdk.pay.model.PurchaseType;
import ru.rustore.sdk.pay.model.Url;

/* loaded from: classes3.dex */
public final class k8 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final Url f44422a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final PurchaseId f44423b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final InvoiceId f44424c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final PurchaseType f44425d;

    public k8(@NotNull Url paymentUrl, @NotNull PurchaseId purchaseId, @NotNull InvoiceId invoiceId, @NotNull PurchaseType purchaseType) {
        Intrinsics.checkNotNullParameter(paymentUrl, "paymentUrl");
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
        Intrinsics.checkNotNullParameter(purchaseType, "purchaseType");
        this.f44422a = paymentUrl;
        this.f44423b = purchaseId;
        this.f44424c = invoiceId;
        this.f44425d = purchaseType;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k8)) {
            return false;
        }
        k8 k8Var = (k8) obj;
        return Intrinsics.areEqual(this.f44422a, k8Var.f44422a) && Intrinsics.areEqual(this.f44423b, k8Var.f44423b) && Intrinsics.areEqual(this.f44424c, k8Var.f44424c) && this.f44425d == k8Var.f44425d;
    }

    public final int hashCode() {
        return this.f44425d.hashCode() + ((this.f44424c.hashCode() + ((this.f44423b.hashCode() + (this.f44422a.hashCode() * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "SberPay(paymentUrl=" + this.f44422a + ", purchaseId=" + this.f44423b + ", invoiceId=" + this.f44424c + ", purchaseType=" + this.f44425d + ')';
    }
}
