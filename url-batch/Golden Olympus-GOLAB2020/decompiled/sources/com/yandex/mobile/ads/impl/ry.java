package com.yandex.mobile.ads.impl;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ry {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final TimeUnit f31469a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final W1.h f31470b;

    public ry(@NotNull TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        this.f31469a = timeUnit;
        this.f31470b = W1.i.b(new qy(this));
    }

    public static final /* synthetic */ long a(ry ryVar) {
        ryVar.getClass();
        return 1L;
    }

    public final long a() {
        return ((Number) this.f31470b.getValue()).longValue();
    }
}
