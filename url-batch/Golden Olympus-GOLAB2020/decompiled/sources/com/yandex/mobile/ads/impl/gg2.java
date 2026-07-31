package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class gg2 extends kg2<mb1, ab2> {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C2360y7<?> f26131c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final eg2 f26132d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final eb1 f26133e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final dg2 f26134f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final sa1 f26135g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    private cg2 f26136h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gg2(@NotNull vu1 sdkEnvironmentModule, @NotNull mb1 view, @NotNull me2 videoOptions, @NotNull C2286v2 adConfiguration, @NotNull C2360y7 adResponse, @NotNull xj0 impressionEventsObservable, @NotNull ra1 nativeVideoPlaybackEventListener, @NotNull h81 nativeForcePauseObserver, @NotNull t41 nativeAdControllers, @NotNull zi0 imageProvider, @Nullable nx1 nx1Var, @NotNull eg2 videoTrackerForceImpressionController) {
        super(view);
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(videoOptions, "videoOptions");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(impressionEventsObservable, "impressionEventsObservable");
        Intrinsics.checkNotNullParameter(nativeVideoPlaybackEventListener, "nativeVideoPlaybackEventListener");
        Intrinsics.checkNotNullParameter(nativeForcePauseObserver, "nativeForcePauseObserver");
        Intrinsics.checkNotNullParameter(nativeAdControllers, "nativeAdControllers");
        Intrinsics.checkNotNullParameter(imageProvider, "imageProvider");
        Intrinsics.checkNotNullParameter(videoTrackerForceImpressionController, "videoTrackerForceImpressionController");
        this.f26131c = adResponse;
        this.f26132d = videoTrackerForceImpressionController;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f26133e = new eb1(context, this, videoOptions, adConfiguration, adResponse, impressionEventsObservable, nativeVideoPlaybackEventListener, nativeForcePauseObserver, imageProvider, nx1Var);
        this.f26134f = new dg2(sdkEnvironmentModule.d());
        this.f26135g = nativeAdControllers.a();
        impressionEventsObservable.a(videoTrackerForceImpressionController);
    }

    @Override // com.yandex.mobile.ads.impl.kg2
    public final void a(mb1 mb1Var) {
        mb1 view = mb1Var;
        Intrinsics.checkNotNullParameter(view, "view");
        this.f26133e.a(view);
        super.a(view);
    }

    @Override // com.yandex.mobile.ads.impl.kg2
    public final void b(mb1 mb1Var, ab2 ab2Var) {
        mb1 view = mb1Var;
        ab2 video = ab2Var;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(video, "video");
        ob2<ya1> b4 = video.b();
        dg2 dg2Var = this.f26134f;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        cg2 a4 = dg2Var.a(context, b4, pc2.f30412e);
        this.f26136h = a4;
        this.f26132d.a(a4);
        sa1 sa1Var = this.f26135g;
        Context context2 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        sa1Var.a(context2, b4, this.f26131c);
        this.f26133e.a(view, video, a4);
    }

    @Override // com.yandex.mobile.ads.impl.kg2
    public final void a(C2276uf asset, ng2 viewConfigurator, ab2 ab2Var) {
        ab2 ab2Var2 = ab2Var;
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(viewConfigurator, "viewConfigurator");
        mb1 b4 = b();
        if (b4 != null) {
            viewConfigurator.a(b4, asset);
            if (ab2Var2 == null || this.f26136h == null) {
                return;
            }
            ob2<ya1> b5 = ab2Var2.b();
            viewConfigurator.a((C2276uf<?>) asset, new vd2(b4, b5.b()));
            this.f26133e.a(b4, b5);
        }
    }

    @Override // com.yandex.mobile.ads.impl.kg2
    public final void a() {
        cg2 cg2Var = this.f26136h;
        if (cg2Var != null) {
            cg2Var.k();
        }
        this.f26132d.a(null);
    }

    @Override // com.yandex.mobile.ads.impl.kg2
    public final boolean a(mb1 mb1Var, ab2 ab2Var) {
        mb1 view = mb1Var;
        ab2 value = ab2Var;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(value, "value");
        return true;
    }
}
