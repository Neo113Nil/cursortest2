package com.youappi.sdk.ads;

import com.youappi.sdk.AdType;
import com.youappi.sdk.BaseAd;
import com.youappi.sdk.YAErrorCode;

/* loaded from: classes2.dex */
public class YAInterstitialAd extends BaseAd {
    private static final String TAG = "YAInterstitialAd";
    private InterstitialAdListener _extListener;

    public interface InterstitialAdListener extends AdListener {
        void onAdClick(String str);

        void onAdLeftApplication(String str);

        void onCardClose(String str);

        void onCardShow(String str);
    }

    public YAInterstitialAd() {
        this._type = AdType.CARD;
        this._listener = new InterstitialAdListener() { // from class: com.youappi.sdk.ads.YAInterstitialAd.1
            @Override // com.youappi.sdk.ads.YAInterstitialAd.InterstitialAdListener
            public void onAdClick(String str) {
                YAInterstitialAd.this.logEvent(YAInterstitialAd.TAG, "onAdClick");
                if (YAInterstitialAd.this._extListener != null) {
                    YAInterstitialAd.this.runOnMainThread(new Runnable() { // from class: com.youappi.sdk.ads.YAInterstitialAd.1.3
                        @Override // java.lang.Runnable
                        public void run() {
                            YAInterstitialAd.this._extListener.onAdClick(YAInterstitialAd.this._adUnitId);
                        }
                    });
                }
            }

            @Override // com.youappi.sdk.ads.AdListener
            public void onAdEnded(String str) {
                YAInterstitialAd.this.logEvent(YAInterstitialAd.TAG, "onAdEnded - " + str);
                if (YAInterstitialAd.this._extListener != null) {
                    YAInterstitialAd.this.runOnMainThread(new Runnable() { // from class: com.youappi.sdk.ads.YAInterstitialAd.1.9
                        @Override // java.lang.Runnable
                        public void run() {
                            YAInterstitialAd.this._extListener.onAdEnded(YAInterstitialAd.this._adUnitId);
                        }
                    });
                }
            }

            @Override // com.youappi.sdk.ads.YAInterstitialAd.InterstitialAdListener
            public void onAdLeftApplication(String str) {
                YAInterstitialAd.this.logEvent(YAInterstitialAd.TAG, "onAdLeftApplication");
                if (YAInterstitialAd.this._extListener != null) {
                    YAInterstitialAd.this.runOnMainThread(new Runnable() { // from class: com.youappi.sdk.ads.YAInterstitialAd.1.4
                        @Override // java.lang.Runnable
                        public void run() {
                            YAInterstitialAd.this._extListener.onAdLeftApplication(YAInterstitialAd.this._adUnitId);
                        }
                    });
                }
            }

            @Override // com.youappi.sdk.ads.AdListener
            public void onAdStarted(String str) {
                YAInterstitialAd.this.logEvent(YAInterstitialAd.TAG, "onAdStarted - " + str);
                if (YAInterstitialAd.this._extListener != null) {
                    YAInterstitialAd.this.runOnMainThread(new Runnable() { // from class: com.youappi.sdk.ads.YAInterstitialAd.1.8
                        @Override // java.lang.Runnable
                        public void run() {
                            YAInterstitialAd.this._extListener.onAdStarted(YAInterstitialAd.this._adUnitId);
                        }
                    });
                }
            }

            @Override // com.youappi.sdk.ads.YAInterstitialAd.InterstitialAdListener
            public void onCardClose(String str) {
                YAInterstitialAd.this.logEvent(YAInterstitialAd.TAG, "onCardClose");
                if (YAInterstitialAd.this._extListener != null) {
                    YAInterstitialAd.this.runOnMainThread(new Runnable() { // from class: com.youappi.sdk.ads.YAInterstitialAd.1.2
                        @Override // java.lang.Runnable
                        public void run() {
                            YAInterstitialAd.this._extListener.onCardClose(YAInterstitialAd.this._adUnitId);
                        }
                    });
                }
                onAdEnded(YAInterstitialAd.this._adUnitId);
            }

            @Override // com.youappi.sdk.ads.YAInterstitialAd.InterstitialAdListener
            public void onCardShow(String str) {
                YAInterstitialAd.this.logEvent(YAInterstitialAd.TAG, "onCardShow");
                if (YAInterstitialAd.this._extListener != null) {
                    YAInterstitialAd.this.runOnMainThread(new Runnable() { // from class: com.youappi.sdk.ads.YAInterstitialAd.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            YAInterstitialAd.this._extListener.onCardShow(YAInterstitialAd.this._adUnitId);
                        }
                    });
                }
            }

            @Override // com.youappi.sdk.ads.AdListener
            public void onLoadFailure(String str, final YAErrorCode yAErrorCode, final Exception exc) {
                YAInterstitialAd.this.logEvent(YAInterstitialAd.TAG, "onLoadFailure - " + exc);
                if (YAInterstitialAd.this._extListener != null) {
                    YAInterstitialAd.this.runOnMainThread(new Runnable() { // from class: com.youappi.sdk.ads.YAInterstitialAd.1.6
                        @Override // java.lang.Runnable
                        public void run() {
                            YAInterstitialAd.this._extListener.onLoadFailure(YAInterstitialAd.this._adUnitId, yAErrorCode, exc);
                        }
                    });
                }
            }

            @Override // com.youappi.sdk.ads.AdListener
            public void onLoadSuccess(String str) {
                YAInterstitialAd.this.logEvent(YAInterstitialAd.TAG, "onLoadSuccess");
                if (YAInterstitialAd.this._extListener != null) {
                    YAInterstitialAd.this.runOnMainThread(new Runnable() { // from class: com.youappi.sdk.ads.YAInterstitialAd.1.5
                        @Override // java.lang.Runnable
                        public void run() {
                            YAInterstitialAd.this._extListener.onLoadSuccess(YAInterstitialAd.this._adUnitId);
                        }
                    });
                }
            }

            @Override // com.youappi.sdk.ads.AdListener
            public void onShowFailure(String str, final YAErrorCode yAErrorCode, final Exception exc) {
                YAInterstitialAd.this.logError(6, YAInterstitialAd.TAG + " onShowFailure - ", exc);
                if (YAInterstitialAd.this._extListener != null) {
                    YAInterstitialAd.this.runOnMainThread(new Runnable() { // from class: com.youappi.sdk.ads.YAInterstitialAd.1.7
                        @Override // java.lang.Runnable
                        public void run() {
                            YAInterstitialAd.this._extListener.onShowFailure(YAInterstitialAd.this._adUnitId, yAErrorCode, exc);
                        }
                    });
                }
            }
        };
    }

    public void setInterstitialAdListener(InterstitialAdListener interstitialAdListener) {
        this._extListener = interstitialAdListener;
    }
}
