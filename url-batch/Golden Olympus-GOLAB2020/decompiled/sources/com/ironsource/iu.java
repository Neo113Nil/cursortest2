package com.ironsource;

import android.content.Context;
import android.os.Handler;
import com.ironsource.gi;
import com.ironsource.mediationsdk.testSuite.TestSuiteActivity;
import com.ironsource.zt;
import com.unity3d.mediation.banner.LevelPlayBannerAdView;
import com.unity3d.mediation.interstitial.LevelPlayInterstitialAd;
import com.unity3d.mediation.rewarded.LevelPlayRewardedAd;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class iu implements zt.c, zt.d, zt.b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final gi.a f16766a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final WeakReference<TestSuiteActivity> f16767b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Handler f16768c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final AtomicReference<LevelPlayBannerAdView> f16769d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final AtomicReference<LevelPlayInterstitialAd> f16770e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final AtomicReference<LevelPlayRewardedAd> f16771f;

    public iu(@NotNull TestSuiteActivity activity, @NotNull Handler handler) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f16766a = nm.f18364r.a().s();
        this.f16767b = new WeakReference<>(activity);
        this.f16768c = handler;
        this.f16769d = new AtomicReference<>();
        this.f16770e = new AtomicReference<>();
        this.f16771f = new AtomicReference<>();
    }

    private final TestSuiteActivity f() {
        return this.f16767b.get();
    }

    @Override // com.ironsource.zt.b
    public void a(double d4) {
        final LevelPlayBannerAdView levelPlayBannerAdView;
        final TestSuiteActivity f4 = f();
        if (f4 == null || (levelPlayBannerAdView = this.f16769d.get()) == null || levelPlayBannerAdView.getParent() != null) {
            return;
        }
        this.f16768c.post(new Runnable() { // from class: com.ironsource.T1
            @Override // java.lang.Runnable
            public final void run() {
                iu.a(TestSuiteActivity.this, levelPlayBannerAdView);
            }
        });
    }

    @Override // com.ironsource.zt.b
    public void b() {
        final LevelPlayBannerAdView andSet;
        final TestSuiteActivity f4 = f();
        if (f4 == null || (andSet = this.f16769d.getAndSet(null)) == null) {
            return;
        }
        andSet.destroy();
        this.f16768c.post(new Runnable() { // from class: com.ironsource.U1
            @Override // java.lang.Runnable
            public final void run() {
                iu.b(TestSuiteActivity.this, andSet);
            }
        });
    }

    @Override // com.ironsource.zt.c
    public boolean e() {
        LevelPlayInterstitialAd levelPlayInterstitialAd = this.f16770e.get();
        if (levelPlayInterstitialAd != null) {
            return levelPlayInterstitialAd.isAdReady();
        }
        return false;
    }

    @Override // com.ironsource.zt.c
    public void a(@NotNull fu loadAdConfig) {
        Intrinsics.checkNotNullParameter(loadAdConfig, "loadAdConfig");
        this.f16766a.a(loadAdConfig);
        AtomicReference<LevelPlayInterstitialAd> atomicReference = this.f16770e;
        String a4 = loadAdConfig.a();
        if (a4 == null) {
            a4 = "";
        }
        LevelPlayInterstitialAd levelPlayInterstitialAd = new LevelPlayInterstitialAd(a4);
        levelPlayInterstitialAd.setListener(new ku());
        levelPlayInterstitialAd.loadAd();
        atomicReference.set(levelPlayInterstitialAd);
    }

    @Override // com.ironsource.zt.d
    public void b(@NotNull fu loadAdConfig) {
        Intrinsics.checkNotNullParameter(loadAdConfig, "loadAdConfig");
        this.f16766a.a(loadAdConfig);
        AtomicReference<LevelPlayRewardedAd> atomicReference = this.f16771f;
        String a4 = loadAdConfig.a();
        if (a4 == null) {
            a4 = "";
        }
        LevelPlayRewardedAd levelPlayRewardedAd = new LevelPlayRewardedAd(a4);
        levelPlayRewardedAd.setListener(new lu());
        levelPlayRewardedAd.loadAd();
        atomicReference.set(levelPlayRewardedAd);
    }

    @Override // com.ironsource.zt.c
    public void c() {
        TestSuiteActivity f4 = f();
        if (f4 != null) {
            LevelPlayInterstitialAd levelPlayInterstitialAd = this.f16770e.get();
            Intrinsics.checkNotNullExpressionValue(levelPlayInterstitialAd, "interstitialAdRef.get()");
            LevelPlayInterstitialAd.showAd$default(levelPlayInterstitialAd, f4, null, 2, null);
        }
    }

    @Override // com.ironsource.zt.d
    public void d() {
        TestSuiteActivity f4 = f();
        if (f4 != null) {
            LevelPlayRewardedAd levelPlayRewardedAd = this.f16771f.get();
            Intrinsics.checkNotNullExpressionValue(levelPlayRewardedAd, "rewardedAdRef.get()");
            LevelPlayRewardedAd.showAd$default(levelPlayRewardedAd, f4, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(TestSuiteActivity testSuiteActivity, LevelPlayBannerAdView it) {
        Intrinsics.checkNotNullParameter(testSuiteActivity, "$testSuiteActivity");
        Intrinsics.checkNotNullParameter(it, "$it");
        testSuiteActivity.getContainer().removeView(it);
    }

    @Override // com.ironsource.zt.b
    public void a(@NotNull fu loadAdConfig, @NotNull String description, int i4, int i5) {
        Intrinsics.checkNotNullParameter(loadAdConfig, "loadAdConfig");
        Intrinsics.checkNotNullParameter(description, "description");
        b();
        TestSuiteActivity f4 = f();
        if (f4 != null) {
            this.f16766a.a(loadAdConfig);
            AtomicReference<LevelPlayBannerAdView> atomicReference = this.f16769d;
            String a4 = loadAdConfig.a();
            if (a4 == null) {
                a4 = "";
            }
            LevelPlayBannerAdView levelPlayBannerAdView = new LevelPlayBannerAdView(f4, a4);
            levelPlayBannerAdView.setAdSize(mu.f18248a.b(description, i4, i5));
            levelPlayBannerAdView.setBannerListener(new ju());
            levelPlayBannerAdView.pauseAutoRefresh();
            levelPlayBannerAdView.loadAd();
            atomicReference.set(levelPlayBannerAdView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(TestSuiteActivity testSuiteActivity, LevelPlayBannerAdView banner) {
        Intrinsics.checkNotNullParameter(testSuiteActivity, "$testSuiteActivity");
        Intrinsics.checkNotNullParameter(banner, "$banner");
        testSuiteActivity.getContainer().addView(banner, ru.f18924a.a((Context) testSuiteActivity));
    }

    @Override // com.ironsource.zt.d
    public boolean a() {
        LevelPlayRewardedAd levelPlayRewardedAd = this.f16771f.get();
        if (levelPlayRewardedAd != null) {
            return levelPlayRewardedAd.isAdReady();
        }
        return false;
    }
}
