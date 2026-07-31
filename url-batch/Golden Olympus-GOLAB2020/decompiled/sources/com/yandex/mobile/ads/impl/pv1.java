package com.yandex.mobile.ads.impl;

import com.monetization.ads.nativeads.CustomizableMediaView;
import com.yandex.mobile.ads.impl.pw0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class pv1 extends pw0 {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final lg2<j21, eu0> f30587d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pv1(@NotNull CustomizableMediaView mediaView, @NotNull l21 mraidWebViewAdapter, @NotNull ww0 mediaViewRenderController, @NotNull lg2<j21, eu0> mraidWebViewWrapper) {
        super(mediaView, mediaViewRenderController);
        Intrinsics.checkNotNullParameter(mediaView, "mediaView");
        Intrinsics.checkNotNullParameter(mraidWebViewAdapter, "mraidWebViewAdapter");
        Intrinsics.checkNotNullParameter(mediaViewRenderController, "mediaViewRenderController");
        Intrinsics.checkNotNullParameter(mraidWebViewWrapper, "mraidWebViewWrapper");
        this.f30587d = mraidWebViewWrapper;
    }

    @Override // com.yandex.mobile.ads.impl.kg2
    public final void a(CustomizableMediaView customizableMediaView) {
        CustomizableMediaView mediaView = customizableMediaView;
        Intrinsics.checkNotNullParameter(mediaView, "mediaView");
        this.f30587d.a();
        super.a((pv1) mediaView);
    }

    @Override // com.yandex.mobile.ads.impl.pw0
    @NotNull
    public final pw0.a d() {
        return pw0.a.f30595c;
    }

    @Override // com.yandex.mobile.ads.impl.kg2
    public final void a(C2276uf asset, ng2 viewConfigurator, mw0 mw0Var) {
        mw0 mw0Var2 = mw0Var;
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(viewConfigurator, "viewConfigurator");
        this.f30587d.a(asset, viewConfigurator, mw0Var2 != null ? mw0Var2.b() : null);
    }

    @Override // com.yandex.mobile.ads.impl.pw0
    /* renamed from: a, reason: avoid collision after fix types in other method */
    public final void a2(@NotNull CustomizableMediaView mediaView) {
        Intrinsics.checkNotNullParameter(mediaView, "mediaView");
        this.f30587d.a();
    }

    @Override // com.yandex.mobile.ads.impl.kg2
    public final boolean a(CustomizableMediaView customizableMediaView, mw0 mw0Var) {
        CustomizableMediaView mediaView = customizableMediaView;
        mw0 mediaValue = mw0Var;
        Intrinsics.checkNotNullParameter(mediaView, "mediaView");
        Intrinsics.checkNotNullParameter(mediaValue, "mediaValue");
        eu0 b4 = mediaValue.b();
        if (b4 != null) {
            return this.f30587d.a(b4);
        }
        return false;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.yandex.mobile.ads.impl.pw0, com.yandex.mobile.ads.impl.kg2
    /* renamed from: a */
    public final void b(@NotNull CustomizableMediaView mediaView, @NotNull mw0 mediaValue) {
        Intrinsics.checkNotNullParameter(mediaView, "mediaView");
        Intrinsics.checkNotNullParameter(mediaValue, "mediaValue");
        super.b(mediaView, mediaValue);
        eu0 b4 = mediaValue.b();
        if (b4 == null) {
            return;
        }
        this.f30587d.b(b4);
    }

    @Override // com.yandex.mobile.ads.impl.pw0
    public final void a(@NotNull mw0 mediaValue) {
        Intrinsics.checkNotNullParameter(mediaValue, "mediaValue");
    }
}
