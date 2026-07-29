package com.youappi.sdk.ui.views;

import android.content.Context;

/* loaded from: classes2.dex */
public class RewardedVideoAdView extends InterstitialVideoAdView {
    public RewardedVideoAdView(Context context) {
        super(context);
    }

    @Override // com.youappi.sdk.ui.views.InterstitialVideoAdView, com.youappi.sdk.ui.views.IAdView
    public RewardedVideoAdView getView() {
        return this;
    }

    @Override // com.youappi.sdk.ui.views.InterstitialVideoAdView, com.youappi.sdk.BaseAd.AdStateListener
    public void onAdSkipped(IAdView iAdView) {
        onAdClosed(iAdView);
    }
}
