package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.nativeads.CustomizableMediaView;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class nv1 implements rw0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2360y7<?> f29762a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final vw0 f29763b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final sw0 f29764c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final uw0 f29765d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final tw0 f29766e;

    public nv1(@NotNull vu1 sdkEnvironmentModule, @NotNull C2360y7<?> adResponse, @NotNull vw0 mediaViewAdapterWithVideoCreator, @NotNull sw0 mediaViewAdapterWithImageCreator, @NotNull uw0 mediaViewAdapterWithMultiBannerCreator, @NotNull tw0 mediaViewAdapterWithMediaCreator) {
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(mediaViewAdapterWithVideoCreator, "mediaViewAdapterWithVideoCreator");
        Intrinsics.checkNotNullParameter(mediaViewAdapterWithImageCreator, "mediaViewAdapterWithImageCreator");
        Intrinsics.checkNotNullParameter(mediaViewAdapterWithMultiBannerCreator, "mediaViewAdapterWithMultiBannerCreator");
        Intrinsics.checkNotNullParameter(mediaViewAdapterWithMediaCreator, "mediaViewAdapterWithMediaCreator");
        this.f29762a = adResponse;
        this.f29763b = mediaViewAdapterWithVideoCreator;
        this.f29764c = mediaViewAdapterWithImageCreator;
        this.f29765d = mediaViewAdapterWithMultiBannerCreator;
        this.f29766e = mediaViewAdapterWithMediaCreator;
    }

    private final pw0 a(CustomizableMediaView customizableMediaView, C2286v2 c2286v2, zi0 zi0Var, ww0 ww0Var, nx1 nx1Var, mw0 mw0Var) {
        CustomizableMediaView customizableMediaView2;
        zi0 zi0Var2;
        ww0 ww0Var2;
        List<ej0> a4 = mw0Var.a();
        if (a4 == null || a4.isEmpty()) {
            return null;
        }
        if (a4.size() == 1) {
            return this.f29764c.a(customizableMediaView, zi0Var, ww0Var);
        }
        try {
            customizableMediaView2 = customizableMediaView;
            zi0Var2 = zi0Var;
            ww0Var2 = ww0Var;
        } catch (Throwable unused) {
            customizableMediaView2 = customizableMediaView;
            zi0Var2 = zi0Var;
            ww0Var2 = ww0Var;
        }
        try {
            return this.f29765d.a(this.f29762a, c2286v2, customizableMediaView2, zi0Var2, a4, ww0Var2, nx1Var);
        } catch (Throwable unused2) {
            return this.f29764c.a(customizableMediaView2, zi0Var2, ww0Var2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.yandex.mobile.ads.impl.sv1] */
    /* JADX WARN: Type inference failed for: r8v1, types: [com.yandex.mobile.ads.impl.rv1] */
    @Override // com.yandex.mobile.ads.impl.rw0
    @Nullable
    public final pw0 a(@NotNull CustomizableMediaView mediaView, @NotNull C2286v2 adConfiguration, @NotNull zi0 imageProvider, @NotNull iv0 controlsProvider, @NotNull xj0 impressionEventsObservable, @NotNull a91 nativeMediaContent, @NotNull h81 nativeForcePauseObserver, @NotNull t41 nativeAdControllers, @NotNull ww0 mediaViewRenderController, @Nullable nx1 nx1Var, @Nullable mw0 mw0Var) {
        pw0 a4;
        Intrinsics.checkNotNullParameter(mediaView, "mediaView");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(imageProvider, "imageProvider");
        Intrinsics.checkNotNullParameter(controlsProvider, "controlsProvider");
        Intrinsics.checkNotNullParameter(impressionEventsObservable, "impressionEventsObservable");
        Intrinsics.checkNotNullParameter(nativeMediaContent, "nativeMediaContent");
        Intrinsics.checkNotNullParameter(nativeForcePauseObserver, "nativeForcePauseObserver");
        Intrinsics.checkNotNullParameter(nativeAdControllers, "nativeAdControllers");
        Intrinsics.checkNotNullParameter(mediaViewRenderController, "mediaViewRenderController");
        pv1 pv1Var = null;
        pv1Var = null;
        pv1Var = null;
        pv1Var = null;
        if (mw0Var == null) {
            return null;
        }
        ra1 a5 = nativeMediaContent.a();
        wb1 b4 = nativeMediaContent.b();
        eu0 b5 = mw0Var.b();
        Context context = mediaView.getContext();
        Context context2 = mediaView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        boolean a6 = n80.a(context2, m80.f28942e);
        if (a6) {
            mediaView.removeAllViews();
        }
        if (a5 != null) {
            ?? a7 = this.f29763b.a(mediaView, controlsProvider, adConfiguration, impressionEventsObservable, a5, nativeForcePauseObserver, nativeAdControllers, mediaViewRenderController, imageProvider, nx1Var, mw0Var.c());
            uy1 a8 = nx1Var != null ? nx1Var.a() : null;
            pv1Var = (a8 == null || !a6 || (a4 = a(mediaView, adConfiguration, imageProvider, mediaViewRenderController, nx1Var, mw0Var)) == null) ? a7 : new sv1(mediaView, a7, a4, mediaViewRenderController, a8);
        } else if (b4 != null && b5 != null) {
            Intrinsics.checkNotNull(context);
            if (C2362y9.a(context)) {
                try {
                    pv1Var = this.f29766e.a(mediaView, b5, impressionEventsObservable, b4, mediaViewRenderController);
                } catch (ij2 unused) {
                }
            }
        }
        return pv1Var == null ? a(mediaView, adConfiguration, imageProvider, mediaViewRenderController, nx1Var, mw0Var) : pv1Var;
    }
}
