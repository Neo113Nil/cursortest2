package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class f91 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1920f9 f25719a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final u32 f25720b;

    public f91(@NotNull C1920f9 adTracker, @NotNull u32 targetUrlHandler) {
        Intrinsics.checkNotNullParameter(adTracker, "adTracker");
        Intrinsics.checkNotNullParameter(targetUrlHandler, "targetUrlHandler");
        this.f25719a = adTracker;
        this.f25720b = targetUrlHandler;
    }

    @NotNull
    public final e91 a(@NotNull np1 clickReporter) {
        Intrinsics.checkNotNullParameter(clickReporter, "clickReporter");
        return new e91(this.f25719a, this.f25720b, clickReporter);
    }
}
