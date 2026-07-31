package com.android.billingclient.api;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AlternativeBillingOnlyReportingDetails {
    private final String externalTransactionToken;

    AlternativeBillingOnlyReportingDetails(String str) {
        this.externalTransactionToken = new JSONObject(str).optString("externalTransactionToken");
    }

    public String getExternalTransactionToken() {
        return this.externalTransactionToken;
    }
}
