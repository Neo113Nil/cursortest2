package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class vm0 implements xe1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final dn0 f33689a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final on0 f33690b;

    public vm0(@NotNull dn0 instreamInteractionTracker, @NotNull on0 videoAd, @NotNull pz customAdClickHandler) {
        Intrinsics.checkNotNullParameter(instreamInteractionTracker, "instreamInteractionTracker");
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        Intrinsics.checkNotNullParameter(customAdClickHandler, "customAdClickHandler");
        this.f33689a = instreamInteractionTracker;
        this.f33690b = videoAd;
    }

    @Override // com.yandex.mobile.ads.impl.xe1
    public final void a(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        new um0(this.f33689a);
        throw null;
    }
}
