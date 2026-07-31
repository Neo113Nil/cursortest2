package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.sdk.LevelPlayBannerListener;
import com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoManualListener;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class nu {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final eu f18432a;

    @Metadata
    public static final class a implements LevelPlayInterstitialListener {
        a() {
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener
        public void onAdClicked(@Nullable AdInfo adInfo) {
            nu.this.a(ou.f18556f, IronSource.AD_UNIT.INTERSTITIAL, ru.f18924a.a(adInfo));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener
        public void onAdClosed(@Nullable AdInfo adInfo) {
            nu.this.a(ou.f18557g, IronSource.AD_UNIT.INTERSTITIAL, ru.f18924a.a(adInfo));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener
        public void onAdLoadFailed(@Nullable IronSourceError ironSourceError) {
            nu.this.a(ou.f18552b, IronSource.AD_UNIT.INTERSTITIAL, ru.f18924a.a(ironSourceError != null ? ironSourceError.getErrorMessage() : null));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener
        public void onAdOpened(@Nullable AdInfo adInfo) {
            nu.this.a(ou.f18553c, IronSource.AD_UNIT.INTERSTITIAL, ru.f18924a.a(adInfo));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener
        public void onAdReady(@Nullable AdInfo adInfo) {
            nu.this.a(ou.f18551a, IronSource.AD_UNIT.INTERSTITIAL, ru.f18924a.a(adInfo));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener
        public void onAdShowFailed(@Nullable IronSourceError ironSourceError, @Nullable AdInfo adInfo) {
            nu.this.a(ou.f18555e, IronSource.AD_UNIT.INTERSTITIAL, ru.f18924a.a(ironSourceError != null ? ironSourceError.getErrorMessage() : null, adInfo));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener
        public void onAdShowSucceeded(@Nullable AdInfo adInfo) {
            nu.this.a(ou.f18554d, IronSource.AD_UNIT.INTERSTITIAL, ru.f18924a.a(adInfo));
        }
    }

    @Metadata
    public static final class b implements LevelPlayRewardedVideoManualListener, LevelPlayRewardedVideoListener {
        b() {
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoListener
        public void onAdAvailable(@Nullable AdInfo adInfo) {
            nu.this.a(ou.f18558h, IronSource.AD_UNIT.REWARDED_VIDEO, ru.f18924a.a(adInfo));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener
        public void onAdClicked(@Nullable Placement placement, @Nullable AdInfo adInfo) {
            nu.this.a(ou.f18556f, IronSource.AD_UNIT.REWARDED_VIDEO, ru.f18924a.a(mu.f18248a.a(placement), adInfo));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener
        public void onAdClosed(@Nullable AdInfo adInfo) {
            nu.this.a(ou.f18557g, IronSource.AD_UNIT.REWARDED_VIDEO, ru.f18924a.a(adInfo));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoManualListener
        public void onAdLoadFailed(@Nullable IronSourceError ironSourceError) {
            nu.this.a(ou.f18552b, IronSource.AD_UNIT.REWARDED_VIDEO, ru.f18924a.a(ironSourceError != null ? ironSourceError.getErrorMessage() : null));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener
        public void onAdOpened(@Nullable AdInfo adInfo) {
            nu.this.a(ou.f18553c, IronSource.AD_UNIT.REWARDED_VIDEO, ru.f18924a.a(adInfo));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoManualListener
        public void onAdReady(@Nullable AdInfo adInfo) {
            nu.this.a(ou.f18551a, IronSource.AD_UNIT.REWARDED_VIDEO, ru.f18924a.a(adInfo));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener
        public void onAdRewarded(@Nullable Placement placement, @Nullable AdInfo adInfo) {
            nu.this.a(ou.f18559i, IronSource.AD_UNIT.REWARDED_VIDEO, ru.f18924a.a(mu.f18248a.a(placement), adInfo));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener
        public void onAdShowFailed(@Nullable IronSourceError ironSourceError, @Nullable AdInfo adInfo) {
            nu.this.a(ou.f18555e, IronSource.AD_UNIT.REWARDED_VIDEO, ru.f18924a.a(ironSourceError != null ? ironSourceError.getErrorMessage() : null, adInfo));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoListener
        public void onAdUnavailable() {
            nu.this.a(ou.f18564n, IronSource.AD_UNIT.REWARDED_VIDEO, ru.f18924a.a(new Object[0]));
        }
    }

    @Metadata
    public static final class c implements LevelPlayBannerListener {
        c() {
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayBannerListener
        public void onAdClicked(@Nullable AdInfo adInfo) {
            nu.this.a(ou.f18556f, IronSource.AD_UNIT.BANNER, ru.f18924a.a(adInfo));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayBannerListener
        public void onAdLeftApplication(@Nullable AdInfo adInfo) {
            nu.this.a(ou.f18561k, IronSource.AD_UNIT.BANNER, ru.f18924a.a(adInfo));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayBannerListener
        public void onAdLoadFailed(@Nullable IronSourceError ironSourceError) {
            nu.this.a(ou.f18552b, IronSource.AD_UNIT.BANNER, ru.f18924a.a(ironSourceError != null ? ironSourceError.getErrorMessage() : null));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayBannerListener
        public void onAdLoaded(@Nullable AdInfo adInfo) {
            nu.this.a(ou.f18560j, IronSource.AD_UNIT.BANNER, ru.f18924a.a(adInfo));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayBannerListener
        public void onAdScreenDismissed(@Nullable AdInfo adInfo) {
            nu.this.a(ou.f18563m, IronSource.AD_UNIT.BANNER, ru.f18924a.a(adInfo));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayBannerListener
        public void onAdScreenPresented(@Nullable AdInfo adInfo) {
            nu.this.a(ou.f18562l, IronSource.AD_UNIT.BANNER, ru.f18924a.a(adInfo));
        }
    }

    public nu(@NotNull eu javaScriptEvaluator) {
        Intrinsics.checkNotNullParameter(javaScriptEvaluator, "javaScriptEvaluator");
        this.f18432a = javaScriptEvaluator;
    }

    private final void b() {
        mu muVar = mu.f18248a;
        muVar.a((LevelPlayInterstitialListener) null);
        muVar.a((LevelPlayRewardedVideoBaseListener) null);
        muVar.a((LevelPlayBannerListener) null);
    }

    private final void c() {
        mu.f18248a.i();
    }

    public final void a() {
        b();
        c();
    }

    public final void d() {
        mu muVar = mu.f18248a;
        muVar.a(new a());
        muVar.a(new b());
        muVar.a(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str, IronSource.AD_UNIT ad_unit, List<? extends Object> list) {
        this.f18432a.a(str, ad_unit, list);
    }
}
