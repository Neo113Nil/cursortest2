package com.adjust.sdk;

import java.util.Map;
import org.json.JSONObject;
import p000createpolar.PolarVoyageRoomDaoSpectraSpeedThunder9047;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public class ResponseData {
    public ActivityKind activityKind;
    public ActivityPackage activityPackage;
    public String adid;
    public Long askIn;
    public AdjustAttribution attribution;
    public Long continueIn;
    public JSONObject controlParams;
    public JSONObject jsonResponse;
    public String message;
    public String resolvedDeeplink;
    public Long retryIn;
    public Map<String, String> sendingParameters;
    public Map<String, String> signedParameters;
    public String timestamp;
    public TrackingState trackingState;
    public boolean success = false;
    public boolean willRetry = false;

    public static ResponseData buildResponseData(ActivityPackage activityPackage, Map<String, String> map, Map<String, String> map2) {
        ActivityKind activityKind = activityPackage.getActivityKind();
        int i = PolarVoyageRoomDaoSpectraSpeedThunder9047.PolarVoyageZipVortexCelestial6185[activityKind.ordinal()];
        ResponseData responseData = i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? new ResponseData() : new PurchaseVerificationResponseData() : new EventResponseData(activityPackage) : new AttributionResponseData() : new SdkClickResponseData() : new SessionResponseData(activityPackage);
        responseData.activityKind = activityKind;
        responseData.activityPackage = activityPackage;
        responseData.sendingParameters = map;
        responseData.signedParameters = map2;
        return responseData;
    }

    public String toString() {
        return Util.formatString("message:%s timestamp:%s json:%s", this.message, this.timestamp, this.jsonResponse);
    }
}
