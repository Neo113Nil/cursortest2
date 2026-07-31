package ru.rustore.sdk.pay.model;

import kotlin.Metadata;

@Metadata
/* loaded from: classes3.dex */
public enum ProductPurchaseStatus implements PurchaseStatus {
    INVOICE_CREATED,
    CANCELLED,
    PROCESSING,
    REJECTED,
    CONFIRMED,
    REFUNDED,
    REFUNDING,
    EXECUTING,
    EXPIRED,
    PAID,
    REVERSED
}
