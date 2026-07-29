package com.aiming.mdt.mobileads;

import android.app.Activity;
import com.aiming.mdt.adt.interstitial.C0217;
import com.aiming.mdt.adt.interstitial.InterfaceC0216;
import com.aiming.mdt.mediation.CustomInterstitialEvent;
import java.util.Map;

/* loaded from: classes.dex */
public class AdtimingInterstitial extends CustomInterstitialEvent implements InterfaceC0216 {
    private C0217 mInterstitialAd;

    @Override // com.aiming.mdt.mediation.CustomAdEvent
    public void destroy(Activity activity) {
        if (this.mInterstitialAd != null) {
            this.mInterstitialAd.m812();
            this.mInterstitialAd = null;
        }
        this.isDestroyed = true;
    }

    @Override // com.aiming.mdt.mediation.CustomAdEvent
    public int getMediation() {
        return 0;
    }

    @Override // com.aiming.mdt.mediation.CustomInterstitialEvent
    public boolean isReady() {
        if (this.mInterstitialAd != null) {
            return this.mInterstitialAd.mo798();
        }
        return false;
    }

    @Override // com.aiming.mdt.mediation.CustomAdEvent
    public void loadAd(Activity activity, Map<String, String> map) {
        super.loadAd(activity, map);
        if (check(activity, map)) {
            if (this.mInterstitialAd == null) {
                this.mInterstitialAd = new C0217(activity, this.mInstancesKey);
                this.mInterstitialAd.m813(this);
                this.mInterstitialAd.m814();
            } else if (this.mInterstitialAd.mo798()) {
                onInsReady(null);
            } else {
                this.mInterstitialAd.m814();
            }
        }
    }

    @Override // com.aiming.mdt.adt.InterfaceC0231
    public void onAdClicked() {
        onInsClicked();
    }

    @Override // com.aiming.mdt.adt.interstitial.InterfaceC0216
    public void onAdClose() {
        if (this.isDestroyed) {
            return;
        }
        onInsClose(true);
    }

    @Override // com.aiming.mdt.adt.InterfaceC0231
    public void onAdFailed(String str) {
        if (this.isDestroyed) {
            return;
        }
        onInsError(str);
    }

    @Override // com.aiming.mdt.adt.interstitial.InterfaceC0216
    public void onAdReady() {
        if (this.isDestroyed) {
            return;
        }
        onInsReady(null);
    }

    @Override // com.aiming.mdt.adt.interstitial.InterfaceC0216
    public void onAdShowed() {
        if (this.isDestroyed) {
            return;
        }
        onInsShow(null);
    }

    @Override // com.aiming.mdt.mediation.CustomInterstitialEvent
    public boolean show(Activity activity) {
        if (this.mInterstitialAd == null || !this.mInterstitialAd.mo798()) {
            return false;
        }
        this.mInterstitialAd.mo795();
        return true;
    }
}
