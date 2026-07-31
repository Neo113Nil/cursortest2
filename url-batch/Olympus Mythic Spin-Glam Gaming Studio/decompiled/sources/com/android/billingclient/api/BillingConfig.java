package com.android.billingclient.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.android.billingclient:billing@@7.1.1 */
@zzh
/* loaded from: classes10.dex */
public final class BillingConfig {
    private final String countryCode;

    BillingConfig(String str) throws JSONException {
        this.countryCode = new JSONObject(str).optString("countryCode");
    }

    private BillingConfig(@Nullable String str, String str2) {
        this.countryCode = str2;
    }

    static BillingConfig forCountryCode(String str) {
        return new BillingConfig(null, str);
    }

    @NonNull
    public String getCountryCode() {
        return this.countryCode;
    }
}
