package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.FrameLayout;
import com.monetization.ads.nativeads.CustomizableMediaView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class vw0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final vu1 f33807a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2360y7<?> f33808b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final wf2 f33809c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final dv f33810d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final gb1 f33811e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final va1 f33812f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final pb1 f33813g;

    public /* synthetic */ vw0(vu1 vu1Var, C2360y7 c2360y7) {
        this(vu1Var, c2360y7, new wf2(), new dv(), new gb1());
    }

    @NotNull
    public final rv1 a(@NotNull CustomizableMediaView mediaView, @NotNull iv0 customControls, @NotNull C2286v2 adConfiguration, @NotNull xj0 impressionEventsObservable, @NotNull ra1 listener, @NotNull h81 nativeForcePauseObserver, @NotNull t41 nativeAdControllers, @NotNull ww0 mediaViewRenderController, @NotNull zi0 imageProvider, @Nullable nx1 nx1Var, @Nullable ab2 ab2Var) {
        Intrinsics.checkNotNullParameter(mediaView, "mediaView");
        Intrinsics.checkNotNullParameter(customControls, "customControls");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(impressionEventsObservable, "impressionEventsObservable");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(nativeForcePauseObserver, "nativeForcePauseObserver");
        Intrinsics.checkNotNullParameter(nativeAdControllers, "nativeAdControllers");
        Intrinsics.checkNotNullParameter(mediaViewRenderController, "mediaViewRenderController");
        Intrinsics.checkNotNullParameter(imageProvider, "imageProvider");
        Context context = mediaView.getContext();
        nf2 a4 = this.f33811e.a(mediaView);
        va1 va1Var = this.f33812f;
        pf2 d4 = ab2Var != null ? ab2Var.d() : null;
        va1Var.getClass();
        me2 me2Var = new me2(a4, d4 != null ? d4.b() : true, d4 != null ? d4.c() : false, d4 != null ? d4.a() : null);
        this.f33810d.getClass();
        Intrinsics.checkNotNullParameter(mediaView, "mediaView");
        int videoControlsLayoutId = mediaView.getVideoControlsLayoutId();
        pb1 pb1Var = this.f33813g;
        Intrinsics.checkNotNull(context);
        mb1 nativeVideoView = pb1Var.a(context, me2Var, customControls, ab2Var, videoControlsLayoutId);
        this.f33809c.getClass();
        Intrinsics.checkNotNullParameter(mediaView, "mediaView");
        Intrinsics.checkNotNullParameter(nativeVideoView, "nativeVideoView");
        Context context2 = mediaView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        if (!n80.a(context2, m80.f28942e)) {
            mediaView.removeAllViews();
        }
        mediaView.addView(nativeVideoView, new FrameLayout.LayoutParams(-1, -1));
        gg2 gg2Var = new gg2(this.f33807a, nativeVideoView, me2Var, adConfiguration, this.f33808b, impressionEventsObservable, listener, nativeForcePauseObserver, nativeAdControllers, imageProvider, nx1Var, new eg2());
        return new rv1(mediaView, gg2Var, mediaViewRenderController, new lg2(gg2Var));
    }

    public vw0(@NotNull vu1 sdkEnvironmentModule, @NotNull C2360y7<?> adResponse, @NotNull wf2 videoSubViewBinder, @NotNull dv customizableMediaViewManager, @NotNull gb1 nativeVideoScaleTypeProvider) {
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(videoSubViewBinder, "videoSubViewBinder");
        Intrinsics.checkNotNullParameter(customizableMediaViewManager, "customizableMediaViewManager");
        Intrinsics.checkNotNullParameter(nativeVideoScaleTypeProvider, "nativeVideoScaleTypeProvider");
        this.f33807a = sdkEnvironmentModule;
        this.f33808b = adResponse;
        this.f33809c = videoSubViewBinder;
        this.f33810d = customizableMediaViewManager;
        this.f33811e = nativeVideoScaleTypeProvider;
        this.f33812f = new va1();
        this.f33813g = new pb1();
    }
}
