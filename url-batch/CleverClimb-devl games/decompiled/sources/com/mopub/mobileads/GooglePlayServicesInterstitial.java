package com.mopub.mobileads;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.mopub.common.MediationSettings;
import com.mopub.mobileads.CustomEventInterstitial;
import java.util.Map;

/* loaded from: classes2.dex */
public class GooglePlayServicesInterstitial extends CustomEventInterstitial {
    public static final String AD_UNIT_ID_KEY = "adUnitID";
    public static final String LOCATION_KEY = "location";
    private InterstitialAd mGoogleInterstitialAd;
    private CustomEventInterstitial.CustomEventInterstitialListener mInterstitialListener;

    @Override // com.mopub.mobileads.CustomEventInterstitial
    protected void loadInterstitial(Context context, CustomEventInterstitial.CustomEventInterstitialListener customEventInterstitialListener, Map<String, Object> map, Map<String, String> map2) {
        this.mInterstitialListener = customEventInterstitialListener;
        if (extrasAreValid(map2)) {
            String str = map2.get("adUnitID");
            this.mGoogleInterstitialAd = new InterstitialAd(context);
            this.mGoogleInterstitialAd.setAdListener(new InterstitialAdListener());
            this.mGoogleInterstitialAd.setAdUnitId(str);
            AdRequest.Builder builder = new AdRequest.Builder();
            builder.setRequestAgent("MoPub");
            forwardNpaIfSet(builder);
            try {
                this.mGoogleInterstitialAd.loadAd(builder.build());
                return;
            } catch (NoClassDefFoundError unused) {
                this.mInterstitialListener.onInterstitialFailed(MoPubErrorCode.NETWORK_NO_FILL);
                return;
            }
        }
        this.mInterstitialListener.onInterstitialFailed(MoPubErrorCode.ADAPTER_CONFIGURATION_ERROR);
    }

    private void forwardNpaIfSet(AdRequest.Builder builder) {
        if (GooglePlayServicesMediationSettings.getNpaBundle() == null || GooglePlayServicesMediationSettings.getNpaBundle().isEmpty()) {
            return;
        }
        builder.addNetworkExtrasBundle(AdMobAdapter.class, GooglePlayServicesMediationSettings.getNpaBundle());
    }

    @Override // com.mopub.mobileads.CustomEventInterstitial
    protected void showInterstitial() {
        if (this.mGoogleInterstitialAd.isLoaded()) {
            this.mGoogleInterstitialAd.show();
        } else {
            Log.d("MoPub", "Tried to show a Google Play Services interstitial ad before it finished loading. Please try again.");
        }
    }

    @Override // com.mopub.mobileads.CustomEventInterstitial
    protected void onInvalidate() {
        if (this.mGoogleInterstitialAd != null) {
            this.mGoogleInterstitialAd.setAdListener(null);
        }
    }

    private boolean extrasAreValid(Map<String, String> map) {
        return map.containsKey("adUnitID");
    }

    private class InterstitialAdListener extends AdListener {
        private InterstitialAdListener() {
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClosed() {
            Log.d("MoPub", "Google Play Services interstitial ad dismissed.");
            if (GooglePlayServicesInterstitial.this.mInterstitialListener != null) {
                GooglePlayServicesInterstitial.this.mInterstitialListener.onInterstitialDismissed();
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdFailedToLoad(int i) {
            Log.d("MoPub", "Google Play Services interstitial ad failed to load.");
            if (GooglePlayServicesInterstitial.this.mInterstitialListener != null) {
                GooglePlayServicesInterstitial.this.mInterstitialListener.onInterstitialFailed(getMoPubErrorCode(i));
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdLeftApplication() {
            Log.d("MoPub", "Google Play Services interstitial ad clicked.");
            if (GooglePlayServicesInterstitial.this.mInterstitialListener != null) {
                GooglePlayServicesInterstitial.this.mInterstitialListener.onInterstitialClicked();
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdLoaded() {
            Log.d("MoPub", "Google Play Services interstitial ad loaded successfully.");
            if (GooglePlayServicesInterstitial.this.mInterstitialListener != null) {
                GooglePlayServicesInterstitial.this.mInterstitialListener.onInterstitialLoaded();
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdOpened() {
            Log.d("MoPub", "Showing Google Play Services interstitial ad.");
            if (GooglePlayServicesInterstitial.this.mInterstitialListener != null) {
                GooglePlayServicesInterstitial.this.mInterstitialListener.onInterstitialShown();
            }
        }

        private MoPubErrorCode getMoPubErrorCode(int i) {
            switch (i) {
                case 0:
                    return MoPubErrorCode.INTERNAL_ERROR;
                case 1:
                    return MoPubErrorCode.ADAPTER_CONFIGURATION_ERROR;
                case 2:
                    return MoPubErrorCode.NO_CONNECTION;
                case 3:
                    return MoPubErrorCode.NO_FILL;
                default:
                    return MoPubErrorCode.UNSPECIFIED;
            }
        }
    }

    public static final class GooglePlayServicesMediationSettings implements MediationSettings {
        private static Bundle npaBundle;

        public GooglePlayServicesMediationSettings() {
        }

        public GooglePlayServicesMediationSettings(Bundle bundle) {
            npaBundle = bundle;
        }

        public void setNpaBundle(Bundle bundle) {
            npaBundle = bundle;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Bundle getNpaBundle() {
            return npaBundle;
        }
    }

    @Deprecated
    InterstitialAd getGoogleInterstitialAd() {
        return this.mGoogleInterstitialAd;
    }
}
