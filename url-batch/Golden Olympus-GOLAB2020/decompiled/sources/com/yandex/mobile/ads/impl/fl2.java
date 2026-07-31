package com.yandex.mobile.ads.impl;

import android.app.Activity;
import com.yandex.mobile.ads.appopenad.AppOpenAd;
import com.yandex.mobile.ads.appopenad.AppOpenAdEventListener;
import com.yandex.mobile.ads.common.AdInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class fl2 implements AppOpenAd {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final hs f25837a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final zk2 f25838b;

    public fl2(@NotNull hs coreAppOpenAd, @NotNull zk2 adInfoConverter) {
        Intrinsics.checkNotNullParameter(coreAppOpenAd, "coreAppOpenAd");
        Intrinsics.checkNotNullParameter(adInfoConverter, "adInfoConverter");
        this.f25837a = coreAppOpenAd;
        this.f25838b = adInfoConverter;
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof fl2) && Intrinsics.areEqual(((fl2) obj).f25837a, this.f25837a);
    }

    @Override // com.yandex.mobile.ads.appopenad.AppOpenAd
    @NotNull
    public final AdInfo getInfo() {
        zk2 zk2Var = this.f25838b;
        fs info = this.f25837a.getInfo();
        zk2Var.getClass();
        return zk2.a(info);
    }

    public final int hashCode() {
        return this.f25837a.hashCode();
    }

    @Override // com.yandex.mobile.ads.appopenad.AppOpenAd
    public final void setAdEventListener(@Nullable AppOpenAdEventListener appOpenAdEventListener) {
        this.f25837a.a(new gl2(appOpenAdEventListener));
    }

    @Override // com.yandex.mobile.ads.appopenad.AppOpenAd
    public final void show(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f25837a.show(activity);
    }
}
