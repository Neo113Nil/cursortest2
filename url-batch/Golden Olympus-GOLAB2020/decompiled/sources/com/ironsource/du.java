package com.ironsource;

import android.webkit.JavascriptInterface;
import com.ironsource.mediationsdk.IronSource;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class du {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final zt f15932a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final eu f15933b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final hi f15934c;

    public du(@NotNull zt adsManager, @NotNull hi uiLifeCycleListener, @NotNull eu javaScriptEvaluator) {
        Intrinsics.checkNotNullParameter(adsManager, "adsManager");
        Intrinsics.checkNotNullParameter(uiLifeCycleListener, "uiLifeCycleListener");
        Intrinsics.checkNotNullParameter(javaScriptEvaluator, "javaScriptEvaluator");
        this.f15932a = adsManager;
        this.f15933b = javaScriptEvaluator;
        this.f15934c = uiLifeCycleListener;
    }

    private final void a(String str, IronSource.AD_UNIT ad_unit, List<? extends Object> list) {
        this.f15933b.a(str, ad_unit, list);
    }

    @JavascriptInterface
    public final void addBannerAdToScreen(double d4) {
        this.f15932a.a().a(d4);
    }

    @JavascriptInterface
    public final void closeTestSuite() {
        destroyBannerAd();
        this.f15934c.onClosed();
    }

    @JavascriptInterface
    public final void destroyBannerAd() {
        this.f15932a.a().b();
    }

    @JavascriptInterface
    public final void isInterstitialReady() {
        a("isInterstitialReady", IronSource.AD_UNIT.INTERSTITIAL, ru.f18924a.a(Boolean.valueOf(this.f15932a.b().e())));
    }

    @JavascriptInterface
    public final void isRewardedVideoReady() {
        a("isRewardedVideoReady", IronSource.AD_UNIT.REWARDED_VIDEO, ru.f18924a.a(Boolean.valueOf(this.f15932a.c().a())));
    }

    @JavascriptInterface
    public final void loadBannerAd(@Nullable String str, @NotNull String adNetwork, boolean z4, boolean z5, @NotNull String description, int i4, int i5) {
        Intrinsics.checkNotNullParameter(adNetwork, "adNetwork");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f15932a.a().a(new fu(adNetwork, z4, Boolean.valueOf(z5), str), description, i4, i5);
    }

    @JavascriptInterface
    public final void loadInterstitialAd(@Nullable String str, @NotNull String adNetwork, boolean z4, boolean z5) {
        Intrinsics.checkNotNullParameter(adNetwork, "adNetwork");
        this.f15932a.b().a(new fu(adNetwork, z4, Boolean.valueOf(z5), str));
    }

    @JavascriptInterface
    public final void loadRewardedVideoAd(@Nullable String str, @NotNull String adNetwork, boolean z4, boolean z5) {
        Intrinsics.checkNotNullParameter(adNetwork, "adNetwork");
        this.f15932a.c().b(new fu(adNetwork, z4, Boolean.valueOf(z5), str));
    }

    @JavascriptInterface
    public final void onDataLoaded() {
        this.f15934c.onUIReady();
    }

    @JavascriptInterface
    public final void showInterstitialAd() {
        this.f15932a.b().c();
    }

    @JavascriptInterface
    public final void showRewardedVideoAd() {
        this.f15932a.c().d();
    }

    @JavascriptInterface
    public final void loadBannerAd(@NotNull String adNetwork, boolean z4, boolean z5, @NotNull String description, int i4, int i5) {
        Intrinsics.checkNotNullParameter(adNetwork, "adNetwork");
        Intrinsics.checkNotNullParameter(description, "description");
        loadBannerAd(null, adNetwork, z4, z5, description, i4, i5);
    }

    @JavascriptInterface
    public final void loadInterstitialAd(@NotNull String adNetwork, boolean z4, boolean z5) {
        Intrinsics.checkNotNullParameter(adNetwork, "adNetwork");
        loadInterstitialAd(null, adNetwork, z4, z5);
    }

    @JavascriptInterface
    public final void loadRewardedVideoAd(@NotNull String adNetwork, boolean z4, boolean z5) {
        Intrinsics.checkNotNullParameter(adNetwork, "adNetwork");
        loadRewardedVideoAd(null, adNetwork, z4, z5);
    }
}
