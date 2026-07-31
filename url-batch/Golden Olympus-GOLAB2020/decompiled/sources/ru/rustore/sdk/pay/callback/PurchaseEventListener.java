package ru.rustore.sdk.pay.callback;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.pay.model.InvoiceId;
import ru.rustore.sdk.pay.model.PurchaseId;

@Metadata
/* loaded from: classes3.dex */
public interface PurchaseEventListener {
    void onPaymentCompleted(@NotNull PurchaseId purchaseId, @NotNull InvoiceId invoiceId);

    void onPaymentFailed(@Nullable PurchaseId purchaseId, @Nullable InvoiceId invoiceId);

    void onPaymentStarted(@NotNull PurchaseId purchaseId, @NotNull InvoiceId invoiceId);

    void onPurchaseCancelled(@Nullable PurchaseId purchaseId, @Nullable InvoiceId invoiceId);

    void onPurchaseCreated(@NotNull PurchaseId purchaseId, @NotNull InvoiceId invoiceId);
}
