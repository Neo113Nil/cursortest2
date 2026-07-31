package com.yandex.mobile.ads.impl;

import android.app.Activity;
import com.yandex.mobile.ads.common.AdInfo;
import com.yandex.mobile.ads.rewarded.RewardedAd;
import com.yandex.mobile.ads.rewarded.RewardedAdEventListener;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class rm2 implements RewardedAd {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final st f31296a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final zk2 f31297b;

    public rm2(@NotNull st coreRewardedAd, @NotNull zk2 adInfoConverter) {
        Intrinsics.checkNotNullParameter(coreRewardedAd, "coreRewardedAd");
        Intrinsics.checkNotNullParameter(adInfoConverter, "adInfoConverter");
        this.f31296a = coreRewardedAd;
        this.f31297b = adInfoConverter;
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof rm2) && Intrinsics.areEqual(((rm2) obj).f31296a, this.f31296a);
    }

    @Override // com.yandex.mobile.ads.rewarded.RewardedAd
    @NotNull
    public final AdInfo getInfo() {
        zk2 zk2Var = this.f31297b;
        fs info = this.f31296a.getInfo();
        zk2Var.getClass();
        return zk2.a(info);
    }

    public final int hashCode() {
        return this.f31296a.hashCode();
    }

    @Override // com.yandex.mobile.ads.rewarded.RewardedAd
    public final void setAdEventListener(@Nullable RewardedAdEventListener rewardedAdEventListener) {
        this.f31296a.a(new sm2(rewardedAdEventListener));
    }

    @Override // com.yandex.mobile.ads.rewarded.RewardedAd
    public final void show(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f31296a.show(activity);
    }
}
