package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zd2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ee2 f35569a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final mj1 f35570b;

    public zd2(@NotNull mj1 positionProviderHolder, @NotNull ee2 videoDurationHolder) {
        Intrinsics.checkNotNullParameter(videoDurationHolder, "videoDurationHolder");
        Intrinsics.checkNotNullParameter(positionProviderHolder, "positionProviderHolder");
        this.f35569a = videoDurationHolder;
        this.f35570b = positionProviderHolder;
    }

    public final boolean a() {
        long a4 = this.f35569a.a();
        if (a4 == -9223372036854775807L) {
            return false;
        }
        hi1 b4 = this.f35570b.b();
        return (b4 != null ? b4.a() : -1L) + 1000 >= a4;
    }
}
