package com.mopub.mobileads;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.aiming.mdt.AdtAds;
import com.aiming.mdt.Callback;
import com.aiming.mdt.interstitial.InterstitialAd;
import com.aiming.mdt.interstitial.InterstitialAdListener;
import com.aiming.mdt.utils.AdLog;
import com.mopub.mobileads.CustomEventInterstitial;
import java.util.Map;

/* loaded from: classes2.dex */
public class AdtInterstitial extends CustomEventInterstitial {
    private static final String APP_KEY = "app_key";
    private static final String COMPATIBLE_IOS_APP_KEY = "appKey";
    private static final String COMPATIBLE_IOS_PLACEMENT_ID = "placementId";
    private static final String PLACEMENT_ID = "placement_id";
    private static final String TAG = "AdtInterstitial";
    private String appKey;
    private InterstitialAd interstitialAd;
    private Activity mActivity;
    private CustomEventInterstitial.CustomEventInterstitialListener mCustomEventInterstitialListener;
    private String placementId;
    private String prePId;

    private boolean isValidContext(Context context) {
        AdLog singleton;
        String str;
        if (context == null) {
            singleton = AdLog.getSingleton();
            str = "AdtInterstitial Context cannot be null.";
        } else {
            if (context instanceof Activity) {
                return true;
            }
            singleton = AdLog.getSingleton();
            str = "AdtInterstitial Context is not an Activity. adt Ads requires an Activity context to load ads.";
        }
        singleton.LogD(str);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
    
        if (r3.prePId.equals(r5) == false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void loadAd(Activity activity, String str) {
        AdLog singleton = AdLog.getSingleton();
        StringBuilder sb = new StringBuilder();
        sb.append(TAG);
        sb.append("--loadAd()--pId=");
        sb.append(str);
        singleton.LogD(sb.toString());
        if (this.interstitialAd != null) {
            if (!TextUtils.isEmpty(this.prePId)) {
            }
            this.prePId = str;
            this.interstitialAd.loadAd();
        }
        makeAd(activity, str);
        this.prePId = str;
        this.interstitialAd.loadAd();
    }

    private void makeAd(Activity activity, String str) {
        this.interstitialAd = new InterstitialAd(activity, str, new InterstitialAdListener() { // from class: com.mopub.mobileads.AdtInterstitial.2
            @Override // com.aiming.mdt.interstitial.InterstitialAdListener
            public void onAdClicked() {
                AdLog singleton = AdLog.getSingleton();
                StringBuilder sb = new StringBuilder();
                sb.append(AdtInterstitial.TAG);
                sb.append("--interstitialAd click");
                singleton.LogD(sb.toString());
                if (AdtInterstitial.this.mCustomEventInterstitialListener != null) {
                    AdtInterstitial.this.mCustomEventInterstitialListener.onInterstitialClicked();
                    AdtInterstitial.this.mCustomEventInterstitialListener.onLeaveApplication();
                }
            }

            @Override // com.aiming.mdt.interstitial.InterstitialAdListener
            public void onAdClosed() {
                AdLog singleton = AdLog.getSingleton();
                StringBuilder sb = new StringBuilder();
                sb.append(AdtInterstitial.TAG);
                sb.append("--interstitialAd close");
                singleton.LogD(sb.toString());
                if (AdtInterstitial.this.mCustomEventInterstitialListener != null) {
                    AdtInterstitial.this.mCustomEventInterstitialListener.onInterstitialDismissed();
                }
            }

            @Override // com.aiming.mdt.core.AdListener
            public void onAdFailed(String str2) {
                String format = String.format("interstitialAd Fail : %s", str2);
                AdLog singleton = AdLog.getSingleton();
                StringBuilder sb = new StringBuilder();
                sb.append(AdtInterstitial.TAG);
                sb.append(format);
                singleton.LogD(sb.toString());
                if (AdtInterstitial.this.mCustomEventInterstitialListener != null) {
                    AdtInterstitial.this.mCustomEventInterstitialListener.onInterstitialFailed(MoPubErrorCode.NO_FILL);
                }
            }

            @Override // com.aiming.mdt.interstitial.InterstitialAdListener
            public void onAdReady() {
                AdLog singleton = AdLog.getSingleton();
                StringBuilder sb = new StringBuilder();
                sb.append(AdtInterstitial.TAG);
                sb.append("--interstitialAd ready--");
                singleton.LogD(sb.toString());
                if (AdtInterstitial.this.mCustomEventInterstitialListener != null) {
                    AdtInterstitial.this.mCustomEventInterstitialListener.onInterstitialLoaded();
                }
            }
        });
    }

    @Override // com.mopub.mobileads.CustomEventInterstitial
    protected void loadInterstitial(Context context, CustomEventInterstitial.CustomEventInterstitialListener customEventInterstitialListener, Map<String, Object> map, Map<String, String> map2) {
        AdLog singleton = AdLog.getSingleton();
        StringBuilder sb = new StringBuilder();
        sb.append(TAG);
        sb.append("--loadInterstitial()--");
        singleton.LogD(sb.toString());
        this.mCustomEventInterstitialListener = customEventInterstitialListener;
        if (!isValidContext(context)) {
            if (this.mCustomEventInterstitialListener != null) {
                this.mCustomEventInterstitialListener.onInterstitialFailed(MoPubErrorCode.ADAPTER_CONFIGURATION_ERROR);
                return;
            }
            return;
        }
        this.mActivity = (Activity) context;
        if (map2 != null) {
            this.appKey = map2.get(APP_KEY);
            this.placementId = map2.get(PLACEMENT_ID);
            if (TextUtils.isEmpty(this.appKey)) {
                this.appKey = map2.get(COMPATIBLE_IOS_APP_KEY);
            }
            if (TextUtils.isEmpty(this.placementId)) {
                this.placementId = map2.get("placementId");
            }
            AdLog singleton2 = AdLog.getSingleton();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(TAG);
            sb2.append("---appKey=");
            sb2.append(this.appKey);
            singleton2.LogD(sb2.toString());
            AdLog singleton3 = AdLog.getSingleton();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(TAG);
            sb3.append("---placementId=");
            sb3.append(this.placementId);
            singleton3.LogD(sb3.toString());
        }
        if (TextUtils.isEmpty(this.appKey) || TextUtils.isEmpty(this.placementId)) {
            if (this.mCustomEventInterstitialListener != null) {
                this.mCustomEventInterstitialListener.onInterstitialFailed(MoPubErrorCode.ADAPTER_CONFIGURATION_ERROR);
            }
        } else if (AdtAds.isInit()) {
            loadAd(this.mActivity, this.placementId);
        } else {
            AdtAds.init(this.mActivity, this.appKey, new Callback() { // from class: com.mopub.mobileads.AdtInterstitial.1
                @Override // com.aiming.mdt.Callback
                public void onError(String str) {
                }

                @Override // com.aiming.mdt.Callback
                public void onSuccess() {
                    AdtInterstitial.this.loadAd(AdtInterstitial.this.mActivity, AdtInterstitial.this.placementId);
                }
            });
        }
    }

    @Override // com.mopub.mobileads.CustomEventInterstitial
    protected void onInvalidate() {
        AdLog singleton = AdLog.getSingleton();
        StringBuilder sb = new StringBuilder();
        sb.append(TAG);
        sb.append("--onInvalidate()--");
        singleton.LogD(sb.toString());
    }

    @Override // com.mopub.mobileads.CustomEventInterstitial
    protected void showInterstitial() {
        AdLog singleton = AdLog.getSingleton();
        StringBuilder sb = new StringBuilder();
        sb.append(TAG);
        sb.append("--showInterstitial()--");
        singleton.LogD(sb.toString());
        if (this.interstitialAd != null && this.interstitialAd.isReady()) {
            this.interstitialAd.showAd();
        }
        if (this.mCustomEventInterstitialListener != null) {
            this.mCustomEventInterstitialListener.onInterstitialShown();
        }
    }
}
