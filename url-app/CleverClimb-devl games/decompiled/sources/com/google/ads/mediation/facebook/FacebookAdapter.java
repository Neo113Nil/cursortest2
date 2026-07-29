package com.google.ads.mediation.facebook;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Keep;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.cmplay.policy.gdpr.DimenUtils;
import com.facebook.ads.Ad;
import com.facebook.ads.AdChoicesView;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdSettings;
import com.facebook.ads.AdView;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import com.facebook.ads.MediaView;
import com.facebook.ads.MediaViewListener;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdViewAttributes;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.NativeAppInstallAdMapper;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@Keep
/* loaded from: classes.dex */
public final class FacebookAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter, MediationRewardedVideoAdAdapter {
    private static final int DRAWABLE_FUTURE_TIMEOUT_SECONDS = 10;
    public static final String KEY_AD_VIEW_ATTRIBUTES = "ad_view_attributes";
    public static final String KEY_AUTOPLAY = "autoplay";
    public static final String KEY_BACKGROUND_COLOR = "background_color";
    public static final String KEY_BUTTON_BORDER_COLOR = "button_border_color";
    public static final String KEY_BUTTON_COLOR = "button_color";
    public static final String KEY_BUTTON_TEXT_COLOR = "button_text_color";
    public static final String KEY_DESCRIPTION_TEXT_COLOR = "description_text_color";
    public static final String KEY_DESCRIPTION_TEXT_SIZE = "description_text_size";
    public static final String KEY_ID = "id";
    public static final String KEY_IS_BOLD = "is_bold";
    public static final String KEY_IS_ITALIC = "is_italic";
    public static final String KEY_SOCIAL_CONTEXT_ASSET = "social_context";
    public static final String KEY_STYLE = "style";
    public static final String KEY_SUBTITLE_ASSET = "subtitle";
    public static final String KEY_TITLE_TEXT_COLOR = "title_text_color";
    public static final String KEY_TITLE_TEXT_SIZE = "title_text_size";
    public static final String KEY_TYPEFACE = "typeface";
    private static final int MAX_STAR_RATING = 5;
    private static final String PLACEMENT_PARAMETER = "pubid";
    private static final String TAG = "FacebookAdapter";
    private AdView mAdView;
    private MediationBannerListener mBannerListener;
    private Context mContext;
    private InterstitialAd mInterstitialAd;
    private MediationInterstitialListener mInterstitialListener;
    private boolean mIsAdChoicesIconExpandable = true;
    private boolean mIsImpressionRecorded;
    private boolean mIsInitialized;
    private MediaView mMediaView;
    private NativeAd mNativeAd;
    private MediationNativeListener mNativeListener;
    private MediationRewardedVideoAdListener mRewardedListener;
    private RewardedVideoAd mRewardedVideoAd;
    private RelativeLayout mWrappedAdView;

    private interface NativeAdMapperListener {
        void onMappingFailed();

        void onMappingSuccess();
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onPause() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onResume() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onDestroy() {
        if (this.mAdView != null) {
            this.mAdView.destroy();
        }
        if (this.mInterstitialAd != null) {
            this.mInterstitialAd.destroy();
        }
        if (this.mNativeAd != null) {
            this.mNativeAd.unregisterView();
            this.mNativeAd.destroy();
        }
        if (this.mMediaView != null) {
            this.mMediaView.destroy();
        }
        if (this.mRewardedVideoAd != null) {
            this.mRewardedVideoAd.destroy();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(Context context, MediationBannerListener mediationBannerListener, Bundle bundle, AdSize adSize, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.mBannerListener = mediationBannerListener;
        if (!isValidRequestParameters(context, bundle)) {
            this.mBannerListener.onAdFailedToLoad(this, 1);
            return;
        }
        if (adSize == null) {
            Log.w(TAG, "Fail to request banner ad, adSize is null");
            this.mBannerListener.onAdFailedToLoad(this, 1);
            return;
        }
        String string = bundle.getString("pubid");
        com.facebook.ads.AdSize adSize2 = getAdSize(context, adSize);
        if (adSize2 == null) {
            Log.w(TAG, "The input ad size " + adSize.toString() + " is not supported at this moment.");
            this.mBannerListener.onAdFailedToLoad(this, 3);
            return;
        }
        AdSettings.setMediationService("ADMOB_" + getGMSVersionCode(context));
        this.mAdView = new AdView(context, string, adSize2);
        this.mAdView.setAdListener(new BannerListener());
        buildAdRequest(mediationAdRequest);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(adSize.getWidthInPixels(context), adSize.getHeightInPixels(context));
        this.mWrappedAdView = new RelativeLayout(context);
        this.mAdView.setLayoutParams(layoutParams);
        this.mWrappedAdView.addView(this.mAdView);
        this.mAdView.loadAd();
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public View getBannerView() {
        return this.mWrappedAdView;
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.mInterstitialListener = mediationInterstitialListener;
        if (!isValidRequestParameters(context, bundle)) {
            this.mInterstitialListener.onAdFailedToLoad(this, 1);
            return;
        }
        String string = bundle.getString("pubid");
        AdSettings.setMediationService("ADMOB_" + getGMSVersionCode(context));
        this.mInterstitialAd = new InterstitialAd(context, string);
        this.mInterstitialAd.setAdListener(new InterstitialListener());
        buildAdRequest(mediationAdRequest);
        this.mInterstitialAd.loadAd();
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        if (this.mInterstitialAd.isAdLoaded()) {
            this.mInterstitialAd.show();
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter
    public void initialize(Context context, MediationAdRequest mediationAdRequest, String str, MediationRewardedVideoAdListener mediationRewardedVideoAdListener, Bundle bundle, Bundle bundle2) {
        this.mContext = context;
        this.mRewardedListener = mediationRewardedVideoAdListener;
        if (!isValidRequestParameters(context, bundle)) {
            this.mRewardedListener.onAdFailedToLoad(this, 1);
            return;
        }
        this.mRewardedVideoAd = new RewardedVideoAd(context, bundle.getString("pubid"));
        this.mRewardedVideoAd.setAdListener(new RewardedVideoListener());
        this.mIsInitialized = true;
        this.mRewardedListener.onInitializationSucceeded(this);
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter
    public void loadAd(MediationAdRequest mediationAdRequest, Bundle bundle, Bundle bundle2) {
        if (this.mRewardedVideoAd == null) {
            Log.w(TAG, "Failed to request rewarded video ad, adapter has not been initialized.");
            this.mIsInitialized = false;
            if (this.mRewardedListener != null) {
                this.mRewardedListener.onAdFailedToLoad(this, 0);
                return;
            }
            return;
        }
        if (this.mRewardedVideoAd.isAdLoaded()) {
            this.mRewardedListener.onAdLoaded(this);
            return;
        }
        buildAdRequest(mediationAdRequest);
        AdSettings.setMediationService("ADMOB_" + getGMSVersionCode(this.mContext));
        this.mRewardedVideoAd.loadAd(true);
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter
    public void showVideo() {
        if (this.mRewardedVideoAd != null && this.mRewardedVideoAd.isAdLoaded()) {
            this.mRewardedVideoAd.show();
            this.mRewardedListener.onAdOpened(this);
            this.mRewardedListener.onVideoStarted(this);
        } else {
            Log.w(TAG, "No ads to show.");
            if (this.mRewardedListener != null) {
                this.mRewardedListener.onAdOpened(this);
                this.mRewardedListener.onAdClosed(this);
            }
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter
    public boolean isInitialized() {
        return this.mIsInitialized;
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void requestNativeAd(Context context, MediationNativeListener mediationNativeListener, Bundle bundle, NativeMediationAdRequest nativeMediationAdRequest, Bundle bundle2) {
        this.mNativeListener = mediationNativeListener;
        if (!isValidRequestParameters(context, bundle)) {
            this.mNativeListener.onAdFailedToLoad(this, 1);
            return;
        }
        if (!nativeMediationAdRequest.isAppInstallAdRequested() || !nativeMediationAdRequest.isContentAdRequested()) {
            Log.w(TAG, "Failed to request native ad. Both app install and content ad should be requested");
            this.mNativeListener.onAdFailedToLoad(this, 1);
            return;
        }
        String string = bundle.getString("pubid");
        if (bundle2 != null) {
            this.mIsAdChoicesIconExpandable = bundle2.getBoolean("expandable_icon", true);
        }
        this.mMediaView = new MediaView(context);
        AdSettings.setMediationService("ADMOB_" + getGMSVersionCode(context));
        this.mNativeAd = new NativeAd(context, string);
        this.mNativeAd.setAdListener(new NativeListener(this.mNativeAd, nativeMediationAdRequest));
        buildAdRequest(nativeMediationAdRequest);
        this.mNativeAd.loadAd();
    }

    private static boolean isValidRequestParameters(Context context, Bundle bundle) {
        if (context == null) {
            Log.w(TAG, "Failed to request ad, Context is null.");
            return false;
        }
        if (bundle == null) {
            Log.w(TAG, "Failed to request ad, serverParameters is null.");
            return false;
        }
        if (!TextUtils.isEmpty(bundle.getString("pubid"))) {
            return true;
        }
        Log.w(TAG, "Failed to request ad, placementId is null or empty.");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int convertErrorCode(AdError adError) {
        if (adError == null) {
            return 0;
        }
        int errorCode = adError.getErrorCode();
        if (errorCode == 2000) {
            return 2;
        }
        switch (errorCode) {
        }
        return 0;
    }

    private void buildAdRequest(MediationAdRequest mediationAdRequest) {
        if (mediationAdRequest != null) {
            AdSettings.setIsChildDirected(mediationAdRequest.taggedForChildDirectedTreatment() == 1);
        }
    }

    private class BannerListener implements AdListener {
        @Override // com.facebook.ads.AdListener
        public void onLoggingImpression(Ad ad) {
        }

        private BannerListener() {
        }

        @Override // com.facebook.ads.AdListener
        public void onAdClicked(Ad ad) {
            FacebookAdapter.this.mBannerListener.onAdClicked(FacebookAdapter.this);
            FacebookAdapter.this.mBannerListener.onAdOpened(FacebookAdapter.this);
            FacebookAdapter.this.mBannerListener.onAdLeftApplication(FacebookAdapter.this);
        }

        @Override // com.facebook.ads.AdListener
        public void onAdLoaded(Ad ad) {
            FacebookAdapter.this.mBannerListener.onAdLoaded(FacebookAdapter.this);
        }

        @Override // com.facebook.ads.AdListener
        public void onError(Ad ad, AdError adError) {
            String errorMessage = adError.getErrorMessage();
            if (!TextUtils.isEmpty(errorMessage)) {
                Log.w(FacebookAdapter.TAG, errorMessage);
            }
            FacebookAdapter.this.mBannerListener.onAdFailedToLoad(FacebookAdapter.this, FacebookAdapter.this.convertErrorCode(adError));
        }
    }

    private class InterstitialListener implements InterstitialAdListener {
        @Override // com.facebook.ads.AdListener
        public void onLoggingImpression(Ad ad) {
        }

        private InterstitialListener() {
        }

        @Override // com.facebook.ads.AdListener
        public void onAdClicked(Ad ad) {
            FacebookAdapter.this.mInterstitialListener.onAdClicked(FacebookAdapter.this);
            FacebookAdapter.this.mInterstitialListener.onAdLeftApplication(FacebookAdapter.this);
        }

        @Override // com.facebook.ads.AdListener
        public void onAdLoaded(Ad ad) {
            FacebookAdapter.this.mInterstitialListener.onAdLoaded(FacebookAdapter.this);
        }

        @Override // com.facebook.ads.AdListener
        public void onError(Ad ad, AdError adError) {
            String errorMessage = adError.getErrorMessage();
            if (!TextUtils.isEmpty(errorMessage)) {
                Log.w(FacebookAdapter.TAG, errorMessage);
            }
            FacebookAdapter.this.mInterstitialListener.onAdFailedToLoad(FacebookAdapter.this, FacebookAdapter.this.convertErrorCode(adError));
        }

        @Override // com.facebook.ads.InterstitialAdListener
        public void onInterstitialDismissed(Ad ad) {
            FacebookAdapter.this.mInterstitialListener.onAdClosed(FacebookAdapter.this);
        }

        @Override // com.facebook.ads.InterstitialAdListener
        public void onInterstitialDisplayed(Ad ad) {
            FacebookAdapter.this.mInterstitialListener.onAdOpened(FacebookAdapter.this);
        }
    }

    private class RewardedVideoListener implements RewardedVideoAdListener {
        @Override // com.facebook.ads.RewardedVideoAdListener, com.facebook.ads.AdListener
        public void onLoggingImpression(Ad ad) {
        }

        private RewardedVideoListener() {
        }

        @Override // com.facebook.ads.RewardedVideoAdListener
        public void onRewardedVideoCompleted() {
            FacebookAdapter.this.mRewardedListener.onRewarded(FacebookAdapter.this, new FacebookReward());
        }

        @Override // com.facebook.ads.AdListener
        public void onError(Ad ad, AdError adError) {
            String errorMessage = adError.getErrorMessage();
            if (!TextUtils.isEmpty(errorMessage)) {
                Log.w(FacebookAdapter.TAG, errorMessage);
            }
            FacebookAdapter.this.mRewardedListener.onAdFailedToLoad(FacebookAdapter.this, FacebookAdapter.this.convertErrorCode(adError));
        }

        @Override // com.facebook.ads.AdListener
        public void onAdLoaded(Ad ad) {
            FacebookAdapter.this.mRewardedListener.onAdLoaded(FacebookAdapter.this);
        }

        @Override // com.facebook.ads.AdListener
        public void onAdClicked(Ad ad) {
            FacebookAdapter.this.mRewardedListener.onAdClicked(FacebookAdapter.this);
            FacebookAdapter.this.mRewardedListener.onAdLeftApplication(FacebookAdapter.this);
        }

        @Override // com.facebook.ads.RewardedVideoAdListener
        public void onRewardedVideoClosed() {
            FacebookAdapter.this.mRewardedListener.onAdClosed(FacebookAdapter.this);
        }
    }

    private class FacebookReward implements RewardItem {
        @Override // com.google.android.gms.ads.reward.RewardItem
        public int getAmount() {
            return 1;
        }

        @Override // com.google.android.gms.ads.reward.RewardItem
        public String getType() {
            return "";
        }

        private FacebookReward() {
        }
    }

    private class NativeListener implements AdListener {
        private NativeMediationAdRequest mMediationAdRequest;
        private NativeAd mNativeAd;

        private NativeListener(NativeAd nativeAd, NativeMediationAdRequest nativeMediationAdRequest) {
            this.mNativeAd = nativeAd;
            this.mMediationAdRequest = nativeMediationAdRequest;
        }

        @Override // com.facebook.ads.AdListener
        public void onAdClicked(Ad ad) {
            FacebookAdapter.this.mNativeListener.onAdClicked(FacebookAdapter.this);
            FacebookAdapter.this.mNativeListener.onAdOpened(FacebookAdapter.this);
            FacebookAdapter.this.mNativeListener.onAdLeftApplication(FacebookAdapter.this);
        }

        @Override // com.facebook.ads.AdListener
        public void onLoggingImpression(Ad ad) {
            if (!FacebookAdapter.this.mIsImpressionRecorded) {
                FacebookAdapter.this.mNativeListener.onAdImpression(FacebookAdapter.this);
                FacebookAdapter.this.mIsImpressionRecorded = true;
            } else {
                Log.d(FacebookAdapter.TAG, "Received onLoggingImpression callback for a native whose impression is already recorded. Ignoring the duplicate callback.");
            }
        }

        @Override // com.facebook.ads.AdListener
        public void onAdLoaded(Ad ad) {
            if (ad != this.mNativeAd) {
                Log.w(FacebookAdapter.TAG, "Ad loaded is not a native ad.");
                FacebookAdapter.this.mNativeListener.onAdFailedToLoad(FacebookAdapter.this, 0);
            } else {
                final AppInstallMapper appInstallMapper = FacebookAdapter.this.new AppInstallMapper(this.mNativeAd, this.mMediationAdRequest.getNativeAdOptions());
                appInstallMapper.mapNativeAd(new NativeAdMapperListener() { // from class: com.google.ads.mediation.facebook.FacebookAdapter.NativeListener.1
                    @Override // com.google.ads.mediation.facebook.FacebookAdapter.NativeAdMapperListener
                    public void onMappingSuccess() {
                        FacebookAdapter.this.mNativeListener.onAdLoaded(FacebookAdapter.this, appInstallMapper);
                    }

                    @Override // com.google.ads.mediation.facebook.FacebookAdapter.NativeAdMapperListener
                    public void onMappingFailed() {
                        FacebookAdapter.this.mNativeListener.onAdFailedToLoad(FacebookAdapter.this, 3);
                    }
                });
            }
        }

        @Override // com.facebook.ads.AdListener
        public void onError(Ad ad, AdError adError) {
            String errorMessage = adError.getErrorMessage();
            if (!TextUtils.isEmpty(errorMessage)) {
                Log.w(FacebookAdapter.TAG, errorMessage);
            }
            FacebookAdapter.this.mNativeListener.onAdFailedToLoad(FacebookAdapter.this, FacebookAdapter.this.convertErrorCode(adError));
        }
    }

    private com.facebook.ads.AdSize getAdSize(Context context, AdSize adSize) {
        if (adSize.getWidth() == com.facebook.ads.AdSize.BANNER_320_50.getWidth() && adSize.getHeight() == com.facebook.ads.AdSize.BANNER_320_50.getHeight()) {
            return com.facebook.ads.AdSize.BANNER_320_50;
        }
        int pixelToDip = pixelToDip(adSize.getHeightInPixels(context));
        if (pixelToDip == com.facebook.ads.AdSize.BANNER_HEIGHT_50.getHeight()) {
            return com.facebook.ads.AdSize.BANNER_HEIGHT_50;
        }
        if (pixelToDip == com.facebook.ads.AdSize.BANNER_HEIGHT_90.getHeight()) {
            return com.facebook.ads.AdSize.BANNER_HEIGHT_90;
        }
        if (pixelToDip == com.facebook.ads.AdSize.RECTANGLE_HEIGHT_250.getHeight()) {
            return com.facebook.ads.AdSize.RECTANGLE_HEIGHT_250;
        }
        return null;
    }

    private int pixelToDip(int i) {
        return Math.round(i / Resources.getSystem().getDisplayMetrics().density);
    }

    private static int getGMSVersionCode(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    class AppInstallMapper extends NativeAppInstallAdMapper {
        private NativeAd mNativeAd;
        private NativeAdOptions mNativeAdOptions;

        public AppInstallMapper(NativeAd nativeAd, NativeAdOptions nativeAdOptions) {
            this.mNativeAd = nativeAd;
            this.mNativeAdOptions = nativeAdOptions;
        }

        public void mapNativeAd(NativeAdMapperListener nativeAdMapperListener) {
            if (!containsRequiredFieldsForNativeAppInstallAd(this.mNativeAd)) {
                Log.w(FacebookAdapter.TAG, "Ad from Facebook doesn't have all assets required for the app install format.");
                nativeAdMapperListener.onMappingFailed();
                return;
            }
            setHeadline(this.mNativeAd.getAdTitle());
            ArrayList arrayList = new ArrayList();
            arrayList.add(FacebookAdapter.this.new FacebookAdapterNativeAdImage(Uri.parse(this.mNativeAd.getAdCoverImage().getUrl())));
            setImages(arrayList);
            setBody(this.mNativeAd.getAdBody());
            setIcon(FacebookAdapter.this.new FacebookAdapterNativeAdImage(Uri.parse(this.mNativeAd.getAdIcon().getUrl())));
            setCallToAction(this.mNativeAd.getAdCallToAction());
            FacebookAdapter.this.mMediaView.setListener(new MediaViewListener() { // from class: com.google.ads.mediation.facebook.FacebookAdapter.AppInstallMapper.1
                @Override // com.facebook.ads.MediaViewListener
                public void onEnterFullscreen(MediaView mediaView) {
                }

                @Override // com.facebook.ads.MediaViewListener
                public void onExitFullscreen(MediaView mediaView) {
                }

                @Override // com.facebook.ads.MediaViewListener
                public void onFullscreenBackground(MediaView mediaView) {
                }

                @Override // com.facebook.ads.MediaViewListener
                public void onFullscreenForeground(MediaView mediaView) {
                }

                @Override // com.facebook.ads.MediaViewListener
                public void onPause(MediaView mediaView) {
                }

                @Override // com.facebook.ads.MediaViewListener
                public void onPlay(MediaView mediaView) {
                }

                @Override // com.facebook.ads.MediaViewListener
                public void onVolumeChange(MediaView mediaView, float f) {
                }

                @Override // com.facebook.ads.MediaViewListener
                public void onComplete(MediaView mediaView) {
                    if (FacebookAdapter.this.mNativeListener != null) {
                        FacebookAdapter.this.mNativeListener.onVideoEnd(FacebookAdapter.this);
                    }
                }
            });
            FacebookAdapter.this.mMediaView.setNativeAd(this.mNativeAd);
            setMediaView(FacebookAdapter.this.mMediaView);
            setHasVideoContent(true);
            Double rating = getRating(this.mNativeAd.getAdStarRating());
            if (rating != null) {
                setStarRating(rating.doubleValue());
            }
            Bundle bundle = new Bundle();
            bundle.putCharSequence("id", this.mNativeAd.getId());
            bundle.putCharSequence(FacebookAdapter.KEY_SOCIAL_CONTEXT_ASSET, this.mNativeAd.getAdSocialContext());
            bundle.putCharSequence(FacebookAdapter.KEY_SUBTITLE_ASSET, this.mNativeAd.getAdSubtitle());
            NativeAdViewAttributes adViewAttributes = this.mNativeAd.getAdViewAttributes();
            if (adViewAttributes != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("autoplay", adViewAttributes.getAutoplay());
                bundle2.putInt(FacebookAdapter.KEY_BACKGROUND_COLOR, adViewAttributes.getBackgroundColor());
                bundle2.putInt(FacebookAdapter.KEY_BUTTON_BORDER_COLOR, adViewAttributes.getButtonBorderColor());
                bundle2.putInt(FacebookAdapter.KEY_BUTTON_COLOR, adViewAttributes.getButtonColor());
                bundle2.putInt(FacebookAdapter.KEY_BUTTON_TEXT_COLOR, adViewAttributes.getButtonTextColor());
                bundle2.putInt(FacebookAdapter.KEY_DESCRIPTION_TEXT_COLOR, adViewAttributes.getDescriptionTextColor());
                bundle2.putInt(FacebookAdapter.KEY_DESCRIPTION_TEXT_SIZE, adViewAttributes.getDescriptionTextSize());
                bundle2.putInt(FacebookAdapter.KEY_TITLE_TEXT_COLOR, adViewAttributes.getTitleTextColor());
                bundle2.putInt(FacebookAdapter.KEY_TITLE_TEXT_SIZE, adViewAttributes.getTitleTextSize());
                Typeface typeface = adViewAttributes.getTypeface();
                if (typeface != null) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putBoolean(FacebookAdapter.KEY_IS_BOLD, typeface.isBold());
                    bundle3.putBoolean(FacebookAdapter.KEY_IS_ITALIC, typeface.isItalic());
                    bundle3.putInt("style", typeface.getStyle());
                    bundle2.putBundle(FacebookAdapter.KEY_TYPEFACE, bundle3);
                }
                bundle.putBundle(FacebookAdapter.KEY_AD_VIEW_ATTRIBUTES, bundle2);
            }
            setExtras(bundle);
            if (this.mNativeAdOptions != null ? this.mNativeAdOptions.shouldReturnUrlsForImageAssets() : false) {
                nativeAdMapperListener.onMappingSuccess();
            } else {
                new DownloadDrawablesAsync(nativeAdMapperListener).execute(this);
            }
        }

        private boolean containsRequiredFieldsForNativeAppInstallAd(NativeAd nativeAd) {
            return (nativeAd.getAdTitle() == null || nativeAd.getAdCoverImage() == null || nativeAd.getAdBody() == null || nativeAd.getAdIcon() == null || nativeAd.getAdCallToAction() == null || FacebookAdapter.this.mMediaView == null) ? false : true;
        }

        @Override // com.google.android.gms.ads.mediation.NativeAdMapper
        public void trackViews(View view, Map<String, View> map, Map<String, View> map2) {
            ViewGroup viewGroup = (ViewGroup) view;
            View childAt = viewGroup.getChildAt(viewGroup.getChildCount() - 1);
            if (childAt instanceof FrameLayout) {
                AdChoicesView adChoicesView = new AdChoicesView(view.getContext(), this.mNativeAd, FacebookAdapter.this.mIsAdChoicesIconExpandable);
                ((ViewGroup) childAt).addView(adChoicesView);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) adChoicesView.getLayoutParams();
                if (this.mNativeAdOptions != null) {
                    int adChoicesPlacement = this.mNativeAdOptions.getAdChoicesPlacement();
                    if (adChoicesPlacement == 0) {
                        layoutParams.gravity = 51;
                    } else {
                        switch (adChoicesPlacement) {
                            case 2:
                                layoutParams.gravity = 85;
                                break;
                            case 3:
                                layoutParams.gravity = 83;
                                break;
                            default:
                                layoutParams.gravity = 53;
                                break;
                        }
                    }
                } else {
                    layoutParams.gravity = 53;
                }
                viewGroup.requestLayout();
            } else {
                Log.w(FacebookAdapter.TAG, "Failed to show AdChoices icon.");
            }
            setOverrideImpressionRecording(true);
            setOverrideClickHandling(true);
            ArrayList arrayList = new ArrayList();
            Iterator<Map.Entry<String, View>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getValue());
            }
            this.mNativeAd.registerViewForInteraction(view, arrayList);
        }

        @Override // com.google.android.gms.ads.mediation.NativeAdMapper
        public void untrackView(View view) {
            super.untrackView(view);
            View childAt = ((ViewGroup) view).getChildAt(r2.getChildCount() - 1);
            if (childAt instanceof FrameLayout) {
                ((FrameLayout) childAt).removeAllViews();
            }
            this.mNativeAd.unregisterView();
        }

        private Double getRating(NativeAd.Rating rating) {
            if (rating == null) {
                return null;
            }
            return Double.valueOf((rating.getValue() * 5.0d) / rating.getScale());
        }
    }

    private static class DownloadDrawablesAsync extends AsyncTask<Object, Void, Boolean> {
        private NativeAdMapperListener mDrawableListener;

        public DownloadDrawablesAsync(NativeAdMapperListener nativeAdMapperListener) {
            this.mDrawableListener = nativeAdMapperListener;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.AsyncTask
        public Boolean doInBackground(Object... objArr) {
            AppInstallMapper appInstallMapper = (AppInstallMapper) objArr[0];
            ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
            HashMap hashMap = new HashMap();
            List<NativeAd.Image> images = appInstallMapper.getImages();
            for (int i = 0; i < images.size(); i++) {
                FacebookAdapterNativeAdImage facebookAdapterNativeAdImage = (FacebookAdapterNativeAdImage) images.get(i);
                hashMap.put(facebookAdapterNativeAdImage, getDrawableFuture(facebookAdapterNativeAdImage.getUri(), newCachedThreadPool));
            }
            FacebookAdapterNativeAdImage facebookAdapterNativeAdImage2 = (FacebookAdapterNativeAdImage) appInstallMapper.getIcon();
            hashMap.put(facebookAdapterNativeAdImage2, getDrawableFuture(facebookAdapterNativeAdImage2.getUri(), newCachedThreadPool));
            for (Map.Entry entry : hashMap.entrySet()) {
                try {
                    ((FacebookAdapterNativeAdImage) entry.getKey()).setDrawable((Drawable) ((Future) entry.getValue()).get(10L, TimeUnit.SECONDS));
                } catch (InterruptedException | ExecutionException | TimeoutException e) {
                    Log.w(FacebookAdapter.TAG, "Exception occurred while waiting for future to return. Returning null as drawable : " + e);
                    return false;
                }
            }
            return true;
        }

        private Future<Drawable> getDrawableFuture(final Uri uri, ExecutorService executorService) {
            return executorService.submit(new Callable<Drawable>() { // from class: com.google.ads.mediation.facebook.FacebookAdapter.DownloadDrawablesAsync.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                public Drawable call() throws Exception {
                    Bitmap decodeStream = BitmapFactory.decodeStream(new URL(uri.toString()).openStream());
                    decodeStream.setDensity(DimenUtils.DENSITY_MEDIUM);
                    return new BitmapDrawable(Resources.getSystem(), decodeStream);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(Boolean bool) {
            super.onPostExecute((DownloadDrawablesAsync) bool);
            if (bool.booleanValue()) {
                this.mDrawableListener.onMappingSuccess();
            } else {
                this.mDrawableListener.onMappingFailed();
            }
        }
    }

    public static class FacebookExtrasBundleBuilder {
        private static final String KEY_EXPANDABLE_ICON = "expandable_icon";
        private boolean mIsExpandableIcon;

        public FacebookExtrasBundleBuilder setNativeAdChoicesIconExpandable(boolean z) {
            this.mIsExpandableIcon = z;
            return this;
        }

        public Bundle build() {
            Bundle bundle = new Bundle();
            bundle.putBoolean(KEY_EXPANDABLE_ICON, this.mIsExpandableIcon);
            return bundle;
        }
    }

    private class FacebookAdapterNativeAdImage extends NativeAd.Image {
        private Drawable mDrawable;
        private Uri mUri;

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public double getScale() {
            return 1.0d;
        }

        public FacebookAdapterNativeAdImage(Uri uri) {
            this.mUri = uri;
        }

        protected void setDrawable(Drawable drawable) {
            this.mDrawable = drawable;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public Drawable getDrawable() {
            return this.mDrawable;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public Uri getUri() {
            return this.mUri;
        }
    }
}
