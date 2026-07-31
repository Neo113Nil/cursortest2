package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.pay.model.InvoiceId;
import ru.rustore.sdk.pay.model.PurchaseId;
import ru.rustore.sdk.pay.model.PurchaseType;
import ru.rustore.sdk.pay.model.Url;

/* loaded from: classes3.dex */
public final class j8 {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    public final Url f44365a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final PurchaseId f44366b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final InvoiceId f44367c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final PurchaseType f44368d;

    public j8(@Nullable Url url, @NotNull PurchaseId purchaseId, @NotNull InvoiceId invoiceId, @NotNull PurchaseType purchaseType) {
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
        Intrinsics.checkNotNullParameter(purchaseType, "purchaseType");
        this.f44365a = url;
        this.f44366b = purchaseId;
        this.f44367c = invoiceId;
        this.f44368d = purchaseType;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j8)) {
            return false;
        }
        j8 j8Var = (j8) obj;
        return Intrinsics.areEqual(this.f44365a, j8Var.f44365a) && Intrinsics.areEqual(this.f44366b, j8Var.f44366b) && Intrinsics.areEqual(this.f44367c, j8Var.f44367c) && this.f44368d == j8Var.f44368d;
    }

    public final int hashCode() {
        Url url = this.f44365a;
        return this.f44368d.hashCode() + ((this.f44367c.hashCode() + ((this.f44366b.hashCode() + ((url == null ? 0 : url.hashCode()) * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "SavedCard(paymentUrl=" + this.f44365a + ", purchaseId=" + this.f44366b + ", invoiceId=" + this.f44367c + ", purchaseType=" + this.f44368d + ')';
    }
}
