package com.facebook.ads.redexgen.X;

import com.facebook.ads.RewardedInterstitialAd;

/* renamed from: com.facebook.ads.redexgen.X.5k, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02665k implements RewardedInterstitialAd.RewardedInterstitialAdShowConfigBuilder, RewardedInterstitialAd.RewardedInterstitialShowAdConfig {
    public final C02695n A00;

    public C02665k(C02695n c02695n) {
        this.A00 = c02695n;
    }

    public final C02695n A00() {
        return this.A00;
    }

    @Override // com.facebook.ads.RewardedInterstitialAd.RewardedInterstitialAdShowConfigBuilder, com.facebook.ads.FullScreenAd.ShowConfigBuilder
    public final RewardedInterstitialAd.RewardedInterstitialShowAdConfig build() {
        return this;
    }

    @Override // com.facebook.ads.RewardedInterstitialAd.RewardedInterstitialAdShowConfigBuilder
    public final RewardedInterstitialAd.RewardedInterstitialAdShowConfigBuilder withAppOrientation(int i) {
        this.A00.withAppOrientation(i);
        return this;
    }
}
