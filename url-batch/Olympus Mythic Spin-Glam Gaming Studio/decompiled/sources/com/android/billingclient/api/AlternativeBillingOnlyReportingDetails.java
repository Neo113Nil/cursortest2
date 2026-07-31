package com.android.billingclient.api;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.android.billingclient:billing@@7.1.1 */
@zzf
@KeepForSdk
/* loaded from: classes14.dex */
public final class AlternativeBillingOnlyReportingDetails {
    private final String externalTransactionToken;

    AlternativeBillingOnlyReportingDetails(String str) throws JSONException {
        this.externalTransactionToken = new JSONObject(str).optString("externalTransactionToken");
    }

    @NonNull
    public String getExternalTransactionToken() {
        return this.externalTransactionToken;
    }
}
