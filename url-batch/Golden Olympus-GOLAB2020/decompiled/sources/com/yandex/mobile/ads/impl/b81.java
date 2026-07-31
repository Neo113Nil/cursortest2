package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.m91;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class b81 implements v41 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final m91.b f23629a;

    public b81(@NotNull m91.b responseCreationListener) {
        Intrinsics.checkNotNullParameter(responseCreationListener, "responseCreationListener");
        this.f23629a = responseCreationListener;
    }

    @Override // com.yandex.mobile.ads.impl.v41
    public final void a(@NotNull C1866d3 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f23629a.a(error);
    }

    @Override // com.yandex.mobile.ads.impl.v41
    public final void a(@NotNull f61 nativeAd) {
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        this.f23629a.a(nativeAd);
    }

    @Override // com.yandex.mobile.ads.impl.v41
    public final void a(@NotNull ArrayList nativeAds) {
        Intrinsics.checkNotNullParameter(nativeAds, "nativeAds");
        this.f23629a.a(C1942g7.x());
    }

    @Override // com.yandex.mobile.ads.impl.v41
    public final void a(@NotNull y71 sliderAd) {
        Intrinsics.checkNotNullParameter(sliderAd, "sliderAd");
        this.f23629a.a(sliderAd);
    }
}
