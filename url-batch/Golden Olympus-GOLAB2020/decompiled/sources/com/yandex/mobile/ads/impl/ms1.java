package com.yandex.mobile.ads.impl;

import com.monetization.ads.video.playback.view.ExtendedVideoAdControlsContainer;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ms1 implements nm0 {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final C2276uf<?> f29228a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final fo f29229b;

    public ms1(@Nullable C2276uf<?> c2276uf, @NotNull fo clickControlConfigurator) {
        Intrinsics.checkNotNullParameter(clickControlConfigurator, "clickControlConfigurator");
        this.f29228a = c2276uf;
        this.f29229b = clickControlConfigurator;
    }

    @Override // com.yandex.mobile.ads.impl.nm0
    public final void a(@NotNull db2 uiElements) {
        Intrinsics.checkNotNullParameter(uiElements, "uiElements");
        ExtendedVideoAdControlsContainer a4 = uiElements.a();
        C2276uf<?> c2276uf = this.f29228a;
        if (c2276uf == null || !c2276uf.e()) {
            return;
        }
        this.f29229b.a(a4);
    }
}
