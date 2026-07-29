package com.mopub.mobileads;

import android.app.Activity;
import android.text.TextUtils;
import com.aiming.mdt.AdtAds;
import com.aiming.mdt.utils.AdLog;
import com.aiming.mdt.video.VideoAd;
import com.aiming.mdt.video.VideoAdListener;
import com.mopub.common.LifecycleListener;
import com.mopub.common.MoPubReward;
import java.util.Map;

/* loaded from: classes2.dex */
public class AdtVideo extends CustomEventRewardedVideo {
    private static final String APP_KEY = "app_key";
    private static final String COMPATIBLE_IOS_APP_KEY = "appKey";
    private static final String COMPATIBLE_IOS_PLACEMENT_ID = "placementId";
    private static final String PLACEMENT_ID = "placement_id";
    private static final String TAG = "AdtVideo";
    private String placementId;
    private String prePId;
    private VideoAd videoAd;

    private void makeAd(Activity activity) {
        this.videoAd = new VideoAd(activity, this.placementId, new VideoAdListener() { // from class: com.mopub.mobileads.AdtVideo.1
            @Override // com.aiming.mdt.video.VideoAdListener
            public void onAdClicked() {
                AdLog singleton = AdLog.getSingleton();
                StringBuilder sb = new StringBuilder();
                sb.append(AdtVideo.TAG);
                sb.append("--onAdClicked");
                singleton.LogD(sb.toString());
                MoPubRewardedVideoManager.onRewardedVideoClicked(AdtVideo.class, AdtVideo.this.placementId);
            }

            @Override // com.aiming.mdt.video.VideoAdListener
            public void onAdClosed(boolean z) {
                AdLog singleton = AdLog.getSingleton();
                StringBuilder sb = new StringBuilder();
                sb.append(AdtVideo.TAG);
                sb.append("--onAdClosed");
                singleton.LogD(sb.toString());
                MoPubRewardedVideoManager.onRewardedVideoClosed(AdtVideo.class, AdtVideo.this.placementId);
            }

            @Override // com.aiming.mdt.core.AdListener
            public void onAdFailed(String str) {
                AdLog singleton = AdLog.getSingleton();
                StringBuilder sb = new StringBuilder();
                sb.append(AdtVideo.TAG);
                sb.append("--onAdFailed--error=");
                sb.append(str);
                singleton.LogD(sb.toString());
                MoPubRewardedVideoManager.onRewardedVideoLoadFailure(AdtVideo.class, AdtVideo.this.placementId, MoPubErrorCode.ADAPTER_CONFIGURATION_ERROR);
            }

            @Override // com.aiming.mdt.video.VideoAdListener
            public void onAdReady() {
                AdLog singleton = AdLog.getSingleton();
                StringBuilder sb = new StringBuilder();
                sb.append(AdtVideo.TAG);
                sb.append("--onAdReady");
                singleton.LogD(sb.toString());
                MoPubRewardedVideoManager.onRewardedVideoLoadSuccess(AdtVideo.class, AdtVideo.this.placementId);
            }

            @Override // com.aiming.mdt.video.VideoAdListener
            public void onAdRewarded() {
                AdLog singleton = AdLog.getSingleton();
                StringBuilder sb = new StringBuilder();
                sb.append(AdtVideo.TAG);
                sb.append("--onAdRewarded");
                singleton.LogD(sb.toString());
                MoPubRewardedVideoManager.onRewardedVideoCompleted(AdtVideo.class, AdtVideo.this.placementId, MoPubReward.success(AdtVideo.this.placementId, 0));
            }
        });
    }

    @Override // com.mopub.mobileads.CustomEventRewardedAd
    protected boolean checkAndInitializeSdk(Activity activity, Map<String, Object> map, Map<String, String> map2) {
        AdLog singleton = AdLog.getSingleton();
        StringBuilder sb = new StringBuilder();
        sb.append(TAG);
        sb.append("--checkAndInitializeSdk");
        singleton.LogD(sb.toString());
        String str = map2.get(APP_KEY);
        if (TextUtils.isEmpty(str)) {
            str = map2.get(COMPATIBLE_IOS_APP_KEY);
        }
        this.placementId = map2.get(PLACEMENT_ID);
        if (TextUtils.isEmpty(this.placementId)) {
            this.placementId = map2.get("placementId");
        }
        AdLog singleton2 = AdLog.getSingleton();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(TAG);
        sb2.append("---appKey=");
        sb2.append(str);
        singleton2.LogD(sb2.toString());
        AdLog singleton3 = AdLog.getSingleton();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(TAG);
        sb3.append("---placementId=");
        sb3.append(this.placementId);
        singleton3.LogD(sb3.toString());
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(this.placementId)) {
            MoPubRewardedVideoManager.onRewardedVideoLoadFailure(AdtVideo.class, TAG, MoPubErrorCode.ADAPTER_CONFIGURATION_ERROR);
            return false;
        }
        if (!AdtAds.isInit()) {
            AdtAds.init(activity, str, null);
        }
        AdLog singleton4 = AdLog.getSingleton();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(TAG);
        sb4.append("---AdtAds.isInit()=");
        sb4.append(AdtAds.isInit());
        singleton4.LogD(sb4.toString());
        return AdtAds.isInit();
    }

    @Override // com.mopub.mobileads.CustomEventRewardedAd
    protected String getAdNetworkId() {
        AdLog singleton = AdLog.getSingleton();
        StringBuilder sb = new StringBuilder();
        sb.append(TAG);
        sb.append("--getAdNetworkId");
        singleton.LogD(sb.toString());
        return this.placementId;
    }

    @Override // com.mopub.mobileads.CustomEventRewardedAd
    protected LifecycleListener getLifecycleListener() {
        AdLog singleton = AdLog.getSingleton();
        StringBuilder sb = new StringBuilder();
        sb.append(TAG);
        sb.append("--getLifecycleListener()");
        singleton.LogD(sb.toString());
        return null;
    }

    @Override // com.mopub.mobileads.CustomEventRewardedVideo
    protected boolean hasVideoAvailable() {
        AdLog singleton = AdLog.getSingleton();
        StringBuilder sb = new StringBuilder();
        sb.append(TAG);
        sb.append("--hasVideoAvailable");
        singleton.LogD(sb.toString());
        return this.videoAd != null && this.videoAd.isReady();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        if (r1.prePId.equals(r1.placementId) == false) goto L4;
     */
    @Override // com.mopub.mobileads.CustomEventRewardedAd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void loadWithSdkInitialized(Activity activity, Map<String, Object> map, Map<String, String> map2) {
        AdLog singleton = AdLog.getSingleton();
        StringBuilder sb = new StringBuilder();
        sb.append(TAG);
        sb.append("--loadWithSdkInitialized");
        singleton.LogD(sb.toString());
        if (this.videoAd != null) {
            if (!TextUtils.isEmpty(this.prePId)) {
            }
            this.prePId = this.placementId;
            this.videoAd.loadAd();
        }
        makeAd(activity);
        this.prePId = this.placementId;
        this.videoAd.loadAd();
    }

    @Override // com.mopub.mobileads.CustomEventRewardedAd
    protected void onInvalidate() {
        AdLog singleton = AdLog.getSingleton();
        StringBuilder sb = new StringBuilder();
        sb.append(TAG);
        sb.append("--onInvalidate");
        singleton.LogD(sb.toString());
    }

    @Override // com.mopub.mobileads.CustomEventRewardedVideo
    protected void showVideo() {
        AdLog singleton = AdLog.getSingleton();
        StringBuilder sb = new StringBuilder();
        sb.append(TAG);
        sb.append("--showVideo");
        singleton.LogD(sb.toString());
        if (this.videoAd != null) {
            this.videoAd.showAd();
            MoPubRewardedVideoManager.onRewardedVideoStarted(AdtVideo.class, this.placementId);
        }
    }
}
