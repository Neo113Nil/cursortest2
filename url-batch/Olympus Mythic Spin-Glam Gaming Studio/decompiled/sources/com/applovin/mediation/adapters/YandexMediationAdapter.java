package com.applovin.mediation.adapters;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.MaxSignalProvider;
import com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import com.applovin.mediation.adapters.yandex.BuildConfig;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.yandex.mobile.ads.banner.BannerAdEventListener;
import com.yandex.mobile.ads.banner.BannerAdSize;
import com.yandex.mobile.ads.banner.BannerAdView;
import com.yandex.mobile.ads.common.AdBindingResult;
import com.yandex.mobile.ads.common.AdError;
import com.yandex.mobile.ads.common.AdRequest;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.common.AdType;
import com.yandex.mobile.ads.common.AdapterIdentity;
import com.yandex.mobile.ads.common.BidderTokenLoadListener;
import com.yandex.mobile.ads.common.BidderTokenLoader;
import com.yandex.mobile.ads.common.BidderTokenRequest;
import com.yandex.mobile.ads.common.ImpressionData;
import com.yandex.mobile.ads.common.InitializationListener;
import com.yandex.mobile.ads.common.YandexAds;
import com.yandex.mobile.ads.interstitial.InterstitialAd;
import com.yandex.mobile.ads.interstitial.InterstitialAdEventListener;
import com.yandex.mobile.ads.interstitial.InterstitialAdLoadListener;
import com.yandex.mobile.ads.interstitial.InterstitialAdLoader;
import com.yandex.mobile.ads.nativeads.MediaView;
import com.yandex.mobile.ads.nativeads.NativeAd;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;
import com.yandex.mobile.ads.nativeads.NativeAdEventListener;
import com.yandex.mobile.ads.nativeads.NativeAdLoadListener;
import com.yandex.mobile.ads.nativeads.NativeAdLoader;
import com.yandex.mobile.ads.nativeads.NativeAdOptions;
import com.yandex.mobile.ads.nativeads.NativeAdView;
import com.yandex.mobile.ads.nativeads.NativeAdViewBinder;
import com.yandex.mobile.ads.rewarded.Reward;
import com.yandex.mobile.ads.rewarded.RewardedAd;
import com.yandex.mobile.ads.rewarded.RewardedAdEventListener;
import com.yandex.mobile.ads.rewarded.RewardedAdLoadListener;
import com.yandex.mobile.ads.rewarded.RewardedAdLoader;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes13.dex */
public class YandexMediationAdapter extends MediationAdapterBase implements MaxSignalProvider, MaxInterstitialAdapter, MaxRewardedAdapter, MaxAdViewAdapter {
    private static final int ADVERTISER_VIEW_TAG = 8;
    private static final int BODY_VIEW_TAG = 4;
    private static final int CALL_TO_ACTION_VIEW_TAG = 5;
    private static final int ICON_VIEW_TAG = 3;
    private static final AtomicBoolean INITIALIZED = new AtomicBoolean();
    private static final int MEDIA_VIEW_CONTAINER_TAG = 2;
    private static final int TITLE_LABEL_TAG = 1;
    private static MaxAdapter.InitializationStatus status;
    private BannerAdView adView;
    private InterstitialAd interstitialAd;
    private InterstitialAdListener interstitialAdListener;
    private NativeAd nativeAd;
    private NativeAdView nativeAdView;
    private RewardedAd rewardedAd;
    private RewardedAdListener rewardedAdListener;

    public YandexMediationAdapter(AppLovinSdk appLovinSdk) {
        super(appLovinSdk);
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public String getSdkVersion() {
        return YandexAds.getLibraryVersion();
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public String getAdapterVersion() {
        return BuildConfig.VERSION_NAME;
    }

    @Override // com.applovin.mediation.adapters.MediationAdapterBase, com.applovin.mediation.adapter.MaxAdapter
    @Nullable
    public Boolean shouldLoadAdsOnUiThread(MaxAdFormat maxAdFormat) {
        return Boolean.TRUE;
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public void onDestroy() {
        InterstitialAd interstitialAd = this.interstitialAd;
        if (interstitialAd != null) {
            interstitialAd.setAdEventListener(null);
            this.interstitialAdListener = null;
            this.interstitialAd = null;
        }
        RewardedAd rewardedAd = this.rewardedAd;
        if (rewardedAd != null) {
            rewardedAd.setAdEventListener(null);
            this.rewardedAdListener = null;
            this.rewardedAd = null;
        }
        BannerAdView bannerAdView = this.adView;
        if (bannerAdView != null) {
            bannerAdView.destroy();
            this.adView = null;
        }
        this.nativeAd = null;
        this.nativeAdView = null;
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, @Nullable Activity activity, final MaxAdapter.OnCompletionListener onCompletionListener) {
        if (INITIALIZED.compareAndSet(false, true)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Initializing Yandex SDK");
            sb.append(maxAdapterInitializationParameters.isTesting() ? " in test mode " : "");
            sb.append("...");
            log(sb.toString());
            status = MaxAdapter.InitializationStatus.INITIALIZING;
            updatePrivacySettings(maxAdapterInitializationParameters);
            if (maxAdapterInitializationParameters.isTesting()) {
                YandexAds.enableLogging(true);
            }
            YandexAds.setAdapterIdentity(new AdapterIdentity("applovin", BuildConfig.VERSION_NAME, AppLovinSdk.VERSION));
            YandexAds.initialize(getContext(activity), new InitializationListener() { // from class: com.applovin.mediation.adapters.YandexMediationAdapter.1
                @Override // com.yandex.mobile.ads.common.InitializationListener
                public void onInitializationCompleted() {
                    YandexMediationAdapter.this.log("Yandex SDK initialized");
                    MaxAdapter.InitializationStatus unused = YandexMediationAdapter.status = MaxAdapter.InitializationStatus.INITIALIZED_UNKNOWN;
                    onCompletionListener.onCompletion(YandexMediationAdapter.status, null);
                }
            });
            return;
        }
        onCompletionListener.onCompletion(status, null);
    }

    @Override // com.applovin.mediation.adapter.MaxSignalProvider
    public void collectSignal(MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, @Nullable Activity activity, final MaxSignalCollectionListener maxSignalCollectionListener) {
        log("Collecting signal...");
        updatePrivacySettings(maxAdapterSignalCollectionParameters);
        Context context = getContext(activity);
        BidderTokenRequest createBidderTokenRequestConfiguration = createBidderTokenRequestConfiguration(maxAdapterSignalCollectionParameters, context, maxAdapterSignalCollectionParameters.getAdFormat());
        if (createBidderTokenRequestConfiguration == null) {
            String str = "Failed to request bidder token due to unsupported ad format: " + maxAdapterSignalCollectionParameters.getAdFormat();
            log(str);
            maxSignalCollectionListener.onSignalCollectionFailed(str);
            return;
        }
        new BidderTokenLoader(context).loadBidderToken(createBidderTokenRequestConfiguration, new BidderTokenLoadListener() { // from class: com.applovin.mediation.adapters.YandexMediationAdapter.2
            @Override // com.yandex.mobile.ads.common.BidderTokenLoadListener
            public void onBidderTokenLoaded(@NonNull String str2) {
                YandexMediationAdapter.this.log("Signal collection successful");
                maxSignalCollectionListener.onSignalCollected(str2);
            }

            @Override // com.yandex.mobile.ads.common.BidderTokenLoadListener
            public void onBidderTokenFailedToLoad(@NonNull String str2) {
                YandexMediationAdapter.this.log("Signal collection failed: " + str2);
                maxSignalCollectionListener.onSignalCollectionFailed(str2);
            }
        });
    }

    @Override // com.applovin.mediation.adapter.MaxInterstitialAdapter
    public void loadInterstitialAd(final MaxAdapterResponseParameters maxAdapterResponseParameters, @Nullable final Activity activity, final MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        StringBuilder sb = new StringBuilder();
        sb.append("Loading ");
        sb.append(AppLovinSdkUtils.isValidString(maxAdapterResponseParameters.getBidResponse()) ? "bidding " : "");
        sb.append("interstitial ad for placement: ");
        sb.append(thirdPartyAdPlacementId);
        sb.append("...");
        log(sb.toString());
        updatePrivacySettings(maxAdapterResponseParameters);
        new Runnable() { // from class: com.applovin.mediation.adapters.YandexMediationAdapter.3
            @Override // java.lang.Runnable
            public void run() {
                InterstitialAdLoader interstitialAdLoader = new InterstitialAdLoader(YandexMediationAdapter.this.getContext(activity));
                YandexMediationAdapter yandexMediationAdapter = YandexMediationAdapter.this;
                yandexMediationAdapter.interstitialAdListener = yandexMediationAdapter.new InterstitialAdListener(maxAdapterResponseParameters, maxInterstitialAdapterListener);
                interstitialAdLoader.loadAd(YandexMediationAdapter.this.createAdRequest(maxAdapterResponseParameters), YandexMediationAdapter.this.interstitialAdListener);
            }
        }.run();
    }

    @Override // com.applovin.mediation.adapter.MaxInterstitialAdapter
    public void showInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, @Nullable Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        log("Showing interstitial ad...");
        InterstitialAd interstitialAd = this.interstitialAd;
        if (interstitialAd == null) {
            log("Interstitial ad failed to show - ad not ready");
            MaxAdapterError maxAdapterError = MaxAdapterError.AD_DISPLAY_FAILED;
            MaxAdapterError maxAdapterError2 = MaxAdapterError.AD_NOT_READY;
            maxInterstitialAdapterListener.onInterstitialAdDisplayFailed(new MaxAdapterError(maxAdapterError, maxAdapterError2.getCode(), maxAdapterError2.getMessage()));
            return;
        }
        if (activity == null) {
            log("Interstitial ad display failed: Activity is null");
            maxInterstitialAdapterListener.onInterstitialAdDisplayFailed(MaxAdapterError.MISSING_ACTIVITY);
        } else {
            interstitialAd.setAdEventListener(this.interstitialAdListener);
            this.interstitialAd.show(activity);
        }
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedAdapter
    public void loadRewardedAd(final MaxAdapterResponseParameters maxAdapterResponseParameters, @Nullable final Activity activity, final MaxRewardedAdapterListener maxRewardedAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        StringBuilder sb = new StringBuilder();
        sb.append("Loading ");
        sb.append(AppLovinSdkUtils.isValidString(maxAdapterResponseParameters.getBidResponse()) ? "bidding " : "");
        sb.append("rewarded ad for placement: ");
        sb.append(thirdPartyAdPlacementId);
        sb.append("...");
        log(sb.toString());
        updatePrivacySettings(maxAdapterResponseParameters);
        new Runnable() { // from class: com.applovin.mediation.adapters.YandexMediationAdapter.4
            @Override // java.lang.Runnable
            public void run() {
                RewardedAdLoader rewardedAdLoader = new RewardedAdLoader(YandexMediationAdapter.this.getContext(activity));
                YandexMediationAdapter yandexMediationAdapter = YandexMediationAdapter.this;
                yandexMediationAdapter.rewardedAdListener = yandexMediationAdapter.new RewardedAdListener(maxAdapterResponseParameters, maxRewardedAdapterListener);
                rewardedAdLoader.loadAd(YandexMediationAdapter.this.createAdRequest(maxAdapterResponseParameters), YandexMediationAdapter.this.rewardedAdListener);
            }
        }.run();
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedAdapter
    public void showRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, @Nullable Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        log("Showing rewarded ad...");
        if (this.rewardedAd == null) {
            log("Rewarded ad failed to show - ad not ready");
            MaxAdapterError maxAdapterError = MaxAdapterError.AD_DISPLAY_FAILED;
            MaxAdapterError maxAdapterError2 = MaxAdapterError.AD_NOT_READY;
            maxRewardedAdapterListener.onRewardedAdDisplayFailed(new MaxAdapterError(maxAdapterError, maxAdapterError2.getCode(), maxAdapterError2.getMessage()));
            return;
        }
        if (activity == null) {
            log("Rewarded ad display failed: Activity is null");
            maxRewardedAdapterListener.onRewardedAdDisplayFailed(MaxAdapterError.MISSING_ACTIVITY);
        } else {
            configureReward(maxAdapterResponseParameters);
            this.rewardedAd.setAdEventListener(this.rewardedAdListener);
            this.rewardedAd.show(activity);
        }
    }

    @Override // com.applovin.mediation.adapter.MaxAdViewAdapter
    public void loadAdViewAd(final MaxAdapterResponseParameters maxAdapterResponseParameters, final MaxAdFormat maxAdFormat, @Nullable final Activity activity, final MaxAdViewAdapterListener maxAdViewAdapterListener) {
        final String label = maxAdFormat.getLabel();
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        StringBuilder sb = new StringBuilder();
        sb.append("Loading ");
        sb.append(AppLovinSdkUtils.isValidString(maxAdapterResponseParameters.getBidResponse()) ? "bidding " : "");
        sb.append(label);
        sb.append(" ad for placement: ");
        sb.append(thirdPartyAdPlacementId);
        sb.append("...");
        log(sb.toString());
        final Context context = getContext(activity);
        updatePrivacySettings(maxAdapterResponseParameters);
        new Runnable() { // from class: com.applovin.mediation.adapters.YandexMediationAdapter.5
            @Override // java.lang.Runnable
            public void run() {
                boolean z = false;
                boolean z2 = maxAdapterResponseParameters.getServerParameters().getBoolean("adaptive_banner", false);
                if (!z2 || AppLovinSdk.VERSION_CODE >= 13020099) {
                    z = z2;
                } else {
                    YandexMediationAdapter.this.userError("Please update AppLovin MAX SDK to version 13.2.0 or higher in order to use Yandex adaptive ads");
                }
                YandexMediationAdapter yandexMediationAdapter = YandexMediationAdapter.this;
                BannerAdSize yandexBannerAdSize = yandexMediationAdapter.toYandexBannerAdSize(maxAdFormat, z, maxAdapterResponseParameters, yandexMediationAdapter.getContext(activity));
                YandexMediationAdapter.this.adView = new BannerAdView(context);
                YandexMediationAdapter.this.adView.setAdSize(yandexBannerAdSize);
                YandexMediationAdapter.this.adView.setBannerAdEventListener(YandexMediationAdapter.this.new AdViewListener(label, maxAdViewAdapterListener));
                YandexMediationAdapter.this.adView.loadAd(YandexMediationAdapter.this.createAdRequest(maxAdapterResponseParameters));
            }
        }.run();
    }

    @Override // com.applovin.mediation.adapters.MediationAdapterBase, com.applovin.mediation.adapter.MaxNativeAdAdapter
    public void loadNativeAd(final MaxAdapterResponseParameters maxAdapterResponseParameters, @Nullable Activity activity, final MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        StringBuilder sb = new StringBuilder();
        sb.append("Loading ");
        sb.append(AppLovinSdkUtils.isValidString(bidResponse) ? "bidding " : "");
        sb.append("native ad for placement: ");
        sb.append(thirdPartyAdPlacementId);
        sb.append("...");
        log(sb.toString());
        final Context context = getContext(activity);
        updatePrivacySettings(maxAdapterResponseParameters);
        new Runnable() { // from class: com.applovin.mediation.adapters.YandexMediationAdapter.6
            @Override // java.lang.Runnable
            public void run() {
                NativeAdLoader nativeAdLoader = new NativeAdLoader(context);
                NativeAdListener nativeAdListener = new NativeAdListener(maxAdapterResponseParameters, context, maxNativeAdAdapterListener);
                nativeAdLoader.loadAd(YandexMediationAdapter.this.createAdRequest(maxAdapterResponseParameters), new NativeAdOptions.Builder().setShouldLoadImagesAutomatically(true).build(), nativeAdListener);
            }
        }.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Context getContext(@Nullable Activity activity) {
        return activity != null ? activity.getApplication() : getApplicationContext();
    }

    private void updatePrivacySettings(MaxAdapterParameters maxAdapterParameters) {
        Boolean hasUserConsent = maxAdapterParameters.hasUserConsent();
        if (hasUserConsent != null) {
            YandexAds.setUserConsent(hasUserConsent.booleanValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AdRequest createAdRequest(MaxAdapterResponseParameters maxAdapterResponseParameters) {
        AdRequest.Builder builder = new AdRequest.Builder(maxAdapterResponseParameters.getThirdPartyAdPlacementId());
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        if (AppLovinSdkUtils.isValidString(bidResponse)) {
            builder.setBiddingData(bidResponse);
        }
        return builder.build();
    }

    @Nullable
    private BidderTokenRequest createBidderTokenRequestConfiguration(MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, Context context, MaxAdFormat maxAdFormat) {
        AdType adType = toAdType(maxAdFormat);
        if (adType == AdType.BANNER) {
            Object obj = maxAdapterSignalCollectionParameters.getLocalExtraParameters().get("adaptive_banner");
            boolean z = false;
            boolean z2 = (obj instanceof String) && "true".equalsIgnoreCase((String) obj);
            if (!z2 || AppLovinSdk.VERSION_CODE >= 13020099) {
                z = z2;
            } else {
                userError("Please update AppLovin MAX SDK to version 13.2.0 or higher in order to use Yandex adaptive ads");
            }
            return BidderTokenRequest.banner(toYandexBannerAdSize(maxAdFormat, z, maxAdapterSignalCollectionParameters, context));
        }
        if (adType == AdType.INTERSTITIAL) {
            return BidderTokenRequest.interstitial();
        }
        if (adType == AdType.REWARDED) {
            return BidderTokenRequest.rewarded();
        }
        if (adType == AdType.APP_OPEN_AD) {
            return BidderTokenRequest.appOpenAd();
        }
        if (adType == AdType.NATIVE) {
            return BidderTokenRequest.nativeAd();
        }
        return null;
    }

    @Nullable
    private static AdType toAdType(MaxAdFormat maxAdFormat) {
        if (maxAdFormat.isAdViewAd()) {
            return AdType.BANNER;
        }
        if (maxAdFormat == MaxAdFormat.INTERSTITIAL) {
            return AdType.INTERSTITIAL;
        }
        if (maxAdFormat == MaxAdFormat.REWARDED) {
            return AdType.REWARDED;
        }
        if (maxAdFormat == MaxAdFormat.APP_OPEN) {
            return AdType.APP_OPEN_AD;
        }
        if (maxAdFormat == MaxAdFormat.NATIVE) {
            return AdType.NATIVE;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public BannerAdSize toYandexBannerAdSize(MaxAdFormat maxAdFormat, boolean z, MaxAdapterParameters maxAdapterParameters, Context context) {
        if (!maxAdFormat.isAdViewAd()) {
            throw new IllegalArgumentException("Unsupported ad view ad format: " + maxAdFormat.getLabel());
        }
        if (z && isAdaptiveAdViewFormat(maxAdFormat, maxAdapterParameters)) {
            return getAdaptiveAdSize(maxAdapterParameters, context);
        }
        return BannerAdSize.fixed(context, maxAdFormat.getSize().getWidth(), maxAdFormat.getSize().getHeight());
    }

    private BannerAdSize getAdaptiveAdSize(MaxAdapterParameters maxAdapterParameters, Context context) {
        int adaptiveAdViewWidth = getAdaptiveAdViewWidth(maxAdapterParameters, context);
        if (isInlineAdaptiveAdView(maxAdapterParameters)) {
            int inlineAdaptiveAdViewMaximumHeight = getInlineAdaptiveAdViewMaximumHeight(maxAdapterParameters);
            if (inlineAdaptiveAdViewMaximumHeight > 0) {
                return BannerAdSize.inline(context, adaptiveAdViewWidth, inlineAdaptiveAdViewMaximumHeight);
            }
            return BannerAdSize.inline(context, adaptiveAdViewWidth, AppLovinSdkUtils.pxToDp(context, context.getResources().getDisplayMetrics().heightPixels));
        }
        return BannerAdSize.fixed(context, adaptiveAdViewWidth, MaxAdFormat.BANNER.getAdaptiveSize(adaptiveAdViewWidth, context).getHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0015, code lost:
    
        if (r0 != 5) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static MaxAdapterError toMaxError(AdRequestError adRequestError) {
        int code = adRequestError.getCode();
        MaxAdapterError maxAdapterError = MaxAdapterError.UNSPECIFIED;
        if (code != 0) {
            if (code != 1) {
                if (code == 2) {
                    maxAdapterError = MaxAdapterError.BAD_REQUEST;
                } else if (code == 3) {
                    maxAdapterError = MaxAdapterError.NO_CONNECTION;
                } else if (code == 4) {
                    maxAdapterError = MaxAdapterError.NO_FILL;
                }
            }
            maxAdapterError = MaxAdapterError.INTERNAL_ERROR;
        }
        return new MaxAdapterError(maxAdapterError, adRequestError.getCode(), adRequestError.getDescription());
    }

    private class InterstitialAdListener implements InterstitialAdLoadListener, InterstitialAdEventListener {
        private final MaxInterstitialAdapterListener listener;
        private final MaxAdapterResponseParameters parameters;

        InterstitialAdListener(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
            this.parameters = maxAdapterResponseParameters;
            this.listener = maxInterstitialAdapterListener;
        }

        @Override // com.yandex.mobile.ads.interstitial.InterstitialAdLoadListener
        public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
            YandexMediationAdapter.this.log("Interstitial ad loaded");
            YandexMediationAdapter.this.interstitialAd = interstitialAd;
            this.listener.onInterstitialAdLoaded();
        }

        @Override // com.yandex.mobile.ads.interstitial.InterstitialAdLoadListener
        public void onAdFailedToLoad(@NonNull AdRequestError adRequestError) {
            YandexMediationAdapter.this.log("Interstitial ad failed to load with error code " + adRequestError.getCode() + " and description: " + adRequestError.getDescription());
            this.listener.onInterstitialAdLoadFailed(YandexMediationAdapter.toMaxError(adRequestError));
        }

        @Override // com.yandex.mobile.ads.interstitial.InterstitialAdEventListener
        public void onAdShown() {
            YandexMediationAdapter.this.log("Interstitial ad shown");
            if (this.parameters.isTesting()) {
                this.listener.onInterstitialAdDisplayed();
            }
        }

        @Override // com.yandex.mobile.ads.interstitial.InterstitialAdEventListener
        public void onAdImpression(@Nullable ImpressionData impressionData) {
            YandexMediationAdapter.this.log("Interstitial ad impression tracked");
            this.listener.onInterstitialAdDisplayed();
        }

        @Override // com.yandex.mobile.ads.interstitial.InterstitialAdEventListener
        public void onAdFailedToShow(@NonNull AdError adError) {
            YandexMediationAdapter.this.log("Interstitial ad failed to show with error description: " + adError.getDescription());
            this.listener.onInterstitialAdDisplayFailed(new MaxAdapterError(MaxAdapterError.AD_DISPLAY_FAILED, 0, adError.getDescription()));
        }

        @Override // com.yandex.mobile.ads.interstitial.InterstitialAdEventListener
        public void onAdClicked() {
            YandexMediationAdapter.this.log("Interstitial ad clicked");
            this.listener.onInterstitialAdClicked();
        }

        @Override // com.yandex.mobile.ads.interstitial.InterstitialAdEventListener
        public void onAdDismissed() {
            YandexMediationAdapter.this.log("Interstitial ad dismissed");
            this.listener.onInterstitialAdHidden();
        }
    }

    private class RewardedAdListener implements RewardedAdLoadListener, RewardedAdEventListener {
        private boolean hasGrantedReward;
        private final MaxRewardedAdapterListener listener;
        private final MaxAdapterResponseParameters parameters;

        RewardedAdListener(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxRewardedAdapterListener maxRewardedAdapterListener) {
            this.parameters = maxAdapterResponseParameters;
            this.listener = maxRewardedAdapterListener;
        }

        @Override // com.yandex.mobile.ads.rewarded.RewardedAdLoadListener
        public void onAdLoaded(@NonNull RewardedAd rewardedAd) {
            YandexMediationAdapter.this.log("Rewarded ad loaded");
            YandexMediationAdapter.this.rewardedAd = rewardedAd;
            this.listener.onRewardedAdLoaded();
        }

        @Override // com.yandex.mobile.ads.rewarded.RewardedAdLoadListener
        public void onAdFailedToLoad(@NonNull AdRequestError adRequestError) {
            YandexMediationAdapter.this.log("Rewarded ad failed to load with error code " + adRequestError.getCode() + " and description: " + adRequestError.getDescription());
            this.listener.onRewardedAdLoadFailed(YandexMediationAdapter.toMaxError(adRequestError));
        }

        @Override // com.yandex.mobile.ads.rewarded.RewardedAdEventListener
        public void onAdShown() {
            YandexMediationAdapter.this.log("Rewarded ad shown");
            if (this.parameters.isTesting()) {
                this.listener.onRewardedAdDisplayed();
            }
        }

        @Override // com.yandex.mobile.ads.rewarded.RewardedAdEventListener
        public void onAdImpression(@Nullable ImpressionData impressionData) {
            YandexMediationAdapter.this.log("Rewarded ad impression tracked");
            this.listener.onRewardedAdDisplayed();
        }

        @Override // com.yandex.mobile.ads.rewarded.RewardedAdEventListener
        public void onAdFailedToShow(@NonNull AdError adError) {
            YandexMediationAdapter.this.log("Rewarded ad failed to show with error description: " + adError.getDescription());
            this.listener.onRewardedAdDisplayFailed(new MaxAdapterError(MaxAdapterError.AD_DISPLAY_FAILED, 0, adError.getDescription()));
        }

        @Override // com.yandex.mobile.ads.rewarded.RewardedAdEventListener
        public void onAdClicked() {
            YandexMediationAdapter.this.log("Rewarded ad clicked");
            this.listener.onRewardedAdClicked();
        }

        @Override // com.yandex.mobile.ads.rewarded.RewardedAdEventListener
        public void onRewarded(@NonNull Reward reward) {
            YandexMediationAdapter.this.log("Rewarded user with reward: " + reward.getAmount() + ' ' + reward.getType());
            this.hasGrantedReward = true;
        }

        @Override // com.yandex.mobile.ads.rewarded.RewardedAdEventListener
        public void onAdDismissed() {
            YandexMediationAdapter.this.log("Rewarded ad hidden");
            if (this.hasGrantedReward || YandexMediationAdapter.this.shouldAlwaysRewardUser()) {
                MaxReward reward = YandexMediationAdapter.this.getReward();
                YandexMediationAdapter.this.log("Rewarded user with reward: " + reward);
                this.listener.onUserRewarded(reward);
            }
            this.listener.onRewardedAdHidden();
        }
    }

    private class AdViewListener implements BannerAdEventListener {
        private final String adFormatLabel;
        private final MaxAdViewAdapterListener listener;

        AdViewListener(String str, MaxAdViewAdapterListener maxAdViewAdapterListener) {
            this.adFormatLabel = str;
            this.listener = maxAdViewAdapterListener;
        }

        @Override // com.yandex.mobile.ads.banner.BannerAdEventListener
        public void onAdLoaded() {
            YandexMediationAdapter.this.log(this.adFormatLabel + " ad loaded");
            Bundle bundle = new Bundle(2);
            if (YandexMediationAdapter.this.adView != null) {
                BannerAdSize adSize = YandexMediationAdapter.this.adView.getAdSize();
                bundle.putInt("ad_width", adSize.getWidth());
                bundle.putInt("ad_height", adSize.getHeight());
            }
            this.listener.onAdViewAdLoaded(YandexMediationAdapter.this.adView, bundle);
        }

        @Override // com.yandex.mobile.ads.banner.BannerAdEventListener
        public void onAdFailedToLoad(@NonNull AdRequestError adRequestError) {
            YandexMediationAdapter.this.log(this.adFormatLabel + " ad failed to load with error code " + adRequestError.getCode() + " and description: " + adRequestError.getDescription());
            this.listener.onAdViewAdLoadFailed(YandexMediationAdapter.toMaxError(adRequestError));
        }

        @Override // com.yandex.mobile.ads.banner.BannerAdEventListener
        public void onAdClicked() {
            YandexMediationAdapter.this.log("AdView ad clicked");
            this.listener.onAdViewAdClicked();
        }

        @Override // com.yandex.mobile.ads.banner.BannerAdEventListener
        public void onImpression(@Nullable ImpressionData impressionData) {
            YandexMediationAdapter.this.log("AdView ad impression tracked");
            this.listener.onAdViewAdDisplayed();
        }
    }

    private class NativeAdListener implements NativeAdLoadListener, NativeAdEventListener {
        private final Context applicationContext;
        private final MaxNativeAdAdapterListener listener;
        private final String placementId;
        private final Bundle serverParameters;

        private NativeAdListener(MaxAdapterResponseParameters maxAdapterResponseParameters, Context context, MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
            this.placementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
            this.serverParameters = maxAdapterResponseParameters.getServerParameters();
            this.applicationContext = context;
            this.listener = maxNativeAdAdapterListener;
        }

        @Override // com.yandex.mobile.ads.nativeads.NativeAdLoadListener
        public void onAdLoaded(@NonNull NativeAd nativeAd) {
            YandexMediationAdapter.this.log("Native ad loaded: " + this.placementId);
            YandexMediationAdapter.this.nativeAd = nativeAd;
            nativeAd.setNativeAdEventListener(this);
            final NativeAdAssets adAssets = nativeAd.getAdAssets();
            if (AppLovinSdkUtils.isValidString(BundleUtils.getString("template", "", this.serverParameters)) && TextUtils.isEmpty(adAssets.getTitle())) {
                YandexMediationAdapter.this.e("Native ad (" + nativeAd + ") does not have required assets.");
                this.listener.onNativeAdLoadFailed(MaxAdapterError.MISSING_REQUIRED_NATIVE_AD_ASSETS);
                return;
            }
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.mediation.adapters.YandexMediationAdapter.NativeAdListener.1
                @Override // java.lang.Runnable
                public void run() {
                    MaxNativeAd.Builder mediaView = new MaxNativeAd.Builder().setAdFormat(MaxAdFormat.NATIVE).setTitle(adAssets.getTitle()).setAdvertiser(adAssets.getDomain()).setBody(adAssets.getBody()).setCallToAction(adAssets.getCallToAction()).setIcon(new MaxNativeAd.MaxNativeAdImage(adAssets.getIcon() != null ? adAssets.getIcon().getDrawable() : null)).setOptionsView(new ImageView(NativeAdListener.this.applicationContext)).setMediaView(new MediaView(NativeAdListener.this.applicationContext));
                    if (adAssets.getRating() != null) {
                        mediaView.setStarRating(Double.valueOf(adAssets.getRating().floatValue()));
                    }
                    NativeAdListener.this.listener.onNativeAdLoaded(YandexMediationAdapter.this.new MaxYandexNativeAd(mediaView), null);
                }
            });
        }

        @Override // com.yandex.mobile.ads.nativeads.NativeAdLoadListener
        public void onAdFailedToLoad(@NonNull AdRequestError adRequestError) {
            MaxAdapterError maxError = YandexMediationAdapter.toMaxError(adRequestError);
            YandexMediationAdapter.this.log("Native ad (" + this.placementId + ") failed to load with error: " + maxError);
            this.listener.onNativeAdLoadFailed(maxError);
        }

        @Override // com.yandex.mobile.ads.nativeads.NativeAdEventListener
        public void onImpression(@Nullable ImpressionData impressionData) {
            YandexMediationAdapter.this.log("Native ad (" + this.placementId + ") shown");
            this.listener.onNativeAdDisplayed(null);
        }

        @Override // com.yandex.mobile.ads.nativeads.NativeAdEventListener
        public void onAdClicked() {
            YandexMediationAdapter.this.log("Native ad (" + this.placementId + ") clicked");
            this.listener.onNativeAdClicked();
        }
    }

    private class MaxYandexNativeAd extends MaxNativeAd {
        public MaxYandexNativeAd(MaxNativeAd.Builder builder) {
            super(builder);
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x0183 A[Catch: all -> 0x015a, TryCatch #0 {all -> 0x015a, blocks: (B:26:0x00fe, B:28:0x011f, B:31:0x0124, B:32:0x016b, B:33:0x017d, B:35:0x0183, B:38:0x0190, B:82:0x0199, B:85:0x019d, B:75:0x01a5, B:78:0x01ab, B:68:0x01b3, B:71:0x01b9, B:61:0x01c0, B:64:0x01c6, B:52:0x01cd, B:55:0x01d3, B:92:0x01d7, B:94:0x01e9, B:96:0x020b, B:97:0x015d), top: B:25:0x00fe }] */
        /* JADX WARN: Removed duplicated region for block: B:94:0x01e9 A[Catch: all -> 0x015a, TryCatch #0 {all -> 0x015a, blocks: (B:26:0x00fe, B:28:0x011f, B:31:0x0124, B:32:0x016b, B:33:0x017d, B:35:0x0183, B:38:0x0190, B:82:0x0199, B:85:0x019d, B:75:0x01a5, B:78:0x01ab, B:68:0x01b3, B:71:0x01b9, B:61:0x01c0, B:64:0x01c6, B:52:0x01cd, B:55:0x01d3, B:92:0x01d7, B:94:0x01e9, B:96:0x020b, B:97:0x015d), top: B:25:0x00fe }] */
        /* JADX WARN: Removed duplicated region for block: B:96:0x020b A[Catch: all -> 0x015a, TRY_LEAVE, TryCatch #0 {all -> 0x015a, blocks: (B:26:0x00fe, B:28:0x011f, B:31:0x0124, B:32:0x016b, B:33:0x017d, B:35:0x0183, B:38:0x0190, B:82:0x0199, B:85:0x019d, B:75:0x01a5, B:78:0x01ab, B:68:0x01b3, B:71:0x01b9, B:61:0x01c0, B:64:0x01c6, B:52:0x01cd, B:55:0x01d3, B:92:0x01d7, B:94:0x01e9, B:96:0x020b, B:97:0x015d), top: B:25:0x00fe }] */
        @Override // com.applovin.mediation.nativeAds.MaxNativeAd
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean prepareForInteraction(List<View> list, ViewGroup viewGroup) {
            AdBindingResult bindNativeAd;
            TextView createTextViewIfNeeded;
            if (YandexMediationAdapter.this.nativeAd != null) {
                YandexMediationAdapter.this.nativeAdView = new NativeAdView(viewGroup.getContext());
                if (viewGroup instanceof MaxNativeAdView) {
                    MaxNativeAdView maxNativeAdView = (MaxNativeAdView) viewGroup;
                    View mainView = maxNativeAdView.getMainView();
                    maxNativeAdView.removeView(mainView);
                    YandexMediationAdapter.this.nativeAdView.addView(mainView);
                    maxNativeAdView.addView(YandexMediationAdapter.this.nativeAdView);
                    ViewGroup mediaContentViewGroup = maxNativeAdView.getMediaContentViewGroup();
                    MediaView mediaView = (MediaView) getMediaView();
                    if (mediaView == null) {
                        YandexMediationAdapter.this.e("Failed to register native ad views: media view is null.");
                        return false;
                    }
                    if (mediaView.getParent() != null) {
                        ((ViewGroup) mediaView.getParent()).removeView(mediaView);
                    }
                    if (mediaContentViewGroup != null) {
                        mediaContentViewGroup.removeAllViews();
                        mediaContentViewGroup.addView(mediaView, new ViewGroup.LayoutParams(-1, -1));
                    }
                    AdBindingResult bindNativeAd2 = YandexMediationAdapter.this.nativeAd.bindNativeAd(new NativeAdViewBinder.Builder(YandexMediationAdapter.this.nativeAdView).setIconView(maxNativeAdView.getIconImageView()).setTitleView(maxNativeAdView.getTitleTextView()).setDomainView(maxNativeAdView.getAdvertiserTextView()).setBodyView(maxNativeAdView.getBodyTextView()).setMediaView((MediaView) getMediaView()).setFeedbackView((ImageView) getOptionsView()).setCallToActionView(maxNativeAdView.getCallToActionButton()).build());
                    if (bindNativeAd2 instanceof AdBindingResult.Success) {
                        YandexMediationAdapter.this.nativeAdView.setVisibility(0);
                    } else if (bindNativeAd2 instanceof AdBindingResult.Failure) {
                        AdBindingResult.Failure failure = (AdBindingResult.Failure) bindNativeAd2;
                        YandexMediationAdapter.this.e("Binding failed: missing asset '" + failure.getMissingAssetName() + '\'', failure.getException());
                        return false;
                    }
                } else {
                    try {
                        MediaView mediaView2 = (MediaView) getMediaView();
                        ViewGroup viewGroup2 = (ViewGroup) mediaView2.getParent();
                        viewGroup2.removeView(mediaView2);
                        YandexMediationAdapter.this.nativeAdView.addView(mediaView2, new ViewGroup.LayoutParams(-1, -1));
                        if (!(viewGroup2 instanceof RelativeLayout) && !(viewGroup2 instanceof FrameLayout)) {
                            YandexMediationAdapter.this.nativeAdView.measure(View.MeasureSpec.makeMeasureSpec(viewGroup2.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(viewGroup2.getHeight(), 1073741824));
                            YandexMediationAdapter.this.nativeAdView.layout(0, 0, viewGroup2.getWidth(), viewGroup2.getHeight());
                            viewGroup2.addView(YandexMediationAdapter.this.nativeAdView);
                            NativeAdViewBinder.Builder builder = new NativeAdViewBinder.Builder(YandexMediationAdapter.this.nativeAdView);
                            builder.setMediaView(mediaView2);
                            for (View view : list) {
                                Object tag = view.getTag();
                                if (tag != null) {
                                    int intValue = ((Integer) tag).intValue();
                                    if (intValue == 3) {
                                        if (view instanceof ImageView) {
                                            builder.setIconView((ImageView) view);
                                        }
                                    } else if (intValue == 1) {
                                        TextView createTextViewIfNeeded2 = createTextViewIfNeeded(view);
                                        if (createTextViewIfNeeded2 != null) {
                                            builder.setTitleView(createTextViewIfNeeded2);
                                        }
                                    } else if (intValue == 8) {
                                        TextView createTextViewIfNeeded3 = createTextViewIfNeeded(view);
                                        if (createTextViewIfNeeded3 != null) {
                                            builder.setDomainView(createTextViewIfNeeded3);
                                        }
                                    } else if (intValue == 4) {
                                        TextView createTextViewIfNeeded4 = createTextViewIfNeeded(view);
                                        if (createTextViewIfNeeded4 != null) {
                                            builder.setBodyView(createTextViewIfNeeded4);
                                        }
                                    } else if (intValue == 5 && (createTextViewIfNeeded = createTextViewIfNeeded(view)) != null) {
                                        builder.setCallToActionView(createTextViewIfNeeded);
                                    }
                                }
                            }
                            bindNativeAd = YandexMediationAdapter.this.nativeAd.bindNativeAd(builder.build());
                            if (bindNativeAd instanceof AdBindingResult.Failure) {
                                YandexMediationAdapter.this.nativeAdView.setVisibility(0);
                            } else {
                                AdBindingResult.Failure failure2 = (AdBindingResult.Failure) bindNativeAd;
                                YandexMediationAdapter.this.e("Binding failed: missing asset '" + failure2.getMissingAssetName() + '\'', failure2.getException());
                                return false;
                            }
                        }
                        viewGroup2.addView(YandexMediationAdapter.this.nativeAdView, new ViewGroup.LayoutParams(-1, -1));
                        NativeAdViewBinder.Builder builder2 = new NativeAdViewBinder.Builder(YandexMediationAdapter.this.nativeAdView);
                        builder2.setMediaView(mediaView2);
                        while (r10.hasNext()) {
                        }
                        bindNativeAd = YandexMediationAdapter.this.nativeAd.bindNativeAd(builder2.build());
                        if (bindNativeAd instanceof AdBindingResult.Failure) {
                        }
                    } catch (Throwable th) {
                        YandexMediationAdapter.this.e("Failed to register native ad views.", th);
                    }
                }
                return true;
            }
            YandexMediationAdapter.this.e("Failed to register native ad views: native ad is null.");
            return false;
        }

        private TextView createTextViewIfNeeded(View view) {
            if (view instanceof TextView) {
                return (TextView) view;
            }
            if (!(view instanceof ViewGroup)) {
                return null;
            }
            TextView textView = new TextView(view.getContext());
            textView.setAlpha(0.0f);
            ((ViewGroup) view).addView(textView);
            return textView;
        }
    }
}
