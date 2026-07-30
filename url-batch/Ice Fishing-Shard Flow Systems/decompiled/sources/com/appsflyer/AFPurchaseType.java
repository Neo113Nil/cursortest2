package com.appsflyer;

import kotlin.Metadata;

@Metadata
/* loaded from: classes.dex */
public enum AFPurchaseType {
    SUBSCRIPTION("subscription"),
    ONE_TIME_PURCHASE("one_time_purchase");

    private final String value;

    AFPurchaseType(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
