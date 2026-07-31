package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class oy implements u32 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2286v2 f30224a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2360y7<?> f30225b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C1871d8 f30226c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C2148p1 f30227d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final e50 f30228e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final WeakReference<Context> f30229f;

    public oy(@NotNull Context context, @NotNull C2148p1 adActivityShowManager, @NotNull C2360y7 adResponse, @NotNull C1871d8 receiver, @NotNull vu1 sdkEnvironmentModule, @NotNull e50 environmentController, @NotNull C2286v2 adConfiguration) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        Intrinsics.checkNotNullParameter(adActivityShowManager, "adActivityShowManager");
        Intrinsics.checkNotNullParameter(environmentController, "environmentController");
        this.f30224a = adConfiguration;
        this.f30225b = adResponse;
        this.f30226c = receiver;
        this.f30227d = adActivityShowManager;
        this.f30228e = environmentController;
        this.f30229f = new WeakReference<>(context);
    }

    @Override // com.yandex.mobile.ads.impl.u32
    public final void a(@NotNull np1 reporter, @NotNull String targetUrl) {
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(targetUrl, "targetUrl");
        this.f30228e.c().getClass();
        this.f30227d.a(this.f30229f.get(), this.f30224a, this.f30225b, reporter, targetUrl, this.f30226c, Intrinsics.areEqual((Object) null, Boolean.TRUE) || this.f30225b.G());
    }
}
