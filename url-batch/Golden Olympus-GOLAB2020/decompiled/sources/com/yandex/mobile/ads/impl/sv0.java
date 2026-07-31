package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import com.monetization.ads.fullscreen.template.view.ExtendedViewContainer;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.au0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class sv0<V extends ViewGroup> implements q00<V> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final p41 f31959a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final gu0 f31960b;

    public sv0(@NotNull ct nativeAdAssets, @NotNull p41 nativeAdContainerViewProvider, @NotNull gu0 mediaAspectRatioProvider) {
        Intrinsics.checkNotNullParameter(nativeAdAssets, "nativeAdAssets");
        Intrinsics.checkNotNullParameter(nativeAdContainerViewProvider, "nativeAdContainerViewProvider");
        Intrinsics.checkNotNullParameter(mediaAspectRatioProvider, "mediaAspectRatioProvider");
        this.f31959a = nativeAdContainerViewProvider;
        this.f31960b = mediaAspectRatioProvider;
    }

    @Override // com.yandex.mobile.ads.impl.q00
    public final void a(@NotNull V view) {
        Intrinsics.checkNotNullParameter(view, "container");
        this.f31959a.getClass();
        Intrinsics.checkNotNullParameter(view, "container");
        ExtendedViewContainer extendedViewContainer = (ExtendedViewContainer) view.findViewById(R.id.media_container);
        Float a4 = this.f31960b.a();
        if (extendedViewContainer == null || a4 == null) {
            return;
        }
        fm1 fm1Var = new fm1(Math.min(Math.max(a4.floatValue(), 1.0f), 1.7777778f), new au0.a());
        Intrinsics.checkNotNullParameter(view, "view");
        Context applicationContext = view.getContext().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        extendedViewContainer.setMeasureSpecProvider(new rq(fm1Var, new xt0(view, 0.5f, applicationContext)));
    }

    @Override // com.yandex.mobile.ads.impl.q00
    public final void c() {
    }
}
