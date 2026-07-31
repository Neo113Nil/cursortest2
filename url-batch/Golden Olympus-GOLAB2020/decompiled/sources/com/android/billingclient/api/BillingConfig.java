package com.android.billingclient.api;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class BillingConfig {
    private final String countryCode;

    private BillingConfig(String str, String str2) {
        this.countryCode = str2;
    }

    static BillingConfig forCountryCode(String str) {
        return new BillingConfig(null, str);
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    BillingConfig(String str) {
        this.countryCode = new JSONObject(str).optString("countryCode");
    }
}
