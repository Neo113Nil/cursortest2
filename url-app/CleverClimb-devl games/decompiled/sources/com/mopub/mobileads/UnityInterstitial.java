package com.mopub.mobileads;

import android.app.Activity;
import android.content.Context;
import com.mopub.common.logging.MoPubLog;
import com.mopub.mobileads.CustomEventInterstitial;
import com.mopub.mobileads.UnityRouter;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.mediation.IUnityAdsExtendedListener;
import java.util.Map;

/* loaded from: classes2.dex */
public class UnityInterstitial extends CustomEventInterstitial implements IUnityAdsExtendedListener {
    private Context mContext;
    private CustomEventInterstitial.CustomEventInterstitialListener mCustomEventInterstitialListener;
    private String mPlacementId = "video";
    private boolean loadRequested = false;

    @Override // com.unity3d.ads.mediation.IUnityAdsExtendedListener
    public void onUnityAdsPlacementStateChanged(String str, UnityAds.PlacementState placementState, UnityAds.PlacementState placementState2) {
    }

    @Override // com.mopub.mobileads.CustomEventInterstitial
    protected void loadInterstitial(Context context, CustomEventInterstitial.CustomEventInterstitialListener customEventInterstitialListener, Map<String, Object> map, Map<String, String> map2) {
        this.mPlacementId = UnityRouter.placementIdForServerExtras(map2, this.mPlacementId);
        this.mCustomEventInterstitialListener = customEventInterstitialListener;
        this.mContext = context;
        this.loadRequested = true;
        try {
            UnityRouter.addListener(this.mPlacementId, this);
            initializeUnityAdsSdk(map2);
            if (UnityAds.isReady(this.mPlacementId)) {
                this.mCustomEventInterstitialListener.onInterstitialLoaded();
                this.loadRequested = false;
            }
        } catch (UnityRouter.UnityAdsException e) {
            this.mCustomEventInterstitialListener.onInterstitialFailed(UnityRouter.UnityAdsUtils.getMoPubErrorCode(e.getErrorCode()));
        }
    }

    private void initializeUnityAdsSdk(Map<String, String> map) {
        if (UnityAds.isInitialized()) {
            return;
        }
        if (!(this.mContext instanceof Activity)) {
            MoPubLog.e("Context is null or is not an instanceof Activity.");
        } else {
            UnityRouter.initUnityAds(map, (Activity) this.mContext);
        }
    }

    @Override // com.mopub.mobileads.CustomEventInterstitial
    protected void showInterstitial() {
        if (UnityAds.isReady(this.mPlacementId) && this.mContext != null) {
            UnityAds.show((Activity) this.mContext, this.mPlacementId);
        } else {
            MoPubLog.d("Attempted to show Unity interstitial video before it was available.");
        }
    }

    @Override // com.mopub.mobileads.CustomEventInterstitial
    protected void onInvalidate() {
        UnityRouter.removeListener(this.mPlacementId);
    }

    @Override // com.unity3d.ads.IUnityAdsListener
    public void onUnityAdsReady(String str) {
        if (this.loadRequested) {
            this.mCustomEventInterstitialListener.onInterstitialLoaded();
            this.loadRequested = false;
        }
    }

    @Override // com.unity3d.ads.IUnityAdsListener
    public void onUnityAdsStart(String str) {
        this.mCustomEventInterstitialListener.onInterstitialShown();
    }

    @Override // com.unity3d.ads.IUnityAdsListener
    public void onUnityAdsFinish(String str, UnityAds.FinishState finishState) {
        if (finishState == UnityAds.FinishState.ERROR) {
            MoPubLog.d("Unity interstitial video encountered a playback error for placement " + str);
            this.mCustomEventInterstitialListener.onInterstitialFailed(MoPubErrorCode.VIDEO_PLAYBACK_ERROR);
        } else {
            MoPubLog.d("Unity interstitial video completed for placement " + str);
            this.mCustomEventInterstitialListener.onInterstitialDismissed();
        }
        UnityRouter.removeListener(str);
    }

    @Override // com.unity3d.ads.mediation.IUnityAdsExtendedListener
    public void onUnityAdsClick(String str) {
        this.mCustomEventInterstitialListener.onInterstitialClicked();
    }

    @Override // com.unity3d.ads.IUnityAdsListener
    public void onUnityAdsError(UnityAds.UnityAdsError unityAdsError, String str) {
        MoPubLog.d("Unity interstitial video cache failed for placement " + this.mPlacementId + ".");
        this.mCustomEventInterstitialListener.onInterstitialFailed(UnityRouter.UnityAdsUtils.getMoPubErrorCode(unityAdsError));
    }
}
