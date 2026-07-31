package com.applovin.impl.adview;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.adview.AppLovinInterstitialAd;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;

/* loaded from: classes5.dex */
public class AppLovinAppOpenAd {
    private final AppLovinInterstitialAdDialog a = AppLovinInterstitialAd.create();

    public void setAdClickListener(@Nullable AppLovinAdClickListener appLovinAdClickListener) {
        this.a.setAdClickListener(appLovinAdClickListener);
    }

    public void setAdDisplayListener(@Nullable AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.a.setAdDisplayListener(appLovinAdDisplayListener);
    }

    public void setAdVideoPlaybackListener(@Nullable AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        this.a.setAdVideoPlaybackListener(appLovinAdVideoPlaybackListener);
    }

    public void show(@NonNull AppLovinAd appLovinAd) {
        this.a.showAndRender(appLovinAd);
    }

    @NonNull
    public String toString() {
        return "AppLovinAppOpenAd{}";
    }
}
