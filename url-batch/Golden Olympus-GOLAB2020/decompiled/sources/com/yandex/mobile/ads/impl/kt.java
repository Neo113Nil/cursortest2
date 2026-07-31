package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class kt {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final h81 f28316a;

    public kt(@NotNull h81 nativeForcePauseObserver) {
        Intrinsics.checkNotNullParameter(nativeForcePauseObserver, "nativeForcePauseObserver");
        this.f28316a = nativeForcePauseObserver;
    }

    public final void a() {
        this.f28316a.b();
    }

    public final void b() {
        this.f28316a.a();
    }
}
