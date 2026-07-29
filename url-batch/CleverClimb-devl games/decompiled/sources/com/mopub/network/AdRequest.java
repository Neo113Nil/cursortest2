package com.mopub.network;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.mopub.common.AdFormat;
import com.mopub.common.AdType;
import com.mopub.common.DataKeys;
import com.mopub.common.ExternalViewabilitySessionManager;
import com.mopub.common.FullAdType;
import com.mopub.common.MoPub;
import com.mopub.common.Preconditions;
import com.mopub.common.SdkConfiguration;
import com.mopub.common.VisibleForTesting;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.privacy.PersonalInfoManager;
import com.mopub.common.util.Json;
import com.mopub.common.util.ResponseHeader;
import com.mopub.mobileads.AdTypeTranslator;
import com.mopub.network.AdResponse;
import com.mopub.network.MoPubNetworkError;
import com.mopub.volley.DefaultRetryPolicy;
import com.mopub.volley.NetworkResponse;
import com.mopub.volley.Response;
import com.mopub.volley.toolbox.HttpHeaderParser;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class AdRequest extends MoPubRequest<AdResponse> {
    private static final String ADM_KEY = "adm";

    @VisibleForTesting
    static final String AD_RESPONSES_KEY = "ad-responses";
    private static final String BODY_KEY = "body";
    private static final String HEADERS_KEY = "headers";
    private final AdFormat mAdFormat;
    private final String mAdUnitId;
    private final Context mContext;
    private final Listener mListener;

    public interface Listener extends Response.ErrorListener {
        void onSuccess(AdResponse adResponse);
    }

    public AdRequest(String str, AdFormat adFormat, String str2, Context context, Listener listener) {
        super(context, str, listener);
        Preconditions.checkNotNull(adFormat);
        Preconditions.checkNotNull(listener);
        this.mAdUnitId = str2;
        this.mListener = listener;
        this.mAdFormat = adFormat;
        this.mContext = context.getApplicationContext();
        setRetryPolicy(new DefaultRetryPolicy(DefaultRetryPolicy.DEFAULT_TIMEOUT_MS, 1, 1.0f));
        setShouldCache(false);
        PersonalInfoManager personalInformationManager = MoPub.getPersonalInformationManager();
        if (personalInformationManager == null) {
            MoPubLog.e("Make sure you initialize the SDK before loading an ad. For now, the SDK will be automatically initialized on your behalf. Starting from release 5.2.0, initialization will be a strict requirement, and ad requests made with an uninitialized SDK will begin to fail.");
            MoPub.initializeSdk(context, new SdkConfiguration.Builder(str2 == null ? "" : str2).build(), null);
        } else {
            personalInformationManager.requestSync(false);
        }
    }

    public Listener getListener() {
        return this.mListener;
    }

    @Override // com.mopub.volley.Request
    public Map<String, String> getHeaders() {
        TreeMap treeMap = new TreeMap();
        String language = Locale.getDefault().getLanguage();
        Locale locale = this.mContext.getResources().getConfiguration().locale;
        if (locale != null && !locale.getLanguage().trim().isEmpty()) {
            language = locale.getLanguage().trim();
        }
        if (!language.isEmpty()) {
            treeMap.put(ResponseHeader.ACCEPT_LANGUAGE.getKey(), language);
        }
        return treeMap;
    }

    @Override // com.mopub.volley.Request
    protected Response<AdResponse> parseNetworkResponse(NetworkResponse networkResponse) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        ExternalViewabilitySessionManager.ViewabilityVendor fromKey;
        HashMap hashMap = new HashMap();
        for (String str : networkResponse.headers.keySet()) {
            hashMap.put(str.toLowerCase(), networkResponse.headers.get(str));
        }
        if (HeaderUtils.extractBooleanHeader((Map<String, String>) hashMap, ResponseHeader.WARMUP, false)) {
            return Response.error(new MoPubNetworkError("Ad Unit is warming up.", MoPubNetworkError.Reason.WARMING_UP));
        }
        AdResponse.Builder builder = new AdResponse.Builder();
        builder.setAdUnitId(this.mAdUnitId);
        String parseStringBody = parseStringBody(networkResponse);
        builder.setResponseBody(parseStringBody);
        if (AdType.MULTI.equalsIgnoreCase(HeaderUtils.extractHeader(hashMap, ResponseHeader.AD_RESPONSE_TYPE))) {
            try {
                jSONObject = new JSONObject(parseStringBody).getJSONArray(AD_RESPONSES_KEY).getJSONObject(0);
                jSONObject2 = jSONObject.getJSONObject(HEADERS_KEY);
            } catch (JSONException e) {
                return Response.error(new MoPubNetworkError("Failed to decode header JSON", e, MoPubNetworkError.Reason.BAD_HEADER_DATA));
            }
        } else {
            jSONObject2 = new JSONObject(hashMap);
            jSONObject = null;
        }
        String extractHeader = HeaderUtils.extractHeader(jSONObject2, ResponseHeader.AD_TYPE);
        String extractHeader2 = HeaderUtils.extractHeader(jSONObject2, ResponseHeader.FULL_AD_TYPE);
        builder.setAdType(extractHeader);
        builder.setFullAdType(extractHeader2);
        Integer extractIntegerHeader = HeaderUtils.extractIntegerHeader(jSONObject2, ResponseHeader.REFRESH_TIME);
        Integer valueOf = extractIntegerHeader == null ? null : Integer.valueOf(extractIntegerHeader.intValue() * 1000);
        builder.setRefreshTimeMilliseconds(valueOf);
        if (AdType.CLEAR.equals(extractHeader)) {
            builder.build();
            return Response.error(new MoPubNetworkError("No ads found for ad unit.", MoPubNetworkError.Reason.NO_FILL, valueOf));
        }
        builder.setDspCreativeId(HeaderUtils.extractHeader(jSONObject2, ResponseHeader.DSP_CREATIVE_ID));
        builder.setNetworkType(HeaderUtils.extractHeader(jSONObject2, ResponseHeader.NETWORK_TYPE));
        String extractHeader3 = HeaderUtils.extractHeader(jSONObject2, ResponseHeader.REDIRECT_URL);
        builder.setRedirectUrl(extractHeader3);
        String extractHeader4 = HeaderUtils.extractHeader(jSONObject2, ResponseHeader.CLICK_TRACKING_URL);
        builder.setClickTrackingUrl(extractHeader4);
        builder.setImpressionTrackingUrl(HeaderUtils.extractHeader(jSONObject2, ResponseHeader.IMPRESSION_URL));
        String extractHeader5 = HeaderUtils.extractHeader(jSONObject2, ResponseHeader.FAIL_URL);
        builder.setFailoverUrl(extractHeader5);
        builder.setRequestId(getRequestId(extractHeader5));
        boolean extractBooleanHeader = HeaderUtils.extractBooleanHeader(jSONObject2, ResponseHeader.SCROLLABLE, false);
        builder.setScrollable(Boolean.valueOf(extractBooleanHeader));
        builder.setDimensions(HeaderUtils.extractIntegerHeader(jSONObject2, ResponseHeader.WIDTH), HeaderUtils.extractIntegerHeader(jSONObject2, ResponseHeader.HEIGHT));
        Integer extractIntegerHeader2 = HeaderUtils.extractIntegerHeader(jSONObject2, ResponseHeader.AD_TIMEOUT);
        builder.setAdTimeoutDelayMilliseconds(extractIntegerHeader2 != null ? Integer.valueOf(extractIntegerHeader2.intValue() * 1000) : null);
        if (AdType.STATIC_NATIVE.equals(extractHeader) || AdType.VIDEO_NATIVE.equals(extractHeader)) {
            try {
                builder.setJsonBody(new JSONObject(parseStringBody));
            } catch (JSONException e2) {
                return Response.error(new MoPubNetworkError("Failed to decode body JSON for native ad format", e2, MoPubNetworkError.Reason.BAD_BODY));
            }
        }
        builder.setCustomEventClassName(AdTypeTranslator.getCustomEventName(this.mAdFormat, extractHeader, extractHeader2, jSONObject2));
        MoPub.BrowserAgent fromHeader = MoPub.BrowserAgent.fromHeader(HeaderUtils.extractIntegerHeader(jSONObject2, ResponseHeader.BROWSER_AGENT));
        MoPub.setBrowserAgentFromAdServer(fromHeader);
        builder.setBrowserAgent(fromHeader);
        String extractHeader6 = HeaderUtils.extractHeader(jSONObject2, ResponseHeader.CUSTOM_EVENT_DATA);
        if (TextUtils.isEmpty(extractHeader6)) {
            extractHeader6 = HeaderUtils.extractHeader(jSONObject2, ResponseHeader.NATIVE_PARAMS);
        }
        try {
            Map<String, String> jsonStringToMap = Json.jsonStringToMap(extractHeader6);
            if (jSONObject != null) {
                try {
                    jsonStringToMap.put(DataKeys.ADM_KEY, jSONObject.getString(ADM_KEY));
                } catch (JSONException e3) {
                    return Response.error(new MoPubNetworkError("Failed to parse ADM for advanced bidding", e3, MoPubNetworkError.Reason.BAD_BODY));
                }
            }
            if (!TextUtils.isEmpty(extractHeader3)) {
                jsonStringToMap.put(DataKeys.REDIRECT_URL_KEY, extractHeader3);
            }
            if (!TextUtils.isEmpty(extractHeader4)) {
                jsonStringToMap.put(DataKeys.CLICKTHROUGH_URL_KEY, extractHeader4);
            }
            if (eventDataIsInResponseBody(extractHeader, extractHeader2)) {
                jsonStringToMap.put(DataKeys.HTML_RESPONSE_BODY_KEY, parseStringBody);
                jsonStringToMap.put(DataKeys.SCROLLABLE_KEY, Boolean.toString(extractBooleanHeader));
                jsonStringToMap.put(DataKeys.CREATIVE_ORIENTATION_KEY, HeaderUtils.extractHeader(jSONObject2, ResponseHeader.ORIENTATION));
            }
            if (AdType.STATIC_NATIVE.equals(extractHeader) || AdType.VIDEO_NATIVE.equals(extractHeader)) {
                String extractPercentHeaderString = HeaderUtils.extractPercentHeaderString(jSONObject2, ResponseHeader.IMPRESSION_MIN_VISIBLE_PERCENT);
                String extractHeader7 = HeaderUtils.extractHeader(jSONObject2, ResponseHeader.IMPRESSION_VISIBLE_MS);
                String extractHeader8 = HeaderUtils.extractHeader(hashMap, ResponseHeader.IMPRESSION_MIN_VISIBLE_PX);
                if (!TextUtils.isEmpty(extractPercentHeaderString)) {
                    jsonStringToMap.put(DataKeys.IMPRESSION_MIN_VISIBLE_PERCENT, extractPercentHeaderString);
                }
                if (!TextUtils.isEmpty(extractHeader7)) {
                    jsonStringToMap.put(DataKeys.IMPRESSION_VISIBLE_MS, extractHeader7);
                }
                if (!TextUtils.isEmpty(extractHeader8)) {
                    jsonStringToMap.put(DataKeys.IMPRESSION_MIN_VISIBLE_PX, extractHeader8);
                }
            }
            if (AdType.VIDEO_NATIVE.equals(extractHeader)) {
                jsonStringToMap.put(DataKeys.PLAY_VISIBLE_PERCENT, HeaderUtils.extractPercentHeaderString(jSONObject2, ResponseHeader.PLAY_VISIBLE_PERCENT));
                jsonStringToMap.put(DataKeys.PAUSE_VISIBLE_PERCENT, HeaderUtils.extractPercentHeaderString(jSONObject2, ResponseHeader.PAUSE_VISIBLE_PERCENT));
                jsonStringToMap.put(DataKeys.MAX_BUFFER_MS, HeaderUtils.extractHeader(jSONObject2, ResponseHeader.MAX_BUFFER_MS));
            }
            String extractHeader9 = HeaderUtils.extractHeader(jSONObject2, ResponseHeader.VIDEO_TRACKERS);
            if (!TextUtils.isEmpty(extractHeader9)) {
                jsonStringToMap.put(DataKeys.VIDEO_TRACKERS_KEY, extractHeader9);
            }
            if (AdType.REWARDED_VIDEO.equals(extractHeader) || (AdType.INTERSTITIAL.equals(extractHeader) && FullAdType.VAST.equals(extractHeader2))) {
                jsonStringToMap.put(DataKeys.EXTERNAL_VIDEO_VIEWABILITY_TRACKERS_KEY, HeaderUtils.extractHeader(jSONObject2, ResponseHeader.VIDEO_VIEWABILITY_TRACKERS));
            }
            if (AdFormat.BANNER.equals(this.mAdFormat)) {
                jsonStringToMap.put(DataKeys.BANNER_IMPRESSION_MIN_VISIBLE_MS, HeaderUtils.extractHeader(hashMap, ResponseHeader.BANNER_IMPRESSION_MIN_VISIBLE_MS));
                jsonStringToMap.put(DataKeys.BANNER_IMPRESSION_MIN_VISIBLE_DIPS, HeaderUtils.extractHeader(hashMap, ResponseHeader.BANNER_IMPRESSION_MIN_VISIBLE_DIPS));
            }
            String extractHeader10 = HeaderUtils.extractHeader(jSONObject2, ResponseHeader.DISABLE_VIEWABILITY);
            if (!TextUtils.isEmpty(extractHeader10) && (fromKey = ExternalViewabilitySessionManager.ViewabilityVendor.fromKey(extractHeader10)) != null) {
                fromKey.disable();
            }
            builder.setServerExtras(jsonStringToMap);
            if (AdType.REWARDED_VIDEO.equals(extractHeader) || AdType.CUSTOM.equals(extractHeader) || AdType.REWARDED_PLAYABLE.equals(extractHeader)) {
                String extractHeader11 = HeaderUtils.extractHeader(jSONObject2, ResponseHeader.REWARDED_VIDEO_CURRENCY_NAME);
                String extractHeader12 = HeaderUtils.extractHeader(jSONObject2, ResponseHeader.REWARDED_VIDEO_CURRENCY_AMOUNT);
                String extractHeader13 = HeaderUtils.extractHeader(jSONObject2, ResponseHeader.REWARDED_CURRENCIES);
                String extractHeader14 = HeaderUtils.extractHeader(jSONObject2, ResponseHeader.REWARDED_VIDEO_COMPLETION_URL);
                Integer extractIntegerHeader3 = HeaderUtils.extractIntegerHeader(jSONObject2, ResponseHeader.REWARDED_DURATION);
                boolean extractBooleanHeader2 = HeaderUtils.extractBooleanHeader(jSONObject2, ResponseHeader.SHOULD_REWARD_ON_CLICK, false);
                builder.setRewardedVideoCurrencyName(extractHeader11);
                builder.setRewardedVideoCurrencyAmount(extractHeader12);
                builder.setRewardedCurrencies(extractHeader13);
                builder.setRewardedVideoCompletionUrl(extractHeader14);
                builder.setRewardedDuration(extractIntegerHeader3);
                builder.setShouldRewardOnClick(extractBooleanHeader2);
            }
            boolean extractBooleanHeader3 = HeaderUtils.extractBooleanHeader(jSONObject2, ResponseHeader.INVALIDATE_CONSENT, false);
            boolean extractBooleanHeader4 = HeaderUtils.extractBooleanHeader(jSONObject2, ResponseHeader.FORCE_EXPLICIT_NO, false);
            boolean extractBooleanHeader5 = HeaderUtils.extractBooleanHeader(jSONObject2, ResponseHeader.REACQUIRE_CONSENT, false);
            String extractHeader15 = HeaderUtils.extractHeader(jSONObject2, ResponseHeader.CONSENT_CHANGE_REASON);
            if (MoPub.getPersonalInformationManager() != null) {
                if (extractBooleanHeader4) {
                    MoPub.getPersonalInformationManager().forceExplicitNo(extractHeader15);
                } else if (extractBooleanHeader3) {
                    MoPub.getPersonalInformationManager().invalidateConsent(extractHeader15);
                } else if (extractBooleanHeader5) {
                    MoPub.getPersonalInformationManager().reacquireConsent(extractHeader15);
                }
            }
            builder.build();
            return Response.success(builder.build(), HttpHeaderParser.parseCacheHeaders(networkResponse));
        } catch (JSONException e4) {
            return Response.error(new MoPubNetworkError("Failed to decode server extras for custom event data.", e4, MoPubNetworkError.Reason.BAD_HEADER_DATA));
        }
    }

    private boolean eventDataIsInResponseBody(String str, String str2) {
        return AdType.MRAID.equals(str) || "html".equals(str) || (AdType.INTERSTITIAL.equals(str) && FullAdType.VAST.equals(str2)) || ((AdType.REWARDED_VIDEO.equals(str) && FullAdType.VAST.equals(str2)) || AdType.REWARDED_PLAYABLE.equals(str));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mopub.volley.Request
    public void deliverResponse(AdResponse adResponse) {
        this.mListener.onSuccess(adResponse);
    }

    @VisibleForTesting
    String getRequestId(String str) {
        if (str == null) {
            return null;
        }
        try {
            return Uri.parse(str).getQueryParameter("request_id");
        } catch (UnsupportedOperationException unused) {
            MoPubLog.d("Unable to obtain request id from fail url.");
            return null;
        }
    }
}
