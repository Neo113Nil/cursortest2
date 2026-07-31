package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.ef, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1902ef {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC2020je f25279a;

    public /* synthetic */ C1902ef() {
        this(C2044ke.a());
    }

    @Nullable
    public final String a() {
        return this.f25279a.a();
    }

    public C1902ef(@NotNull InterfaceC2020je appMetricaAdapter) {
        Intrinsics.checkNotNullParameter(appMetricaAdapter, "appMetricaAdapter");
        this.f25279a = appMetricaAdapter;
    }
}
