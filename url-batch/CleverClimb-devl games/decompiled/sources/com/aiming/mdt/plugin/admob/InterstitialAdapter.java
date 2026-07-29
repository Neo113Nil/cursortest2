package com.aiming.mdt.plugin.admob;

import android.content.Context;
import android.os.Bundle;
import com.aiming.mdt.sdk.ad.interstitialAd.adapter.AdmobInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.customevent.CustomEventInterstitialListener;

/* loaded from: classes.dex */
public class InterstitialAdapter extends AdmobInterstitialAdapter {
    @Override // com.aiming.mdt.sdk.ad.interstitialAd.adapter.AdmobInterstitialAdapter, com.google.android.gms.ads.mediation.OnContextChangedListener
    public void onContextChanged(Context context) {
        super.onContextChanged(context);
    }

    @Override // com.aiming.mdt.sdk.ad.interstitialAd.adapter.AdmobInterstitialAdapter, com.google.android.gms.ads.mediation.customevent.CustomEvent
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.aiming.mdt.sdk.ad.interstitialAd.adapter.AdmobInterstitialAdapter, com.google.android.gms.ads.mediation.customevent.CustomEvent
    public void onPause() {
        super.onPause();
    }

    @Override // com.aiming.mdt.sdk.ad.interstitialAd.adapter.AdmobInterstitialAdapter, com.google.android.gms.ads.mediation.customevent.CustomEvent
    public void onResume() {
        super.onResume();
    }

    @Override // com.aiming.mdt.sdk.ad.interstitialAd.adapter.AdmobInterstitialAdapter, com.google.android.gms.ads.mediation.customevent.CustomEventInterstitial
    public void requestInterstitialAd(Context context, CustomEventInterstitialListener customEventInterstitialListener, String str, MediationAdRequest mediationAdRequest, Bundle bundle) {
        super.requestInterstitialAd(context, customEventInterstitialListener, str, mediationAdRequest, bundle);
    }

    @Override // com.aiming.mdt.sdk.ad.interstitialAd.adapter.AdmobInterstitialAdapter, com.google.android.gms.ads.mediation.customevent.CustomEventInterstitial
    public void showInterstitial() {
        super.showInterstitial();
    }
}
