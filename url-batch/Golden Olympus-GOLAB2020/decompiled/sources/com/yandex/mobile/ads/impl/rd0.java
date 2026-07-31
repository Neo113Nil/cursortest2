package com.yandex.mobile.ads.impl;

import com.monetization.ads.nativeads.ExtendedNativeAdView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class rd0 implements nd0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final sq0<ExtendedNativeAdView> f31124a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final mr f31125b;

    public rd0(@NotNull sq0<ExtendedNativeAdView> layoutDesignsController, @NotNull mr contentCloseListener) {
        Intrinsics.checkNotNullParameter(layoutDesignsController, "layoutDesignsController");
        Intrinsics.checkNotNullParameter(contentCloseListener, "contentCloseListener");
        this.f31124a = layoutDesignsController;
        this.f31125b = contentCloseListener;
    }

    @Override // com.yandex.mobile.ads.impl.nd0
    public final void c() {
        if (this.f31124a.a()) {
            return;
        }
        this.f31125b.f();
    }

    @Override // com.yandex.mobile.ads.impl.nd0
    public final void invalidate() {
        this.f31124a.b();
    }
}
