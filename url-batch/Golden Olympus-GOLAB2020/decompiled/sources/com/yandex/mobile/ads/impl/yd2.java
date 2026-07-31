package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class yd2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final de2 f35083a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final lj1 f35084b;

    public yd2(@NotNull lj1 positionProviderHolder, @NotNull de2 videoDurationHolder) {
        Intrinsics.checkNotNullParameter(videoDurationHolder, "videoDurationHolder");
        Intrinsics.checkNotNullParameter(positionProviderHolder, "positionProviderHolder");
        this.f35083a = videoDurationHolder;
        this.f35084b = positionProviderHolder;
    }

    public final boolean a() {
        long a4 = this.f35083a.a();
        if (a4 == -9223372036854775807L) {
            return false;
        }
        gi1 b4 = this.f35084b.b();
        return (b4 != null ? b4.a() : -1L) + 1000 >= a4;
    }
}
