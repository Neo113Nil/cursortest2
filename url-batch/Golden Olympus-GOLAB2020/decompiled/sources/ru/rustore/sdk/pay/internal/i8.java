package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.pay.model.InvoiceId;
import ru.rustore.sdk.pay.model.PurchaseId;
import ru.rustore.sdk.pay.model.PurchaseType;
import ru.rustore.sdk.pay.model.Url;

/* loaded from: classes3.dex */
public final class i8 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final Url f44316a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final PurchaseId f44317b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final InvoiceId f44318c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final PurchaseType f44319d;

    public i8(@NotNull Url paymentUrl, @NotNull PurchaseId purchaseId, @NotNull InvoiceId invoiceId, @NotNull PurchaseType purchaseType) {
        Intrinsics.checkNotNullParameter(paymentUrl, "paymentUrl");
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
        Intrinsics.checkNotNullParameter(purchaseType, "purchaseType");
        this.f44316a = paymentUrl;
        this.f44317b = purchaseId;
        this.f44318c = invoiceId;
        this.f44319d = purchaseType;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i8)) {
            return false;
        }
        i8 i8Var = (i8) obj;
        return Intrinsics.areEqual(this.f44316a, i8Var.f44316a) && Intrinsics.areEqual(this.f44317b, i8Var.f44317b) && Intrinsics.areEqual(this.f44318c, i8Var.f44318c) && this.f44319d == i8Var.f44319d;
    }

    public final int hashCode() {
        return this.f44319d.hashCode() + ((this.f44318c.hashCode() + ((this.f44317b.hashCode() + (this.f44316a.hashCode() * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "NewCard(paymentUrl=" + this.f44316a + ", purchaseId=" + this.f44317b + ", invoiceId=" + this.f44318c + ", purchaseType=" + this.f44319d + ')';
    }
}
