package com.adjust.sdk;

import android.net.Uri;
import com.imaginationoverflow.unity.referrer.BuildConfig;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class SessionResponseData extends ResponseData {
    public Uri deeplink;
    private String sdkPlatform;

    public SessionResponseData(ActivityPackage activityPackage) {
        this.sdkPlatform = Util.getSdkPrefixPlatform(activityPackage.getClientSdk());
    }

    public AdjustSessionFailure getFailureResponseData() {
        if (this.success) {
            return null;
        }
        AdjustSessionFailure adjustSessionFailure = new AdjustSessionFailure();
        if (!"unity".equals(this.sdkPlatform)) {
            adjustSessionFailure.message = this.message;
            adjustSessionFailure.timestamp = this.timestamp;
            adjustSessionFailure.adid = this.adid;
            adjustSessionFailure.willRetry = this.willRetry;
            adjustSessionFailure.jsonResponse = this.jsonResponse;
            return adjustSessionFailure;
        }
        String str = this.message;
        String str2 = BuildConfig.FLAVOR;
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        adjustSessionFailure.message = str;
        String str3 = this.timestamp;
        if (str3 == null) {
            str3 = BuildConfig.FLAVOR;
        }
        adjustSessionFailure.timestamp = str3;
        String str4 = this.adid;
        if (str4 != null) {
            str2 = str4;
        }
        adjustSessionFailure.adid = str2;
        adjustSessionFailure.willRetry = this.willRetry;
        JSONObject jSONObject = this.jsonResponse;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        adjustSessionFailure.jsonResponse = jSONObject;
        return adjustSessionFailure;
    }

    public AdjustSessionSuccess getSuccessResponseData() {
        if (!this.success) {
            return null;
        }
        AdjustSessionSuccess adjustSessionSuccess = new AdjustSessionSuccess();
        if (!"unity".equals(this.sdkPlatform)) {
            adjustSessionSuccess.message = this.message;
            adjustSessionSuccess.timestamp = this.timestamp;
            adjustSessionSuccess.adid = this.adid;
            adjustSessionSuccess.jsonResponse = this.jsonResponse;
            return adjustSessionSuccess;
        }
        String str = this.message;
        String str2 = BuildConfig.FLAVOR;
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        adjustSessionSuccess.message = str;
        String str3 = this.timestamp;
        if (str3 == null) {
            str3 = BuildConfig.FLAVOR;
        }
        adjustSessionSuccess.timestamp = str3;
        String str4 = this.adid;
        if (str4 != null) {
            str2 = str4;
        }
        adjustSessionSuccess.adid = str2;
        JSONObject jSONObject = this.jsonResponse;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        adjustSessionSuccess.jsonResponse = jSONObject;
        return adjustSessionSuccess;
    }
}
