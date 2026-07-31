package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.mc2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ci1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1800a9 f24221a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C1916f5 f24222b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C2271ua f24223c;

    public ci1(@NotNull C1800a9 adStateHolder, @NotNull C1916f5 adPlayerEventsController, @NotNull C2271ua adsLoaderPlaybackErrorConverter) {
        Intrinsics.checkNotNullParameter(adStateHolder, "adStateHolder");
        Intrinsics.checkNotNullParameter(adPlayerEventsController, "adPlayerEventsController");
        Intrinsics.checkNotNullParameter(adsLoaderPlaybackErrorConverter, "adsLoaderPlaybackErrorConverter");
        this.f24221a = adStateHolder;
        this.f24222b = adPlayerEventsController;
        this.f24223c = adsLoaderPlaybackErrorConverter;
    }

    public final void a(@Nullable Exception exc) {
        mc2 mc2Var;
        ti1 c4 = this.f24221a.c();
        on0 d4 = c4 != null ? c4.d() : null;
        dm0 a4 = d4 != null ? this.f24221a.a(d4) : null;
        if (a4 == null || dm0.f24678b == a4) {
            return;
        }
        if (exc != null) {
            this.f24223c.getClass();
            mc2Var = C2271ua.c(exc);
        } else {
            mc2Var = new mc2(mc2.a.f28999D, new k00());
        }
        this.f24222b.a(d4, mc2Var);
    }
}
