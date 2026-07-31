package com.yandex.mobile.ads.impl;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class sy1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Object f32081a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private boolean f32082b;

    public final void a(@NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        synchronized (this.f32081a) {
            if (this.f32082b) {
                return;
            }
            this.f32082b = true;
            Unit unit = Unit.f41027a;
            runnable.run();
        }
    }
}
