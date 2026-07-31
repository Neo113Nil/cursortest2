package com.yandex.mobile.ads.impl;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class oy1 implements bz {

    /* renamed from: b, reason: collision with root package name */
    private static final long f30230b = TimeUnit.SECONDS.toMillis(5);

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2360y7<?> f30231a;

    public oy1(@NotNull C2360y7<?> adResponse) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        this.f30231a = adResponse;
    }

    @Override // com.yandex.mobile.ads.impl.bz
    public final long a() {
        Long K3 = this.f30231a.K();
        return K3 != null ? K3.longValue() : f30230b;
    }
}
