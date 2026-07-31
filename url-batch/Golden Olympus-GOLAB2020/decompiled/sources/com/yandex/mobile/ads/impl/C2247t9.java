package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.t9, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2247t9 implements ng2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final v61 f32245a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ko f32246b;

    public C2247t9(@NotNull v61 nativeAdViewAdapter, @NotNull ko clickListenerConfigurator) {
        Intrinsics.checkNotNullParameter(nativeAdViewAdapter, "nativeAdViewAdapter");
        Intrinsics.checkNotNullParameter(clickListenerConfigurator, "clickListenerConfigurator");
        this.f32245a = nativeAdViewAdapter;
        this.f32246b = clickListenerConfigurator;
    }

    @Override // com.yandex.mobile.ads.impl.ng2
    public final void a(@NotNull C2276uf<?> asset, @NotNull jo clickListenerConfigurable) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(clickListenerConfigurable, "clickListenerConfigurable");
        this.f32246b.a(asset, asset.a(), this.f32245a, clickListenerConfigurable);
    }

    @Override // com.yandex.mobile.ads.impl.ng2
    public final void a(@NotNull View view, @NotNull C2276uf asset) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(view, "view");
    }
}
