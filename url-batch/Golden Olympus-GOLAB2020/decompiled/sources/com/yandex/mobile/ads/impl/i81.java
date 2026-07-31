package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class i81 implements dt {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC1912f1 f27138a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final kd0 f27139b;

    public i81(@NotNull C2193r1 adActivityListener, @NotNull kd0 fullscreenAdtuneCloseEnabledProvider) {
        Intrinsics.checkNotNullParameter(adActivityListener, "adActivityListener");
        Intrinsics.checkNotNullParameter(fullscreenAdtuneCloseEnabledProvider, "fullscreenAdtuneCloseEnabledProvider");
        this.f27138a = adActivityListener;
        this.f27139b = fullscreenAdtuneCloseEnabledProvider;
    }

    @Override // com.yandex.mobile.ads.impl.dt
    public final void a(@Nullable C1795a4 c1795a4) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("impression_data_key", c1795a4);
        this.f27138a.a(16, bundle);
    }

    @Override // com.yandex.mobile.ads.impl.dt
    public final void closeNativeAd() {
        if (this.f27139b.a()) {
            this.f27138a.a();
        }
    }

    @Override // com.yandex.mobile.ads.impl.dt
    public final void onAdClicked() {
    }

    @Override // com.yandex.mobile.ads.impl.dt
    public final void onLeftApplication() {
        this.f27138a.a(17, null);
    }

    @Override // com.yandex.mobile.ads.impl.dt
    public final void onReturnedToApplication() {
        this.f27138a.a(18, null);
    }
}
