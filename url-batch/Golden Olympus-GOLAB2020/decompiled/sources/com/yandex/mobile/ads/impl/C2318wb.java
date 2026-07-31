package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.wb, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2318wb implements InterfaceC2181qb {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f33985a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Runnable f33986b;

    public C2318wb(@NotNull String request, @NotNull Runnable adtuneRequestRunnable) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(adtuneRequestRunnable, "adtuneRequestRunnable");
        this.f33985a = request;
        this.f33986b = adtuneRequestRunnable;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2181qb
    public final void a() {
        this.f33986b.run();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2181qb
    public final boolean a(@Nullable String str, @Nullable String str2) {
        return Intrinsics.areEqual("mobileads", str) && Intrinsics.areEqual(this.f33985a, str2);
    }
}
