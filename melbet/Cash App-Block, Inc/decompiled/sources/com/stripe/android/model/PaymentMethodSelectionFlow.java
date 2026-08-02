package com.stripe.android.model;

/* loaded from: classes8.dex */
public enum PaymentMethodSelectionFlow {
    /* JADX INFO: Fake field, exist only in values array */
    Automatic("automatic"),
    /* JADX INFO: Fake field, exist only in values array */
    MerchantSpecified("merchant_specified");

    public final String paramValue;

    PaymentMethodSelectionFlow(String str) {
        this.paramValue = str;
    }
}
