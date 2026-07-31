package com.yandex.mobile.ads.impl;

import com.monetization.ads.nativeads.CustomizableMediaView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class by0 implements rw0 {
    @Override // com.yandex.mobile.ads.impl.rw0
    @NotNull
    public final pw0 a(@NotNull CustomizableMediaView mediaView, @NotNull C2286v2 adConfiguration, @NotNull zi0 imageProvider, @NotNull iv0 controlsProvider, @NotNull xj0 impressionEventsObservable, @NotNull a91 nativeMediaContent, @NotNull h81 nativeForcePauseObserver, @NotNull t41 nativeAdControllers, @NotNull ww0 mediaViewRenderController, @Nullable nx1 nx1Var, @Nullable mw0 mw0Var) {
        Intrinsics.checkNotNullParameter(mediaView, "mediaView");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(imageProvider, "imageProvider");
        Intrinsics.checkNotNullParameter(controlsProvider, "controlsProvider");
        Intrinsics.checkNotNullParameter(impressionEventsObservable, "impressionEventsObservable");
        Intrinsics.checkNotNullParameter(nativeMediaContent, "nativeMediaContent");
        Intrinsics.checkNotNullParameter(nativeForcePauseObserver, "nativeForcePauseObserver");
        Intrinsics.checkNotNullParameter(nativeAdControllers, "nativeAdControllers");
        Intrinsics.checkNotNullParameter(mediaViewRenderController, "mediaViewRenderController");
        mediaView.removeAllViews();
        return new ay0(mediaView, mediaViewRenderController);
    }
}
