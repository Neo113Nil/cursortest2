package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.mc2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class di1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1824b9 f24642a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C1940g5 f24643b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C2294va f24644c;

    public di1(@NotNull C1824b9 adStateHolder, @NotNull C1940g5 adPlayerEventsController, @NotNull C2294va adsLoaderPlaybackErrorConverter) {
        Intrinsics.checkNotNullParameter(adStateHolder, "adStateHolder");
        Intrinsics.checkNotNullParameter(adPlayerEventsController, "adPlayerEventsController");
        Intrinsics.checkNotNullParameter(adsLoaderPlaybackErrorConverter, "adsLoaderPlaybackErrorConverter");
        this.f24642a = adStateHolder;
        this.f24643b = adPlayerEventsController;
        this.f24644c = adsLoaderPlaybackErrorConverter;
    }

    public final void a(@Nullable Exception exc) {
        mc2 mc2Var;
        ui1 c4 = this.f24642a.c();
        on0 d4 = c4 != null ? c4.d() : null;
        em0 a4 = d4 != null ? this.f24642a.a(d4) : null;
        if (a4 == null || em0.f25351b == a4) {
            return;
        }
        if (exc != null) {
            this.f24644c.getClass();
            mc2Var = C2294va.c(exc);
        } else {
            mc2Var = new mc2(mc2.a.f28999D, new k00());
        }
        this.f24643b.a(d4, mc2Var);
    }
}
