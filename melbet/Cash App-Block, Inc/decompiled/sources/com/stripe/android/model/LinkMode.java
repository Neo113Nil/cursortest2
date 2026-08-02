package com.stripe.android.model;

/* loaded from: classes8.dex */
public enum LinkMode {
    /* JADX INFO: Fake field, exist only in values array */
    Passthrough("PASSTHROUGH"),
    /* JADX INFO: Fake field, exist only in values array */
    LinkPaymentMethod("LINK_PAYMENT_METHOD"),
    LinkCardBrand("LINK_CARD_BRAND");

    public final String value;

    LinkMode(String str) {
        this.value = str;
    }
}
