package com.applovin.mediation.adapters;

import android.app.Activity;
import android.app.Application;
import android.view.View;
import androidx.annotation.Nullable;
import com.applovin.mediation.MaxAdFormat;
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
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import com.applovin.mediation.adapters.ysonetwork.BuildConfig;
import com.applovin.sdk.AppLovinSdk;
import com.ysocorp.ysonetwork.YsoNetwork;
import com.ysocorp.ysonetwork.enums.YNEnumActionError;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes13.dex */
public class YsoNetworkMediationAdapter extends MediationAdapterBase implements MaxSignalProvider, MaxInterstitialAdapter, MaxRewardedAdapter, MaxAdViewAdapter {
    private static final AtomicBoolean INITIALIZED = new AtomicBoolean();
    private static MaxAdapter.InitializationStatus status;
    private AdViewLoadListener adViewLoadListener;
    private AdViewShowListener adViewShowListener;
    private InterstitialAdListener interstitialAdListener;
    private RewardedAdListener rewardedAdListener;

    public YsoNetworkMediationAdapter(AppLovinSdk appLovinSdk) {
        super(appLovinSdk);
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, @Nullable Activity activity, MaxAdapter.OnCompletionListener onCompletionListener) {
        if (INITIALIZED.compareAndSet(false, true)) {
            log("Initializing YSO Network");
            status = MaxAdapter.InitializationStatus.INITIALIZING;
            try {
                YsoNetwork.initialize((Application) getApplicationContext());
                if (YsoNetwork.isInitialized()) {
                    log("YSO Network successfully initialized");
                    status = MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS;
                }
                onCompletionListener.onCompletion(status, null);
                return;
            } catch (Throwable th) {
                e("YSO Network failed to initialize", th);
                MaxAdapter.InitializationStatus initializationStatus = MaxAdapter.InitializationStatus.INITIALIZED_FAILURE;
                status = initializationStatus;
                onCompletionListener.onCompletion(initializationStatus, th.toString());
                return;
            }
        }
        onCompletionListener.onCompletion(status, null);
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public String getSdkVersion() {
        return YsoNetwork.getSdkVersion();
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public String getAdapterVersion() {
        return BuildConfig.VERSION_NAME;
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public void onDestroy() {
        this.interstitialAdListener = null;
        this.rewardedAdListener = null;
        this.adViewLoadListener = null;
        this.adViewShowListener = null;
    }

    @Override // com.applovin.mediation.adapter.MaxSignalProvider
    public void collectSignal(MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, @Nullable Activity activity, MaxSignalCollectionListener maxSignalCollectionListener) {
        log("Collecting signal...");
        maxSignalCollectionListener.onSignalCollected(YsoNetwork.getSignal());
    }

    @Override // com.applovin.mediation.adapter.MaxInterstitialAdapter
    public void loadInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, @Nullable Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        log("Loading interstitial ad for key: " + thirdPartyAdPlacementId + "...");
        InterstitialAdListener interstitialAdListener = new InterstitialAdListener(this, thirdPartyAdPlacementId, maxInterstitialAdapterListener, null);
        this.interstitialAdListener = interstitialAdListener;
        YsoNetwork.interstitialLoad(thirdPartyAdPlacementId, bidResponse, interstitialAdListener);
    }

    @Override // com.applovin.mediation.adapter.MaxInterstitialAdapter
    public void showInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, @Nullable Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log("Showing interstitial ad for key: " + thirdPartyAdPlacementId + "...");
        YsoNetwork.interstitialShow(thirdPartyAdPlacementId, this.interstitialAdListener, activity);
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedAdapter
    public void loadRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, @Nullable Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        log("Loading rewarded ad for key: " + thirdPartyAdPlacementId + "...");
        RewardedAdListener rewardedAdListener = new RewardedAdListener(this, thirdPartyAdPlacementId, maxRewardedAdapterListener, null);
        this.rewardedAdListener = rewardedAdListener;
        YsoNetwork.rewardedLoad(thirdPartyAdPlacementId, bidResponse, rewardedAdListener);
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedAdapter
    public void showRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, @Nullable Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log("Showing rewarded ad for key: " + thirdPartyAdPlacementId + "...");
        configureReward(maxAdapterResponseParameters);
        YsoNetwork.rewardedShow(thirdPartyAdPlacementId, this.rewardedAdListener, activity);
    }

    @Override // com.applovin.mediation.adapter.MaxAdViewAdapter
    public void loadAdViewAd(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, @Nullable Activity activity, MaxAdViewAdapterListener maxAdViewAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        log("Loading ad view ad for key: " + thirdPartyAdPlacementId + "...");
        AdViewLoadListener adViewLoadListener = new AdViewLoadListener(this, thirdPartyAdPlacementId, maxAdViewAdapterListener, activity, null);
        this.adViewLoadListener = adViewLoadListener;
        YsoNetwork.bannerLoad(thirdPartyAdPlacementId, bidResponse, adViewLoadListener);
    }

    /* renamed from: com.applovin.mediation.adapters.YsoNetworkMediationAdapter$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$ysocorp$ysonetwork$enums$YNEnumActionError;

        static {
            int[] iArr = new int[YNEnumActionError.values().length];
            $SwitchMap$com$ysocorp$ysonetwork$enums$YNEnumActionError = iArr;
            try {
                iArr[YNEnumActionError.SdkNotInitialized.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ysocorp$ysonetwork$enums$YNEnumActionError[YNEnumActionError.InvalidRequest.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ysocorp$ysonetwork$enums$YNEnumActionError[YNEnumActionError.InvalidConfig.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$ysocorp$ysonetwork$enums$YNEnumActionError[YNEnumActionError.Timeout.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$ysocorp$ysonetwork$enums$YNEnumActionError[YNEnumActionError.Load.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$ysocorp$ysonetwork$enums$YNEnumActionError[YNEnumActionError.Server.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static MaxAdapterError toMaxError(YNEnumActionError yNEnumActionError) {
        MaxAdapterError maxAdapterError = MaxAdapterError.UNSPECIFIED;
        switch (AnonymousClass1.$SwitchMap$com$ysocorp$ysonetwork$enums$YNEnumActionError[yNEnumActionError.ordinal()]) {
            case 1:
                maxAdapterError = MaxAdapterError.NOT_INITIALIZED;
                break;
            case 2:
                maxAdapterError = MaxAdapterError.BAD_REQUEST;
                break;
            case 3:
                maxAdapterError = MaxAdapterError.INVALID_CONFIGURATION;
                break;
            case 4:
                maxAdapterError = MaxAdapterError.TIMEOUT;
                break;
            case 5:
                maxAdapterError = MaxAdapterError.INVALID_LOAD_STATE;
                break;
            case 6:
                maxAdapterError = MaxAdapterError.SERVER_ERROR;
                break;
        }
        return new MaxAdapterError(maxAdapterError, yNEnumActionError.ordinal(), "");
    }

    private class InterstitialAdListener implements YsoNetwork.ActionLoad, YsoNetwork.ActionDisplay {
        private final String key;
        private final MaxInterstitialAdapterListener listener;

        /* synthetic */ InterstitialAdListener(YsoNetworkMediationAdapter ysoNetworkMediationAdapter, String str, MaxInterstitialAdapterListener maxInterstitialAdapterListener, AnonymousClass1 anonymousClass1) {
            this(str, maxInterstitialAdapterListener);
        }

        private InterstitialAdListener(String str, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
            this.key = str;
            this.listener = maxInterstitialAdapterListener;
        }

        @Override // com.ysocorp.ysonetwork.YsoNetwork.ActionLoad
        public void onLoad(YNEnumActionError yNEnumActionError) {
            if (yNEnumActionError != YNEnumActionError.None) {
                MaxAdapterError maxError = YsoNetworkMediationAdapter.toMaxError(yNEnumActionError);
                YsoNetworkMediationAdapter.this.log("Interstitial ad failed to load for key: " + this.key + " and error: " + maxError);
                this.listener.onInterstitialAdLoadFailed(maxError);
                return;
            }
            YsoNetworkMediationAdapter.this.log("Interstitial ad successfully loaded for key: " + this.key);
            this.listener.onInterstitialAdLoaded();
        }

        @Override // com.ysocorp.ysonetwork.YsoNetwork.ActionDisplay
        public void onDisplay(View view) {
            YsoNetworkMediationAdapter.this.log("Interstitial ad displayed for key: " + this.key);
            this.listener.onInterstitialAdDisplayed();
        }

        @Override // com.ysocorp.ysonetwork.YsoNetwork.ActionDisplay
        public void onClick() {
            YsoNetworkMediationAdapter.this.log("Interstitial ad clicked for key: " + this.key);
            this.listener.onInterstitialAdClicked();
        }

        @Override // com.ysocorp.ysonetwork.YsoNetwork.ActionDisplay
        public void onClose(boolean z, boolean z2) {
            if (!z) {
                YsoNetworkMediationAdapter.this.log("Interstitial ad failed to display for key: " + this.key);
                this.listener.onInterstitialAdDisplayFailed(MaxAdapterError.AD_DISPLAY_FAILED);
                return;
            }
            YsoNetworkMediationAdapter.this.log("Interstitial ad closed for key: " + this.key);
            this.listener.onInterstitialAdHidden();
        }
    }

    private class RewardedAdListener implements YsoNetwork.ActionLoad, YsoNetwork.ActionDisplay {
        private final String key;
        private final MaxRewardedAdapterListener listener;

        /* synthetic */ RewardedAdListener(YsoNetworkMediationAdapter ysoNetworkMediationAdapter, String str, MaxRewardedAdapterListener maxRewardedAdapterListener, AnonymousClass1 anonymousClass1) {
            this(str, maxRewardedAdapterListener);
        }

        private RewardedAdListener(String str, MaxRewardedAdapterListener maxRewardedAdapterListener) {
            this.key = str;
            this.listener = maxRewardedAdapterListener;
        }

        @Override // com.ysocorp.ysonetwork.YsoNetwork.ActionLoad
        public void onLoad(YNEnumActionError yNEnumActionError) {
            if (yNEnumActionError != YNEnumActionError.None) {
                MaxAdapterError maxError = YsoNetworkMediationAdapter.toMaxError(yNEnumActionError);
                YsoNetworkMediationAdapter.this.log("Rewarded ad failed to load for key: " + this.key + " and error: " + maxError);
                this.listener.onRewardedAdLoadFailed(maxError);
                return;
            }
            YsoNetworkMediationAdapter.this.log("Rewarded ad successfully loaded for key: " + this.key);
            this.listener.onRewardedAdLoaded();
        }

        @Override // com.ysocorp.ysonetwork.YsoNetwork.ActionDisplay
        public void onDisplay(View view) {
            YsoNetworkMediationAdapter.this.log("Rewarded ad displayed for key: " + this.key);
            this.listener.onRewardedAdDisplayed();
        }

        @Override // com.ysocorp.ysonetwork.YsoNetwork.ActionDisplay
        public void onClick() {
            YsoNetworkMediationAdapter.this.log("Rewarded ad clicked for key: " + this.key);
            this.listener.onRewardedAdClicked();
        }

        @Override // com.ysocorp.ysonetwork.YsoNetwork.ActionDisplay
        public void onClose(boolean z, boolean z2) {
            if (!z) {
                YsoNetworkMediationAdapter.this.log("Rewarded ad failed to display for key: " + this.key);
                this.listener.onRewardedAdDisplayFailed(MaxAdapterError.AD_DISPLAY_FAILED);
                return;
            }
            if (z2 || YsoNetworkMediationAdapter.this.shouldAlwaysRewardUser()) {
                YsoNetworkMediationAdapter.this.log("User was rewarded for key: " + this.key);
                this.listener.onUserRewarded(YsoNetworkMediationAdapter.this.getReward());
            }
            YsoNetworkMediationAdapter.this.log("Rewarded ad closed for key: " + this.key);
            this.listener.onRewardedAdHidden();
        }
    }

    private class AdViewLoadListener implements YsoNetwork.ActionLoad {
        private final Activity activity;
        private final String key;
        private final MaxAdViewAdapterListener listener;

        /* synthetic */ AdViewLoadListener(YsoNetworkMediationAdapter ysoNetworkMediationAdapter, String str, MaxAdViewAdapterListener maxAdViewAdapterListener, Activity activity, AnonymousClass1 anonymousClass1) {
            this(str, maxAdViewAdapterListener, activity);
        }

        private AdViewLoadListener(String str, MaxAdViewAdapterListener maxAdViewAdapterListener, @Nullable Activity activity) {
            this.key = str;
            this.listener = maxAdViewAdapterListener;
            this.activity = activity;
        }

        @Override // com.ysocorp.ysonetwork.YsoNetwork.ActionLoad
        public void onLoad(YNEnumActionError yNEnumActionError) {
            if (yNEnumActionError != YNEnumActionError.None) {
                MaxAdapterError maxError = YsoNetworkMediationAdapter.toMaxError(yNEnumActionError);
                YsoNetworkMediationAdapter.this.log("Ad view ad failed to load for key: " + this.key + " and error: " + maxError);
                this.listener.onAdViewAdLoadFailed(maxError);
                return;
            }
            YsoNetworkMediationAdapter.this.log("Ad view ad successfully loaded for key: " + this.key);
            YsoNetworkMediationAdapter.this.log("Showing ad view ad for key: " + this.key);
            YsoNetworkMediationAdapter ysoNetworkMediationAdapter = YsoNetworkMediationAdapter.this;
            ysoNetworkMediationAdapter.adViewShowListener = new AdViewShowListener(ysoNetworkMediationAdapter, this.key, this.listener, null);
            YsoNetwork.bannerShow(this.key, YsoNetworkMediationAdapter.this.adViewShowListener, this.activity);
        }
    }

    private class AdViewShowListener implements YsoNetwork.ActionDisplay {
        private final String key;
        private final MaxAdViewAdapterListener listener;

        /* synthetic */ AdViewShowListener(YsoNetworkMediationAdapter ysoNetworkMediationAdapter, String str, MaxAdViewAdapterListener maxAdViewAdapterListener, AnonymousClass1 anonymousClass1) {
            this(str, maxAdViewAdapterListener);
        }

        private AdViewShowListener(String str, MaxAdViewAdapterListener maxAdViewAdapterListener) {
            this.key = str;
            this.listener = maxAdViewAdapterListener;
        }

        @Override // com.ysocorp.ysonetwork.YsoNetwork.ActionDisplay
        public void onDisplay(View view) {
            YsoNetworkMediationAdapter.this.log("Ad view ad displayed for key: " + this.key);
            this.listener.onAdViewAdLoaded(view);
            this.listener.onAdViewAdDisplayed();
        }

        @Override // com.ysocorp.ysonetwork.YsoNetwork.ActionDisplay
        public void onClick() {
            YsoNetworkMediationAdapter.this.log("Ad view ad clicked for key: " + this.key);
            this.listener.onAdViewAdClicked();
        }

        @Override // com.ysocorp.ysonetwork.YsoNetwork.ActionDisplay
        public void onClose(boolean z, boolean z2) {
            if (!z) {
                YsoNetworkMediationAdapter.this.log("Ad view ad failed to display for key: " + this.key);
                return;
            }
            YsoNetworkMediationAdapter.this.log("Ad view ad closed for key: " + this.key);
        }
    }
}
