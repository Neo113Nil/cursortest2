package com.google.ads.mediation.ironsource;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.ironsource.b.d.b;
import com.ironsource.b.f.f;
import com.ironsource.b.k;

/* loaded from: classes.dex */
public class IronSourceAdapter extends IronSourceBaseAdapter implements MediationInterstitialAdapter, f {
    private static boolean mDidInitInterstitial;
    private MediationInterstitialListener mInterstitialListener;

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onDestroy() {
    }

    @Override // com.ironsource.b.f.f
    public void onInterstitialAdShowSucceeded(String str) {
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onPause() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onResume() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.mInterstitialListener = mediationInterstitialListener;
        if (!(context instanceof Activity)) {
            Log.d("IronSource", "IronSource SDK requires an Activity context to initialize");
            onISAdFailedToLoad(1);
            return;
        }
        try {
            this.mIsLogEnabled = mediationAdRequest.isTesting();
            String string = bundle.getString("appKey");
            if (TextUtils.isEmpty(string)) {
                onLog("IronSource initialization failed, make sure that 'applicationKey' server parameter is added");
                onISAdFailedToLoad(1);
                return;
            }
            this.mInstanceID = bundle.getString("instanceId", "0");
            k.a(this);
            if (!mDidInitInterstitial) {
                initIronSourceSDK(context, string, k.a.INTERSTITIAL);
                mDidInitInterstitial = true;
            }
            onLog("Load IronSource interstitial ad for instance: " + this.mInstanceID);
            k.e(this.mInstanceID);
        } catch (Exception e) {
            onLog("IronSource initialization failed, error: " + e.getMessage());
            onISAdFailedToLoad(0);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        try {
            k.f(this.mInstanceID);
        } catch (Exception e) {
            onLog(e.toString());
        }
    }

    private void onISAdFailedToLoad(final int i) {
        onLog("IronSource Interstitial failed to load for instance " + this.mInstanceID + " Error: " + i);
        if (this.mInterstitialListener != null) {
            sendEventOnUIThread(new Runnable() { // from class: com.google.ads.mediation.ironsource.IronSourceAdapter.1
                @Override // java.lang.Runnable
                public void run() {
                    IronSourceAdapter.this.mInterstitialListener.onAdFailedToLoad(IronSourceAdapter.this, i);
                }
            });
        }
    }

    @Override // com.ironsource.b.f.f
    public void onInterstitialAdReady(String str) {
        onLog("IronSource Interstitial loaded successfully for instance " + str);
        if (this.mInstanceID.equals(str) && this.mInterstitialListener != null) {
            sendEventOnUIThread(new Runnable() { // from class: com.google.ads.mediation.ironsource.IronSourceAdapter.2
                @Override // java.lang.Runnable
                public void run() {
                    IronSourceAdapter.this.mInterstitialListener.onAdLoaded(IronSourceAdapter.this);
                }
            });
        }
    }

    @Override // com.ironsource.b.f.f
    public void onInterstitialAdLoadFailed(String str, b bVar) {
        onLog("IronSource Interstitial failed to load for instance " + str + " Error: " + bVar.b());
        if (this.mInstanceID.equals(str)) {
            onISAdFailedToLoad(0);
        }
    }

    @Override // com.ironsource.b.f.f
    public void onInterstitialAdOpened(String str) {
        onLog("IronSource Interstitial opened ad for instance " + str);
        if (this.mInterstitialListener != null) {
            sendEventOnUIThread(new Runnable() { // from class: com.google.ads.mediation.ironsource.IronSourceAdapter.3
                @Override // java.lang.Runnable
                public void run() {
                    IronSourceAdapter.this.mInterstitialListener.onAdOpened(IronSourceAdapter.this);
                }
            });
        }
    }

    @Override // com.ironsource.b.f.f
    public void onInterstitialAdClosed(String str) {
        onLog("IronSource Interstitial closed ad for instance " + str);
        if (this.mInterstitialListener != null) {
            sendEventOnUIThread(new Runnable() { // from class: com.google.ads.mediation.ironsource.IronSourceAdapter.4
                @Override // java.lang.Runnable
                public void run() {
                    IronSourceAdapter.this.mInterstitialListener.onAdClosed(IronSourceAdapter.this);
                }
            });
        }
    }

    @Override // com.ironsource.b.f.f
    public void onInterstitialAdShowFailed(String str, b bVar) {
        onLog("IronSource Interstitial failed to show for instance " + str + ", error " + bVar.b());
    }

    @Override // com.ironsource.b.f.f
    public void onInterstitialAdClicked(String str) {
        onLog("IronSource Interstitial clicked ad for instance " + str);
        if (this.mInterstitialListener != null) {
            sendEventOnUIThread(new Runnable() { // from class: com.google.ads.mediation.ironsource.IronSourceAdapter.5
                @Override // java.lang.Runnable
                public void run() {
                    IronSourceAdapter.this.mInterstitialListener.onAdClicked(IronSourceAdapter.this);
                    IronSourceAdapter.this.mInterstitialListener.onAdLeftApplication(IronSourceAdapter.this);
                }
            });
        }
    }
}
