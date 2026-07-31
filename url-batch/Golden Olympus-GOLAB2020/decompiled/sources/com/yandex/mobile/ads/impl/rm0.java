package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class rm0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final sm0 f31287a;

    public rm0(@NotNull ss coreInstreamAdBreak, @NotNull ob2<on0> videoAdInfo) {
        Intrinsics.checkNotNullParameter(coreInstreamAdBreak, "coreInstreamAdBreak");
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        this.f31287a = new sm0(coreInstreamAdBreak, videoAdInfo);
    }

    public final void a(@NotNull db2 uiElements) {
        Intrinsics.checkNotNullParameter(uiElements, "uiElements");
        uiElements.a().setTag(this.f31287a.a());
    }
}
