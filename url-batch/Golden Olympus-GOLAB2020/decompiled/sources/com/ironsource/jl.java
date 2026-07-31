package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class jl {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final yf f16861a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final hl f16862b;

    @Metadata
    public static final class a implements InterfaceC1590x1 {
        a() {
        }

        @Override // com.ironsource.InterfaceC1590x1
        @NotNull
        public AbstractC1584w1 a(boolean z4, @NotNull C1460f1 adProperties) {
            Intrinsics.checkNotNullParameter(adProperties, "adProperties");
            return lj.f17088z.a(adProperties, jl.this.f16861a.t().a(), z4);
        }
    }

    public jl(@NotNull String adUnitId, @NotNull C1525o1 adTools, @NotNull ed adControllerFactory, @NotNull yf provider, @NotNull q9 currentTimeProvider, @NotNull mf idFactory) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adControllerFactory, "adControllerFactory");
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        Intrinsics.checkNotNullParameter(idFactory, "idFactory");
        this.f16861a = provider;
        this.f16862b = new hl(LevelPlay.AdFormat.INTERSTITIAL, adUnitId, adTools, adControllerFactory, a(), provider, currentTimeProvider, idFactory);
    }

    private final InterfaceC1590x1 a() {
        return new a();
    }

    @NotNull
    public final String b() {
        String uuid = this.f16862b.f().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "fullScreenAdInternal.adId.toString()");
        return uuid;
    }

    public final boolean c() {
        IronLog.API.info("LevelPlayInterstitialAd.isAdReady()");
        return this.f16862b.n();
    }

    public final void d() {
        IronLog.API.info("LevelPlayInterstitialAd.loadAd()");
        this.f16862b.o();
    }

    public final void a(@NotNull Activity activity, @Nullable String str) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        IronLog.API.info("LevelPlayInterstitialAd.showAd() placementName: " + str);
        this.f16862b.a(activity, str);
    }

    public final void a(@Nullable LevelPlayInterstitialAdListener levelPlayInterstitialAdListener) {
        IronLog.API.info("LevelPlayInterstitialAd.setListener()");
        this.f16862b.a(levelPlayInterstitialAdListener != null ? kl.b(levelPlayInterstitialAdListener) : null);
    }
}
