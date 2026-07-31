package ru.rustore.sdk.pay.model;

import kotlin.Metadata;

@Metadata
/* loaded from: classes3.dex */
public enum ApplicationPurchaseStatus implements PurchaseStatus {
    INVOICE_CREATED,
    CANCELLED,
    PROCESSING,
    REJECTED,
    CONFIRMED,
    CONSUMED,
    REFUNDED,
    EXECUTING,
    EXPIRED,
    PAID,
    REVERSED
}
