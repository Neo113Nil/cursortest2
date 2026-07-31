package com.yandex.mobile.ads.impl;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ky1 implements InterfaceC2285v1 {

    /* renamed from: b, reason: collision with root package name */
    private static final long f28357b = TimeUnit.SECONDS.toMillis(5);

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2360y7<?> f28358a;

    public ky1(@NotNull C2360y7<?> adResponse) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        this.f28358a = adResponse;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2285v1
    public final long a() {
        Long K3 = this.f28358a.K();
        return K3 != null ? K3.longValue() : f28357b;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2285v1
    public final long a(long j4) {
        Long K3 = this.f28358a.K();
        return K3 != null ? Math.min(j4, K3.longValue()) : j4;
    }
}
