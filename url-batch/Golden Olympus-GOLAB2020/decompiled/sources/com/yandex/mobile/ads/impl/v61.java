package com.yandex.mobile.ads.impl;

import android.view.View;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class v61 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final zi0 f33521a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final mo f33522b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final f71 f33523c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Map<String, InterfaceC2299vf<?>> f33524d;

    public v61(@NotNull g71 nativeAdWeakViewHolder, @NotNull C2286v2 adConfiguration, @NotNull zi0 imageProvider, @NotNull xj0 impressionEventsObservable, @NotNull mo onClickListenerFactory, @NotNull h51 nativeAdFactoriesProvider, @NotNull C1975hg assetValueProvider, @NotNull a91 nativeMediaContent, @NotNull h81 nativeForcePauseObserver, @NotNull C2360y7 adResponse, @NotNull tb1 nativeVisualBlock, @NotNull t41 nativeAdControllers, @NotNull ww0 mediaViewRenderController, @NotNull av customAssetTracker, @NotNull f71 weakViewProvider, @NotNull ej2 mediaControlsProvider, @NotNull qw0 mediaViewAdapterCreator, @NotNull Map assetAdapters) {
        Intrinsics.checkNotNullParameter(nativeAdWeakViewHolder, "nativeAdWeakViewHolder");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(imageProvider, "imageProvider");
        Intrinsics.checkNotNullParameter(impressionEventsObservable, "impressionEventsObservable");
        Intrinsics.checkNotNullParameter(onClickListenerFactory, "onClickListenerFactory");
        Intrinsics.checkNotNullParameter(nativeAdFactoriesProvider, "nativeAdFactoriesProvider");
        Intrinsics.checkNotNullParameter(assetValueProvider, "assetValueProvider");
        Intrinsics.checkNotNullParameter(nativeMediaContent, "nativeMediaContent");
        Intrinsics.checkNotNullParameter(nativeForcePauseObserver, "nativeForcePauseObserver");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(nativeVisualBlock, "nativeVisualBlock");
        Intrinsics.checkNotNullParameter(nativeAdControllers, "nativeAdControllers");
        Intrinsics.checkNotNullParameter(mediaViewRenderController, "mediaViewRenderController");
        Intrinsics.checkNotNullParameter(customAssetTracker, "customAssetTracker");
        Intrinsics.checkNotNullParameter(weakViewProvider, "weakViewProvider");
        Intrinsics.checkNotNullParameter(mediaControlsProvider, "mediaControlsProvider");
        Intrinsics.checkNotNullParameter(mediaViewAdapterCreator, "mediaViewAdapterCreator");
        Intrinsics.checkNotNullParameter(assetAdapters, "assetAdapters");
        this.f33521a = imageProvider;
        this.f33522b = onClickListenerFactory;
        this.f33523c = weakViewProvider;
        this.f33524d = assetAdapters;
    }

    public final void a() {
        for (InterfaceC2299vf<?> interfaceC2299vf : this.f33524d.values()) {
            if (interfaceC2299vf != null) {
                interfaceC2299vf.a();
            }
        }
    }

    public final void b() {
        for (InterfaceC2299vf<?> interfaceC2299vf : this.f33524d.values()) {
            if (interfaceC2299vf != null) {
                interfaceC2299vf.destroy();
            }
        }
    }

    @Nullable
    public final void c() {
        Intrinsics.checkNotNullParameter(null, "assetName");
        this.f33524d.get(null);
    }

    @NotNull
    public final Map<String, InterfaceC2299vf<?>> d() {
        return this.f33524d;
    }

    @NotNull
    public final zi0 e() {
        return this.f33521a;
    }

    @Nullable
    public final View f() {
        return this.f33523c.e();
    }

    @NotNull
    public final mo g() {
        return this.f33522b;
    }

    @NotNull
    public final f71 h() {
        return this.f33523c;
    }

    @Nullable
    public final InterfaceC2299vf<?> a(@Nullable C2276uf<?> c2276uf) {
        if (c2276uf != null) {
            return this.f33524d.get(c2276uf.b());
        }
        return null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ v61(g71 g71Var, C2286v2 c2286v2, zi0 zi0Var, xj0 xj0Var, mo moVar, h51 h51Var, C1975hg c1975hg, a91 a91Var, h81 h81Var, C2360y7 c2360y7, tb1 tb1Var, t41 t41Var, ww0 ww0Var, nx1 nx1Var, av avVar) {
        this(g71Var, c2286v2, zi0Var, xj0Var, moVar, h51Var, c1975hg, a91Var, h81Var, c2360y7, tb1Var, t41Var, ww0Var, avVar, r1, r9, r17, new C2345xf(r1, zi0Var, r17, a91Var, h81Var, c2360y7, tb1Var, c2286v2.p().c(), avVar).a());
        f71 a4 = g71Var.a();
        ej2 ej2Var = new ej2(a4);
        qw0 qw0Var = new qw0(c1975hg, c2286v2, xj0Var, h51Var.c(), t41Var, ww0Var, ej2Var, nx1Var);
    }
}
