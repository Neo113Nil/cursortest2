package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.pay.model.InvoiceId;
import ru.rustore.sdk.pay.model.PurchaseId;
import ru.rustore.sdk.pay.model.PurchaseType;
import ru.rustore.sdk.pay.model.Url;

/* loaded from: classes3.dex */
public final class l8 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final Url f44506a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final PurchaseId f44507b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final InvoiceId f44508c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final PurchaseType f44509d;

    public l8(@NotNull Url paymentUrl, @NotNull PurchaseId purchaseId, @NotNull InvoiceId invoiceId, @NotNull PurchaseType purchaseType) {
        Intrinsics.checkNotNullParameter(paymentUrl, "paymentUrl");
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
        Intrinsics.checkNotNullParameter(purchaseType, "purchaseType");
        this.f44506a = paymentUrl;
        this.f44507b = purchaseId;
        this.f44508c = invoiceId;
        this.f44509d = purchaseType;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l8)) {
            return false;
        }
        l8 l8Var = (l8) obj;
        return Intrinsics.areEqual(this.f44506a, l8Var.f44506a) && Intrinsics.areEqual(this.f44507b, l8Var.f44507b) && Intrinsics.areEqual(this.f44508c, l8Var.f44508c) && this.f44509d == l8Var.f44509d;
    }

    public final int hashCode() {
        return this.f44509d.hashCode() + ((this.f44508c.hashCode() + ((this.f44507b.hashCode() + (this.f44506a.hashCode() * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "Sbp(paymentUrl=" + this.f44506a + ", purchaseId=" + this.f44507b + ", invoiceId=" + this.f44508c + ", purchaseType=" + this.f44509d + ')';
    }
}
