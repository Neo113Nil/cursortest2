package com.yandex.mobile.ads.impl;

import com.monetization.ads.nativeads.ExtendedNativeAdView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.ti, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2256ti {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2233si<ExtendedNativeAdView> f32444a;

    public C2256ti(@NotNull C2233si<ExtendedNativeAdView> layoutDesignsController) {
        Intrinsics.checkNotNullParameter(layoutDesignsController, "layoutDesignsController");
        this.f32444a = layoutDesignsController;
    }

    public final void a() {
        this.f32444a.a();
    }

    public final void a(@Nullable vy1 vy1Var, @NotNull InterfaceC2048ki attachEventListener) {
        Intrinsics.checkNotNullParameter(attachEventListener, "attachEventListener");
        if (this.f32444a.a(vy1Var)) {
            attachEventListener.a();
        } else {
            attachEventListener.a(C1942g7.i());
        }
    }
}
