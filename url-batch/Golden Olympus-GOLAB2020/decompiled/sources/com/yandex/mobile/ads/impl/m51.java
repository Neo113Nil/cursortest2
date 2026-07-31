package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import com.yandex.mobile.ads.impl.mo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public abstract class m51 extends n81 implements f61 {

    /* renamed from: O, reason: collision with root package name */
    @NotNull
    private final b61 f28891O;

    /* renamed from: P, reason: collision with root package name */
    @NotNull
    private zi0 f28892P;

    /* renamed from: Q, reason: collision with root package name */
    @NotNull
    private final m71 f28893Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m51(@NotNull Context context, @NotNull u31 nativeAd, @NotNull b61 nativeAdManager, @NotNull zi0 imageProvider, @NotNull C2258tk binderConfiguration, @NotNull t41 nativeAdControllers) {
        super(context, binderConfiguration, nativeAdControllers);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        Intrinsics.checkNotNullParameter(nativeAdManager, "nativeAdManager");
        Intrinsics.checkNotNullParameter(imageProvider, "imageProvider");
        Intrinsics.checkNotNullParameter(binderConfiguration, "binderConfiguration");
        Intrinsics.checkNotNullParameter(nativeAdControllers, "nativeAdControllers");
        this.f28891O = nativeAdManager;
        this.f28892P = imageProvider;
        m71 a4 = a(nativeAd, binderConfiguration.d().a());
        this.f28893Q = a4;
        a(a4);
    }

    private final m71 a(u31 u31Var, C2286v2 c2286v2) {
        zq1 g4 = u31Var.g();
        return new m71(c2286v2, g4.a(), e(), a(), new qy1(u31Var, new xq1(), new C2085m7(), new wq()), null);
    }

    @Override // com.yandex.mobile.ads.impl.f61
    public final void b(@NotNull ft listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f28891O.a(listener);
    }

    @Override // com.yandex.mobile.ads.impl.f61
    @NotNull
    public final ct getAdAssets() {
        return this.f28891O.a();
    }

    @Override // com.yandex.mobile.ads.impl.f61
    @NotNull
    public final zq1 getAdType() {
        return this.f28891O.b();
    }

    @Override // com.yandex.mobile.ads.impl.f61
    @Nullable
    public final String getInfo() {
        return this.f28891O.c();
    }

    @Override // com.yandex.mobile.ads.impl.n81, com.yandex.mobile.ads.impl.f61
    @NotNull
    public final kt getNativeAdVideoController() {
        return super.getNativeAdVideoController();
    }

    @Override // com.yandex.mobile.ads.impl.n81, com.yandex.mobile.ads.impl.f61
    public final void loadImages() {
        this.f28891O.d();
    }

    @Override // com.yandex.mobile.ads.impl.f61
    public final void b(@NotNull z61 viewProvider, @NotNull Cdo clickConnector) {
        Intrinsics.checkNotNullParameter(viewProvider, "viewProvider");
        Intrinsics.checkNotNullParameter(clickConnector, "clickConnector");
        View d4 = viewProvider.d();
        g71 g71Var = new g71(viewProvider);
        zi0 zi0Var = this.f28892P;
        mo.f29191a.getClass();
        a(d4, zi0Var, g71Var, mo.a.a(), clickConnector);
    }

    @Override // com.yandex.mobile.ads.impl.f61
    public final void b(@NotNull z61 viewProvider) {
        Intrinsics.checkNotNullParameter(viewProvider, "viewProvider");
        this.f28893Q.a(viewProvider.e());
        View d4 = viewProvider.d();
        g71 g71Var = new g71(viewProvider);
        zi0 zi0Var = this.f28892P;
        mo.f29191a.getClass();
        a(d4, zi0Var, g71Var, mo.a.a());
    }

    @Override // com.yandex.mobile.ads.impl.f61
    public final void a(@NotNull ft listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f28891O.b(listener);
    }
}
