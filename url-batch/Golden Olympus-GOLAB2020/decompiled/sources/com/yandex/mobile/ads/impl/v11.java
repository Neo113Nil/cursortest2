package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class v11 implements jo {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final j21 f33461a;

    public v11(@NotNull j21 mraidWebView) {
        Intrinsics.checkNotNullParameter(mraidWebView, "mraidWebView");
        this.f33461a = mraidWebView;
    }

    @Override // com.yandex.mobile.ads.impl.jo
    public final void a(@NotNull dr0 link, @NotNull lo clickListenerCreator) {
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(clickListenerCreator, "clickListenerCreator");
        this.f33461a.setClickListener(new u11(link, clickListenerCreator));
    }
}
