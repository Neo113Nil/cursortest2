package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import o2.AbstractC3337k;
import o2.InterfaceC3316J;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class au1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC3316J f23451a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Context f23452b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C2105n4 f23453c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final e50 f23454d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C1803ac f23455e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final jv1 f23456f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final y22 f23457g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final yt1 f23458h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final we1 f23459i;

    public au1(@NotNull Context context, @NotNull um2 sdkEnvironmentModule, @NotNull InterfaceC3316J coroutineScope, @NotNull Context appContext, @NotNull C2105n4 adLoadingPhasesManager, @NotNull e50 environmentController, @NotNull C1803ac advertisingConfiguration, @NotNull jv1 sdkInitializer, @NotNull y22 strongReferenceKeepingManager, @NotNull yt1 bidderTokenGenerator, @NotNull we1 resultReporter) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
        Intrinsics.checkNotNullParameter(environmentController, "environmentController");
        Intrinsics.checkNotNullParameter(advertisingConfiguration, "advertisingConfiguration");
        Intrinsics.checkNotNullParameter(sdkInitializer, "sdkInitializer");
        Intrinsics.checkNotNullParameter(strongReferenceKeepingManager, "strongReferenceKeepingManager");
        Intrinsics.checkNotNullParameter(bidderTokenGenerator, "bidderTokenGenerator");
        Intrinsics.checkNotNullParameter(resultReporter, "resultReporter");
        this.f23451a = coroutineScope;
        this.f23452b = appContext;
        this.f23453c = adLoadingPhasesManager;
        this.f23454d = environmentController;
        this.f23455e = advertisingConfiguration;
        this.f23456f = sdkInitializer;
        this.f23457g = strongReferenceKeepingManager;
        this.f23458h = bidderTokenGenerator;
        this.f23459i = resultReporter;
    }

    public final void a(@Nullable C2074lk c2074lk, @NotNull kl2 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        AbstractC3337k.d(this.f23451a, null, null, new zt1(this, c2074lk, listener, null), 3, null);
    }
}
