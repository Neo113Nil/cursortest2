package com.yandex.mobile.ads.impl;

import android.app.Activity;
import com.yandex.mobile.ads.common.AdInfo;
import com.yandex.mobile.ads.interstitial.InterstitialAd;
import com.yandex.mobile.ads.interstitial.InterstitialAdEventListener;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class cm2 implements InterstitialAd {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ys f24260a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final zk2 f24261b;

    public cm2(@NotNull ys coreInterstitialAd, @NotNull zk2 adInfoConverter) {
        Intrinsics.checkNotNullParameter(coreInterstitialAd, "coreInterstitialAd");
        Intrinsics.checkNotNullParameter(adInfoConverter, "adInfoConverter");
        this.f24260a = coreInterstitialAd;
        this.f24261b = adInfoConverter;
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof cm2) && Intrinsics.areEqual(((cm2) obj).f24260a, this.f24260a);
    }

    @Override // com.yandex.mobile.ads.interstitial.InterstitialAd
    @NotNull
    public final AdInfo getInfo() {
        zk2 zk2Var = this.f24261b;
        fs info = this.f24260a.getInfo();
        zk2Var.getClass();
        return zk2.a(info);
    }

    public final int hashCode() {
        return this.f24260a.hashCode();
    }

    @Override // com.yandex.mobile.ads.interstitial.InterstitialAd
    public final void setAdEventListener(@Nullable InterstitialAdEventListener interstitialAdEventListener) {
        this.f24260a.a(new dm2(interstitialAdEventListener));
    }

    @Override // com.yandex.mobile.ads.interstitial.InterstitialAd
    public final void show(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f24260a.show(activity);
    }
}
