package com.yandex.mobile.ads.impl;

import com.monetization.ads.nativeads.CustomizableMediaView;
import com.yandex.mobile.ads.impl.pw0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ay0 extends pw0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ay0(@NotNull CustomizableMediaView mediaView, @NotNull ww0 mediaViewRenderController) {
        super(mediaView, mediaViewRenderController);
        Intrinsics.checkNotNullParameter(mediaView, "mediaView");
        Intrinsics.checkNotNullParameter(mediaViewRenderController, "mediaViewRenderController");
    }

    @Override // com.yandex.mobile.ads.impl.pw0
    public final void a(@NotNull CustomizableMediaView mediaView) {
        Intrinsics.checkNotNullParameter(mediaView, "mediaView");
    }

    @Override // com.yandex.mobile.ads.impl.pw0, com.yandex.mobile.ads.impl.kg2
    public final void b(CustomizableMediaView customizableMediaView, mw0 mw0Var) {
        CustomizableMediaView mediaView = customizableMediaView;
        mw0 mediaValue = mw0Var;
        Intrinsics.checkNotNullParameter(mediaView, "mediaView");
        Intrinsics.checkNotNullParameter(mediaValue, "mediaValue");
    }

    @Override // com.yandex.mobile.ads.impl.pw0
    @NotNull
    public final pw0.a d() {
        return pw0.a.f30599g;
    }

    @Override // com.yandex.mobile.ads.impl.kg2
    public final boolean a(CustomizableMediaView customizableMediaView, mw0 mw0Var) {
        CustomizableMediaView mediaView = customizableMediaView;
        mw0 mediaValue = mw0Var;
        Intrinsics.checkNotNullParameter(mediaView, "mediaView");
        Intrinsics.checkNotNullParameter(mediaValue, "mediaValue");
        return true;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.yandex.mobile.ads.impl.pw0
    /* renamed from: a */
    public final void b(@NotNull CustomizableMediaView mediaView, @NotNull mw0 mediaValue) {
        Intrinsics.checkNotNullParameter(mediaView, "mediaView");
        Intrinsics.checkNotNullParameter(mediaValue, "mediaValue");
    }

    @Override // com.yandex.mobile.ads.impl.pw0
    public final void a(@NotNull mw0 mediaValue) {
        Intrinsics.checkNotNullParameter(mediaValue, "mediaValue");
    }
}
