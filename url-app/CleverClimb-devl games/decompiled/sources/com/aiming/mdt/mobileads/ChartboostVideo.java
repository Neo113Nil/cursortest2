package com.aiming.mdt.mobileads;

import android.app.Activity;
import com.aiming.mdt.mediation.CustomVideoEvent;
import com.aiming.mdt.mobileads.ChartboostCallback;
import com.aiming.mdt.utils.AdLog;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.Model.CBError;
import java.util.Map;

/* loaded from: classes.dex */
public class ChartboostVideo extends CustomVideoEvent implements ChartboostCallback.ChartboostVideoAdsListener {
    private boolean isFullyWatched;
    private String mLocation;

    @Override // com.aiming.mdt.mediation.CustomAdEvent
    public int getMediation() {
        return 11;
    }

    @Override // com.aiming.mdt.mediation.CustomVideoEvent
    public boolean isReady() {
        return Chartboost.hasRewardedVideo(this.mInstancesKey);
    }

    @Override // com.aiming.mdt.mediation.CustomVideoEvent
    public boolean show(Activity activity) {
        if (Chartboost.hasRewardedVideo(this.mInstancesKey)) {
            Chartboost.showRewardedVideo(this.mInstancesKey);
            return true;
        }
        AdLog.getSingleton().LogD("chartboost ad not ready");
        return false;
    }

    @Override // com.aiming.mdt.mediation.CustomAdEvent
    public void loadAd(Activity activity, Map<String, String> map) throws Throwable {
        super.loadAd(activity, map);
        if (check(activity, map)) {
            Chartboost.onCreate(activity);
            Chartboost.onStart(activity);
            ChartboostCallback.getInstance().addVideoListener(this.mInstancesKey, this);
            if (Chartboost.hasRewardedVideo(this.mInstancesKey)) {
                onInsReady(this.mLocation);
            } else {
                Chartboost.cacheRewardedVideo(this.mInstancesKey);
            }
        }
    }

    @Override // com.aiming.mdt.mediation.CustomAdEvent
    public void destroy(Activity activity) {
        this.isDestroyed = true;
    }

    @Override // com.aiming.mdt.mobileads.ChartboostCallback.ChartboostVideoAdsListener
    public void onRewardVideoCached(String str) {
        if (this.isDestroyed) {
            return;
        }
        AdLog.getSingleton().LogD("Adt-Chartboost", "Chartboost Video ad load success");
        this.mLocation = str;
        onInsReady(str);
    }

    @Override // com.aiming.mdt.mobileads.ChartboostCallback.ChartboostVideoAdsListener
    public void onRewardVideoFailToLoad(String str, CBError.CBImpressionError cBImpressionError) {
        if (this.isDestroyed) {
            return;
        }
        AdLog.getSingleton().LogD("Adt-Chartboost", "Chartboost Video ad load failed : " + cBImpressionError.name());
        onInsError(cBImpressionError.name());
    }

    @Override // com.aiming.mdt.mobileads.ChartboostCallback.ChartboostVideoAdsListener
    public void onRewardVideoShow(String str) {
        if (this.isDestroyed) {
            return;
        }
        this.mLocation = str;
        onInsShow(str);
    }

    @Override // com.aiming.mdt.mobileads.ChartboostCallback.ChartboostVideoAdsListener
    public void onRewardVideoClick(String str) {
        onInsClicked();
    }

    @Override // com.aiming.mdt.mobileads.ChartboostCallback.ChartboostVideoAdsListener
    public void onRewardVideoClose(String str) {
        onInsClose(this.isFullyWatched);
    }

    @Override // com.aiming.mdt.mobileads.ChartboostCallback.ChartboostVideoAdsListener
    public void onRewardVideoComplete(String str) {
        this.isFullyWatched = true;
        callbackInsRewarded();
    }
}
