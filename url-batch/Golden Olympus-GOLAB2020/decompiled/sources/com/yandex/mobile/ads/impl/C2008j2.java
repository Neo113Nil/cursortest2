package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.j2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2008j2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ee2 f27436a;

    public C2008j2(@NotNull ee2 videoDurationHolder) {
        Intrinsics.checkNotNullParameter(videoDurationHolder, "videoDurationHolder");
        this.f27436a = videoDurationHolder;
    }

    public final long a(@NotNull ts adBreakPosition) {
        Intrinsics.checkNotNullParameter(adBreakPosition, "adBreakPosition");
        long b4 = adBreakPosition.b();
        int ordinal = adBreakPosition.a().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                return -1L;
            }
            return b4;
        }
        if (b4 == 100) {
            return Long.MIN_VALUE;
        }
        if (b4 == 0) {
            return 0L;
        }
        if (this.f27436a.a() == -9223372036854775807L) {
            return -1L;
        }
        return (long) ((b4 / 100) * this.f27436a.a());
    }
}
