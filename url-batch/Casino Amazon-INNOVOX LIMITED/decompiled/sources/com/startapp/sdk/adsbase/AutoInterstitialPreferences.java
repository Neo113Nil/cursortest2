package com.startapp.sdk.adsbase;

import java.io.Serializable;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public class AutoInterstitialPreferences implements Serializable {
    private static final long serialVersionUID = -9010452850291284559L;
    private int activitiesBetweenAds;
    private int secondsBetweenAds;

    public AutoInterstitialPreferences() {
        setActivitiesBetweenAds(AdsCommonMetaData.k().f());
        setSecondsBetweenAds(AdsCommonMetaData.k().g());
    }

    public int getActivitiesBetweenAds() {
        return this.activitiesBetweenAds;
    }

    public int getSecondsBetweenAds() {
        return this.secondsBetweenAds;
    }

    public AutoInterstitialPreferences setActivitiesBetweenAds(int i) {
        if (i < 1) {
            i = 1;
        }
        this.activitiesBetweenAds = i;
        return this;
    }

    public AutoInterstitialPreferences setSecondsBetweenAds(int i) {
        if (i < 0) {
            i = 0;
        }
        this.secondsBetweenAds = i;
        return this;
    }
}
