package com.mopub.mobileads;

import android.app.Activity;
import android.text.TextUtils;
import com.cmplay.a.d;
import com.ironsource.b.d.b;
import com.ironsource.b.f.g;
import com.ironsource.b.k;
import com.mopub.common.BaseLifecycleListener;
import com.mopub.common.LifecycleListener;
import com.mopub.common.MoPub;
import com.mopub.common.MoPubReward;
import com.mopub.common.logging.MoPubLog;
import java.util.Map;

/* loaded from: classes2.dex */
public class IronSourceRewardedVideo extends CustomEventRewardedVideo implements g {
    private static final String ADAPTER_VERSION = "300";
    private static final String APPLICATION_KEY = "applicationKey";
    private static final String INSTANCE_ID_KEY = "instanceId";
    private static final String MEDIATION_TYPE = "mopub";
    private static final String PLACEMENT_KEY = "placementName";
    private static boolean mIsFirstInitFlow = true;
    private String mInstanceId = "0";
    private String mPlacementName = null;
    private LifecycleListener mLifecycleListener = new BaseLifecycleListener() { // from class: com.mopub.mobileads.IronSourceRewardedVideo.1
        @Override // com.mopub.common.BaseLifecycleListener, com.mopub.common.LifecycleListener
        public void onPause(Activity activity) {
            super.onPause(activity);
            k.b(activity);
        }

        @Override // com.mopub.common.BaseLifecycleListener, com.mopub.common.LifecycleListener
        public void onResume(Activity activity) {
            super.onResume(activity);
            k.a(activity);
        }
    };

    @Override // com.mopub.mobileads.CustomEventRewardedAd
    protected void onInvalidate() {
    }

    @Override // com.mopub.mobileads.CustomEventRewardedAd
    protected LifecycleListener getLifecycleListener() {
        return this.mLifecycleListener;
    }

    @Override // com.mopub.mobileads.CustomEventRewardedAd
    protected String getAdNetworkId() {
        return this.mInstanceId;
    }

    @Override // com.mopub.mobileads.CustomEventRewardedAd
    protected boolean checkAndInitializeSdk(Activity activity, Map<String, Object> map, Map<String, String> map2) throws Exception {
        k.a(MoPub.canCollectPersonalInformation());
        try {
            String str = map2.get(APPLICATION_KEY) != null ? map2.get(APPLICATION_KEY) : "";
            setCredentials(map2);
            initIronSourceSDK(activity, str);
            return mIsFirstInitFlow;
        } catch (Exception e) {
            MoPubLog.d(e.toString());
            return false;
        }
    }

    @Override // com.mopub.mobileads.CustomEventRewardedAd
    protected void loadWithSdkInitialized(Activity activity, Map<String, Object> map, Map<String, String> map2) throws Exception {
        new d().a(2, 1, 0, 24, 99);
        setCredentials(map2);
        if (mIsFirstInitFlow) {
            return;
        }
        if (hasVideoAvailable()) {
            new d().a(2, 2, 0, 24, 99);
            MoPubRewardedVideoManager.onRewardedVideoLoadSuccess(IronSourceRewardedVideo.class, this.mInstanceId);
            MoPubLog.d("IronSource Rewarded Video loaded successfully for instance " + this.mInstanceId);
            return;
        }
        new d().a(2, 3, 0, 24, 99);
        MoPubRewardedVideoManager.onRewardedVideoLoadFailure(IronSourceRewardedVideo.class, this.mInstanceId, MoPubErrorCode.NETWORK_NO_FILL);
        MoPubLog.d("IronSource Rewarded Video failed to load for instance " + this.mInstanceId);
    }

    @Override // com.mopub.mobileads.CustomEventRewardedVideo
    protected boolean hasVideoAvailable() {
        return k.d(this.mInstanceId);
    }

    @Override // com.mopub.mobileads.CustomEventRewardedVideo, com.mopub.mobileads.CustomEventRewardedAd
    protected boolean isReady() {
        return k.d(this.mInstanceId);
    }

    @Override // com.mopub.mobileads.CustomEventRewardedVideo
    protected void showVideo() {
        if (TextUtils.isEmpty(this.mPlacementName)) {
            k.c(this.mInstanceId);
        } else {
            k.a(this.mInstanceId, this.mPlacementName);
        }
    }

    @Override // com.mopub.mobileads.CustomEventRewardedVideo, com.mopub.mobileads.CustomEventRewardedAd
    protected void show() {
        if (TextUtils.isEmpty(this.mPlacementName)) {
            k.c(this.mInstanceId);
        } else {
            k.a(this.mInstanceId, this.mPlacementName);
        }
    }

    private void initIronSourceSDK(Activity activity, String str) {
        if (!TextUtils.isEmpty(str)) {
            k.a(this);
            if (mIsFirstInitFlow) {
                MoPubLog.d("IronSource initialization succeeded for RewardedVideo");
                k.a("mopub300");
                k.b(activity, str, k.a.REWARDED_VIDEO);
                return;
            }
            return;
        }
        MoPubLog.d("IronSource initialization Failed, make sure that 'applicationKey' server parameter is added");
    }

    private void setCredentials(Map<String, String> map) {
        if (map.get(PLACEMENT_KEY) != null) {
            this.mPlacementName = map.get(PLACEMENT_KEY);
        }
        if (map.get(INSTANCE_ID_KEY) == null || TextUtils.isEmpty(map.get(INSTANCE_ID_KEY))) {
            return;
        }
        this.mInstanceId = map.get(INSTANCE_ID_KEY);
    }

    private MoPubErrorCode getMoPubErrorMessage(b bVar) {
        if (bVar == null) {
            return MoPubErrorCode.INTERNAL_ERROR;
        }
        switch (bVar.a()) {
            case 501:
            case 505:
            case 506:
            case 508:
                return MoPubErrorCode.ADAPTER_CONFIGURATION_ERROR;
            case 502:
                return MoPubErrorCode.VIDEO_CACHE_ERROR;
            case 509:
                return MoPubErrorCode.NETWORK_NO_FILL;
            case 510:
                return MoPubErrorCode.INTERNAL_ERROR;
            case 520:
                return MoPubErrorCode.NO_CONNECTION;
            default:
                return MoPubErrorCode.UNSPECIFIED;
        }
    }

    @Override // com.ironsource.b.f.g
    public void onRewardedVideoAvailabilityChanged(String str, boolean z) {
        MoPubLog.d("IronSource Rewarded Video changed availability: " + z + " for instance " + this.mInstanceId);
        if (this.mInstanceId.equals(str) && mIsFirstInitFlow) {
            if (z) {
                new d().a(2, 2, 0, 24, 99);
                MoPubRewardedVideoManager.onRewardedVideoLoadSuccess(IronSourceRewardedVideo.class, this.mInstanceId);
                MoPubLog.d("IronSource Rewarded Video loaded successfully for instance " + this.mInstanceId);
            } else {
                new d().a(2, 3, 0, 24, 99);
                MoPubRewardedVideoManager.onRewardedVideoLoadFailure(IronSourceRewardedVideo.class, this.mInstanceId, MoPubErrorCode.NETWORK_NO_FILL);
                MoPubLog.d("IronSource Rewarded Video failed to load for instance " + this.mInstanceId);
            }
            mIsFirstInitFlow = false;
        }
    }

    @Override // com.ironsource.b.f.g
    public void onRewardedVideoAdOpened(String str) {
        MoPubLog.d("IronSource Rewarded Video opened ad for instance " + str);
        MoPubRewardedVideoManager.onRewardedVideoStarted(IronSourceRewardedVideo.class, str);
        new d().a(2, 4, 0, 24, 99);
    }

    @Override // com.ironsource.b.f.g
    public void onRewardedVideoAdClosed(String str) {
        MoPubLog.d("IronSource Rewarded Video closed ad for instance " + str);
        MoPubRewardedVideoManager.onRewardedVideoClosed(IronSourceRewardedVideo.class, str);
    }

    @Override // com.ironsource.b.f.g
    public void onRewardedVideoAdRewarded(String str, com.ironsource.b.e.k kVar) {
        MoPubLog.d("IronSource Rewarded Video received reward for instance " + str);
        if (kVar != null) {
            MoPubRewardedVideoManager.onRewardedVideoCompleted(IronSourceRewardedVideo.class, str, MoPubReward.success(kVar.c(), kVar.d()));
        }
    }

    @Override // com.ironsource.b.f.g
    public void onRewardedVideoAdShowFailed(String str, b bVar) {
        MoPubLog.d("IronSource Rewarded Video failed to show for instance " + str);
        MoPubRewardedVideoManager.onRewardedVideoPlaybackError(IronSourceRewardedVideo.class, str, getMoPubErrorMessage(bVar));
    }

    @Override // com.ironsource.b.f.g
    public void onRewardedVideoAdClicked(String str, com.ironsource.b.e.k kVar) {
        MoPubLog.d("IronSource Rewarded Video clicked for instance " + str);
        MoPubRewardedVideoManager.onRewardedVideoClicked(IronSourceRewardedVideo.class, str);
    }
}
