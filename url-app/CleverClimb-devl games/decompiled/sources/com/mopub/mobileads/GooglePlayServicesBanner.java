package com.mopub.mobileads;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.mopub.common.MediationSettings;
import com.mopub.common.util.Views;
import com.mopub.mobileads.CustomEventBanner;
import java.util.Map;

/* loaded from: classes2.dex */
public class GooglePlayServicesBanner extends CustomEventBanner {
    public static final String AD_HEIGHT_KEY = "adHeight";
    public static final String AD_UNIT_ID_KEY = "adUnitID";
    public static final String AD_WIDTH_KEY = "adWidth";
    private CustomEventBanner.CustomEventBannerListener mBannerListener;
    private AdView mGoogleAdView;

    @Override // com.mopub.mobileads.CustomEventBanner
    protected void loadBanner(Context context, CustomEventBanner.CustomEventBannerListener customEventBannerListener, Map<String, Object> map, Map<String, String> map2) {
        this.mBannerListener = customEventBannerListener;
        if (extrasAreValid(map2)) {
            String str = map2.get("adUnitID");
            int parseInt = Integer.parseInt(map2.get(AD_WIDTH_KEY));
            int parseInt2 = Integer.parseInt(map2.get(AD_HEIGHT_KEY));
            this.mGoogleAdView = new AdView(context);
            this.mGoogleAdView.setAdListener(new AdViewListener());
            this.mGoogleAdView.setAdUnitId(str);
            AdSize calculateAdSize = calculateAdSize(parseInt, parseInt2);
            if (calculateAdSize == null) {
                this.mBannerListener.onBannerFailed(MoPubErrorCode.ADAPTER_CONFIGURATION_ERROR);
                return;
            }
            this.mGoogleAdView.setAdSize(calculateAdSize);
            AdRequest.Builder builder = new AdRequest.Builder();
            builder.setRequestAgent("MoPub");
            forwardNpaIfSet(builder);
            try {
                this.mGoogleAdView.loadAd(builder.build());
                return;
            } catch (NoClassDefFoundError unused) {
                this.mBannerListener.onBannerFailed(MoPubErrorCode.NETWORK_NO_FILL);
                return;
            }
        }
        this.mBannerListener.onBannerFailed(MoPubErrorCode.ADAPTER_CONFIGURATION_ERROR);
    }

    @Override // com.mopub.mobileads.CustomEventBanner
    protected void onInvalidate() {
        Views.removeFromParent(this.mGoogleAdView);
        if (this.mGoogleAdView != null) {
            this.mGoogleAdView.setAdListener(null);
            this.mGoogleAdView.destroy();
        }
    }

    private void forwardNpaIfSet(AdRequest.Builder builder) {
        if (GooglePlayServicesMediationSettings.getNpaBundle() == null || GooglePlayServicesMediationSettings.getNpaBundle().isEmpty()) {
            return;
        }
        builder.addNetworkExtrasBundle(AdMobAdapter.class, GooglePlayServicesMediationSettings.getNpaBundle());
    }

    private boolean extrasAreValid(Map<String, String> map) {
        try {
            Integer.parseInt(map.get(AD_WIDTH_KEY));
            Integer.parseInt(map.get(AD_HEIGHT_KEY));
            return map.containsKey("adUnitID");
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    private AdSize calculateAdSize(int i, int i2) {
        if (i <= AdSize.BANNER.getWidth() && i2 <= AdSize.BANNER.getHeight()) {
            return AdSize.BANNER;
        }
        if (i <= AdSize.MEDIUM_RECTANGLE.getWidth() && i2 <= AdSize.MEDIUM_RECTANGLE.getHeight()) {
            return AdSize.MEDIUM_RECTANGLE;
        }
        if (i <= AdSize.FULL_BANNER.getWidth() && i2 <= AdSize.FULL_BANNER.getHeight()) {
            return AdSize.FULL_BANNER;
        }
        if (i > AdSize.LEADERBOARD.getWidth() || i2 > AdSize.LEADERBOARD.getHeight()) {
            return null;
        }
        return AdSize.LEADERBOARD;
    }

    private class AdViewListener extends AdListener {
        @Override // com.google.android.gms.ads.AdListener
        public void onAdClosed() {
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdLeftApplication() {
        }

        private AdViewListener() {
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdFailedToLoad(int i) {
            Log.d("MoPub", "Google Play Services banner ad failed to load.");
            if (GooglePlayServicesBanner.this.mBannerListener != null) {
                GooglePlayServicesBanner.this.mBannerListener.onBannerFailed(getMoPubErrorCode(i));
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdLoaded() {
            Log.d("MoPub", "Google Play Services banner ad loaded successfully. Showing ad...");
            if (GooglePlayServicesBanner.this.mBannerListener != null) {
                GooglePlayServicesBanner.this.mBannerListener.onBannerLoaded(GooglePlayServicesBanner.this.mGoogleAdView);
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdOpened() {
            Log.d("MoPub", "Google Play Services banner ad clicked.");
            if (GooglePlayServicesBanner.this.mBannerListener != null) {
                GooglePlayServicesBanner.this.mBannerListener.onBannerClicked();
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
    AdView getGoogleAdView() {
        return this.mGoogleAdView;
    }
}
