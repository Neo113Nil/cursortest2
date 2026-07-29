package com.youappi.sdk.ads;

import com.youappi.sdk.AdType;
import com.youappi.sdk.BaseAd;
import com.youappi.sdk.YAErrorCode;
import com.youappi.sdk.ads.YAInterstitialVideoAd;

/* loaded from: classes2.dex */
public class YARewardedVideoAd extends BaseAd {
    private static final String TAG = "YARewardedVideoAd";
    private RewardedVideoAdListener _extListener;

    public interface RewardedVideoAdListener extends YAInterstitialVideoAd.InterstitialVideoAdListener {
        void onRewarded(String str);
    }

    public YARewardedVideoAd() {
        this._type = AdType.REWARDED_VIDEO;
        this._listener = new RewardedVideoAdListener() { // from class: com.youappi.sdk.ads.YARewardedVideoAd.1
            @Override // com.youappi.sdk.ads.YAInterstitialAd.InterstitialAdListener
            public void onAdClick(String str) {
                YARewardedVideoAd.this.logEvent(YARewardedVideoAd.TAG, "onAdClick");
                if (YARewardedVideoAd.this._extListener != null) {
                    YARewardedVideoAd.this.runOnMainThread(new Runnable() { // from class: com.youappi.sdk.ads.YARewardedVideoAd.1.4
                        @Override // java.lang.Runnable
                        public void run() {
                            YARewardedVideoAd.this._extListener.onAdClick(YARewardedVideoAd.this._adUnitId);
                        }
                    });
                }
            }

            @Override // com.youappi.sdk.ads.AdListener
            public void onAdEnded(String str) {
                YARewardedVideoAd.this.logEvent(YARewardedVideoAd.TAG, "onAdEnded - " + str);
                if (YARewardedVideoAd.this._extListener != null) {
                    YARewardedVideoAd.this.runOnMainThread(new Runnable() { // from class: com.youappi.sdk.ads.YARewardedVideoAd.1.13
                        @Override // java.lang.Runnable
                        public void run() {
                            YARewardedVideoAd.this._extListener.onAdEnded(YARewardedVideoAd.this._adUnitId);
                        }
                    });
                }
            }

            @Override // com.youappi.sdk.ads.YAInterstitialAd.InterstitialAdListener
            public void onAdLeftApplication(String str) {
                YARewardedVideoAd.this.logEvent(YARewardedVideoAd.TAG, "onAdLeftApplication");
                if (YARewardedVideoAd.this._extListener != null) {
                    YARewardedVideoAd.this.runOnMainThread(new Runnable() { // from class: com.youappi.sdk.ads.YARewardedVideoAd.1.5
                        @Override // java.lang.Runnable
                        public void run() {
                            YARewardedVideoAd.this._extListener.onAdLeftApplication(YARewardedVideoAd.this._adUnitId);
                        }
                    });
                }
            }

            @Override // com.youappi.sdk.ads.AdListener
            public void onAdStarted(String str) {
                YARewardedVideoAd.this.logEvent(YARewardedVideoAd.TAG, "onAdStarted - " + str);
                if (YARewardedVideoAd.this._extListener != null) {
                    YARewardedVideoAd.this.runOnMainThread(new Runnable() { // from class: com.youappi.sdk.ads.YARewardedVideoAd.1.12
                        @Override // java.lang.Runnable
                        public void run() {
                            YARewardedVideoAd.this._extListener.onAdStarted(YARewardedVideoAd.this._adUnitId);
                        }
                    });
                }
            }

            @Override // com.youappi.sdk.ads.YAInterstitialAd.InterstitialAdListener
            public void onCardClose(String str) {
                YARewardedVideoAd.this.logEvent(YARewardedVideoAd.TAG, "onCardClose");
                if (YARewardedVideoAd.this._extListener != null) {
                    YARewardedVideoAd.this.runOnMainThread(new Runnable() { // from class: com.youappi.sdk.ads.YARewardedVideoAd.1.3
                        @Override // java.lang.Runnable
                        public void run() {
                            YARewardedVideoAd.this._extListener.onCardClose(YARewardedVideoAd.this._adUnitId);
                        }
                    });
                }
                onRewarded(str);
                onAdEnded(YARewardedVideoAd.this._adUnitId);
            }

            @Override // com.youappi.sdk.ads.YAInterstitialAd.InterstitialAdListener
            public void onCardShow(String str) {
                YARewardedVideoAd.this.logEvent(YARewardedVideoAd.TAG, "onCardShow");
                if (YARewardedVideoAd.this._extListener != null) {
                    YARewardedVideoAd.this.runOnMainThread(new Runnable() { // from class: com.youappi.sdk.ads.YARewardedVideoAd.1.2
                        @Override // java.lang.Runnable
                        public void run() {
                            YARewardedVideoAd.this._extListener.onCardShow(YARewardedVideoAd.this._adUnitId);
                        }
                    });
                }
            }

            @Override // com.youappi.sdk.ads.AdListener
            public void onLoadFailure(String str, final YAErrorCode yAErrorCode, final Exception exc) {
                YARewardedVideoAd.this.logEvent(YARewardedVideoAd.TAG, "onLoadFailure err - " + exc);
                if (YARewardedVideoAd.this._extListener != null) {
                    YARewardedVideoAd.this.runOnMainThread(new Runnable() { // from class: com.youappi.sdk.ads.YARewardedVideoAd.1.11
                        @Override // java.lang.Runnable
                        public void run() {
                            YARewardedVideoAd.this._extListener.onLoadFailure(YARewardedVideoAd.this._adUnitId, yAErrorCode, exc);
                        }
                    });
                }
            }

            @Override // com.youappi.sdk.ads.AdListener
            public void onLoadSuccess(String str) {
                YARewardedVideoAd.this.logEvent(YARewardedVideoAd.TAG, "onLoadSuccess. Ad unit id: " + str);
                if (YARewardedVideoAd.this._extListener != null) {
                    YARewardedVideoAd.this.runOnMainThread(new Runnable() { // from class: com.youappi.sdk.ads.YARewardedVideoAd.1.10
                        @Override // java.lang.Runnable
                        public void run() {
                            YARewardedVideoAd.this._extListener.onLoadSuccess(YARewardedVideoAd.this._adUnitId);
                        }
                    });
                }
            }

            @Override // com.youappi.sdk.ads.YARewardedVideoAd.RewardedVideoAdListener
            public void onRewarded(String str) {
                YARewardedVideoAd.this.logEvent(YARewardedVideoAd.TAG, "onRewarded");
                if (YARewardedVideoAd.this._extListener != null) {
                    YARewardedVideoAd.this.runOnMainThread(new Runnable() { // from class: com.youappi.sdk.ads.YARewardedVideoAd.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            YARewardedVideoAd.this._extListener.onRewarded(YARewardedVideoAd.this._adUnitId);
                        }
                    });
                }
            }

            @Override // com.youappi.sdk.ads.AdListener
            public void onShowFailure(String str, final YAErrorCode yAErrorCode, final Exception exc) {
                YARewardedVideoAd.this.logError(6, YARewardedVideoAd.TAG + "onShowFailure - ", exc);
                if (YARewardedVideoAd.this._extListener != null) {
                    YARewardedVideoAd.this.runOnMainThread(new Runnable() { // from class: com.youappi.sdk.ads.YARewardedVideoAd.1.9
                        @Override // java.lang.Runnable
                        public void run() {
                            YARewardedVideoAd.this._extListener.onShowFailure(YARewardedVideoAd.this._adUnitId, yAErrorCode, exc);
                        }
                    });
                }
            }

            @Override // com.youappi.sdk.ads.YAInterstitialVideoAd.InterstitialVideoAdListener
            public void onVideoEnd(String str) {
                YARewardedVideoAd.this.logEvent(YARewardedVideoAd.TAG, "switchToEndCard");
                if (YARewardedVideoAd.this._extListener != null) {
                    YARewardedVideoAd.this.runOnMainThread(new Runnable() { // from class: com.youappi.sdk.ads.YARewardedVideoAd.1.7
                        @Override // java.lang.Runnable
                        public void run() {
                            YARewardedVideoAd.this._extListener.onVideoEnd(YARewardedVideoAd.this._adUnitId);
                        }
                    });
                }
            }

            @Override // com.youappi.sdk.ads.YAInterstitialVideoAd.InterstitialVideoAdListener
            public void onVideoSkipped(String str, final int i) {
                YARewardedVideoAd.this.logEvent(YARewardedVideoAd.TAG, "onVideoSkipped position - " + i);
                if (YARewardedVideoAd.this._extListener != null) {
                    YARewardedVideoAd.this.runOnMainThread(new Runnable() { // from class: com.youappi.sdk.ads.YARewardedVideoAd.1.8
                        @Override // java.lang.Runnable
                        public void run() {
                            YARewardedVideoAd.this._extListener.onVideoSkipped(YARewardedVideoAd.this._adUnitId, i);
                        }
                    });
                }
            }

            @Override // com.youappi.sdk.ads.YAInterstitialVideoAd.InterstitialVideoAdListener
            public void onVideoStart(String str) {
                YARewardedVideoAd.this.logEvent(YARewardedVideoAd.TAG, "onVideoStart");
                if (YARewardedVideoAd.this._extListener != null) {
                    YARewardedVideoAd.this.runOnMainThread(new Runnable() { // from class: com.youappi.sdk.ads.YARewardedVideoAd.1.6
                        @Override // java.lang.Runnable
                        public void run() {
                            YARewardedVideoAd.this._extListener.onVideoStart(YARewardedVideoAd.this._adUnitId);
                        }
                    });
                }
            }
        };
    }

    public void setRewardedVideoAdListener(RewardedVideoAdListener rewardedVideoAdListener) {
        this._extListener = rewardedVideoAdListener;
    }
}
