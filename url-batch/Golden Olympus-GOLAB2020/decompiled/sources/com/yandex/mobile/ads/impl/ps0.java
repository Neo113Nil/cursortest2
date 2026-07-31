package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ps0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final qs0 f30555a = new qs0();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final m42 f30556b = new m42();

    public final void a(@NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.f30556b.getClass();
        if (m42.a()) {
            runnable.run();
        } else {
            this.f30555a.a(runnable);
        }
    }

    public final void a() {
        this.f30555a.a();
    }
}
