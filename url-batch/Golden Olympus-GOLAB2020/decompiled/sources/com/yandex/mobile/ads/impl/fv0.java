package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import com.monetization.ads.fullscreen.template.view.ExtendedViewContainer;
import com.yandex.mobile.ads.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class fv0<V extends ViewGroup> implements q00<V> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ct f25925a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final p41 f25926b;

    public fv0(@NotNull ct nativeAdAssets, @NotNull p41 nativeAdContainerViewProvider) {
        Intrinsics.checkNotNullParameter(nativeAdAssets, "nativeAdAssets");
        Intrinsics.checkNotNullParameter(nativeAdContainerViewProvider, "nativeAdContainerViewProvider");
        this.f25925a = nativeAdAssets;
        this.f25926b = nativeAdContainerViewProvider;
    }

    @Override // com.yandex.mobile.ads.impl.q00
    public final void a(@NotNull V container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.f25926b.getClass();
        Intrinsics.checkNotNullParameter(container, "container");
        ExtendedViewContainer extendedViewContainer = (ExtendedViewContainer) container.findViewById(R.id.media_container);
        if (extendedViewContainer != null && this.f25925a.h() == null && this.f25925a.i() == null) {
            extendedViewContainer.setVisibility(8);
        }
    }

    @Override // com.yandex.mobile.ads.impl.q00
    public final void c() {
    }
}
