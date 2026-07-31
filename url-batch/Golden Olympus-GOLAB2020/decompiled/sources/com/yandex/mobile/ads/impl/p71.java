package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class p71 implements dt {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1977hi f30358a;

    public p71(@NotNull C1977hi adViewController) {
        Intrinsics.checkNotNullParameter(adViewController, "adViewController");
        this.f30358a = adViewController;
    }

    @Override // com.yandex.mobile.ads.impl.dt
    public final void a(@Nullable C1795a4 c1795a4) {
        this.f30358a.a(c1795a4);
    }

    @Override // com.yandex.mobile.ads.impl.dt
    public final void closeNativeAd() {
        this.f30358a.z();
    }

    @Override // com.yandex.mobile.ads.impl.dt
    public final void onAdClicked() {
    }

    @Override // com.yandex.mobile.ads.impl.dt
    public final void onLeftApplication() {
        this.f30358a.onLeftApplication();
    }

    @Override // com.yandex.mobile.ads.impl.dt
    public final void onReturnedToApplication() {
        this.f30358a.onReturnedToApplication();
    }
}
