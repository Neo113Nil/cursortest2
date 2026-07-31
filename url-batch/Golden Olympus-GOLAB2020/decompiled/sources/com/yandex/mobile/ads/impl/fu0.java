package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import com.monetization.ads.fullscreen.template.view.ExtendedViewContainer;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.au0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class fu0<V extends ViewGroup> implements q00<V> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final p41 f25922a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final gu0 f25923b;

    public fu0(@NotNull ct nativeAdAssets, @NotNull p41 nativeAdContainerViewProvider, @NotNull gu0 mediaAspectRatioProvider) {
        Intrinsics.checkNotNullParameter(nativeAdAssets, "nativeAdAssets");
        Intrinsics.checkNotNullParameter(nativeAdContainerViewProvider, "nativeAdContainerViewProvider");
        Intrinsics.checkNotNullParameter(mediaAspectRatioProvider, "mediaAspectRatioProvider");
        this.f25922a = nativeAdContainerViewProvider;
        this.f25923b = mediaAspectRatioProvider;
    }

    @Override // com.yandex.mobile.ads.impl.q00
    public final void a(@NotNull V container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.f25922a.getClass();
        Intrinsics.checkNotNullParameter(container, "container");
        ExtendedViewContainer extendedViewContainer = (ExtendedViewContainer) container.findViewById(R.id.media_container);
        Float a4 = this.f25923b.a();
        if (extendedViewContainer == null || a4 == null) {
            return;
        }
        extendedViewContainer.setMeasureSpecProvider(new fm1(a4.floatValue(), new au0.a()));
    }

    @Override // com.yandex.mobile.ads.impl.q00
    public final void c() {
    }
}
