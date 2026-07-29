package com.mopub.mobileads;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdSettings;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import com.mopub.common.DataKeys;
import com.mopub.common.logging.MoPubLog;
import com.mopub.mobileads.CustomEventInterstitial;
import java.util.Map;

/* loaded from: classes2.dex */
public class FacebookInterstitial extends CustomEventInterstitial implements InterstitialAdListener {
    private static final int ONE_HOURS_MILLIS = 3600000;
    private static final String PLACEMENT_ID_KEY = "placement_id";
    private InterstitialAd mFacebookInterstitial;
    private CustomEventInterstitial.CustomEventInterstitialListener mInterstitialListener;
    private Handler mHandler = new Handler();
    private Runnable mAdExpiration = new Runnable() { // from class: com.mopub.mobileads.FacebookInterstitial.1
        @Override // java.lang.Runnable
        public void run() {
            if (FacebookInterstitial.this.mInterstitialListener != null) {
                MoPubLog.d("Expiring unused Facebook Interstitial ad due to Facebook's 60-minute expiration policy.");
                FacebookInterstitial.this.mInterstitialListener.onInterstitialFailed(MoPubErrorCode.EXPIRED);
                FacebookInterstitial.this.onInvalidate();
            }
        }
    };

    @Override // com.mopub.mobileads.CustomEventInterstitial
    protected void loadInterstitial(Context context, CustomEventInterstitial.CustomEventInterstitialListener customEventInterstitialListener, Map<String, Object> map, Map<String, String> map2) {
        MoPubLog.d("Loading Facebook interstitial");
        this.mInterstitialListener = customEventInterstitialListener;
        if (extrasAreValid(map2)) {
            String str = map2.get(PLACEMENT_ID_KEY);
            AdSettings.setMediationService("MOPUB_5.0.0");
            this.mFacebookInterstitial = new InterstitialAd(context, str);
            this.mFacebookInterstitial.setAdListener(this);
            String str2 = map2.get(DataKeys.ADM_KEY);
            if (!TextUtils.isEmpty(str2)) {
                this.mFacebookInterstitial.loadAdFromBid(str2);
                return;
            } else {
                this.mFacebookInterstitial.loadAd();
                return;
            }
        }
        if (this.mInterstitialListener != null) {
            this.mInterstitialListener.onInterstitialFailed(MoPubErrorCode.ADAPTER_CONFIGURATION_ERROR);
        }
    }

    @Override // com.mopub.mobileads.CustomEventInterstitial
    protected void showInterstitial() {
        if (this.mFacebookInterstitial != null && this.mFacebookInterstitial.isAdLoaded()) {
            this.mFacebookInterstitial.show();
            cancelExpirationTimer();
            return;
        }
        MoPubLog.d("Tried to show a Facebook interstitial ad when it's not ready. Please try again.");
        if (this.mInterstitialListener != null) {
            onError(this.mFacebookInterstitial, AdError.INTERNAL_ERROR);
        } else {
            MoPubLog.d("Interstitial listener not instantiated. Please load interstitial again.");
        }
    }

    @Override // com.mopub.mobileads.CustomEventInterstitial
    protected void onInvalidate() {
        cancelExpirationTimer();
        if (this.mFacebookInterstitial != null) {
            this.mFacebookInterstitial.destroy();
            this.mFacebookInterstitial = null;
            this.mInterstitialListener = null;
        }
    }

    @Override // com.facebook.ads.AdListener
    public void onAdLoaded(Ad ad) {
        cancelExpirationTimer();
        MoPubLog.d("Facebook interstitial ad loaded successfully.");
        if (this.mInterstitialListener != null) {
            this.mInterstitialListener.onInterstitialLoaded();
        }
        this.mHandler.postDelayed(this.mAdExpiration, 3600000L);
    }

    @Override // com.facebook.ads.AdListener
    public void onError(Ad ad, AdError adError) {
        cancelExpirationTimer();
        MoPubLog.d("Facebook interstitial ad failed to load.");
        if (this.mInterstitialListener != null) {
            if (adError == AdError.NO_FILL) {
                this.mInterstitialListener.onInterstitialFailed(MoPubErrorCode.NETWORK_NO_FILL);
            } else if (adError == AdError.INTERNAL_ERROR) {
                this.mInterstitialListener.onInterstitialFailed(MoPubErrorCode.NETWORK_INVALID_STATE);
            } else {
                this.mInterstitialListener.onInterstitialFailed(MoPubErrorCode.UNSPECIFIED);
            }
        }
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public void onInterstitialDisplayed(Ad ad) {
        cancelExpirationTimer();
        MoPubLog.d("Showing Facebook interstitial ad.");
        if (this.mInterstitialListener != null) {
            this.mInterstitialListener.onInterstitialShown();
        }
    }

    @Override // com.facebook.ads.AdListener
    public void onAdClicked(Ad ad) {
        MoPubLog.d("Facebook interstitial ad clicked.");
        if (this.mInterstitialListener != null) {
            this.mInterstitialListener.onInterstitialClicked();
        }
    }

    @Override // com.facebook.ads.AdListener
    public void onLoggingImpression(Ad ad) {
        MoPubLog.d("Facebook interstitial ad logged impression.");
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public void onInterstitialDismissed(Ad ad) {
        MoPubLog.d("Facebook interstitial ad dismissed.");
        if (this.mInterstitialListener != null) {
            this.mInterstitialListener.onInterstitialDismissed();
        }
    }

    private boolean extrasAreValid(Map<String, String> map) {
        String str = map.get(PLACEMENT_ID_KEY);
        return str != null && str.length() > 0;
    }

    private void cancelExpirationTimer() {
        this.mHandler.removeCallbacks(this.mAdExpiration);
    }

    @Deprecated
    InterstitialAd getInterstitialAd() {
        return this.mFacebookInterstitial;
    }
}
