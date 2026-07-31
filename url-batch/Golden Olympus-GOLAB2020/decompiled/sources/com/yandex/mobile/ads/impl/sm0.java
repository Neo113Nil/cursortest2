package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class sm0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ss f31845a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ob2<on0> f31846b;

    public sm0(@NotNull ss adBreak, @NotNull ob2<on0> videoAdInfo) {
        Intrinsics.checkNotNullParameter(adBreak, "adBreak");
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        this.f31845a = adBreak;
        this.f31846b = videoAdInfo;
    }

    @NotNull
    public final String a() {
        int a4 = this.f31846b.d().b().a();
        return "yma_" + this.f31845a + "_position_" + a4;
    }
}
