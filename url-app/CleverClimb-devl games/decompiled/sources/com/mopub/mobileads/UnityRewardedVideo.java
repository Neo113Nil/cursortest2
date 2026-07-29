package com.mopub.mobileads;

import android.app.Activity;
import com.cmplay.a.d;
import com.mopub.common.BaseLifecycleListener;
import com.mopub.common.LifecycleListener;
import com.mopub.common.MoPubReward;
import com.mopub.common.VisibleForTesting;
import com.mopub.common.logging.MoPubLog;
import com.mopub.mobileads.CustomEventRewardedVideo;
import com.mopub.mobileads.UnityRouter;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.mediation.IUnityAdsExtendedListener;
import java.util.Map;

/* loaded from: classes2.dex */
public class UnityRewardedVideo extends CustomEventRewardedVideo {
    private static final String GAME_ID_KEY = "gameId";
    private static final LifecycleListener sLifecycleListener;
    private static String sPlacementId = "";
    private static final UnityAdsListener sUnityAdsListener;
    private Activity mLauncherActivity;

    static {
        sLifecycleListener = new UnityLifecycleListener();
        sUnityAdsListener = new UnityAdsListener();
    }

    @Override // com.mopub.mobileads.CustomEventRewardedVideo
    public CustomEventRewardedVideo.CustomEventRewardedVideoListener getVideoListenerForSdk() {
        return sUnityAdsListener;
    }

    @Override // com.mopub.mobileads.CustomEventRewardedAd
    public LifecycleListener getLifecycleListener() {
        return sLifecycleListener;
    }

    @Override // com.mopub.mobileads.CustomEventRewardedAd
    public String getAdNetworkId() {
        return sPlacementId;
    }

    @Override // com.mopub.mobileads.CustomEventRewardedAd
    public boolean checkAndInitializeSdk(Activity activity, Map<String, Object> map, Map<String, String> map2) throws Exception {
        synchronized (UnityRewardedVideo.class) {
            if (UnityAds.isInitialized()) {
                return false;
            }
            try {
                UnityRouter.initUnityAds(map2, activity);
                UnityRouter.addListener(sPlacementId, sUnityAdsListener);
            } catch (UnityRouter.UnityAdsException e) {
                MoPubLog.e("Failed to initialize Unity Ads.");
                MoPubRewardedVideoManager.onRewardedVideoLoadFailure(UnityRewardedVideo.class, sPlacementId, UnityRouter.UnityAdsUtils.getMoPubErrorCode(e.getErrorCode()));
                new d().a(2, 3, 0, 25, 99);
            }
            return true;
        }
    }

    @Override // com.mopub.mobileads.CustomEventRewardedAd
    protected void loadWithSdkInitialized(Activity activity, Map<String, Object> map, Map<String, String> map2) throws Exception {
        new d().a(2, 1, 0, 25, 99);
        sPlacementId = UnityRouter.placementIdForServerExtras(map2, sPlacementId);
        this.mLauncherActivity = activity;
        UnityRouter.addListener(sPlacementId, sUnityAdsListener);
        if (hasVideoAvailable()) {
            new d().a(2, 2, 0, 25, 99);
            MoPubRewardedVideoManager.onRewardedVideoLoadSuccess(UnityRewardedVideo.class, sPlacementId);
        }
    }

    @Override // com.mopub.mobileads.CustomEventRewardedVideo
    public boolean hasVideoAvailable() {
        return UnityAds.isReady(sPlacementId);
    }

    @Override // com.mopub.mobileads.CustomEventRewardedVideo
    public void showVideo() {
        if (hasVideoAvailable()) {
            UnityAds.show(this.mLauncherActivity, sPlacementId);
        } else {
            MoPubLog.d("Attempted to show Unity rewarded video before it was available.");
        }
    }

    @Override // com.mopub.mobileads.CustomEventRewardedAd
    protected void onInvalidate() {
        UnityRouter.removeListener(sPlacementId);
    }

    private static final class UnityLifecycleListener extends BaseLifecycleListener {
        private UnityLifecycleListener() {
        }

        @Override // com.mopub.common.BaseLifecycleListener, com.mopub.common.LifecycleListener
        public void onCreate(Activity activity) {
            super.onCreate(activity);
        }

        @Override // com.mopub.common.BaseLifecycleListener, com.mopub.common.LifecycleListener
        public void onResume(Activity activity) {
            super.onResume(activity);
        }
    }

    private static class UnityAdsListener implements CustomEventRewardedVideo.CustomEventRewardedVideoListener, IUnityAdsExtendedListener {
        @Override // com.unity3d.ads.mediation.IUnityAdsExtendedListener
        public void onUnityAdsPlacementStateChanged(String str, UnityAds.PlacementState placementState, UnityAds.PlacementState placementState2) {
        }

        private UnityAdsListener() {
        }

        @Override // com.unity3d.ads.IUnityAdsListener
        public void onUnityAdsReady(String str) {
            if (str.equals(UnityRewardedVideo.sPlacementId)) {
                MoPubLog.d("Unity rewarded video cached for placement " + str + ".");
                MoPubRewardedVideoManager.onRewardedVideoLoadSuccess(UnityRewardedVideo.class, str);
                new d().a(2, 1, 0, 25, 99);
            }
        }

        @Override // com.unity3d.ads.IUnityAdsListener
        public void onUnityAdsStart(String str) {
            MoPubRewardedVideoManager.onRewardedVideoStarted(UnityRewardedVideo.class, str);
            new d().a(2, 4, 0, 25, 99);
            MoPubLog.d("Unity rewarded video started for placement " + str + ".");
        }

        @Override // com.unity3d.ads.IUnityAdsListener
        public void onUnityAdsFinish(String str, UnityAds.FinishState finishState) {
            MoPubLog.d("Unity Ad finished with finish state = " + finishState);
            if (finishState == UnityAds.FinishState.ERROR) {
                MoPubRewardedVideoManager.onRewardedVideoPlaybackError(UnityRewardedVideo.class, UnityRewardedVideo.sPlacementId, MoPubErrorCode.VIDEO_PLAYBACK_ERROR);
                MoPubLog.d("Unity rewarded video encountered a playback error for placement " + str);
            } else if (finishState == UnityAds.FinishState.COMPLETED) {
                MoPubRewardedVideoManager.onRewardedVideoCompleted(UnityRewardedVideo.class, UnityRewardedVideo.sPlacementId, MoPubReward.success("", MoPubReward.NO_REWARD_AMOUNT));
                MoPubLog.d("Unity rewarded video completed for placement " + str);
            } else if (finishState == UnityAds.FinishState.SKIPPED) {
                MoPubLog.d("Unity ad was skipped, no reward will be given.");
            }
            MoPubRewardedVideoManager.onRewardedVideoClosed(UnityRewardedVideo.class, UnityRewardedVideo.sPlacementId);
            UnityRouter.removeListener(str);
        }

        @Override // com.unity3d.ads.mediation.IUnityAdsExtendedListener
        public void onUnityAdsClick(String str) {
            MoPubRewardedVideoManager.onRewardedVideoClicked(UnityRewardedVideo.class, str);
            MoPubLog.d("Unity rewarded video clicked for placement " + str + ".");
        }

        @Override // com.unity3d.ads.IUnityAdsListener
        public void onUnityAdsError(UnityAds.UnityAdsError unityAdsError, String str) {
            MoPubLog.d("Unity rewarded video cache failed for placement " + UnityRewardedVideo.sPlacementId + ".");
            MoPubRewardedVideoManager.onRewardedVideoLoadFailure(UnityRewardedVideo.class, UnityRewardedVideo.sPlacementId, UnityRouter.UnityAdsUtils.getMoPubErrorCode(unityAdsError));
            new d().a(2, 3, 0, 25, 99);
        }
    }

    @VisibleForTesting
    void reset() {
        sPlacementId = "";
    }
}
