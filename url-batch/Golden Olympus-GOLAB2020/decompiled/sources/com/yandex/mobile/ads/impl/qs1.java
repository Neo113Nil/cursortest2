package com.yandex.mobile.ads.impl;

import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class qs1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final LinkedHashSet f30883a = new LinkedHashSet();

    public final synchronized void a(@NotNull ps1 route) {
        Intrinsics.checkNotNullParameter(route, "route");
        this.f30883a.remove(route);
    }

    public final synchronized void b(@NotNull ps1 failedRoute) {
        Intrinsics.checkNotNullParameter(failedRoute, "failedRoute");
        this.f30883a.add(failedRoute);
    }

    public final synchronized boolean c(@NotNull ps1 route) {
        Intrinsics.checkNotNullParameter(route, "route");
        return this.f30883a.contains(route);
    }
}
