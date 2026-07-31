package com.yandex.mobile.ads.nativeads;

import com.yandex.mobile.ads.impl.pt;
import com.yandex.mobile.ads.impl.qt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class c implements pt {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final CustomClickHandler f35898a;

    public c(@NotNull CustomClickHandler customClickHandler) {
        Intrinsics.checkNotNullParameter(customClickHandler, "customClickHandler");
        this.f35898a = customClickHandler;
    }

    @Override // com.yandex.mobile.ads.impl.pt
    public final void a(@NotNull String url, @NotNull qt listener) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f35898a.handleCustomClick(url, new d(listener));
    }
}
