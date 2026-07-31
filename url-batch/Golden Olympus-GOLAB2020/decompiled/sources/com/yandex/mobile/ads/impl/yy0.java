package com.yandex.mobile.ads.impl;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class yy0 {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final String f35385d = "com.yandex.mobile.ads.mediation";

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f35386e = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f35387a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f35388b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<b> f35389c;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f35390a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f35391b;

        public b(@NotNull String format, @NotNull String className) {
            Intrinsics.checkNotNullParameter(format, "format");
            Intrinsics.checkNotNullParameter(className, "className");
            this.f35390a = format;
            this.f35391b = className;
        }

        @NotNull
        public final String a() {
            return this.f35391b;
        }

        @NotNull
        public final String b() {
            return this.f35390a;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f35390a, bVar.f35390a) && Intrinsics.areEqual(this.f35391b, bVar.f35391b);
        }

        public final int hashCode() {
            return this.f35391b.hashCode() + (this.f35390a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "MediationAdapterSignature(format=" + this.f35390a + ", className=" + this.f35391b + ")";
        }
    }

    public yy0(@NotNull String name, @NotNull String id, @NotNull List<b> adapters) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(adapters, "adapters");
        this.f35387a = name;
        this.f35388b = id;
        this.f35389c = adapters;
    }

    @NotNull
    public final List<b> b() {
        return this.f35389c;
    }

    @NotNull
    public final String c() {
        return this.f35388b;
    }

    @NotNull
    public final String d() {
        return this.f35387a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yy0)) {
            return false;
        }
        yy0 yy0Var = (yy0) obj;
        return Intrinsics.areEqual(this.f35387a, yy0Var.f35387a) && Intrinsics.areEqual(this.f35388b, yy0Var.f35388b) && Intrinsics.areEqual(this.f35389c, yy0Var.f35389c);
    }

    public final int hashCode() {
        return this.f35389c.hashCode() + C1842c3.a(this.f35388b, this.f35387a.hashCode() * 31, 31);
    }

    @NotNull
    public final String toString() {
        return "MediationNetwork(name=" + this.f35387a + ", id=" + this.f35388b + ", adapters=" + this.f35389c + ")";
    }

    public static final class a {
        @NotNull
        public static List a() {
            return CollectionsKt.listOf((Object[]) new yy0[]{new yy0("AppLovin", "applovin", CollectionsKt.listOf((Object[]) new b[]{new b("Banner", a("banner", "AppLovinBannerAdapter")), new b("Interstitial", a("interstitial", "AppLovinInterstitialAdapter")), new b("Rewarded", a("rewarded", "AppLovinRewardedAdapter"))})), new yy0("AppLovinMax", "applovin_max", CollectionsKt.listOf((Object[]) new b[]{new b("Banner", a("banner", "AppLovinMaxBannerAdapter")), new b("Interstitial", a("interstitial", "AppLovinMaxInterstitialAdapter")), new b("Rewarded", a("rewarded", "AppLovinMaxRewardedAdapter"))})), new yy0("Appnext", "appnext", CollectionsKt.listOf((Object[]) new b[]{new b("Banner", a("banner", "AppNextBannerAdapter")), new b("Interstitial", a("interstitial", "AppNextInterstitialAdapter")), new b("Native", a("nativeads", "AppNextNativeAdapter")), new b("Rewarded", a("rewarded", "AppNextRewardedAdapter"))})), new yy0("BigoAds", "bigoads", CollectionsKt.listOf((Object[]) new b[]{new b("AppOpen", a("appopen", "BigoAdsAppOpenAdAdapter")), new b("Banner", a("banner", "BigoAdsBannerAdapter")), new b("Interstitial", a("interstitial", "BigoAdsInterstitialAdapter")), new b("Native", a("nativeads", "BigoAdsNativeAdapter")), new b("Rewarded", a("rewarded", "BigoAdsRewardedAdapter")), new b("AppOpen", a("appopen", "BigoAdsAppOpenAdapter"))})), new yy0("Chartboost", "chartboost", CollectionsKt.listOf((Object[]) new b[]{new b("Banner", a("banner", "ChartboostBannerAdapter")), new b("Interstitial", a("interstitial", "ChartboostInterstitialAdapter")), new b("Rewarded", a("rewarded", "ChartboostRewardedAdapter"))})), new yy0("AdMob", "admob", CollectionsKt.listOf((Object[]) new b[]{new b("AppOpen", a("appopen", "AdMobAppOpenAdAdapter")), new b("Banner", a("banner", "AdMobBannerAdapter")), new b("Interstitial", a("interstitial", "AdMobInterstitialAdapter")), new b("Native", a("nativeads", "AdMobNativeAdapter")), new b("Rewarded", a("rewarded", "AdMobRewardedAdapter"))})), new yy0("AdManager", "admanager", CollectionsKt.listOf((Object[]) new b[]{new b("Banner", a("banner", "AdManagerBannerAdapter")), new b("Interstitial", a("interstitial", "AdManagerInterstitialAdapter")), new b("Native", a("nativeads", "AdManagerNativeAdapter")), new b("Rewarded", a("rewarded", "AdManagerRewardedAdapter"))})), new yy0("DigitalTurbine", "digitalturbine", CollectionsKt.listOf((Object[]) new b[]{new b("Interstitial", a("interstitial", "DigitalTurbineInterstitialAdapter")), new b("Rewarded", a("rewarded", "DigitalTurbineRewardedAdapter"))})), new yy0("InMobi", "inmobi", CollectionsKt.listOf((Object[]) new b[]{new b("Banner", a("banner", "InMobiBannerAdapter")), new b("Interstitial", a("interstitial", "InMobiInterstitialAdapter")), new b("Rewarded", a("rewarded", "InMobiRewardedAdapter")), new b("Fullscreen", a("fullscreen", "InMobiFullscreenAdapter"))})), new yy0("IronSource", "ironsource", CollectionsKt.listOf((Object[]) new b[]{new b("Banner", a("banner", "IronSourceBannerAdapter")), new b("Interstitial", a("interstitial", "IronSourceInterstitialAdapter")), new b("Rewarded", a("rewarded", "IronSourceRewardedAdapter"))})), new yy0("Mintegral", "mintegral", CollectionsKt.listOf((Object[]) new b[]{new b("AppOpen", a("appopen", "MintegralAppOpenAdAdapter")), new b("Banner", a("banner", "MintegralBannerAdapter")), new b("Interstitial", a("interstitial", "MintegralInterstitialAdapter")), new b("Native", a("nativeads", "MintegralNativeAdapter")), new b("Rewarded", a("rewarded", "MintegralRewardedAdapter"))})), new yy0("MyTarget", "mytarget", CollectionsKt.listOf((Object[]) new b[]{new b("Banner", a("banner", "MyTargetBannerAdapter")), new b("Interstitial", a("interstitial", "MyTargetInterstitialAdapter")), new b("Native", a("nativeads", "MyTargetNativeAdapter")), new b("Rewarded", a("rewarded", "MyTargetRewardedAdapter"))})), new yy0("Pangle", "pangle", CollectionsKt.listOf((Object[]) new b[]{new b("AppOpen", a("appopen", "PangleAppOpenAdAdapter")), new b("Banner", a("banner", "PangleBannerAdapter")), new b("Interstitial", a("interstitial", "PangleInterstitialAdapter")), new b("Native", a("nativeads", "PangleNativeAdapter")), new b("Rewarded", a("rewarded", "PangleRewardedAdapter"))})), new yy0("PetalAds", "petalads", CollectionsKt.listOf((Object[]) new b[]{new b("AppOpen", a("appopen", "PetalAdsAppOpenAdAdapter")), new b("Interstitial", a("interstitial", "PetalAdsInterstitialAdapter")), new b("Rewarded", a("rewarded", "PetalAdsRewardedAdapter"))})), new yy0("StartApp", "startapp", CollectionsKt.listOf((Object[]) new b[]{new b("Banner", a("banner", "StartAppBannerAdapter")), new b("Interstitial", a("interstitial", "StartAppInterstitialAdapter")), new b("Native", a("nativeads", "StartAppNativeAdapter")), new b("Rewarded", a("rewarded", "StartAppRewardedAdapter"))})), new yy0("TapJoy", "tapjoy", CollectionsKt.listOf((Object[]) new b[]{new b("Interstitial", a("interstitial", "TapJoyInterstitialAdapter")), new b("Rewarded", a("rewarded", "TapJoyRewardedAdapter"))})), new yy0(com.ironsource.ge.f16392C1, "unityads", CollectionsKt.listOf((Object[]) new b[]{new b("Banner", a("banner", "UnityAdsBannerAdapter")), new b("Interstitial", a("interstitial", "UnityAdsInterstitialAdapter")), new b("Rewarded", a("rewarded", "UnityAdsRewardedAdapter"))})), new yy0("Vungle", "vungle", CollectionsKt.listOf((Object[]) new b[]{new b("AppOpen", a("appopen", "VungleAppOpenAdAdapter")), new b("Banner", a("banner", "VungleBannerAdapter")), new b("Interstitial", a("interstitial", "VungleInterstitialAdapter")), new b("Rewarded", a("rewarded", "VungleRewardedAdapter")), new b("Native", a("nativeads", "VungleNativeAdapter"))})), new yy0("zMaticoo", "zmaticoo", CollectionsKt.listOf((Object[]) new b[]{new b("Banner", a("banner", "MaticooBannerAdapter")), new b("Interstitial", a("interstitial", "MaticooInterstitialAdapter")), new b("Rewarded", a("rewarded", "MaticooRewardedAdapter"))}))});
        }

        private static String a(String str, String str2) {
            return yy0.f35385d + "." + str + "." + str2;
        }
    }
}
