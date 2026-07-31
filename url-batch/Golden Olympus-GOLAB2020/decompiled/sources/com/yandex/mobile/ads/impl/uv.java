package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class uv {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final tv f33359a;

    public uv(@NotNull Context context, @NotNull C2286v2 adConfiguration, @NotNull jp1 debugParams) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(debugParams, "debugParams");
        adConfiguration.p().f();
        this.f33359a = new tv(C1900ed.a(context, zm2.f35627a, adConfiguration.p().b()), debugParams);
    }

    @NotNull
    public final tv a() {
        return this.f33359a;
    }
}
