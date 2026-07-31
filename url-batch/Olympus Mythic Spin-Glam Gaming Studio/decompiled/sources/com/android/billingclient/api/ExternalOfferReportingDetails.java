package com.android.billingclient.api;

import androidx.annotation.NonNull;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.android.billingclient:billing@@7.1.1 */
@zzg
/* loaded from: classes14.dex */
public final class ExternalOfferReportingDetails {
    private final String externalTransactionToken;

    ExternalOfferReportingDetails(String str) throws JSONException {
        this.externalTransactionToken = new JSONObject(str).optString("externalTransactionToken");
    }

    @NonNull
    public String getExternalTransactionToken() {
        return this.externalTransactionToken;
    }
}
