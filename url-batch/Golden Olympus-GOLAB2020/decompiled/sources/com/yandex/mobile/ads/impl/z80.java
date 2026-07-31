package com.yandex.mobile.ads.impl;

import O1.C1165z4;
import android.view.ContextThemeWrapper;
import com.yandex.div.core.Div2Context;
import com.yandex.div.core.DivConfiguration;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class z80 extends Div2Context {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final sz1 f35506a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z80(@NotNull ContextThemeWrapper baseContext, @NotNull DivConfiguration configuration, @NotNull sz1 sliderAdsBindingExtensionHandler) {
        super(baseContext, configuration, 0, new hb0(), 4, null);
        Intrinsics.checkNotNullParameter(baseContext, "baseContext");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(sliderAdsBindingExtensionHandler, "sliderAdsBindingExtensionHandler");
        this.f35506a = sliderAdsBindingExtensionHandler;
    }

    public final void a(@NotNull C1165z4 divData, @NotNull pz1 nativeAdPrivate) {
        Intrinsics.checkNotNullParameter(divData, "divData");
        Intrinsics.checkNotNullParameter(nativeAdPrivate, "nativeAdPrivate");
        this.f35506a.a(divData, nativeAdPrivate);
    }
}
