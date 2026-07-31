package ru.rustore.sdk.pay.model;

import kotlin.Metadata;

@Metadata
/* loaded from: classes3.dex */
public enum SubscriptionPurchaseStatus implements PurchaseStatus {
    INVOICE_CREATED,
    CANCELLED,
    EXPIRED,
    PROCESSING,
    REJECTED,
    ACTIVE,
    PAUSED,
    TERMINATED,
    CLOSED
}
