package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.pay.model.InvoiceId;
import ru.rustore.sdk.pay.model.PurchaseId;
import ru.rustore.sdk.pay.model.PurchaseType;
import ru.rustore.sdk.pay.model.Url;

/* loaded from: classes3.dex */
public final class h8 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final Url f44221a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final PurchaseId f44222b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final InvoiceId f44223c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final PurchaseType f44224d;

    public h8(@NotNull Url paymentUrl, @NotNull PurchaseId purchaseId, @NotNull InvoiceId invoiceId, @NotNull PurchaseType purchaseType) {
        Intrinsics.checkNotNullParameter(paymentUrl, "paymentUrl");
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
        Intrinsics.checkNotNullParameter(purchaseType, "purchaseType");
        this.f44221a = paymentUrl;
        this.f44222b = purchaseId;
        this.f44223c = invoiceId;
        this.f44224d = purchaseType;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h8)) {
            return false;
        }
        h8 h8Var = (h8) obj;
        return Intrinsics.areEqual(this.f44221a, h8Var.f44221a) && Intrinsics.areEqual(this.f44222b, h8Var.f44222b) && Intrinsics.areEqual(this.f44223c, h8Var.f44223c) && this.f44224d == h8Var.f44224d;
    }

    public final int hashCode() {
        return this.f44224d.hashCode() + ((this.f44223c.hashCode() + ((this.f44222b.hashCode() + (this.f44221a.hashCode() * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "MobilePhone(paymentUrl=" + this.f44221a + ", purchaseId=" + this.f44222b + ", invoiceId=" + this.f44223c + ", purchaseType=" + this.f44224d + ')';
    }
}
