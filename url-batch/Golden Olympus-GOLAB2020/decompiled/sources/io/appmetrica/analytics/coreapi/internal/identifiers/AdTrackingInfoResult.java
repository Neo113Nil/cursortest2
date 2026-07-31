package io.appmetrica.analytics.coreapi.internal.identifiers;

import android.text.TextUtils;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public class AdTrackingInfoResult {
    public final AdTrackingInfo mAdTrackingInfo;
    public final String mErrorExplanation;

    @NonNull
    public final IdentifierStatus mStatus;

    public AdTrackingInfoResult() {
        this(null, IdentifierStatus.UNKNOWN, "identifier info has never been updated");
    }

    @NonNull
    public static AdTrackingInfoResult getProviderUnavailableResult(@NonNull String str) {
        return new AdTrackingInfoResult(null, IdentifierStatus.IDENTIFIER_PROVIDER_UNAVAILABLE, str);
    }

    public boolean isValid() {
        AdTrackingInfo adTrackingInfo = this.mAdTrackingInfo;
        return (adTrackingInfo == null || TextUtils.isEmpty(adTrackingInfo.advId)) ? false : true;
    }

    public String toString() {
        return "AdTrackingInfoResult{mAdTrackingInfo=" + this.mAdTrackingInfo + ", mStatus=" + this.mStatus + ", mErrorExplanation='" + this.mErrorExplanation + "'}";
    }

    public AdTrackingInfoResult(AdTrackingInfo adTrackingInfo, @NonNull IdentifierStatus identifierStatus, String str) {
        this.mAdTrackingInfo = adTrackingInfo;
        this.mStatus = identifierStatus;
        this.mErrorExplanation = str;
    }
}
