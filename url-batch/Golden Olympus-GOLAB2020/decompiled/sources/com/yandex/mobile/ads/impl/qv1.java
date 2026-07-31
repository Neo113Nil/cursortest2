package com.yandex.mobile.ads.impl;

import androidx.viewpager2.widget.ViewPager2;
import com.monetization.ads.nativeads.CustomizableMediaView;
import com.yandex.mobile.ads.impl.pw0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class qv1 extends pw0 {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final lg2<ViewPager2, List<ej0>> f30906d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qv1(@NotNull CustomizableMediaView mediaView, @NotNull f31 multiBannerViewAdapter, @NotNull ww0 mediaViewRenderController, @NotNull lg2<ViewPager2, List<ej0>> multiBannerViewWrapper) {
        super(mediaView, mediaViewRenderController);
        Intrinsics.checkNotNullParameter(mediaView, "mediaView");
        Intrinsics.checkNotNullParameter(multiBannerViewAdapter, "multiBannerViewAdapter");
        Intrinsics.checkNotNullParameter(mediaViewRenderController, "mediaViewRenderController");
        Intrinsics.checkNotNullParameter(multiBannerViewWrapper, "multiBannerViewWrapper");
        this.f30906d = multiBannerViewWrapper;
    }

    @Override // com.yandex.mobile.ads.impl.kg2
    public final void a(CustomizableMediaView customizableMediaView) {
        CustomizableMediaView mediaView = customizableMediaView;
        Intrinsics.checkNotNullParameter(mediaView, "mediaView");
        this.f30906d.a();
        super.a((qv1) mediaView);
    }

    @Override // com.yandex.mobile.ads.impl.pw0
    @NotNull
    public final pw0.a d() {
        return pw0.a.f30597e;
    }

    @Override // com.yandex.mobile.ads.impl.kg2
    public final void a(C2276uf asset, ng2 viewConfigurator, mw0 mw0Var) {
        mw0 mw0Var2 = mw0Var;
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(viewConfigurator, "viewConfigurator");
        this.f30906d.a(asset, viewConfigurator, mw0Var2 != null ? mw0Var2.a() : null);
    }

    @Override // com.yandex.mobile.ads.impl.pw0
    /* renamed from: a, reason: avoid collision after fix types in other method */
    public final void a2(@NotNull CustomizableMediaView mediaView) {
        Intrinsics.checkNotNullParameter(mediaView, "mediaView");
        this.f30906d.a();
    }

    @Override // com.yandex.mobile.ads.impl.kg2
    public final boolean a(CustomizableMediaView customizableMediaView, mw0 mw0Var) {
        CustomizableMediaView mediaView = customizableMediaView;
        mw0 mediaValue = mw0Var;
        Intrinsics.checkNotNullParameter(mediaView, "mediaView");
        Intrinsics.checkNotNullParameter(mediaValue, "mediaValue");
        List<ej0> a4 = mediaValue.a();
        if (a4 == null || !(!a4.isEmpty())) {
            return false;
        }
        return this.f30906d.a(a4);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.yandex.mobile.ads.impl.pw0, com.yandex.mobile.ads.impl.kg2
    /* renamed from: a */
    public final void b(@NotNull CustomizableMediaView mediaView, @NotNull mw0 mediaValue) {
        Intrinsics.checkNotNullParameter(mediaView, "mediaView");
        Intrinsics.checkNotNullParameter(mediaValue, "mediaValue");
        super.b(mediaView, mediaValue);
        List<ej0> a4 = mediaValue.a();
        if (a4 == null || !(!a4.isEmpty())) {
            return;
        }
        this.f30906d.b(a4);
    }

    @Override // com.yandex.mobile.ads.impl.pw0
    public final void a(@NotNull mw0 mediaValue) {
        Intrinsics.checkNotNullParameter(mediaValue, "mediaValue");
        List<ej0> a4 = mediaValue.a();
        if (a4 == null || !(!a4.isEmpty())) {
            return;
        }
        this.f30906d.b(a4);
    }
}
