package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.ve, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2298ve {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC2343xd f33588a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC2020je f33589b;

    public C2298ve(@NotNull InterfaceC2343xd appAdAnalyticsActivator, @NotNull InterfaceC2020je appMetricaAdapter) {
        Intrinsics.checkNotNullParameter(appAdAnalyticsActivator, "appAdAnalyticsActivator");
        Intrinsics.checkNotNullParameter(appMetricaAdapter, "appMetricaAdapter");
        this.f33588a = appAdAnalyticsActivator;
        this.f33589b = appMetricaAdapter;
    }

    @Nullable
    public final mp1 a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.f33589b.a(context, C2385z9.a(context) ? "322a737a-a0ca-44e0-bc85-649b1c7c1db6" : "478cb909-6ad1-4e12-84cc-b3629a789f93", this.f33588a);
    }
}
