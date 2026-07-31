package com.yandex.mobile.ads.impl;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class cr {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final wn1 f24293a;

    public cr() {
        this(TimeUnit.MINUTES);
    }

    @NotNull
    public final wn1 a() {
        return this.f24293a;
    }

    public cr(@NotNull wn1 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f24293a = delegate;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public cr(@NotNull TimeUnit timeUnit) {
        this(new wn1(a42.f23152h, timeUnit));
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
    }
}
