package com.yandex.mobile.ads.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class bl0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final rs f23859a;

    public bl0(@NotNull rs instreamAdBinder) {
        Intrinsics.checkNotNullParameter(instreamAdBinder, "instreamAdBinder");
        this.f23859a = instreamAdBinder;
    }

    public final void a(@NotNull j70 instreamAdView, @NotNull List<mb2> friendlyOverlays) {
        Intrinsics.checkNotNullParameter(instreamAdView, "instreamAdView");
        Intrinsics.checkNotNullParameter(friendlyOverlays, "friendlyOverlays");
        this.f23859a.a(instreamAdView, friendlyOverlays);
    }

    public final void b() {
        this.f23859a.d();
    }

    public final void a() {
        this.f23859a.c();
    }
}
