package com.mopub.mobileads;

import android.text.TextUtils;
import com.mopub.common.CacheService;
import com.mopub.common.DataKeys;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.Json;
import com.mopub.mobileads.CustomEventInterstitial;
import com.mopub.mobileads.VastManager;
import com.mopub.mobileads.factories.VastManagerFactory;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
class VastVideoInterstitial extends ResponseBodyInterstitial implements VastManager.VastManagerListener {
    private CustomEventInterstitial.CustomEventInterstitialListener mCustomEventInterstitialListener;
    private Map<String, String> mExternalViewabilityTrackers;
    private VastManager mVastManager;
    private String mVastResponse;
    private VastVideoConfig mVastVideoConfig;
    private JSONObject mVideoTrackers;

    VastVideoInterstitial() {
    }

    @Override // com.mopub.mobileads.ResponseBodyInterstitial
    protected void extractExtras(Map<String, String> map) {
        this.mVastResponse = map.get(DataKeys.HTML_RESPONSE_BODY_KEY);
        String str = map.get(DataKeys.EXTERNAL_VIDEO_VIEWABILITY_TRACKERS_KEY);
        try {
            this.mExternalViewabilityTrackers = Json.jsonStringToMap(str);
        } catch (JSONException unused) {
            MoPubLog.d("Failed to parse video viewability trackers to JSON: " + str);
        }
        String str2 = map.get(DataKeys.VIDEO_TRACKERS_KEY);
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            this.mVideoTrackers = new JSONObject(str2);
        } catch (JSONException e) {
            MoPubLog.d("Failed to parse video trackers to JSON: " + str2, e);
            this.mVideoTrackers = null;
        }
    }

    @Override // com.mopub.mobileads.ResponseBodyInterstitial
    protected void preRenderHtml(CustomEventInterstitial.CustomEventInterstitialListener customEventInterstitialListener) {
        this.mCustomEventInterstitialListener = customEventInterstitialListener;
        if (!CacheService.initializeDiskCache(this.mContext)) {
            this.mCustomEventInterstitialListener.onInterstitialFailed(MoPubErrorCode.VIDEO_CACHE_ERROR);
        } else {
            this.mVastManager = VastManagerFactory.create(this.mContext);
            this.mVastManager.prepareVastVideoConfiguration(this.mVastResponse, this, this.mAdReport.getDspCreativeId(), this.mContext);
        }
    }

    @Override // com.mopub.mobileads.ResponseBodyInterstitial, com.mopub.mobileads.CustomEventInterstitial
    public void showInterstitial() {
        MraidVideoPlayerActivity.startVast(this.mContext, this.mVastVideoConfig, this.mBroadcastIdentifier);
    }

    @Override // com.mopub.mobileads.ResponseBodyInterstitial, com.mopub.mobileads.CustomEventInterstitial
    public void onInvalidate() {
        if (this.mVastManager != null) {
            this.mVastManager.cancel();
        }
        super.onInvalidate();
    }

    public void onVastVideoConfigurationPrepared(VastVideoConfig vastVideoConfig) {
        if (vastVideoConfig == null) {
            this.mCustomEventInterstitialListener.onInterstitialFailed(MoPubErrorCode.VIDEO_DOWNLOAD_ERROR);
            return;
        }
        this.mVastVideoConfig = vastVideoConfig;
        this.mVastVideoConfig.addVideoTrackers(this.mVideoTrackers);
        this.mVastVideoConfig.addExternalViewabilityTrackers(this.mExternalViewabilityTrackers);
        this.mCustomEventInterstitialListener.onInterstitialLoaded();
    }

    @Deprecated
    String getVastResponse() {
        return this.mVastResponse;
    }

    @Deprecated
    void setVastManager(VastManager vastManager) {
        this.mVastManager = vastManager;
    }
}
