package com.applovin.mediation.adapters;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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
import com.applovin.mediation.adapters.line.BuildConfig;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.five_corp.ad.AdLoader;
import com.five_corp.ad.AdSlotConfig;
import com.five_corp.ad.BidData;
import com.five_corp.ad.FiveAdConfig;
import com.five_corp.ad.FiveAdCustomLayout;
import com.five_corp.ad.FiveAdCustomLayoutEventListener;
import com.five_corp.ad.FiveAdErrorCode;
import com.five_corp.ad.FiveAdInterstitial;
import com.five_corp.ad.FiveAdInterstitialEventListener;
import com.five_corp.ad.FiveAdNative;
import com.five_corp.ad.FiveAdNativeEventListener;
import com.five_corp.ad.FiveAdVideoReward;
import com.five_corp.ad.FiveAdVideoRewardEventListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class LineMediationAdapter extends MediationAdapterBase implements MaxSignalProvider, MaxInterstitialAdapter, MaxRewardedAdapter, MaxAdViewAdapter {
    private FiveAdCustomLayout adView;
    private AdViewListener adViewListener;
    private FiveAdInterstitial interstitialAd;
    private InterstitialListener interstitialListener;
    private FiveAdNative nativeAd;
    private NativeAdListener nativeAdListener;
    private NativeAdViewListener nativeAdViewListener;
    private FiveAdVideoReward rewardedAd;
    private RewardedListener rewardedListener;

    public LineMediationAdapter(AppLovinSdk appLovinSdk) {
        super(appLovinSdk);
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public String getSdkVersion() {
        return AdLoader.getSemanticVersion();
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public String getAdapterVersion() {
        return BuildConfig.VERSION_NAME;
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, @Nullable Activity activity, MaxAdapter.OnCompletionListener onCompletionListener) {
        onCompletionListener.onCompletion(MaxAdapter.InitializationStatus.DOES_NOT_APPLY, null);
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public void onDestroy() {
        this.interstitialAd = null;
        this.rewardedAd = null;
        this.adView = null;
        this.nativeAd = null;
        this.interstitialListener = null;
        this.rewardedListener = null;
        this.adViewListener = null;
        this.nativeAdViewListener = null;
        this.nativeAdListener = null;
    }

    @Override // com.applovin.mediation.adapter.MaxSignalProvider
    public void collectSignal(MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, Activity activity, final MaxSignalCollectionListener maxSignalCollectionListener) {
        log("Collecting signal...");
        String adUnitId = maxAdapterSignalCollectionParameters.getAdUnitId();
        if (TextUtils.isEmpty(adUnitId)) {
            log("Signal collection failed with error: invalid ad unit id");
            maxSignalCollectionListener.onSignalCollectionFailed("invalid ad unit id");
            return;
        }
        final String string = BundleUtils.getBundle("placement_ids", Bundle.EMPTY, maxAdapterSignalCollectionParameters.getServerParameters()).getString(adUnitId);
        if (TextUtils.isEmpty(string)) {
            log("Signal collection failed with error: invalid slot id");
            maxSignalCollectionListener.onSignalCollectionFailed("invalid slot id");
        } else {
            retrieveAdLoader(maxAdapterSignalCollectionParameters, getContext(activity)).collectSignal(string, new AdLoader.CollectSignalCallback() { // from class: com.applovin.mediation.adapters.LineMediationAdapter.1
                @Override // com.five_corp.ad.AdLoader.CollectSignalCallback
                public void onCollect(@NonNull String str) {
                    LineMediationAdapter.this.log("Signal collection successful");
                    maxSignalCollectionListener.onSignalCollected(str);
                }

                @Override // com.five_corp.ad.AdLoader.CollectSignalCallback
                public void onError(@NonNull FiveAdErrorCode fiveAdErrorCode) {
                    LineMediationAdapter.this.log("Signal collection failed for " + string + " with error : " + fiveAdErrorCode);
                    maxSignalCollectionListener.onSignalCollectionFailed(fiveAdErrorCode.name());
                }
            });
        }
    }

    @Override // com.applovin.mediation.adapter.MaxInterstitialAdapter
    public void loadInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, @Nullable Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        boolean isValidString = AppLovinSdkUtils.isValidString(bidResponse);
        StringBuilder sb = new StringBuilder();
        sb.append("Loading ");
        sb.append(isValidString ? "bidding " : "");
        sb.append("interstitial ad for slot id: ");
        sb.append(thirdPartyAdPlacementId);
        sb.append("...");
        log(sb.toString());
        this.interstitialListener = new InterstitialListener(maxInterstitialAdapterListener);
        if (isValidString) {
            retrieveAdLoader(maxAdapterResponseParameters, getContext(activity)).loadInterstitialAd(new BidData(bidResponse, null), this.interstitialListener);
        } else {
            retrieveAdLoader(maxAdapterResponseParameters, getContext(activity)).loadInterstitialAd(new AdSlotConfig(thirdPartyAdPlacementId), this.interstitialListener);
        }
    }

    @Override // com.applovin.mediation.adapter.MaxInterstitialAdapter
    public void showInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, @Nullable Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log("Showing interstitial ad for slot id: " + thirdPartyAdPlacementId + "...");
        FiveAdInterstitial fiveAdInterstitial = this.interstitialAd;
        if (fiveAdInterstitial == null) {
            log("Interstitial ad failed to show for slot id: " + thirdPartyAdPlacementId + " - no ad loaded");
            MaxAdapterError maxAdapterError = MaxAdapterError.AD_DISPLAY_FAILED;
            MaxAdapterError maxAdapterError2 = MaxAdapterError.AD_NOT_READY;
            maxInterstitialAdapterListener.onInterstitialAdDisplayFailed(new MaxAdapterError(maxAdapterError, maxAdapterError2.getCode(), maxAdapterError2.getMessage()));
            return;
        }
        fiveAdInterstitial.setEventListener(this.interstitialListener);
        this.interstitialAd.showAd();
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedAdapter
    public void loadRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, @Nullable Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        boolean isValidString = AppLovinSdkUtils.isValidString(bidResponse);
        StringBuilder sb = new StringBuilder();
        sb.append("Loading ");
        sb.append(isValidString ? "bidding " : "");
        sb.append("rewarded ad for slot id: ");
        sb.append(thirdPartyAdPlacementId);
        sb.append("...");
        log(sb.toString());
        this.rewardedListener = new RewardedListener(maxRewardedAdapterListener);
        if (isValidString) {
            retrieveAdLoader(maxAdapterResponseParameters, getContext(activity)).loadRewardAd(new BidData(bidResponse, null), this.rewardedListener);
        } else {
            retrieveAdLoader(maxAdapterResponseParameters, getContext(activity)).loadRewardAd(new AdSlotConfig(thirdPartyAdPlacementId), this.rewardedListener);
        }
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedAdapter
    public void showRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, @Nullable Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log("Showing rewarded ad for slot id: " + thirdPartyAdPlacementId + "...");
        if (this.rewardedAd == null) {
            log("Rewarded ad failed to show for slot id: " + thirdPartyAdPlacementId + " - no ad loaded");
            MaxAdapterError maxAdapterError = MaxAdapterError.AD_DISPLAY_FAILED;
            MaxAdapterError maxAdapterError2 = MaxAdapterError.AD_NOT_READY;
            maxRewardedAdapterListener.onRewardedAdDisplayFailed(new MaxAdapterError(maxAdapterError, maxAdapterError2.getCode(), maxAdapterError2.getMessage()));
            return;
        }
        configureReward(maxAdapterResponseParameters);
        this.rewardedAd.setEventListener(this.rewardedListener);
        this.rewardedAd.showAd();
    }

    @Override // com.applovin.mediation.adapter.MaxAdViewAdapter
    public void loadAdViewAd(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, @Nullable Activity activity, MaxAdViewAdapterListener maxAdViewAdapterListener) {
        boolean z = maxAdapterResponseParameters.getServerParameters().getBoolean("is_native");
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        boolean isValidString = AppLovinSdkUtils.isValidString(bidResponse);
        StringBuilder sb = new StringBuilder();
        sb.append("Loading ");
        sb.append(isValidString ? "bidding " : "");
        sb.append(z ? "native " : "");
        sb.append(maxAdFormat.getLabel());
        sb.append(" ad for slot id: ");
        sb.append(thirdPartyAdPlacementId);
        sb.append("...");
        log(sb.toString());
        if (z) {
            this.nativeAdViewListener = new NativeAdViewListener(maxAdViewAdapterListener, maxAdFormat, maxAdapterResponseParameters.getServerParameters());
            if (isValidString) {
                retrieveAdLoader(maxAdapterResponseParameters, getContext(activity)).loadNativeAd(new BidData(bidResponse, null), new DisplayMetrics().widthPixels, this.nativeAdViewListener);
                return;
            } else {
                retrieveAdLoader(maxAdapterResponseParameters, getContext(activity)).loadNativeAd(new AdSlotConfig(thirdPartyAdPlacementId), new DisplayMetrics().widthPixels, this.nativeAdViewListener);
                return;
            }
        }
        this.adViewListener = new AdViewListener(maxAdViewAdapterListener, maxAdFormat);
        if (isValidString) {
            retrieveAdLoader(maxAdapterResponseParameters, getContext(activity)).loadBannerAd(new BidData(bidResponse, null), new DisplayMetrics().widthPixels, this.adViewListener);
        } else {
            retrieveAdLoader(maxAdapterResponseParameters, getContext(activity)).loadBannerAd(new AdSlotConfig(thirdPartyAdPlacementId), new DisplayMetrics().widthPixels, this.adViewListener);
        }
    }

    @Override // com.applovin.mediation.adapters.MediationAdapterBase, com.applovin.mediation.adapter.MaxNativeAdAdapter
    public void loadNativeAd(MaxAdapterResponseParameters maxAdapterResponseParameters, @Nullable Activity activity, MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        boolean isValidString = AppLovinSdkUtils.isValidString(bidResponse);
        StringBuilder sb = new StringBuilder();
        sb.append("Loading ");
        sb.append(isValidString ? "bidding " : "");
        sb.append("native ad for slot id: ");
        sb.append(thirdPartyAdPlacementId);
        sb.append("...");
        log(sb.toString());
        this.nativeAdListener = new NativeAdListener(maxNativeAdAdapterListener, maxAdapterResponseParameters.getServerParameters());
        if (isValidString) {
            retrieveAdLoader(maxAdapterResponseParameters, getContext(activity)).loadNativeAd(new BidData(bidResponse, null), this.nativeAdListener);
        } else {
            retrieveAdLoader(maxAdapterResponseParameters, getContext(activity)).loadNativeAd(new AdSlotConfig(thirdPartyAdPlacementId), new DisplayMetrics().widthPixels, this.nativeAdListener);
        }
    }

    private Context getContext(@Nullable Activity activity) {
        return activity != null ? activity.getApplicationContext() : getApplicationContext();
    }

    private AdLoader retrieveAdLoader(MaxAdapterParameters maxAdapterParameters, Context context) {
        AdLoader forConfig = AdLoader.forConfig(context, getConfigFromParameters(maxAdapterParameters));
        if (forConfig != null) {
            return forConfig;
        }
        throw new IllegalStateException("Failed to retrieve ad loader for ad unit id: " + maxAdapterParameters.getAdUnitId());
    }

    private FiveAdConfig getConfigFromParameters(MaxAdapterParameters maxAdapterParameters) {
        FiveAdConfig fiveAdConfig = new FiveAdConfig(maxAdapterParameters.getServerParameters().getString("app_id"));
        fiveAdConfig.isTest = maxAdapterParameters.isTesting();
        updateMuteState(maxAdapterParameters.getServerParameters(), fiveAdConfig);
        return fiveAdConfig;
    }

    private static void updateMuteState(Bundle bundle, FiveAdConfig fiveAdConfig) {
        if (bundle.containsKey("is_muted")) {
            fiveAdConfig.enableSoundByDefault(!bundle.getBoolean("is_muted"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static MaxAdapterError toMaxError(FiveAdErrorCode fiveAdErrorCode) {
        MaxAdapterError maxAdapterError = MaxAdapterError.UNSPECIFIED;
        String str = "Unspecified.";
        switch (AnonymousClass2.$SwitchMap$com$five_corp$ad$FiveAdErrorCode[fiveAdErrorCode.ordinal()]) {
            case 1:
                maxAdapterError = MaxAdapterError.NO_CONNECTION;
                str = "Please try again in a stable network environment.";
                break;
            case 2:
                maxAdapterError = MaxAdapterError.NO_FILL;
                str = "Ad was not ready at display time. Please try again.";
                break;
            case 3:
                maxAdapterError = MaxAdapterError.INVALID_CONFIGURATION;
                str = "Check if the OS type, PackageName, and issued AppID registered in FIVE Dashboard and the application settings match. Please be careful about blanks.";
                break;
            case 4:
                str = "There is a problem with the device storage. Please try again with another device.";
                break;
            case 5:
                maxAdapterError = MaxAdapterError.INTERNAL_ERROR;
                break;
            case 6:
                maxAdapterError = MaxAdapterError.INVALID_LOAD_STATE;
                str = "There is a problem with the implementation. Please check the following. Whether the initialization process (FiveAd.initialize) is executed before the creation of the ad object or loadAdAsync. Are you calling loadAdAsync multiple times for one ad object?";
                break;
            case 7:
                maxAdapterError = MaxAdapterError.INVALID_CONFIGURATION;
                str = "Make sure you are using the SlotID issued on the FIVE Dashboard.";
                break;
        }
        return new MaxAdapterError(maxAdapterError, fiveAdErrorCode.ordinal(), str);
    }

    /* renamed from: com.applovin.mediation.adapters.LineMediationAdapter$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$five_corp$ad$FiveAdErrorCode;

        static {
            int[] iArr = new int[FiveAdErrorCode.values().length];
            $SwitchMap$com$five_corp$ad$FiveAdErrorCode = iArr;
            try {
                iArr[FiveAdErrorCode.NETWORK_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$five_corp$ad$FiveAdErrorCode[FiveAdErrorCode.NO_AD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$five_corp$ad$FiveAdErrorCode[FiveAdErrorCode.BAD_APP_ID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$five_corp$ad$FiveAdErrorCode[FiveAdErrorCode.STORAGE_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$five_corp$ad$FiveAdErrorCode[FiveAdErrorCode.INTERNAL_ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$five_corp$ad$FiveAdErrorCode[FiveAdErrorCode.INVALID_STATE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$five_corp$ad$FiveAdErrorCode[FiveAdErrorCode.BAD_SLOT_ID.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$five_corp$ad$FiveAdErrorCode[FiveAdErrorCode.SUPPRESSED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$five_corp$ad$FiveAdErrorCode[FiveAdErrorCode.PLAYER_ERROR.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    private class InterstitialListener implements AdLoader.LoadInterstitialAdCallback, FiveAdInterstitialEventListener {
        private final MaxInterstitialAdapterListener listener;

        InterstitialListener(MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
            this.listener = maxInterstitialAdapterListener;
        }

        @Override // com.five_corp.ad.AdLoader.LoadInterstitialAdCallback
        public void onLoad(@NonNull FiveAdInterstitial fiveAdInterstitial) {
            LineMediationAdapter.this.log("Interstitial ad loaded for slot id: " + fiveAdInterstitial.getSlotId() + "...");
            LineMediationAdapter.this.interstitialAd = fiveAdInterstitial;
            this.listener.onInterstitialAdLoaded();
        }

        @Override // com.five_corp.ad.AdLoader.LoadInterstitialAdCallback
        public void onError(@NonNull FiveAdErrorCode fiveAdErrorCode) {
            LineMediationAdapter.this.log("Interstitial ad failed to load with error: " + fiveAdErrorCode);
            this.listener.onInterstitialAdLoadFailed(LineMediationAdapter.toMaxError(fiveAdErrorCode));
        }

        @Override // com.five_corp.ad.FiveAdInterstitialEventListener
        public void onViewError(FiveAdInterstitial fiveAdInterstitial, FiveAdErrorCode fiveAdErrorCode) {
            LineMediationAdapter.this.log("Interstitial ad failed to show for slot id: " + fiveAdInterstitial.getSlotId() + " with error: " + fiveAdErrorCode);
            this.listener.onInterstitialAdDisplayFailed(new MaxAdapterError(MaxAdapterError.AD_DISPLAY_FAILED, fiveAdErrorCode.value, "Please Contact Us"));
        }

        @Override // com.five_corp.ad.FiveAdInterstitialEventListener
        public void onImpression(FiveAdInterstitial fiveAdInterstitial) {
            LineMediationAdapter.this.log("Interstitial ad impression tracked for slot id: " + fiveAdInterstitial.getSlotId() + "...");
            this.listener.onInterstitialAdDisplayed();
        }

        @Override // com.five_corp.ad.FiveAdInterstitialEventListener
        public void onClick(FiveAdInterstitial fiveAdInterstitial) {
            LineMediationAdapter.this.log("Interstitial ad clicked for slot id: " + fiveAdInterstitial.getSlotId() + "...");
            this.listener.onInterstitialAdClicked();
        }

        @Override // com.five_corp.ad.FiveAdInterstitialEventListener
        public void onFullScreenClose(FiveAdInterstitial fiveAdInterstitial) {
            LineMediationAdapter.this.log("Interstitial ad hidden for slot id: " + fiveAdInterstitial.getSlotId() + "...");
            this.listener.onInterstitialAdHidden();
        }

        @Override // com.five_corp.ad.FiveAdInterstitialEventListener
        public void onFullScreenOpen(FiveAdInterstitial fiveAdInterstitial) {
            LineMediationAdapter.this.log("Interstitial ad shown for slot id: " + fiveAdInterstitial.getSlotId() + "...");
        }

        @Override // com.five_corp.ad.FiveAdInterstitialEventListener
        public void onPlay(FiveAdInterstitial fiveAdInterstitial) {
            LineMediationAdapter.this.log("Interstitial ad did play for slot id: " + fiveAdInterstitial.getSlotId() + "...");
        }

        @Override // com.five_corp.ad.FiveAdInterstitialEventListener
        public void onPause(FiveAdInterstitial fiveAdInterstitial) {
            LineMediationAdapter.this.log("Interstitial ad did pause for slot id: " + fiveAdInterstitial.getSlotId() + "...");
        }

        @Override // com.five_corp.ad.FiveAdInterstitialEventListener
        public void onViewThrough(FiveAdInterstitial fiveAdInterstitial) {
            LineMediationAdapter.this.log("Interstitial ad completed for slot id: " + fiveAdInterstitial.getSlotId() + "...");
        }
    }

    private class RewardedListener implements AdLoader.LoadRewardAdCallback, FiveAdVideoRewardEventListener {
        private boolean hasGrantedReward;
        private final MaxRewardedAdapterListener listener;

        RewardedListener(MaxRewardedAdapterListener maxRewardedAdapterListener) {
            this.listener = maxRewardedAdapterListener;
        }

        @Override // com.five_corp.ad.AdLoader.LoadRewardAdCallback
        public void onLoad(@NonNull FiveAdVideoReward fiveAdVideoReward) {
            LineMediationAdapter.this.log("Rewarded ad loaded for slot id: " + fiveAdVideoReward.getSlotId() + "...");
            LineMediationAdapter.this.rewardedAd = fiveAdVideoReward;
            this.listener.onRewardedAdLoaded();
        }

        @Override // com.five_corp.ad.AdLoader.LoadRewardAdCallback
        public void onError(@NonNull FiveAdErrorCode fiveAdErrorCode) {
            LineMediationAdapter.this.log("Rewarded ad failed to load with error: " + fiveAdErrorCode);
            this.listener.onRewardedAdLoadFailed(LineMediationAdapter.toMaxError(fiveAdErrorCode));
        }

        @Override // com.five_corp.ad.FiveAdVideoRewardEventListener
        public void onViewError(FiveAdVideoReward fiveAdVideoReward, FiveAdErrorCode fiveAdErrorCode) {
            LineMediationAdapter.this.log("Rewarded ad failed to show for slot id: " + fiveAdVideoReward.getSlotId() + " with error: " + fiveAdErrorCode);
            this.listener.onRewardedAdDisplayFailed(new MaxAdapterError(MaxAdapterError.AD_DISPLAY_FAILED, fiveAdErrorCode.value, "Please Contact Us"));
        }

        @Override // com.five_corp.ad.FiveAdVideoRewardEventListener
        public void onImpression(FiveAdVideoReward fiveAdVideoReward) {
            LineMediationAdapter.this.log("Rewarded ad impression tracked for slot id: " + fiveAdVideoReward.getSlotId() + "...");
            this.listener.onRewardedAdDisplayed();
        }

        @Override // com.five_corp.ad.FiveAdVideoRewardEventListener
        public void onClick(FiveAdVideoReward fiveAdVideoReward) {
            LineMediationAdapter.this.log("Rewarded ad clicked for slot id: " + fiveAdVideoReward.getSlotId() + "...");
            this.listener.onRewardedAdClicked();
        }

        @Override // com.five_corp.ad.FiveAdVideoRewardEventListener
        public void onFullScreenClose(FiveAdVideoReward fiveAdVideoReward) {
            if (this.hasGrantedReward || LineMediationAdapter.this.shouldAlwaysRewardUser()) {
                MaxReward reward = LineMediationAdapter.this.getReward();
                LineMediationAdapter.this.log("Rewarded ad user with reward: " + reward + " for slot id: " + fiveAdVideoReward.getSlotId() + "...");
                this.listener.onUserRewarded(reward);
            }
            LineMediationAdapter.this.log("Rewarded ad hidden for slot id: " + fiveAdVideoReward.getSlotId() + "...");
            this.listener.onRewardedAdHidden();
        }

        @Override // com.five_corp.ad.FiveAdVideoRewardEventListener
        public void onFullScreenOpen(FiveAdVideoReward fiveAdVideoReward) {
            LineMediationAdapter.this.log("Rewarded ad shown for slot id: " + fiveAdVideoReward.getSlotId() + "...");
        }

        @Override // com.five_corp.ad.FiveAdVideoRewardEventListener
        public void onPlay(FiveAdVideoReward fiveAdVideoReward) {
            LineMediationAdapter.this.log("Rewarded ad did play for slot id: " + fiveAdVideoReward.getSlotId() + "...");
        }

        @Override // com.five_corp.ad.FiveAdVideoRewardEventListener
        public void onPause(FiveAdVideoReward fiveAdVideoReward) {
            LineMediationAdapter.this.log("Rewarded ad did pause for slot id: " + fiveAdVideoReward.getSlotId() + "...");
        }

        @Override // com.five_corp.ad.FiveAdVideoRewardEventListener
        public void onViewThrough(FiveAdVideoReward fiveAdVideoReward) {
            LineMediationAdapter.this.log("Rewarded ad completed for slot id: " + fiveAdVideoReward.getSlotId() + "...");
        }

        @Override // com.five_corp.ad.FiveAdVideoRewardEventListener
        public void onReward(FiveAdVideoReward fiveAdVideoReward) {
            LineMediationAdapter.this.log("Rewarded ad granted reward for slot id: " + fiveAdVideoReward.getSlotId());
            this.hasGrantedReward = true;
        }
    }

    private class AdViewListener implements AdLoader.LoadBannerAdCallback, FiveAdCustomLayoutEventListener {
        private final MaxAdFormat adFormat;
        private final MaxAdViewAdapterListener listener;

        AdViewListener(MaxAdViewAdapterListener maxAdViewAdapterListener, MaxAdFormat maxAdFormat) {
            this.listener = maxAdViewAdapterListener;
            this.adFormat = maxAdFormat;
        }

        @Override // com.five_corp.ad.AdLoader.LoadBannerAdCallback
        public void onLoad(FiveAdCustomLayout fiveAdCustomLayout) {
            LineMediationAdapter.this.log(this.adFormat.getLabel() + " ad loaded for slot id: " + fiveAdCustomLayout.getSlotId() + "...");
            LineMediationAdapter.this.adView = fiveAdCustomLayout;
            LineMediationAdapter.this.adView.setEventListener(LineMediationAdapter.this.adViewListener);
            LineMediationAdapter.this.adView.enableSound(false);
            this.listener.onAdViewAdLoaded(LineMediationAdapter.this.adView);
        }

        @Override // com.five_corp.ad.AdLoader.LoadBannerAdCallback
        public void onError(FiveAdErrorCode fiveAdErrorCode) {
            LineMediationAdapter.this.log(this.adFormat.getLabel() + " ad failed to load with error: " + fiveAdErrorCode);
            this.listener.onAdViewAdLoadFailed(LineMediationAdapter.toMaxError(fiveAdErrorCode));
        }

        @Override // com.five_corp.ad.FiveAdCustomLayoutEventListener
        public void onViewError(FiveAdCustomLayout fiveAdCustomLayout, FiveAdErrorCode fiveAdErrorCode) {
            LineMediationAdapter.this.log(this.adFormat.getLabel() + " ad failed to show for slot id: " + fiveAdCustomLayout.getSlotId() + " with error: " + fiveAdErrorCode);
            this.listener.onAdViewAdDisplayFailed(new MaxAdapterError(MaxAdapterError.AD_DISPLAY_FAILED, fiveAdErrorCode.value, "Please Contact Us"));
        }

        @Override // com.five_corp.ad.FiveAdCustomLayoutEventListener
        public void onImpression(FiveAdCustomLayout fiveAdCustomLayout) {
            LineMediationAdapter.this.log(this.adFormat.getLabel() + " ad impression tracked for slot id: " + fiveAdCustomLayout.getSlotId() + "...");
            this.listener.onAdViewAdDisplayed();
        }

        @Override // com.five_corp.ad.FiveAdCustomLayoutEventListener
        public void onClick(FiveAdCustomLayout fiveAdCustomLayout) {
            LineMediationAdapter.this.log(this.adFormat.getLabel() + " ad clicked for slot id: " + fiveAdCustomLayout.getSlotId() + "...");
            this.listener.onAdViewAdClicked();
        }

        @Override // com.five_corp.ad.FiveAdCustomLayoutEventListener
        public void onRemove(FiveAdCustomLayout fiveAdCustomLayout) {
            LineMediationAdapter.this.log(this.adFormat.getLabel() + " ad hidden for slot id: " + fiveAdCustomLayout.getSlotId() + "...");
            this.listener.onAdViewAdHidden();
        }

        @Override // com.five_corp.ad.FiveAdCustomLayoutEventListener
        public void onPlay(FiveAdCustomLayout fiveAdCustomLayout) {
            LineMediationAdapter.this.log(this.adFormat.getLabel() + " ad did play for slot id: " + fiveAdCustomLayout.getSlotId() + "...");
        }

        @Override // com.five_corp.ad.FiveAdCustomLayoutEventListener
        public void onPause(FiveAdCustomLayout fiveAdCustomLayout) {
            LineMediationAdapter.this.log(this.adFormat.getLabel() + " ad did pause for slot id: " + fiveAdCustomLayout.getSlotId() + "...");
        }

        @Override // com.five_corp.ad.FiveAdCustomLayoutEventListener
        public void onViewThrough(FiveAdCustomLayout fiveAdCustomLayout) {
            LineMediationAdapter.this.log(this.adFormat.getLabel() + " ad completed for slot id: " + fiveAdCustomLayout.getSlotId() + "...");
        }
    }

    private class NativeAdViewListener implements AdLoader.LoadNativeAdCallback, FiveAdNativeEventListener {
        private final MaxAdFormat adFormat;
        private final MaxAdViewAdapterListener listener;
        private final Bundle serverParameters;

        NativeAdViewListener(MaxAdViewAdapterListener maxAdViewAdapterListener, MaxAdFormat maxAdFormat, Bundle bundle) {
            this.listener = maxAdViewAdapterListener;
            this.adFormat = maxAdFormat;
            this.serverParameters = bundle;
        }

        @Override // com.five_corp.ad.AdLoader.LoadNativeAdCallback
        public void onLoad(FiveAdNative fiveAdNative) {
            LineMediationAdapter.this.log("Native " + this.adFormat.getLabel() + " ad loaded for slot id: " + fiveAdNative.getSlotId() + "...");
            if (LineMediationAdapter.this.nativeAd != null) {
                LineMediationAdapter.this.nativeAd = fiveAdNative;
                LineMediationAdapter.this.nativeAd.setEventListener(LineMediationAdapter.this.nativeAdViewListener);
                LineMediationAdapter.this.nativeAd.enableSound(false);
                renderCustomNativeBanner(fiveAdNative.getSlotId());
                return;
            }
            LineMediationAdapter.this.log("Native " + this.adFormat.getLabel() + " ad failed to load: no fill for slot id: " + fiveAdNative.getSlotId() + "...");
            this.listener.onAdViewAdLoadFailed(MaxAdapterError.NO_FILL);
        }

        @Override // com.five_corp.ad.AdLoader.LoadNativeAdCallback
        public void onError(FiveAdErrorCode fiveAdErrorCode) {
            LineMediationAdapter.this.log("Native " + this.adFormat.getLabel() + " ad failed to load with error: " + fiveAdErrorCode);
            this.listener.onAdViewAdLoadFailed(LineMediationAdapter.toMaxError(fiveAdErrorCode));
        }

        @Override // com.five_corp.ad.FiveAdNativeEventListener
        public void onViewError(FiveAdNative fiveAdNative, FiveAdErrorCode fiveAdErrorCode) {
            LineMediationAdapter.this.log("Native " + this.adFormat.getLabel() + " ad failed to show for slot id: " + fiveAdNative.getSlotId() + " with error: " + fiveAdErrorCode);
            this.listener.onAdViewAdDisplayFailed(new MaxAdapterError(MaxAdapterError.AD_DISPLAY_FAILED, fiveAdErrorCode.value, "Please Contact Us"));
        }

        @Override // com.five_corp.ad.FiveAdNativeEventListener
        public void onImpression(FiveAdNative fiveAdNative) {
            LineMediationAdapter.this.log("Native " + this.adFormat.getLabel() + " ad impression tracked for slot id: " + fiveAdNative.getSlotId() + "...");
            this.listener.onAdViewAdDisplayed();
        }

        @Override // com.five_corp.ad.FiveAdNativeEventListener
        public void onClick(FiveAdNative fiveAdNative) {
            LineMediationAdapter.this.log("Native " + this.adFormat.getLabel() + " ad clicked for slot id: " + fiveAdNative.getSlotId());
            this.listener.onAdViewAdClicked();
        }

        @Override // com.five_corp.ad.FiveAdNativeEventListener
        public void onRemove(FiveAdNative fiveAdNative) {
            LineMediationAdapter.this.log("Native " + this.adFormat.getLabel() + " ad hidden for slot id: " + fiveAdNative.getSlotId() + "...");
            this.listener.onAdViewAdHidden();
        }

        @Override // com.five_corp.ad.FiveAdNativeEventListener
        public void onPlay(FiveAdNative fiveAdNative) {
            LineMediationAdapter.this.log("Native " + this.adFormat.getLabel() + " ad did play for slot id: " + fiveAdNative.getSlotId() + "...");
        }

        @Override // com.five_corp.ad.FiveAdNativeEventListener
        public void onPause(FiveAdNative fiveAdNative) {
            LineMediationAdapter.this.log("Native " + this.adFormat.getLabel() + " ad did pause for slot id: " + fiveAdNative.getSlotId() + "...");
        }

        @Override // com.five_corp.ad.FiveAdNativeEventListener
        public void onViewThrough(FiveAdNative fiveAdNative) {
            LineMediationAdapter.this.log("Native " + this.adFormat.getLabel() + " ad completed for slot id: " + fiveAdNative.getSlotId() + "...");
        }

        private void renderCustomNativeBanner(final String str) {
            LineMediationAdapter.this.nativeAd.loadIconImageAsync(new FiveAdNative.LoadImageCallback() { // from class: com.applovin.mediation.adapters.LineMediationAdapter.NativeAdViewListener.1
                @Override // com.five_corp.ad.FiveAdNative.LoadImageCallback
                public void onImageLoad(final Bitmap bitmap) {
                    AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.mediation.adapters.LineMediationAdapter.NativeAdViewListener.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            MaxNativeAdView maxNativeAdView;
                            FiveAdNative fiveAdNative = LineMediationAdapter.this.nativeAd;
                            if (fiveAdNative == null) {
                                LineMediationAdapter.this.log("Native " + NativeAdViewListener.this.adFormat.getLabel() + " ad destroyed before assets finished load for slot id: " + str);
                                return;
                            }
                            MaxNativeAd build = new MaxNativeAd.Builder().setAdFormat(NativeAdViewListener.this.adFormat).setTitle(fiveAdNative.getAdTitle()).setBody(fiveAdNative.getDescriptionText()).setCallToAction(fiveAdNative.getButtonText()).setIcon(new MaxNativeAd.MaxNativeAdImage(new BitmapDrawable(LineMediationAdapter.this.getApplicationContext().getResources(), bitmap))).setMediaView(fiveAdNative.getAdMainView()).build();
                            String string = BundleUtils.getString("template", "", NativeAdViewListener.this.serverParameters);
                            if ("vertical".equals(string)) {
                                maxNativeAdView = new MaxNativeAdView(build, NativeAdViewListener.this.adFormat == MaxAdFormat.LEADER ? "vertical_leader_template" : "vertical_media_banner_template", LineMediationAdapter.this.getApplicationContext());
                            } else {
                                maxNativeAdView = new MaxNativeAdView(build, string, LineMediationAdapter.this.getApplicationContext());
                            }
                            ArrayList arrayList = new ArrayList(5);
                            if (AppLovinSdkUtils.isValidString(build.getTitle()) && maxNativeAdView.getTitleTextView() != null) {
                                arrayList.add(maxNativeAdView.getTitleTextView());
                            }
                            if (AppLovinSdkUtils.isValidString(build.getBody()) && maxNativeAdView.getBodyTextView() != null) {
                                arrayList.add(maxNativeAdView.getBodyTextView());
                            }
                            if (AppLovinSdkUtils.isValidString(build.getCallToAction()) && maxNativeAdView.getCallToActionButton() != null) {
                                arrayList.add(maxNativeAdView.getCallToActionButton());
                            }
                            if (build.getIcon() != null && maxNativeAdView.getIconImageView() != null) {
                                arrayList.add(maxNativeAdView.getIconImageView());
                            }
                            ViewGroup mediaContentViewGroup = maxNativeAdView.getMediaContentViewGroup();
                            if (build.getMediaView() != null && mediaContentViewGroup != null) {
                                arrayList.add(mediaContentViewGroup);
                            }
                            fiveAdNative.registerViews(maxNativeAdView, maxNativeAdView.getIconImageView(), arrayList);
                            NativeAdViewListener.this.listener.onAdViewAdLoaded(maxNativeAdView);
                        }
                    });
                }
            });
        }
    }

    private class NativeAdListener implements AdLoader.LoadNativeAdCallback, FiveAdNativeEventListener {
        private final MaxNativeAdAdapterListener listener;
        private final Bundle serverParameters;

        NativeAdListener(MaxNativeAdAdapterListener maxNativeAdAdapterListener, Bundle bundle) {
            this.listener = maxNativeAdAdapterListener;
            this.serverParameters = bundle;
        }

        @Override // com.five_corp.ad.AdLoader.LoadNativeAdCallback
        public void onLoad(final FiveAdNative fiveAdNative) {
            LineMediationAdapter.this.log("Native ad loaded for slot id: " + fiveAdNative.getSlotId() + "...");
            if (AppLovinSdkUtils.isValidString(BundleUtils.getString("template", "", this.serverParameters)) && TextUtils.isEmpty(fiveAdNative.getAdTitle())) {
                LineMediationAdapter.this.e("Native ad (" + fiveAdNative + ") does not have required assets.");
                this.listener.onNativeAdLoadFailed(MaxAdapterError.MISSING_REQUIRED_NATIVE_AD_ASSETS);
                return;
            }
            fiveAdNative.loadIconImageAsync(new FiveAdNative.LoadImageCallback() { // from class: com.applovin.mediation.adapters.LineMediationAdapter.NativeAdListener.1
                @Override // com.five_corp.ad.FiveAdNative.LoadImageCallback
                public void onImageLoad(Bitmap bitmap) {
                    FiveAdNative fiveAdNative2 = LineMediationAdapter.this.nativeAd;
                    if (fiveAdNative2 == null) {
                        LineMediationAdapter.this.log("Native ad destroyed before assets finished load for slot id: " + fiveAdNative.getSlotId());
                        return;
                    }
                    NativeAdListener.this.listener.onNativeAdLoaded(new MaxLineNativeAd(new MaxNativeAd.Builder().setAdFormat(MaxAdFormat.NATIVE).setTitle(fiveAdNative2.getAdTitle()).setAdvertiser(fiveAdNative2.getAdvertiserName()).setBody(fiveAdNative2.getDescriptionText()).setCallToAction(fiveAdNative2.getButtonText()).setIcon(new MaxNativeAd.MaxNativeAdImage(new BitmapDrawable(LineMediationAdapter.this.getApplicationContext().getResources(), bitmap))).setMediaView(fiveAdNative2.getAdMainView())), null);
                }
            });
            LineMediationAdapter.this.nativeAd = fiveAdNative;
            LineMediationAdapter.this.nativeAd.setEventListener(LineMediationAdapter.this.nativeAdListener);
            LineMediationAdapter.this.nativeAd.enableSound(false);
        }

        @Override // com.five_corp.ad.AdLoader.LoadNativeAdCallback
        public void onError(FiveAdErrorCode fiveAdErrorCode) {
            LineMediationAdapter.this.log("Native ad failed to load with error: " + fiveAdErrorCode);
            this.listener.onNativeAdLoadFailed(LineMediationAdapter.toMaxError(fiveAdErrorCode));
        }

        @Override // com.five_corp.ad.FiveAdNativeEventListener
        public void onViewError(FiveAdNative fiveAdNative, FiveAdErrorCode fiveAdErrorCode) {
            LineMediationAdapter.this.log("Native ad failed to show for slot id: " + fiveAdNative.getSlotId() + " with error: " + fiveAdErrorCode);
        }

        @Override // com.five_corp.ad.FiveAdNativeEventListener
        public void onImpression(FiveAdNative fiveAdNative) {
            LineMediationAdapter.this.log("Native ad impression tracked for slot id: " + fiveAdNative.getSlotId() + "...");
            this.listener.onNativeAdDisplayed(null);
        }

        @Override // com.five_corp.ad.FiveAdNativeEventListener
        public void onClick(FiveAdNative fiveAdNative) {
            LineMediationAdapter.this.log("Native ad clicked for slot id: " + fiveAdNative.getSlotId());
            this.listener.onNativeAdClicked();
        }

        @Override // com.five_corp.ad.FiveAdNativeEventListener
        public void onRemove(FiveAdNative fiveAdNative) {
            LineMediationAdapter.this.log("Native ad hidden for slot id: " + fiveAdNative.getSlotId() + "...");
        }

        @Override // com.five_corp.ad.FiveAdNativeEventListener
        public void onPlay(FiveAdNative fiveAdNative) {
            LineMediationAdapter.this.log("Native ad did play for slot id: " + fiveAdNative.getSlotId() + "...");
        }

        @Override // com.five_corp.ad.FiveAdNativeEventListener
        public void onPause(FiveAdNative fiveAdNative) {
            LineMediationAdapter.this.log("Native ad did pause for slot id: " + fiveAdNative.getSlotId() + "...");
        }

        @Override // com.five_corp.ad.FiveAdNativeEventListener
        public void onViewThrough(FiveAdNative fiveAdNative) {
            LineMediationAdapter.this.log("Native ad completed for slot id: " + fiveAdNative.getSlotId() + "...");
        }
    }

    private class MaxLineNativeAd extends MaxNativeAd {
        private MaxLineNativeAd(MaxNativeAd.Builder builder) {
            super(builder);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAd
        public boolean prepareForInteraction(List<View> list, ViewGroup viewGroup) {
            ImageView imageView;
            FiveAdNative fiveAdNative = LineMediationAdapter.this.nativeAd;
            if (fiveAdNative == null) {
                LineMediationAdapter.this.e("Failed to register native ad views: native ad is null.");
                return false;
            }
            LineMediationAdapter.this.d("Preparing views for interaction: " + list + " with container: " + viewGroup);
            Iterator<View> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    imageView = null;
                    break;
                }
                View next = it.next();
                if (next instanceof ImageView) {
                    imageView = (ImageView) next;
                    break;
                }
            }
            fiveAdNative.registerViews(viewGroup, imageView, list);
            return true;
        }
    }
}
