package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.x41;
import kotlin.jvm.internal.Intrinsics;
import o2.AbstractC3337k;
import o2.InterfaceC3316J;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class i91 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC3316J f27142a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final d91 f27143b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final da1 f27144c;

    public interface a {
        void a(@NotNull sk1 sk1Var, @NotNull h41 h41Var);
    }

    public /* synthetic */ i91(Context context, vu1 vu1Var, C2105n4 c2105n4, t41 t41Var, InterfaceC3316J interfaceC3316J) {
        this(context, vu1Var, c2105n4, t41Var, interfaceC3316J, new d91(context, interfaceC3316J, c2105n4, t41Var), new da1(context, vu1Var.a()));
    }

    public final void a() {
        this.f27143b.a();
        this.f27144c.a();
        o2.K.f(this.f27142a, null, 1, null);
    }

    public i91(@NotNull Context context, @NotNull vu1 sdkEnvironmentModule, @NotNull C2105n4 adLoadingPhasesManager, @NotNull t41 controllers, @NotNull InterfaceC3316J coroutineScope, @NotNull d91 nativeMediaLoader, @NotNull da1 nativeVerificationResourcesLoader) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
        Intrinsics.checkNotNullParameter(controllers, "controllers");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(nativeMediaLoader, "nativeMediaLoader");
        Intrinsics.checkNotNullParameter(nativeVerificationResourcesLoader, "nativeVerificationResourcesLoader");
        this.f27142a = coroutineScope;
        this.f27143b = nativeMediaLoader;
        this.f27144c = nativeVerificationResourcesLoader;
    }

    public final void a(@NotNull Context context, @NotNull C2286v2 adConfiguration, @NotNull h41 nativeAdBlock, @NotNull x41.a.C0206a listener, @NotNull tv debugEventReporter, @NotNull v41 nativeAdCreationListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(nativeAdBlock, "nativeAdBlock");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(debugEventReporter, "debugEventReporter");
        Intrinsics.checkNotNullParameter(nativeAdCreationListener, "nativeAdCreationListener");
        AbstractC3337k.d(this.f27142a, new k91(nativeAdCreationListener), null, new j91(context, nativeAdCreationListener, listener, this, adConfiguration, nativeAdBlock, debugEventReporter, null), 2, null);
    }
}
