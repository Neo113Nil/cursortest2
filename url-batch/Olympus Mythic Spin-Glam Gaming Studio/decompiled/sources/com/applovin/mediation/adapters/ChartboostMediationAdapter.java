package com.applovin.mediation.adapters;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import com.applovin.mediation.adapters.chartboost.BuildConfig;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.LoggingLevel;
import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.ads.Banner;
import com.chartboost.sdk.ads.Interstitial;
import com.chartboost.sdk.ads.Rewarded;
import com.chartboost.sdk.callbacks.BannerCallback;
import com.chartboost.sdk.callbacks.InterstitialCallback;
import com.chartboost.sdk.callbacks.RewardedCallback;
import com.chartboost.sdk.callbacks.StartCallback;
import com.chartboost.sdk.events.CacheError;
import com.chartboost.sdk.events.CacheEvent;
import com.chartboost.sdk.events.ClickError;
import com.chartboost.sdk.events.ClickEvent;
import com.chartboost.sdk.events.DismissEvent;
import com.chartboost.sdk.events.ExpirationEvent;
import com.chartboost.sdk.events.ImpressionEvent;
import com.chartboost.sdk.events.RewardEvent;
import com.chartboost.sdk.events.ShowError;
import com.chartboost.sdk.events.ShowEvent;
import com.chartboost.sdk.events.StartError;
import com.chartboost.sdk.privacy.model.CCPA;
import com.chartboost.sdk.privacy.model.GDPR;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes9.dex */
public class ChartboostMediationAdapter extends MediationAdapterBase implements MaxSignalProvider, MaxInterstitialAdapter, MaxRewardedAdapter, MaxAdViewAdapter {
    private static MaxAdapter.InitializationStatus status;
    private Banner adView;
    private Interstitial interstitialAd;
    private Rewarded rewardedAd;
    private static final AtomicBoolean initialized = new AtomicBoolean();
    private static final Mediation MEDIATION_PROVIDER = new Mediation("MAX", AppLovinSdk.VERSION, BuildConfig.VERSION_NAME);

    public ChartboostMediationAdapter(AppLovinSdk appLovinSdk) {
        super(appLovinSdk);
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, @Nullable Activity activity, final MaxAdapter.OnCompletionListener onCompletionListener) {
        if (initialized.compareAndSet(false, true)) {
            status = MaxAdapter.InitializationStatus.INITIALIZING;
            Bundle serverParameters = maxAdapterInitializationParameters.getServerParameters();
            String string = serverParameters.getString("app_id");
            log("Initializing Chartboost SDK with app id: " + string + "...");
            Context applicationContext = activity != null ? activity.getApplicationContext() : getApplicationContext();
            updateConsentStatus(maxAdapterInitializationParameters, applicationContext);
            Chartboost.startWithAppId(applicationContext, string, serverParameters.getString("app_signature"), new StartCallback() { // from class: com.applovin.mediation.adapters.ChartboostMediationAdapter.1
                @Override // com.chartboost.sdk.callbacks.StartCallback
                public void onStartCompleted(@Nullable StartError startError) {
                    if (startError != null) {
                        ChartboostMediationAdapter.this.log("Chartboost SDK initialized failed because of error: " + startError);
                        MaxAdapter.InitializationStatus unused = ChartboostMediationAdapter.status = MaxAdapter.InitializationStatus.INITIALIZED_FAILURE;
                        onCompletionListener.onCompletion(ChartboostMediationAdapter.status, startError.toString());
                        return;
                    }
                    ChartboostMediationAdapter.this.log("Chartboost SDK initialized successfully");
                    MaxAdapter.InitializationStatus unused2 = ChartboostMediationAdapter.status = MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS;
                    onCompletionListener.onCompletion(ChartboostMediationAdapter.status, null);
                }
            });
            if (maxAdapterInitializationParameters.isTesting()) {
                Chartboost.setLoggingLevel(LoggingLevel.ALL);
                return;
            }
            return;
        }
        onCompletionListener.onCompletion(status, null);
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public String getSdkVersion() {
        return Chartboost.getSDKVersion();
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public String getAdapterVersion() {
        return BuildConfig.VERSION_NAME;
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public void onDestroy() {
        log("Destroy called for adapter " + this);
        Interstitial interstitial = this.interstitialAd;
        if (interstitial != null) {
            interstitial.clearCache();
            this.interstitialAd = null;
        }
        Rewarded rewarded = this.rewardedAd;
        if (rewarded != null) {
            rewarded.clearCache();
            this.rewardedAd = null;
        }
        Banner banner = this.adView;
        if (banner != null) {
            banner.detach();
            this.adView.clearCache();
            this.adView = null;
        }
    }

    @Override // com.applovin.mediation.adapter.MaxSignalProvider
    public void collectSignal(MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, @Nullable Activity activity, MaxSignalCollectionListener maxSignalCollectionListener) {
        log("Collecting signal...");
        maxSignalCollectionListener.onSignalCollected(Chartboost.getBidderToken());
    }

    @Override // com.applovin.mediation.adapter.MaxInterstitialAdapter
    public void loadInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, @Nullable Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        String retrieveLocation = retrieveLocation(maxAdapterResponseParameters);
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        boolean isValidString = AppLovinSdkUtils.isValidString(bidResponse);
        StringBuilder sb = new StringBuilder();
        sb.append("Loading ");
        sb.append(isValidString ? "bidding " : "");
        sb.append("interstitial ad for location \"");
        sb.append(retrieveLocation);
        sb.append("\"...");
        log(sb.toString());
        updateConsentStatus(maxAdapterResponseParameters, getContext(activity));
        Interstitial interstitial = new Interstitial(retrieveLocation, new InterstitialAdListener(maxInterstitialAdapterListener), MEDIATION_PROVIDER);
        this.interstitialAd = interstitial;
        if (isValidString) {
            interstitial.cache(bidResponse);
        } else {
            interstitial.cache();
        }
    }

    @Override // com.applovin.mediation.adapter.MaxInterstitialAdapter
    public void showInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, @Nullable Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        log("Showing interstitial ad for location \"" + retrieveLocation(maxAdapterResponseParameters) + "\"...");
        Interstitial interstitial = this.interstitialAd;
        if (interstitial != null) {
            interstitial.show();
            return;
        }
        log("Interstitial ad not ready");
        MaxAdapterError maxAdapterError = MaxAdapterError.AD_DISPLAY_FAILED;
        MaxAdapterError maxAdapterError2 = MaxAdapterError.AD_NOT_READY;
        maxInterstitialAdapterListener.onInterstitialAdDisplayFailed(new MaxAdapterError(maxAdapterError, maxAdapterError2.getCode(), maxAdapterError2.getMessage()));
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedAdapter
    public void loadRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, @Nullable Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        String retrieveLocation = retrieveLocation(maxAdapterResponseParameters);
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        boolean isValidString = AppLovinSdkUtils.isValidString(bidResponse);
        StringBuilder sb = new StringBuilder();
        sb.append("Loading ");
        sb.append(isValidString ? "bidding " : "");
        sb.append("rewarded ad for location \"");
        sb.append(retrieveLocation);
        sb.append("\"...");
        log(sb.toString());
        updateConsentStatus(maxAdapterResponseParameters, getContext(activity));
        Rewarded rewarded = new Rewarded(retrieveLocation, new RewardedAdListener(maxRewardedAdapterListener), MEDIATION_PROVIDER);
        this.rewardedAd = rewarded;
        if (isValidString) {
            rewarded.cache(bidResponse);
        } else {
            rewarded.cache();
        }
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedAdapter
    public void showRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, @Nullable Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        log("Showing rewarded ad for location \"" + retrieveLocation(maxAdapterResponseParameters) + "\"...");
        if (this.rewardedAd != null) {
            configureReward(maxAdapterResponseParameters);
            this.rewardedAd.show();
        } else {
            log("Rewarded ad not ready");
            MaxAdapterError maxAdapterError = MaxAdapterError.AD_DISPLAY_FAILED;
            MaxAdapterError maxAdapterError2 = MaxAdapterError.AD_NOT_READY;
            maxRewardedAdapterListener.onRewardedAdDisplayFailed(new MaxAdapterError(maxAdapterError, maxAdapterError2.getCode(), maxAdapterError2.getMessage()));
        }
    }

    @Override // com.applovin.mediation.adapter.MaxAdViewAdapter
    public void loadAdViewAd(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, @Nullable Activity activity, MaxAdViewAdapterListener maxAdViewAdapterListener) {
        String retrieveLocation = retrieveLocation(maxAdapterResponseParameters);
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        boolean isValidString = AppLovinSdkUtils.isValidString(bidResponse);
        StringBuilder sb = new StringBuilder();
        sb.append("Loading ");
        sb.append(isValidString ? "bidding " : "");
        sb.append(maxAdFormat.getLabel());
        sb.append(" ad for location \"");
        sb.append(retrieveLocation);
        sb.append("\"...");
        log(sb.toString());
        updateConsentStatus(maxAdapterResponseParameters, getContext(activity));
        Banner banner = new Banner(getContext(activity), retrieveLocation, toAdSize(maxAdFormat), new AdViewAdListener(maxAdViewAdapterListener, maxAdFormat), MEDIATION_PROVIDER);
        this.adView = banner;
        if (isValidString) {
            banner.cache(bidResponse);
        } else {
            banner.cache();
        }
    }

    private void updateConsentStatus(MaxAdapterParameters maxAdapterParameters, Context context) {
        Boolean hasUserConsent = maxAdapterParameters.hasUserConsent();
        if (hasUserConsent != null) {
            Chartboost.addDataUseConsent(context, new GDPR(hasUserConsent.booleanValue() ? GDPR.GDPR_CONSENT.BEHAVIORAL : GDPR.GDPR_CONSENT.NON_BEHAVIORAL));
        }
        Boolean isDoNotSell = maxAdapterParameters.isDoNotSell();
        if (isDoNotSell != null) {
            Chartboost.addDataUseConsent(context, new CCPA(isDoNotSell.booleanValue() ? CCPA.CCPA_CONSENT.OPT_OUT_SALE : CCPA.CCPA_CONSENT.OPT_IN_SALE));
        }
    }

    private String retrieveLocation(MaxAdapterResponseParameters maxAdapterResponseParameters) {
        if (TextUtils.isEmpty(maxAdapterResponseParameters.getThirdPartyAdPlacementId())) {
            return "Default";
        }
        return maxAdapterResponseParameters.getThirdPartyAdPlacementId();
    }

    private Banner.BannerSize toAdSize(MaxAdFormat maxAdFormat) {
        if (maxAdFormat == MaxAdFormat.BANNER) {
            return Banner.BannerSize.STANDARD;
        }
        if (maxAdFormat == MaxAdFormat.LEADER) {
            return Banner.BannerSize.LEADERBOARD;
        }
        if (maxAdFormat == MaxAdFormat.MREC) {
            return Banner.BannerSize.MEDIUM;
        }
        throw new IllegalArgumentException("Invalid ad format: " + maxAdFormat);
    }

    /* renamed from: com.applovin.mediation.adapters.ChartboostMediationAdapter$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$com$chartboost$sdk$events$CacheError$Code;

        static {
            int[] iArr = new int[CacheError.Code.values().length];
            $SwitchMap$com$chartboost$sdk$events$CacheError$Code = iArr;
            try {
                iArr[CacheError.Code.INTERNAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$chartboost$sdk$events$CacheError$Code[CacheError.Code.INTERNET_UNAVAILABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$chartboost$sdk$events$CacheError$Code[CacheError.Code.NETWORK_FAILURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$chartboost$sdk$events$CacheError$Code[CacheError.Code.NO_AD_FOUND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$chartboost$sdk$events$CacheError$Code[CacheError.Code.SESSION_NOT_STARTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$chartboost$sdk$events$CacheError$Code[CacheError.Code.ASSET_DOWNLOAD_FAILURE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$chartboost$sdk$events$CacheError$Code[CacheError.Code.BANNER_DISABLED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$chartboost$sdk$events$CacheError$Code[CacheError.Code.BANNER_VIEW_IS_DETACHED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$chartboost$sdk$events$CacheError$Code[CacheError.Code.SERVER_ERROR.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static MaxAdapterError toMaxError(CacheError cacheError) {
        MaxAdapterError maxAdapterError = MaxAdapterError.UNSPECIFIED;
        switch (AnonymousClass3.$SwitchMap$com$chartboost$sdk$events$CacheError$Code[cacheError.getCode().ordinal()]) {
            case 1:
                maxAdapterError = MaxAdapterError.INTERNAL_ERROR;
                break;
            case 2:
            case 3:
                maxAdapterError = MaxAdapterError.NO_CONNECTION;
                break;
            case 4:
                maxAdapterError = MaxAdapterError.NO_FILL;
                break;
            case 5:
                maxAdapterError = MaxAdapterError.NOT_INITIALIZED;
                break;
            case 6:
                maxAdapterError = MaxAdapterError.BAD_REQUEST;
                break;
            case 7:
            case 8:
                maxAdapterError = MaxAdapterError.INVALID_CONFIGURATION;
                break;
            case 9:
                maxAdapterError = MaxAdapterError.SERVER_ERROR;
                break;
        }
        return new MaxAdapterError(maxAdapterError, cacheError.getCode().getErrorCode(), cacheError.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showAdViewDelayed(final MaxAdViewAdapterListener maxAdViewAdapterListener) {
        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.mediation.adapters.ChartboostMediationAdapter.2
            @Override // java.lang.Runnable
            public void run() {
                if (ChartboostMediationAdapter.this.adView != null) {
                    ChartboostMediationAdapter.this.adView.show();
                    return;
                }
                ChartboostMediationAdapter.this.log("Ad load failed: Chartboost Banner AdView is not ready.");
                MaxAdViewAdapterListener maxAdViewAdapterListener2 = maxAdViewAdapterListener;
                MaxAdapterError maxAdapterError = MaxAdapterError.AD_DISPLAY_FAILED;
                MaxAdapterError maxAdapterError2 = MaxAdapterError.AD_NOT_READY;
                maxAdViewAdapterListener2.onAdViewAdDisplayFailed(new MaxAdapterError(maxAdapterError, maxAdapterError2.getCode(), maxAdapterError2.getMessage()));
            }
        }, 500L);
    }

    private Context getContext(@Nullable Activity activity) {
        return activity != null ? activity.getApplicationContext() : getApplicationContext();
    }

    private class InterstitialAdListener implements InterstitialCallback {
        private final MaxInterstitialAdapterListener listener;

        private InterstitialAdListener(MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
            this.listener = maxInterstitialAdapterListener;
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onAdLoaded(@NonNull CacheEvent cacheEvent, @Nullable CacheError cacheError) {
            String location = cacheEvent.getAd().getLocation();
            if (cacheError != null) {
                ChartboostMediationAdapter.this.log("Interstitial ad failed \"" + location + "\" to load with error: " + cacheError);
                this.listener.onInterstitialAdLoadFailed(ChartboostMediationAdapter.toMaxError(cacheError));
                return;
            }
            ChartboostMediationAdapter.this.log("Interstitial ad loaded: " + location);
            this.listener.onInterstitialAdLoaded();
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onAdExpired(@NonNull ExpirationEvent expirationEvent) {
            ChartboostMediationAdapter.this.log("Interstitial ad expired with reason: " + expirationEvent.getReason());
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onAdRequestedToShow(@NonNull ShowEvent showEvent) {
            ChartboostMediationAdapter.this.log("Interstitial ad requested to show: " + showEvent.getAd().getLocation());
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onAdShown(@NonNull ShowEvent showEvent, @Nullable ShowError showError) {
            String location = showEvent.getAd().getLocation();
            if (showError != null) {
                ChartboostMediationAdapter.this.log("Interstitial ad failed \"" + location + "\" to show with error: " + showError);
                this.listener.onInterstitialAdDisplayFailed(new MaxAdapterError(MaxAdapterError.AD_DISPLAY_FAILED, showError.getCode().getErrorCode(), showError.toString()));
                return;
            }
            ChartboostMediationAdapter.this.log("Interstitial ad shown: " + location);
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onAdClicked(@NonNull ClickEvent clickEvent, @Nullable ClickError clickError) {
            String location = clickEvent.getAd().getLocation();
            if (clickError != null) {
                ChartboostMediationAdapter.this.log("Failed to record interstitial ad click on \"" + location + "\" because of error: " + clickError);
                return;
            }
            ChartboostMediationAdapter.this.log("Interstitial ad clicked: " + location);
            this.listener.onInterstitialAdClicked();
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onImpressionRecorded(@NonNull ImpressionEvent impressionEvent) {
            ChartboostMediationAdapter.this.log("Interstitial ad impression tracked: " + impressionEvent.getAd().getLocation());
            if (TextUtils.isEmpty(impressionEvent.getAdID())) {
                this.listener.onInterstitialAdDisplayed();
                return;
            }
            Bundle bundle = new Bundle(1);
            bundle.putString("creative_id", impressionEvent.getAdID());
            this.listener.onInterstitialAdDisplayed(bundle);
        }

        @Override // com.chartboost.sdk.callbacks.DismissibleAdCallback
        public void onAdDismiss(@NonNull DismissEvent dismissEvent) {
            ChartboostMediationAdapter.this.log("Interstitial ad hidden: " + dismissEvent.getAd().getLocation());
            this.listener.onInterstitialAdHidden();
        }
    }

    private class RewardedAdListener implements RewardedCallback {
        private boolean hasGrantedReward;
        private final MaxRewardedAdapterListener listener;

        private RewardedAdListener(MaxRewardedAdapterListener maxRewardedAdapterListener) {
            this.listener = maxRewardedAdapterListener;
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onAdLoaded(@NonNull CacheEvent cacheEvent, @Nullable CacheError cacheError) {
            String location = cacheEvent.getAd().getLocation();
            if (cacheError != null) {
                ChartboostMediationAdapter.this.log("Rewarded ad failed \"" + location + "\" to load with error: " + cacheError);
                this.listener.onRewardedAdLoadFailed(ChartboostMediationAdapter.toMaxError(cacheError));
                return;
            }
            ChartboostMediationAdapter.this.log("Rewarded ad loaded: " + location);
            this.listener.onRewardedAdLoaded();
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onAdExpired(@NonNull ExpirationEvent expirationEvent) {
            ChartboostMediationAdapter.this.log("Rewarded ad expired with reason: " + expirationEvent.getReason());
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onAdRequestedToShow(@NonNull ShowEvent showEvent) {
            ChartboostMediationAdapter.this.log("Rewarded ad requested to show: " + showEvent.getAd().getLocation());
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onAdShown(@NonNull ShowEvent showEvent, @Nullable ShowError showError) {
            String location = showEvent.getAd().getLocation();
            if (showError != null) {
                ChartboostMediationAdapter.this.log("Rewarded ad failed \"" + location + "\" to show with error: " + showError);
                this.listener.onRewardedAdDisplayFailed(new MaxAdapterError(MaxAdapterError.AD_DISPLAY_FAILED, showError.getCode().getErrorCode(), showError.toString()));
                return;
            }
            ChartboostMediationAdapter.this.log("Rewarded ad shown: " + location);
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onAdClicked(@NonNull ClickEvent clickEvent, @Nullable ClickError clickError) {
            String location = clickEvent.getAd().getLocation();
            if (clickError != null) {
                ChartboostMediationAdapter.this.log("Failed to record rewarded ad click on \"" + location + "\" because of error: " + clickError);
                return;
            }
            ChartboostMediationAdapter.this.log("Rewarded ad clicked: " + location);
            this.listener.onRewardedAdClicked();
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onImpressionRecorded(@NonNull ImpressionEvent impressionEvent) {
            ChartboostMediationAdapter.this.log("Rewarded ad impression tracked: " + impressionEvent.getAd().getLocation());
            if (TextUtils.isEmpty(impressionEvent.getAdID())) {
                this.listener.onRewardedAdDisplayed();
                return;
            }
            Bundle bundle = new Bundle(1);
            bundle.putString("creative_id", impressionEvent.getAdID());
            this.listener.onRewardedAdDisplayed(bundle);
        }

        @Override // com.chartboost.sdk.callbacks.RewardedCallback
        public void onRewardEarned(@NonNull RewardEvent rewardEvent) {
            ChartboostMediationAdapter.this.log("Rewarded ad granted reward: " + rewardEvent.getAd().getLocation());
            this.hasGrantedReward = true;
        }

        @Override // com.chartboost.sdk.callbacks.DismissibleAdCallback
        public void onAdDismiss(@NonNull DismissEvent dismissEvent) {
            String location = dismissEvent.getAd().getLocation();
            if (this.hasGrantedReward || ChartboostMediationAdapter.this.shouldAlwaysRewardUser()) {
                MaxReward reward = ChartboostMediationAdapter.this.getReward();
                ChartboostMediationAdapter.this.log("Rewarded ad user with reward: " + reward + " at location: " + location);
                this.listener.onUserRewarded(reward);
            }
            ChartboostMediationAdapter.this.log("Rewarded ad hidden: " + location);
            this.listener.onRewardedAdHidden();
        }
    }

    private class AdViewAdListener implements BannerCallback {
        private final MaxAdFormat adFormat;
        private final MaxAdViewAdapterListener listener;

        private AdViewAdListener(MaxAdViewAdapterListener maxAdViewAdapterListener, MaxAdFormat maxAdFormat) {
            this.listener = maxAdViewAdapterListener;
            this.adFormat = maxAdFormat;
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onAdLoaded(@NonNull CacheEvent cacheEvent, @Nullable CacheError cacheError) {
            String location = cacheEvent.getAd().getLocation();
            if (cacheError != null) {
                ChartboostMediationAdapter.this.log(this.adFormat.getLabel() + " ad failed \"" + location + "\" to load with error: " + cacheError);
                this.listener.onAdViewAdLoadFailed(ChartboostMediationAdapter.toMaxError(cacheError));
                return;
            }
            ChartboostMediationAdapter.this.log(this.adFormat.getLabel() + " ad loaded: " + location);
            if (TextUtils.isEmpty(cacheEvent.getAdID())) {
                this.listener.onAdViewAdLoaded(ChartboostMediationAdapter.this.adView);
            } else {
                Bundle bundle = new Bundle(1);
                bundle.putString("creative_id", cacheEvent.getAdID());
                this.listener.onAdViewAdLoaded(ChartboostMediationAdapter.this.adView, bundle);
            }
            ChartboostMediationAdapter.this.showAdViewDelayed(this.listener);
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onAdExpired(@NonNull ExpirationEvent expirationEvent) {
            ChartboostMediationAdapter.this.log("AdView ad expired with reason: " + expirationEvent.getReason());
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onAdRequestedToShow(@NonNull ShowEvent showEvent) {
            ChartboostMediationAdapter.this.log(this.adFormat.getLabel() + " ad requested to show: " + showEvent.getAd().getLocation());
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onAdShown(@NonNull ShowEvent showEvent, @Nullable ShowError showError) {
            String location = showEvent.getAd().getLocation();
            if (showError != null) {
                ChartboostMediationAdapter.this.log(this.adFormat.getLabel() + " ad failed \"" + location + "\" to show with error: " + showError);
                this.listener.onAdViewAdDisplayFailed(new MaxAdapterError(MaxAdapterError.AD_DISPLAY_FAILED, showError.getCode().getErrorCode(), showError.toString()));
                return;
            }
            ChartboostMediationAdapter.this.log(this.adFormat.getLabel() + " ad shown: " + location);
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onAdClicked(@NonNull ClickEvent clickEvent, @Nullable ClickError clickError) {
            String location = clickEvent.getAd().getLocation();
            if (clickError != null) {
                ChartboostMediationAdapter.this.log("Failed to record " + this.adFormat.getLabel() + " ad click on \"" + location + "\" because of error: " + clickError);
                return;
            }
            ChartboostMediationAdapter.this.log(this.adFormat.getLabel() + " ad clicked: " + location);
            this.listener.onAdViewAdClicked();
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onImpressionRecorded(@NonNull ImpressionEvent impressionEvent) {
            ChartboostMediationAdapter.this.log(this.adFormat.getLabel() + " ad impression tracked: " + impressionEvent.getAd().getLocation());
            if (TextUtils.isEmpty(impressionEvent.getAdID())) {
                this.listener.onAdViewAdDisplayed();
                return;
            }
            Bundle bundle = new Bundle(1);
            bundle.putString("creative_id", impressionEvent.getAdID());
            this.listener.onAdViewAdDisplayed(bundle);
        }
    }
}
