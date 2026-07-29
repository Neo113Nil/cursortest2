package com.youappi.sdk.ads;

import com.youappi.sdk.AdType;
import com.youappi.sdk.BaseAd;
import com.youappi.sdk.YAErrorCode;
import com.youappi.sdk.ads.YAInterstitialAd;

/* loaded from: classes2.dex */
public class YAInterstitialVideoAd extends BaseAd {
    private static final String TAG = "YAInterstitialVideoAd";
    private InterstitialVideoAdListener _extListener;

    public interface InterstitialVideoAdListener extends YAInterstitialAd.InterstitialAdListener {
        void onVideoEnd(String str);

        void onVideoSkipped(String str, int i);

        void onVideoStart(String str);
    }

    public YAInterstitialVideoAd() {
        this._type = AdType.VIDEO;
        this._listener = new InterstitialVideoAdListener() { // from class: com.youappi.sdk.ads.YAInterstitialVideoAd.1
            @Override // com.youappi.sdk.ads.YAInterstitialAd.InterstitialAdListener
            public void onAdClick(String str) {
                YAInterstitialVideoAd.this.logEvent(YAInterstitialVideoAd.TAG, "onAdClick");
                if (YAInterstitialVideoAd.this._extListener != null) {
                    YAInterstitialVideoAd.this.runOnMainThread(new Runnable() { // from class: com.youappi.sdk.ads.YAInterstitialVideoAd.1.3
                        @Override // java.lang.Runnable
                        public void run() {
                            YAInterstitialVideoAd.this._extListener.onAdClick(YAInterstitialVideoAd.this._adUnitId);
                        }
                    });
                }
            }

            @Override // com.youappi.sdk.ads.AdListener
            public void onAdEnded(String str) {
                YAInterstitialVideoAd.this.logEvent(YAInterstitialVideoAd.TAG, "onAdEnded - " + str);
                if (YAInterstitialVideoAd.this._extListener != null) {
                    YAInterstitialVideoAd.this.runOnMainThread(new Runnable() { // from class: com.youappi.sdk.ads.YAInterstitialVideoAd.1.12
                        @Override // java.lang.Runnable
                        public void run() {
                            YAInterstitialVideoAd.this._extListener.onAdEnded(YAInterstitialVideoAd.this._adUnitId);
                        }
                    });
                }
            }

            @Override // com.youappi.sdk.ads.YAInterstitialAd.InterstitialAdListener
            public void onAdLeftApplication(String str) {
                YAInterstitialVideoAd.this.logEvent(YAInterstitialVideoAd.TAG, "onAdLeftApplication");
                if (YAInterstitialVideoAd.this._extListener != null) {
                    YAInterstitialVideoAd.this.runOnMainThread(new Runnable() { // from class: com.youappi.sdk.ads.YAInterstitialVideoAd.1.4
                        @Override // java.lang.Runnable
                        public void run() {
                            YAInterstitialVideoAd.this._extListener.onAdLeftApplication(YAInterstitialVideoAd.this._adUnitId);
                        }
                    });
                }
            }

            @Override // com.youappi.sdk.ads.AdListener
            public void onAdStarted(String str) {
                YAInterstitialVideoAd.this.logEvent(YAInterstitialVideoAd.TAG, "onAdStarted - " + str);
                if (YAInterstitialVideoAd.this._extListener != null) {
                    YAInterstitialVideoAd.this.runOnMainThread(new Runnable() { // from class: com.youappi.sdk.ads.YAInterstitialVideoAd.1.11
                        @Override // java.lang.Runnable
                        public void run() {
                            YAInterstitialVideoAd.this._extListener.onAdStarted(YAInterstitialVideoAd.this._adUnitId);
                        }
                    });
                }
            }

            @Override // com.youappi.sdk.ads.YAInterstitialAd.InterstitialAdListener
            public void onCardClose(String str) {
                YAInterstitialVideoAd.this.logEvent(YAInterstitialVideoAd.TAG, "onCardClose");
                if (YAInterstitialVideoAd.this._extListener != null) {
                    YAInterstitialVideoAd.this.runOnMainThread(new Runnable() { // from class: com.youappi.sdk.ads.YAInterstitialVideoAd.1.2
                        @Override // java.lang.Runnable
                        public void run() {
                            YAInterstitialVideoAd.this._extListener.onCardClose(YAInterstitialVideoAd.this._adUnitId);
                        }
                    });
                }
                onAdEnded(YAInterstitialVideoAd.this._adUnitId);
            }

            @Override // com.youappi.sdk.ads.YAInterstitialAd.InterstitialAdListener
            public void onCardShow(String str) {
                YAInterstitialVideoAd.this.logEvent(YAInterstitialVideoAd.TAG, "onCardShow");
                if (YAInterstitialVideoAd.this._extListener != null) {
                    YAInterstitialVideoAd.this.runOnMainThread(new Runnable() { // from class: com.youappi.sdk.ads.YAInterstitialVideoAd.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            YAInterstitialVideoAd.this._extListener.onCardShow(YAInterstitialVideoAd.this._adUnitId);
                        }
                    });
                }
            }

            @Override // com.youappi.sdk.ads.AdListener
            public void onLoadFailure(String str, final YAErrorCode yAErrorCode, final Exception exc) {
                YAInterstitialVideoAd.this.logEvent(YAInterstitialVideoAd.TAG, "onLoadFailure err - " + exc);
                if (YAInterstitialVideoAd.this._extListener != null) {
                    YAInterstitialVideoAd.this.runOnMainThread(new Runnable() { // from class: com.youappi.sdk.ads.YAInterstitialVideoAd.1.10
                        @Override // java.lang.Runnable
                        public void run() {
                            YAInterstitialVideoAd.this._extListener.onLoadFailure(YAInterstitialVideoAd.this._adUnitId, yAErrorCode, exc);
                        }
                    });
                }
            }

            @Override // com.youappi.sdk.ads.AdListener
            public void onLoadSuccess(String str) {
                YAInterstitialVideoAd.this.logEvent(YAInterstitialVideoAd.TAG, "onLoadSuccess. Ad unit id: " + str);
                if (YAInterstitialVideoAd.this._extListener != null) {
                    YAInterstitialVideoAd.this.runOnMainThread(new Runnable() { // from class: com.youappi.sdk.ads.YAInterstitialVideoAd.1.9
                        @Override // java.lang.Runnable
                        public void run() {
                            YAInterstitialVideoAd.this._extListener.onLoadSuccess(YAInterstitialVideoAd.this._adUnitId);
                        }
                    });
                }
            }

            @Override // com.youappi.sdk.ads.AdListener
            public void onShowFailure(String str, final YAErrorCode yAErrorCode, final Exception exc) {
                YAInterstitialVideoAd.this.logError(6, YAInterstitialVideoAd.TAG + " onShowFailure - ", exc);
                if (YAInterstitialVideoAd.this._extListener != null) {
                    YAInterstitialVideoAd.this.runOnMainThread(new Runnable() { // from class: com.youappi.sdk.ads.YAInterstitialVideoAd.1.8
                        @Override // java.lang.Runnable
                        public void run() {
                            YAInterstitialVideoAd.this._extListener.onShowFailure(YAInterstitialVideoAd.this._adUnitId, yAErrorCode, exc);
                        }
                    });
                }
            }

            @Override // com.youappi.sdk.ads.YAInterstitialVideoAd.InterstitialVideoAdListener
            public void onVideoEnd(String str) {
                YAInterstitialVideoAd.this.logEvent(YAInterstitialVideoAd.TAG, "onVideoEnd");
                if (YAInterstitialVideoAd.this._extListener != null) {
                    YAInterstitialVideoAd.this.runOnMainThread(new Runnable() { // from class: com.youappi.sdk.ads.YAInterstitialVideoAd.1.6
                        @Override // java.lang.Runnable
                        public void run() {
                            YAInterstitialVideoAd.this._extListener.onVideoEnd(YAInterstitialVideoAd.this._adUnitId);
                        }
                    });
                }
            }

            @Override // com.youappi.sdk.ads.YAInterstitialVideoAd.InterstitialVideoAdListener
            public void onVideoSkipped(String str, final int i) {
                YAInterstitialVideoAd.this.logEvent(YAInterstitialVideoAd.TAG, "onVideoSkipped position - " + i);
                if (YAInterstitialVideoAd.this._extListener != null) {
                    YAInterstitialVideoAd.this.runOnMainThread(new Runnable() { // from class: com.youappi.sdk.ads.YAInterstitialVideoAd.1.7
                        @Override // java.lang.Runnable
                        public void run() {
                            YAInterstitialVideoAd.this._extListener.onVideoSkipped(YAInterstitialVideoAd.this._adUnitId, i);
                        }
                    });
                }
            }

            @Override // com.youappi.sdk.ads.YAInterstitialVideoAd.InterstitialVideoAdListener
            public void onVideoStart(String str) {
                YAInterstitialVideoAd.this.logEvent(YAInterstitialVideoAd.TAG, "onVideoStart");
                if (YAInterstitialVideoAd.this._extListener != null) {
                    YAInterstitialVideoAd.this.runOnMainThread(new Runnable() { // from class: com.youappi.sdk.ads.YAInterstitialVideoAd.1.5
                        @Override // java.lang.Runnable
                        public void run() {
                            YAInterstitialVideoAd.this._extListener.onVideoStart(YAInterstitialVideoAd.this._adUnitId);
                        }
                    });
                }
            }
        };
    }

    public void setInterstitialVideoAdListener(InterstitialVideoAdListener interstitialVideoAdListener) {
        this._extListener = interstitialVideoAdListener;
    }
}
