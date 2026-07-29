package com.aiming.mdt.mobileads;

import android.app.Activity;
import com.aiming.mdt.mediation.CustomInterstitialEvent;
import com.aiming.mdt.mobileads.ChartboostCallback;
import com.aiming.mdt.utils.AdLog;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.Model.CBError;
import java.util.Map;

/* loaded from: classes.dex */
public class ChartboostInterstitial extends CustomInterstitialEvent implements ChartboostCallback.ChartboostInterstitialAdsListener {
    private String mLocation;

    @Override // com.aiming.mdt.mediation.CustomAdEvent
    public int getMediation() {
        return 11;
    }

    @Override // com.aiming.mdt.mediation.CustomInterstitialEvent
    public boolean isReady() {
        return Chartboost.hasInterstitial(this.mInstancesKey);
    }

    @Override // com.aiming.mdt.mediation.CustomInterstitialEvent
    public boolean show(Activity activity) {
        if (Chartboost.hasInterstitial(this.mInstancesKey)) {
            Chartboost.showInterstitial(this.mInstancesKey);
            return true;
        }
        AdLog.getSingleton().LogD("chartboost ad not ready");
        return false;
    }

    @Override // com.aiming.mdt.mediation.CustomAdEvent
    public void loadAd(Activity activity, Map<String, String> map) throws Throwable {
        super.loadAd(activity, map);
        if (check(activity, map)) {
            this.isDestroyed = false;
            Chartboost.onCreate(activity);
            Chartboost.onStart(activity);
            ChartboostCallback.getInstance().addInterstitialListener(this.mInstancesKey, this);
            if (Chartboost.hasInterstitial(this.mInstancesKey)) {
                onInsReady(this.mLocation);
            } else {
                Chartboost.cacheInterstitial(this.mInstancesKey);
            }
        }
    }

    @Override // com.aiming.mdt.mediation.CustomAdEvent
    public void destroy(Activity activity) {
        this.isDestroyed = true;
    }

    @Override // com.aiming.mdt.mobileads.ChartboostCallback.ChartboostInterstitialAdsListener
    public void onInterstitialCached(String str) {
        if (this.isDestroyed) {
            return;
        }
        AdLog.getSingleton().LogD("Adt-Chartboost", "Chartboost Interstitial ad load success");
        this.mLocation = str;
        onInsReady(str);
    }

    @Override // com.aiming.mdt.mobileads.ChartboostCallback.ChartboostInterstitialAdsListener
    public void onInterstitialFailToLoad(String str, CBError.CBImpressionError cBImpressionError) {
        AdLog.getSingleton().LogD("Adt-Chartboost", "Chartboost Interstitial ad load failed : " + cBImpressionError.name());
        if (this.isDestroyed) {
            return;
        }
        onInsError(cBImpressionError.name());
    }

    @Override // com.aiming.mdt.mobileads.ChartboostCallback.ChartboostInterstitialAdsListener
    public void onInterstitialShow(String str) {
        if (this.isDestroyed) {
            return;
        }
        this.mLocation = str;
        onInsShow(str);
    }

    @Override // com.aiming.mdt.mobileads.ChartboostCallback.ChartboostInterstitialAdsListener
    public void onInterstitialClick(String str) {
        onInsClicked();
    }

    @Override // com.aiming.mdt.mobileads.ChartboostCallback.ChartboostInterstitialAdsListener
    public void onInterstitialClose(String str) {
        onInsClose(true);
    }
}
