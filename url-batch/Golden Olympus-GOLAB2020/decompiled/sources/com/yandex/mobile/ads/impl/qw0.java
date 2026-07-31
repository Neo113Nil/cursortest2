package com.yandex.mobile.ads.impl;

import com.monetization.ads.nativeads.CustomizableMediaView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class qw0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1975hg f30915a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2286v2 f30916b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final xj0 f30917c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private final rw0 f30918d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final t41 f30919e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final ww0 f30920f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final iv0 f30921g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    private final nx1 f30922h;

    public qw0(@NotNull C1975hg assetValueProvider, @NotNull C2286v2 adConfiguration, @NotNull xj0 impressionEventsObservable, @Nullable rw0 rw0Var, @NotNull t41 nativeAdControllers, @NotNull ww0 mediaViewRenderController, @NotNull ej2 controlsProvider, @Nullable nx1 nx1Var) {
        Intrinsics.checkNotNullParameter(assetValueProvider, "assetValueProvider");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(impressionEventsObservable, "impressionEventsObservable");
        Intrinsics.checkNotNullParameter(nativeAdControllers, "nativeAdControllers");
        Intrinsics.checkNotNullParameter(mediaViewRenderController, "mediaViewRenderController");
        Intrinsics.checkNotNullParameter(controlsProvider, "controlsProvider");
        this.f30915a = assetValueProvider;
        this.f30916b = adConfiguration;
        this.f30917c = impressionEventsObservable;
        this.f30918d = rw0Var;
        this.f30919e = nativeAdControllers;
        this.f30920f = mediaViewRenderController;
        this.f30921g = controlsProvider;
        this.f30922h = nx1Var;
    }

    @Nullable
    public final pw0 a(@NotNull CustomizableMediaView mediaView, @NotNull zi0 imageProvider, @NotNull a91 nativeMediaContent, @NotNull h81 nativeForcePauseObserver) {
        Intrinsics.checkNotNullParameter(mediaView, "mediaView");
        Intrinsics.checkNotNullParameter(imageProvider, "imageProvider");
        Intrinsics.checkNotNullParameter(nativeMediaContent, "nativeMediaContent");
        Intrinsics.checkNotNullParameter(nativeForcePauseObserver, "nativeForcePauseObserver");
        mw0 a4 = this.f30915a.a();
        rw0 rw0Var = this.f30918d;
        if (rw0Var != null) {
            return rw0Var.a(mediaView, this.f30916b, imageProvider, this.f30921g, this.f30917c, nativeMediaContent, nativeForcePauseObserver, this.f30919e, this.f30920f, this.f30922h, a4);
        }
        return null;
    }
}
