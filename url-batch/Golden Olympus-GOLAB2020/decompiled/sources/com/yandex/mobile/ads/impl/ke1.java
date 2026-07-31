package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ke1 {
    @NotNull
    public static v92 a(@Nullable dd2 dd2Var, @NotNull pc2 videoAdPosition) {
        Intrinsics.checkNotNullParameter(videoAdPosition, "videoAdPosition");
        Intrinsics.checkNotNullParameter(videoAdPosition, "videoAdPosition");
        int ordinal = videoAdPosition.ordinal();
        gj1 gj1Var = ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? gj1.f26178f : gj1.f26178f : gj1.f26177e : gj1.f26176d : gj1.f26175c;
        if (dd2Var != null) {
            v92 a4 = v92.a(dd2Var.a() / 1000, gj1Var);
            Intrinsics.checkNotNull(a4);
            return a4;
        }
        v92 a5 = v92.a(gj1Var);
        Intrinsics.checkNotNull(a5);
        return a5;
    }
}
