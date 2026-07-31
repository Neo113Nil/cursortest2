package ru.rustore.sdk.pay.model;

import java.util.Date;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public interface Purchase {
    @NotNull
    AmountLabel getAmountLabel();

    @NotNull
    Currency getCurrency();

    @NotNull
    Description getDescription();

    @Nullable
    DeveloperPayload getDeveloperPayload();

    @NotNull
    InvoiceId getInvoiceId();

    @Nullable
    OrderId getOrderId();

    @NotNull
    Price getPrice();

    @NotNull
    PurchaseId getPurchaseId();

    @Nullable
    Date getPurchaseTime();

    @NotNull
    PurchaseType getPurchaseType();

    boolean getSandbox();

    @NotNull
    PurchaseStatus getStatus();
}
