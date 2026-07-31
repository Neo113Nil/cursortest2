package com.yandex.mobile.ads.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class km0 {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private jm0 f28251a;

    @Nullable
    public final jm0 a() {
        return this.f28251a;
    }

    public final void b() {
        this.f28251a = null;
    }

    public final void a(@NotNull j70 instreamAdView, @NotNull List<mb2> friendlyOverlays) {
        Intrinsics.checkNotNullParameter(instreamAdView, "instreamAdView");
        Intrinsics.checkNotNullParameter(friendlyOverlays, "friendlyOverlays");
        this.f28251a = new jm0(instreamAdView, friendlyOverlays);
    }
}
