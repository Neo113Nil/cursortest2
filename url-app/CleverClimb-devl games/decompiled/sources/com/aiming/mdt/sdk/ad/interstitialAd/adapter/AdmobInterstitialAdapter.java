package com.aiming.mdt.sdk.ad.interstitialAd.adapter;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.view.PointerIconCompat;
import android.text.TextUtils;
import com.aiming.mdt.AdtAds;
import com.aiming.mdt.Callback;
import com.aiming.mdt.interstitial.InterstitialAd;
import com.aiming.mdt.interstitial.InterstitialAdListener;
import com.aiming.mdt.utils.AdLog;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.OnContextChangedListener;
import com.google.android.gms.ads.mediation.customevent.CustomEventInterstitial;
import com.google.android.gms.ads.mediation.customevent.CustomEventInterstitialListener;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public class AdmobInterstitialAdapter implements OnContextChangedListener, CustomEventInterstitial {
    private String currentPId;
    private Lock lock = new ReentrantLock();
    private Activity mActivity;
    private CustomEventInterstitialListener mCustomEventInterstitialListener;
    private InterstitialAd mInterstitialAd;

    private boolean isValidContext(Context context) {
        AdLog singleton;
        String str;
        if (context == null) {
            singleton = AdLog.getSingleton();
            str = "AdmobInterstitialAdapter Context cannot be null.";
        } else {
            if (context instanceof Activity) {
                return true;
            }
            singleton = AdLog.getSingleton();
            str = "AdmobInterstitialAdapter Context is not an Activity. adt Ads requires an Activity context to load ads.";
        }
        singleton.LogD(str);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadInterstitialAd() {
        if (this.mInterstitialAd == null) {
            makeAd();
        }
        this.mInterstitialAd.loadAd();
    }

    private void makeAd() {
        this.mInterstitialAd = new InterstitialAd(this.mActivity, this.currentPId, new InterstitialAdListener() { // from class: com.aiming.mdt.sdk.ad.interstitialAd.adapter.AdmobInterstitialAdapter.2
            @Override // com.aiming.mdt.interstitial.InterstitialAdListener
            public void onAdClicked() {
                AdLog.getSingleton().LogD("AdmobInterstitialAdapter----InterstitialAd-onADClick()-----");
                if (AdmobInterstitialAdapter.this.mCustomEventInterstitialListener != null) {
                    AdmobInterstitialAdapter.this.mCustomEventInterstitialListener.onAdClicked();
                    AdmobInterstitialAdapter.this.mCustomEventInterstitialListener.onAdLeftApplication();
                }
            }

            @Override // com.aiming.mdt.interstitial.InterstitialAdListener
            public void onAdClosed() {
                AdLog.getSingleton().LogD("AdmobInterstitialAdapter----InterstitialAd-onADClose()-----");
                if (AdmobInterstitialAdapter.this.mCustomEventInterstitialListener != null) {
                    AdmobInterstitialAdapter.this.mCustomEventInterstitialListener.onAdClosed();
                }
            }

            @Override // com.aiming.mdt.core.AdListener
            public void onAdFailed(String str) {
                AdLog singleton = AdLog.getSingleton();
                StringBuilder sb = new StringBuilder("AdmobInterstitialAdapter----InterstitialAd-onADFail()-----msg=");
                sb.append(str);
                singleton.LogD(sb.toString());
                if (AdmobInterstitialAdapter.this.mCustomEventInterstitialListener != null) {
                    AdmobInterstitialAdapter.this.mCustomEventInterstitialListener.onAdFailedToLoad(PointerIconCompat.TYPE_HELP);
                }
            }

            @Override // com.aiming.mdt.interstitial.InterstitialAdListener
            public void onAdReady() {
                AdLog.getSingleton().LogD("AdmobInterstitialAdapter----InterstitialAd-onADReady()-----");
                if (AdmobInterstitialAdapter.this.mCustomEventInterstitialListener != null) {
                    AdmobInterstitialAdapter.this.mCustomEventInterstitialListener.onAdLoaded();
                }
            }
        });
    }

    @Override // com.google.android.gms.ads.mediation.OnContextChangedListener
    public void onContextChanged(Context context) {
        AdLog.getSingleton().LogD("AdmobInterstitialAdapter----onContextChanged---");
        if (isValidContext(context)) {
            this.mActivity = (Activity) context;
        }
    }

    public void onDestroy() {
        AdLog.getSingleton().LogD("AdmobInterstitialAdapter----onDestroy()---");
    }

    public void onPause() {
        AdLog.getSingleton().LogD("AdmobInterstitialAdapter----onPause()---");
    }

    public void onResume() {
        AdLog.getSingleton().LogD("AdmobInterstitialAdapter----onResume()---");
    }

    public void requestInterstitialAd(Context context, CustomEventInterstitialListener customEventInterstitialListener, String str, MediationAdRequest mediationAdRequest, Bundle bundle) {
        this.lock.lock();
        try {
            try {
                AdLog singleton = AdLog.getSingleton();
                StringBuilder sb = new StringBuilder("AdmobInterstitialAdapter----requestInterstitialAd---");
                sb.append(toString());
                singleton.LogD(sb.toString());
                this.mCustomEventInterstitialListener = customEventInterstitialListener;
                if (isValidContext(context)) {
                    String str2 = "";
                    if (!TextUtils.isEmpty(str) && str.contains("_")) {
                        String[] split = str.split("_");
                        String str3 = split[0];
                        this.currentPId = split[1];
                        AdLog singleton2 = AdLog.getSingleton();
                        StringBuilder sb2 = new StringBuilder("AdmobInterstitialAdapter----requestInterstitialAd---appKey=");
                        sb2.append(str3);
                        singleton2.LogD(sb2.toString());
                        AdLog singleton3 = AdLog.getSingleton();
                        StringBuilder sb3 = new StringBuilder("AdmobInterstitialAdapter----requestInterstitialAd---currentPId=");
                        sb3.append(this.currentPId);
                        singleton3.LogD(sb3.toString());
                        str2 = str3;
                    }
                    if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(this.currentPId)) {
                        this.mActivity = (Activity) context;
                        AdLog singleton4 = AdLog.getSingleton();
                        StringBuilder sb4 = new StringBuilder("AdmobInterstitialAdapter----requestInterstitialAd---AdtAds.isInitialized()=");
                        sb4.append(AdtAds.isInit());
                        singleton4.LogD(sb4.toString());
                        if (AdtAds.isInit()) {
                            loadInterstitialAd();
                        } else {
                            AdtAds.init(this.mActivity, str2, new Callback() { // from class: com.aiming.mdt.sdk.ad.interstitialAd.adapter.AdmobInterstitialAdapter.1
                                @Override // com.aiming.mdt.Callback
                                public void onError(String str4) {
                                }

                                @Override // com.aiming.mdt.Callback
                                public void onSuccess() {
                                    AdmobInterstitialAdapter.this.loadInterstitialAd();
                                }
                            });
                        }
                    }
                    AdLog.getSingleton().LogD("AdmobInterstitialAdapter----requestInterstitialAd---appKey or mPlacementId is null");
                    if (this.mCustomEventInterstitialListener != null) {
                        this.mCustomEventInterstitialListener.onAdFailedToLoad(1001);
                    }
                } else if (this.mCustomEventInterstitialListener != null) {
                    this.mCustomEventInterstitialListener.onAdFailedToLoad(1000);
                }
            } catch (Exception e) {
                AdLog.getSingleton().LogD("admob intersital adapter error", e);
            }
        } finally {
            this.lock.unlock();
        }
    }

    public void showInterstitial() {
        AdLog.getSingleton().LogD("AdmobInterstitialAdapter----showInterstitial---");
        if (this.mInterstitialAd == null || this.mActivity == null || !this.mInterstitialAd.isReady()) {
            return;
        }
        this.mInterstitialAd.showAd();
        if (this.mCustomEventInterstitialListener != null) {
            this.mCustomEventInterstitialListener.onAdOpened();
        }
    }
}
