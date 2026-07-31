package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ye1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final xr0 f35085a;

    public /* synthetic */ ye1(Context context) {
        this(context, zr0.a(context));
    }

    public final boolean a() {
        return this.f35085a.a("OPT_OUT_ENABLED", false);
    }

    public final void b() {
        this.f35085a.b("OPT_OUT_ENABLED", true);
    }

    public ye1(@NotNull Context context, @NotNull xr0 localStorage) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(localStorage, "localStorage");
        this.f35085a = localStorage;
    }
}
