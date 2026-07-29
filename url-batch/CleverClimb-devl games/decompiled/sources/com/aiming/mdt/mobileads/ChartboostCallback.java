package com.aiming.mdt.mobileads;

import com.chartboost.sdk.ChartboostDelegate;
import com.chartboost.sdk.Model.CBError;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
class ChartboostCallback extends ChartboostDelegate {
    private Map<String, ChartboostInterstitialAdsListener> mInterstitialListeners;
    private Map<String, ChartboostVideoAdsListener> mVideoListeners;

    interface ChartboostInterstitialAdsListener {
        void onInterstitialCached(String str);

        void onInterstitialClick(String str);

        void onInterstitialClose(String str);

        void onInterstitialFailToLoad(String str, CBError.CBImpressionError cBImpressionError);

        void onInterstitialShow(String str);
    }

    interface ChartboostVideoAdsListener {
        void onRewardVideoCached(String str);

        void onRewardVideoClick(String str);

        void onRewardVideoClose(String str);

        void onRewardVideoComplete(String str);

        void onRewardVideoFailToLoad(String str, CBError.CBImpressionError cBImpressionError);

        void onRewardVideoShow(String str);
    }

    @Override // com.chartboost.sdk.ChartboostDelegate, com.chartboost.sdk.a
    public void didCloseInterstitial(String str) {
    }

    @Override // com.chartboost.sdk.ChartboostDelegate, com.chartboost.sdk.a
    public void didCloseRewardedVideo(String str) {
    }

    @Override // com.chartboost.sdk.ChartboostDelegate, com.chartboost.sdk.a
    public boolean shouldDisplayInterstitial(String str) {
        return true;
    }

    @Override // com.chartboost.sdk.ChartboostDelegate, com.chartboost.sdk.a
    public boolean shouldDisplayRewardedVideo(String str) {
        return true;
    }

    @Override // com.chartboost.sdk.ChartboostDelegate, com.chartboost.sdk.a
    public boolean shouldRequestInterstitial(String str) {
        return true;
    }

    private static final class CBHolder {
        private static final ChartboostCallback INSTANCE = new ChartboostCallback();

        private CBHolder() {
        }
    }

    private ChartboostCallback() {
        this.mInterstitialListeners = new HashMap();
        this.mVideoListeners = new HashMap();
    }

    static ChartboostCallback getInstance() {
        return CBHolder.INSTANCE;
    }

    void addInterstitialListener(String str, ChartboostInterstitialAdsListener chartboostInterstitialAdsListener) {
        this.mInterstitialListeners.put(str, chartboostInterstitialAdsListener);
    }

    void addVideoListener(String str, ChartboostVideoAdsListener chartboostVideoAdsListener) {
        this.mVideoListeners.put(str, chartboostVideoAdsListener);
    }

    @Override // com.chartboost.sdk.ChartboostDelegate, com.chartboost.sdk.a
    public void didCacheInterstitial(String str) {
        ChartboostInterstitialAdsListener chartboostInterstitialAdsListener = this.mInterstitialListeners.get(str);
        if (chartboostInterstitialAdsListener != null) {
            chartboostInterstitialAdsListener.onInterstitialCached(str);
        }
    }

    @Override // com.chartboost.sdk.ChartboostDelegate, com.chartboost.sdk.a
    public void didFailToLoadInterstitial(String str, CBError.CBImpressionError cBImpressionError) {
        ChartboostInterstitialAdsListener chartboostInterstitialAdsListener = this.mInterstitialListeners.get(str);
        if (chartboostInterstitialAdsListener != null) {
            chartboostInterstitialAdsListener.onInterstitialFailToLoad(str, cBImpressionError);
        }
    }

    @Override // com.chartboost.sdk.ChartboostDelegate, com.chartboost.sdk.a
    public void didClickInterstitial(String str) {
        ChartboostInterstitialAdsListener chartboostInterstitialAdsListener = this.mInterstitialListeners.get(str);
        if (chartboostInterstitialAdsListener != null) {
            chartboostInterstitialAdsListener.onInterstitialClick(str);
        }
    }

    @Override // com.chartboost.sdk.ChartboostDelegate, com.chartboost.sdk.a
    public void didDisplayInterstitial(String str) {
        ChartboostInterstitialAdsListener chartboostInterstitialAdsListener = this.mInterstitialListeners.get(str);
        if (chartboostInterstitialAdsListener != null) {
            chartboostInterstitialAdsListener.onInterstitialShow(str);
        }
    }

    @Override // com.chartboost.sdk.ChartboostDelegate, com.chartboost.sdk.a
    public void didCacheRewardedVideo(String str) {
        ChartboostVideoAdsListener chartboostVideoAdsListener = this.mVideoListeners.get(str);
        if (chartboostVideoAdsListener != null) {
            chartboostVideoAdsListener.onRewardVideoCached(str);
        }
    }

    @Override // com.chartboost.sdk.ChartboostDelegate, com.chartboost.sdk.a
    public void didFailToLoadRewardedVideo(String str, CBError.CBImpressionError cBImpressionError) {
        ChartboostVideoAdsListener chartboostVideoAdsListener = this.mVideoListeners.get(str);
        if (chartboostVideoAdsListener != null) {
            chartboostVideoAdsListener.onRewardVideoFailToLoad(str, cBImpressionError);
        }
    }

    @Override // com.chartboost.sdk.ChartboostDelegate, com.chartboost.sdk.a
    public void didClickRewardedVideo(String str) {
        ChartboostVideoAdsListener chartboostVideoAdsListener = this.mVideoListeners.get(str);
        if (chartboostVideoAdsListener != null) {
            chartboostVideoAdsListener.onRewardVideoClick(str);
        }
    }

    @Override // com.chartboost.sdk.ChartboostDelegate, com.chartboost.sdk.a
    public void didCompleteRewardedVideo(String str, int i) {
        ChartboostVideoAdsListener chartboostVideoAdsListener = this.mVideoListeners.get(str);
        if (chartboostVideoAdsListener != null) {
            chartboostVideoAdsListener.onRewardVideoComplete(str);
        }
    }

    @Override // com.chartboost.sdk.ChartboostDelegate, com.chartboost.sdk.a
    public void didDismissInterstitial(String str) {
        ChartboostInterstitialAdsListener chartboostInterstitialAdsListener = this.mInterstitialListeners.get(str);
        if (chartboostInterstitialAdsListener != null) {
            chartboostInterstitialAdsListener.onInterstitialClose(str);
            this.mInterstitialListeners.remove(str);
        }
    }

    @Override // com.chartboost.sdk.ChartboostDelegate, com.chartboost.sdk.a
    public void didDismissRewardedVideo(String str) {
        ChartboostVideoAdsListener chartboostVideoAdsListener = this.mVideoListeners.get(str);
        if (chartboostVideoAdsListener != null) {
            chartboostVideoAdsListener.onRewardVideoClose(str);
            this.mVideoListeners.remove(str);
        }
    }

    @Override // com.chartboost.sdk.ChartboostDelegate, com.chartboost.sdk.a
    public void didDisplayRewardedVideo(String str) {
        ChartboostVideoAdsListener chartboostVideoAdsListener = this.mVideoListeners.get(str);
        if (chartboostVideoAdsListener != null) {
            chartboostVideoAdsListener.onRewardVideoShow(str);
        }
    }
}
