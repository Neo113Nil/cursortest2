package com.applovin.mediation.adapters;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
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
import com.applovin.mediation.adapters.mytarget.BuildConfig;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.my.target.ads.InterstitialAd;
import com.my.target.ads.MyTargetView;
import com.my.target.ads.Reward;
import com.my.target.ads.RewardedAd;
import com.my.target.common.MyTargetManager;
import com.my.target.common.MyTargetPrivacy;
import com.my.target.common.MyTargetVersion;
import com.my.target.common.models.IAdLoadingError;
import com.my.target.common.models.ImageData;
import com.my.target.nativeads.NativeAd;
import com.my.target.nativeads.NativeAdViewBinder;
import com.my.target.nativeads.banners.NativePromoBanner;
import com.my.target.nativeads.factories.NativeViewsFactory;
import com.my.target.nativeads.views.IconAdView;
import com.my.target.nativeads.views.MediaAdView;
import com.my.target.nativeads.views.NativeAdView;
import com.my.target.nativeads.views.PromoCardRecyclerView;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes14.dex */
public class MyTargetMediationAdapter extends MediationAdapterBase implements MaxSignalProvider, MaxInterstitialAdapter, MaxRewardedAdapter, MaxAdViewAdapter {
    private static final AtomicBoolean initialized = new AtomicBoolean();
    private MyTargetView adView;
    private InterstitialAd interstitialAd;
    private NativeAd nativeAd;
    private NativeAdView nativeAdView;
    private RewardedAd rewardedAd;

    public MyTargetMediationAdapter(AppLovinSdk appLovinSdk) {
        super(appLovinSdk);
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public String getSdkVersion() {
        return getVersionString(MyTargetVersion.class, "VERSION");
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public String getAdapterVersion() {
        return BuildConfig.VERSION_NAME;
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public void onDestroy() {
        InterstitialAd interstitialAd = this.interstitialAd;
        if (interstitialAd != null) {
            interstitialAd.destroy();
            this.interstitialAd = null;
        }
        RewardedAd rewardedAd = this.rewardedAd;
        if (rewardedAd != null) {
            rewardedAd.destroy();
            this.rewardedAd = null;
        }
        MyTargetView myTargetView = this.adView;
        if (myTargetView != null) {
            myTargetView.destroy();
            this.adView = null;
        }
        NativeAd nativeAd = this.nativeAd;
        if (nativeAd != null) {
            nativeAd.setListener(null);
            this.nativeAd.setMediaListener(null);
            this.nativeAd.setNativeAdVideoListener(null);
            this.nativeAd.unregisterView();
            this.nativeAd = null;
            this.nativeAdView = null;
        }
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, @Nullable Activity activity, MaxAdapter.OnCompletionListener onCompletionListener) {
        if (initialized.compareAndSet(false, true)) {
            if (maxAdapterInitializationParameters.isTesting()) {
                MyTargetManager.setDebugMode(true);
            }
            log("Initializing myTarget SDK... ");
            MyTargetManager.initSdk(getContext(activity));
        }
        onCompletionListener.onCompletion(MaxAdapter.InitializationStatus.DOES_NOT_APPLY, null);
    }

    @Override // com.applovin.mediation.adapter.MaxSignalProvider
    public void collectSignal(MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, @Nullable Activity activity, MaxSignalCollectionListener maxSignalCollectionListener) {
        log("Collecting signal...");
        updatePrivacyStates(maxAdapterSignalCollectionParameters);
        maxSignalCollectionListener.onSignalCollected(MyTargetManager.getBidderToken(getContext(activity)));
    }

    @Override // com.applovin.mediation.adapter.MaxInterstitialAdapter
    public void loadInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, @Nullable Activity activity, final MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        int parseInt = Integer.parseInt(maxAdapterResponseParameters.getThirdPartyAdPlacementId());
        StringBuilder sb = new StringBuilder();
        sb.append("Loading ");
        sb.append(AppLovinSdkUtils.isValidString(maxAdapterResponseParameters.getBidResponse()) ? "bidding " : "");
        sb.append(" interstitial ad for slot id: ");
        sb.append(parseInt);
        sb.append("...");
        log(sb.toString());
        InterstitialAd interstitialAd = new InterstitialAd(parseInt, getContext(activity));
        this.interstitialAd = interstitialAd;
        interstitialAd.setListener2(new InterstitialListener(maxInterstitialAdapterListener));
        this.interstitialAd.setBannerListener(new InterstitialAd.InterstitialAdBannerListener() { // from class: com.applovin.mediation.adapters.MyTargetMediationAdapter.1
            @Override // com.my.target.ads.InterstitialAd.InterstitialAdBannerListener
            public void onClick(@NonNull InterstitialAd interstitialAd2, @Nullable InterstitialAd.BannerInfo bannerInfo) {
                MyTargetMediationAdapter.this.log("Interstitial clicked");
                maxInterstitialAdapterListener.onInterstitialAdClicked();
            }
        });
        this.interstitialAd.setVideoListener(new InterstitialAd.InterstitialVideoListener() { // from class: com.applovin.mediation.adapters.MyTargetMediationAdapter.2
            @Override // com.my.target.ads.InterstitialAd.InterstitialVideoListener
            public void onVideoCompleted(@NonNull InterstitialAd interstitialAd2, @Nullable InterstitialAd.BannerInfo bannerInfo) {
                MyTargetMediationAdapter.this.log("Interstitial video completed");
            }
        });
        this.interstitialAd.getCustomParams().setCustomParam("mediation", "7");
        updatePrivacyStates(maxAdapterResponseParameters);
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        if (TextUtils.isEmpty(bidResponse)) {
            this.interstitialAd.load();
        } else {
            this.interstitialAd.loadFromBid(bidResponse);
        }
    }

    @Override // com.applovin.mediation.adapter.MaxInterstitialAdapter
    public void showInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, @Nullable Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        log("Showing interstitial ad...");
        InterstitialAd interstitialAd = this.interstitialAd;
        if (interstitialAd != null) {
            interstitialAd.show();
            return;
        }
        log("Interstitial ad is null");
        MaxAdapterError maxAdapterError = MaxAdapterError.AD_DISPLAY_FAILED;
        MaxAdapterError maxAdapterError2 = MaxAdapterError.INVALID_LOAD_STATE;
        maxInterstitialAdapterListener.onInterstitialAdDisplayFailed(new MaxAdapterError(maxAdapterError, maxAdapterError2.getCode(), maxAdapterError2.getMessage()));
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedAdapter
    public void loadRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, @Nullable Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        int parseInt = Integer.parseInt(maxAdapterResponseParameters.getThirdPartyAdPlacementId());
        StringBuilder sb = new StringBuilder();
        sb.append("Loading ");
        sb.append(AppLovinSdkUtils.isValidString(maxAdapterResponseParameters.getBidResponse()) ? "bidding " : "");
        sb.append(" rewarded ad for slot id: ");
        sb.append(parseInt);
        sb.append("...");
        log(sb.toString());
        RewardedAd rewardedAd = new RewardedAd(parseInt, getContext(activity));
        this.rewardedAd = rewardedAd;
        rewardedAd.setListener(new RewardedAdListener(maxRewardedAdapterListener));
        this.rewardedAd.getCustomParams().setCustomParam("mediation", "7");
        updatePrivacyStates(maxAdapterResponseParameters);
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        if (TextUtils.isEmpty(bidResponse)) {
            this.rewardedAd.load();
        } else {
            this.rewardedAd.loadFromBid(bidResponse);
        }
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedAdapter
    public void showRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, @Nullable Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        log("Showing rewarded ad...");
        if (this.rewardedAd != null) {
            configureReward(maxAdapterResponseParameters);
            this.rewardedAd.show();
        } else {
            log("Rewarded ad is null");
            MaxAdapterError maxAdapterError = MaxAdapterError.AD_DISPLAY_FAILED;
            MaxAdapterError maxAdapterError2 = MaxAdapterError.INVALID_LOAD_STATE;
            maxRewardedAdapterListener.onRewardedAdDisplayFailed(new MaxAdapterError(maxAdapterError, maxAdapterError2.getCode(), maxAdapterError2.getMessage()));
        }
    }

    @Override // com.applovin.mediation.adapter.MaxAdViewAdapter
    public void loadAdViewAd(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, @Nullable Activity activity, MaxAdViewAdapterListener maxAdViewAdapterListener) {
        int parseInt = Integer.parseInt(maxAdapterResponseParameters.getThirdPartyAdPlacementId());
        StringBuilder sb = new StringBuilder();
        sb.append("Loading ");
        sb.append(AppLovinSdkUtils.isValidString(maxAdapterResponseParameters.getBidResponse()) ? "bidding " : "");
        sb.append(" ad view with format: ");
        sb.append(maxAdFormat.getLabel());
        sb.append(" for slot id: ");
        sb.append(parseInt);
        sb.append("...");
        log(sb.toString());
        MyTargetView myTargetView = new MyTargetView(getContext(activity));
        this.adView = myTargetView;
        myTargetView.setSlotId(parseInt);
        this.adView.setAdSize(getBannerSize(maxAdFormat));
        this.adView.setRefreshAd(false);
        this.adView.setListener(new AdViewListener(maxAdViewAdapterListener));
        this.adView.getCustomParams().setCustomParam("mediation", "7");
        updatePrivacyStates(maxAdapterResponseParameters);
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        if (TextUtils.isEmpty(bidResponse)) {
            this.adView.load();
        } else {
            this.adView.loadFromBid(bidResponse);
        }
    }

    @Override // com.applovin.mediation.adapters.MediationAdapterBase, com.applovin.mediation.adapter.MaxNativeAdAdapter
    public void loadNativeAd(MaxAdapterResponseParameters maxAdapterResponseParameters, @Nullable Activity activity, MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
        int parseInt = Integer.parseInt(maxAdapterResponseParameters.getThirdPartyAdPlacementId());
        StringBuilder sb = new StringBuilder();
        sb.append("Loading ");
        sb.append(AppLovinSdkUtils.isValidString(maxAdapterResponseParameters.getBidResponse()) ? "bidding " : "");
        sb.append(" native ad for slot id: ");
        sb.append(parseInt);
        sb.append("...");
        log(sb.toString());
        NativeAdListener nativeAdListener = new NativeAdListener(maxAdapterResponseParameters, getContext(activity), maxNativeAdAdapterListener);
        NativeAd nativeAd = new NativeAd(parseInt, getContext(activity));
        this.nativeAd = nativeAd;
        nativeAd.setListener(nativeAdListener);
        this.nativeAd.setMediaListener(nativeAdListener);
        this.nativeAd.setNativeAdVideoListener(nativeAdListener);
        this.nativeAd.getCustomParams().setCustomParam("mediation", "7");
        this.nativeAd.setAdChoicesPlacement(maxAdapterResponseParameters.getServerParameters().getInt("ad_choices_placement", 0));
        this.nativeAd.setCachePolicy(maxAdapterResponseParameters.getServerParameters().getInt("cache_policy", 0));
        updatePrivacyStates(maxAdapterResponseParameters);
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        if (TextUtils.isEmpty(bidResponse)) {
            this.nativeAd.load();
        } else {
            this.nativeAd.loadFromBid(bidResponse);
        }
    }

    private void updatePrivacyStates(MaxAdapterParameters maxAdapterParameters) {
        Boolean hasUserConsent = maxAdapterParameters.hasUserConsent();
        if (hasUserConsent != null) {
            MyTargetPrivacy.setUserConsent(hasUserConsent.booleanValue());
        }
        Boolean isDoNotSell = maxAdapterParameters.isDoNotSell();
        if (isDoNotSell != null) {
            MyTargetPrivacy.setCcpaUserConsent(isDoNotSell.booleanValue());
        }
    }

    private Context getContext(@Nullable Activity activity) {
        return activity != null ? activity.getApplicationContext() : getApplicationContext();
    }

    private static MyTargetView.AdSize getBannerSize(MaxAdFormat maxAdFormat) {
        if (maxAdFormat == MaxAdFormat.BANNER) {
            return MyTargetView.AdSize.ADSIZE_320x50;
        }
        if (maxAdFormat == MaxAdFormat.MREC) {
            return MyTargetView.AdSize.ADSIZE_300x250;
        }
        if (maxAdFormat == MaxAdFormat.LEADER) {
            return MyTargetView.AdSize.ADSIZE_728x90;
        }
        return MyTargetView.AdSize.ADSIZE_320x50;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0036 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static MaxAdapterError toMaxError(IAdLoadingError iAdLoadingError) {
        int code = iAdLoadingError.getCode();
        MaxAdapterError maxAdapterError = MaxAdapterError.UNSPECIFIED;
        if (code != 1403 && code != 1404 && code != 1500 && code != 6000) {
            if (code == 4001 || code == 4002) {
                maxAdapterError = MaxAdapterError.INVALID_LOAD_STATE;
            } else if (code != 5000) {
                if (code != 5001) {
                    switch (code) {
                        case 1000:
                            break;
                        case 1001:
                            maxAdapterError = MaxAdapterError.INVALID_CONFIGURATION;
                            break;
                        case 1002:
                            maxAdapterError = MaxAdapterError.NO_CONNECTION;
                            break;
                        case 1003:
                            maxAdapterError = MaxAdapterError.TIMEOUT;
                            break;
                        default:
                            switch (code) {
                                case 2000:
                                case 2001:
                                    break;
                                default:
                                    switch (code) {
                                    }
                                case 2002:
                                case 2003:
                                case 2004:
                                case 2005:
                                    break;
                            }
                    }
                }
                maxAdapterError = MaxAdapterError.NO_FILL;
            }
            return new MaxAdapterError(maxAdapterError, code, iAdLoadingError.getMessage());
        }
        maxAdapterError = MaxAdapterError.INTERNAL_ERROR;
        return new MaxAdapterError(maxAdapterError, code, iAdLoadingError.getMessage());
    }

    private class InterstitialListener extends InterstitialAd.InterstitialAdListener2 {
        private final MaxInterstitialAdapterListener listener;

        InterstitialListener(MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
            this.listener = maxInterstitialAdapterListener;
        }

        @Override // com.my.target.ads.InterstitialAd.InterstitialAdListener2
        public void onLoad(@NonNull InterstitialAd interstitialAd) {
            MyTargetMediationAdapter.this.log("Interstitial loaded");
            this.listener.onInterstitialAdLoaded();
        }

        @Override // com.my.target.ads.InterstitialAd.InterstitialAdListener2
        public void onNoAd(@NonNull IAdLoadingError iAdLoadingError, @NonNull InterstitialAd interstitialAd) {
            MaxAdapterError maxError = MyTargetMediationAdapter.toMaxError(iAdLoadingError);
            MyTargetMediationAdapter.this.log("Interstitial failed to load with error: " + maxError);
            this.listener.onInterstitialAdLoadFailed(maxError);
        }

        @Override // com.my.target.ads.InterstitialAd.InterstitialAdListener2
        public void onDisplay(@NonNull InterstitialAd interstitialAd) {
            MyTargetMediationAdapter.this.log("Interstitial displayed");
            this.listener.onInterstitialAdDisplayed();
        }

        @Override // com.my.target.ads.InterstitialAd.InterstitialAdListener2
        public void onFailedToShow(@NonNull InterstitialAd interstitialAd) {
            MyTargetMediationAdapter.this.log("Interstitial ad display failed");
            this.listener.onInterstitialAdDisplayFailed(MaxAdapterError.AD_DISPLAY_FAILED);
        }

        @Override // com.my.target.ads.InterstitialAd.InterstitialAdListener2
        public void onClose(@NonNull InterstitialAd interstitialAd) {
            MyTargetMediationAdapter.this.log("Interstitial dismissed");
            this.listener.onInterstitialAdHidden();
        }
    }

    private class RewardedAdListener implements RewardedAd.RewardedAdListener {
        private boolean hasGrantedReward;
        private final MaxRewardedAdapterListener listener;

        RewardedAdListener(MaxRewardedAdapterListener maxRewardedAdapterListener) {
            this.listener = maxRewardedAdapterListener;
        }

        @Override // com.my.target.ads.RewardedAd.RewardedAdListener
        public void onLoad(@NonNull RewardedAd rewardedAd) {
            MyTargetMediationAdapter.this.log("Rewarded ad loaded");
            this.listener.onRewardedAdLoaded();
        }

        @Override // com.my.target.ads.RewardedAd.RewardedAdListener
        public void onNoAd(@NonNull IAdLoadingError iAdLoadingError, @NonNull RewardedAd rewardedAd) {
            MaxAdapterError maxError = MyTargetMediationAdapter.toMaxError(iAdLoadingError);
            MyTargetMediationAdapter.this.log("Rewarded ad failed to load with error: " + maxError);
            this.listener.onRewardedAdLoadFailed(maxError);
        }

        @Override // com.my.target.ads.RewardedAd.RewardedAdListener
        public void onDisplay(@NonNull RewardedAd rewardedAd) {
            MyTargetMediationAdapter.this.log("Rewarded ad displayed");
            this.listener.onRewardedAdDisplayed();
        }

        @Override // com.my.target.ads.RewardedAd.RewardedAdListener
        public void onFailedToShow(@NonNull RewardedAd rewardedAd) {
            MyTargetMediationAdapter.this.log("Rewarded ad display failed");
            this.listener.onRewardedAdDisplayFailed(MaxAdapterError.AD_DISPLAY_FAILED);
        }

        @Override // com.my.target.ads.RewardedAd.RewardedAdListener
        public void onClick(@NonNull RewardedAd rewardedAd) {
            MyTargetMediationAdapter.this.log("Rewarded ad clicked");
            this.listener.onRewardedAdClicked();
        }

        @Override // com.my.target.ads.RewardedAd.RewardedAdListener
        public void onReward(@NonNull Reward reward, @NonNull RewardedAd rewardedAd) {
            MyTargetMediationAdapter.this.log("Rewarded ad reward granted");
            this.hasGrantedReward = true;
        }

        @Override // com.my.target.ads.RewardedAd.RewardedAdListener
        public void onDismiss(@NonNull RewardedAd rewardedAd) {
            if (this.hasGrantedReward || MyTargetMediationAdapter.this.shouldAlwaysRewardUser()) {
                MaxReward reward = MyTargetMediationAdapter.this.getReward();
                MyTargetMediationAdapter.this.log("Rewarded user with reward: " + reward);
                this.listener.onUserRewarded(reward);
            }
            MyTargetMediationAdapter.this.log("Rewarded ad dismissed");
            this.listener.onRewardedAdHidden();
        }
    }

    private class AdViewListener implements MyTargetView.MyTargetViewListener {
        private final MaxAdViewAdapterListener listener;

        AdViewListener(MaxAdViewAdapterListener maxAdViewAdapterListener) {
            this.listener = maxAdViewAdapterListener;
        }

        @Override // com.my.target.ads.MyTargetView.MyTargetViewListener
        public void onLoad(@NonNull MyTargetView myTargetView) {
            MyTargetMediationAdapter.this.log("Ad view loaded");
            this.listener.onAdViewAdLoaded(myTargetView);
        }

        @Override // com.my.target.ads.MyTargetView.MyTargetViewListener
        public void onNoAd(@NonNull IAdLoadingError iAdLoadingError, @NonNull MyTargetView myTargetView) {
            MaxAdapterError maxError = MyTargetMediationAdapter.toMaxError(iAdLoadingError);
            MyTargetMediationAdapter.this.log("Ad view failed to load with error: " + maxError);
            this.listener.onAdViewAdLoadFailed(maxError);
        }

        @Override // com.my.target.ads.MyTargetView.MyTargetViewListener
        public void onShow(@NonNull MyTargetView myTargetView) {
            MyTargetMediationAdapter.this.log("Ad view displayed");
            this.listener.onAdViewAdDisplayed();
        }

        @Override // com.my.target.ads.MyTargetView.MyTargetViewListener
        public void onClick(@NonNull MyTargetView myTargetView) {
            MyTargetMediationAdapter.this.log("Ad view clicked");
            this.listener.onAdViewAdClicked();
        }
    }

    private class NativeAdListener implements NativeAd.NativeAdListener, NativeAd.NativeAdMediaListener, NativeAd.NativeAdVideoListener {
        private final Context context;
        private final MaxNativeAdAdapterListener listener;
        private final Bundle serverParameters;
        private final String slotId;

        @Override // com.my.target.nativeads.NativeAd.NativeAdListener
        public void onClick(@NonNull NativeAd nativeAd) {
        }

        @Override // com.my.target.nativeads.NativeAd.NativeAdListener
        public void onVideoPlay(@NonNull NativeAd nativeAd) {
        }

        NativeAdListener(MaxAdapterResponseParameters maxAdapterResponseParameters, Context context, MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
            this.slotId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
            this.serverParameters = maxAdapterResponseParameters.getServerParameters();
            this.context = context;
            this.listener = maxNativeAdAdapterListener;
        }

        @Override // com.my.target.nativeads.NativeAd.NativeAdListener
        public void onClick(@Nullable View view, @NonNull NativeAd nativeAd) {
            MyTargetMediationAdapter.this.log("Native ad clicked: " + this.slotId);
            this.listener.onNativeAdClicked();
        }

        @Override // com.my.target.nativeads.NativeAd.NativeAdListener
        public void onLoad(@NonNull NativePromoBanner nativePromoBanner, @NonNull NativeAd nativeAd) {
            MaxNativeAd.MaxNativeAdImage maxNativeAdImage;
            MaxNativeAd.MaxNativeAdImage maxNativeAdImage2;
            MyTargetMediationAdapter.this.log("Native ad loaded: " + this.slotId);
            if (MyTargetMediationAdapter.this.nativeAd != nativeAd) {
                MyTargetMediationAdapter.this.e("Mismatched instance of native ads - adapter: " + MyTargetMediationAdapter.this.nativeAd + " and listener: " + nativeAd);
                this.listener.onNativeAdLoadFailed(MaxAdapterError.INVALID_LOAD_STATE);
                return;
            }
            boolean isValidString = AppLovinSdkUtils.isValidString(BundleUtils.getString("template", "", this.serverParameters));
            NativePromoBanner banner = nativeAd.getBanner();
            if (isValidString && TextUtils.isEmpty(banner.getTitle())) {
                MyTargetMediationAdapter.this.e("Native ad (" + nativeAd + ") does not have required assets.");
                this.listener.onNativeAdLoadFailed(MaxAdapterError.MISSING_REQUIRED_NATIVE_AD_ASSETS);
                return;
            }
            ImageData icon = banner.getIcon();
            ImageData image = banner.getImage();
            MediaAdView mediaAdView = NativeViewsFactory.getMediaAdView(this.context);
            if (icon == null) {
                maxNativeAdImage = null;
            } else if (icon.getBitmap() != null) {
                maxNativeAdImage = new MaxNativeAd.MaxNativeAdImage(new BitmapDrawable(this.context.getResources(), icon.getBitmap()));
            } else {
                maxNativeAdImage = new MaxNativeAd.MaxNativeAdImage(Uri.parse(icon.getUrl()));
            }
            if (image == null) {
                maxNativeAdImage2 = null;
            } else if (image.getBitmap() != null) {
                maxNativeAdImage2 = new MaxNativeAd.MaxNativeAdImage(new BitmapDrawable(this.context.getResources(), image.getBitmap()));
            } else {
                maxNativeAdImage2 = new MaxNativeAd.MaxNativeAdImage(Uri.parse(image.getUrl()));
            }
            MyTargetMediationAdapter.this.nativeAdView = NativeViewsFactory.getNativeAdView(this.context);
            MyTargetMediationAdapter.this.nativeAdView.setupView(nativeAd.getBanner());
            this.listener.onNativeAdLoaded(new MaxMyTargetNativeAd(new MaxNativeAd.Builder().setAdFormat(MaxAdFormat.NATIVE).setTitle(banner.getTitle()).setBody(banner.getDescription()).setCallToAction(banner.getCtaText()).setIcon(maxNativeAdImage).setMediaView(mediaAdView).setAdvertiser(banner.getAdvertisingLabel()).setMainImage(maxNativeAdImage2).setMediaContentAspectRatio(mediaAdView.getMediaAspectRatio())), null);
        }

        @Override // com.my.target.nativeads.NativeAd.NativeAdListener
        public void onNoAd(@NonNull IAdLoadingError iAdLoadingError, @NonNull NativeAd nativeAd) {
            MaxAdapterError maxError = MyTargetMediationAdapter.toMaxError(iAdLoadingError);
            MyTargetMediationAdapter.this.log("Native ad (" + this.slotId + ") failed to load with error: " + maxError);
            this.listener.onNativeAdLoadFailed(maxError);
        }

        @Override // com.my.target.nativeads.NativeAd.NativeAdListener
        public void onShow(@NonNull NativeAd nativeAd) {
            MyTargetMediationAdapter.this.log("Native ad shown: " + this.slotId);
            this.listener.onNativeAdDisplayed(null);
        }

        @Override // com.my.target.nativeads.NativeAd.NativeAdMediaListener
        public void onIconLoad(@NonNull NativeAd nativeAd) {
            MyTargetMediationAdapter.this.log("Native ad icon loaded: " + this.slotId);
        }

        @Override // com.my.target.nativeads.NativeAd.NativeAdMediaListener
        public void onImageLoad(@NonNull NativeAd nativeAd) {
            MyTargetMediationAdapter.this.log("Native ad image loaded: " + this.slotId);
        }

        @Override // com.my.target.nativeads.NativeAd.NativeAdListener, com.my.target.nativeads.NativeAd.NativeAdVideoListener
        public void onVideoComplete(@NonNull NativeAd nativeAd) {
            MyTargetMediationAdapter.this.log("Native ad video completed: " + this.slotId);
        }

        @Override // com.my.target.nativeads.NativeAd.NativeAdVideoListener
        public void onVideoError(@NonNull String str, @NonNull NativeAd nativeAd) {
            MyTargetMediationAdapter.this.log("Native video error: " + this.slotId + " with error: " + str);
        }

        @Override // com.my.target.nativeads.NativeAd.NativeAdListener, com.my.target.nativeads.NativeAd.NativeAdVideoListener
        public void onVideoPause(@NonNull NativeAd nativeAd) {
            MyTargetMediationAdapter.this.log("Native ad video paused: " + this.slotId);
        }

        @Override // com.my.target.nativeads.NativeAd.NativeAdVideoListener
        public void onVideoProgress(float f, float f2, @NonNull NativeAd nativeAd) {
            MyTargetMediationAdapter.this.log("Native ad video progress: " + this.slotId + " position: " + f2 + " / " + f);
        }

        @Override // com.my.target.nativeads.NativeAd.NativeAdVideoListener
        public void onVideoReplay(@NonNull NativeAd nativeAd) {
            MyTargetMediationAdapter.this.log("Native video replay: " + this.slotId);
        }

        @Override // com.my.target.nativeads.NativeAd.NativeAdVideoListener
        public void onVideoResume(@NonNull NativeAd nativeAd) {
            MyTargetMediationAdapter.this.log("Native video resumed: " + this.slotId);
        }

        @Override // com.my.target.nativeads.NativeAd.NativeAdVideoListener
        public void onVideoStart(@NonNull NativeAd nativeAd) {
            MyTargetMediationAdapter.this.log("Native ad video started: " + this.slotId);
        }

        @Override // com.my.target.nativeads.NativeAd.NativeAdVideoListener
        public void onVideoVolumeChanged(float f, @NonNull NativeAd nativeAd) {
            MyTargetMediationAdapter.this.log("Native ad video volume changed: " + this.slotId + " volume: " + f);
        }
    }

    private class MaxMyTargetNativeAd extends MaxNativeAd {
        private MaxMyTargetNativeAd(MaxNativeAd.Builder builder) {
            super(builder);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAd
        public boolean prepareForInteraction(List<View> list, ViewGroup viewGroup) {
            NativeAd nativeAd = MyTargetMediationAdapter.this.nativeAd;
            if (nativeAd == null) {
                MyTargetMediationAdapter.this.e("Failed to register native ad views: native ad is null.");
                return false;
            }
            if (!(viewGroup instanceof MaxNativeAdView)) {
                MyTargetMediationAdapter.this.e("Failed to register native ad views: container is not MaxNativeAdView - " + viewGroup);
                return false;
            }
            final MaxNativeAdView maxNativeAdView = (MaxNativeAdView) viewGroup;
            MyTargetMediationAdapter.this.d("Preparing views for interaction: " + list + " with container: " + viewGroup);
            nativeAd.registerView(new NativeAdViewBinder() { // from class: com.applovin.mediation.adapters.MyTargetMediationAdapter.MaxMyTargetNativeAd.1
                @Override // com.my.target.nativeads.NativeAdViewBinder
                @Nullable
                public View getAgeRestrictionView() {
                    return null;
                }

                @Override // com.my.target.nativeads.NativeAdViewBinder
                @Nullable
                public View getDisclaimerView() {
                    return null;
                }

                @Override // com.my.target.nativeads.NativeAdViewBinder
                @Nullable
                public View getDomainOrCategoryView() {
                    return null;
                }

                @Override // com.my.target.nativeads.NativeAdViewBinder
                @Nullable
                public IconAdView getIconView() {
                    return null;
                }

                @Override // com.my.target.nativeads.NativeAdViewBinder
                @Nullable
                public PromoCardRecyclerView getPromoCardRecyclerView() {
                    return null;
                }

                @Override // com.my.target.nativeads.NativeAdViewBinder
                @Nullable
                public View getVotesView() {
                    return null;
                }

                @Override // com.my.target.nativeads.NativeAdViewBinder
                @Nullable
                public View getAdChoicesView() {
                    return maxNativeAdView.getOptionsContentViewGroup();
                }

                @Override // com.my.target.nativeads.NativeAdViewBinder
                @Nullable
                public View getAdvertisingView() {
                    return maxNativeAdView.getAdvertiserTextView();
                }

                @Override // com.my.target.nativeads.NativeAdViewBinder
                @Nullable
                public View getCtaView() {
                    return maxNativeAdView.getCallToActionButton();
                }

                @Override // com.my.target.nativeads.NativeAdViewBinder
                @Nullable
                public View getDescriptionView() {
                    return maxNativeAdView.getBodyTextView();
                }

                @Override // com.my.target.nativeads.NativeAdViewBinder
                @Nullable
                public MediaAdView getMediaAdView() {
                    View mediaView = MaxMyTargetNativeAd.this.getMediaView();
                    if (mediaView instanceof MediaAdView) {
                        return (MediaAdView) mediaView;
                    }
                    return null;
                }

                @Override // com.my.target.nativeads.NativeAdViewBinder
                @NonNull
                public ViewGroup getRootAdView() {
                    return maxNativeAdView;
                }

                @Override // com.my.target.nativeads.NativeAdViewBinder
                @Nullable
                public View getStarsRatingView() {
                    return maxNativeAdView.getStarRatingContentViewGroup();
                }

                @Override // com.my.target.nativeads.NativeAdViewBinder
                @Nullable
                public View getTitleView() {
                    return maxNativeAdView.getTitleTextView();
                }
            }, list);
            return true;
        }
    }
}
