package com.mopub.mobileads;

import android.app.Activity;
import android.os.Handler;
import com.mopub.common.DataKeys;
import com.mopub.common.LifecycleListener;
import com.mopub.common.Preconditions;
import com.mopub.common.VisibleForTesting;
import com.mopub.common.logging.MoPubLog;
import com.mopub.mobileads.AdTypeTranslator;
import com.mopub.mobileads.CustomEventInterstitial;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class MoPubRewardedAd extends CustomEventRewardedAd {
    protected String mAdUnitId;
    private boolean mIsLoaded;
    private int mRewardedAdCurrencyAmount;
    private String mRewardedAdCurrencyName;

    @Override // com.mopub.mobileads.CustomEventRewardedAd
    protected boolean checkAndInitializeSdk(Activity activity, Map<String, Object> map, Map<String, String> map2) throws Exception {
        return false;
    }

    @Override // com.mopub.mobileads.CustomEventRewardedAd
    protected LifecycleListener getLifecycleListener() {
        return null;
    }

    @Override // com.mopub.mobileads.CustomEventRewardedAd
    protected void loadWithSdkInitialized(Activity activity, Map<String, Object> map, Map<String, String> map2) throws Exception {
        Preconditions.checkNotNull(activity, "activity cannot be null");
        Preconditions.checkNotNull(map, "localExtras cannot be null");
        Preconditions.checkNotNull(map2, "serverExtras cannot be null");
        Object obj = map.get(DataKeys.REWARDED_AD_CURRENCY_NAME_KEY);
        if (obj instanceof String) {
            this.mRewardedAdCurrencyName = (String) obj;
        } else {
            MoPubLog.d("No currency name specified for rewarded video. Using the default name.");
            this.mRewardedAdCurrencyName = "";
        }
        Object obj2 = map.get(DataKeys.REWARDED_AD_CURRENCY_AMOUNT_STRING_KEY);
        if (obj2 instanceof String) {
            try {
                this.mRewardedAdCurrencyAmount = Integer.parseInt((String) obj2);
            } catch (NumberFormatException unused) {
                MoPubLog.d("Unable to convert currency amount: " + obj2 + ". Using the default reward amount: 0");
                this.mRewardedAdCurrencyAmount = 0;
            }
        } else {
            MoPubLog.d("No currency amount specified for rewarded ad. Using the default reward amount: 0");
            this.mRewardedAdCurrencyAmount = 0;
        }
        if (this.mRewardedAdCurrencyAmount < 0) {
            MoPubLog.d("Negative currency amount specified for rewarded ad. Using the default reward amount: 0");
            this.mRewardedAdCurrencyAmount = 0;
        }
        Object obj3 = map.get(DataKeys.AD_UNIT_ID_KEY);
        if (obj3 instanceof String) {
            this.mAdUnitId = (String) obj3;
        } else {
            MoPubLog.d("Unable to set ad unit for rewarded ad.");
        }
    }

    @Override // com.mopub.mobileads.CustomEventRewardedAd
    protected void onInvalidate() {
        this.mIsLoaded = false;
    }

    @Override // com.mopub.mobileads.CustomEventRewardedAd
    protected boolean isReady() {
        return this.mIsLoaded;
    }

    protected class MoPubRewardedAdListener implements CustomEventInterstitial.CustomEventInterstitialListener {
        private final Runnable mAdExpiration;
        final Class<? extends MoPubRewardedAd> mCustomEventClass;
        private Handler mHandler;

        @Override // com.mopub.mobileads.CustomEventInterstitial.CustomEventInterstitialListener
        public void onLeaveApplication() {
        }

        public MoPubRewardedAdListener(Class<? extends MoPubRewardedAd> cls) {
            Preconditions.checkNotNull(cls);
            this.mCustomEventClass = cls;
            this.mHandler = new Handler();
            this.mAdExpiration = new Runnable() { // from class: com.mopub.mobileads.MoPubRewardedAd.MoPubRewardedAdListener.1
                @Override // java.lang.Runnable
                public void run() {
                    MoPubLog.d("Expiring unused Rewarded ad.");
                    MoPubRewardedAdListener.this.onInterstitialFailed(MoPubErrorCode.EXPIRED);
                }
            };
        }

        @Override // com.mopub.mobileads.CustomEventInterstitial.CustomEventInterstitialListener
        public void onInterstitialLoaded() {
            MoPubRewardedAd.this.mIsLoaded = true;
            if (AdTypeTranslator.CustomEventType.isMoPubSpecific(this.mCustomEventClass.getName())) {
                this.mHandler.postDelayed(this.mAdExpiration, 14400000L);
            }
            MoPubRewardedVideoManager.onRewardedVideoLoadSuccess(this.mCustomEventClass, MoPubRewardedAd.this.getAdNetworkId());
        }

        @Override // com.mopub.mobileads.CustomEventInterstitial.CustomEventInterstitialListener
        public void onInterstitialFailed(MoPubErrorCode moPubErrorCode) {
            this.mHandler.removeCallbacks(this.mAdExpiration);
            if (AnonymousClass1.$SwitchMap$com$mopub$mobileads$MoPubErrorCode[moPubErrorCode.ordinal()] == 1) {
                MoPubRewardedVideoManager.onRewardedVideoPlaybackError(this.mCustomEventClass, MoPubRewardedAd.this.getAdNetworkId(), moPubErrorCode);
            } else {
                MoPubRewardedVideoManager.onRewardedVideoLoadFailure(this.mCustomEventClass, MoPubRewardedAd.this.getAdNetworkId(), moPubErrorCode);
            }
        }

        @Override // com.mopub.mobileads.CustomEventInterstitial.CustomEventInterstitialListener
        public void onInterstitialShown() {
            this.mHandler.removeCallbacks(this.mAdExpiration);
            MoPubRewardedVideoManager.onRewardedVideoStarted(this.mCustomEventClass, MoPubRewardedAd.this.getAdNetworkId());
        }

        @Override // com.mopub.mobileads.CustomEventInterstitial.CustomEventInterstitialListener
        public void onInterstitialClicked() {
            MoPubRewardedVideoManager.onRewardedVideoClicked(this.mCustomEventClass, MoPubRewardedAd.this.getAdNetworkId());
        }

        @Override // com.mopub.mobileads.CustomEventInterstitial.CustomEventInterstitialListener
        public void onInterstitialDismissed() {
            MoPubRewardedVideoManager.onRewardedVideoClosed(this.mCustomEventClass, MoPubRewardedAd.this.getAdNetworkId());
            MoPubRewardedAd.this.onInvalidate();
        }

        @VisibleForTesting
        @Deprecated
        void setHandler(Handler handler) {
            this.mHandler = handler;
        }
    }

    /* renamed from: com.mopub.mobileads.MoPubRewardedAd$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$mopub$mobileads$MoPubErrorCode = new int[MoPubErrorCode.values().length];

        static {
            try {
                $SwitchMap$com$mopub$mobileads$MoPubErrorCode[MoPubErrorCode.VIDEO_PLAYBACK_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    protected String getRewardedAdCurrencyName() {
        return this.mRewardedAdCurrencyName;
    }

    protected int getRewardedAdCurrencyAmount() {
        return this.mRewardedAdCurrencyAmount;
    }

    @VisibleForTesting
    @Deprecated
    void setIsLoaded(boolean z) {
        this.mIsLoaded = z;
    }

    @VisibleForTesting
    @Deprecated
    MoPubRewardedAdListener createListener(Class<? extends MoPubRewardedAd> cls) {
        return new MoPubRewardedAdListener(cls);
    }
}
