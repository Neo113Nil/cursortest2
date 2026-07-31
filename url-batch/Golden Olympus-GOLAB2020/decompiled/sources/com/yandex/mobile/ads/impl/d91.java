package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import o2.InterfaceC3316J;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class d91 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final u81 f24509a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final yb1 f24510b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final sa1 f24511c;

    public /* synthetic */ d91(Context context, InterfaceC3316J interfaceC3316J, C2105n4 c2105n4, t41 t41Var) {
        this(context, interfaceC3316J, c2105n4, t41Var, new u81(context, interfaceC3316J, c2105n4), new yb1(c2105n4));
    }

    public final void a() {
        this.f24511c.a();
        this.f24509a.getClass();
        this.f24510b.getClass();
    }

    public d91(@NotNull Context context, @NotNull InterfaceC3316J coroutineScope, @NotNull C2105n4 adLoadingPhasesManager, @NotNull t41 nativeAdControllers, @NotNull u81 nativeImagesLoader, @NotNull yb1 webViewLoader) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
        Intrinsics.checkNotNullParameter(nativeAdControllers, "nativeAdControllers");
        Intrinsics.checkNotNullParameter(nativeImagesLoader, "nativeImagesLoader");
        Intrinsics.checkNotNullParameter(webViewLoader, "webViewLoader");
        this.f24509a = nativeImagesLoader;
        this.f24510b = webViewLoader;
        this.f24511c = nativeAdControllers.a();
    }
}
