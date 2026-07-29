package com.mopub.mobileads;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdSettings;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.mopub.common.DataKeys;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.Views;
import com.mopub.mobileads.CustomEventBanner;
import java.util.Map;

/* loaded from: classes2.dex */
public class FacebookBanner extends CustomEventBanner implements AdListener {
    private static final String PLACEMENT_ID_KEY = "placement_id";
    private CustomEventBanner.CustomEventBannerListener mBannerListener;
    private AdView mFacebookBanner;

    @Override // com.mopub.mobileads.CustomEventBanner
    protected void loadBanner(Context context, CustomEventBanner.CustomEventBannerListener customEventBannerListener, Map<String, Object> map, Map<String, String> map2) {
        this.mBannerListener = customEventBannerListener;
        if (serverExtrasAreValid(map2)) {
            String str = map2.get(PLACEMENT_ID_KEY);
            if (!localExtrasAreValid(map)) {
                this.mBannerListener.onBannerFailed(MoPubErrorCode.ADAPTER_CONFIGURATION_ERROR);
                return;
            }
            AdSize calculateAdSize = calculateAdSize(((Integer) map.get(DataKeys.AD_WIDTH)).intValue(), ((Integer) map.get(DataKeys.AD_HEIGHT)).intValue());
            if (calculateAdSize == null) {
                this.mBannerListener.onBannerFailed(MoPubErrorCode.ADAPTER_CONFIGURATION_ERROR);
                return;
            }
            AdSettings.setMediationService("MOPUB_5.0.0");
            this.mFacebookBanner = new AdView(context, str, calculateAdSize);
            this.mFacebookBanner.setAdListener(this);
            this.mFacebookBanner.disableAutoRefresh();
            String str2 = map2.get(DataKeys.ADM_KEY);
            if (!TextUtils.isEmpty(str2)) {
                this.mFacebookBanner.loadAdFromBid(str2);
                return;
            } else {
                this.mFacebookBanner.loadAd();
                return;
            }
        }
        this.mBannerListener.onBannerFailed(MoPubErrorCode.ADAPTER_CONFIGURATION_ERROR);
    }

    @Override // com.mopub.mobileads.CustomEventBanner
    protected void onInvalidate() {
        if (this.mFacebookBanner != null) {
            Views.removeFromParent(this.mFacebookBanner);
            this.mFacebookBanner.destroy();
            this.mFacebookBanner = null;
        }
    }

    @Override // com.facebook.ads.AdListener
    public void onAdLoaded(Ad ad) {
        MoPubLog.d("Facebook banner ad loaded successfully. Showing ad...");
        this.mBannerListener.onBannerLoaded(this.mFacebookBanner);
    }

    @Override // com.facebook.ads.AdListener
    public void onError(Ad ad, AdError adError) {
        MoPubLog.d("Facebook banner ad failed to load.");
        if (adError == AdError.NO_FILL) {
            this.mBannerListener.onBannerFailed(MoPubErrorCode.NETWORK_NO_FILL);
        } else if (adError == AdError.INTERNAL_ERROR) {
            this.mBannerListener.onBannerFailed(MoPubErrorCode.NETWORK_INVALID_STATE);
        } else {
            this.mBannerListener.onBannerFailed(MoPubErrorCode.UNSPECIFIED);
        }
    }

    @Override // com.facebook.ads.AdListener
    public void onAdClicked(Ad ad) {
        MoPubLog.d("Facebook banner ad clicked.");
        this.mBannerListener.onBannerClicked();
    }

    @Override // com.facebook.ads.AdListener
    public void onLoggingImpression(Ad ad) {
        MoPubLog.d("Facebook banner ad logged impression.");
    }

    private boolean serverExtrasAreValid(Map<String, String> map) {
        String str = map.get(PLACEMENT_ID_KEY);
        return str != null && str.length() > 0;
    }

    private boolean localExtrasAreValid(Map<String, Object> map) {
        return (map.get(DataKeys.AD_WIDTH) instanceof Integer) && (map.get(DataKeys.AD_HEIGHT) instanceof Integer);
    }

    private AdSize calculateAdSize(int i, int i2) {
        if (i2 <= AdSize.BANNER_HEIGHT_50.getHeight()) {
            return AdSize.BANNER_HEIGHT_50;
        }
        if (i2 <= AdSize.BANNER_HEIGHT_90.getHeight()) {
            return AdSize.BANNER_HEIGHT_90;
        }
        if (i2 <= AdSize.RECTANGLE_HEIGHT_250.getHeight()) {
            return AdSize.RECTANGLE_HEIGHT_250;
        }
        return null;
    }

    @Deprecated
    AdView getAdView() {
        return this.mFacebookBanner;
    }
}
