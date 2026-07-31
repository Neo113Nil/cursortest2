package com.yandex.mobile.ads.impl;

import com.monetization.ads.nativeads.CustomizableMediaView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class gb1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final dv f26094a;

    public /* synthetic */ gb1() {
        this(new dv());
    }

    @NotNull
    public final nf2 a(@NotNull CustomizableMediaView mediaView) {
        Intrinsics.checkNotNullParameter(mediaView, "mediaView");
        this.f26094a.getClass();
        Intrinsics.checkNotNullParameter(mediaView, "mediaView");
        nf2 videoScaleType = mediaView.getVideoScaleType();
        return videoScaleType == null ? nf2.f29561b : videoScaleType;
    }

    public gb1(@NotNull dv customizableMediaViewManager) {
        Intrinsics.checkNotNullParameter(customizableMediaViewManager, "customizableMediaViewManager");
        this.f26094a = customizableMediaViewManager;
    }
}
